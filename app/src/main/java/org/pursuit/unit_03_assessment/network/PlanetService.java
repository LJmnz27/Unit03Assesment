package org.pursuit.unit_03_assessment.network;

import org.pursuit.unit_03_assessment.model.PlanetImage;
import org.pursuit.unit_03_assessment.model.Planets;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PlanetService {

    @GET("JDVila/storybook/master/planets")
    Call<Planets> getPlanetList();

    @GET("JDVila/storybook/master/{image}")
    Call<PlanetImage> getPlanetImage(@Path("image") String image);

}

