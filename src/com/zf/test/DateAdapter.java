package com.zf.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {
	private static final ThreadLocal<DateFormat> DATE_FORMAT_TL = new ThreadLocal<DateFormat>() {

        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }

    };
    @Override
    public Date unmarshal(final String v) throws Exception {
    	System.out.println(v);
        return DATE_FORMAT_TL.get().parse(v);
    }

    @Override
    public String marshal(final Date v) throws Exception {
    	System.out.println(v);
        return DATE_FORMAT_TL.get().format(v);
    }
}
