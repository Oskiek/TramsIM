package spanish_pack;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.entity.Render;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import spanish_pack.EventManager;
import spanish_pack.tiles.*;
import spanish_pack.tiles.render.*;

public class ClientProxy extends CommonProxy {


	public static EventManager eventManager = new EventManager();

	public static RenderCatenary renderCatenary = new RenderCatenary();
	@Override
	public Object getRenderCatenary()
	{return renderCatenary;}


	@Override
	public void registerRenderers(){

		RenderCatenary.textureName="Catenary_single_A.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCatenary_single_A.class, new RenderCatenary());
		RenderCatenary.textureName="Catenary_single_A.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCatenary_single_B.class, new RenderCatenary());
		RenderCatenary.textureName="Catenary_single_B.png";
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCatenary_double_C.class, new RenderCatenary());

		registerItemRenderers();

	}
	public void registerItemRenderers()
	{

	}
}