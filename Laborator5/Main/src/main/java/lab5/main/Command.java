/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.main;

package OptionalClasses;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public abstract class Command {
    String callMethod;
    Catalog catalog;
    List<String> argumentList;

    public Command(Catalog catalog) {
        this.catalog = catalog;
        argumentList = new LinkedList<>();
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public String getCallMethod() {
        return callMethod;
    }

    public abstract void execute(String arguments) throws CommandException, CustomException, IOException, ClassNotFoundException;

    void parseArguments(String arguments) {
        this.argumentList.addAll(Arrays.asList(arguments.split(" ")));
    }
}