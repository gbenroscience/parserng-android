package interfaces;


import org.json.JSONObject;

/**
 *
 * @author gbemirojiboye
 */
public interface Encodeable {

    public JSONObject get();

    public String stringify();

}
