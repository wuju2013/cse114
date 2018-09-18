package Lab4;

public class Shapes {
    public static void main(String[] args) {
        //Shape 1
        for (int i = 0; i < 4; i++){
            System.out.println("****");
        }

        System.out.println();

        //Shape 2
        for (int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Shape 3
        int max = 3;
        for (int i = 0; i < 4;i++){
            for (int k = 0; k < max; k++){
                System.out.print(" ");
            }
            max--;
            for (int j = 0; j <= i ; j++){
                System.out.print("**");
            }
            System.out.println();
        }
        System.out.println();

        //Shape 4
        int num = 3;
        max = 3;
        for (int i = 0; i < 4;i++){
            for (int k = 0; k < max; k++){
                System.out.print(" ");
            }
            max--;
            for (int j = 0; j <= i ; j++){
                System.out.print("**");
            }
            System.out.println();
        }
        for (int i = 0; i < 4;i++){
            for (int k = 0; k < i; k++){
                System.out.print(" ");
            }

            for (int j = 0; j <= num ; j++){
                System.out.print("**");
            }
            num--;
            System.out.println();
        }



    }
}

