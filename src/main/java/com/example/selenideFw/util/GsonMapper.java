package com.example.selenideFw.util;

import com.example.selenideFw.entity.MarsEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.IOException;

public class GsonMapper {
    public static MarsEntity readJSONFileForAllCollections(String fileName) throws IOException {
        Gson gson =new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
        String jsonString = FileUtils.readFileToString(new ResourceUtil().getFile(fileName), "UTF-8");
        return gson.fromJson(jsonString, MarsEntity.class);
    }
}
