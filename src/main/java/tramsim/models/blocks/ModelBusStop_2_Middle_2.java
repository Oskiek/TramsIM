//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.12.2018 - 12:55:57
// Last changed on: 09.12.2018 - 12:55:57

package tramsim.models.blocks; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBusStop_2_Middle_2 extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBusStop_2_Middle_2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];
		bodyModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 10

		bodyModel[0].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 1
		bodyModel[0].setRotationPoint(-1F, -32F, 15F);
		bodyModel[0].rotateAngleZ = -0.17453293F;

		bodyModel[1].addBox(0F, 0F, 0F, 1, 29, 1, 0F); // Box 3
		bodyModel[1].setRotationPoint(13F, -28.5F, 15F);
		bodyModel[1].rotateAngleZ = -0.17453293F;

		bodyModel[2].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 4
		bodyModel[2].setRotationPoint(-1F, -32F, 0F);
		bodyModel[2].rotateAngleZ = -0.17453293F;

		bodyModel[3].addBox(0F, 0F, 0F, 1, 29, 1, 0F); // Box 5
		bodyModel[3].setRotationPoint(13F, -28.5F, 0F);
		bodyModel[3].rotateAngleZ = -0.17453293F;

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 6
		bodyModel[4].setRotationPoint(13.15F, -29.5F, 1F);
		bodyModel[4].rotateAngleZ = -0.17453293F;

		bodyModel[5].addBox(0F, 0F, 0F, 19, 0, 16, 0F); // Box 7
		bodyModel[5].setRotationPoint(-3F, -32.36F, 0F);
		bodyModel[5].rotateAngleZ = -0.17453293F;

		bodyModel[6].addBox(0F, 0F, 0F, 0, 29, 14, 0F); // Box 9
		bodyModel[6].setRotationPoint(13.5F, -28.5F, 1F);
		bodyModel[6].rotateAngleZ = -0.17453293F;

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 10
		bodyModel[7].setRotationPoint(0F, -29F, 0F);

		this.flipAll();

	}
}