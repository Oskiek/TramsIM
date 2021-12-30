package spanish_pack;


import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class EventManager {
    @SubscribeEvent
    public void entityJoinWorldEvent(EntityJoinWorldEvent event) {
        if(event.world == null || !event.world.isRemote || !(event.entity instanceof EntityPlayer)) return;
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText(" "));
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("You are currently playing the first pre-release of Spanish pack"));
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Keep in mind that everything in this pack is subject to change, and might be buggy"));
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Link to our Discord: https://discord.gg/QQ5GRac"));
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Have fun playing!  -Spanish pack team"));
            ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText(" "));

    }
}
