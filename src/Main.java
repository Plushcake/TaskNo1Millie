public class Main {
    public static void main(String[] args) {

        int ticketPrice = 600;
        int oneMileBonus = 20;

        int bonusMile = ticketPrice / oneMileBonus;
        System.out.printf("Бонус за купленный билет: " + bonusMile + " милей");
    }
}
//Формула следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.
//Что вам нужно: создать приложение, рассчитывающее количество начисленных мили за купленный билет.
