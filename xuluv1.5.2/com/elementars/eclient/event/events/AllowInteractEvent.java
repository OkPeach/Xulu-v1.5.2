// 
// Decompiled by Procyon v0.5.36
// 

package com.elementars.eclient.event.events;

import com.elementars.eclient.event.Event;

public class AllowInteractEvent extends Event
{
    public boolean usingItem;
    
    public AllowInteractEvent(final boolean usingItem) {
        this.usingItem = usingItem;
    }
}
