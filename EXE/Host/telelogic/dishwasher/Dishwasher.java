/*********************************************************************
	Rhapsody	: 9.0.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Dishwasher
//!	Generated Date	: Wed, 12, Apr 2023 
	File Path	: EXE/Host/telelogic/dishwasher/Dishwasher.java
*********************************************************************/

package telelogic.dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// telelogic/dishwasher/Dishwasher.java                                                                  
//----------------------------------------------------------------------------

//## package telelogic::dishwasher 


//## class Dishwasher 
public class Dishwasher implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassDishwasher = new AnimClass("telelogic.dishwasher.Dishwasher",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int DryTimeMs;		//## attribute DryTimeMs 
    
    protected int RinseTimeMs;		//## attribute RinseTimeMs 
    
    protected int WashTimeMs;		//## attribute WashTimeMs 
    
    protected Heater heater;		//## classInstance heater 
    
    protected Display itsDisplay;		//## link itsDisplay 
    
    protected Jet jet;		//## classInstance jet 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Running=1;
    public static final int Washing=2;
    public static final int Rinsing=3;
    public static final int Drying=4;
    public static final int Open=5;
    public static final int Off=6;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    protected int Running_subState;		//## ignore 
    
    protected int Running_lastState;		//## ignore 
    
    public static final int Dishwasher_Timeout_Washing_id = 1;		//## ignore 
    
    public static final int Dishwasher_Timeout_Rinsing_id = 2;		//## ignore 
    
    public static final int Dishwasher_Timeout_Drying_id = 3;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  Dishwasher(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassDishwasher.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation message_0() 
    public void message_0() {
        try {
            animInstance().notifyMethodEntered("message_0",
               new ArgData[] {
               });
        
        //#[ operation message_0() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation setup() 
    public void setup() {
        try {
            animInstance().notifyMethodEntered("setup",
               new ArgData[] {
               });
        
        //#[ operation setup() 
        WashTimeMs = 5000;
        RinseTimeMs = 4000;
        DryTimeMs = 5000;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getDryTimeMs() {
        return DryTimeMs;
    }
    
    //## auto_generated 
    public void setDryTimeMs(int p_DryTimeMs) {
        DryTimeMs = p_DryTimeMs;
    }
    
    //## auto_generated 
    public int getRinseTimeMs() {
        return RinseTimeMs;
    }
    
    //## auto_generated 
    public void setRinseTimeMs(int p_RinseTimeMs) {
        RinseTimeMs = p_RinseTimeMs;
    }
    
    //## auto_generated 
    public int getWashTimeMs() {
        return WashTimeMs;
    }
    
    //## auto_generated 
    public void setWashTimeMs(int p_WashTimeMs) {
        WashTimeMs = p_WashTimeMs;
    }
    
    //## auto_generated 
    public Heater getHeater() {
        return heater;
    }
    
    //## auto_generated 
    public Heater newHeater() {
        heater = new Heater();
        animInstance().notifyRelationAdded("heater", heater);
        return heater;
    }
    
    //## auto_generated 
    public void deleteHeater() {
        animInstance().notifyRelationRemoved("heater", heater);
        heater=null;
    }
    
    //## auto_generated 
    public Display getItsDisplay() {
        return itsDisplay;
    }
    
    //## auto_generated 
    public void __setItsDisplay(Display p_Display) {
        itsDisplay = p_Display;
        if(p_Display != null)
            {
                animInstance().notifyRelationAdded("itsDisplay", p_Display);
            }
        else
            {
                animInstance().notifyRelationCleared("itsDisplay");
            }
    }
    
    //## auto_generated 
    public void _setItsDisplay(Display p_Display) {
        if(itsDisplay != null)
            {
                itsDisplay.__setItsDishwasher(null);
            }
        __setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void setItsDisplay(Display p_Display) {
        if(p_Display != null)
            {
                p_Display._setItsDishwasher(this);
            }
        _setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void _clearItsDisplay() {
        animInstance().notifyRelationCleared("itsDisplay");
        itsDisplay = null;
    }
    
    //## auto_generated 
    public Jet getJet() {
        return jet;
    }
    
    //## auto_generated 
    public Jet newJet() {
        jet = new Jet();
        animInstance().notifyRelationAdded("jet", jet);
        return jet;
    }
    
    //## auto_generated 
    public void deleteJet() {
        animInstance().notifyRelationRemoved("jet", jet);
        jet=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        heater = newHeater();
        jet = newJet();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(Running_subState == state)
                {
                    return true;
                }
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case Running:
                {
                    Running_add(animStates);
                }
                break;
                case Off:
                {
                    Off_add(animStates);
                }
                break;
                case Open:
                {
                    Open_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case Washing:
                {
                    res = Washing_takeEvent(id);
                }
                break;
                case Rinsing:
                {
                    res = Rinsing_takeEvent(id);
                }
                break;
                case Drying:
                {
                    res = Drying_takeEvent(id);
                }
                break;
                case Off:
                {
                    res = Off_takeEvent(id);
                }
                break;
                case Open:
                {
                    res = Open_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Running_add(AnimStates animStates) {
            animStates.add("ROOT.Running");
            switch (Running_subState) {
                case Washing:
                {
                    Washing_add(animStates);
                }
                break;
                case Rinsing:
                {
                    Rinsing_add(animStates);
                }
                break;
                case Drying:
                {
                    Drying_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void Washing_add(AnimStates animStates) {
            animStates.add("ROOT.Running.Washing");
        }
        
        //## statechart_method 
        public void Rinsing_add(AnimStates animStates) {
            animStates.add("ROOT.Running.Rinsing");
        }
        
        //## statechart_method 
        public void Drying_add(AnimStates animStates) {
            animStates.add("ROOT.Running.Drying");
        }
        
        //## statechart_method 
        public void Open_add(AnimStates animStates) {
            animStates.add("ROOT.Open");
        }
        
        //## statechart_method 
        public void Off_add(AnimStates animStates) {
            animStates.add("ROOT.Off");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            Running_subState = RiJNonState;
            Running_lastState = RiJNonState;
        }
        
        //## statechart_method 
        public void Open_exit() {
            OpenExit();
            animInstance().notifyStateExited("ROOT.Open");
        }
        
        //## statechart_method 
        public void OpenExit() {
            //#[ state Open.(Exit) 
            System.out.println("Door Closed");
            //#]
        }
        
        //## statechart_method 
        public void Washing_exit() {
            WashingExit();
            animInstance().notifyStateExited("ROOT.Running.Washing");
        }
        
        //## statechart_method 
        public int Running_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evOpen.evOpen_dishwasher_telelogic_id))
                {
                    res = RunningTakeevOpen();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Off_enter() {
            animInstance().notifyStateEntered("ROOT.Off");
            rootState_subState = Off;
            rootState_active = Off;
            OffEnter();
        }
        
        //## statechart_method 
        public void Drying_exit() {
            DryingExit();
            animInstance().notifyStateExited("ROOT.Running.Drying");
        }
        
        //## statechart_method 
        public void Washing_entDef() {
            Washing_enter();
        }
        
        //## statechart_method 
        public int OffTakeevStart() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Off_exit();
            //#[ transition 2 
            setup();
            //#]
            Running_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void RinsingEnter() {
            //#[ state Running.Rinsing.(Entry) 
            System.out.println("Rising");
            //#]
            itsRiJThread.schedTimeout(RinseTimeMs, Dishwasher_Timeout_Rinsing_id, this, "ROOT.Running.Rinsing");
        }
        
        //## statechart_method 
        public void RunningExit() {
        }
        
        //## statechart_method 
        public void Running_entDef() {
            Running_enter();
            
            animInstance().notifyTransitionStarted("1");
            Washing_entDef();
            animInstance().notifyTransitionEnded("1");
        }
        
        //## statechart_method 
        public void RunningEnter() {
        }
        
        //## statechart_method 
        public void Rinsing_exit() {
            RinsingExit();
            animInstance().notifyStateExited("ROOT.Running.Rinsing");
        }
        
        //## statechart_method 
        public void Running_entShallowHist() {
            if(Running_lastState != RiJNonState)
                {
                    Running_subState = Running_lastState;
                    switch (Running_subState) {
                        case Washing:
                        {
                            Washing_enter();
                        }
                        break;
                        case Rinsing:
                        {
                            Rinsing_enter();
                        }
                        break;
                        case Drying:
                        {
                            Drying_enter();
                        }
                        break;
                        default:
                            break;
                    }
                }
        }
        
        //## statechart_method 
        public void Drying_enter() {
            animInstance().notifyStateEntered("ROOT.Running.Drying");
            Running_subState = Drying;
            rootState_active = Drying;
            DryingEnter();
        }
        
        //## statechart_method 
        public void Washing_enter() {
            animInstance().notifyStateEntered("ROOT.Running.Washing");
            Running_subState = Washing;
            rootState_active = Washing;
            WashingEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void RinsingExit() {
            itsRiJThread.unschedTimeout(Dishwasher_Timeout_Rinsing_id, this);
        }
        
        //## statechart_method 
        public void Running_exit() {
            Running_lastState = Running_subState;
            switch (Running_subState) {
                case Washing:
                {
                    Washing_exit();
                    Running_lastState = Washing;
                }
                break;
                case Rinsing:
                {
                    Rinsing_exit();
                    Running_lastState = Rinsing;
                }
                break;
                case Drying:
                {
                    Drying_exit();
                    Running_lastState = Drying;
                }
                break;
                default:
                    break;
            }
            Running_subState = RiJNonState;
            RunningExit();
            animInstance().notifyStateExited("ROOT.Running");
        }
        
        //## statechart_method 
        public void Open_enter() {
            animInstance().notifyStateEntered("ROOT.Open");
            rootState_subState = Open;
            rootState_active = Open;
            OpenEnter();
        }
        
        //## statechart_method 
        public int Rinsing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = RinsingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void Off_entDef() {
            Off_enter();
        }
        
        //## statechart_method 
        public void DryingExit() {
            itsRiJThread.unschedTimeout(Dishwasher_Timeout_Drying_id, this);
            //#[ state Running.Drying.(Exit) 
            System.out.println("Dishwasher Cycle Complete");
            //#]
        }
        
        //## statechart_method 
        public int RinsingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Dishwasher_Timeout_Rinsing_id)
                {
                    animInstance().notifyTransitionStarted("6");
                    Rinsing_exit();
                    Drying_entDef();
                    animInstance().notifyTransitionEnded("6");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void Rinsing_entDef() {
            Rinsing_enter();
        }
        
        //## statechart_method 
        public void WashingExit() {
            itsRiJThread.unschedTimeout(Dishwasher_Timeout_Washing_id, this);
        }
        
        //## statechart_method 
        public void OffEnter() {
        }
        
        //## statechart_method 
        public void Drying_entDef() {
            Drying_enter();
        }
        
        //## statechart_method 
        public void Open_entDef() {
            Open_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Off_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int Open_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evClose.evClose_dishwasher_telelogic_id))
                {
                    res = OpenTakeevClose();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Off_exit() {
            OffExit();
            animInstance().notifyStateExited("ROOT.Off");
        }
        
        //## statechart_method 
        public void Running_enter() {
            animInstance().notifyStateEntered("ROOT.Running");
            rootState_subState = Running;
            RunningEnter();
        }
        
        //## statechart_method 
        public int OpenTakeevClose() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Open_exit();
            Running_enter();
            Running_entShallowHist();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void OpenEnter() {
            //#[ state Open.(Entry) 
            System.out.println("Door Opened");
            //#]
        }
        
        //## statechart_method 
        public void Rinsing_enter() {
            animInstance().notifyStateEntered("ROOT.Running.Rinsing");
            Running_subState = Rinsing;
            rootState_active = Rinsing;
            RinsingEnter();
        }
        
        //## statechart_method 
        public int WashingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Dishwasher_Timeout_Washing_id)
                {
                    animInstance().notifyTransitionStarted("5");
                    Washing_exit();
                    Rinsing_entDef();
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void WashingEnter() {
            //#[ state Running.Washing.(Entry) 
            System.out.println("Washing");
            //#]
            itsRiJThread.schedTimeout(WashTimeMs, Dishwasher_Timeout_Washing_id, this, "ROOT.Running.Washing");
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void OffExit() {
        }
        
        //## statechart_method 
        public void DryingEnter() {
            //#[ state Running.Drying.(Entry) 
            System.out.println("Drying");
            //#]
            itsRiJThread.schedTimeout(DryTimeMs, Dishwasher_Timeout_Drying_id, this, "ROOT.Running.Drying");
        }
        
        //## statechart_method 
        public int Washing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = WashingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int Off_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evStart.evStart_dishwasher_telelogic_id))
                {
                    res = OffTakeevStart();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Drying_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = DryingTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int DryingTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Dishwasher_Timeout_Drying_id)
                {
                    animInstance().notifyTransitionStarted("7");
                    Running_exit();
                    Off_entDef();
                    animInstance().notifyTransitionEnded("7");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int RunningTakeevOpen() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Running_exit();
            Open_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return Dishwasher.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassDishwasher; 
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
        
        msg.add("WashTimeMs", WashTimeMs);
        msg.add("RinseTimeMs", RinseTimeMs);
        msg.add("DryTimeMs", DryTimeMs);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("jet", true, true, jet);
        msg.add("heater", true, true, heater);
        msg.add("itsDisplay", false, true, itsDisplay);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Dishwasher.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Dishwasher.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Dishwasher.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/telelogic/dishwasher/Dishwasher.java
*********************************************************************/

