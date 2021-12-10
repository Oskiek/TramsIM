
package tramsim.models.wagons; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class DuewagPT8_Middle extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public DuewagPT8_Middle() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[108];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 3, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		bodyModel[5] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 73
		bodyModel[6] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 74
		bodyModel[7] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 75
		bodyModel[8] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 76
		bodyModel[9] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 86
		bodyModel[10] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 94
		bodyModel[11] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 97
		bodyModel[12] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 98
		bodyModel[13] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 99
		bodyModel[14] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 100
		bodyModel[15] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 101
		bodyModel[16] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 80
		bodyModel[17] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 81
		bodyModel[18] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 82
		bodyModel[19] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 83
		bodyModel[20] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 92
		bodyModel[21] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 93
		bodyModel[22] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 98
		bodyModel[23] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 101
		bodyModel[24] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 103
		bodyModel[25] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 104
		bodyModel[26] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 105
		bodyModel[27] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 106
		bodyModel[28] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 107
		bodyModel[29] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 110
		bodyModel[30] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 112
		bodyModel[31] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 113
		bodyModel[32] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 114
		bodyModel[33] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 115
		bodyModel[34] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 116
		bodyModel[35] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 117
		bodyModel[36] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 118
		bodyModel[37] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 119
		bodyModel[38] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 120
		bodyModel[39] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 121
		bodyModel[40] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 122
		bodyModel[41] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 123
		bodyModel[42] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 124
		bodyModel[43] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 125
		bodyModel[44] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 129
		bodyModel[46] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 130
		bodyModel[47] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 58
		bodyModel[48] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 93
		bodyModel[49] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 92
		bodyModel[50] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 61
		bodyModel[51] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 62
		bodyModel[52] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 64
		bodyModel[54] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 65
		bodyModel[55] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 66
		bodyModel[56] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 67
		bodyModel[57] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 68
		bodyModel[58] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 69
		bodyModel[59] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 70
		bodyModel[60] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 71
		bodyModel[61] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 99
		bodyModel[62] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 73
		bodyModel[63] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 74
		bodyModel[64] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 75
		bodyModel[65] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 76
		bodyModel[66] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 104
		bodyModel[67] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 78
		bodyModel[68] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 80
		bodyModel[70] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 81
		bodyModel[71] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 82
		bodyModel[72] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 83
		bodyModel[73] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 84
		bodyModel[74] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 144
		bodyModel[75] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 86
		bodyModel[76] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 87
		bodyModel[77] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 88
		bodyModel[78] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 89
		bodyModel[79] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 90
		bodyModel[80] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 91
		bodyModel[81] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 92
		bodyModel[82] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 97
		bodyModel[83] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 98
		bodyModel[84] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 99
		bodyModel[85] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 104
		bodyModel[86] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 105
		bodyModel[87] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 106
		bodyModel[88] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 107
		bodyModel[89] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 108
		bodyModel[90] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 109
		bodyModel[91] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 110
		bodyModel[92] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 112
		bodyModel[93] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 113
		bodyModel[94] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 114
		bodyModel[95] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 115
		bodyModel[96] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 121
		bodyModel[97] = new ModelRendererTurbo(this, 32, 57, textureX, textureY); // Box 163
		bodyModel[98] = new ModelRendererTurbo(this, 32, 57, textureX, textureY); // Box 165
		bodyModel[99] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 166
		bodyModel[100] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 167
		bodyModel[101] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 109
		bodyModel[102] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 110
		bodyModel[103] = new ModelRendererTurbo(this, 32, 57, textureX, textureY); // Box 111
		bodyModel[104] = new ModelRendererTurbo(this, 308, 63, textureX, textureY); // Box 100
		bodyModel[105] = new ModelRendererTurbo(this, 316, 63, textureX, textureY); // Box 101
		bodyModel[106] = new ModelRendererTurbo(this, 316, 63, textureX, textureY); // Box 102
		bodyModel[107] = new ModelRendererTurbo(this, 308, 63, textureX, textureY); // Box 103

		bodyModel[0].addBox(0F, 0F, 0F, 51, 1, 18, 0F); // Box 0
		bodyModel[0].setRotationPoint(-25F, 2F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 53, 6, 1, 0F); // Box 6
		bodyModel[1].setRotationPoint(-26F, -4F, -9F);

		bodyModel[2].addBox(0F, 0F, 0F, 53, 6, 1, 0F); // Box 7
		bodyModel[2].setRotationPoint(-26F, -4F, 8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 49, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[3].setRotationPoint(-24F, -16F, -9F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 21
		bodyModel[4].setRotationPoint(-26F, -13F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 49, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[5].setRotationPoint(-24F, -16F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 53, 1, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[6].setRotationPoint(-26F, -17F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 53, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[7].setRotationPoint(-26F, -17F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 53, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[8].setRotationPoint(-26F, -17F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 86
		bodyModel[9].setRotationPoint(-26F, -13F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 94
		bodyModel[10].setRotationPoint(24F, -13F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 97
		bodyModel[11].setRotationPoint(25F, -16F, 8F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 98
		bodyModel[12].setRotationPoint(25F, -16F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 18, 3, 0F); // Box 99
		bodyModel[13].setRotationPoint(25F, -16F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 18, 3, 0F); // Box 100
		bodyModel[14].setRotationPoint(25F, -16F, 5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Box 101
		bodyModel[15].setRotationPoint(25F, -16F, -5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 18, 3, 0F); // Box 80
		bodyModel[16].setRotationPoint(-25F, -16F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 18, 3, 0F); // Box 81
		bodyModel[17].setRotationPoint(-25F, -16F, 5F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 82
		bodyModel[18].setRotationPoint(-26F, -16F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 83
		bodyModel[19].setRotationPoint(-26F, -16F, 8F);

		bodyModel[20].addBox(0F, 0F, 0F, 11, 9, 0, 0F); // Box 92
		bodyModel[20].setRotationPoint(13F, -13F, 9F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 93
		bodyModel[21].setRotationPoint(24F, -13F, -9F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 98
		bodyModel[22].setRotationPoint(-12F, -13F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 101
		bodyModel[23].setRotationPoint(12F, -13F, 8F);

		bodyModel[24].addBox(0F, 0F, 0F, 8, 2, 5, 0F); // Box 103
		bodyModel[24].setRotationPoint(-17F, -18.5F, -2.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 9, 3, 5, 0F); // Box 104
		bodyModel[25].setRotationPoint(-8F, -19.5F, -2.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 105
		bodyModel[26].setRotationPoint(1F, -17.5F, -1.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 18, 1, 9, 0F); // Box 106
		bodyModel[27].setRotationPoint(5F, -17.5F, -4.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 10, 1, 7, 0F); // Box 107
		bodyModel[28].setRotationPoint(8F, -18.5F, -3.5F);

		bodyModel[29].addShapeBox(0F, 0F, -1F, 1, 9, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[29].setRotationPoint(12F, -18.5F, 3F);
		bodyModel[29].rotateAngleZ = -2.0943951F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 112
		bodyModel[30].setRotationPoint(4F, -22.5F, -3F);
		bodyModel[30].rotateAngleZ = 2.0943951F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 113
		bodyModel[31].setRotationPoint(12F, -18.5F, -3F);
		bodyModel[31].rotateAngleZ = -2.0943951F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[32].setRotationPoint(4F, -22.5F, 2F);
		bodyModel[32].rotateAngleZ = 2.0943951F;

		bodyModel[33].addShapeBox(0F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 115
		bodyModel[33].setRotationPoint(12F, -18.5F, -3F);
		bodyModel[33].rotateAngleY = -3.14159265F;
		bodyModel[33].rotateAngleZ = -2.0943951F;

		bodyModel[34].addShapeBox(0F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[34].setRotationPoint(12F, -18.5F, 3F);
		bodyModel[34].rotateAngleY = -3.14159265F;
		bodyModel[34].rotateAngleZ = -2.0943951F;

		bodyModel[35].addShapeBox(0F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 117
		bodyModel[35].setRotationPoint(20F, -22.5F, -3F);
		bodyModel[35].rotateAngleY = -3.14159265F;
		bodyModel[35].rotateAngleZ = 2.0943951F;

		bodyModel[36].addShapeBox(0F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[36].setRotationPoint(20F, -22.5F, 3F);
		bodyModel[36].rotateAngleY = -3.14159265F;
		bodyModel[36].rotateAngleZ = 2.0943951F;

		bodyModel[37].addShapeBox(-1F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
		bodyModel[37].setRotationPoint(12F, -27.5F, -4.5F);

		bodyModel[38].addShapeBox(0.5F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[38].setRotationPoint(12F, -27.5F, -4.5F);

		bodyModel[39].addShapeBox(-0.5F, 0F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 121
		bodyModel[39].setRotationPoint(12F, -27.5F, -4.5F);

		bodyModel[40].addShapeBox(-0.5F, 0F, 7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 122
		bodyModel[40].setRotationPoint(12F, -27.5F, -4.5F);

		bodyModel[41].addShapeBox(-1F, 0F, -1F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[41].setRotationPoint(12F, -27.5F, -4.5F);

		bodyModel[42].addShapeBox(-1F, 0F, 9F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[42].setRotationPoint(12F, -27.5F, -4.5F);

		bodyModel[43].addShapeBox(0F, 0F, 1F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 125
		bodyModel[43].setRotationPoint(4F, -22.5F, -3.5F);
		bodyModel[43].rotateAngleZ = 2.0943951F;

		bodyModel[44].addShapeBox(0F, 0F, -5.5F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[44].setRotationPoint(20F, -22.5F, -3F);
		bodyModel[44].rotateAngleY = -3.14159265F;
		bodyModel[44].rotateAngleZ = 2.0943951F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, 5F, 0F, 0F, 5F); // Box 129
		bodyModel[45].setRotationPoint(4F, -22.5F, -3F);
		bodyModel[45].rotateAngleZ = 2.0943951F;

		bodyModel[46].addShapeBox(0F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 5.5F, -0.5F, 0F, 5.5F, -0.5F, 0F, -6F, 0F, 0F, -6F); // Box 130
		bodyModel[46].setRotationPoint(20F, -22.5F, -3F);
		bodyModel[46].rotateAngleY = -3.14159265F;
		bodyModel[46].rotateAngleZ = 2.0943951F;

		bodyModel[47].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Box 58
		bodyModel[47].setRotationPoint(-25F, -16F, -5F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 93
		bodyModel[48].setRotationPoint(9F, -2F, -8F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 92
		bodyModel[49].setRotationPoint(12F, -5F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 61
		bodyModel[50].setRotationPoint(13F, -2F, -8F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 62
		bodyModel[51].setRotationPoint(21F, -2F, -8F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 63
		bodyModel[52].setRotationPoint(24F, -5F, -8F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 64
		bodyModel[53].setRotationPoint(0F, -5F, -8F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 65
		bodyModel[54].setRotationPoint(-12F, -5F, -8F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 66
		bodyModel[55].setRotationPoint(-24F, -5F, -8F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 67
		bodyModel[56].setRotationPoint(1F, -2F, -8F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 68
		bodyModel[57].setRotationPoint(-3F, -2F, -8F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 69
		bodyModel[58].setRotationPoint(-11F, -2F, -8F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 70
		bodyModel[59].setRotationPoint(-15F, -2F, -8F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 71
		bodyModel[60].setRotationPoint(-23F, -2F, -8F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 99
		bodyModel[61].setRotationPoint(12F, -5F, 4F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 73
		bodyModel[62].setRotationPoint(24F, -5F, 4F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 74
		bodyModel[63].setRotationPoint(0F, -5F, 4F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 75
		bodyModel[64].setRotationPoint(-12F, -5F, 4F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 76
		bodyModel[65].setRotationPoint(-24F, -5F, 4F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 104
		bodyModel[66].setRotationPoint(9F, -2F, 4F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 78
		bodyModel[67].setRotationPoint(1F, -2F, 4F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 79
		bodyModel[68].setRotationPoint(-3F, -2F, 4F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 80
		bodyModel[69].setRotationPoint(-11F, -2F, 4F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 81
		bodyModel[70].setRotationPoint(-15F, -2F, 4F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 82
		bodyModel[71].setRotationPoint(-23F, -2F, 4F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 83
		bodyModel[72].setRotationPoint(13F, -2F, 4F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 84
		bodyModel[73].setRotationPoint(21F, -2F, 4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 144
		bodyModel[74].setRotationPoint(6F, -3.8F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 86
		bodyModel[75].setRotationPoint(-6F, -3.8F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 87
		bodyModel[76].setRotationPoint(-18F, -3.8F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 88
		bodyModel[77].setRotationPoint(18F, -3.8F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[78].setRotationPoint(18F, -3.8F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[79].setRotationPoint(6F, -3.8F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[80].setRotationPoint(-6F, -3.8F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[81].setRotationPoint(-18F, -3.8F, -8F);

		bodyModel[82].addBox(0F, 0F, 0F, 31, 1, 2, 0F); // Box 97
		bodyModel[82].setRotationPoint(-8F, -17.5F, 4.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 31, 1, 2, 0F); // Box 98
		bodyModel[83].setRotationPoint(-8F, -17.5F, -6.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 51, 2, 18, 0F); // Box 99
		bodyModel[84].setRotationPoint(-25F, 3F, -9F);

		bodyModel[85].addBox(0F, 0F, 0F, 11, 9, 0, 0F); // Box 104
		bodyModel[85].setRotationPoint(1F, -13F, 9F);

		bodyModel[86].addBox(0F, 0F, 0F, 11, 9, 0, 0F); // Box 105
		bodyModel[86].setRotationPoint(-23F, -13F, 9F);

		bodyModel[87].addBox(0F, 0F, 0F, 11, 9, 0, 0F); // Box 106
		bodyModel[87].setRotationPoint(-11F, -13F, 9F);

		bodyModel[88].addBox(0F, 0F, 0F, 11, 9, 0, 0F); // Box 107
		bodyModel[88].setRotationPoint(13F, -13F, -9F);

		bodyModel[89].addBox(0F, 0F, 0F, 11, 9, 0, 0F); // Box 108
		bodyModel[89].setRotationPoint(1F, -13F, -9F);

		bodyModel[90].addBox(0F, 0F, 0F, 11, 9, 0, 0F); // Box 109
		bodyModel[90].setRotationPoint(-11F, -13F, -9F);

		bodyModel[91].addBox(0F, 0F, 0F, 11, 9, 0, 0F); // Box 110
		bodyModel[91].setRotationPoint(-23F, -13F, -9F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 112
		bodyModel[92].setRotationPoint(0F, -13F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 113
		bodyModel[93].setRotationPoint(12F, -13F, -9F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 114
		bodyModel[94].setRotationPoint(0F, -13F, 8F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 115
		bodyModel[95].setRotationPoint(-12F, -13F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 121
		bodyModel[96].setRotationPoint(1F, -16F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F); // Box 163
		bodyModel[97].setRotationPoint(-7.5F, -14F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F); // Box 165
		bodyModel[98].setRotationPoint(2.5F, -14F, -3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 166
		bodyModel[99].setRotationPoint(-9F, -16F, -3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 167
		bodyModel[100].setRotationPoint(12F, -16F, -3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 109
		bodyModel[101].setRotationPoint(0F, -16F, -3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 110
		bodyModel[102].setRotationPoint(-12F, -16F, -3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F); // Box 111
		bodyModel[103].setRotationPoint(-10.5F, -14F, -3F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 100
		bodyModel[104].setRotationPoint(-26F, 2F, 8F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 101
		bodyModel[105].setRotationPoint(-26F, 2F, -9F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 102
		bodyModel[106].setRotationPoint(26F, 2F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 103
		bodyModel[107].setRotationPoint(26F, 2F, 8F);

		this.flipAll();
	}
}