package tramsim;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.entity.Render;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import tramsim.EventManager;
import tramsim.tiles.*;
import tramsim.tiles.platforms.TileEntityPlatform;
import tramsim.tiles.platforms.TileEntityPlatformPole;
import tramsim.tiles.platforms.edges.*;
import tramsim.tiles.platforms.render.RenderEdge;
import tramsim.tiles.platforms.render.RenderPlatform;
import tramsim.tiles.render.*;
import tramsim.tiles.stops.*;
import tramsim.tiles.stops.render.*;

public class ClientProxy extends CommonProxy {


	public static EventManager eventManager = new EventManager();

	public static RenderPlatform rendererPlatform = new RenderPlatform();
	@Override
	public Object getRenderPlatform(){
		return rendererPlatform;
	}

	public static RenderEdge rendererEdge = new RenderEdge();
	@Override
	public Object getRenderEdge(){return rendererEdge;}

	public static RenderBusStop rendererBusStop = new RenderBusStop();
	@Override
	public Object getRenderBusStop()
	{return rendererBusStop;}


	@Override
	public void registerRenderers(){
		RenderTicketMachine.textureName="ticketmachine_kzkgop.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTicketMachine_Kzkgop.class, new RenderTicketMachine());
		RenderTicketMachine.textureName="ticketmachine_brno.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTicketMachine_Brno.class, new RenderTicketMachine());

		RenderBusStop.demandedTexture="busstop_2.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBusStop_2_Left_1.class, new RenderBusStop());
		RenderBusStop.demandedTexture="busstop_2.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBusStop_2_Middle_1.class, new RenderBusStop());
		RenderBusStop.demandedTexture="busstop_2.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBusStop_2_Middle_2.class, new RenderBusStop());
		RenderBusStop.demandedTexture="busstop_2.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBusStop_2_Middle_3.class, new RenderBusStop());
		RenderBusStop.demandedTexture="busstop_2.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBusStop_2_Middle_4.class, new RenderBusStop());
		RenderBusStop.demandedTexture="busstop_2.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBusStop_2_Middle_5.class, new RenderBusStop());
		RenderBusStop.demandedTexture="busstop_2.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBusStop_2_Right_1.class, new RenderBusStop());
		RenderBusStop.demandedTexture="busstop_3.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBusStop_3_Left_1.class, new RenderBusStop());
		RenderBusStop.demandedTexture="busstop_3.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBusStop_3_Middle_1.class, new RenderBusStop());
		RenderBusStop.demandedTexture="busstop_3.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBusStop_3_Right_1.class, new RenderBusStop());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPlatform.class, new RenderPlatform());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPlatformPole.class, new RenderPlatform());

		RenderEdge.textureName="british.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdgeBritish.class, new RenderEdge());
		RenderEdge.textureName="checkerboard.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdgeChecker.class, new RenderEdge());
		RenderEdge.textureName="ledStripe.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdgeLed.class, new RenderEdge());
		RenderEdge.textureName="leftCorner.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdgeLeftCorner.class, new RenderEdge());
		RenderEdge.textureName="lined.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdgeLined.class, new RenderEdge());
		RenderEdge.textureName="linedLed.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdgeLedLined.class, new RenderEdge());
		RenderEdge.textureName="linedYellow.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdgeYellowLined.class, new RenderEdge());
		RenderEdge.textureName="plain.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdgePlain.class, new RenderEdge());
		RenderEdge.textureName="rightCorner.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdgeRightCorner.class, new RenderEdge());
		RenderEdge.textureName="thickYellow.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdgeYellowThick.class, new RenderEdge());

		registerItemRenderers();
		
	}
	public void registerItemRenderers()
	{
		
	}
}