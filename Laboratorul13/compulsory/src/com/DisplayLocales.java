package com;

import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayLocales {
    public void display()
    {
        Locale[] available = Locale.getAvailableLocales();

        System.out.println("Available locales: ");
        for(Locale locale : available)
            System.out.println(locale.toString());
    }
}
