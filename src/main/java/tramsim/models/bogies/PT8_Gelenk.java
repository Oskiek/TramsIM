//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.02.2019 - 20:21:56
// Last changed on: 25.02.2019 - 20:21:56

package tramsim.models.bogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class PT8_Gelenk extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public PT8_Gelenk() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[30];

		initbodyModel_1();

	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 29

		bodyModel[0].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -15F, 7F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 1, 10, 0F); // Box 1
		bodyModel[1].setRotationPoint(-1F, 2F, -5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 3
		bodyModel[2].setRotationPoint(0F, -15F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
		bodyModel[3].setRotationPoint(0F, -16F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 15, 1, 0F); // Box 5
		bodyModel[4].setRotationPoint(0F, -13F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 15, 1, 0F); // Box 6
		bodyModel[5].setRotationPoint(0F, -13F, 5F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 1, 10, 0F); // Box 7
		bodyModel[6].setRotationPoint(-1F, -14F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 8
		bodyModel[7].setRotationPoint(2F, 0F, 6F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 9
		bodyModel[8].setRotationPoint(2F, -6F, 6F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 10
		bodyModel[9].setRotationPoint(2F, -12F, 6F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 11
		bodyModel[10].setRotationPoint(2F, -12F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 12
		bodyModel[11].setRotationPoint(2F, -6F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 13
		bodyModel[12].setRotationPoint(2F, 0F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(4F, -13F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(4F, -13F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,1F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-1F, -13F, 5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.2F); // Box 17
		bodyModel[16].setRotationPoint(-1F, -13F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 18
		bodyModel[17].setRotationPoint(1F, 3F, -1F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 19
		bodyModel[18].setRotationPoint(1F, 4F, -3F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 20
		bodyModel[19].setRotationPoint(-1F, 4F, -4F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 21
		bodyModel[20].setRotationPoint(-7F, 3F, -4F);

		bodyModel[21].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 22
		bodyModel[21].setRotationPoint(-1F, 4F, 3F);

		bodyModel[22].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
		bodyModel[22].setRotationPoint(-7F, 3F, 4F);

		bodyModel[23].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 24
		bodyModel[23].setRotationPoint(6F, 3F, 4F);

		bodyModel[24].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 25
		bodyModel[24].setRotationPoint(6F, 3F, -4F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
		bodyModel[25].setRotationPoint(8F, 5F, -6F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
		bodyModel[26].setRotationPoint(-5F, 5F, -6F);

		bodyModel[27].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 28
		bodyModel[27].setRotationPoint(-7F, 6F, 5F);

		bodyModel[28].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 29
		bodyModel[28].setRotationPoint(-7F, 6F, -6F);

		bodyModel[29].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 29
		bodyModel[29].setRotationPoint(-5F, 5F, -1F);
	}
}