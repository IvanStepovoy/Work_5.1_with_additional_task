public class Main {

    public static void main(String[] args) {

        System.out.println();
        BMW7 series_745i = new BMW7("BMW 745i", 260, 333, 450);
        series_745i.param();
        System.out.println();

        BMW5 series_550i = new BMW5("BMW 550i", 260, 367, 490);
        series_550i.param();
        System.out.println();

        BMW3 series_M3 = new BMW3("BMW M3", 320, 420, 400);
        series_M3.param();
        System.out.println();

        BMW_ALPINA_B7 setParams = new BMW_ALPINA_B7();
        setParams.enterParams();






    }
}