package Lab4;

public class tuition {
    public static void main(String[] args) {
        int count = 0;
        double currentTuition = 10000;
        double tuitionRaiseValue = 1.07;

        while(currentTuition <= 20000){
            currentTuition *= tuitionRaiseValue;
            count++;
        }
        System.out.println("It takes " + count + " years for the tuition to double. ");


    }
}
