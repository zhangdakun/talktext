// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.aries.duxin.wangyj;

import android.app.AlertDialog;
import android.content.*;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.*;
import android.widget.*;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package com.aries.duxin.wangyj:
//            BaseActivity, BookDetailAct, BookSettings, DateUtil

public class BookAct extends BaseActivity
{
    private class LoadListTask extends AsyncTask
    {

        protected Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected String doInBackground(String as[])
        {
            list = getData();
            return null;
        }

        protected List getData()
        {
            ArrayList arraylist;
            HashMap hashmap;
            arraylist = new ArrayList();
            hashmap = new HashMap();
            String as[];
            int i;
            String s = getFromAssets("list.txt");
            list_book = s.split("\n");
            as = list_book;
            i = as.length;
            int j;
            int k;
            HashMap hashmap1;
            j = 0;
            k = 0;
            hashmap1 = hashmap;
            
            // my start 
            while(j < i)  {
              String s1;
              HashMap hashmap2;
              s1 = as[j];
              hashmap2 = new HashMap();
              int l;
              int i1;
              l = k + 1;
              i1 = k;
              String s2;
              int j1;
              s2 = pref.getString((new StringBuilder(String.valueOf(i1))).append("_lasttime").toString(), "none");
//              j1 = 0x7f02002f;
              j1 = R.drawable.unread_icon;
//              if(!s2.equals("none")) goto _L5; else goto _L4     
              String s5 = "\u672A\u8BFB";
              if(!s2.equals("none")) {
                String s4;
                j1 = 0x7f02002c;
                String s3 = s2;//DateUtil.getDateTextForHuman(Long.parseLong(s2));
                java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                s3 = format1.format(new Date(Long.parseLong(s2)));
                
                s4 = (new StringBuilder("\u6700\u540E\u9605\u8BFB\uFF1A")).append(s3).toString();
                s5 = s4;           	  
              }
	            hashmap2.put("item_id", (new StringBuilder()).append(i1).toString());
	            hashmap2.put("last_time", s5);
	            hashmap2.put("title", s1);
	            hashmap2.put("item_read_icon", Integer.valueOf(j1));
	            arraylist.add(hashmap2);
	            j++;
	            k = l;
	            hashmap1 = hashmap2;
            }
            total = (new StringBuilder()).append(k).toString();
            
            // my end
//_L6:
//            if(j < i) goto _L2; else goto _L1
//_L1:
//            total = (new StringBuilder()).append(k).toString();
//            hashmap1;
//              goto _L3
//_L2:
//            String s1;
//            HashMap hashmap2;
//            s1 = as[j];
//            hashmap2 = new HashMap();
//            int l;
//            int i1;
//            l = k + 1;
//            i1 = k;
//            String s2;
//            int j1;
//            s2 = pref.getString((new StringBuilder(String.valueOf(i1))).append("_lasttime").toString(), "none");
//            j1 = 0x7f02002f;
//            if(!s2.equals("none")) goto _L5; else goto _L4
//_L4:
//            String s5 = "\u672A\u8BFB";
//_L7:
//            hashmap2.put("item_id", (new StringBuilder()).append(i1).toString());
//            hashmap2.put("last_time", s5);
//            hashmap2.put("title", s1);
//            hashmap2.put("item_read_icon", Integer.valueOf(j1));
//            arraylist.add(hashmap2);
//            j++;
//            k = l;
//            hashmap1 = hashmap2;
//              goto _L6
//_L5:
//            String s4;
//            j1 = 0x7f02002c;
//            String s3 = DateUtil.getDateTextForHuman(Long.parseLong(s2));
//            s4 = (new StringBuilder("\u6700\u540E\u9605\u8BFB\uFF1A")).append(s3).toString();
//            s5 = s4;
//              goto _L7
//            Exception exception;
//            exception;
//_L8:
//            Toast("\u663E\u793A\u5217\u8868\u9519\u8BEF");
//            break; /* Loop/switch isn't completed */
//            Exception exception1;
//            exception1;
//            hashmap1;
//            if(true) goto _L8; else goto _L3
//_L3:
            
            
            return arraylist;
        }

