/**
 * @project Timadoro
 * @author Hyacinth
 */

package lk.teamtimadoro.timadoro.main;

//import lk.teamtimadoro.timadoro.gateway.Postman;
import lk.teamtimadoro.timadoro.view.Dashboard;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
//        String to = "alwiskaveen@gmail.com";
//        String sub = "Test Mail";
//        String bdy = "Hello there,\n\nThis is a test message to test whether Postman class is working"
//                + "\n\nThank you.\n\nBest,\nTeam Timadoro";
//        
//        Postman pst = new Postman(to, sub, bdy);
//        pst.PostMail();
//
        Dashboard win = new Dashboard();
        win.pack();
        win.setVisible(true);
    }
    
}
