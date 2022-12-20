package Mail;
import Project_Exceptions.*;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
public class Package extends Courier {

protected JTextField volume;
public Package (JTextField weight,ButtonGroup shipmeth,JTextField address,JTextField volume)throws Weight_exception,Volume_exception{
	super(weight,shipmeth,address);
if(Double.parseDouble(volume.getText())<0)
		throw new Volume_exception();
this.volume=volume;
}
public double amount() {
double amount=Double.parseDouble(volume.getText())*1.5+Double.parseDouble(weight.getText())*1.2;
switch (this.shipmeth.getSelection().toString()) {
case "normal":return (amount);
case "express":return (2*amount);
default:return(0);
}}
	
}
