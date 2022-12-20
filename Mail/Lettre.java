package Mail;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import Project_Exceptions.*;
public class Lettre extends Courier  {	
private ButtonGroup fo;
public Lettre (JTextField weight, ButtonGroup shipmeth,JTextField address,ButtonGroup fo)throws Weight_exception {
super(weight,shipmeth,address);
this.fo=fo;}
public double amount() {
double amount=Double.parseDouble(this.weight.getText())*0.8;
switch((this.fo).getSelection().toString()) {
	case "A2":amount+=2;break;
	case "A4":amount+=4;break;
	default:break;
}		
		
switch (this.shipmeth.getSelection().toString()) {
case "normal":return (amount);
case "express":return (2*amount);
default:return(0);
}}}

	


