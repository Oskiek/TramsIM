package tramsim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Citadis_middle extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Citadis_middle() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[164];

		initbodyModel_1();

	}

	private void initbodyModel_1()
	{


		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 137, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 128, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 147, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 67, 137, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 67, 147, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 67, 128, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 34
		bodyModel[14] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 39
		bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
		bodyModel[19] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 42
		bodyModel[21] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 43
		bodyModel[22] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 46
		bodyModel[23] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 47
		bodyModel[24] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 49
		bodyModel[25] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 51
		bodyModel[26] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 52
		bodyModel[27] = new ModelRendererTurbo(this, 62, 137, textureX, textureY); // Box 53
		bodyModel[28] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 54
		bodyModel[29] = new ModelRendererTurbo(this, 62, 137, textureX, textureY); // Box 55
		bodyModel[30] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 56
		bodyModel[31] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 57
		bodyModel[32] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 59
		bodyModel[33] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 60
		bodyModel[34] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 61
		bodyModel[35] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 62
		bodyModel[36] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 63
		bodyModel[37] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 61
		bodyModel[38] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 62
		bodyModel[39] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 63
		bodyModel[40] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 64
		bodyModel[41] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 65
		bodyModel[42] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 67
		bodyModel[44] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 68
		bodyModel[45] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 69
		bodyModel[46] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 70
		bodyModel[47] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 71
		bodyModel[48] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 72
		bodyModel[49] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 73
		bodyModel[50] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 74
		bodyModel[51] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 75
		bodyModel[52] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 76
		bodyModel[53] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 77
		bodyModel[54] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 78
		bodyModel[55] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 79
		bodyModel[56] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 99
		bodyModel[57] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 100
		bodyModel[58] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 101
		bodyModel[59] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 102
		bodyModel[60] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 103
		bodyModel[61] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 104
		bodyModel[62] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 105
		bodyModel[63] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 106
		bodyModel[64] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 107
		bodyModel[65] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 108
		bodyModel[66] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 109
		bodyModel[67] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 110
		bodyModel[68] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 111
		bodyModel[69] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 112
		bodyModel[70] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 113
		bodyModel[71] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 117
		bodyModel[72] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 118
		bodyModel[73] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 119
		bodyModel[74] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 120
		bodyModel[75] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 121
		bodyModel[76] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 123
		bodyModel[77] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 124
		bodyModel[78] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 125
		bodyModel[79] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 126
		bodyModel[80] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 127
		bodyModel[81] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 129
		bodyModel[82] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 130
		bodyModel[83] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 131
		bodyModel[84] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 132
		bodyModel[85] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 133
		bodyModel[86] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 134
		bodyModel[87] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 135
		bodyModel[88] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 136
		bodyModel[89] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 137
		bodyModel[90] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 138
		bodyModel[91] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 140
		bodyModel[92] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 258
		bodyModel[93] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 134
		bodyModel[94] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 255
		bodyModel[95] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 146
		bodyModel[96] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 147
		bodyModel[97] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 148
		bodyModel[98] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 169
		bodyModel[99] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 170
		bodyModel[100] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 171
		bodyModel[101] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 172
		bodyModel[102] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 173
		bodyModel[103] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 174
		bodyModel[104] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 175
		bodyModel[105] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 176
		bodyModel[106] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 177
		bodyModel[107] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 178
		bodyModel[108] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 179
		bodyModel[109] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 180
		bodyModel[110] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 181
		bodyModel[111] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 182
		bodyModel[112] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 183
		bodyModel[113] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 184
		bodyModel[114] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 185
		bodyModel[115] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 186
		bodyModel[116] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 187
		bodyModel[117] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 188
		bodyModel[118] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 189
		bodyModel[119] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 190
		bodyModel[120] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 191
		bodyModel[121] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 192
		bodyModel[122] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 193
		bodyModel[123] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 194
		bodyModel[124] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 195
		bodyModel[125] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 196
		bodyModel[126] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 197
		bodyModel[127] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 198
		bodyModel[128] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 199
		bodyModel[129] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 200
		bodyModel[130] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 201
		bodyModel[131] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 202
		bodyModel[132] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 203
		bodyModel[133] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 204
		bodyModel[134] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 205
		bodyModel[135] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 206
		bodyModel[136] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 207
		bodyModel[137] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 208
		bodyModel[138] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 209
		bodyModel[139] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 211
		bodyModel[140] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 212
		bodyModel[141] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 213
		bodyModel[142] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 214
		bodyModel[143] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 215
		bodyModel[144] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 216
		bodyModel[145] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 217
		bodyModel[146] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 218
		bodyModel[147] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 219
		bodyModel[148] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 220
		bodyModel[149] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 221
		bodyModel[150] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 152
		bodyModel[151] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 153
		bodyModel[152] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 154
		bodyModel[153] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 155
		bodyModel[154] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 156
		bodyModel[155] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 157
		bodyModel[156] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 158
		bodyModel[157] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 159
		bodyModel[158] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 160
		bodyModel[159] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 161
		bodyModel[160] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 162
		bodyModel[161] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 163
		bodyModel[162] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 164
		bodyModel[163] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 165

		bodyModel[0].addShapeBox(0F, 0F, 0F, 25, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 0
		bodyModel[0].setRotationPoint(-12.5F, 6F, -9.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-11.5F, -2F, 8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
		bodyModel[2].setRotationPoint(-12.5F, -21F, 8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 23, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-11.5F, -14F, 9.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-11.5F, -2F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 23, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-11.5F, -14F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-12.5F, -21F, -10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, -1F, 2F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(12.5F, -2F, 7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 10
		bodyModel[8].setRotationPoint(12.5F, -14F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 11
		bodyModel[9].setRotationPoint(12.5F, -21F, 7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(11.5F, -2F, -8.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 13
		bodyModel[11].setRotationPoint(11.5F, -13F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
		bodyModel[12].setRotationPoint(11.5F, -21F, -8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 34
		bodyModel[13].setRotationPoint(11.5F, -21F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 36
		bodyModel[14].setRotationPoint(12.5F, 6F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[15].setRotationPoint(11.5F, -2F, 7.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 38
		bodyModel[16].setRotationPoint(11.5F, -13F, 8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 39
		bodyModel[17].setRotationPoint(11.5F, -21F, 7.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 2F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[18].setRotationPoint(12.5F, -2F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F); // Box 41
		bodyModel[19].setRotationPoint(12.5F, -14F, -9.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -1F, 0F, 0F, -1F); // Box 42
		bodyModel[20].setRotationPoint(12.5F, -21F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -1F, 0.5F, 2F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 43
		bodyModel[21].setRotationPoint(12.5F, 6F, 0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[22].setRotationPoint(-12.5F, -14F, 8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 47
		bodyModel[23].setRotationPoint(-12.5F, -14F, -9.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 23, 1, 19, 0F); // Box 49
		bodyModel[24].setRotationPoint(-11.5F, -17F, -9.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 51
		bodyModel[25].setRotationPoint(12.5F, -15.5F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[26].setRotationPoint(12.5F, -15.5F, 0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 53
		bodyModel[27].setRotationPoint(-12.5F, -14F, 9.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[28].setRotationPoint(-12.5F, -2F, 8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 55
		bodyModel[29].setRotationPoint(-12.5F, -14F, -10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[30].setRotationPoint(-12.5F, -2F, -9.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 8, 5, 12, 0F); // Box 57
		bodyModel[31].setRotationPoint(-10.5F, -22F, -6F);

		bodyModel[32].addBox(0F, 0F, 0F, 12, 6, 14, 0F); // Box 59
		bodyModel[32].setRotationPoint(-1.5F, -23F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 1F, 2F, -1F, 1F, 2F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F); // Box 60
		bodyModel[33].setRotationPoint(12.5F, -2F, -7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, -2F, 2F, -1F, -2F, 2F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[34].setRotationPoint(12.5F, -2F, 6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F); // Box 62
		bodyModel[35].setRotationPoint(11.5F, -2F, -7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[36].setRotationPoint(11.5F, -2F, 6.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 8F, 0F, 0.2F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 61
		bodyModel[37].setRotationPoint(-3.5F, 5F, 1.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 7F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 62
		bodyModel[38].setRotationPoint(-3.5F, 5F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 63
		bodyModel[39].setRotationPoint(-3F, 7F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 64
		bodyModel[40].setRotationPoint(5F, 7F, -4F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 65
		bodyModel[41].setRotationPoint(-8F, 7F, -5F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 66
		bodyModel[42].setRotationPoint(3F, 7F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[43].setRotationPoint(-9F, 7F, -3F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 68
		bodyModel[44].setRotationPoint(-8F, 7F, 5F);

		bodyModel[45].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 69
		bodyModel[45].setRotationPoint(3F, 7F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 70
		bodyModel[46].setRotationPoint(-7F, 8F, -6F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 71
		bodyModel[47].setRotationPoint(-7F, 7F, -6F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 72
		bodyModel[48].setRotationPoint(4F, 7F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 73
		bodyModel[49].setRotationPoint(4F, 8F, -6F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 74
		bodyModel[50].setRotationPoint(4F, 7F, 5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 75
		bodyModel[51].setRotationPoint(4F, 8F, 5F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 76
		bodyModel[52].setRotationPoint(-7F, 7F, 5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 77
		bodyModel[53].setRotationPoint(-7F, 8F, 5F);

		bodyModel[54].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 78
		bodyModel[54].setRotationPoint(-2.5F, 7F, 4.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 79
		bodyModel[55].setRotationPoint(-2.5F, 7F, -5.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[56].setRotationPoint(6F, -3.5F, 5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[57].setRotationPoint(5.5F, -5.5F, 5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[58].setRotationPoint(6F, -3.5F, 0.899999999999999F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[59].setRotationPoint(5.5F, -5.5F, 0.899999999999999F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 103
		bodyModel[60].setRotationPoint(6F, 1.5F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 104
		bodyModel[61].setRotationPoint(6F, 1.5F, 0.899999999999999F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 105
		bodyModel[62].setRotationPoint(-0.4F, 1.5F, 0.899999999999999F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 106
		bodyModel[63].setRotationPoint(-0.4F, 1.5F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[64].setRotationPoint(3.6F, -3.5F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[65].setRotationPoint(4.1F, -5.5F, 0.899999999999999F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[66].setRotationPoint(3.6F, -3.5F, 0.899999999999999F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[67].setRotationPoint(4.1F, -5.5F, 5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 111
		bodyModel[68].setRotationPoint(6F, 1.5F, -8.6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[69].setRotationPoint(6F, -3.5F, -8.6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[70].setRotationPoint(5.5F, -5.5F, -8.6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[71].setRotationPoint(1.5F, 2.5F, 2.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[72].setRotationPoint(1.5F, 2.5F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 119
		bodyModel[73].setRotationPoint(2.95F, 0.5F, 5.05F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 120
		bodyModel[74].setRotationPoint(2.95F, 0.5F, 0.949999999999999F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 121
		bodyModel[75].setRotationPoint(2.95F, 0.5F, -8.55F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-5.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -5.1F, -0.9F, -4.1F, -5.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -5.1F, 0F, -4.1F); // Box 123
		bodyModel[76].setRotationPoint(-4.45F, 0.5F, 0.949999999999999F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-5.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -5.1F, -0.9F, -4.1F, -5.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -5.1F, 0F, -4.1F); // Box 124
		bodyModel[77].setRotationPoint(-4.45F, 0.5F, 5.05F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4.1F, 0.5F, 0F, -4.1F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -4.1F, 0F, -5F, -4.1F); // Box 125
		bodyModel[78].setRotationPoint(7F, -3.5F, 0.949999999999999F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4.1F, 0.5F, 0F, -4.1F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -4.1F, 0F, -5F, -4.1F); // Box 126
		bodyModel[79].setRotationPoint(7F, -3.5F, 5.05F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4.1F, 0.5F, 0F, -4.1F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -4.1F, 0F, -5F, -4.1F); // Box 127
		bodyModel[80].setRotationPoint(7F, -3.5F, -8.55F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.1F, -1.4F, 0F, -4.1F, -0.9F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4.1F, -0.9F, -5F, -4.1F); // Box 129
		bodyModel[81].setRotationPoint(2.6F, -3.5F, 0.949999999999999F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.1F, -1.4F, 0F, -4.1F, -0.9F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4.1F, -0.9F, -5F, -4.1F); // Box 130
		bodyModel[82].setRotationPoint(2.6F, -3.5F, 5.05F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 24, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 131
		bodyModel[83].setRotationPoint(-11.5F, -15F, -9.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 24, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[84].setRotationPoint(-11.5F, -15F, 6.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 23, 1, 3, 0F); // Box 133
		bodyModel[85].setRotationPoint(-11.5F, -16F, -9.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 23, 1, 3, 0F); // Box 134
		bodyModel[86].setRotationPoint(-11.5F, -16F, 6.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 23, 1, 1, 0F); // Box 135
		bodyModel[87].setRotationPoint(-11.5F, -16F, 4.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 23, 1, 1, 0F); // Box 136
		bodyModel[88].setRotationPoint(-11.5F, -16F, -5.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 137
		bodyModel[89].setRotationPoint(-12.5F, -16F, -4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 138
		bodyModel[90].setRotationPoint(-12.5F, -16F, 0F);

		bodyModel[91].addBox(0F, 1F, 0F, 1, 1, 19, 0F); // Box 140
		bodyModel[91].setRotationPoint(11.5F, -15F, -9.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -2F, -0.6F, 0F, -2F, -0.6F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[92].setRotationPoint(5.1F, -7.5F, 1.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 1F, -0.6F, -0.6F, 1F, -0.6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.6F, -0.6F, 0F, -2.6F, -0.6F, 0F, 2.4F, 0F, 0F, 2.4F); // Box 134
		bodyModel[93].setRotationPoint(5.1F, -7.5F, 4.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[94].setRotationPoint(12F, -13.5F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[95].setRotationPoint(12F, -13.5F, 3F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 147
		bodyModel[96].setRotationPoint(11.5F, 4F, 3.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 148
		bodyModel[97].setRotationPoint(11.5F, 4F, -5.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[98].setRotationPoint(-7.4F, -3.5F, 0.899999999999999F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[99].setRotationPoint(-9.5F, 2.5F, 2.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[100].setRotationPoint(-10.4F, 1.5F, 0.899999999999999F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-5.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -5.1F, -0.9F, -4.1F, -5.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -5.1F, 0F, -4.1F); // Box 172
		bodyModel[101].setRotationPoint(-15.45F, 0.5F, 0.949999999999999F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.1F, -1.4F, 0F, -4.1F, -0.9F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4.1F, -0.9F, -5F, -4.1F); // Box 173
		bodyModel[102].setRotationPoint(-8.4F, -3.5F, 0.949999999999999F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.1F, -1.4F, 0F, -4.1F, -0.9F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4.1F, -0.9F, -5F, -4.1F); // Box 174
		bodyModel[103].setRotationPoint(-8.4F, -3.5F, 5.05F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-5.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -5.1F, -0.9F, -4.1F, -5.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -5.1F, 0F, -4.1F); // Box 175
		bodyModel[104].setRotationPoint(-15.45F, 0.5F, 5.05F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[105].setRotationPoint(-10.4F, 1.5F, 5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[106].setRotationPoint(-5F, 1.5F, 0.899999999999999F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[107].setRotationPoint(-5F, -3.5F, 0.899999999999999F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4.1F, 0.5F, 0F, -4.1F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -4.1F, 0F, -5F, -4.1F); // Box 179
		bodyModel[108].setRotationPoint(-4F, -3.5F, 0.949999999999999F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 180
		bodyModel[109].setRotationPoint(-8.05F, 0.5F, 0.949999999999999F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 181
		bodyModel[110].setRotationPoint(-8.05F, 0.5F, 5.05F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4.1F, 0.5F, 0F, -4.1F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -4.1F, 0F, -5F, -4.1F); // Box 182
		bodyModel[111].setRotationPoint(-4F, -3.5F, 5.05F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[112].setRotationPoint(-5.5F, -5.5F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[113].setRotationPoint(-5.5F, -5.5F, 0.899999999999999F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[114].setRotationPoint(-6.9F, -5.5F, 0.899999999999999F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[115].setRotationPoint(-6.9F, -5.5F, 5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -2F, -0.6F, 0F, -2F, -0.6F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[116].setRotationPoint(-5.9F, -7.5F, 1.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 1F, -0.6F, -0.6F, 1F, -0.6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.6F, -0.6F, 0F, -2.6F, -0.6F, 0F, 2.4F, 0F, 0F, 2.4F); // Box 188
		bodyModel[117].setRotationPoint(-5.9F, -7.5F, 4.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[118].setRotationPoint(-5F, -3.5F, 5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 190
		bodyModel[119].setRotationPoint(-5F, 1.5F, 5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[120].setRotationPoint(-7.4F, -3.5F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[121].setRotationPoint(3.6F, -3.5F, -8.6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.1F, -1.4F, 0F, -4.1F, -0.9F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4.1F, -0.9F, -5F, -4.1F); // Box 193
		bodyModel[122].setRotationPoint(2.6F, -3.5F, -8.55F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-5.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -5.1F, -0.9F, -4.1F, -5.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -5.1F, 0F, -4.1F); // Box 194
		bodyModel[123].setRotationPoint(-4.45F, 0.5F, -8.55F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 195
		bodyModel[124].setRotationPoint(-0.4F, 1.5F, -8.6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[125].setRotationPoint(4.1F, -5.5F, -8.6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[126].setRotationPoint(-8.5F, 2.5F, -8.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[127].setRotationPoint(-10.4F, 1.5F, -8.6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 199
		bodyModel[128].setRotationPoint(-14.45F, 0.5F, -8.55F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.1F, -1.4F, 0F, -4.1F, -0.9F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4.1F, -0.9F, -5F, -4.1F); // Box 200
		bodyModel[129].setRotationPoint(-8.4F, -3.5F, -8.55F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[130].setRotationPoint(-7.4F, -3.5F, -8.6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[131].setRotationPoint(-6.9F, -5.5F, -8.6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4.1F, 0.5F, 0F, -4.1F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -4.1F, 0F, -5F, -4.1F); // Box 203
		bodyModel[132].setRotationPoint(-4F, -3.5F, -8.55F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 204
		bodyModel[133].setRotationPoint(-8.05F, 0.5F, -8.55F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 205
		bodyModel[134].setRotationPoint(-5F, 1.5F, -8.6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[135].setRotationPoint(-5F, -3.5F, -8.6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[136].setRotationPoint(-5.5F, -5.5F, -8.6F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 208
		bodyModel[137].setRotationPoint(-12.5F, 4F, 3.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[138].setRotationPoint(-12.5F, -2F, 6.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[139].setRotationPoint(-12F, -13.5F, 3F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 212
		bodyModel[140].setRotationPoint(-12.5F, 4F, -5.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[141].setRotationPoint(-12F, -13.5F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F); // Box 214
		bodyModel[142].setRotationPoint(-12.5F, -2F, -7.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 215
		bodyModel[143].setRotationPoint(-12.5F, -13F, -9.5F);

		bodyModel[144].addBox(0F, 1F, 0F, 1, 1, 19, 0F); // Box 216
		bodyModel[144].setRotationPoint(-12.5F, -15F, -9.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 217
		bodyModel[145].setRotationPoint(-12.5F, -21F, -8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 218
		bodyModel[146].setRotationPoint(11.5F, -14F, 9.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[147].setRotationPoint(11.5F, -2F, 8.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 220
		bodyModel[148].setRotationPoint(11.5F, -14F, -10.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[149].setRotationPoint(11.5F, -2F, -9.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[150].setRotationPoint(-12.5F, -2F, 7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[151].setRotationPoint(-12.5F, -2F, -8.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 154
		bodyModel[152].setRotationPoint(-14.5F, -2F, -8.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 2F, -1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 2F, 0F, 0.5F); // Box 155
		bodyModel[153].setRotationPoint(-14.5F, 6F, -8.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,2F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 156
		bodyModel[154].setRotationPoint(-14.5F, 6F, 0.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,2F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 1F, 2F, -1F, 1F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 157
		bodyModel[155].setRotationPoint(-14.5F, -2F, 6.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 158
		bodyModel[156].setRotationPoint(-14.5F, -14F, 8.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[157].setRotationPoint(-16.5F, -15.5F, 0.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 160
		bodyModel[158].setRotationPoint(-16.5F, -15.5F, -8.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 2F, 0F, -1F); // Box 161
		bodyModel[159].setRotationPoint(-14.5F, -21F, -8.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 1F, 0F); // Box 162
		bodyModel[160].setRotationPoint(-14.5F, -14F, -9.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 163
		bodyModel[161].setRotationPoint(-14.5F, -21F, 7.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,2F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -2F, 2F, -1F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F); // Box 164
		bodyModel[162].setRotationPoint(-14.5F, -2F, -7.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,2F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[163].setRotationPoint(-14.5F, -2F, 7.5F);
		this.flipAll();
	}
}