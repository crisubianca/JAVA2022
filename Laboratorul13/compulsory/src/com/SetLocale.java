package com;

import java.util.Locale;

public class SetLocale {
    public void setNewLocale(String languageTag) {
        Locale.setDefault(Locale.forLanguageTag(languageTag));
    }
}
