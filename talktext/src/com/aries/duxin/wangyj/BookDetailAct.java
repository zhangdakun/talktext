// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.aries.duxin.wangyj;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.Log;
import android.view.*;
import android.widget.*;

import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.aries.duxin.wangyj:
//            BaseActivity, BookSettings

public class BookDetailAct extends BaseActivity
{
    class DetailDoubleTouch
        implements android.view.View.OnTouchListener
    {

        public boolean onTouch(View view, MotionEvent motionevent)
        {
//            if(motionevent.getAction() != 0) goto _L2; else goto _L1
//_L1:
//            count = 1 + count;
//            if(count != 1) goto _L4; else goto _L3
//_L3:
//            firClick = System.currentTimeMillis();
//_L2:
//            return false;
//_L4:
//            if(count == 2)
//            {
//                secClick = System.currentTimeMillis();
//                if(secClick - firClick < 1000L)
//                    if(full_tag == 0)
//                    {
//                        detail_top_bar.setVisibility(4);
//                        fontcontrol_area.setVisibility(4);
//                        full_tag = 1;
//                    } else
//                    {
//                        detail_top_bar.setVisibility(0);
//                        full_tag = 0;
//                    }
//                count = 0;
//                firClick = 0L;
//                secClick = 0L;
//            }
//            if(true) goto _L2; else goto _L5
//_L5:
        	return true;
        }

        private int count;
        private long firClick;
        private long secClick;
//        final BookDetailAct this$0;
//
//        DetailDoubleTouch()
//        {
//            this$0 = BookDetailAct.this;
//            super();
//        }
    }

    private class LoadDetailTask extends AsyncTask
    {

        protected Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected String doInBackground(String as[])
        {
            System.out.println(item_id.toString());
            content = getFromAssets((new StringBuilder(String.valueOf(trimZreo(item_id.toString())))).append(".txt").toString()).replaceAll("\r\n", "\n");
            return content;
        }

        protected void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            if(s.equals(""))
            {
                if(Integer.parseInt(item_id) <= 1)
                {
                    Toast("\u5DF2\u7ECF\u662F\u7B2C\u4E00\u9875\u4E86");
                    item_id = (new StringBuilder(String.valueOf(1 + Integer.parseInt(item_id)))).toString();
                    pre.setEnabled(false);
                    pre.setImageResource(0x7f02002a);
                    loading.setVisibility(4);
                } else
                if(Integer.parseInt(item_id) >= Integer.parseInt(total))
                {
                    Toast("\u5DF2\u7ECF\u662F\u6700\u540E\u4E00\u9875\u4E86");
                    item_id = (new StringBuilder(String.valueOf(-1 + Integer.parseInt(item_id)))).toString();
                    next_btn.setEnabled(false);
                    next_btn.setVisibility(4);
                    next.setEnabled(false);
                    next.setImageResource(0x7f020026);
                    loading.setVisibility(4);
                } else
                {
                    Toast("\u5BF9\u4E0D\u8D77\uFF01\u6587\u4EF6\u6CA1\u6709\u627E\u5230\u3002");
                    pre.setEnabled(false);
                    pre.setImageResource(0x7f02002a);
                    next_btn.setEnabled(false);
                    next_btn.setVisibility(4);
                    next.setEnabled(false);
                    next.setImageResource(0x7f020026);
                    loading.setVisibility(4);
                }
            } else
            {
                android.text.Html.ImageGetter imagegetter = new android.text.Html.ImageGetter() {

					@Override
					public Drawable getDrawable(String arg0) {
						// TODO Auto-generated method stub
						Drawable drawable = null;
						Log.d("bookDetail", "getDrawable : "+arg0);
						try {
							drawable = Drawable.createFromStream((new URL(arg0)).openStream(), "");
							drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						return drawable;
					}
//
//                    public Drawable getDrawable(String s1)
//                    {
//                        Drawable drawable1 = Drawable.createFromStream((new URL(s1)).openStream(), "");
//                        Drawable drawable;
//                        drawable1.setBounds(0, 0, drawable1.getIntrinsicWidth(), drawable1.getIntrinsicHeight());
//                        drawable = drawable1;
//_L2:
//                        return drawable;
//                        Exception exception;
//                        exception;
//                        drawable = null;
//                        if(true) goto _L2; else goto _L1
//_L1:
//                    }
//
////                    final LoadDetailTask this$1;
////
////                
////                {
////                    this$1 = LoadDetailTask.this;
////                    super();
////                }
                }
;
                detail.setText(Html.fromHtml(s, imagegetter, null));
                next_btn.setVisibility(0);
                loading.setVisibility(4);
                pre.setEnabled(true);
                pre.setImageResource(0x7f020009);
                next_btn.setEnabled(true);
                next.setEnabled(true);
                next_btn.setVisibility(0);
                next.setImageResource(0x7f020008);
                scrool.post(new Runnable() {

                    public void run()
                    {
                        scrool.scrollTo(0, scrool_y);
                        if(scrool_y > 0)
                            Toast("\u5DF2\u7ECF\u6062\u590D\u5230\u4E0A\u6B21\u9605\u8BFB\u7684\u4F4D\u7F6E");
                        else
                            Toast((new StringBuilder(String.valueOf(1 + Integer.parseInt(item_id)))).append("/").append(total).toString());
                    }

//                    final LoadDetailTask this$1;
//
//                
//                {
//                    this$1 = LoadDetailTask.this;
//                    super();
//                }
                }
);
            }
        }

