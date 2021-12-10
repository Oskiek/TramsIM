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
		bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, " wheel "); // Import Box1
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box4
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box5
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box6
		bodyModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box7
		bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box8
		bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box9
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box10
		bodyModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box11
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box12
		bodyModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box13
		bodyModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box14
		bodyModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box15
		bodyModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box16
		bodyModel[14] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box17
		bodyModel[15] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box18
		bodyModel[16] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box19
		bodyModel[17] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box20
		bodyModel[18] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box21
		bodyModel[19] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box22
		bodyModel[20] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box23
		bodyModel[21] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box24
		bodyModel[22] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box25
		bodyModel[23] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box26
		bodyModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box27
		bodyModel[25] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box28
		bodyModel[26] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box29
		bodyModel[27] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box30
		bodyModel[28] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box31
		bodyModel[29] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box32
		bodyModel[30] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box33
		bodyModel[31] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box34
		bodyModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box35
		bodyModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box36
		bodyModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box37
		bodyModel[35] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box38
		bodyModel[36] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box39
		bodyModel[37] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, " wheel "); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, " wheel "); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, " wheel "); // Box 42

		bodyModel[0].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Import Box1
		bodyModel[0].setRotationPoint(6.5F, 5.5F, 4F).rotateAngleY = -3.14159265F;

		bodyModel[1].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Box4
		bodyModel[1].setRotationPoint(-7F, 4F, 4F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Box5
		bodyModel[2].setRotationPoint(5F, 4F, 4F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Box6
		bodyModel[3].setRotationPoint(5F, 4F, -5F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Box7
		bodyModel[4].setRotationPoint(-7F, 4F, -5F);

		bodyModel[5].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import Box8
		bodyModel[5].setRotationPoint(-4F, 6F, 4F);

		bodyModel[6].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import Box9
		bodyModel[6].setRotationPoint(-4F, 6F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 7, 3, 4, 0F); // Import Box10
		bodyModel[7].setRotationPoint(-3F, 4F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Import Box11
		bodyModel[8].setRotationPoint(-1F, 2F, -5F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Import Box12
		bodyModel[9].setRotationPoint(-1F, 2F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box13
		bodyModel[10].setRotationPoint(0F, 2.2F, 5F);
		bodyModel[10].rotateAngleX = 0.2443461F;

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box14
		bodyModel[11].setRotationPoint(-1F, 2F, 5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box15
		bodyModel[12].setRotationPoint(1F, 2F, 5F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box16
		bodyModel[13].setRotationPoint(-1F, 6F, 5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box17
		bodyModel[14].setRotationPoint(-1F, 6F, 6F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box18
		bodyModel[15].setRotationPoint(1F, 6F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[16].setRotationPoint(2F, 2F, 4F);
		bodyModel[16].rotateAngleZ = -0.2268928F;

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box20
		bodyModel[17].setRotationPoint(6F, 3F, 4F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box21
		bodyModel[18].setRotationPoint(1F, 2F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box22
		bodyModel[19].setRotationPoint(-1F, 2F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box23
		bodyModel[20].setRotationPoint(-1F, 6F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box24
		bodyModel[21].setRotationPoint(-1F, 6F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box25
		bodyModel[22].setRotationPoint(1F, 6F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box26
		bodyModel[23].setRotationPoint(-6F, 3F, -5F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box27
		bodyModel[24].setRotationPoint(0F, 2F, -6F);
		bodyModel[24].rotateAngleX = -0.2443461F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F); // Import Box28
		bodyModel[25].setRotationPoint(-1F, 3F, -5F);
		bodyModel[25].rotateAngleZ = 3.36848546F;

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Box29
		bodyModel[26].setRotationPoint(-6F, 5F, -4F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Box30
		bodyModel[27].setRotationPoint(6F, 5F, -4F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Import Box31
		bodyModel[28].setRotationPoint(-1F, 1F, -2F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Import Box32
		bodyModel[29].setRotationPoint(-7F, 4F, -1F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Import Box33
		bodyModel[30].setRotationPoint(5F, 4F, -2F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box34
		bodyModel[31].setRotationPoint(-4F, 5F, 0F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box35
		bodyModel[32].setRotationPoint(4F, 5F, -1F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Import Box36
		bodyModel[33].setRotationPoint(-1F, 6F, -5F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Import Box37
		bodyModel[34].setRotationPoint(-1F, 6F, 2F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box38
		bodyModel[35].setRotationPoint(0.5F, 4F, 2F);
		bodyModel[35].rotateAngleY = 0.78539816F;

		bodyModel[36].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box39
		bodyModel[36].setRotationPoint(0.5F, 4F, -5F);
		bodyModel[36].rotateAngleY = 0.78539816F;

		bodyModel[37].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 40
		bodyModel[37].setRotationPoint(-5.5F, 5.5F, 4F).rotateAngleY = -3.14159265F;;

		bodyModel[38].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 41
		bodyModel[38].setRotationPoint(-5.5F, 5.5F, -4F).rotateAngleY = -3.14159265F;;

		bodyModel[39].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 42
		bodyModel[39].setRotationPoint(6.5F, 5.5F, -4F).rotateAngleY = -3.14159265F;;

		this.flipAll();
	}
}