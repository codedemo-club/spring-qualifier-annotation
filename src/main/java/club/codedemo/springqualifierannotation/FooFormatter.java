package club.codedemo.springqualifierannotation;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
@Qualifier("fooFormatter")
@Primary
public class FooFormatter implements Formatter {

    @Override
    public Object parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Object o, Locale locale) {
        return null;
    }
}
