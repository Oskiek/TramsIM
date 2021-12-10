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

public class ModelBusStop_2_Left_1 extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 128;
	public ModelBusStop_2_Left_1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[16];

		initbodyModel_1();

	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 90, 26, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 16

		bodyModel[0].addBox(0F, 0F, 0F, 1, 31, 1); // Box 0
		bodyModel[0].setRotationPoint(0F, -31F, 15F);

		bodyModel[1].addBox(0F, 0F, 0F, 16, 1, 1); // Box 1
		bodyModel[1].setRotationPoint(-1F, -32F, 15F);
		bodyModel[1].rotateAngleZ = -0.17453293F;

		bodyModel[2].addBox(0F, 0F, 0F, 1, 29, 1); // Box 3
		bodyModel[2].setRotationPoint(13F, -28.5F, 15F);
		bodyModel[2].rotateAngleZ = -0.17453293F;

		bodyModel[3].addBox(0F, 0F, 0F, 16, 1, 1); // Box 4
		bodyModel[3].setRotationPoint(-1F, -32F, 0F);
		bodyModel[3].rotateAngleZ = -0.17453293F;

		bodyModel[4].addBox(0F, 0F, 0F, 1, 29, 1); // Box 5
		bodyModel[4].setRotationPoint(13F, -28.5F, 0F);
		bodyModel[4].rotateAngleZ = -0.17453293F;

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 14); // Box 6
		bodyModel[5].setRotationPoint(13.15F, -29.5F, 1F);
		bodyModel[5].rotateAngleZ = -0.17453293F;

		bodyModel[6].addBox(0F, 0F, 0F, 19, 0, 16); // Box 7
		bodyModel[6].setRotationPoint(-3F, -32.36F, 0F);
		bodyModel[6].rotateAngleZ = -0.17453293F;

		bodyModel[7].addBox(0F, 0F, 0F, 12, 31, 0); // Box 8
		bodyModel[7].setRotationPoint(1F, -31F, 15.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 29, 14); // Box 9
		bodyModel[8].setRotationPoint(13.5F, -28.5F, 1F);
		bodyModel[8].rotateAngleZ = -0.17453293F;

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 15); // Box 10
		bodyModel[9].setRotationPoint(0F, -29F, 0F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 14); // Box 11
		bodyModel[10].setRotationPoint(8.5F, -8F, 1F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 1, 1); // Box 12
		bodyModel[11].setRotationPoint(4.5F, -8F, 1F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 1); // Box 13
		bodyModel[12].setRotationPoint(4.5F, -8F, 14F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 14); // Box 14
		bodyModel[13].setRotationPoint(8.5F, -9F, 1F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 14); // Box 15
		bodyModel[14].setRotationPoint(6.5F, -9F, 1F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 14); // Box 16
		bodyModel[15].setRotationPoint(4.5F, -9F, 1F);

		this.flipAll();
	}
}
