package com;

import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.util.Currency;
import java.util.Locale;
import java.util.ResourceBundle;

public class Info {

    public void displayInfo(Locale locale)
    {
        String baseName = "res.Messages";
        ResourceBundle messages =
                ResourceBundle.getBundle(baseName, locale);
        System.out.println(messages.getString("Default") + " " + Locale.getDefault());
        System.out.println(messages.getString("Country") + " " + locale.getCountry());
        System.out.println(messages.getString("Language") + " " + locale.getLanguage());
        System.out.println(messages.getString("Currency") + " " + Currency.getInstance(locale).getCurrencyCode());

        DateFormatSymbols symbols = new DateFormatSymbols(locale);
        String[] weekDays = symbols.getWeekdays();
        System.out.println(messages.getString("Week") + " ");
        for(String day : weekDays)
            System.out.print(day + " ");
        System.out.println();
        System.out.println(messages.getString("Month") + " ");
        String[] monthsOfYear = symbols.getMonths();
        for(String month : monthsOfYear)
            System.out.print(month + " ");
        System.out.println();
    }
}
