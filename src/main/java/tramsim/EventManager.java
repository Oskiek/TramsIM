package tramsim;


import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class EventManager {
    @SubscribeEvent
    public void entityJoinWorldEvent(EntityJoinWorldEvent event) {
        if (event.entity instanceof EntityPlayer) {
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText(" "));
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("You are currently playing a second pre-release of Trams in Motion"));
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Keep in mind that everything in this pack is subject to change, and might be buggy"));
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Link to our Discord: https://discord.gg/QQ5GRac"));
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Have fun playing!  -TramsIM team"));
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText(" "));
        }
    }
}
