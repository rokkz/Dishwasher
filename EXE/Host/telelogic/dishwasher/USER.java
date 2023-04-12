/*********************************************************************
	Rhapsody	: 9.0.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: USER
//!	Generated Date	: Wed, 12, Apr 2023 
	File Path	: EXE/Host/telelogic/dishwasher/USER.java
*********************************************************************/

package telelogic.dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// telelogic/dishwasher/USER.java                                                                  
//----------------------------------------------------------------------------

//## package telelogic::dishwasher 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor USER 
public class USER implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassUSER = new AnimClass("telelogic.dishwasher.USER",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  USER() {
        try {
            animInstance().notifyConstructorEntered(animClassUSER.getUserClass(),
               new ArgData[] {
               });
        
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassUSER; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(USER.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            USER.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            USER.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/telelogic/dishwasher/USER.java
*********************************************************************/

