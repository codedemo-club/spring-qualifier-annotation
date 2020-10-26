package club.codedemo.springqualifierannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;


@Component
public class FooService {

    /**
     * 未显式声明
     * 注入@Primay注解的Bean -> fooFormatter
     */
    @Autowired
    private Formatter formatter;

    /**
     * 显式声明，注入显式声明的Bean -> barFormatter
     */
    @Autowired
    @Qualifier("barFormatter")
    private Formatter formatter1;

    /**
     * 未显式声明，但字段名称与Bean名称相同。
     * 注入与字段名称同名的Bean -> barFormatter
     */
    @Autowired
    private Formatter barFormatter;

    /**
     * 显式声明，同时字段名称与Bean名称相同
     * 注入显式声明的Bean
     */
    @Autowired
    @Qualifier("barFormatter")
    private Formatter fooFormatter;

    public Formatter getFormatter() {
        return formatter;
    }

    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }

    public Formatter getFormatter1() {
        return formatter1;
    }

    public void setFormatter1(Formatter formatter1) {
        this.formatter1 = formatter1;
    }

    public Formatter getFooFormatter() {
        return fooFormatter;
    }

    public void setFooFormatter(Formatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }

    public Formatter getBarFormatter() {
        return barFormatter;
    }

    public void setBarFormatter(Formatter barFormatter) {
        this.barFormatter = barFormatter;
    }
}
