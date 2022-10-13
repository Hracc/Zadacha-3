import java.util.Scanner;

public class Test9a {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int D = sc.nextInt();
            int[] Arr = new int[D];
            System.out.print("Введите элементы массива: ");
            for (int i = 0; i < D; i++) {
                int E = sc.nextInt();
                Arr[i]=E;
            }
            for (int i = 0; i < D; i++) {
                int a=0;
                for (int k=0; k<D; k++) {
                    if ((Arr[i] == Arr[k]) && (i!=k)) {
                        ++a;
                    }
                }
                if (a==0){
                    System.out.println("Неповторяющее число:" + Arr[i]);
                }
            }
        }
}
