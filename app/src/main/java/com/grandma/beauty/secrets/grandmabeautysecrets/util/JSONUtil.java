package com.grandma.beauty.secrets.grandmabeautysecrets.util;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.ArmsFeet;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Data;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Eyes;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Face;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Hair;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Remedy;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.ResponseData;
import com.grandma.beauty.secrets.grandmabeautysecrets.model.Skin;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JSONUtil {
    public static Context context;
    static JSONUtil jsonUtil;

    public static JSONUtil getInstance(Context context) {
        JSONUtil.context = context;
        if (jsonUtil == null) {
            jsonUtil = new JSONUtil();
            return jsonUtil;
        } else
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

    public static Object getResponseObject(int bodyIndex) {
        Gson gson = new GsonBuilder().create();
        ResponseData responseData = gson.fromJson(getResponseData(bodyIndex), ResponseData.class);
        switch (bodyIndex) {
            case 0:
                Eyes eyesObject = responseData.getEyes();
                return eyesObject;
            case 1:
                Face faceObject = responseData.getFace();
                return faceObject;
            case 2:
                Hair hairObject = responseData.getHair();
                return hairObject;
            case 3:
                ArmsFeet armsFeetObject = responseData.getArmsFeet();
                return armsFeetObject;
            case 4:
                Skin skinObject = responseData.getSkin();
                return skinObject;
        }
        return null;
    }

    public  List<Remedy> getRemedyList(int bodyIndex, int issueIndex) {
        Object object = getResponseObject(bodyIndex);
        List<Remedy> remedies = null;
        List<Data> data;
        switch (bodyIndex) {
            case 0: {
                Eyes eyesObject = (Eyes) object;
                if(!eyesObject.getData().isEmpty()) {
                    data = eyesObject.getData();
                    remedies = data.get(issueIndex).getRemedies();
                }
                return remedies;
            }
            case 1:{
                Face faceObject = (Face)object;
                if(!faceObject.getData().isEmpty()) {
                    data = faceObject.getData();
                    remedies = data.get(issueIndex).getRemedies();
                }
                return remedies;
            }
            case 2:{
                Hair hairObject = (Hair)object;
                if(!hairObject.getData().isEmpty()) {
                    data = hairObject.getData();
                    remedies = data.get(issueIndex).getRemedies();
                }
                return remedies;
            }
            case 4:{
                Face faceObject = (Face)object;
                if(!faceObject.getData().isEmpty()) {
                    data = faceObject.getData();
                    remedies = data.get(issueIndex).getRemedies();
                }
                return remedies;
            }
            case 3:{
                ArmsFeet armsFeetObject = (ArmsFeet)object;
                if(!armsFeetObject.getData().isEmpty()) {
                    data = armsFeetObject.getData();
                    remedies = data.get(issueIndex).getRemedies();
                }
                return remedies;
            }
        }
        return null;
    }
}

