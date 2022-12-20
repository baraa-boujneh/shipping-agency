package Mail;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;

import Project_Exceptions.*;


public class Advertisment extends Courier implements Ibusiness_correspondence {
	public Advertisment (JTextField weight, ButtonGroup shipmeth,JTextField address)throws Weight_exception{
		super(weight,shipmeth,address);}


	
	
	@Override
	public double amount() {
		double amount=Double.parseDouble(this.weight.getText())*1.2;
		 amount=amount*(1-discount/100);
		 switch (this.shipmeth.getSelection().toString()) {
		 case "normal":return (amount);
		 case "express":return (2*amount);
		 default:return(0);
		 }
	}}