        protected void onProgressUpdate(Integer ainteger[])
        {
            System.out.println(ainteger[0]);
        }

        protected void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Integer[])aobj);
        }

//        final BookDetailAct this$0;
//
//
//        private LoadDetailTask()
//        {
//            this$0 = BookDetailAct.this;
//            super();
//        }

//        LoadDetailTask(LoadDetailTask loaddetailtask)
//        {
//            this();
//        }
    }

    class PageClickEvent
        implements android.view.View.OnClickListener
    {

        public void onClick(View view)
        {
            SaveBookmark();
            scrool_y = 0;
            if("pre".equals(type))
                item_id = (new StringBuilder(String.valueOf(-1 + Integer.parseInt(item_id)))).toString();
            else
                item_id = (new StringBuilder(String.valueOf(1 + Integer.parseInt(item_id)))).toString();
            loading.setVisibility(0);
            (new LoadDetailTask()).execute(new String[0]);
        }

//        final BookDetailAct this$0;
        private String type;

        public PageClickEvent(String s)
        {
//            this$0 = BookDetailAct.this;
//            super();
            type = s;
        }
    }


    public BookDetailAct()
    {
        font_tag = 0;
        full_tag = 1;
    }

    private void DetailTextSize()
    {
        String s = pref.getString("text_size", "17");
        detail_text_size = Integer.parseInt(s);
        detail.setTextSize(Integer.parseInt(s));
    }

    private void SaveBookmark()
    {
        android.content.SharedPreferences.Editor editor = pref.edit();
        long l = System.currentTimeMillis();
        scrool_y = scrool.getScrollY();
        editor.putString("scrool_y", (new StringBuilder(String.valueOf(scrool_y))).toString());
        editor.putString("item_id", item_id);
        editor.putString((new StringBuilder(String.valueOf(item_id))).append("_lasttime").toString(), (new StringBuilder(String.valueOf(l))).toString());
        editor.commit();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030000);
        intent = getIntent();
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        item_id = intent.getStringExtra("item_id").toString();
        total = intent.getStringExtra("total").toString();
        try
        {
            scrool_y = Integer.parseInt(intent.getStringExtra("scrool_y"));
        }
        catch(Exception exception)
        {
            scrool_y = 0;
        }
        loading = (LinearLayout)findViewById(0x7f0b000a);
        loading.getBackground().setAlpha(200);
        loading.invalidate();
        pre = (ImageView)findViewById(0x7f0b0008);
        back = (ImageView)findViewById(0x7f0b0007);
        next = (ImageView)findViewById(0x7f0b0009);
        fontcontrol = (ImageView)findViewById(0x7f0b0006);
        fontsmaller = (ImageView)findViewById(0x7f0b000d);
        fontlarger = (ImageView)findViewById(0x7f0b000e);
        next_btn = (Button)findViewById(0x7f0b0003);
        detail = (TextView)findViewById(0x7f0b0002);
        scrool = (ScrollView)findViewById(0x7f0b0001);
        fontcontrol_area = (LinearLayout)findViewById(0x7f0b000c);
        detail_top_bar = (LinearLayout)findViewById(0x7f0b0005);
        detail_relativelayout = (RelativeLayout)findViewById(0x7f0b0000);
        detail_top_bar.getBackground().setAlpha(220);
        detail_top_bar.invalidate();
        fontcontrol_area.getBackground().setAlpha(220);
        fontcontrol_area.invalidate();
        ScreenType();
        DetailTextSize();
        (new LoadDetailTask()).execute(new String[0]);
        detail.setOnTouchListener(new DetailDoubleTouch());
        next_btn.setOnClickListener(new PageClickEvent("next"));
        next.setOnClickListener(new PageClickEvent("next"));
        pre.setOnClickListener(new PageClickEvent("pre"));
        back.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                SaveBookmark();
                finish();
            }

