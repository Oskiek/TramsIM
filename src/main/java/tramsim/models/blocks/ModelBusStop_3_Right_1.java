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


public class ModelBusStop_3_Right_1 extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBusStop_3_Right_1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[19];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 8
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 20
		bodyModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 21
		bodyModel[7] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 22
		bodyModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23
		bodyModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 24
		bodyModel[10] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 71, 49, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 19

		bodyModel[0].addBox(0F, 0F, 0F, 1, 29, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -29F, 0F);

		bodyModel[1].addBox(0F, 0F, 0F, 12, 23, 0, 0F); // Box 8
		bodyModel[1].setRotationPoint(1F, -28F, 0.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 29, 1, 0F); // Box 17
		bodyModel[2].setRotationPoint(13F, -29F, 15F);

		bodyModel[3].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 18
		bodyModel[3].setRotationPoint(1F, -29F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 29, 1, 0F); // Box 19
		bodyModel[4].setRotationPoint(13F, -29F, 0F);

		bodyModel[5].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 20
		bodyModel[5].setRotationPoint(1F, -5F, 0F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 23, 14, 0F); // Box 21
		bodyModel[6].setRotationPoint(13.5F, -28F, 1F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 22
		bodyModel[7].setRotationPoint(13F, -5F, 1F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 23
		bodyModel[8].setRotationPoint(13F, -29F, 1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[9].setRotationPoint(0F, -31F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[10].setRotationPoint(1F, -33F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[11].setRotationPoint(0F, -31F, 1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[12].setRotationPoint(13F, -31F, 1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 16, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(4F, -34F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(1F, -33F, 1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(12F, -33F, 1F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 17
		bodyModel[16].setRotationPoint(10F, -7F, 5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(8.5F, -8F, 4F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 19
		bodyModel[18].setRotationPoint(10F, -7F, 15F);

	}
}