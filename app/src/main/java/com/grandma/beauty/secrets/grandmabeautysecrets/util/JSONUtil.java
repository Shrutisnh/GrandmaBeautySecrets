package com.grandma.beauty.secrets.grandmabeautysecrets.util;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.ArmsFeet;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Eyes;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Face;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Hair;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Skin;

import java.io.IOException;
import java.io.InputStream;

public  class JSONUtil {
     public static Context context;
      static JSONUtil jsonUtil;

    public static JSONUtil getInstance(Context cntx){
        context =cntx;
        if(jsonUtil==null) {
            jsonUtil = new JSONUtil();
            return jsonUtil;
        }
        else
            return jsonUtil;
    }

    public static String getResponseData(int bodyIndex) {
        String json = null;
        try {
            InputStream inputStream = context.getAssets().open(getFilename(bodyIndex));
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static String getFilename(int bodyIndex) {
        String filename = new String();
        switch (bodyIndex) {
            case 0:
                filename = "Eyes.json";
                break;
            case 1:
                filename = "Face.json";
                break;
            case 2:
                filename = "Hair.json";
                break;
            case 3:
                filename = "ArmsFeet.json";
                break;
            case 4:
                filename = "Skin.json";
                break;
        }
        return filename;

    }

    public static Object parseJsonResponse(int bodyIndex){
        Gson gson = new GsonBuilder().create();
        switch (bodyIndex){
            case 0:
                Eyes eyesObject = gson.fromJson(getResponseData(bodyIndex),Eyes.class);
                return eyesObject;

            case 1:
                Face faceObject = gson.fromJson(getResponseData(bodyIndex),Face.class);
                return faceObject;

            case 2:
                Hair hairObject = gson.fromJson(getResponseData(bodyIndex),Hair.class);
                return hairObject;

            case 3:
                ArmsFeet armsFeetObject = gson.fromJson(getResponseData(bodyIndex),ArmsFeet.class);
                return armsFeetObject;

            case 4:
                Skin skinObject = gson.fromJson(getResponseData(bodyIndex),Skin.class);
                return skinObject;
        }
        return null;
    }
}

