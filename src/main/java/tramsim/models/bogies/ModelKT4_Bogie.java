//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.04.2018 - 11:41:04
// Last changed on: 22.04.2018 - 11:41:04

package tramsim.models.bogies; //Path where the model is located

import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelKT4_Bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelKT4_Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[40];

		initbodyModel_1();
	}
	public void initbodyModel_1(){
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 39

		bodyModel[0].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-9F, 2F, 4F);

		bodyModel[1].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(3F, 2F, 4F);

		bodyModel[2].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 2
		bodyModel[2].setRotationPoint(-9F, 2F, -4F);

		bodyModel[3].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 3
		bodyModel[3].setRotationPoint(3F, 2F, -4F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-7F, 4F, 4F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 5
		bodyModel[5].setRotationPoint(5F, 4F, 4F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 6
		bodyModel[6].setRotationPoint(5F, 4F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 7
		bodyModel[7].setRotationPoint(-7F, 4F, -5F);

		bodyModel[8].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 8
		bodyModel[8].setRotationPoint(-4F, 6F, 4F);

		bodyModel[9].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 9
		bodyModel[9].setRotationPoint(-4F, 6F, -5F);

		bodyModel[10].addBox(0F, 0F, 0F, 7, 3, 4, 0F); // Box 10
		bodyModel[10].setRotationPoint(-3F, 4F, -2F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 11
		bodyModel[11].setRotationPoint(-1F, 2F, -5F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 12
		bodyModel[12].setRotationPoint(-1F, 2F, 2F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 13
		bodyModel[13].setRotationPoint(0F, 2.2F, 5F);
		bodyModel[13].rotateAngleX = 0.2443461F;

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 14
		bodyModel[14].setRotationPoint(-1F, 2F, 5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 15
		bodyModel[15].setRotationPoint(1F, 2F, 5F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 16
		bodyModel[16].setRotationPoint(-1F, 6F, 5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 17
		bodyModel[17].setRotationPoint(-1F, 6F, 6F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 18
		bodyModel[18].setRotationPoint(1F, 6F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(2F, 2F, 4F);
		bodyModel[19].rotateAngleZ = -0.2268928F;

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 20
		bodyModel[20].setRotationPoint(6F, 3F, 4F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 21
		bodyModel[21].setRotationPoint(1F, 2F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 22
		bodyModel[22].setRotationPoint(-1F, 2F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 23
		bodyModel[23].setRotationPoint(-1F, 6F, -6F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 24
		bodyModel[24].setRotationPoint(-1F, 6F, -7F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 25
		bodyModel[25].setRotationPoint(1F, 6F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 26
		bodyModel[26].setRotationPoint(-6F, 3F, -5F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 27
		bodyModel[27].setRotationPoint(0F, 2F, -6F);
		bodyModel[27].rotateAngleX = -0.2443461F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(-1F, 3F, -5F);
		bodyModel[28].rotateAngleZ = 3.36848546F;

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 29
		bodyModel[29].setRotationPoint(-6F, 5F, -4F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 30
		bodyModel[30].setRotationPoint(6F, 5F, -4F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 31
		bodyModel[31].setRotationPoint(-1F, 1F, -2F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 32
		bodyModel[32].setRotationPoint(-7F, 4F, -1F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 33
		bodyModel[33].setRotationPoint(5F, 4F, -2F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
		bodyModel[34].setRotationPoint(-4F, 5F, 0F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 35
		bodyModel[35].setRotationPoint(4F, 5F, -1F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 36
		bodyModel[36].setRotationPoint(-1F, 6F, -5F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 37
		bodyModel[37].setRotationPoint(-1F, 6F, 2F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 38
		bodyModel[38].setRotationPoint(0.5F, 4F, 2F);
		bodyModel[38].rotateAngleY = 0.78539816F;

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 39
		bodyModel[39].setRotationPoint(0.5F, 4F, -5F);
		bodyModel[39].rotateAngleY = 0.78539816F;


		this.flipAll();
	}
}