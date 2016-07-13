package com.tecmaral.core.util.fecha;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class DateUtils
{
		
	private DateUtils() {}
	
	private static SimpleDateFormat DATE_FORMAT_GMT;
	
	static
	{
		DATE_FORMAT_GMT = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
		DATE_FORMAT_GMT.setTimeZone(TimeZone.getTimeZone("GMT"));
	}
	
	public static String toGMTString(Date date)
	{
		String aux = null;
		if(date!=null) {
			aux = DATE_FORMAT_GMT.format(date);			
		}
		return aux;
	}
	
	public static boolean isInMonthInterval(Date fecha, Integer minusMonth, Integer plusMonth)
	{		
		if(minusMonth!=null || plusMonth!=null)
		{
			Date currentDate = new Date();
			Calendar calendar = Calendar.getInstance();						
			boolean bottomOK = true;
			boolean topOK = true;
			if(minusMonth!=null)
			{
				calendar.setTime(fecha);
				calendar.add(Calendar.MONTH, minusMonth);
				bottomOK = calendar.getTime().after(currentDate);
			}
			if(plusMonth!=null)
			{
				calendar.setTime(currentDate);
				calendar.add(Calendar.MONTH, plusMonth);
				bottomOK = calendar.getTime().after(fecha);
			}
			return bottomOK && topOK;
		}
		
		return true;
	}
	
	public static Date toDate(String fecha, String pattern) throws ParseException
	{
		Date date = null;
			if(fecha!=null && fecha.trim().length()>0 && pattern!=null && pattern.trim().length()>0)
			{
				DateFormat df = new SimpleDateFormat(pattern);
				date = df.parse(fecha);
			}
		
		
		return date;
	}
	
	public static Date toDate(String fecha, DateFormat df) throws ParseException
	{
		Date date = null;
		if(df!=null && fecha!=null && fecha.trim().length()>0) {
				date = df.parse(fecha);
		}
		
		
		return date;
	}
	
	public static String toString(Date date, String pattern)
	{
		String fecha = null;
		
			if(date!=null && pattern!=null && pattern.trim().length()>0)
			{
				DateFormat df = new SimpleDateFormat(pattern);
				fecha = df.format(date);
			}
		
		
		return fecha;
	}
	
	public static String toString(String inDate, String inPattern, String outPattern) throws ParseException
	{
		Date date = toDate(inDate, inPattern);
		String outDate = toString(date, outPattern);
		return outDate;
	}
}
