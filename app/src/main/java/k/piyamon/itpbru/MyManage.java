package k.piyamon.itpbru;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by lap324-06 on 6/8/2016 AD.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public MyManage(Context context){

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();

    } //Constructor

} //Main Class
