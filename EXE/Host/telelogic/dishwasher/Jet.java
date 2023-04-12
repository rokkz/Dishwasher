/*********************************************************************
	Rhapsody	: 9.0.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Jet
//!	Generated Date	: Wed, 12, Apr 2023 
	File Path	: EXE/Host/telelogic/dishwasher/Jet.java
*********************************************************************/

package telelogic.dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// telelogic/dishwasher/Jet.java                                                                  
//----------------------------------------------------------------------------

//## package telelogic::dishwasher 


//## class Jet 
public class Jet implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassJet = new AnimClass("telelogic.dishwasher.Jet",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  Jet() {
        try {
            animInstance().notifyConstructorEntered(animClassJet.getUserClass(),
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
        return animClassJet; 
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
            super(Jet.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Jet.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Jet.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/telelogic/dishwasher/Jet.java
*********************************************************************/

