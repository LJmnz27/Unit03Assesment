package org.pursuit.unit_03_assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Total points: 39/50
 *
 * If you ran your code, you would've realized that you put your network call in the wrong place.
 * You never even reference your recyclerview in your activity, so how can you show any information?
 * Otherwise, everything else was set up correctly! You just need to think about where to put your code.
 */
public class RecyclerActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);



        /*
        * TODO: Add logic that will:
        * TODO 1. Make Retrofit instance for this endpoint: https://raw.githubusercontent.com/JDVila/storybook/master/planets.json
        * TODO 2. Make data model objects based on JSON
        * TODO 3. Make a service interface with method(s) to make a GET request
        * TODO 4. Make a request to the JSON endpoint using the Retrofit instance and the service
        * TODO 5. Subclass a RecyclerView Adapter
        * TODO 6. Subclass a RecyclerView ViewHolder
        * TODO 7. Pass list to RecyclerView
        * TODO 8. Display planet name in a RecyclerView tile
        * TODO 9. Implement an OnClickListener for the itemview
        * TODO 10. Pass the Planets Name, Number, and Image URL data to DisplayActivity when tile is clicked
        */

    }
}
