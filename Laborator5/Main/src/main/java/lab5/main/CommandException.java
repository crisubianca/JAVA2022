/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.main;

package OptionalClasses;

public class CommandException extends Exception {
    String message;
    String messageInDepth;

    public CommandException(String message) {
        this.message = message;
        this.messageInDepth = message + " -- \n"
                            + "Localized message : " + this.getLocalizedMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getMessageInDepth() {
        return messageInDepth;
    }
}
