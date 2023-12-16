package org.example.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String start = "2021-05-01 00:00:00";
        String end = "2021-05-31 23:59:59";

        Date startdate = dateFormat.parse(start);
        Date statdate2 = new Date(1619798400000L);
        Date endDate = dateFormat.parse(end);
        Long startDateTS = startdate.getTime();
        Long endDateTS = endDate.getTime();
        System.out.println(startDateTS);
        System.out.println(endDateTS);

    }
}
