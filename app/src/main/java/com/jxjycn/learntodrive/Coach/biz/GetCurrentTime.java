package com.jxjycn.learntodrive.Coach.biz;

import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by hanks7 on 2016/6/20.
 */
public class GetCurrentTime {

    private ArrayList<TextView> tv_dayOf_week_list;
    private ArrayList<RadioButton> tv_dayOf_moth_list;

    public GetCurrentTime(ArrayList<TextView> tv_dayOf_week_list, ArrayList<RadioButton> tv_dayOf_moth_list) {
        this.tv_dayOf_week_list = tv_dayOf_week_list;
        this.tv_dayOf_moth_list = tv_dayOf_moth_list;


    }


    public void commit() {

        List<Date> dList = dateToWeek(new Date());

        int i = 0;
        for (Date d : dList) {
            String dt = new SimpleDateFormat("MM/dd").format(d);
            tv_dayOf_moth_list.get(i);
            tv_dayOf_moth_list.get(i).setText(dt);
            String today = getDaynum(d);
            today = today.replace("星期", "");
            tv_dayOf_week_list.get(i).setText(today);

            i++;
            if(i==7) return;
        }

    }


    private String getDaynum(Date d) {
        String dt2 = new SimpleDateFormat("yyyy-MM-dd").format(d);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        try {
            cal.setTime(format.parse(dt2));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String today = new DateFormatSymbols().getShortWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
        return today;
    }


    //调用这个方法  你传入一个日期 就能获得 这个日期所在一周内的所有天数的一个List
    @SuppressWarnings({"deprecation", "unchecked"})
    public List<Date> dateToWeek(Date mdate) {
        System.out.println("mdate :"+mdate);
        int b=mdate.getDay();
        System.out.println("b:  "+b);
        Date fdate ;
        List <Date> list = new ArrayList<Date>();
        Long fTime=mdate.getTime();
        System.out.println("fTime: "+fTime);
        for(int a=0;a<8;a++)
        {
            fdate= new Date();
            fdate.setTime(fTime+(a*24*3600000));
            list.add(a, fdate);
        }
        return list;
    }

}
