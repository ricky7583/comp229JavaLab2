import javax.swing.JOptionPane;
import java.util.Random;
public class Test {
    public static int score = 0;
    static Object[] question(){
        String question[] = new String[5];
        question[0] = "Who is the first person who developed Java?";
        question[1] = "Which one is not correct for access modifier in Java?";
        question[2] = "Which is not correct variables in Java?";
        question[3] = "Which is wrong name for identifier?";
        question[4] = "Which variables need quotation mark when declare variables?";
        return question;
    }
    static Object[] answer(){
        String answer[][] = new String[5][4];
        answer[0][0] = "James Gosling";
        answer[0][1] = "Guido Rossum";
        answer[0][2] = "Alan Cooper";
        answer[0][3] = "Brendan Eich";

        answer[1][0] = "public";
        answer[1][1] = "private";
        answer[1][2] = "secure";
        answer[1][3] = "protected";

        answer[2][0] = "string";
        answer[2][1] = "int";
        answer[2][2] = "double";
        answer[2][3] = "char";

        answer[3][0] = "sum";
        answer[3][1] = "age";
        answer[3][2] = "double";
        answer[3][3] = "Double";

        answer[4][0] = "int";
        answer[4][1] = "float";
        answer[4][2] = "boolean";
        answer[4][3] = "String";
        return answer;
    }
    static Object[] answerArray(){
        String answerArray[]=new String[5];
        answerArray[0]="James Gosling";
        answerArray[1]="secure";
        answerArray[2]="string";
        answerArray[3] ="double";
        answerArray[4] ="String";
        return answerArray;
    }
    static Object[] correctAnswer(){
        String correctAnswer[] = new String[5];
        correctAnswer[0] = "Well done!";
        correctAnswer[1] = "Awesome!";
        correctAnswer[2] = "Keep it up!";
        correctAnswer[3] = "Nice Work!";
        return correctAnswer;
    }
    static Object[] wrongAnswer(){
        String wrongAnswer[] = new String[5];
        wrongAnswer[0] = "NO.";
        wrongAnswer[1] = "Wrong answer.";
        wrongAnswer[2] = "Better luck next time";
        wrongAnswer[3] = "Maybe next time...";
        return wrongAnswer;
    }

    static void checkAnswer(String question[], String answer[][], String answerArray[],String correctAnswer[],String wrongAnswer[]){
        for(int i=0;i<5;i++) {
            Random rd = new Random();
            int ranNum = rd.nextInt(4);
            String input = (String)JOptionPane.showInputDialog(null, question[i], "Quiz", JOptionPane.QUESTION_MESSAGE, null, answer[i], answer[i][ranNum]);
            if (input == answerArray[i]){
                JOptionPane.showMessageDialog(null,correctAnswer[ranNum], "Correct!", JOptionPane.INFORMATION_MESSAGE);
                score +=1;
            }
            else{
                JOptionPane.showMessageDialog(null,wrongAnswer[ranNum], "Error", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null,answerArray[i],"The answer was...", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    static void generateMessage(){
        switch (score) {
            case 0:
                JOptionPane.showMessageDialog(null, "Number of correct answers: 0\nNumber of wrong answers: 5\nWin rate : 0%\n","Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Number of correct answers: 1\nNumber of wrong answers: 4\nWin rate : 20%\n","Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Number of correct answers: 2\nNumber of wrong answers: 3\nWin rate : 40%\n","Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Number of correct answers: 3\nNumber of wrong answers: 2\nWin rate : 60%\n","Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Number of correct answers: 4\nNumber of wrong answers: 1\nWin rate : 80%\n","Result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Number of correct answers: 5\nNumber of wrong answers: 0\nWin rate : 100%\n","Result", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    public static void main(String args[]){
        String[] question = (String[]) question();
        String[][] answer = (String[][]) answer();
        String[] answerArray = (String[]) answerArray();
        String[] correctAnswer = (String[]) correctAnswer();
        String[] wrongAnswer = (String[]) wrongAnswer();
        checkAnswer(question,answer,answerArray,correctAnswer,wrongAnswer);
        generateMessage();
    }
}