
public class Main {
    public static void main(String[] args) {
        //prime numbers using do while loop
        int n = 1;
        do{
            if(
                    n != 1 && n%2 !=0 && n%3 !=0 && n%5 !=0 && n%7 !=0 || n == 2 || n == 3 || n == 5 || n == 7
            ){
                System.out.println(n);
            }
            n++;
        }while(n <=100);

    }
}