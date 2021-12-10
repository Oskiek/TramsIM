
package tramsim.models.trains; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class KonstalN extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public KonstalN() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[149];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 53
		bodyModel[48] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 54
		bodyModel[49] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 55
		bodyModel[50] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 64
		bodyModel[59] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 65
		bodyModel[60] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 66
		bodyModel[61] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 67
		bodyModel[62] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 68
		bodyModel[63] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 69
		bodyModel[64] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 70
		bodyModel[65] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 71
		bodyModel[66] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 75
		bodyModel[70] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 76
		bodyModel[71] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 81
		bodyModel[75] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 82
		bodyModel[76] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 83
		bodyModel[77] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 84
		bodyModel[78] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 85
		bodyModel[79] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 86
		bodyModel[80] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 89
		bodyModel[83] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 91
		bodyModel[85] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 93
		bodyModel[86] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 94
		bodyModel[87] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 95
		bodyModel[88] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 96
		bodyModel[89] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 97
		bodyModel[90] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 98
		bodyModel[91] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 100
		bodyModel[92] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 101
		bodyModel[93] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 102
		bodyModel[94] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 131
		bodyModel[96] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 132
		bodyModel[97] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 133
		bodyModel[98] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 134
		bodyModel[99] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 135
		bodyModel[100] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 136
		bodyModel[101] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 137
		bodyModel[102] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 138
		bodyModel[103] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 139
		bodyModel[104] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 140
		bodyModel[105] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 151
		bodyModel[106] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 152
		bodyModel[107] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 153
		bodyModel[108] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 154
		bodyModel[109] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 155
		bodyModel[110] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 156
		bodyModel[111] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 157
		bodyModel[112] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 158
		bodyModel[113] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 159
		bodyModel[114] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 160
		bodyModel[115] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 161
		bodyModel[116] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 162
		bodyModel[117] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 163
		bodyModel[118] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 164
		bodyModel[119] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 165
		bodyModel[120] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 166
		bodyModel[121] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 167
		bodyModel[122] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 168
		bodyModel[123] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 169
		bodyModel[124] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 170
		bodyModel[125] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 171
		bodyModel[126] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 172
		bodyModel[127] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 173
		bodyModel[128] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 174
		bodyModel[129] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 175
		bodyModel[130] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 176
		bodyModel[131] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 177
		bodyModel[132] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 178
		bodyModel[133] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 179
		bodyModel[134] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 180
		bodyModel[135] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 181
		bodyModel[136] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 182
		bodyModel[137] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 183
		bodyModel[138] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 184
		bodyModel[139] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 185
		bodyModel[140] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 186
		bodyModel[141] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 187
		bodyModel[142] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 189
		bodyModel[143] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 190
		bodyModel[144] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 191
		bodyModel[145] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 145
		bodyModel[146] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 146
		bodyModel[147] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 147
		bodyModel[148] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 148

		bodyModel[0].addShapeBox(0F, 0F, 0F, 40, 1, 20, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-20F, 9F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-20F, -9F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 40, 2, 20, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-20F, -13F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 40, 9, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-20F, 0F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(16F, -9F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 9, 0, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-16F, -9F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-20F, -11F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 9, 0, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-5F, -9F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 9, 0, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(6F, -9F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-6F, -9F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(5F, -9F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 25, 1, 20, 0F,-1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 11
		bodyModel[11].setRotationPoint(-44F, 9F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 25, 2, 20, 0F,-2F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 12
		bodyModel[12].setRotationPoint(-44F, -13F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-43F, 0F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-43F, -11F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-43F, -9F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-43F, -9F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 9, 3, 0F,-1F, 0F, -3F, 0F, 0F, -1.32F, 0F, 0F, -0.45F, -2F, 0F, 1F, -1F, 0F, -3F, 0F, 0F, -1.32F, 0F, 0F, -0.45F, -2F, 0F, 1F); // Box 18
		bodyModel[17].setRotationPoint(-44F, 0F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-43F, -9F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,-1F, 1F, 0F, 0F, 1F, -0.11F, 0F, 1F, 0.24F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, -0.11F, 0F, 0F, 0.24F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-43F, -9F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 14, 9, 3, 0F,-2F, 0F, 1F, 0F, 0F, -0.45F, 0F, 0F, -1.32F, -1F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, -0.45F, 0F, 0F, -1.32F, -1F, 0F, -3F); // Box 22
		bodyModel[20].setRotationPoint(-44F, 0F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-20F, -9F, 9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 40, 9, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(-20F, 0F, 9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(16F, -9F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 9, 0, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(-16F, -9F, 9.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-20F, -11F, 9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 9, 0, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-5F, -9F, 9.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 9, 0, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(6F, -9F, 9.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(-6F, -9F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(5F, -9F, 9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, 0.56F, 0F, 1F, 0.68F, 0F, 1F, -0.62F, 0F, 1F, -0.49F, 0F, 0F, 0.56F, 0F, 0F, 0.68F, 0F, 0F, -0.45F, 0F, 0F, -0.34F); // Box 33
		bodyModel[30].setRotationPoint(-31F, -9F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, -0.34F, 0F, 1F, -0.45F, 0F, 1F, 0.68F, 0F, 1F, 0.56F, 0F, 0F, -0.34F, 0F, 0F, -0.45F, 0F, 0F, 0.68F, 0F, 0F, 0.56F); // Box 34
		bodyModel[31].setRotationPoint(-31F, -9F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 11, 18, 1, 0F,0F, 1F, -1.5F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 1F); // Box 35
		bodyModel[32].setRotationPoint(-30F, -9F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 25, 1, 7, 0F,-1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -3F); // Box 36
		bodyModel[33].setRotationPoint(-44F, -11F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 25, 1, 7, 0F,-2F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 37
		bodyModel[34].setRotationPoint(-44F, -11F, 3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 9, 12, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[35].setRotationPoint(-42.5F, -9F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-42F, 1F, -6F);

		bodyModel[37].addBox(-1F, 0F, -1F, 2, 1, 2, 0F); // Box 41
		bodyModel[37].setRotationPoint(-40F, 0.75F, -4F);
		bodyModel[37].rotateAngleY = -0.48869219F;

		bodyModel[38].addShapeBox(-0.75F, 0F, -0.75F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[38].setRotationPoint(-40F, -0.25F, -4F);
		bodyModel[38].rotateAngleY = -0.48869219F;

		bodyModel[39].addShapeBox(-0.75F, 0F, -0.75F, 1, 1, 4, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 43
		bodyModel[39].setRotationPoint(-40F, -1.25F, -4F);
		bodyModel[39].rotateAngleY = -0.48869219F;

		bodyModel[40].addBox(-3F, 0F, 0F, 3, 2, 2, 0F); // Box 44
		bodyModel[40].setRotationPoint(-38F, 0.75F, 1F);
		bodyModel[40].rotateAngleZ = -0.38397244F;

		bodyModel[41].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 45
		bodyModel[41].setRotationPoint(-19F, 5F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 46
		bodyModel[42].setRotationPoint(-14F, 0F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 49
		bodyModel[43].setRotationPoint(8F, 5F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 50
		bodyModel[44].setRotationPoint(13F, 0F, -9F);

		bodyModel[45].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 51
		bodyModel[45].setRotationPoint(-5.5F, 5F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 52
		bodyModel[46].setRotationPoint(-0.5F, 0F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 53
		bodyModel[47].setRotationPoint(-18F, 6F, -6F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 54
		bodyModel[48].setRotationPoint(-10F, 6F, -6F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 55
		bodyModel[49].setRotationPoint(-4.5F, 6F, -6F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 56
		bodyModel[50].setRotationPoint(3.5F, 6F, -6F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 57
		bodyModel[51].setRotationPoint(9F, 6F, -6F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 58
		bodyModel[52].setRotationPoint(17F, 6F, -6F);

		bodyModel[53].addBox(0F, 0F, 0F, 11, 1, 8, 0F); // Box 59
		bodyModel[53].setRotationPoint(-19F, 5F, 1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 60
		bodyModel[54].setRotationPoint(-14F, 0F, 1F);

		bodyModel[55].addBox(0F, 0F, 0F, 11, 1, 8, 0F); // Box 61
		bodyModel[55].setRotationPoint(8F, 5F, 1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 62
		bodyModel[56].setRotationPoint(13F, 0F, 1F);

		bodyModel[57].addBox(0F, 0F, 0F, 11, 1, 8, 0F); // Box 63
		bodyModel[57].setRotationPoint(-5.5F, 5F, 1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 64
		bodyModel[58].setRotationPoint(-0.5F, 0F, 1F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 65
		bodyModel[59].setRotationPoint(3.5F, 6F, 1F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 66
		bodyModel[60].setRotationPoint(9F, 6F, 1F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 67
		bodyModel[61].setRotationPoint(17F, 6F, 1F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 68
		bodyModel[62].setRotationPoint(-4.5F, 6F, 1F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 69
		bodyModel[63].setRotationPoint(-10F, 6F, 1F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 70
		bodyModel[64].setRotationPoint(-18F, 6F, 1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 11, 18, 1, 0F,0F, 1F, 1F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -1.5F); // Box 71
		bodyModel[65].setRotationPoint(-30F, -9F, 9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F); // Box 72
		bodyModel[66].setRotationPoint(-31F, 10F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F); // Box 73
		bodyModel[67].setRotationPoint(-31F, 11F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F); // Box 74
		bodyModel[68].setRotationPoint(-30F, 10F, 9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F); // Box 75
		bodyModel[69].setRotationPoint(-30F, 11F, 9F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 76
		bodyModel[70].setRotationPoint(-16F, 11F, -6F);

		bodyModel[71].addBox(0F, 0F, 0F, 8, 1, 16, 0F); // Box 77
		bodyModel[71].setRotationPoint(-4F, 12F, -8F);

		bodyModel[72].addBox(0F, 0F, 0F, 18, 1, 16, 0F); // Box 78
		bodyModel[72].setRotationPoint(-9F, 11F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[73].setRotationPoint(-19F, 11F, -8F);

		bodyModel[74].addBox(0F, 0F, 0F, 38, 1, 16, 0F); // Box 81
		bodyModel[74].setRotationPoint(-19F, 10F, -8F);

		bodyModel[75].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 82
		bodyModel[75].setRotationPoint(-4F, 13F, -8F);

		bodyModel[76].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 83
		bodyModel[76].setRotationPoint(-4F, 13F, 7F);

		bodyModel[77].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 84
		bodyModel[77].setRotationPoint(-16F, 11F, 6F);

		bodyModel[78].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 85
		bodyModel[78].setRotationPoint(-19F, 12.5F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 86
		bodyModel[79].setRotationPoint(-19F, 12.5F, 6F);

		bodyModel[80].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 87
		bodyModel[80].setRotationPoint(4F, 12.5F, -7F);

		bodyModel[81].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 88
		bodyModel[81].setRotationPoint(11F, 11F, -6F);

		bodyModel[82].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 89
		bodyModel[82].setRotationPoint(11F, 11F, 6F);

		bodyModel[83].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 90
		bodyModel[83].setRotationPoint(4F, 12.5F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[84].setRotationPoint(-19F, 11F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[85].setRotationPoint(-19F, 11F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[86].setRotationPoint(18F, 11F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[87].setRotationPoint(18F, 11F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[88].setRotationPoint(18F, 11F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 11, 9, 0, 0F,0F, 1F, 0F, 0F, 1F, 1.3F, 0F, 1F, -1.3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F); // Box 97
		bodyModel[89].setRotationPoint(-42F, -9F, -6.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 11, 9, 0, 0F,0F, 1F, 0F, 0F, 1F, -1.3F, 0F, 1F, 1.3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, 1.3F, 0F, 0F, 0F); // Box 98
		bodyModel[90].setRotationPoint(-42F, -9F, 6.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 40, 2, 14, 0F,-2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 100
		bodyModel[91].setRotationPoint(-20F, -15F, -7F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
		bodyModel[92].setRotationPoint(-42.5F, -14F, -0.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 102
		bodyModel[93].setRotationPoint(-42F, -17.75F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 6F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, -0.5F, 6F, -0.5F, -0.5F); // Box 128
		bodyModel[94].setRotationPoint(7F, -20.5F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 6F, -0.5F, -0.5F, -6.5F, -0.5F, -0.5F, -6.5F, -0.5F, 0F, 6F, -0.5F, 0F); // Box 131
		bodyModel[95].setRotationPoint(7F, -20.5F, 2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -6.5F, -0.5F, 0F, 6F, -0.5F, 0F, 6F, -0.5F, -0.5F, -6.5F, -0.5F, -0.5F); // Box 132
		bodyModel[96].setRotationPoint(-7F, -20.5F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -6.5F, -0.5F, -0.5F, 6F, -0.5F, -0.5F, 6F, -0.5F, 0F, -6.5F, -0.5F, 0F); // Box 133
		bodyModel[97].setRotationPoint(-7F, -20.5F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-6.5F, -0.5F, 0F, 6F, -0.5F, 0F, 6F, -0.5F, -0.5F, -6.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 134
		bodyModel[98].setRotationPoint(-7F, -26.5F, -3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-6.5F, -0.5F, -0.5F, 6F, -0.5F, -0.5F, 6F, -0.5F, 0F, -6.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 135
		bodyModel[99].setRotationPoint(-7F, -26.5F, 2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,6F, -0.5F, -0.5F, -6.5F, -0.5F, -0.5F, -6.5F, -0.5F, 0F, 6F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[100].setRotationPoint(7F, -26.5F, 2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,6F, -0.5F, 0F, -6.5F, -0.5F, 0F, -6.5F, -0.5F, -0.5F, 6F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 137
		bodyModel[101].setRotationPoint(7F, -26.5F, -3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-6.5F, -0.5F, -5.5F, 6F, -0.5F, -5.5F, 6F, -0.5F, 5F, -6.5F, -0.5F, 5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 138
		bodyModel[102].setRotationPoint(-7F, -26.5F, -3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 6F, -0.5F, -5.5F, -6.5F, -0.5F, -5.5F, -6.5F, -0.5F, 5F, 6F, -0.5F, 5F); // Box 139
		bodyModel[103].setRotationPoint(7F, -20.5F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[104].setRotationPoint(-0.5F, -27F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 25, 1, 20, 0F,0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 151
		bodyModel[105].setRotationPoint(19F, 9F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 9, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 152
		bodyModel[106].setRotationPoint(42F, 0F, -7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 14, 9, 3, 0F,0F, 0F, -1.32F, -1F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, -0.45F, 0F, 0F, -1.32F, -1F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, -0.45F); // Box 153
		bodyModel[107].setRotationPoint(30F, 0F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 14, 9, 3, 0F,0F, 0F, -0.45F, -2F, 0F, 1F, -1F, 0F, -3F, 0F, 0F, -1.32F, 0F, 0F, -0.45F, -2F, 0F, 1F, -1F, 0F, -3F, 0F, 0F, -1.32F); // Box 154
		bodyModel[108].setRotationPoint(30F, 0F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -0.25F); // Box 155
		bodyModel[109].setRotationPoint(19F, 10F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -0.25F); // Box 156
		bodyModel[110].setRotationPoint(19F, 11F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.25F); // Box 157
		bodyModel[111].setRotationPoint(19F, 10F, 9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.25F); // Box 158
		bodyModel[112].setRotationPoint(19F, 11F, 9F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 159
		bodyModel[113].setRotationPoint(43.5F, 4F, -1.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 8, 12, 0F,0F, 0F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F); // Box 160
		bodyModel[114].setRotationPoint(37F, 1F, -6F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 161
		bodyModel[115].setRotationPoint(38F, 0.75F, -3F);
		bodyModel[115].rotateAngleZ = 0.38397244F;

		bodyModel[116].addShapeBox(-0.75F, 0F, -0.75F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 162
		bodyModel[116].setRotationPoint(40F, -0.25F, 4F);
		bodyModel[116].rotateAngleY = -0.48869219F;

		bodyModel[117].addBox(-1F, 0F, -1F, 2, 1, 2, 0F); // Box 163
		bodyModel[117].setRotationPoint(40F, 0.75F, 4F);
		bodyModel[117].rotateAngleY = -0.48869219F;

		bodyModel[118].addShapeBox(-0.75F, 0F, -3.75F, 1, 1, 4, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 164
		bodyModel[118].setRotationPoint(40F, -1.25F, 4F);
		bodyModel[118].rotateAngleY = -0.48869219F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[119].setRotationPoint(42F, -9F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 166
		bodyModel[120].setRotationPoint(42F, -9F, 6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,1F, 1F, 0.24F, -1F, 1F, 0F, -2F, 1F, 0F, 1F, 1F, -0.11F, 1F, 0F, 0.24F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -0.11F); // Box 167
		bodyModel[121].setRotationPoint(42F, -9F, -7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,1F, 1F, -0.11F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 1F, 0.24F, 1F, 0F, -0.11F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0.24F); // Box 168
		bodyModel[122].setRotationPoint(42F, -9F, 6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, 0.68F, 0F, 1F, 0.56F, 0F, 1F, -0.49F, 0F, 1F, -0.62F, 0F, 0F, 0.68F, 0F, 0F, 0.56F, 0F, 0F, -0.34F, 0F, 0F, -0.45F); // Box 169
		bodyModel[123].setRotationPoint(30F, -9F, -8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, -0.45F, 0F, 1F, -0.34F, 0F, 1F, 0.56F, 0F, 1F, 0.68F, 0F, 0F, -0.45F, 0F, 0F, -0.34F, 0F, 0F, 0.56F, 0F, 0F, 0.68F); // Box 170
		bodyModel[124].setRotationPoint(30F, -9F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 9, 12, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[125].setRotationPoint(42.5F, -9F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 11, 9, 0, 0F,0F, 1F, 1.3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1.3F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F); // Box 172
		bodyModel[126].setRotationPoint(31F, -9F, -6.75F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 11, 9, 0, 0F,0F, 1F, -1.3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F); // Box 173
		bodyModel[127].setRotationPoint(31F, -9F, 6.75F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 25, 2, 20, 0F,0F, 0F, -1F, -2F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 174
		bodyModel[128].setRotationPoint(19F, -13F, -10F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 175
		bodyModel[129].setRotationPoint(40.5F, -14F, -0.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 176
		bodyModel[130].setRotationPoint(41F, -17.75F, -2F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 11, 18, 1, 0F,0F, 1F, -0.25F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 1F, -0.25F); // Box 177
		bodyModel[131].setRotationPoint(19F, -9F, 9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 11, 18, 1, 0F,0F, 1F, -0.25F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -1.5F, 0F, 1F, 1F, 0F, 1F, -0.25F); // Box 178
		bodyModel[132].setRotationPoint(19F, -9F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 25, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -6F); // Box 179
		bodyModel[133].setRotationPoint(19F, -11F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 180
		bodyModel[134].setRotationPoint(42F, -11F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 25, 1, 7, 0F,0F, 0F, -6F, -2F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 181
		bodyModel[135].setRotationPoint(19F, -11F, 3F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 182
		bodyModel[136].setRotationPoint(-43.5F, 4F, -1.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 183
		bodyModel[137].setRotationPoint(-20F, -8F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 184
		bodyModel[138].setRotationPoint(-20F, -8F, 5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 185
		bodyModel[139].setRotationPoint(-19F, -10F, -6F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 186
		bodyModel[140].setRotationPoint(18F, -10F, -6F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 187
		bodyModel[141].setRotationPoint(-0.5F, -10F, -6F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 189
		bodyModel[142].setRotationPoint(-19F, -10F, 5F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 190
		bodyModel[143].setRotationPoint(18F, -10F, 5F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 191
		bodyModel[144].setRotationPoint(-0.5F, -10F, 5F);

		bodyModel[145].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 145
		bodyModel[145].setRotationPoint(-45F, 10F, -1F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 146
		bodyModel[146].setRotationPoint(-46.5F, 9F, -2F);

		bodyModel[147].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 147
		bodyModel[147].setRotationPoint(27F, 10F, -1F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 148
		bodyModel[148].setRotationPoint(44.5F, 9F, -2F);

		this.flipAll();


	}
}