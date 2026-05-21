/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Message;

/**
 *
 * @author Student
 */
public class Java {
    
    public String messageID;
    public String recipient;
    public String messageText;
    public String messageHash;
    public int messageNum;
    
    //Check ID is not more that 10 characters
    public boolean checkMessageID(){
        if (messageID.length() <= 10){
            return true;
        } else {
            return false;
        }
    }
    
    // check recipient cell number 
    public String checkRecipientCell(){
        if (recipient.length() <= 10 && recipient.startsWith("+")){
            return "Cell phone number is incorectly formatted or does not contain an international code. please correct the number and try again.";
        }
    }
    
    //create hash
    public String createMessageHash(){
        String part1 = messageID.substring(0, 2);
        String[] words = messageText.split(" ");
        String first = words[0].toUpperCase();
        String last = words[words.length - 1].toUpperCase();
        
        
    
    
    
    
}
    

// check message length , exact wording from brief 
    public String CheckMessageLength(){
        if (messageText.length() <= 250){
            return "Message ready to send.";
        }else {
            int diff = messageText.length() - 250;
            return "Message exceeds 250 characters by " + diff + "please reduce the size.";
        }
        
    }
    
// ask user to send, store, or disregard
    public String SentMessage(){
        Scanner = new Scanner( System.in);
        
        System.out.println("1. Send Message");
        System.out.println("2. Disregard Message");
        System.out.println("3. Store Message to send later");
        System.out.println("Enter option");
        
    }
    
// print details in order: 
    public String printMessage(){
        return "MessageID: " + messageID +
                "MessageHash:" + messageHash +
                "Recipient: " + recipient +
                "Message: " + messageText;
        
    }
    
// store message, leave basic for now
    public void storeMassage(){
        System.out.println("Message stored.");
        
    }
        
    }
