package Mail;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import Project_Exceptions.*;
abstract class Courier {
protected JTextField weight;
protected ButtonGroup shipmeth;
protected JTextField address;
public Courier (JTextField weight, ButtonGroup shipmeth,JTextField address)throws Weight_exception  {
if(Double.parseDouble(weight.getText())<=0)
	throw new Weight_exception();
this.weight=weight;
this.shipmeth=shipmeth;	
this.address=address;	
}


 abstract public double amount();

}
