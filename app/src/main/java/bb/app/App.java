/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bb.app;

import bb.list.LinkedList;

import static bb.utilities.StringUtils.join;
import static bb.utilities.StringUtils.split;
import static bb.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
