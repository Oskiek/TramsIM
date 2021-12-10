package tramsim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Citadis_suspended_middle_panto extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Citadis_suspended_middle_panto() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[161];

		initbodyModel_1();

	}

	private void initbodyModel_1()
	{




		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 373, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 42
		bodyModel[25] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 43
		bodyModel[26] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 49
		bodyModel[27] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 51
		bodyModel[28] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 52
		bodyModel[29] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 53
		bodyModel[30] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 54
		bodyModel[31] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 55
		bodyModel[32] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 56
		bodyModel[33] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 57
		bodyModel[34] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 59
		bodyModel[35] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 60
		bodyModel[36] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 61
		bodyModel[37] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 62
		bodyModel[38] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 63
		bodyModel[39] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 111
		bodyModel[40] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 112
		bodyModel[41] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 113
		bodyModel[42] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 114
		bodyModel[43] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 115
		bodyModel[44] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 116
		bodyModel[45] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 121
		bodyModel[46] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 122
		bodyModel[47] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 127
		bodyModel[48] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 131
		bodyModel[50] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 132
		bodyModel[51] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 133
		bodyModel[52] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 134
		bodyModel[53] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 135
		bodyModel[54] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 136
		bodyModel[55] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 137
		bodyModel[56] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 138
		bodyModel[57] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 140
		bodyModel[58] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 258
		bodyModel[59] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 138
		bodyModel[60] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 140
		bodyModel[61] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 141
		bodyModel[62] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 142
		bodyModel[63] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 143
		bodyModel[64] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 144
		bodyModel[65] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 255
		bodyModel[66] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 146
		bodyModel[67] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 147
		bodyModel[68] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 148
		bodyModel[69] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 156
		bodyModel[70] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 157
		bodyModel[71] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 158
		bodyModel[72] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 159
		bodyModel[73] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 160
		bodyModel[74] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 161
		bodyModel[75] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 162
		bodyModel[76] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 163
		bodyModel[77] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 164
		bodyModel[78] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 165
		bodyModel[79] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 166
		bodyModel[80] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 167
		bodyModel[81] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 169
		bodyModel[82] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 170
		bodyModel[83] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 171
		bodyModel[84] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 172
		bodyModel[85] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 173
		bodyModel[86] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 174
		bodyModel[87] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 175
		bodyModel[88] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 176
		bodyModel[89] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 177
		bodyModel[90] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 178
		bodyModel[91] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 181
		bodyModel[92] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 182
		bodyModel[93] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 183
		bodyModel[94] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 184
		bodyModel[95] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 185
		bodyModel[96] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 186
		bodyModel[97] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 187
		bodyModel[98] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 188
		bodyModel[99] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 189
		bodyModel[100] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 190
		bodyModel[101] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 191
		bodyModel[102] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 192
		bodyModel[103] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 193
		bodyModel[104] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 194
		bodyModel[105] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 195
		bodyModel[106] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 196
		bodyModel[107] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 197
		bodyModel[108] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 198
		bodyModel[109] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 199
		bodyModel[110] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 200
		bodyModel[111] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 201
		bodyModel[112] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 202
		bodyModel[113] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 203
		bodyModel[114] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 204
		bodyModel[115] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 205
		bodyModel[116] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 206
		bodyModel[117] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 207
		bodyModel[118] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 208
		bodyModel[119] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 209
		bodyModel[120] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 210
		bodyModel[121] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 211
		bodyModel[122] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 264
		bodyModel[123] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 214
		bodyModel[124] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 215
		bodyModel[125] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 216
		bodyModel[126] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 217
		bodyModel[127] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 218
		bodyModel[128] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 219
		bodyModel[129] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 220
		bodyModel[130] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 221
		bodyModel[131] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 222
		bodyModel[132] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 223
		bodyModel[133] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 224
		bodyModel[134] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 225
		bodyModel[135] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 226
		bodyModel[136] = new ModelRendererTurbo(this, 449, 79, textureX, textureY); // Box 227
		bodyModel[137] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 228
		bodyModel[138] = new ModelRendererTurbo(this, 457, 79, textureX, textureY); // Box 229
		bodyModel[139] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 230
		bodyModel[140] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 231
		bodyModel[141] = new ModelRendererTurbo(this, 18, 92, textureX, textureY); // Box 8
		bodyModel[142] = new ModelRendererTurbo(this, 18, 92, textureX, textureY); // Box 9
		bodyModel[143] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 10
		bodyModel[144] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 11
		bodyModel[145] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 12
		bodyModel[146] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 13
		bodyModel[147] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 15
		bodyModel[148] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 17
		bodyModel[149] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 19
		bodyModel[150] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 21
		bodyModel[151] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 22
		bodyModel[152] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 24
		bodyModel[153] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 22
		bodyModel[154] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 23
		bodyModel[155] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 24
		bodyModel[156] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 25
		bodyModel[157] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 27
		bodyModel[158] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 30
		bodyModel[159] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 19
		bodyModel[160] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 20

		bodyModel[0].addShapeBox(0F, 0F, 0F, 48, 1, 19, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, -4F, 0.5F, -1F, -4F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 0
		bodyModel[0].setRotationPoint(-22F, 6F, -9.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-9F, -2F, 8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 7, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 1F); // Box 2
		bodyModel[2].setRotationPoint(-22F, -21F, 8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-9F, -14F, 9.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-9F, -2F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 18, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-9F, -14F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 48, 7, 1, 0F,0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-22F, -21F, -10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, -1F, 2F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(22F, -2F, 7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 10
		bodyModel[8].setRotationPoint(22F, -14F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 11
		bodyModel[9].setRotationPoint(22F, -21F, 7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(21F, -2F, -8.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 13
		bodyModel[11].setRotationPoint(21F, -13F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
		bodyModel[12].setRotationPoint(21F, -21F, -8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 30
		bodyModel[13].setRotationPoint(-21F, -14F, 9.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[14].setRotationPoint(-21F, -2F, 8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 32
		bodyModel[15].setRotationPoint(-21F, -14F, -10.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[16].setRotationPoint(-21F, -2F, -9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 34
		bodyModel[17].setRotationPoint(21F, -21F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 36
		bodyModel[18].setRotationPoint(22F, 6F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[19].setRotationPoint(21F, -2F, 7.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 38
		bodyModel[20].setRotationPoint(21F, -13F, 8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 39
		bodyModel[21].setRotationPoint(21F, -21F, 7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 2F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[22].setRotationPoint(22F, -2F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F); // Box 41
		bodyModel[23].setRotationPoint(22F, -14F, -9.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -1F, 0F, 0F, -1F); // Box 42
		bodyModel[24].setRotationPoint(22F, -21F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 43
		bodyModel[25].setRotationPoint(22F, 6F, 0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 48, 1, 19, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[26].setRotationPoint(-22F, -17F, -9.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 51
		bodyModel[27].setRotationPoint(22F, -15.5F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[28].setRotationPoint(22F, -15.5F, 0.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 53
		bodyModel[29].setRotationPoint(-22F, -14F, 9.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[30].setRotationPoint(-22F, -2F, 8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 55
		bodyModel[31].setRotationPoint(-22F, -14F, -10.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[32].setRotationPoint(-22F, -2F, -9.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 8, 5, 12, 0F); // Box 57
		bodyModel[33].setRotationPoint(-20F, -22F, -6F);

		bodyModel[34].addBox(0F, 0F, 0F, 12, 6, 14, 0F); // Box 59
		bodyModel[34].setRotationPoint(8F, -23F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 1F, 2F, -1F, 1F, 2F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F); // Box 60
		bodyModel[35].setRotationPoint(22F, -2F, -7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, -2F, 2F, -1F, -2F, 2F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[36].setRotationPoint(22F, -2F, 6.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F); // Box 62
		bodyModel[37].setRotationPoint(21F, -2F, -7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[38].setRotationPoint(21F, -2F, 6.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 111
		bodyModel[39].setRotationPoint(-6.5F, 2.5F, -8.6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[40].setRotationPoint(-6.5F, -2.5F, -8.6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[41].setRotationPoint(-7F, -4.5F, -8.6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[42].setRotationPoint(6.6F, -4.5F, -8.6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[43].setRotationPoint(6.1F, -2.5F, -8.6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[44].setRotationPoint(2.1F, 2.5F, -8.6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 121
		bodyModel[45].setRotationPoint(-9.55F, 1.5F, -8.55F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 122
		bodyModel[46].setRotationPoint(-1.95F, 1.5F, -8.55F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4.1F, 0.5F, 0F, -4.1F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -4.1F, 0F, -5F, -4.1F); // Box 127
		bodyModel[47].setRotationPoint(-5.5F, -2.5F, -8.55F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.1F, -1.4F, 0F, -4.1F, -0.9F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4.1F, -0.9F, -5F, -4.1F); // Box 128
		bodyModel[48].setRotationPoint(5.1F, -2.5F, -8.55F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 42, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 131
		bodyModel[49].setRotationPoint(-21F, -15F, -9.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 42, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[50].setRotationPoint(-21F, -15F, 6.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 42, 1, 3, 0F); // Box 133
		bodyModel[51].setRotationPoint(-21F, -16F, -9.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 42, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[52].setRotationPoint(-21F, -16F, 6.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 42, 1, 1, 0F); // Box 135
		bodyModel[53].setRotationPoint(-21F, -16F, 4.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 42, 1, 1, 0F); // Box 136
		bodyModel[54].setRotationPoint(-21F, -16F, -5.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 46, 1, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F); // Box 137
		bodyModel[55].setRotationPoint(-21F, -16F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 46, 1, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[56].setRotationPoint(-21F, -16F, 0F);

		bodyModel[57].addBox(0F, 1F, 0F, 1, 1, 19, 0F); // Box 140
		bodyModel[57].setRotationPoint(21F, -15F, -9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[58].setRotationPoint(14.5F, 2.5F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 138
		bodyModel[59].setRotationPoint(14.5F, -3.5F, 0.0999999999999996F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, -1.2F, -1F, 0F, -1.2F); // Box 140
		bodyModel[60].setRotationPoint(14.5F, -5.5F, -0.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 141
		bodyModel[61].setRotationPoint(14.5F, -5.5F, 0.0999999999999996F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F, 0.6F, -1F, 0F, 0.6F, -1F, 0F, -1.2F, 0.4F, 0F, -1.2F); // Box 142
		bodyModel[62].setRotationPoint(13.9F, -5.5F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, -1.2F, -1F, 0F, -1.2F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[63].setRotationPoint(14.5F, -3.5F, -0.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.4F, 0F, 0.6F, -1F, 0F, 0.6F, -1F, 0F, -1.2F, 0.4F, 0F, -1.2F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 144
		bodyModel[64].setRotationPoint(13.9F, -3.5F, -0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[65].setRotationPoint(21.5F, -13.5F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[66].setRotationPoint(21.5F, -13.5F, 3F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 147
		bodyModel[67].setRotationPoint(21F, 4F, 3.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 148
		bodyModel[68].setRotationPoint(21F, 4F, -5.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[69].setRotationPoint(-26F, -15.5F, 0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[70].setRotationPoint(-24F, -21F, 7.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 158
		bodyModel[71].setRotationPoint(-24F, -14F, 8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,2F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[72].setRotationPoint(-24F, -2F, 7.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,2F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 1F, 2F, -1F, 1F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 160
		bodyModel[73].setRotationPoint(-24F, -2F, 6.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,2F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -2F, 2F, -1F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F); // Box 161
		bodyModel[74].setRotationPoint(-24F, -2F, -7.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 2F, 0F, 0.5F); // Box 162
		bodyModel[75].setRotationPoint(-24F, 6F, -8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 163
		bodyModel[76].setRotationPoint(-24F, 6F, 0.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 1F, 0F); // Box 164
		bodyModel[77].setRotationPoint(-24F, -14F, -9.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 2F, 0F, -1F); // Box 165
		bodyModel[78].setRotationPoint(-24F, -21F, -8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 166
		bodyModel[79].setRotationPoint(-26F, -15.5F, -8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 167
		bodyModel[80].setRotationPoint(-24F, -2F, -8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[81].setRotationPoint(-15F, -14F, 9.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[82].setRotationPoint(-15F, -2F, 8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 171
		bodyModel[83].setRotationPoint(-15F, -14F, -10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[84].setRotationPoint(-15F, -2F, -9.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 173
		bodyModel[85].setRotationPoint(9F, -14F, -10.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 174
		bodyModel[86].setRotationPoint(15F, -14F, -10.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[87].setRotationPoint(15F, -2F, -9.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[88].setRotationPoint(9F, -2F, -9.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[89].setRotationPoint(21F, -2F, -9.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 178
		bodyModel[90].setRotationPoint(21F, -14F, -10.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[91].setRotationPoint(15F, -2F, 8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[92].setRotationPoint(9F, -2F, 8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 183
		bodyModel[93].setRotationPoint(9F, -14F, 9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 184
		bodyModel[94].setRotationPoint(15F, -14F, 9.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 185
		bodyModel[95].setRotationPoint(-22F, -21F, -8F);

		bodyModel[96].addBox(0F, 1F, 0F, 1, 1, 19, 0F); // Box 186
		bodyModel[96].setRotationPoint(-22F, -15F, -9.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 187
		bodyModel[97].setRotationPoint(-22F, 4F, -5.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 188
		bodyModel[98].setRotationPoint(-22F, 4F, 3.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[99].setRotationPoint(-21.5F, -13.5F, 3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[100].setRotationPoint(-21.5F, -13.5F, -5F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 191
		bodyModel[101].setRotationPoint(-22F, -13F, -9.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[102].setRotationPoint(-22F, -2F, -8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F); // Box 193
		bodyModel[103].setRotationPoint(-22F, -2F, -7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[104].setRotationPoint(-22F, -2F, 6.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[105].setRotationPoint(-22F, -2F, 7.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 196
		bodyModel[106].setRotationPoint(-22F, -13F, 8.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[107].setRotationPoint(21F, -2F, 8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 198
		bodyModel[108].setRotationPoint(21F, -14F, 9.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[109].setRotationPoint(-15.5F, 2.5F, -0.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.4F, 0F, 0.6F, -1F, 0F, 0.6F, -1F, 0F, -1.2F, 0.4F, 0F, -1.2F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 200
		bodyModel[110].setRotationPoint(-16.1F, -3.5F, -0.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 201
		bodyModel[111].setRotationPoint(-15.5F, -3.5F, 0.0999999999999996F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F, 0.6F, -1F, 0F, 0.6F, -1F, 0F, -1.2F, 0.4F, 0F, -1.2F); // Box 202
		bodyModel[112].setRotationPoint(-16.1F, -5.5F, -0.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, -1.2F, -1F, 0F, -1.2F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[113].setRotationPoint(-15.5F, -3.5F, -0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, -1.2F, -1F, 0F, -1.2F); // Box 204
		bodyModel[114].setRotationPoint(-15.5F, -5.5F, -0.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 205
		bodyModel[115].setRotationPoint(-15.5F, -5.5F, 0.0999999999999996F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[116].setRotationPoint(-2.2F, -2.5F, 6.9F);
		bodyModel[116].rotateAngleX = -1.50098316F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, -0.9F, 0F, -4.1F, -0.9F, 0F, -4.1F, -0.9F, -4.1F, 0F, -0.9F, -4.1F, 0F, 0F, 0F, -4.1F, 0F, 0F, -4.1F, 0F, -4.1F, 0F, 0F, -4.1F); // Box 207
		bodyModel[117].setRotationPoint(-2.15F, -2F, 7.95F);
		bodyModel[117].rotateAngleX = -1.50098316F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, -0.9F, 0F, -4.1F, -0.9F, 0F, -4.1F, -0.9F, -4.1F, 0F, -0.9F, -4.1F, 0F, 0F, 0F, -4.1F, 0F, 0F, -4.1F, 0F, -4.1F, 0F, 0F, -4.1F); // Box 208
		bodyModel[118].setRotationPoint(-6.45F, -2F, 7.95F);
		bodyModel[118].rotateAngleX = -1.50098316F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[119].setRotationPoint(-6.5F, -2.5F, 6.9F);
		bodyModel[119].rotateAngleX = -1.50098316F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, -0.9F, 0F, -4.1F, -0.9F, 0F, -4.1F, -0.9F, -4.1F, 0F, -0.9F, -4.1F, 0F, 0F, 0F, -4.1F, 0F, 0F, -4.1F, 0F, -4.1F, 0F, 0F, -4.1F); // Box 210
		bodyModel[120].setRotationPoint(2.05F, -2F, 7.95F);
		bodyModel[120].rotateAngleX = -1.50098316F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[121].setRotationPoint(2F, -2.5F, 6.9F);
		bodyModel[121].rotateAngleX = -1.50098316F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[122].setRotationPoint(-7.7F, 1.5F, 6F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 214
		bodyModel[123].setRotationPoint(-8F, 1.5F, 6.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 215
		bodyModel[124].setRotationPoint(6.5F, 1.5F, 6.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[125].setRotationPoint(-7F, 1.5F, 7.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 30, 4, 1, 0F,0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -16F, -2F, 0F, -16F, -2F, 0F, 0F, -2F, 0F); // Box 217
		bodyModel[126].setRotationPoint(-7F, -2.5F, 8.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, 0F, -1F, 0F, 0F, -1F); // Box 218
		bodyModel[127].setRotationPoint(-8.5F, -1.5F, 9.1F);
		bodyModel[127].rotateAngleZ = 1.57079633F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 219
		bodyModel[128].setRotationPoint(6.5F, -1.5F, 8.6F);
		bodyModel[128].rotateAngleZ = 1.57079633F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[129].setRotationPoint(-8.5F, -8.5F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[130].setRotationPoint(-8.5F, -0.5F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[131].setRotationPoint(-8.5F, -14.5F, 8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[132].setRotationPoint(8F, -8.5F, 7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, 0F, -1F, 0F, 0F, -1F); // Box 224
		bodyModel[133].setRotationPoint(8F, -14.5F, 8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[134].setRotationPoint(8F, -0.5F, 8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 226
		bodyModel[135].setRotationPoint(9F, -14.5F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 227
		bodyModel[136].setRotationPoint(9F, -8.5F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 228
		bodyModel[137].setRotationPoint(9F, -0.5F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 229
		bodyModel[138].setRotationPoint(-8.5F, -8.5F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 230
		bodyModel[139].setRotationPoint(-8.5F, -14.5F, -9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 231
		bodyModel[140].setRotationPoint(-8.5F, -0.5F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F); // Box 8
		bodyModel[141].setRotationPoint(-2.5F, -34.5F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F); // Box 9
		bodyModel[142].setRotationPoint(-0.5F, -34.5F, -5F);

		bodyModel[143].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 10
		bodyModel[143].setRotationPoint(-2.5F, -33.5F, -4.75F);

		bodyModel[144].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 11
		bodyModel[144].setRotationPoint(-2.5F, -33.5F, 3.25F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 12
		bodyModel[145].setRotationPoint(-0.5F, -34.5F, -8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 13
		bodyModel[146].setRotationPoint(-2.5F, -34.5F, 6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 15
		bodyModel[147].setRotationPoint(-2.5F, -34.5F, -8F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-6.5F, 0F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, 0.5F, -6.5F, 0F, 0.5F, 3F, 1F, -4.5F, -3.5F, 1F, -4.5F, -3.5F, 1F, 4F, 3F, 1F, 4F); // Box 17
		bodyModel[148].setRotationPoint(-8.5F, -32.5F, -5.25F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[149].setRotationPoint(-3.5F, -20.5F, -4.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[150].setRotationPoint(-3.5F, -20.5F, 3.25F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 22
		bodyModel[151].setRotationPoint(-4F, -19.5F, -5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 24
		bodyModel[152].setRotationPoint(-0.5F, -34.5F, 6F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 22
		bodyModel[153].setRotationPoint(-1.5F, -21.5F, -5F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 23
		bodyModel[154].setRotationPoint(-4F, -19.5F, 2.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 24
		bodyModel[155].setRotationPoint(1F, -19.5F, -5F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 25
		bodyModel[156].setRotationPoint(1F, -19.5F, 2.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,1.5F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 1.5F, 1F, 0F, -7F, -2F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, -7F, -2F, 0F); // Box 27
		bodyModel[157].setRotationPoint(-8.5F, -25.5F, -0.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-6.5F, 0F, 0.5F, 6F, 0F, 0.5F, 6F, 0F, -0.5F, -6.5F, 0F, -0.5F, 3F, 1F, 4F, -3.5F, 1F, 4F, -3.5F, 1F, -4.5F, 3F, 1F, -4.5F); // Box 30
		bodyModel[158].setRotationPoint(-8.5F, -32.5F, 3.75F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 19
		bodyModel[159].setRotationPoint(-10F, -27F, -0.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,1F, 1F, -0.7F, -1.5F, 1F, -0.7F, -1.5F, 1F, 0F, 1F, 1F, 0F, -8F, -1.5F, -0.7F, 7F, -2F, -0.7F, 7F, -2F, 0F, -8F, -1.5F, 0F); // Box 20
		bodyModel[160].setRotationPoint(-9.5F, -25F, -1.17F);
		this.flipAll();
	}
}