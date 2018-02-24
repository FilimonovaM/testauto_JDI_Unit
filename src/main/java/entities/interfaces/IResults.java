package entities.interfaces;

public interface IResults {

    String getLog(String name, String... values);

    default String newRasultLine(String name, String... values) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        for (int i = 0; i < values.length; i++) {
            sb.append(values[i]);
            if (values.length > 1 && i < (values.length - 1)) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