//            final BookDetailAct this$0;
//
//            
//            {
//                this$0 = BookDetailAct.this;
//                super();
//            }
        }
);
        fontcontrol.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                if(font_tag == 0)
                {
                    fontcontrol_area.setVisibility(0);
                    fontcontrol.setImageResource(0x7f020011);
                    font_tag = 1;
                } else
                {
                    fontcontrol_area.setVisibility(4);
                    fontcontrol.setImageResource(0x7f020003);
                    font_tag = 0;
                }
            }

//            final BookDetailAct this$0;
//
//            
//            {
//                this$0 = BookDetailAct.this;
//                super();
//            }
        }
);
        fontsmaller.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                BookDetailAct bookdetailact = BookDetailAct.this;
                bookdetailact.detail_text_size = bookdetailact.detail_text_size - 1.0F;
                detail.setTextSize(detail_text_size);
                if(detail_text_size < 10F)
                {
                    fontsmaller.setEnabled(false);
                    fontsmaller.setImageResource(0x7f020016);
                }
                fontlarger.setEnabled(true);
                fontlarger.setImageResource(0x7f020004);
            }

//            final BookDetailAct this$0;
//
//            
//            {
//                this$0 = BookDetailAct.this;
//                super();
//            }
        }
);
        fontlarger.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                BookDetailAct bookdetailact = BookDetailAct.this;
                bookdetailact.detail_text_size = 1.0F + bookdetailact.detail_text_size;
                detail.setTextSize(detail_text_size);
                if(detail_text_size > 40F)
                {
                    fontlarger.setEnabled(false);
                    fontlarger.setImageResource(0x7f020013);
                }
                fontsmaller.setEnabled(true);
                fontsmaller.setImageResource(0x7f020005);
            }

//            final BookDetailAct this$0;
//
//            
//            {
//                this$0 = BookDetailAct.this;
//                super();
//            }
        }
);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f0a0000, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        SaveBookmark();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
//        menuitem.getItemId();
//        JVM INSTR tableswitch 2131427352 2131427358: default 48
//    //                   2131427352 54
//    //                   2131427353 84
//    //                   2131427354 114
//    //                   2131427355 144
//    //                   2131427356 174
//    //                   2131427357 220
//    //                   2131427358 184;
//           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
//_L1:
//        return super.onOptionsItemSelected(menuitem);
//_L2:
//        detail_relativelayout.setBackgroundResource(0x7f020000);
//        detail.setTextColor(getResources().getColor(0x7f070000));
//        continue; /* Loop/switch isn't completed */
//_L3:
//        detail_relativelayout.setBackgroundResource(0x7f070004);
//        detail.setTextColor(getResources().getColor(0x7f070005));
//        continue; /* Loop/switch isn't completed */
//_L4:
//        detail_relativelayout.setBackgroundResource(0x7f070006);
//        detail.setTextColor(getResources().getColor(0x7f070007));
//        continue; /* Loop/switch isn't completed */
//_L5:
//        detail_relativelayout.setBackgroundResource(0x7f020001);
//        detail.setTextColor(getResources().getColor(0x7f070000));
//        continue; /* Loop/switch isn't completed */
//_L6:
//        Alert("\u53A8\u623F\u638C\u4E2D\u5B9D");
//        continue; /* Loop/switch isn't completed */
//_L8:
//        Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse("http://apk.heqee.com/"));
//        intent1.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
//        startActivity(intent1);
//        continue; /* Loop/switch isn't completed */
//_L7:
//        startActivity(new Intent(this, com/aries/duxin/wangyj/BookSettings));
//        if(true) goto _L1; else goto _L9
//_L9:
    	
    	return super.onOptionsItemSelected(menuitem);
    }

    protected void onRestart()
    {
        super.onRestart();
        DetailTextSize();
        ScreenType();
    }

    private ImageView back;
    private String content;
    private TextView detail;
    private RelativeLayout detail_relativelayout;
    private float detail_text_size;
    private LinearLayout detail_top_bar;
    private int font_tag;
    private ImageView fontcontrol;
    private LinearLayout fontcontrol_area;
    private ImageView fontlarger;
    private ImageView fontsmaller;
    private int full_tag;
    private Intent intent;
    private String item_id;
    private LinearLayout loading;
    private ImageView next;
    private Button next_btn;
    private ImageView pre;
    private SharedPreferences pref;
    private ScrollView scrool;
    private int scrool_y;
    private String total;

























}
