/**
 * @project Timadoro
 * @author Hyacinth
 */

package lk.teamtimadoro.timadoro.gateway;

// Integrating JavaMail API
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

// Postman class is for deliver weekly reports to the user
public class Postman {

    // Variable declaration
    private final String Sender = "teamtimadoro@gmail.com";
    private final String Password = "timadoro123";
    private final String SMTPserver = "smtp.gmail.com";
    private final String ServerPort = "465";
    private final String Receiver;
    private final String Subject;
    private final String Body;
    
    // Poostman constructor
    public Postman(String receiverEmailID, String Subject, String Body){
   
        // Receiver Email ID
        this.Receiver = receiverEmailID; 
        // Subject
        this.Subject = Subject;
        // Mail Body
        this.Body = Body;
        
    }
    
    // PostMail is the method that sends the mail
    public void PostMail(){
        
        // Mail property settings
        Properties props = new Properties();
        props.put("mail.smtp.user",this.Sender);
        props.put("mail.smtp.host", this.SMTPserver);
        props.put("mail.smtp.port", this.ServerPort);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", this.ServerPort);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        
        SecurityManager security = System.getSecurityManager();

        // Try block for mail sending process
        try{  
            Authenticator authenticate = new SMTPauthenticator();
            Session session = Session.getInstance(props, authenticate);
            MimeMessage mail = new MimeMessage(session);
            
            // Adding mail content and details
            mail.setText(this.Body);
            mail.setSubject(this.Subject);
            mail.setFrom(new InternetAddress(Sender));
            mail.addRecipient(Message.RecipientType.TO,
            new InternetAddress(this.Receiver));
            
            // Sending mail
            Transport.send(mail);
            System.out.println("Message send Successfully:)"); 
        }

        // Trigger for failed post
        catch (MessagingException e){
            System.out.println(e.getMessage());
        }
    }
    
    // Setting up the SMTP server authenticator
    public class SMTPauthenticator extends javax.mail.Authenticator
    {
        @Override
        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(Sender, Password);
        }
    }
}
