package entities.interfaces;

import org.apache.commons.lang3.StringUtils;

public interface IResults {

    public String getLog(String name, String... values);

    // TODO this method will NOT Replace anything...
    default String replaceLine(String name, String... values) {
        StringBuffer sb = new StringBuffer();
        // TODO Take a look on StringUtils, streams or smth else...
        sb.append(name);
        for (String line : values) {
            sb.append(line + ", "); // TODO I-D-E-A warning...
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}
