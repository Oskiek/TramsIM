
package metroim.models.trains; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BVG_G extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public BVG_G() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[102];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 39
		bodyModel[28] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 58
		bodyModel[46] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 58
		bodyModel[51] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 59
		bodyModel[52] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 60
		bodyModel[53] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 62
		bodyModel[55] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 64
		bodyModel[57] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 65
		bodyModel[58] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 66
		bodyModel[59] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 67
		bodyModel[60] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 68
		bodyModel[61] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 69
		bodyModel[62] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 70
		bodyModel[63] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 71
		bodyModel[64] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 72
		bodyModel[65] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 73
		bodyModel[66] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 74
		bodyModel[67] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 75
		bodyModel[68] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 76
		bodyModel[69] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 77
		bodyModel[70] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 78
		bodyModel[71] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 79
		bodyModel[72] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 80
		bodyModel[73] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 81
		bodyModel[74] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 82
		bodyModel[75] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 83
		bodyModel[76] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 84
		bodyModel[77] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 85
		bodyModel[78] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 86
		bodyModel[79] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 87
		bodyModel[80] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 88
		bodyModel[81] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 89
		bodyModel[82] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 90
		bodyModel[83] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 91
		bodyModel[84] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 92
		bodyModel[85] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 93
		bodyModel[86] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 94
		bodyModel[87] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 95
		bodyModel[88] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 96
		bodyModel[89] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 97
		bodyModel[90] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 98
		bodyModel[91] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 99
		bodyModel[92] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 100
		bodyModel[93] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 101
		bodyModel[94] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 102
		bodyModel[95] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 103
		bodyModel[96] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 104
		bodyModel[97] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 105
		bodyModel[98] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 106
		bodyModel[99] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 107
		bodyModel[100] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 109
		bodyModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 142

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 10, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, -7F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 1
		bodyModel[1].setRotationPoint(-33F, -19F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 10, 21, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(-33F, -19F, 9F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 21, 18, 0F); // Box 3
		bodyModel[3].setRotationPoint(-24F, -19F, -9F);

		bodyModel[4].addBox(0F, 0F, 0F, 65, 1, 20, 0F); // Box 4
		bodyModel[4].setRotationPoint(-33F, 2F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 27, 21, 1, 0F); // Box 5
		bodyModel[5].setRotationPoint(-13F, -19F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 18, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-23F, -16F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-23F, -19F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 27, 21, 1, 0F); // Box 12
		bodyModel[8].setRotationPoint(-13F, -19F, 9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[9].setRotationPoint(-23F, -19F, 9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 18, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[10].setRotationPoint(19F, -16F, 9.5F);

		bodyModel[11].addBox(0F, -4F, 0F, 25, 5, 1, 0F); // Box 19
		bodyModel[11].setRotationPoint(-12F, -3F, -9F);
		bodyModel[11].rotateAngleX = 0.06981317F;

		bodyModel[12].addBox(0F, 0F, 0F, 25, 1, 3, 0F); // Box 20
		bodyModel[12].setRotationPoint(-12F, -3F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 8, 21, 1, 0F); // Box 21
		bodyModel[13].setRotationPoint(24F, -19F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 8, 21, 1, 0F); // Box 22
		bodyModel[14].setRotationPoint(24F, -19F, 9F);

		bodyModel[15].addBox(0F, 0F, -3F, 25, 1, 3, 0F); // Box 23
		bodyModel[15].setRotationPoint(-12F, -3F, 8F);

		bodyModel[16].addBox(0F, 0F, 0F, 25, 5, 1, 0F); // Box 24
		bodyModel[16].setRotationPoint(-12F, -7F, 8.3F);
		bodyModel[16].rotateAngleX = -0.06981317F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 25, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25
		bodyModel[17].setRotationPoint(-12F, -2F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 25, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[18].setRotationPoint(-12F, -2F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[19].setRotationPoint(25F, -2F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 28
		bodyModel[20].setRotationPoint(25F, -3F, -8F);

		bodyModel[21].addBox(0F, -4F, 0F, 7, 5, 1, 0F); // Box 29
		bodyModel[21].setRotationPoint(25F, -3F, -9F);
		bodyModel[21].rotateAngleX = 0.06981317F;

		bodyModel[22].addBox(0F, 0F, -3F, 7, 1, 3, 0F); // Box 30
		bodyModel[22].setRotationPoint(25F, -3F, 8F);

		bodyModel[23].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 31
		bodyModel[23].setRotationPoint(25F, -7F, 8.3F);
		bodyModel[23].rotateAngleX = -0.06981317F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[24].setRotationPoint(25F, -2F, 5F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 22, 20, 0F); // Box 33
		bodyModel[25].setRotationPoint(32F, -19F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(-35F, -5.5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 39
		bodyModel[27].setRotationPoint(-35F, -3.5F, -8F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 40
		bodyModel[28].setRotationPoint(-34F, -19F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 41
		bodyModel[29].setRotationPoint(-34F, -17F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 42
		bodyModel[30].setRotationPoint(-34F, -17F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[31].setRotationPoint(-34F, -7.5F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[32].setRotationPoint(-34F, -7.5F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[33].setRotationPoint(-34F, -17F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 46
		bodyModel[34].setRotationPoint(-34F, -17F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 47
		bodyModel[35].setRotationPoint(-35F, -5.5F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 48
		bodyModel[36].setRotationPoint(-35F, -3.5F, 5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.8F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 1F, 0F, -0.8F, 1F, 0F, -0.8F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F); // Box 50
		bodyModel[37].setRotationPoint(-35F, -3.5F, -6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.8F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, -1.5F, -0.8F, 1.5F, -1.5F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, -0.8F, 0F, -1.5F); // Box 51
		bodyModel[38].setRotationPoint(-35F, -3.5F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.8F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, -1.5F, -0.8F, 1.5F, -1.5F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, -0.8F, 0F, -1.5F); // Box 52
		bodyModel[39].setRotationPoint(-35F, -3.5F, 4.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.8F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 1F, 0F, -0.8F, 1F, 0F, -0.8F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F); // Box 53
		bodyModel[40].setRotationPoint(-35F, -3.5F, 6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 55, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 54
		bodyModel[41].setRotationPoint(-23F, -19F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 55, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 55
		bodyModel[42].setRotationPoint(-23F, -19F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 55, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 56
		bodyModel[43].setRotationPoint(-23F, -19F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 55, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[44].setRotationPoint(-23F, -19F, 2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 67, 1, 20, 0F,-0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[45].setRotationPoint(-34F, -20F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[46].setRotationPoint(-12.5F, -19F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[47].setRotationPoint(-4F, -19F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[48].setRotationPoint(5F, -19F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[49].setRotationPoint(13F, -19F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[50].setRotationPoint(13F, -19F, 4.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[51].setRotationPoint(-4F, -19F, 4.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[52].setRotationPoint(5F, -19F, 4.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[53].setRotationPoint(-12.5F, -19F, 4.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[54].setRotationPoint(24.5F, -19F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[55].setRotationPoint(24.5F, -19F, 4.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[56].setRotationPoint(-12.5F, -15F, -6F);
		bodyModel[56].rotateAngleZ = 1.57079633F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[57].setRotationPoint(-12.5F, -15F, 4.5F);
		bodyModel[57].rotateAngleZ = 1.57079633F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[58].setRotationPoint(13.5F, -16F, 4.5F);
		bodyModel[58].rotateAngleZ = 1.57079633F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[59].setRotationPoint(13.5F, -16F, -6F);
		bodyModel[59].rotateAngleZ = 1.57079633F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[60].setRotationPoint(24.5F, -15F, -6F);
		bodyModel[60].rotateAngleZ = 1.57079633F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[61].setRotationPoint(24.5F, -15F, 4.5F);
		bodyModel[61].rotateAngleZ = 1.57079633F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[62].setRotationPoint(-23.5F, -16F, 4.5F);
		bodyModel[62].rotateAngleZ = 1.57079633F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[63].setRotationPoint(-23.5F, -16F, -6F);
		bodyModel[63].rotateAngleZ = 1.57079633F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[64].setRotationPoint(-22.5F, -14F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[65].setRotationPoint(-23F, -14F, -1F);
		bodyModel[65].rotateAngleZ = 1.57079633F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[66].setRotationPoint(-23F, -5.5F, -1F);
		bodyModel[66].rotateAngleZ = 1.57079633F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 62, 2, 8, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 75
		bodyModel[67].setRotationPoint(-29F, -21.25F, -4F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 76
		bodyModel[68].setRotationPoint(-34F, 3F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 77
		bodyModel[69].setRotationPoint(-34F, 3F, 4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 78
		bodyModel[70].setRotationPoint(-34F, 3F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 18, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[71].setRotationPoint(-32F, -16F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[72].setRotationPoint(-32F, -19F, -10F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 21, 1, 0F); // Box 81
		bodyModel[73].setRotationPoint(-27F, -19F, -10F);

		bodyModel[74].addBox(0F, 0F, 0F, 66, 1, 1, 0F); // Box 82
		bodyModel[74].setRotationPoint(-33F, 3F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 66, 1, 1, 0F); // Box 83
		bodyModel[75].setRotationPoint(-33F, 3F, 9F);

		bodyModel[76].addBox(0F, 0F, 0F, 16, 5, 5, 0F); // Box 84
		bodyModel[76].setRotationPoint(-11F, 3F, -9F);

		bodyModel[77].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 85
		bodyModel[77].setRotationPoint(6F, 3F, -9F);

		bodyModel[78].addBox(0F, 0F, 0F, 16, 5, 5, 0F); // Box 86
		bodyModel[78].setRotationPoint(-4F, 3F, 4F);

		bodyModel[79].addBox(0F, 0F, 0F, 6, 5, 5, 0F); // Box 87
		bodyModel[79].setRotationPoint(-11F, 3F, 4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88
		bodyModel[80].setRotationPoint(-34F, -17F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 10, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 89
		bodyModel[81].setRotationPoint(-33.5F, -17F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[82].setRotationPoint(-23F, 4F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[83].setRotationPoint(14F, 4F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[84].setRotationPoint(14F, 4F, 9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[85].setRotationPoint(-23F, 4F, 9F);

		bodyModel[86].addBox(0F, 0F, 0F, 52, 1, 2, 0F); // Box 94
		bodyModel[86].setRotationPoint(-22F, -19F, -1F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Box 95
		bodyModel[87].setRotationPoint(-33F, -7F, -2F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 96
		bodyModel[88].setRotationPoint(-29F, -4F, 1F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 97
		bodyModel[89].setRotationPoint(-30F, -5F, 0F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 98
		bodyModel[90].setRotationPoint(-26F, -13F, 0F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 99
		bodyModel[91].setRotationPoint(-29F, -9F, 4F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 100
		bodyModel[92].setRotationPoint(-29F, -9F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 101
		bodyModel[93].setRotationPoint(14F, -19F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 18, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[94].setRotationPoint(-18F, -16F, -9.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 18, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[95].setRotationPoint(14F, -16F, -9.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 18, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[96].setRotationPoint(19F, -16F, -9.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 18, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[97].setRotationPoint(14F, -16F, 9.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 18, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[98].setRotationPoint(-18F, -16F, 9.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 18, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[99].setRotationPoint(-23F, -16F, 9.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		bodyModel[100].setRotationPoint(14F, -19F, 9F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 142
		bodyModel[101].setRotationPoint(23F, 4F, 0F);
		this.flipAll();
	}
}