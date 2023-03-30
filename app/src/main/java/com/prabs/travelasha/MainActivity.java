package com.prabs.travelasha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    public RequestQueue queue;
    public TextView button;
    public Button janButton;
    public Button febButton;
    public Button marchButton;
    public Button aprilButton;
    public Button mayButton;
    public Button juneButton;
    public Button julyButton;
    public Button augustButton;
    public Button septButton;
    public Button octButton;
    public Button novButton;
    public Button decButton;
    public TextView updateText;
    private Button planButton;
    private Button contactButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        janButton = (Button) findViewById(R.id.janButton);
        febButton = (Button)findViewById(R.id.febButton);
        marchButton = (Button) findViewById(R.id.marchButton);
        aprilButton = (Button) findViewById(R.id.aprilButton);
        mayButton = (Button) findViewById(R.id.mayButton);
        juneButton = (Button) findViewById(R.id.juneButton);
        julyButton = (Button) findViewById(R.id.julyButton);
        augustButton = (Button) findViewById(R.id.augustButton);
        septButton = (Button) findViewById(R.id.septButton);
        octButton = (Button) findViewById(R.id.octButton);
        novButton = (Button) findViewById(R.id.novButton);
        decButton = (Button) findViewById(R.id.decButton);
        updateText = (TextView) findViewById(R.id.updateText);
        planButton = (Button)findViewById(R.id.planButton);
        contactButton = (Button)findViewById(R.id.contactButton);

        updateText.setSelected(true);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        buttonSetter();



        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d("mssg", "Value is: " + value);

                updateText.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("mssg", "Failed to read value.", error.toException());
            }
        });








/*
        queue = Volley.newRequestQueue(this);


        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, "https://demo7758428.mockable.io/test",null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                   // JSONObject jsonObject = response.getJSONObject("msg");
                    button.setText(response.getString("msg"));


                    //JSONArray moviesArray = response.getJSONArray("Search");


                 //   for(int i = 0; i < moviesArray.length(); i++){

                   //     JSONObject movieObj = moviesArray.getJSONObject(i);




                    //}



                }catch (JSONException e){

                    e.printStackTrace();
                }




            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(jsonObjectRequest);
    }
}

 */

    }

    @Override
    protected void onResume() {
        super.onResume();

      //  GetUpdates();
    }

    void GetUpdates(){



        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        queue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, "http://demo7758428.mockable.io/test",null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    // JSONObject jsonObject = response.getJSONObject("msg");
                    updateText.setText(response.getString("msg"));


                    //JSONArray moviesArray = response.getJSONArray("Search");


                    //   for(int i = 0; i < moviesArray.length(); i++){

                    //     JSONObject movieObj = moviesArray.getJSONObject(i);




                    //}



                }catch (JSONException e){

                    e.printStackTrace();
                }




            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(jsonObjectRequest);

    }

    void buttonSetter() {


        planButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,EnquiryActivity.class);
                startActivity(intent);

            }
        });



        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ContactActivity.class);
                startActivity(intent);
            }
        });



        janButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "January");
                startActivity(intent);

            }
        });

        febButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "February");
                startActivity(intent);

            }
        });

        marchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "March");
                startActivity(intent);

            }
        });

        aprilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "April");
                startActivity(intent);

            }
        });

        mayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "May");
                startActivity(intent);

            }
        });

        juneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "June");
                startActivity(intent);

            }
        });

        julyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "July");
                startActivity(intent);

            }
        });

        augustButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "August");
                startActivity(intent);

            }
        });

        septButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "September");
                startActivity(intent);

            }
        });

        octButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "October");
                startActivity(intent);

            }
        });

        novButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "November");
                startActivity(intent);

            }
        });

        decButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MonthActivity.class);
                intent.putExtra("Month", "December");
                startActivity(intent);

            }
        });



    }


}