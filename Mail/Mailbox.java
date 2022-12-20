package Mail;
import java.awt.TextField;
import java.util.ArrayList;
import javax.swing.JPasswordField;
public class Mailbox {
private TextField Email;
private JPasswordField Password;
ArrayList<Courier> mail_list;
	
public Mailbox(TextField Email,JPasswordField Password) {
this.Email=Email;
this.Password=Password;
mail_list=new ArrayList<Courier>();
}

public void add_mail(Courier c) {
this.mail_list.add(c);	
	
}
private boolean isvalid(Courier c) {
if(((c.address).getText()).isEmpty()||(c instanceof Package && (Double.parseDouble(((Package)c).volume.getText())>30)))
		return(false);
 return(true);	
 }


public int invalid_mails() {
int nbr =0;
for(Courier c : mail_list) {
		 if(!this.isvalid(c))
		nbr++;
}
	
return(nbr);	
	
}


public double postage() {
double cost =0;
for(Courier c : mail_list) {
	if(this.isvalid(c))
	cost+=c.amount();
}
	
return(cost);	
	
}



}
