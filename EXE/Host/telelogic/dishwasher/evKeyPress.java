/*********************************************************************
	Rhapsody	: 9.0.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evKeyPress
//!	Generated Date	: Wed, 12, Apr 2023 
	File Path	: EXE/Host/telelogic/dishwasher/evKeyPress.java
*********************************************************************/

package telelogic.dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// telelogic/dishwasher/evKeyPress.java                                                                  
//----------------------------------------------------------------------------

//## package telelogic::dishwasher 


//## event evKeyPress(char) 
public class evKeyPress extends RiJEvent implements AnimatedEvent {
    
    public static final int evKeyPress_dishwasher_telelogic_id = 12019;		//## ignore 
    
    public char key;
    
    // Constructors
    
    public  evKeyPress() {
        lId = evKeyPress_dishwasher_telelogic_id;
    }
    public  evKeyPress(char p_key) {
        lId = evKeyPress_dishwasher_telelogic_id;
        key = p_key;
    }
    
    public boolean isTypeOf(long id) {
        return (evKeyPress_dishwasher_telelogic_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("telelogic.dishwasher.evKeyPress");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
          msg.add("key", key);
    }
    public String toString() {
          String s="evKeyPress(";      
          s += "key=" + AnimInstance.animToString(key) + " ";
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/telelogic/dishwasher/evKeyPress.java
*********************************************************************/

