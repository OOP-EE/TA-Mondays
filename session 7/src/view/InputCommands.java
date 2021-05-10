package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum InputCommands {
    // add person firstName lastName nationalCode
    ADD_PERSON("^\\s*(?i)add\\s+person\\s+(\\w+)\\s+(\\w+)\\s+(\\d+)\\s*$"),
    // add book bookName
    ADD_BOOK("(?i)^\\s*add\\s+book\\s+(\\w+)"),
    // set date day/month/year
    SET_DATE("\\d{1,2}\\/\\d{1,2}\\/\\d{4}"),
    // exit
    EXIT("(?i)\\s*Exit\\s*");


    private final Pattern commandPattern;

    InputCommands(String s) {
        this.commandPattern = Pattern.compile(s);
    }

    public Matcher getMatcher(String input) {
        return this.commandPattern.matcher(input);
    }

}
