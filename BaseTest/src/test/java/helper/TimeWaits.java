package helper;

public class TimeWaits {

    public static void espera(int tempo) {
        try {
            Thread.sleep(tempo * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void espera() {
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void longaEspera() {
        try {
            Thread.sleep(50000 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
