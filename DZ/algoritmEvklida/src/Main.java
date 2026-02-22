import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dell = sc.nextInt();
        int dellit = sc.nextInt();
        System.out.println(evklid(dell,dellit));
    }

    public static int evklid(int dell, int dellit) {
        if (dellit>dell){
            int x=dell;
            dell=dellit;
            dellit=x;
        }
        if (dellit == 0) {
            throw new IllegalArgumentException("делитель не может быть нулём");
        }
        int chastnoe = dell % dellit;
        while (chastnoe != 0) {
            dell = dellit;
            dellit = chastnoe;
            chastnoe = dell % dellit;
        }
        return dellit;

    }
}