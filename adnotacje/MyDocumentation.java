package czarnotalukasz.adnotacje;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyDocumentation {
    String author() default "cz_lu";
    String comment();
}
