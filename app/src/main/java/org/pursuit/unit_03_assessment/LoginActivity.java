package org.pursuit.unit_03_assessment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.pursuit.unit_03_assessment.R;

/**
 * Total points: 19/25
 *
 * Good job. You have a lot of extra code that's unneeded if you read the TODO's more carefully.
 * A lot of extra empty spaces between your code that makes it look messy.
 * You could also separate out some code into methods.
 */
public class LoginActivity extends AppCompatActivity {

    private EditText emailView;
    private EditText passwordView;
    private CheckBox usernameCheckbox;
    private SharedPreferences login;
    private static final String SHARED_PREFS_KEY = "sharedPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailView = (EditText) findViewById(R.id.email_edittext);
        passwordView = (EditText) findViewById(R.id.password_edittext);
        usernameCheckbox = (CheckBox) findViewById(R.id.remember_username_checkbox);

        passwordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == EditorInfo.IME_ACTION_DONE || id == EditorInfo.IME_NULL) {
                    attemptLogin();
                    return true;
                }
                return false;
            }
        });

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        // TODO 1: 5pts: You should be using a static final field for keys!
        if (sharedPreferences.getBoolean("isChecked", false)) {
            emailView.setText(sharedPreferences.getString("username", ""));
            passwordView.setText(sharedPreferences.getString("password", ""));
            usernameCheckbox.setChecked(sharedPreferences.getBoolean("isChecked", false));
        }


        /*
        * TODO: add logic to set values to views:
        * TODO: 1. if there is a username value AND checkbox value in shared preferences - set the username EditText's value to the username value from shared preferences, and set the checkbox's value to the checkbox value from shared preferences

         */

        Button mEmailSignInButton = (Button) findViewById(R.id.email_sign_in_button);
        mEmailSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin();
            }
        });
    }

    private void attemptLogin() {

        emailView.setError(null);
        passwordView.setError(null);

        String email = "user" + emailView.getText().toString();
        String password = "password" + passwordView.getText().toString();

        boolean cancel = false;
        View focusView = null;
        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);
        SharedPreferences.Editor editor = login.edit();

        if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
            passwordView.setError(getString(R.string.error_invalid_password));
            focusView = passwordView;
            cancel = true;
        }
        if (TextUtils.isEmpty(email)) {
            emailView.setError(getString(R.string.error_field_required));
            focusView = emailView;
            cancel = true;
        } else if (!isEmailValid(email)) {
            emailView.setError(getString(R.string.error_invalid_email));
            focusView = emailView;
            cancel = true;
        } else {

            // TODO 3: 5pts: good job, but you should be using static final fields for keys.
            if (usernameCheckbox.isChecked()) {
                editor.putString("username", emailView.getText().toString());
                editor.putString("password", passwordView.getText().toString());
                editor.putBoolean("isChecked", usernameCheckbox.isChecked());
                editor.apply();
            } else {
                // TODO 4: 1pt: You didn't reset the username and checkbox in sharedprefs.
                editor.putBoolean("isChecked", usernameCheckbox.isChecked());
                editor.apply();
            }

            String checkUser = "user" + emailView.getText().toString();
            String checkPassword = "password" + passwordView.getText().toString();

            // TODO 2: 3pts: You should be checking against a string resource, not sharedpreferences
            if (emailView.getText().toString().equalsIgnoreCase(login.getString(checkUser, ""))
                    && emailView.getText().toString().equals(login.getString(checkPassword, ""))) {

                // TODO 5: 5pts: You don't need to put extra.
                Intent intent = new Intent(LoginActivity.this, RecyclerActivity.class);
                intent.putExtra("currentUser",emailView.getText().toString());
                intent.putExtra("currentPassword",passwordView.getText().toString());
                startActivity(intent);
            }
            /*
             * TODO: Add logic to confirm that:
             * TODO: 2. the username matches the username stored in strings.xml and the password matches the password stored in strings.xml
             * TODO: 3. the checkbox is ticked - if both email and password in EditTexts match strings.xml, add username value and checkbox value to shared preferences
             * TODO: 4. the checkbox is NOT ticked - if it is not ticked, clear username in shared preferences
             * TODO: 5. if both email and password in EditTexts match strings.xml, move to RecyclerActivity
             */
        }

        if (cancel) {
            focusView.requestFocus();
        }
    }

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        return password.length() > 4;
    }
}

