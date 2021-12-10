
package tramsim.models.blocks; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelOrensePole extends ModelBase //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelOrensePole() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 46, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-2.5F, -36F, -2.5F);

		bodyModel[1].addShapeBox(0F, 0F, 1F, 2, 10, 10, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(-1F, -31F, -13.5F);





	}
}