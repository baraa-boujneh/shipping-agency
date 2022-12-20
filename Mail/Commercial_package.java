package Mail;

import Project_Exceptions.*;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;


public class Commercial_package extends Package implements Ibusiness_correspondence {
public Commercial_package (JTextField weight,ButtonGroup shipmeth,JTextField address,JTextField volume)throws Weight_exception,Volume_exception{
		super(weight,shipmeth,address,volume);
}
@Override
public double amount() {
	
return(super.amount()*(1-discount/100));
	
}


	
	
}

			
		



