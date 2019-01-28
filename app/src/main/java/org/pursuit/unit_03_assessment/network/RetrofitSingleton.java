package org.pursuit.unit_03_assessment.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// TODO 1: 5pts: GJ
public class RetrofitSingleton {

    private static Retrofit ourInstance;

    public static Retrofit getInstance() {
        if (ourInstance != null) {
            return ourInstance;
        }
        ourInstance = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return ourInstance;
    }

    private RetrofitSingleton() {
    }

}