/*********************************************************************
	Rhapsody	: 9.0.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evOpen
//!	Generated Date	: Wed, 12, Apr 2023 
	File Path	: EXE/Host/telelogic/dishwasher/evOpen.java
*********************************************************************/

package telelogic.dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// telelogic/dishwasher/evOpen.java                                                                  
//----------------------------------------------------------------------------

//## package telelogic::dishwasher 


//## event evOpen() 
public class evOpen extends RiJEvent implements AnimatedEvent {
    
    public static final int evOpen_dishwasher_telelogic_id = 12017;		//## ignore 
    
    
    // Constructors
    
    public  evOpen() {
        lId = evOpen_dishwasher_telelogic_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evOpen_dishwasher_telelogic_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("telelogic.dishwasher.evOpen");
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
    }
    public String toString() {
          String s="evOpen(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/telelogic/dishwasher/evOpen.java
*********************************************************************/

