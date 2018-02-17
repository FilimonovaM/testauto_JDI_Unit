package utils;

import java.io.*;

public class JsonFileReader {

    private File file = new File("src" + File.separator + "main" + File.separator + "resources" + File.separator +
            "ex8_jdi_metalsColorsDataSet .json");
    private StringBuffer stringBuffer = new StringBuffer();

    public Object[][] readFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                stringBuffer.append(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parseJson(stringBuffer.toString().replaceAll("\\W", "").substring(0)
                .replace("\n", "").split("data_\\d"));
    }

    public Object[][] parseJson(String[] lines) {
        Object[][] data = new Object[lines.length - 1][5];
        String[] s;
        for (int i = 0; i < data.length; i++) {
            s = lines[i + 1].split("summary|elements|color|metals|vegetables");
            for (int y = 0; y < 5; y++) {
                if (s.length != 0) {
                    data[i][y] = s[y + 1];
                } else {
                    data[i][y] = "";
                }
            }
        }
        return data;
    }
}
