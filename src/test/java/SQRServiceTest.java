import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    void souldCalculateSmallGap() {
        SQRService service = new SQRService();

        long min = 100;
        long max = 225;
        long exepted = 6;
        long actual = service.calculate(min, max);

        Assertions.assertEquals(exepted, actual);
    }

    @Test
    void souldCalculateBigGap() {
        SQRService service = new SQRService();

        long min = 100;
        long max = 8_100;
        long exepted = 81;
        long actual = service.calculate(min, max);

        Assertions.assertEquals(exepted, actual);
    }

}
