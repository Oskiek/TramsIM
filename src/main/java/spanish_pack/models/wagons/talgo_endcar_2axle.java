
package spanish_pack.models.wagons; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class talgo_endcar_2axle extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public talgo_endcar_2axle() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[160];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 36
		bodyModel[25] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 38
		bodyModel[27] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 39
		bodyModel[28] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 47
		bodyModel[30] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 48
		bodyModel[31] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 49
		bodyModel[32] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 50
		bodyModel[33] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 57
		bodyModel[36] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 58
		bodyModel[37] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 59
		bodyModel[38] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 67
		bodyModel[39] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 71
		bodyModel[40] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 66
		bodyModel[41] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 67
		bodyModel[42] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 68
		bodyModel[43] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 69
		bodyModel[44] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 71
		bodyModel[45] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 73
		bodyModel[46] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 74
		bodyModel[47] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 84
		bodyModel[48] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 85
		bodyModel[49] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 108
		bodyModel[50] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 70
		bodyModel[52] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 71
		bodyModel[53] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 74
		bodyModel[56] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 75
		bodyModel[57] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 76
		bodyModel[58] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 78
		bodyModel[59] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 79
		bodyModel[60] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 80
		bodyModel[61] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 81
		bodyModel[62] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 82
		bodyModel[63] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 83
		bodyModel[64] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 84
		bodyModel[65] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 85
		bodyModel[66] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 68
		bodyModel[67] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 69
		bodyModel[68] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 71
		bodyModel[70] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 73
		bodyModel[72] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 74
		bodyModel[73] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 104
		bodyModel[74] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 105
		bodyModel[75] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 110
		bodyModel[77] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 111
		bodyModel[78] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 112
		bodyModel[79] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 113
		bodyModel[80] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 114
		bodyModel[81] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 115
		bodyModel[82] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 116
		bodyModel[83] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 117
		bodyModel[84] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 118
		bodyModel[85] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 119
		bodyModel[86] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 120
		bodyModel[87] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 121
		bodyModel[88] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 122
		bodyModel[89] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 123
		bodyModel[90] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 124
		bodyModel[91] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 125
		bodyModel[92] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 126
		bodyModel[93] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 127
		bodyModel[94] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 129
		bodyModel[96] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 130
		bodyModel[97] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 131
		bodyModel[98] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 132
		bodyModel[99] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 133
		bodyModel[100] = new ModelRendererTurbo(this, 0, 86, textureX, textureY); // Box 132
		bodyModel[101] = new ModelRendererTurbo(this, 0, 82, textureX, textureY); // Box 134
		bodyModel[102] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); // Box 135
		bodyModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 136
		bodyModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 137
		bodyModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 138
		bodyModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 139
		bodyModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 140
		bodyModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 141
		bodyModel[109] = new ModelRendererTurbo(this, 0, 86, textureX, textureY); // Box 142
		bodyModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 143
		bodyModel[111] = new ModelRendererTurbo(this, 0, 82, textureX, textureY); // Box 144
		bodyModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 145
		bodyModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 146
		bodyModel[114] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); // Box 147
		bodyModel[115] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); // Box 148
		bodyModel[116] = new ModelRendererTurbo(this, 64, 87, textureX, textureY); // Box 148
		bodyModel[117] = new ModelRendererTurbo(this, 64, 87, textureX, textureY); // Box 149
		bodyModel[118] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 88
		bodyModel[119] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 91
		bodyModel[120] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 92
		bodyModel[121] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 93
		bodyModel[122] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 94
		bodyModel[123] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 95
		bodyModel[124] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 96
		bodyModel[125] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 97
		bodyModel[126] = new ModelRendererTurbo(this, 176, 113, textureX, textureY); // Box 98
		bodyModel[127] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 99
		bodyModel[128] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 100
		bodyModel[129] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 101
		bodyModel[130] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 106
		bodyModel[131] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 107
		bodyModel[132] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 110
		bodyModel[133] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 133
		bodyModel[134] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 134
		bodyModel[135] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 135
		bodyModel[136] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 136
		bodyModel[137] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 137
		bodyModel[138] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 138
		bodyModel[139] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 139
		bodyModel[140] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 140
		bodyModel[141] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 141
		bodyModel[142] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 142
		bodyModel[143] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 143
		bodyModel[144] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 144
		bodyModel[145] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 145
		bodyModel[146] = new ModelRendererTurbo(this, 176, 113, textureX, textureY); // Box 146
		bodyModel[147] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 147
		bodyModel[148] = new ModelRendererTurbo(this, 259, 95, textureX, textureY); // Box 76
		bodyModel[149] = new ModelRendererTurbo(this, 240, 95, textureX, textureY); // Box 77
		bodyModel[150] = new ModelRendererTurbo(this, 299, 108, textureX, textureY); // Box 78
		bodyModel[151] = new ModelRendererTurbo(this, 271, 108, textureX, textureY); // Box 79
		bodyModel[152] = new ModelRendererTurbo(this, 291, 92, textureX, textureY); // Box 80
		bodyModel[153] = new ModelRendererTurbo(this, 225, 92, textureX, textureY); // Box 81
		bodyModel[154] = new ModelRendererTurbo(this, 225, 92, textureX, textureY); // Box 82
		bodyModel[155] = new ModelRendererTurbo(this, 249, 115, textureX, textureY); // Box 102
		bodyModel[156] = new ModelRendererTurbo(this, 249, 115, textureX, textureY); // Box 103
		bodyModel[157] = new ModelRendererTurbo(this, 280, 95, textureX, textureY); // Box 104
		bodyModel[158] = new ModelRendererTurbo(this, 280, 95, textureX, textureY); // Box 105
		bodyModel[159] = new ModelRendererTurbo(this, 291, 92, textureX, textureY); // Box 27

		bodyModel[0].addShapeBox(0F, 0F, 0F, 50, 1, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[0].setRotationPoint(-35F, 6.25F, -10.5F);

		bodyModel[1].addShapeBox(0F, -5F, -1F, 72, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[1].setRotationPoint(-37F, -10.75F, -9.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 72, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(-37F, -15.75F, -9.25F);

		bodyModel[3].addShapeBox(0F, -5F, 0F, 72, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(-37F, -10.75F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, -1F, 2, 3, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[4].setRotationPoint(-37F, 0.25F, -9.5F);
		bodyModel[4].rotateAngleX = 0.08726646F;

		bodyModel[5].addShapeBox(0F, 0F, -1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[5].setRotationPoint(-37F, 0.25F, 11.02F);
		bodyModel[5].rotateAngleX = -0.08726646F;

		bodyModel[6].addBox(0F, 0F, -1F, 7, 4, 1, 0F); // Box 16
		bodyModel[6].setRotationPoint(15F, 0.23F, 11.02F);
		bodyModel[6].rotateAngleX = -0.08726646F;

		bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 17
		bodyModel[7].setRotationPoint(-18F, 2.25F, -8.75F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 18
		bodyModel[8].setRotationPoint(-19F, -3.75F, -8.75F);
		bodyModel[8].rotateAngleZ = 0.08726646F;

		bodyModel[9].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 19
		bodyModel[9].setRotationPoint(-18F, 2.25F, -3.75F);

		bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 20
		bodyModel[10].setRotationPoint(-18F, 2.25F, 5.25F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 21
		bodyModel[11].setRotationPoint(-19F, -3.75F, -3.75F);
		bodyModel[11].rotateAngleZ = 0.08726646F;

		bodyModel[12].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 22
		bodyModel[12].setRotationPoint(-19F, -3.75F, 5.25F);
		bodyModel[12].rotateAngleZ = 0.08726646F;

		bodyModel[13].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 23
		bodyModel[13].setRotationPoint(-8F, 2.25F, 5.25F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 24
		bodyModel[14].setRotationPoint(-2F, -3.75F, 5.25F);
		bodyModel[14].rotateAngleZ = 0.08726646F;

		bodyModel[15].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 25
		bodyModel[15].setRotationPoint(-4F, -3.75F, 5.25F);
		bodyModel[15].rotateAngleZ = -0.08726646F;

		bodyModel[16].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 26
		bodyModel[16].setRotationPoint(-1F, 2.25F, 5.25F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 27
		bodyModel[17].setRotationPoint(9F, 2.25F, 5.25F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 28
		bodyModel[18].setRotationPoint(13F, -3.75F, 5.25F);
		bodyModel[18].rotateAngleZ = -0.08726646F;

		bodyModel[19].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 29
		bodyModel[19].setRotationPoint(-8F, 2.25F, -3.75F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 30
		bodyModel[20].setRotationPoint(-1F, 2.25F, -3.75F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 32
		bodyModel[21].setRotationPoint(-2F, -3.75F, -3.75F);
		bodyModel[21].rotateAngleZ = 0.08726646F;

		bodyModel[22].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 33
		bodyModel[22].setRotationPoint(-4F, -3.75F, -3.75F);
		bodyModel[22].rotateAngleZ = -0.08726646F;

		bodyModel[23].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 35
		bodyModel[23].setRotationPoint(13F, -3.75F, -8.75F);
		bodyModel[23].rotateAngleZ = -0.08726646F;

		bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 36
		bodyModel[24].setRotationPoint(9F, 2.25F, -8.75F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 37
		bodyModel[25].setRotationPoint(-1F, 2.25F, -8.75F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 38
		bodyModel[26].setRotationPoint(-2F, -3.75F, -8.75F);
		bodyModel[26].rotateAngleZ = 0.08726646F;

		bodyModel[27].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 39
		bodyModel[27].setRotationPoint(-8F, 2.25F, -8.75F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 40
		bodyModel[28].setRotationPoint(-4F, -3.75F, -8.75F);
		bodyModel[28].rotateAngleZ = -0.08726646F;

		bodyModel[29].addBox(0F, 0F, 0F, 1, 21, 10, 0F); // Box 47
		bodyModel[29].setRotationPoint(-21F, -14.75F, -9.75F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 21, 5, 0F); // Box 48
		bodyModel[30].setRotationPoint(-21F, -14.75F, 5.25F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 49
		bodyModel[31].setRotationPoint(14F, -14.75F, 3.25F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 50
		bodyModel[32].setRotationPoint(14F, -14.75F, -9.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[33].setRotationPoint(-35F, -14.75F, -9.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[34].setRotationPoint(-35F, -14.75F, 3.25F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 57
		bodyModel[35].setRotationPoint(14F, 1.25F, -2.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 58
		bodyModel[36].setRotationPoint(-21F, -14.75F, 0.25F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 59
		bodyModel[37].setRotationPoint(-35F, -14.75F, -2.75F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 10, 1, 0F); // Box 67
		bodyModel[38].setRotationPoint(-37F, -9.75F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 58, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[39].setRotationPoint(-23F, -9.75F, -10.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 66
		bodyModel[40].setRotationPoint(14F, -7.75F, -9.75F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 6, 7, 0F); // Box 67
		bodyModel[41].setRotationPoint(14F, 0.25F, -9.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 68
		bodyModel[42].setRotationPoint(14F, -7.75F, 3.25F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 6, 7, 0F); // Box 69
		bodyModel[43].setRotationPoint(14F, 0.25F, 3.25F);

		bodyModel[44].addShapeBox(0F, -5F, 0F, 38, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[44].setRotationPoint(-23F, 5.25F, -10F);

		bodyModel[45].addShapeBox(0F, -5F, -1F, 38, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[45].setRotationPoint(-23F, 5.25F, 10.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 4, 1, 0F); // Box 74
		bodyModel[46].setRotationPoint(15F, 0.25F, -10.5F);
		bodyModel[46].rotateAngleX = 0.07853982F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 84
		bodyModel[47].setRotationPoint(-40F, -13.75F, -8.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 85
		bodyModel[48].setRotationPoint(-40F, -13.75F, 4.25F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 108
		bodyModel[49].setRotationPoint(-31.5F, 7F, -8.75F);

		bodyModel[50].addShapeBox(0F, -5F, -1F, 8, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[50].setRotationPoint(-31F, 5.25F, 10.5F);

		bodyModel[51].addShapeBox(0F, -5F, -1F, 4, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[51].setRotationPoint(-35F, 5.25F, 10.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 8, 10, 1, 0F); // Box 71
		bodyModel[52].setRotationPoint(-31F, -9.75F, 10F);

		bodyModel[53].addBox(0F, 0F, 0F, 58, 10, 1, 0F); // Box 72
		bodyModel[53].setRotationPoint(-23F, -9.75F, 10F);

		bodyModel[54].addShapeBox(0F, -5F, 0F, 13, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[54].setRotationPoint(22F, 5.25F, -10F);

		bodyModel[55].addShapeBox(0F, -5F, -1F, 13, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[55].setRotationPoint(22F, 5.25F, 10.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 1, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 75
		bodyModel[56].setRotationPoint(22F, 6.25F, -10.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 19, 1, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 76
		bodyModel[57].setRotationPoint(15F, 1.25F, -10.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 78
		bodyModel[58].setRotationPoint(22F, 2.25F, -9.75F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 5, 20, 0F); // Box 79
		bodyModel[59].setRotationPoint(34F, 1.25F, -9.75F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 80
		bodyModel[60].setRotationPoint(34F, -14.75F, -9.75F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 16, 7, 0F); // Box 81
		bodyModel[61].setRotationPoint(34F, -14.75F, 3.25F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Box 82
		bodyModel[62].setRotationPoint(34F, -13.75F, -2.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 83
		bodyModel[63].setRotationPoint(14F, -13.75F, -2.75F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 84
		bodyModel[64].setRotationPoint(14F, -14.75F, -2.75F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 85
		bodyModel[65].setRotationPoint(34F, -14.75F, -2.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[66].setRotationPoint(11F, 4.25F, -2.75F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 69
		bodyModel[67].setRotationPoint(25.5F, 7F, -8.75F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 70
		bodyModel[68].setRotationPoint(10.5F, 7F, 8.25F);

		bodyModel[69].addShapeBox(0F, -5F, 0F, 8, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[69].setRotationPoint(-31F, 5.25F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[70].setRotationPoint(-31F, -9.75F, -10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[71].setRotationPoint(-37F, -9.75F, -10.5F);

		bodyModel[72].addShapeBox(0F, -5F, 0F, 4, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[72].setRotationPoint(-35F, 5.25F, -10F);

		bodyModel[73].addBox(0F, 0F, -5F, 1, 1, 5, 0F); // Box 104
		bodyModel[73].setRotationPoint(15F, -9.75F, 10.25F);
		bodyModel[73].rotateAngleX = -0.17453293F;

		bodyModel[74].addBox(0F, 0F, -5F, 1, 1, 5, 0F); // Box 105
		bodyModel[74].setRotationPoint(17F, -9.75F, 10.25F);
		bodyModel[74].rotateAngleX = -0.17453293F;

		bodyModel[75].addBox(0F, 0F, -5F, 1, 1, 5, 0F); // Box 106
		bodyModel[75].setRotationPoint(19F, -9.75F, 10.25F);
		bodyModel[75].rotateAngleX = -0.17453293F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 110
		bodyModel[76].setRotationPoint(-18F, 0F, 0.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 111
		bodyModel[77].setRotationPoint(-18F, 0F, 4.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 112
		bodyModel[78].setRotationPoint(-7F, 0F, 4.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 113
		bodyModel[79].setRotationPoint(-7F, 0F, 0.25F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 114
		bodyModel[80].setRotationPoint(-1F, 0F, 4.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 115
		bodyModel[81].setRotationPoint(-1F, 0F, 0.25F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 116
		bodyModel[82].setRotationPoint(-18F, 0F, -4.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 117
		bodyModel[83].setRotationPoint(-18F, 0F, -4.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 118
		bodyModel[84].setRotationPoint(-7F, 0F, -4.25F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 119
		bodyModel[85].setRotationPoint(-7F, 0F, -4.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 120
		bodyModel[86].setRotationPoint(-1F, 0F, -4.25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 121
		bodyModel[87].setRotationPoint(-1F, 0F, -4.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 122
		bodyModel[88].setRotationPoint(10F, 0F, -4.75F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 123
		bodyModel[89].setRotationPoint(-12.5F, 0F, -9.75F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 124
		bodyModel[90].setRotationPoint(-11.5F, 1F, -1.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 125
		bodyModel[91].setRotationPoint(-7F, 0F, -9.25F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 126
		bodyModel[92].setRotationPoint(-1F, 0F, -9.25F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 127
		bodyModel[93].setRotationPoint(10F, 0F, -9.25F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 128
		bodyModel[94].setRotationPoint(-18F, 0F, -9.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 129
		bodyModel[95].setRotationPoint(-18F, 0F, 9.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 130
		bodyModel[96].setRotationPoint(-7F, 0F, 9.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 131
		bodyModel[97].setRotationPoint(-1F, 0F, 9.25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 132
		bodyModel[98].setRotationPoint(10F, 0F, 9.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 133
		bodyModel[99].setRotationPoint(10F, 0F, 4.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 34, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F); // Box 132
		bodyModel[100].setRotationPoint(-20F, -10F, -9.75F);

		bodyModel[101].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 134
		bodyModel[101].setRotationPoint(-20F, -11F, -3.75F);

		bodyModel[102].addBox(0F, 0F, 0F, 34, 0, 4, 0F); // Box 135
		bodyModel[102].setRotationPoint(-20F, -10F, -7.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F); // Box 136
		bodyModel[103].setRotationPoint(-15F, -10F, -9.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F); // Box 137
		bodyModel[104].setRotationPoint(-8F, -10F, -9.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F); // Box 138
		bodyModel[105].setRotationPoint(1F, -10F, -9.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F); // Box 139
		bodyModel[106].setRotationPoint(10F, -10F, -9.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 140
		bodyModel[107].setRotationPoint(10F, -10F, 3.25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 141
		bodyModel[108].setRotationPoint(10F, -10F, 3.25F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 34, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[109].setRotationPoint(-20F, -10F, 7.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 143
		bodyModel[110].setRotationPoint(-8F, -10F, 3.25F);

		bodyModel[111].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Box 144
		bodyModel[111].setRotationPoint(-20F, -11F, 3.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 145
		bodyModel[112].setRotationPoint(1F, -10F, 3.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 146
		bodyModel[113].setRotationPoint(-15F, -10F, 3.25F);

		bodyModel[114].addBox(0F, 0F, 0F, 34, 0, 4, 0F); // Box 147
		bodyModel[114].setRotationPoint(-20F, -10F, 4.25F);

		bodyModel[115].addBox(0F, 0F, 0F, 34, 0, 4, 0F); // Box 148
		bodyModel[115].setRotationPoint(-20F, -10F, 4.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 5, 20, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[116].setRotationPoint(27F, -20.5F, -9.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 5, 20, 0F,0F, -3F, -4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -3F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 149
		bodyModel[117].setRotationPoint(20F, -20.5F, -9.75F);

		bodyModel[118].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 88
		bodyModel[118].setRotationPoint(17F, 5F, -7F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 91
		bodyModel[119].setRotationPoint(17F, 5F, 6F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 92
		bodyModel[120].setRotationPoint(17.5F, 6F, 7F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 93
		bodyModel[121].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		bodyModel[122].setRotationPoint(19.5F, 6.5F, -9F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 95
		bodyModel[123].setRotationPoint(20.5F, 5.5F, -9F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 96
		bodyModel[124].setRotationPoint(15.5F, 5.5F, 8F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 97
		bodyModel[125].setRotationPoint(16.5F, 6.5F, 8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[126].setRotationPoint(15F, 4.5F, -9.25F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 99
		bodyModel[127].setRotationPoint(16F, 5.5F, 7.75F);

		bodyModel[128].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 100
		bodyModel[128].setRotationPoint(16F, 4.5F, -5.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 101
		bodyModel[129].setRotationPoint(16F, 4.5F, 5.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 13, 0F); // Box 106
		bodyModel[130].setRotationPoint(18F, 6.5F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 107
		bodyModel[131].setRotationPoint(21F, 7.75F, -9.25F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[132].setRotationPoint(11F, 6.75F, 7.75F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 133
		bodyModel[133].setRotationPoint(-41.5F, 5.5F, 8F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		bodyModel[134].setRotationPoint(-40.5F, 6.5F, 8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[135].setRotationPoint(-41F, 5.5F, 7.75F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 136
		bodyModel[136].setRotationPoint(-39.5F, 6F, 7F);

		bodyModel[137].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 137
		bodyModel[137].setRotationPoint(-40F, 5F, 6F);

		bodyModel[138].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 138
		bodyModel[138].setRotationPoint(-41F, 4.5F, 5.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[139].setRotationPoint(-46F, 6.75F, 7.75F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 13, 0F); // Box 140
		bodyModel[140].setRotationPoint(-39F, 6.5F, -6F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 141
		bodyModel[141].setRotationPoint(-39.5F, 6F, -9F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 142
		bodyModel[142].setRotationPoint(-37.5F, 6.5F, -9F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 143
		bodyModel[143].setRotationPoint(-36.5F, 5.5F, -9F);

		bodyModel[144].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 144
		bodyModel[144].setRotationPoint(-40F, 5F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 145
		bodyModel[145].setRotationPoint(-36F, 7.75F, -9.25F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[146].setRotationPoint(-42F, 4.5F, -9.25F);

		bodyModel[147].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 147
		bodyModel[147].setRotationPoint(-41F, 4.5F, -5.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 76
		bodyModel[148].setRotationPoint(-42F, -10F, -3.75F);

		bodyModel[149].addBox(0F, 0F, 0F, 7, 16, 1, 0F); // Box 77
		bodyModel[149].setRotationPoint(-42F, -10F, 3.25F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 78
		bodyModel[150].setRotationPoint(-42F, 6F, -2.75F);

		bodyModel[151].addBox(0F, 0F, 0F, 7, 1, 6, 0F); // Box 79
		bodyModel[151].setRotationPoint(-42F, -11F, -2.75F);

		bodyModel[152].addBox(0F, 0F, 0F, 7, 13, 1, 0F); // Box 80
		bodyModel[152].setRotationPoint(-42F, -11F, -9.75F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 18, 3, 0F); // Box 81
		bodyModel[153].setRotationPoint(-40F, -13F, -7.75F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 18, 3, 0F); // Box 82
		bodyModel[154].setRotationPoint(-40F, -13F, 5.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[155].setRotationPoint(-42F, 3.5F, -10.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[156].setRotationPoint(-42F, 3.5F, 9.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 104
		bodyModel[157].setRotationPoint(-40F, 2F, 4.25F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 105
		bodyModel[158].setRotationPoint(-40F, 2F, -4.75F);

		bodyModel[159].addBox(0F, 0F, 0F, 7, 13, 1, 0F); // Box 27
		bodyModel[159].setRotationPoint(-42F, -11F, 9.25F);
		this.flipAll();
	}
}