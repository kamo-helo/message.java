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
    
    //return total messages sent
    public int returnTotalMessages(){
        return 1; 
    }
        
   








public static void main(String[] args){
    
    // Login check
    System.out.println("=== QuickChat login ===");
    System.out.println("Username");
    System.out.println("Password: ");
    
    System.out.println("Login successful!");
}else {
    System.out.println("Login failed.");
    return;
}

        int choice = 0;
        int totalSent = 0;
        
        //loop until user quits
        while (choice= 3){
        System.out.println("Welcome to QuickChat. ");
        System.out.println("send messages");
        System.out.println("show recently sent messages");
        System.out.println("quit");
        System.out.println("enter your choice: ");
        
        if (choice == 1){
        //ask how many messages
        System.out.println("how many messages do you want to enter? ");
        
        message[] messages = new Messages[num];
        for (int i =0; i < num; i++){
        messages[i] = new messages();
        messages[i] =.MessageNum = i;
        
        //generate 10 digit ID
        for (int j = 0; j<10; j++){
        
        System.out.println("message");
        
        //recipient
        System.out.println("enter recipient number");
        
        //message text
        System.out.println("enter messages");
}
}
}
}



}