        protected void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            BookAct bookact = BookAct.this;
            List list1 = list;
            String as[] = new String[4];
            as[0] = "item_read_icon";
            as[1] = "title";
            as[2] = "item_id";
            as[3] = "last_time";
            int ai[] = new int[4];
            ai[0] = 0x7f0b0014;
            ai[1] = 0x7f0b0015;
            ai[2] = 0x7f0b0013;
            ai[3] = 0x7f0b0016;
            SimpleAdapter simpleadapter = new SimpleAdapter(bookact, list1, 0x7f030004, as, ai);
            listView.setAdapter(simpleadapter);
            loading.setVisibility(4);
            String s1 = pref.getString("pos", "0");
            System.out.println((new StringBuilder("============")).append(s1).append("=================").toString());
            listView.setSelection(-6 + Integer.parseInt(s1));
        }

//        final BookAct this$0;
//
//        private LoadListTask()
//        {
//            this$0 = BookAct.this;
//            super();
//        }

//        LoadListTask(LoadListTask loadlisttask)
//        {
//            this();
//        }
    }


    public BookAct()
    {
        tExit = new Timer();
        task = new TimerTask() {

            public void run()
            {
                BookAct.isExit = Boolean.valueOf(false);
                BookAct.hasTask = Boolean.valueOf(true);
            }

//            final BookAct this$0;
//
//            
//            {
//                this$0 = BookAct.this;
//                super();
//            }
        }
;
    }

    private void exit()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage("\u662F\u5426\u9000\u51FA\u9605\u8BFB\u7A0B\u5E8F").setCancelable(false).setTitle("\u9000\u51FA\u7A0B\u5E8F").setPositiveButton("\u786E\u5B9A", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                finish();
                System.exit(0);
            }

//            final BookAct this$0;
//
//            
//            {
//                this$0 = BookAct.this;
//                super();
//            }
        }
).setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

//            final BookAct this$0;
//
//            
//            {
//                this$0 = BookAct.this;
//                super();
//            }
        }
);
        builder.create().show();
    }

    private void go_on_read()
    {
        try
        {
            String s = pref.getString("item_id", "none");
            String s1 = pref.getString("scrool_y", "0");
            if(s.equals("none"))
            {
                Toast("\u5BF9\u4E0D\u8D77\uFF0C\u5C1A\u65E0\u5386\u53F2\u8BB0\u5F55\uFF01");
            } else
            {
                intent.putExtra("item_id", s);
                intent.putExtra("scrool_y", s1);
                intent.putExtra("total", total);
                intent.setClass(this, BookDetailAct.class);
                startActivity(intent);
            }
        }
        catch(Exception exception)
        {
            Toast("\u5BF9\u4E0D\u8D77\uFF0C\u5C1A\u65E0\u5386\u53F2\u8BB0\u5F55\uFF01");
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
//        setContentView(0x7f030001);
        setContentView(R.layout.main);
        intent = getIntent();
        pref = PreferenceManager.getDefaultSharedPreferences(this);
//        loading = (LinearLayout)findViewById(0x7f0b000a);
        loading = (LinearLayout) findViewById(R.id.loading);
        loading.getBackground().setAlpha(200);
        loading.invalidate();
//        listView = (ListView)findViewById(0x7f0b0010);
        listView = (ListView) findViewById(R.id.mainlist);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                HashMap hashmap = (HashMap)listView.getItemAtPosition(i);
                String s = (String)hashmap.get("item_id");
                String s1 = (String)hashmap.get("title");
                if(getFromAssets((new StringBuilder(String.valueOf(trimZreo((new StringBuilder(String.valueOf(s))).toString())))).append(".txt").toString()).equals(""))
                {
                    Toast("\u5BF9\u4E0D\u8D77\uFF0C\u6587\u4EF6\u4E0D\u5B58\u5728\uFF01");
                } else
                {
                    intent.putExtra("item_id", s);
                    intent.putExtra("title", s1);
                    intent.putExtra("total", total);
                    intent.setClass(BookAct.this, BookDetailAct.class);
                    startActivity(intent);
                }
            }

//            final BookAct this$0;
//
//            
//            {
//                this$0 = BookAct.this;
//                super();
//            }
        }
);
        listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
                if(i == 0)
                {
                    System.out.println((new StringBuilder(String.valueOf(abslistview.getLastVisiblePosition()))).append("===").append(abslistview.getCount()).toString());
                    pos = listView.getLastVisiblePosition();
                    android.content.SharedPreferences.Editor editor = pref.edit();
                    editor.putString("pos", (new StringBuilder(String.valueOf(pos))).toString());
                    editor.commit();
                }
            }

