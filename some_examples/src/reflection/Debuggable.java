package reflection;

import java.lang.reflect.Field;

/**
 * Created by Budyn on 19.04.2018.
 */
public interface Debuggable {
    default String debug() {
        StringBuilder sb = new StringBuilder(this.getClass().getName());
        sb.append("[");
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                sb.append(field.getName()).append(" = ").append(field.get(this)).append(", ");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        sb.append("\b\b]");
        return sb.toString();
    }
}
