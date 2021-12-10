//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.02.2019 - 20:21:56
// Last changed on: 25.02.2019 - 20:21:56

package tramsim.models.bogies; //Path where the model is located

import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class PT8_Bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public PT8_Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 18
		bodyModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 20
		bodyModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 22
		bodyModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY, " wheel "); // Box 23
		bodyModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 26
		bodyModel[6] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 29
		bodyModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 29
		bodyModel[10] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 30
		bodyModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 31
		bodyModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY, " wheel "); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY, " wheel "); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 265, 1, textureX, textureY, " wheel "); // Box 15

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 18
		bodyModel[0].setRotationPoint(-1F, 3F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 19
		bodyModel[1].setRotationPoint(-1F, 4F, -3F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 20
		bodyModel[2].setRotationPoint(-3F, 4F, -4F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 22
		bodyModel[3].setRotationPoint(-3F, 4F, 3F);

		bodyModel[4].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 23
		bodyModel[4].setRotationPoint(-6.5F, 5.5F, 4F).rotateAngleY = -3.14159265F;;

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
		bodyModel[5].setRotationPoint(6F, 5F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
		bodyModel[6].setRotationPoint(-7F, 5F, -6F);

		bodyModel[7].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 28
		bodyModel[7].setRotationPoint(-9F, 6F, 5F);

		bodyModel[8].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 29
		bodyModel[8].setRotationPoint(-9F, 6F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 29
		bodyModel[9].setRotationPoint(-7F, 5F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 30
		bodyModel[10].setRotationPoint(-8F, 4F, -1F);

		bodyModel[11].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 31
		bodyModel[11].setRotationPoint(2F, 4F, -3F);

		bodyModel[12].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 15
		bodyModel[12].setRotationPoint(-6.5F, 5.5F, -4F).rotateAngleY = -3.14159265F;;

		bodyModel[13].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 23
		bodyModel[13].setRotationPoint(6.5F, 5.5F, 4F).rotateAngleY = -3.14159265F;;

		bodyModel[14].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 15
		bodyModel[14].setRotationPoint(6.5F, 5.5F, -4F).rotateAngleY = -3.14159265F;;


	}
}