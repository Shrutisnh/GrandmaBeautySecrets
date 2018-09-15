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
    private static Context context;
    private static JSONUtil jsonUtil;

    public JSONUtil getInstance(Context context) {
        this.context = context;
        if (jsonUtil == null) {
            jsonUtil = new JSONUtil();
            return jsonUtil;
        } else
            return jsonUtil;
    }

    private static String getResponseData(int bodyIndex) {
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

    private static String getFilename(int bodyIndex) {
        String filename = null;
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

    public Object getResponseObject(int bodyIndex) {
        Gson gson = new GsonBuilder().create();
        ResponseData responseData = gson.fromJson(getResponseData(bodyIndex), ResponseData.class);
        switch (bodyIndex) {
            case 0:
                return responseData.getEyes();
            case 1:
                return responseData.getFace();
            case 2:
                return responseData.getHair();
            case 3:
                return responseData.getArmsFeet();
            case 4:
                return responseData.getSkin();
        }
        return null;
    }

    public List<Remedy> getRemedyList(int bodyIndex, int issueIndex) {
        Object object = getResponseObject(bodyIndex);
        List<Remedy> remedies = null;
        List<Data> data;
        switch (bodyIndex) {
            case 0: {
                Eyes eyesObject = (Eyes) object;
                if (eyesObject != null && !eyesObject.getData().isEmpty()) {
                    data = eyesObject.getData();
                    remedies = data.get(issueIndex).getRemedies();
                }
                return remedies;
            }
            case 1: {
                Face faceObject = (Face) object;
                if (faceObject != null && !faceObject.getData().isEmpty()) {
                    data = faceObject.getData();
                    remedies = data.get(issueIndex).getRemedies();
                }
                return remedies;
            }
            case 2: {
                Hair hairObject = (Hair) object;
                if (hairObject != null && !hairObject.getData().isEmpty()) {
                    data = hairObject.getData();
                    remedies = data.get(issueIndex).getRemedies();
                }
                return remedies;
            }
            case 3: {
                ArmsFeet armsFeetObject = (ArmsFeet) object;
                if (armsFeetObject != null && !armsFeetObject.getData().isEmpty()) {
                    data = armsFeetObject.getData();
                    remedies = data.get(issueIndex).getRemedies();
                }
                return remedies;
            }
            case 4: {
                Skin skinObject = (Skin) object;
                if (skinObject != null && !skinObject.getData().isEmpty()) {
                    data = skinObject.getData();
                    remedies = data.get(issueIndex).getRemedies();
                }
                return remedies;
            }

        }
        return null;
    }

    public String getIssueTitle(int bodyIndex, int issueIndex) {
        Object object = getResponseObject(bodyIndex);
        switch (bodyIndex) {
            case 0:
                Eyes eyes = (Eyes) object;
                return eyes.getData().get(issueIndex).getIssue();
            case 1:
                Face face = (Face) object;
                return face.getData().get(issueIndex).getIssue();
            case 2:
                Hair hair = (Hair) object;
                return hair.getData().get(issueIndex).getIssue();
            case 3:
                ArmsFeet armsFeet = (ArmsFeet) object;
                return armsFeet.getData().get(issueIndex).getIssue();
            case 4:
                Skin skin = (Skin) object;
                return skin.getData().get(issueIndex).getIssue();

        }
        return null;

    }
}

