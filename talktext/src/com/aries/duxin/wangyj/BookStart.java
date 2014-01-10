// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.aries.duxin.wangyj;

import android.content.Intent;
import android.os.Bundle;
//import cn.android.vip.feng.devmain.DevInstance;
//import com.xiangj.ts.ddp.Pmg;
//import com.xiangj.ts.hz01.JM;
//import com.xiangj.ts.ljp08.SManager;
//import com.xiangj.ts.vgp02.VManager;

// Referenced classes of package com.aries.duxin.wangyj:
//            BaseActivity, BookAct

public class BookStart extends BaseActivity
{
    class Frist extends Thread
    {

        public void run()
        {
            try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            Intent intent = new Intent();
            intent.setClass(BookStart.this, BookAct.class);
            startActivity(intent);
            finish();
//_L2:
//            return;
//            Exception exception;
//            exception;
//            if(true) goto _L2; else goto _L1
//_L1:
        }

//        final BookStart this$0;
//
//        Frist()
//        {
//            this$0 = BookStart.this;
//            super();
//        }
    }


    public BookStart()
    {
    }

    private void insertAd()
    {
//        DevInstance devinstance = DevInstance.getInstance();
//        devinstance.initialize(this, "b120b1cee09748b4O2S85f+GFsGhO5zD3zeWj34+5VEAybssnA2OeKHtOnPpGUPjbw", "\u6728\u8682\u8681");
//        devinstance.loadP();
//        Pmg.getInstance(this).recMes(this, "3ae1f775f9863b929a18e33533842be0", 1);
//        VManager vmanager = VManager.getInstance(this);
//        vmanager.setVId(this, "b1d2689796a542d7a48819ad21d2dff5");
//        vmanager.getMessage(this, true);
//        JM jm = JM.getInstance(this);
//        jm.setId(this, "a564624e0f67487ab26ad6d96679a03b");
//        jm.getMessage(this, true);
//        SManager.getInstance().setLChId(this, "L_Cid");
//        SManager.getInstance().setLKey(this, "4114ce4112c54f8895b36096ae0b9ee0");
//        SManager.getInstance().requestMessage(this);
//        devinstance.showPopGe(this);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
//        setContentView(0x7f030002);
        setContentView(R.layout.start);
        insertAd();
        SetScreenType("port");
        (new Frist()).start();
    }
}
