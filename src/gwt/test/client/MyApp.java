package test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyApp implements EntryPoint {
    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
    	
    	Label label = new Label("test");
    	
    	Label label2 = new Label("ttestest2");
    	label2.getElement().setPropertyString("background-color", "red");
    	
    	RootPanel.get().add(label);
    	RootPanel.get().add(label2);
    	
    	
    	
    	
    	
    }
}
