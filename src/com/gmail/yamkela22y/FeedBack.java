//Sends an email
package com.gmail.yamkela22y;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author YAMKELA MACWILI
 */
public class FeedBack {
    
    String ApplicantName;
    
    public String getApplicantName(){
        
        return  ApplicantName;
    }
    
    /**
     * 
     * @param name 
     */
    public void setApplicantName(String name){ 

        ApplicantName =  name;
    }
    
    /**
     * 
     * @param recipientEmail
     * @throws Exception 
     */
    public void sendMail(String recipientEmail) throws Exception {
        
        Properties properties = new Properties();
        
        properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.transport.protocol", "smtp");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("keanuperumal8@gmail.com", "keanu007");   
            }
        });

        Message message = new MimeMessage(session);
        
        //Subject of the email
        message.setSubject("Application at Isipho"); 
        //The content/body of the email
        message.setContent(
             
                "Dear " + getApplicantName()  
                
                + "<br>This is a comfirmaion that ISipho has succcessfully completed you applicatoion.<br><br>"
                + "Note: Please be reminded that Isipho does not keep any of your application details,"
                        + "and therefore does not keep track of your application status. "
                        + "If you need any assistance you will be required to provide your details. <br><br>"
                        + "Contact us on: <br>"
                        + "Call: "
                        + "000 000 0000 | 000 000 0000 | 000 000 0000 <br>"
                        + "Email: isipho@gmail.com"        
                + "<br><br>Thank you <br> Isipho  ", "text/html");

        //Address address = new InternetAddress("keanuperumal8@gmail.com"); //The recepient address
        Address recipientAddress = new InternetAddress(recipientEmail); //The recepient address from the main class
        Address localAddress = new InternetAddress("keanuperumal8@gmail.com"); //the sender address
        message.setRecipient(Message.RecipientType.TO, recipientAddress);    //setting the recipient 
        
        message.setFrom(localAddress);      //setting the sender address

        //**************** Incase you need Attatching documents use this code**********
//        MimeMultipart multipart = new MimeMultipart();
//        MimeBodyPart attachment = new MimeBodyPart();
//        attachment.attachFile(new File (""));
//        MimeBodyPart messageBodyPart = new MimeBodyPart();
//        messageBodyPart.setContent("<h1> Email From isph</h1>", "text/html");
//        multipart.addBodyPart(messageBodyPart);
//        multipart.addBodyPart(attachment);
//        
//        message.setContent(multipart);
        Transport.send(message);        //sending the email
        JOptionPane.showMessageDialog(null, "Email sent");
    }
}
