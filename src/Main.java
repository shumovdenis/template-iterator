public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int r : new Randoms(90, 100)) {
            Thread.sleep(1000);
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
