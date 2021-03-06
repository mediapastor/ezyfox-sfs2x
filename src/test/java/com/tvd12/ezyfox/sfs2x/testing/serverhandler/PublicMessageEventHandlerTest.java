package com.tvd12.ezyfox.sfs2x.testing.serverhandler;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.testng.annotations.Test;

import com.smartfoxserver.v2.core.ISFSEvent;
import com.smartfoxserver.v2.core.SFSEventParam;
import com.smartfoxserver.v2.entities.Room;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.exceptions.SFSException;
import com.tvd12.ezyfox.core.constants.APIKey;
import com.tvd12.ezyfox.sfs2x.serverhandler.PublicMessageEventHandler;
import com.tvd12.ezyfox.sfs2x.testing.context.AppUser;
import com.tvd12.ezyfox.sfs2x.testing.context.PokerRoom;

/**
 * @author tavandung12
 * Created on May 30, 2016
 *
 */
public class PublicMessageEventHandlerTest extends BaseZoneHandlerTest {

    @Test(priority = 1)
    public void test() throws SFSException {
        PublicMessageEventHandler handler = new PublicMessageEventHandler(context);
        ISFSEvent event = mock(ISFSEvent.class);
        Room sfsRoom = mock(Room.class);
        when(sfsRoom.getProperty(APIKey.ROOM)).thenReturn(new PokerRoom());
        User recipient = mock(User.class);
        when(recipient.getProperty(APIKey.USER)).thenReturn(new AppUser());
        when(event.getParameter(SFSEventParam.ZONE)).thenReturn(sfsZone);
        when(event.getParameter(SFSEventParam.ROOM)).thenReturn(sfsRoom);
        when(event.getParameter(SFSEventParam.USER)).thenReturn(sfsUser);
        when(event.getParameter(SFSEventParam.RECIPIENT)).thenReturn(recipient);
        when(event.getParameter(SFSEventParam.MESSAGE)).thenReturn("abc");
        when(event.getParameter(SFSEventParam.OBJECT)).thenReturn(new SFSObject());
        handler.handleServerEvent(event);
    }
    
    @Test(priority = 2)
    public void test2() throws SFSException {
        PublicMessageEventHandler handler = new PublicMessageEventHandler(context);
        ISFSEvent event = mock(ISFSEvent.class);
        Room sfsRoom = mock(Room.class);
        when(sfsRoom.getProperty(APIKey.ROOM)).thenReturn(new PokerRoom());
        User recipient = mock(User.class);
        when(recipient.getProperty(APIKey.USER)).thenReturn(new AppUser());
        when(event.getParameter(SFSEventParam.ZONE)).thenReturn(sfsZone);
        when(event.getParameter(SFSEventParam.ROOM)).thenReturn(sfsRoom);
        when(event.getParameter(SFSEventParam.USER)).thenReturn(sfsUser);
        when(event.getParameter(SFSEventParam.RECIPIENT)).thenReturn(recipient);
        when(event.getParameter(SFSEventParam.MESSAGE)).thenReturn("abc");
        when(event.getParameter(SFSEventParam.OBJECT)).thenReturn(new SFSObject());
        handler.handleServerEvent(event);
    }
    
}
