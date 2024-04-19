package database;

import java.util.List;
import org.json.JSONObject;

/**
 *
 * @author Gabriel Moraes
 */
public class Util {

    public static void compareAdd(List<JSONObject> list, JSONObject row, Where wh, Condition condition) {
        if (wh.getValue().getClass() == Integer.class) {
            if (condition.compare(row.getInt(wh.getField()), wh.getValue())) {
                if (!list.contains(row)) {
                    list.add(row);
                }
            }
        } else if (wh.getValue().getClass() == Double.class) {
            if (condition.compare(row.getDouble(wh.getField()), wh.getValue())) {
                if (!list.contains(row)) {
                    list.add(row);
                }
            }
        } else {
            if (condition.compare(row.get(wh.getField()), wh.getValue())) {
                if (!list.contains(row)) {
                    list.add(row);
                }
            }
        }
    }

    public static void compareRemove(List<JSONObject> list, JSONObject row, Where wh, Condition condition) {

        if (wh.getValue().getClass() == Integer.class) {
            if (!condition.compare(row.getInt(wh.getField()), wh.getValue())) {
                if (!list.contains(row)) {
                    list.add(row);
                }
            }
        } else if (wh.getValue().getClass() == Double.class) {
            if (!condition.compare(row.getDouble(wh.getField()), wh.getValue())) {
                if (!list.contains(row)) {
                    list.add(row);
                }
            }
        } else {
            if (!condition.compare(row.get(wh.getField()), wh.getValue())) {
                if (!list.contains(row)) {
                    list.add(row);
                }
            }
        }
    }

}