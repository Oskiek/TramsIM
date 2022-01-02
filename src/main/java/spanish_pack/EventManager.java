package spanish_pack;


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
        if(Loader.isModLoaded("tramsim") || Loader.isModLoaded("metroim")) return; //If detected TramsIM or MetroIM, do not send message
            hasFired=true;
            Message(event);
    }
    void Message(EntityJoinWorldEvent event)
    {
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText(" "));
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("You are currently playing: "));
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("- Spanish Pack " + Spanish_pack.MOD_VERSION));
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Keep in mind that everything in this pack is subject to change, and might be buggy"));
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText("Have fun playing!  -TramsIM team"));
        ((EntityPlayer) event.entity).addChatMessage(new ChatComponentText(" "));
    }
}
