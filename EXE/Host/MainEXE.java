/*********************************************************************
	Rhapsody	: 9.0.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Host
//!	Generated Date	: Wed, 12, Apr 2023 
	File Path	: EXE/Host/MainEXE.java
*********************************************************************/


//## auto_generated
import telelogic.dishwasher.*;
//## auto_generated
import telelogic.dishwasher.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainEXE.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainEXE {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("telelogic.dishwasher.evClose");
            Class.forName("telelogic.dishwasher.evKeyPress");
            Class.forName("telelogic.dishwasher.evOpen");
            Class.forName("telelogic.dishwasher.evStart");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    protected static DishwasherBuilder p_DishwasherBuilder = null;
    private dishwasher_pkgClass initializer_telelogic_dishwasher = new dishwasher_pkgClass(RiJMainThread.instance());
    
    //## configuration EXE::Host 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainEXE initializer_EXE = new MainEXE();
        p_DishwasherBuilder = new DishwasherBuilder(RiJMainThread.instance());
        p_DishwasherBuilder.startBehavior();
        //#[ configuration EXE::Host 
        //#]
        RiJOXF.Start();
        p_DishwasherBuilder=null;
    }
    
}
/*********************************************************************
	File Path	: EXE/Host/MainEXE.java
*********************************************************************/

