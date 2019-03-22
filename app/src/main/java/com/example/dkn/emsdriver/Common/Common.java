package com.example.dkn.emsdriver.Common;

import com.example.dkn.emsdriver.Remote.IGoogleAPI;
import com.example.dkn.emsdriver.Remote.RetrofitClient;

public class Common {
    public static final String baseURL="http://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

}
