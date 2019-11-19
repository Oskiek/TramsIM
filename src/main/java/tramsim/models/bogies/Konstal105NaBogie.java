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

public class Konstal105NaBogie extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

    public Konstal105NaBogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[51];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
    	bodyModel[0] = new ModelRendererTurbo(this, 96, 0, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 96, 0, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 21, 15, textureX, textureY); // Box 10
		bodyModel[3] = new ModelRendererTurbo(this, 61, 1, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 73, 16, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 69, 16, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 61, 3, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 65, 13, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 83, 5, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 69, 9, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 69, 11, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 61, 7, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 61, 5, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 1, 18, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 23, 18, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 37, 1, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 37, 9, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 37, 5, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 9, 13, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 9, 15, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 23, 9, textureX, textureY); // Box 33
		bodyModel[24] = new ModelRendererTurbo(this, 23, 5, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 49, 5, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 21, 13, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 61, 11, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 61, 9, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 73, 13, textureX, textureY); // Box 42
		bodyModel[33] = new ModelRendererTurbo(this, 69, 13, textureX, textureY); // Box 43
		bodyModel[34] = new ModelRendererTurbo(this, 61, 13, textureX, textureY); // Box 44
		bodyModel[35] = new ModelRendererTurbo(this, 77, 5, textureX, textureY); // Box 45
		bodyModel[36] = new ModelRendererTurbo(this, 75, 3, textureX, textureY); // Box 46
		bodyModel[37] = new ModelRendererTurbo(this, 75, 1, textureX, textureY); // Box 47
		bodyModel[38] = new ModelRendererTurbo(this, 69, 7, textureX, textureY); // Box 48
		bodyModel[39] = new ModelRendererTurbo(this, 69, 5, textureX, textureY); // Box 49
		bodyModel[40] = new ModelRendererTurbo(this, 71, 16, textureX, textureY); // Box 50
		bodyModel[41] = new ModelRendererTurbo(this, 97, 16, textureX, textureY); // Box 52
		bodyModel[42] = new ModelRendererTurbo(this, 45, 16, textureX, textureY); // Box 53
		bodyModel[43] = new ModelRendererTurbo(this, 85, 8, textureX, textureY); // Box 54
		bodyModel[44] = new ModelRendererTurbo(this, 81, 8, textureX, textureY); // Box 55
		bodyModel[45] = new ModelRendererTurbo(this, 77, 8, textureX, textureY); // Box 56
		bodyModel[46] = new ModelRendererTurbo(this, 77, 11, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 81, 11, textureX, textureY); // Box 58
		bodyModel[48] = new ModelRendererTurbo(this, 85, 11, textureX, textureY); // Box 59
		bodyModel[49] = new ModelRendererTurbo(this, 96, 0, textureX, textureY); // Box 60
		bodyModel[50] = new ModelRendererTurbo(this, 96, 0, textureX, textureY); // Box 63

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 16, 0, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, 0F, -12F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-7.5F, 1.5F, -7.01F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 16, 0, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, 0F, -12F, 0F); // Box 5
		bodyModel[1].setRotationPoint(3.5F, 1.5F, 5.01F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[2].setRotationPoint(-7F, 3F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 12
		bodyModel[3].setRotationPoint(-3F, 4F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 13
		bodyModel[4].setRotationPoint(-2F, 2F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0.5F, -0.3F, -0.5F, 0.5F, 0.4F, 0.2F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, 0.2F, -0.5F, -0.3F, -0.5F, -0.5F, 0.4F, 0.2F, -0.5F, -0.7F, -0.5F, -0.5F, 0F); // Box 15
		bodyModel[5].setRotationPoint(-2F, 2F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 16
		bodyModel[6].setRotationPoint(-3F, 5F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.8F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, -0.9F, -0.8F, 0F, -0.9F); // Box 17
		bodyModel[7].setRotationPoint(-1F, 0F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // Box 18
		bodyModel[8].setRotationPoint(1F, 2F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[9].setRotationPoint(-7F, 2F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 20
		bodyModel[10].setRotationPoint(-7F, 4F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[11].setRotationPoint(4F, 4F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[12].setRotationPoint(4F, 2F, -7F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 23
		bodyModel[13].setRotationPoint(-6F, 3F, -6F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 24
		bodyModel[14].setRotationPoint(5F, 3F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[15].setRotationPoint(-7F, 2F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 26
		bodyModel[16].setRotationPoint(-7F, 4F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[17].setRotationPoint(-7F, 3F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[18].setRotationPoint(-4F, 3F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[19].setRotationPoint(1F, 2F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 30
		bodyModel[20].setRotationPoint(1F, 4F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[21].setRotationPoint(1F, 3F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[22].setRotationPoint(-1F, 3F, 1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 33
		bodyModel[23].setRotationPoint(-5F, 4F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[24].setRotationPoint(-5F, 3F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[25].setRotationPoint(-5F, 2F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 36
		bodyModel[26].setRotationPoint(4F, 4F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[27].setRotationPoint(4F, 3F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[28].setRotationPoint(4F, 2F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 39
		bodyModel[29].setRotationPoint(-7F, 3F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[30].setRotationPoint(-7F, 4F, 4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[31].setRotationPoint(-7F, 2F, 4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0.5F, -0.7F, -0.5F, 0.5F, 0F, 0.2F, 0.5F, -0.3F, -0.5F, 0.5F, 0.4F, 0.2F, -0.5F, -0.7F, -0.5F, -0.5F, 0F, 0.2F, -0.5F, -0.3F, -0.5F, -0.5F, 0.4F); // Box 42
		bodyModel[32].setRotationPoint(1F, 2F, 4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 43
		bodyModel[33].setRotationPoint(1F, 2F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.2F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.8F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 44
		bodyModel[34].setRotationPoint(0F, 0F, 4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Box 45
		bodyModel[35].setRotationPoint(-3F, 2F, 4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 46
		bodyModel[36].setRotationPoint(-3F, 5F, 4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 47
		bodyModel[37].setRotationPoint(-3F, 4F, 4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 48
		bodyModel[38].setRotationPoint(4F, 4F, 4F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[39].setRotationPoint(4F, 2F, 4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0.5F, 0F, -0.7F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 50
		bodyModel[40].setRotationPoint(0F, 0F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0.5F, 0F, -0.7F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 52
		bodyModel[41].setRotationPoint(3F, 0F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0.5F, 0F, -0.7F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 53
		bodyModel[42].setRotationPoint(-3F, 0F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 54
		bodyModel[43].setRotationPoint(3F, 1F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 55
		bodyModel[44].setRotationPoint(0F, 1F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 56
		bodyModel[45].setRotationPoint(-3F, 1F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 57
		bodyModel[46].setRotationPoint(-3F, 1F, 4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 58
		bodyModel[47].setRotationPoint(0F, 1F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 59
		bodyModel[48].setRotationPoint(3F, 1F, 4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 16, 0, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, 0F, -12F, 0F); // Box 60
		bodyModel[49].setRotationPoint(3.5F, 1.5F, -7.01F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 16, 0, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, 0F, -12F, 0F); // Box 63
		bodyModel[50].setRotationPoint(-7.5F, 1.5F, 5.01F);

		this.flipAll();
	}
}