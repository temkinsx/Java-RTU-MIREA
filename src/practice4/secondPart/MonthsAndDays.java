package practice4.secondPart;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthsAndDays {
    static public void main(String[] args) throws ArrayIndexOutOfBoundsException {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int n = 0;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Введите целое число от 1 до 12: ");
            n = sc.nextInt();
            int days = dom[n - 1];

            if(n == 2){
                System.out.print("Введите год: ");
                int year = sc.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    days = 29;
                }
            }

            System.out.print("Месяц: " + months[n-1] + ", дней: " + days);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: число должно быть в диапазоне от 1 до 12");
        } catch (InputMismatchException e){
            System.out.println("Ошибка: число должно быть целым");
        }
    }



}
