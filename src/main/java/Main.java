import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        long actual = service.calculate(100, 8_100);
        long expected = 3;
        System.out.println("Ожидаемый результат : " + expected + ", Фактический результат : " + actual);

    }

}

