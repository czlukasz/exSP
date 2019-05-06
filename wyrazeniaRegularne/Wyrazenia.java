package czarnotalukasz.wyrazeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wyrazenia {
    public void wyrazenia() {
        Pattern compiledPattern = Pattern.compile("Lukasz");
        Matcher matcher = compiledPattern.matcher("Nazywam się Lukasz");

        System.out.println(matcher.find());
        System.out.println(matcher.matches());
    }
}
