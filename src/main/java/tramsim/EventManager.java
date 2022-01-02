package tramsim;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class EventManager {
    boolean hasFired = false;
    @SubscribeEvent
    public void entityJoinWorldEvent(EntityJoinWorldEvent event) {
        if(event.world == null || !event.world.isRemote || !(event.entity instanceof EntityPlayer) || hasFired) return;
            hasFired=true;
            Message(event);
    }
    void Message(EntityJoinWorldEvent event)
    {
        boolean isMoreThanOne=false;
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText(" "));
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("You are currently playing: "));
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("- Trams in Motion " + TramsIM.MOD_VERSION));
        if(Loader.isModLoaded(("metroim")))
        {
            isMoreThanOne=true;
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("- Metro in Motion " + metroim.MetroIM.MOD_VERSION));
        }
        if(Loader.isModLoaded(("spanish_pack")))
        {
            isMoreThanOne=true;
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("- Spanish Pack " + spanish_pack.Spanish_pack.MOD_VERSION));
        }
        if(isMoreThanOne) ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Keep in mind that everything in these packs is subject to change, and might be buggy"));
        else ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Keep in mind that everything in this pack is subject to change, and might be buggy"));
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Have fun playing!  -TramsIM team"));
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText(" "));
    }
}
