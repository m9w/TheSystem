package com.winderton.app.layers;

import java.awt.Graphics;

import com.winderton.app.core.Window;
import com.winderton.app.events.Event;
import com.winderton.app.events.EventListener;

abstract public class Layer implements EventListener {

	public void onEvent(Event e) {
		
	}
	
	public abstract void onRender(Graphics g, Window w);

}
