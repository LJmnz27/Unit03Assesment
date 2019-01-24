# Unit 03 Assessment

This assessment should be completed within 3 (three) hours after it has commenced. Please download the following project to your computer: [Download Project](https://www.google.com)

This project has 20 (twenty) tasks which must be completed in their entirety to receive full-credit. These tasks are denoted throughout the project as `TODO` comments. Please replace each `TODO` comment with the requested code. Please select the "TODO" tab at the bottom of Android Studio to list them all.

### In `LoginActivity.java` and `activity_login.xml`:
Add logic to confirm that:
* TODO: 1. if there is a username value AND checkbox value in shared preferences - set the username EditText's value to the username value from shared preferences, and set the checkbox's value to the checkbox value from shared preferences
* TODO: 2. the username matches the username stored in strings.xml and the password matches the password stored in strings.xml
* TODO: 3. the checkbox is ticked - if both email and password in EditTexts match strings.xml, add username value and checkbox value to shared preferences
* TODO: 4. the checkbox is NOT ticked - if it is not ticked, clear username in shared preferences
* TODO: 5. if both email and password in EditTexts match strings.xml, move to RecyclerActivity

### In `RecyclerActivity.java` and `activity_recycler.xml`:
Add logic that will:
* TODO 1. Make Retrofit instance for this endpoint: https://raw.githubusercontent.com/JDVila/storybook/master/planets.json
* TODO 2. Make data model objects based on JSON
* TODO 3. Make a service interface with method(s) to make a GET request
* TODO 4. Make a request to the JSON endpoint using the Retrofit instance and the service
* TODO 5. Subclass a RecyclerView Adapter
* TODO 6. Subclass a RecyclerView ViewHolder
* TODO 7. Pass list to RecyclerView
* TODO 8. Display planet name in a RecyclerView tile
* TODO 9. Implement an OnClickListener for the itemview
* TODO 10. Pass the Planet Name, Number, and Image URL data to DisplayActivity when tile is clicked

### In `DisplayActivity.java` and `activity_display.xml`:
Add logic that will:
* TODO 1. Receive values from sending intent
* TODO 2. Create a TextView instance for the Planet Name
* TODO 3. Create a TextView instance for the Planet Number count
* TODO 4. Create an ImageView for the image url
* TODO 5. Display each value in views - Strings for TextViews, and Picasso for the ImageView

## Key Requirements

* All spelling of method names, and values of XML property types must be either written or declared AS DESCRIBED IN EACH TASK DESCRIPTION.
* All literal values (Strings, Colors, and numerical Dimensions) known at compile time MUST be defined in resource files, and referenced appropriately in views

## Submission

Please initialize a git repository within the root project folder, add and commit your changes, push to a remote repository, then paste the link to this remote Github repository into Canvas by no later than 10:00pm EST. Good luck!
# Unit03Assesment
