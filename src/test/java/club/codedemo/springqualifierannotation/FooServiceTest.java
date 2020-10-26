package club.codedemo.springqualifierannotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FooServiceTest {
    @Autowired
    FooService fooService;

    @Test
    void getFormatter() {
        Assertions.assertEquals("FooFormatter", this.fooService.getFormatter().getClass().getSimpleName());
    }

    @Test
    void getFormatter1() {
        Assertions.assertEquals("BarFormatter", this.fooService.getFormatter1().getClass().getSimpleName());
    }

    @Test
    void getBarFormatter() {
        Assertions.assertEquals("BarFormatter", this.fooService.getBarFormatter().getClass().getSimpleName());
    }

    @Test
    void getFooFormatter() {
        Assertions.assertEquals("BarFormatter", this.fooService.getFooFormatter().getClass().getSimpleName());
    }

}