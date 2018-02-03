package entities.interfaces;

public interface IResults {

    public String getLog(String name, String... values);

    default String replaceLine(String name, String... values) {
        StringBuffer sb = new StringBuffer();
        sb.append(name);
        for (String line : values) {
            sb.append(line + ", ");
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}