//            final BookAct this$0;
//
//            
//            {
//                this$0 = BookAct.this;
//                super();
//            }
        }
);
        ((Button)findViewById(R.id.go_on_btn)).setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                go_on_read();
            }

//            final BookAct this$0;
//
//            
//            {
//                this$0 = BookAct.this;
//                super();
//            }
        }
);
        (new LoadListTask()).execute(new String[0]);
        ScreenType();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f0a0001, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if(i == 4)
            if(!isExit.booleanValue())
            {
                isExit = Boolean.valueOf(true);
                Toast("\u518D\u6309\u4E00\u6B21\u8FD4\u56DE\u952E\u9000\u51FA\u7A0B\u5E8F");
                if(!hasTask.booleanValue())
                    tExit.schedule(task, 2000L);
            } else
            {
                finish();
                System.exit(0);
            }
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
//        menuitem.getItemId();
//        JVM INSTR tableswitch 2131427356 2131427360: default 40
//    //                   2131427356 46
//    //                   2131427357 99
//    //                   2131427358 63
//    //                   2131427359 56
//    //                   2131427360 117;
//           goto _L1 _L2 _L3 _L4 _L5 _L6
//_L1:
//        return super.onOptionsItemSelected(menuitem);
//_L2:
//        Alert("\u53A8\u623F\u638C\u4E2D\u5B9D");
//        continue; /* Loop/switch isn't completed */
//_L5:
//        go_on_read();
//        continue; /* Loop/switch isn't completed */
//_L4:
//        Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse("http://apk.heqee.com/"));
//        intent1.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
//        startActivity(intent1);
//        continue; /* Loop/switch isn't completed */
//_L3:
//        startActivity(new Intent(this, com/aries/duxin/wangyj/BookSettings));
//        continue; /* Loop/switch isn't completed */
//_L6:
//        exit();
//        if(true) goto _L1; else goto _L7
//_L7:
    	switch (menuitem.getItemId()) {
		case 2131427356:
			Alert("\u53A8\u623F\u638C\u4E2D\u5B9D");
			break;
		case 2131427357:
			startActivity(new Intent(this, BookSettings.class));
			break;
		case 2131427358:
	        Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse("http://apk.heqee.com/"));
	        intent1.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
	        startActivity(intent1);			
			break;
		case 2131427359:
			 go_on_read();
			break;
		case 2131427360:
			exit();
			break;

		default:
			break;
		}
    	return super.onOptionsItemSelected(menuitem);
    }

    protected void onRestart()
    {
        super.onRestart();
        loading.setVisibility(0);
        (new LoadListTask()).execute(new String[0]);
        ScreenType();
    }

    private static Boolean hasTask = Boolean.valueOf(false);
    private static Boolean isExit = Boolean.valueOf(false);
    private Intent intent;
    private List list;
    private ListView listView;
    private String list_book[];
    private LinearLayout loading;
    private int pos;
    private SharedPreferences pref;
    Timer tExit;
    TimerTask task;
    private String total;
















}
