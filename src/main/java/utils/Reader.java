package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import entities.MetalColorData;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;


public class Reader {
    private static Map<String, MetalColorData> dataMap = null;
    private static File file = new File("src" + File.separator + "main" + File.separator + "resources" +
            File.separator + "ex8_jdi_metalsColorsDataSet .json");


    public static Map<String, MetalColorData> readFile() {
        try (JsonReader jsonReader = new JsonReader(new FileReader(file))) {
            Type token = new TypeToken<Map<String, MetalColorData>>() {{}}.getType();
            dataMap = new Gson().fromJson(jsonReader, token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataMap;
    }
}
