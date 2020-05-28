package dsit.toastdemo;

import android.content.Context;
import android.widget.Toast;

public class MyToast {
    public static void ShowMyToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
