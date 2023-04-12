/*********************************************************************
	Rhapsody	: 9.0.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: SERVICEMAN
//!	Generated Date	: Wed, 12, Apr 2023 
	File Path	: EXE/Host/telelogic/dishwasher/SERVICEMAN.java
*********************************************************************/

package telelogic.dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// telelogic/dishwasher/SERVICEMAN.java                                                                  
//----------------------------------------------------------------------------

//## package telelogic::dishwasher 


/**
[[ * @author $Author]]
[[ * @version $Version]]
[[ * @see $See]]
[[ * @since $Since]]
*/
//## actor SERVICEMAN 
public class SERVICEMAN implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSERVICEMAN = new AnimClass("telelogic.dishwasher.SERVICEMAN",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  SERVICEMAN() {
        try {
            animInstance().notifyConstructorEntered(animClassSERVICEMAN.getUserClass(),
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
        return animClassSERVICEMAN; 
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
            super(SERVICEMAN.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            SERVICEMAN.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            SERVICEMAN.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/telelogic/dishwasher/SERVICEMAN.java
*********************************************************************/

