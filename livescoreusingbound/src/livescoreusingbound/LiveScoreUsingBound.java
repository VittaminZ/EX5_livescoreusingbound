/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreusingbound;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class LiveScoreUsingBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean liveScore = new LiveScoreBean();
        Subscriber obj1 = new Subscriber();
        Subscriber obj2 = new Subscriber();
        liveScore.addPropertyChangeListener(obj1);
        liveScore.addPropertyChangeListener(obj2);
        Scanner inp = new Scanner(System.in);
        String scoreLine;
        System.out.print("Enter Score ");
        scoreLine = inp.nextLine();
       while(!scoreLine.equals("")){
            liveScore.setScoreLine(scoreLine);
            System.out.print("Enter Score ");
            scoreLine = inp.nextLine();
        }
    }
    
}
