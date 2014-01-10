// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.aries.duxin.wangyj;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.*;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.util.EncodingUtils;

public abstract class BaseActivity extends Activity
{

    public BaseActivity()
    {
    }

    protected void Alert(String s)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage(s).setCancelable(false).setTitle("\u63D0\u793A").setPositiveButton("\u786E\u5B9A", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

//            final BaseActivity this$0;
//
//            
//            {
//                this$0 = BaseActivity.this;
//                super();
//            }
        }
);
        builder.create().show();
    }

    protected boolean CheckNetState()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)getSystemService("connectivity")).getActiveNetworkInfo();
        boolean flag;
        if(networkinfo != null && networkinfo.isAvailable())
            flag = true;
        else
            flag = false;
        return flag;
    }

    protected boolean IsWifi()
    {
        boolean flag = false;
//        boolean flag1;
//        NetworkInfo networkinfo = ((ConnectivityManager)getSystemService("connectivity")).getActiveNetworkInfo();
//        if(networkinfo.getTypeName().equals("WIFI"))
//        {
//            flag = true;
//            break MISSING_BLOCK_LABEL_52;
//        }
//        flag1 = networkinfo.getTypeName().equals("EDGE");
//        if(!flag1);
//        break MISSING_BLOCK_LABEL_52;
//        Exception exception;
//        exception;
        return flag;
    }

    protected void ScreenType()
    {
        SetScreenType(PreferenceManager.getDefaultSharedPreferences(this).getString("screentype", "auto"));
    }

    protected void SetScreenType(String s)
    {
//        if(!s.equals("land")) goto _L2; else goto _L1
//_L1:
//        setRequestedOrientation(0);
//_L4:
//        return;
//_L2:
//        if(s.equals("port"))
//            setRequestedOrientation(1);
//        if(true) goto _L4; else goto _L3
//_L3:
    }

    protected void Toast(String s)
    {
        View view = getLayoutInflater().inflate(0x7f030003, (ViewGroup)findViewById(0x7f0b0011));
        view.getBackground().setAlpha(200);
        view.invalidate();
        ((TextView)view.findViewById(0x7f0b0012)).setText(s);
        Toast toast = new Toast(getApplicationContext());
        toast.cancel();
        toast.setGravity(16, 0, 0);
        toast.setDuration(0);
        toast.setView(view);
        toast.show();
    }

    protected String getFromAssets(String s)
    {
        String s1 = "";
        String s2;

		try {
			InputStream inputstream = getResources().getAssets().open(s);

        byte abyte0[] = new byte[inputstream.available()];
        inputstream.read(abyte0);
        s2 = EncodingUtils.getString(abyte0, "UTF-8");
        s1 = s2;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//_L2:
        return s1;
//        Exception exception;
//        exception;
//        exception.printStackTrace();
//        if(true) goto _L2; else goto _L1
//_L1:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
//        super.onConfigurationChanged(configuration);
//        if(getResources().getConfiguration().orientation != 2)
//        {
//            getResources().getConfiguration().orientation;
//        }
//_L2:
//        return;
//        Exception exception;
//        exception;
//        if(true) goto _L2; else goto _L1
//_L1:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
    }

    protected String trimZreo(String s)
    {
        return s;
    }

    public static final String ABOUTSTR = "\u53A8\u623F\u638C\u4E2D\u5B9D";
    public static final String ENCODING = "UTF-8";
}
