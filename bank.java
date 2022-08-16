//Created By : Mahaning Hubballi
import java.util.*;
import java.io.*;

class bank{
    public static void main(String[] args) {
        int i,amt,acnt_bal,Deposit_amt,withdraw_amt;
        String UN="01fe21mca038";
        String PSWD="kletech";
        Scanner sc= new Scanner(System.in);
        Random r=new Random();
        System.out.println("Enter User Namae :   ");
        String un= sc.nextLine();
        System.out.println("Enter Password   : ");
        String pswd= sc.nextLine();
        int otp=r.nextInt(9999);
        String s=String.valueOf(otp);
        // System.out.println("5dig otp-->  :"+otp);9
        String fn="otp.txt" ;
        try{
            FileWriter file= new FileWriter(fn);
            file.write(s);
            System.out.println("otp is genrated in otp.txt file\n");
            file.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
        System.out.println("Enter OTP   : ");
        String g_otp= sc.nextLine();

        if((UN.equals(un)) && (PSWD.equals(pswd)) && (s.equals(g_otp))){
            System.out.println("\nLogin Succsufull!.....\n");
            while(true){
            
            System.out.println("##########---MENU---########");
            System.out.println("\n1.View Balance\n2.Deposit\n3.withdraw\n4.Transfore Amount\n5.To Exit Application press: CTRL + C \nEnter your Choice");
            int ch= sc.nextInt();

            
           
            switch(ch){
                
                case 1: try{
                    BufferedReader reader =new BufferedReader(new FileReader("balance.txt"));
                    // FileReader file1=new FileReader("balance.txt");
                    String Int_line;
                    while ((Int_line = reader.readLine()) != null) {
                        int In_Value = Integer.parseInt(Int_line);
                        // Print the Integer
                        
                       i=Integer.parseInt(Int_line);  
                        System.out.println(i+"\n");
                        
                    }
                    
                    
                    
    
                }
                catch (Exception e){
                    e.getStackTrace();
                }
                break;

                case 2: try{
                    BufferedReader reader =new BufferedReader(new FileReader("balance.txt"));
                    // FileReader file1=new FileReader("balance.txt");
                    String Int_line;
                    while ((Int_line = reader.readLine()) != null) {
                        int In_Value = Integer.parseInt(Int_line);
                        // Print the Integer
                        
                       i=Integer.parseInt(Int_line);  
                        System.out.println(i);
                        System.out.println("Enter amount to be deposite : ");
                        Deposit_amt= sc.nextInt();
                        if(Deposit_amt>0){
                        int bal = In_Value+Deposit_amt;
                        String f_bal=String.valueOf(bal);
                        FileWriter file= new FileWriter("balance.txt");
                        file.write(f_bal);
                        System.out.println(" Transaction Successfull\n");
                        file.close();
                        }
                        else{
                            System.out.println("Invalid Amount Entry\n");
                        }
                    }
                    
                    
                    
    
                }
                catch (Exception e){
                    e.getStackTrace();
                }
                break;

            
            case 3:try{
                BufferedReader reader =new BufferedReader(new FileReader("balance.txt"));
                // FileReader file1=new FileReader("balance.txt");
                String Int_line;
                while ((Int_line = reader.readLine()) != null) {
                    int In_Value = Integer.parseInt(Int_line);
                    // Print the Integer
                    
                   i=Integer.parseInt(Int_line);  
                    System.out.println(i);
                    System.out.println("Enter amount to be Withdraw : ");
                    Deposit_amt= sc.nextInt();
                    if(Deposit_amt>0 && Deposit_amt<=In_Value-1000){
                    int bal = In_Value-Deposit_amt;
                    String f_bal=String.valueOf(bal);
                    
                    FileWriter file= new FileWriter("balance.txt");
                    file.write(f_bal);
                    System.out.println("Transaction Successfull\n");
                    file.close();
                    }
                    else if(Deposit_amt<=0){
                        System.out.println("Invalid Amount Entry\n");
                    }
                    else{
                        System.out.println("Insufficent Funds!.........\n");
                    }
                }
                
                
                

            }
            catch (Exception e){
                e.getStackTrace();
            }
            break;

            case 4:try{
                BufferedReader reader =new BufferedReader(new FileReader("balance.txt"));
                BufferedReader hist =new BufferedReader(new FileReader("balance.txt"));
                // FileReader file1=new FileReader("balance.txt");
                String Int_line,value;
                int tran_amt,bal=0,in_amt=0;
                String B1="SBI",B2="HDFC",IFSC="";
                    String ACN1="1234567891012";
                    String IFSC1="SBIN0005943";
                    String ACN2="9876543210111";
                    String IFSC2="HDFCN000594";
                    String cust1=sc.nextLine();
                    System.out.println("Enter Account Holder  Name");
                    String cust=sc.nextLine();
                    System.out.println("Enter Account Bank  Name");
                    String bname=sc.nextLine();
                    
                    System.out.println("Enter Custommer account Number");
                    String ACN=sc.nextLine();
                    if(!"SBI".equals(bname) && !"sbi".equals(bname)){
                        System.out.println("Enter ISFC Number");
                        IFSC= sc.nextLine();
                    }
                    else{
                        IFSC="SBI00001269";
                    }
                    
                    while ((Int_line = reader.readLine()) != null) {
                    int In_Value = Integer.parseInt(Int_line);
                    // Print the Integer
                    i=Integer.parseInt(Int_line);  
                    System.out.println(i);
                    if((ACN.length() > 10 && ACN.length()<=16) && IFSC.length()==11){
                    System.out.println("Enter amount to be transfor");
                    Deposit_amt= sc.nextInt();

                    if(Deposit_amt>0 && Deposit_amt<=In_Value-1000){
                    bal = In_Value-Deposit_amt;
                    
                    String f_bal=String.valueOf(bal);
                    String t=String.valueOf(Deposit_amt);
                    int total=Deposit_amt+Deposit_amt;
                    String total_amt=String.valueOf(total);
                    FileWriter file= new FileWriter("balance.txt");
                    file.write(f_bal);
                    file.close();
                    // ------------------------------------
                    // while ((value = reader.readLine()) != null) {
                    //     in_amt = Integer.parseInt(value);}
                    //     int tm_amt =  in_amt+Deposit_amt;
                        
                    String s1="Amount :"+t+" \nAccount NO : "+ACN+"\nHolder Name : "+cust+"\nBank Name  :"+bname+"\tIFSC code is : "+IFSC+"\n-----------------------------------------------------------------------------------------------------------";
					// String S2="Old Balance"+in_amt+"\nAmount Recived :"+t+"\n Total Amount :"+tm_amt;
					try(FileOutputStream outputStream = new FileOutputStream("history.txt", true)) {
  
					byte[] strToBytes = s1.getBytes();
					outputStream.write(strToBytes);
                    }
                //     try(FileOutputStream outputStream = new FileOutputStream("person1.txt", true)) {
  
                //         byte[] strToBytes = S2.getBytes();
                //         outputStream.write(strToBytes);
                //         }
                System.out.println("Transaction Successfull\n");
                 }
                    else if(Deposit_amt<=0){
                    System.out.println("\nInvalid Amount Entry");
                    }
                    else{
                    System.out.println("\nInsufficent Funds!.........");
                }
                }
                
									
                    
                } 
                    // file1.close();
                }
                
                
                

            
            catch (Exception e){
                e.getStackTrace();
            }
            break;
            default :System.out.println("Invalid Choice");
            
        }

        }
    }
        else {
            System.out.println("Invalid Username and Password or OTP ......");
        }
    
        


    }
}
