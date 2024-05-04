package ru.netology.javaqa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.VacationService;


public class VacationServiceTest {

    @Test
    public void test() {
        VacationService service = new VacationService();
        int expected = 3;
        int actual = service.calculate(1_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }


}
