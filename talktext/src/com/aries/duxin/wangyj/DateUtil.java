// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.aries.duxin.wangyj;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil
{
    private static class DateFormatPatterns
    {

        static final SimpleDateFormat ORACLE_CHN__HH_MM = new SimpleDateFormat("HH\u65F6mm\u5206");
        static final SimpleDateFormat ORACLE_CHN__STANDARD = new SimpleDateFormat("yyyy\u5E74MM\u6708dd\u65E5 HH\u65F6mm\u5206ss\u79D2");
        static final SimpleDateFormat ORACLE_CHN__YY_MM_DD = new SimpleDateFormat("yyyy\u5E74MM\u6708dd\u65E5");
        static final SimpleDateFormat ORACLE__HH_MM = new SimpleDateFormat("HH:mm");
        static final SimpleDateFormat ORACLE__STANDARD = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        static final SimpleDateFormat ORACLE__YY_MM_DD = new SimpleDateFormat("yyyy-MM-dd");


//        private DateFormatPatterns()
//        {
//        }
    }

//    public static final class DateType extends Enum
//    {
//
//        public static DateType valueOf(String s)
//        {
//            return (DateType)Enum.valueOf(DateUtil.class.DateType, s);
//        }
//
//        public static DateType[] values()
//        {
//            DateType adatetype[] = ENUM$VALUES;
//            int i = adatetype.length;
//            DateType adatetype1[] = new DateType[i];
//            System.arraycopy(adatetype, 0, adatetype1, 0, i);
//            return adatetype1;
//        }
//
//        private static final DateType ENUM$VALUES[];
//        public static final DateType ORACLE_CHN_HH_MM;
//        public static final DateType ORACLE_CHN_STANDARD;
//        public static final DateType ORACLE_CHN_YY_MM_DD;
//        public static final DateType ORACLE_HH_MM;
//        public static final DateType ORACLE_STANDARD;
//        public static final DateType ORACLE_YY_MM_DD;
//        public static final DateType SAMPLE_FOR_HUMAN_UNDSTAND;
//
//        static 
//        {
//            ORACLE_STANDARD = new DateType("ORACLE_STANDARD", 0);
//            ORACLE_YY_MM_DD = new DateType("ORACLE_YY_MM_DD", 1);
//            ORACLE_HH_MM = new DateType("ORACLE_HH_MM", 2);
//            ORACLE_CHN_STANDARD = new DateType("ORACLE_CHN_STANDARD", 3);
//            ORACLE_CHN_YY_MM_DD = new DateType("ORACLE_CHN_YY_MM_DD", 4);
//            ORACLE_CHN_HH_MM = new DateType("ORACLE_CHN_HH_MM", 5);
//            SAMPLE_FOR_HUMAN_UNDSTAND = new DateType("SAMPLE_FOR_HUMAN_UNDSTAND", 6);
//            DateType adatetype[] = new DateType[7];
//            adatetype[0] = ORACLE_STANDARD;
//            adatetype[1] = ORACLE_YY_MM_DD;
//            adatetype[2] = ORACLE_HH_MM;
//            adatetype[3] = ORACLE_CHN_STANDARD;
//            adatetype[4] = ORACLE_CHN_YY_MM_DD;
//            adatetype[5] = ORACLE_CHN_HH_MM;
//            adatetype[6] = SAMPLE_FOR_HUMAN_UNDSTAND;
//            ENUM$VALUES = adatetype;
//        }
//
//        private DateType(String s, int i)
//        {
//            super(s, i);
//        }
//    }
//
//
//    static int[] $SWITCH_TABLE$com$aries$duxin$wangyj$DateUtil$DateType()
//    {
//        int ai[] = $SWITCH_TABLE$com$aries$duxin$wangyj$DateUtil$DateType;
//        if(ai == null)
//        {
//            ai = new int[DateType.values().length];
//            try
//            {
//                ai[DateType.ORACLE_CHN_HH_MM.ordinal()] = 6;
//            }
//            catch(NoSuchFieldError nosuchfielderror) { }
//            try
//            {
//                ai[DateType.ORACLE_CHN_STANDARD.ordinal()] = 4;
//            }
//            catch(NoSuchFieldError nosuchfielderror1) { }
//            try
//            {
//                ai[DateType.ORACLE_CHN_YY_MM_DD.ordinal()] = 5;
//            }
//            catch(NoSuchFieldError nosuchfielderror2) { }
//            try
//            {
//                ai[DateType.ORACLE_HH_MM.ordinal()] = 3;
//            }
//            catch(NoSuchFieldError nosuchfielderror3) { }
//            try
//            {
//                ai[DateType.ORACLE_STANDARD.ordinal()] = 1;
//            }
//            catch(NoSuchFieldError nosuchfielderror4) { }
//            try
//            {
//                ai[DateType.ORACLE_YY_MM_DD.ordinal()] = 2;
//            }
//            catch(NoSuchFieldError nosuchfielderror5) { }
//            try
//            {
//                ai[DateType.SAMPLE_FOR_HUMAN_UNDSTAND.ordinal()] = 7;
//            }
//            catch(NoSuchFieldError nosuchfielderror6) { }
//            $SWITCH_TABLE$com$aries$duxin$wangyj$DateUtil$DateType = ai;
//        }
//        return ai;
//    }

    public DateUtil()
    {
    }

//    public static String formatBy(Date date, DateType datetype)
//    {
//        String s = null;
//        if(date == null) goto _L2; else goto _L1
//_L1:
//        $SWITCH_TABLE$com$aries$duxin$wangyj$DateUtil$DateType()[datetype.ordinal()];
//        JVM INSTR tableswitch 1 7: default 56
//    //                   1 66
//    //                   2 77
//    //                   3 88
//    //                   4 99
//    //                   5 110
//    //                   6 121
//    //                   7 132;
//           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
//_L3:
//        s = DateFormatPatterns.ORACLE__STANDARD.format(date);
//_L2:
//        return s;
//_L4:
//        s = DateFormatPatterns.ORACLE__STANDARD.format(date);
//        continue; /* Loop/switch isn't completed */
//_L5:
//        s = DateFormatPatterns.ORACLE__YY_MM_DD.format(date);
//        continue; /* Loop/switch isn't completed */
//_L6:
//        s = DateFormatPatterns.ORACLE__HH_MM.format(date);
//        continue; /* Loop/switch isn't completed */
//_L7:
//        s = DateFormatPatterns.ORACLE_CHN__STANDARD.format(date);
//        continue; /* Loop/switch isn't completed */
//_L8:
//        s = DateFormatPatterns.ORACLE_CHN__YY_MM_DD.format(date);
//        continue; /* Loop/switch isn't completed */
//_L9:
//        s = DateFormatPatterns.ORACLE_CHN__HH_MM.format(date);
//        continue; /* Loop/switch isn't completed */
//_L10:
//        s = getDateTextForHuman(date);
//        if(true) goto _L2; else goto _L11
//_L11:
//    	
//
//    }

    public static String getDateText()
    {
        return (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

    public static String getDateText(String s)
    {
        return (new SimpleDateFormat(s)).format(new Date());
    }

    public static String getDateText(Date date)
    {
        return (new SimpleDateFormat("yyyy-MM-dd")).format(date);
    }

    public static String getDateText(Date date, String s)
    {
        return (new SimpleDateFormat(s)).format(date);
    }

//    public static String getDateTextForHuman(long l)
//    {
//        int i = (int)(System.currentTimeMillis() / 1000L) - (int)(l / 1000L);
//        String s;
//        if(i < 60)
//            s = (new StringBuilder(String.valueOf(String.valueOf(i)))).append("\u79D2\u524D").toString();
//        else
//        if(i >= 60 && i < 3600)
//            s = (new StringBuilder(String.valueOf(String.valueOf(i / 60)))).append("\u5206\u949F\u524D").toString();
//        else
//        if(i >= 3600 && i < 0x15180)
//            s = (new StringBuilder(String.valueOf(String.valueOf(i / 3600)))).append("\u5C0F\u65F6\u524D").toString();
//        else
//        if(i >= 0x15180 && i < 0x93a80)
//            s = (new StringBuilder(String.valueOf(String.valueOf(i / 0x15180)))).append("\u5929\u524D").toString();
//        else
//        if(i >= 0x93a80 && i < 0x278d00)
//            s = formatBy(new Date(l), DateType.ORACLE_CHN_YY_MM_DD);
//        else
//        if(i >= 0x278d00)
//            s = formatBy(new Date(l), DateType.ORACLE_CHN_STANDARD);
//        else
//            s = formatBy(new Date(l), DateType.ORACLE_STANDARD);
//        return s;
//    }

//    public static String getDateTextForHuman(Date date)
//    {
//        int i = (int)(System.currentTimeMillis() / 1000L) - (int)(date.getTime() / 1000L);
//        String s;
//        if(i < 60 && i >= 0)
//            s = (new StringBuilder(String.valueOf(String.valueOf(i)))).append("\u79D2\u524D").toString();
//        else
//        if(i >= 60 && i < 3600)
//            s = (new StringBuilder(String.valueOf(String.valueOf(i / 60)))).append("\u5206\u949F\u524D").toString();
//        else
//        if(i >= 3600 && i < 0x15180)
//            s = (new StringBuilder(String.valueOf(String.valueOf(i / 3600)))).append("\u5C0F\u65F6\u524D").toString();
//        else
//        if(i >= 0x15180 && i < 0x93a80)
//            s = (new StringBuilder(String.valueOf(String.valueOf(i / 0x15180)))).append("\u5929\u524D").toString();
//        else
//        if(i >= 0x93a80 && i < 0x278d00)
//            s = formatBy(date, DateType.ORACLE_CHN_YY_MM_DD);
//        else
//        if(i >= 0x278d00)
//            s = formatBy(date, DateType.ORACLE_CHN_STANDARD);
//        else
//            s = formatBy(date, DateType.ORACLE_STANDARD);
//        return s;
//    }

//    private static int $SWITCH_TABLE$com$aries$duxin$wangyj$DateUtil$DateType[];
    private static final String datePattern_YY_MM_DD = "yyyy-MM-dd";
}
