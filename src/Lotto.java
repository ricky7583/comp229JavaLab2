import java.util.Random;
import javax.swing.JOptionPane;
import java.util.stream.*;
public class Lotto {
    static int[] numGen(){
        int triNum[] = new int[4];
        for(int i=0;i<3;i++){
            Random rd = new Random();
            int ranNum = rd.nextInt(9)+1;
            triNum[i] = ranNum;
        }
        return triNum;
    }

    static void playGame(int sum){
        for(int i=0;i<5;i++){
            int input = Integer.parseInt((String)JOptionPane.showInputDialog("Please type the number you're expecting. (3~27)"));
            if(input == sum){
                JOptionPane.showMessageDialog(null,"Congratulations! You won!");
                break;
            }
            else if(i==4){
                JOptionPane.showMessageDialog(null,"You lose... Computer wins.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Try again.");
            }
        }
    }

    public static void main(String args[]){
        int[] triNum = numGen();
        int sum = IntStream.of(triNum).sum();
        playGame(sum);
    }
}
