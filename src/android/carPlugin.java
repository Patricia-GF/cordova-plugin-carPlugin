package android;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

/**
 * This class echoes a string called from JavaScript.
 */
public class carPlugin extends CordovaPlugin {


    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showMessage")) {
            String message = args.getString(0);
            this.showMessage(message, callbackContext);
            return true;
        }
        return false;
    }

    private void showMessage(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            Log.d("car-plugin", "You clicked on Hello World button! :D");
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
