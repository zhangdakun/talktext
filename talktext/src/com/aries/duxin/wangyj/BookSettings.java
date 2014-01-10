// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.aries.duxin.wangyj;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class BookSettings extends PreferenceActivity
{

    public BookSettings()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences);
    }
}
