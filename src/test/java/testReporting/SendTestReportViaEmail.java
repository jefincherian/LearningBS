package testReporting;

import utilities.GlobalProperties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class SendTestReportViaEmail {

    public void sendTestReportTo(String to) {
        // Sender's email ID needs to be mentioned
        String from = "jefin@qburst.com";
        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";
        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        // Get the Session object.// and pass
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("jefin@qburst.com", "konfiqlfpcjcdyka");
            }
        });
        // session.setDebug(true);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // Set Subject: header field
            message.setSubject("Test Report of PS2ME Parent Pro (Android)");
            // message.setContent("", "text/html");
            Multipart multipart = new MimeMultipart();
            MimeBodyPart attachmentPart = new MimeBodyPart();
            MimeBodyPart textPart = new MimeBodyPart();
            try {
                File f = new File(System.getProperty("user.dir") + "\\Reports\\PS2ME_ParentPro.html");
                GlobalProperties prop = new GlobalProperties();
                attachmentPart.attachFile(f);
                textPart.setText("Hi,\n\n" + "Please find the automation test result of PS2ME Parent Pro (Android) " + "version " + prop.properties("version") + ".\n(If you are having difficulty viewing the report, " + "please download the file and open it on your machine.)" + "\n\n\nThanks,\nJefin Cherian");
                multipart.addBodyPart(textPart);
                multipart.addBodyPart(attachmentPart);
            } catch (IOException e) {
                e.printStackTrace();
            }
            message.setContent(multipart);
            System.out.println("Sending email to " + to);
            // Send message
            Transport.send(message);
            System.out.println("Email sent successfully");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
