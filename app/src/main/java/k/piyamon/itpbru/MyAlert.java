package k.piyamon.itpbru;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by lap324-06 on 6/6/2016 AD.
 */
public class MyAlert {

    public void myDialog(Context context,String strTite,String strMessage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.nobita48);//ใส่รูป
        builder.setTitle(strTite);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();//กดโอเคป๊อปอัพจะหายไป

            }
        });
        builder.show();

    }// myDialog
}
