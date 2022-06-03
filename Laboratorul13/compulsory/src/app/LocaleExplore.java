package app;

import com.DisplayLocales;
import com.Info;
import com.SetLocale;

import java.io.IOException;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocaleExplore {
    public static void main(String args[]) throws IOException {
        DisplayLocales displayLocales = new DisplayLocales();
        SetLocale setLocale = new SetLocale();
        Info info = new Info();
        Scanner read = new Scanner(System.in);  // Create a Scanner object
        String command;
        String input;

        while(true){
            System.out.println("Type your commands: ");
            command = read.nextLine();
            switch (command)
            {
                case "set" :
                    System.out.println("Type language tag: ");
                    input = read.nextLine();
                    setLocale.setNewLocale(input);
                    break;
                case "info" :
                        System.out.println("Type language tag or current: ");
                        input = read.nextLine();
                        if(input.equals("current"))
                        {
                            info.displayInfo(Locale.getDefault());
                            break;
                        }
                        info.displayInfo(Locale.forLanguageTag(input));
                    break;
                case "display locales":
                    displayLocales.display();
                    break;
                default:
                        System.out.println("Wrong command!");
                        break;
            }
        }

        /**displayMessages(Locale.forLanguageTag("ro"));
        //-> Salut, Utilizatorul Duke s-a conectat la 2016-05-03, La revedere
        displayMessages(Locale.getDefault());
        //-> Hello, User Duke logged in at 2016-05-03, Goodbye*/

    }

    public static void displayMessages(Locale locale) {
        String baseName = "res.Messages";
        ResourceBundle messages =
                ResourceBundle.getBundle(baseName, locale);
        System.out.println(messages.getString("prompt"));
        String pattern = messages.getString("info");

        //String pattern = messages.getString("info");
        Object[] arguments = {"Duke", LocalDate.now()};
        String welcome = new MessageFormat(pattern).format(arguments);
        System.out.println(welcome);
        //System.out.println(messages.getString("bye"));
    }

}
