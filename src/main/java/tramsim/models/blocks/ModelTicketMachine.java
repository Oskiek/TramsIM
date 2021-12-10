
package tramsim.models.blocks; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelTicketMachine extends ModelBase //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelTicketMachine() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 33, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 12, 20, 12, 0F); // Box 0
		bodyModel[0].setRotationPoint(-6F, -16F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 10, 12, 10, 0F); // Box 1
		bodyModel[1].setRotationPoint(-5F, 4F, -5F);





	}
}