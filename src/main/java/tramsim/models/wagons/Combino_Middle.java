package tramsim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;


public class Combino_Middle extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public Combino_Middle() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[134];

		initbodyModel_1();

	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 5, 1, textureX, textureY); // Box 47
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 49
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 150
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 151
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 152
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 153
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 154
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 155
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 156
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 47
		bodyModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 49
		bodyModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 50
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 52
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 55
		bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 140
		bodyModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 141
		bodyModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 144
		bodyModel[17] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 146
		bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 147
		bodyModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 148
		bodyModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 149
		bodyModel[21] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 150
		bodyModel[22] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 151
		bodyModel[23] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 152
		bodyModel[24] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 153
		bodyModel[25] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 154
		bodyModel[26] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 155
		bodyModel[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 156
		bodyModel[28] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 15
		bodyModel[32] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 47
		bodyModel[33] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 50
		bodyModel[34] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 55
		bodyModel[36] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 140
		bodyModel[37] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 141
		bodyModel[38] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 144
		bodyModel[39] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 146
		bodyModel[40] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 147
		bodyModel[41] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 148
		bodyModel[42] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 149
		bodyModel[43] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 346
		bodyModel[44] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 385
		bodyModel[45] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 166
		bodyModel[46] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 167
		bodyModel[47] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 168
		bodyModel[48] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 198
		bodyModel[49] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 199
		bodyModel[50] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 200
		bodyModel[51] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 201
		bodyModel[52] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 202
		bodyModel[53] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 203
		bodyModel[54] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 204
		bodyModel[55] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 205
		bodyModel[56] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Box 206
		bodyModel[57] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 7, 47, textureX, textureY); // Box 62
		bodyModel[60] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 63
		bodyModel[61] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 70
		bodyModel[62] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Box 72
		bodyModel[63] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 73
		bodyModel[64] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 74
		bodyModel[65] = new ModelRendererTurbo(this, 7, 47, textureX, textureY); // Box 75
		bodyModel[66] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 76
		bodyModel[67] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 83
		bodyModel[68] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 91
		bodyModel[69] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 92
		bodyModel[70] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 107
		bodyModel[71] = new ModelRendererTurbo(this, 7, 40, textureX, textureY); // Box 108
		bodyModel[72] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 109
		bodyModel[73] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 110
		bodyModel[74] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 111
		bodyModel[75] = new ModelRendererTurbo(this, 22, 22, textureX, textureY); // Box 112
		bodyModel[76] = new ModelRendererTurbo(this, 22, 22, textureX, textureY); // Box 114
		bodyModel[77] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 115
		bodyModel[78] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 117
		bodyModel[79] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 119
		bodyModel[80] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 121
		bodyModel[81] = new ModelRendererTurbo(this, 7, 40, textureX, textureY); // Box 123
		bodyModel[82] = new ModelRendererTurbo(this, 10, 26, textureX, textureY); // Box 130
		bodyModel[83] = new ModelRendererTurbo(this, 10, 26, textureX, textureY); // Box 131
		bodyModel[84] = new ModelRendererTurbo(this, 21, 34, textureX, textureY); // Box 132
		bodyModel[85] = new ModelRendererTurbo(this, 14, 38, textureX, textureY); // Box 133
		bodyModel[86] = new ModelRendererTurbo(this, 21, 34, textureX, textureY); // Box 134
		bodyModel[87] = new ModelRendererTurbo(this, 10, 26, textureX, textureY); // Box 137
		bodyModel[88] = new ModelRendererTurbo(this, 10, 26, textureX, textureY); // Box 138
		bodyModel[89] = new ModelRendererTurbo(this, 14, 38, textureX, textureY); // Box 158
		bodyModel[90] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 242
		bodyModel[91] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 243
		bodyModel[92] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 244
		bodyModel[93] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Box 245
		bodyModel[94] = new ModelRendererTurbo(this, 7, 47, textureX, textureY); // Box 246
		bodyModel[95] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 247
		bodyModel[96] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 248
		bodyModel[97] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 249
		bodyModel[98] = new ModelRendererTurbo(this, 7, 40, textureX, textureY); // Box 250
		bodyModel[99] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 251
		bodyModel[100] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 252
		bodyModel[101] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 253
		bodyModel[102] = new ModelRendererTurbo(this, 22, 22, textureX, textureY); // Box 254
		bodyModel[103] = new ModelRendererTurbo(this, 21, 34, textureX, textureY); // Box 255
		bodyModel[104] = new ModelRendererTurbo(this, 10, 26, textureX, textureY); // Box 256
		bodyModel[105] = new ModelRendererTurbo(this, 10, 26, textureX, textureY); // Box 257
		bodyModel[106] = new ModelRendererTurbo(this, 14, 38, textureX, textureY); // Box 258
		bodyModel[107] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 259
		bodyModel[108] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 260
		bodyModel[109] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 261
		bodyModel[110] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 262
		bodyModel[111] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Box 263
		bodyModel[112] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 264
		bodyModel[113] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 265
		bodyModel[114] = new ModelRendererTurbo(this, 7, 47, textureX, textureY); // Box 266
		bodyModel[115] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 267
		bodyModel[116] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 268
		bodyModel[117] = new ModelRendererTurbo(this, 22, 22, textureX, textureY); // Box 269
		bodyModel[118] = new ModelRendererTurbo(this, 22, 28, textureX, textureY); // Box 270
		bodyModel[119] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 271
		bodyModel[120] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 272
		bodyModel[121] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 273
		bodyModel[122] = new ModelRendererTurbo(this, 7, 40, textureX, textureY); // Box 274
		bodyModel[123] = new ModelRendererTurbo(this, 10, 26, textureX, textureY); // Box 275
		bodyModel[124] = new ModelRendererTurbo(this, 10, 26, textureX, textureY); // Box 276
		bodyModel[125] = new ModelRendererTurbo(this, 21, 34, textureX, textureY); // Box 277
		bodyModel[126] = new ModelRendererTurbo(this, 14, 38, textureX, textureY); // Box 278
		bodyModel[127] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 279
		bodyModel[128] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 280
		bodyModel[129] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 281
		bodyModel[130] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 282
		bodyModel[131] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 283
		bodyModel[132] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 284
		bodyModel[133] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 285

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 47
		bodyModel[0].setRotationPoint(-14F, -10F, 7F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 49
		bodyModel[1].setRotationPoint(-14F, -15F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[2].setRotationPoint(-14F, -1F, 7F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 151
		bodyModel[3].setRotationPoint(-14F, 1F, 6F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 152
		bodyModel[4].setRotationPoint(-14F, 1F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 153
		bodyModel[5].setRotationPoint(-14F, -1F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 154
		bodyModel[6].setRotationPoint(-14F, -10F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[7].setRotationPoint(-14F, -11F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 156
		bodyModel[8].setRotationPoint(-14F, -11F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 47
		bodyModel[9].setRotationPoint(14F, -10F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 49
		bodyModel[10].setRotationPoint(14F, -15F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 50
		bodyModel[11].setRotationPoint(15F, -11F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 2, 18, 0F); // Box 52
		bodyModel[12].setRotationPoint(15F, -14F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 55
		bodyModel[13].setRotationPoint(15F, 6F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[14].setRotationPoint(15F, -2F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 141
		bodyModel[15].setRotationPoint(15F, 1F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 144
		bodyModel[16].setRotationPoint(15F, -12F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 146
		bodyModel[17].setRotationPoint(15F, 1F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[18].setRotationPoint(15F, -2F, 6F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 148
		bodyModel[19].setRotationPoint(15F, -11F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[20].setRotationPoint(15F, -12F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 150
		bodyModel[21].setRotationPoint(14F, -1F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 151
		bodyModel[22].setRotationPoint(14F, 1F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 152
		bodyModel[23].setRotationPoint(14F, 1F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[24].setRotationPoint(14F, -1F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 154
		bodyModel[25].setRotationPoint(14F, -10F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 155
		bodyModel[26].setRotationPoint(14F, -11F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[27].setRotationPoint(14F, -11F, 6F);

		bodyModel[28].addBox(0F, 0F, 0F, 29, 2, 22, 0F); // Box 0
		bodyModel[28].setRotationPoint(-14F, 6F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 29, 5, 1, 0F); // Box 41
		bodyModel[29].setRotationPoint(-14F, 1F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 29, 5, 1, 0F); // Box 44
		bodyModel[30].setRotationPoint(-14F, -15F, 10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 29, 2, 22, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[31].setRotationPoint(-14F, -17F, -11F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 47
		bodyModel[32].setRotationPoint(-14F, -10F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 50
		bodyModel[33].setRotationPoint(-18F, -11F, 8F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 2, 18, 0F); // Box 52
		bodyModel[34].setRotationPoint(-18F, -14F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 55
		bodyModel[35].setRotationPoint(-18F, 6F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[36].setRotationPoint(-18F, -2F, 6F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 141
		bodyModel[37].setRotationPoint(-18F, 1F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[38].setRotationPoint(-18F, -12F, 7F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 146
		bodyModel[39].setRotationPoint(-18F, 1F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[40].setRotationPoint(-18F, -2F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 148
		bodyModel[41].setRotationPoint(-18F, -11F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[42].setRotationPoint(-18F, -12F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 346
		bodyModel[43].setRotationPoint(0F, -10F, 10F);

		bodyModel[44].addBox(0F, 0F, 0F, 10, 11, 0, 0F); // Box 385
		bodyModel[44].setRotationPoint(-10F, -10F, 10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 166
		bodyModel[45].setRotationPoint(-13F, -15F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 167
		bodyModel[46].setRotationPoint(-13F, -15F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 168
		bodyModel[47].setRotationPoint(-13F, -15F, 2F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 198
		bodyModel[48].setRotationPoint(11F, -10F, 10F);

		bodyModel[49].addBox(0F, 0F, 0F, 10, 11, 0, 0F); // Box 199
		bodyModel[49].setRotationPoint(1F, -10F, 10.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 29, 5, 1, 0F); // Box 200
		bodyModel[50].setRotationPoint(-14F, 1F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 201
		bodyModel[51].setRotationPoint(-14F, -10F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 10, 11, 0, 0F); // Box 202
		bodyModel[52].setRotationPoint(-10F, -10F, -10.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 10, 11, 0, 0F); // Box 203
		bodyModel[53].setRotationPoint(1F, -10F, -10.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 204
		bodyModel[54].setRotationPoint(11F, -10F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 29, 5, 1, 0F); // Box 205
		bodyModel[55].setRotationPoint(-14F, -15F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 206
		bodyModel[56].setRotationPoint(0F, -10F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 59
		bodyModel[57].setRotationPoint(-7.5F, 2F, 2F);

		bodyModel[58].addBox(0F, 0F, 0F, 8, 3, 8, 0F); // Box 60
		bodyModel[58].setRotationPoint(-10.5F, 3F, 2F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 62
		bodyModel[59].setRotationPoint(-7F, -1F, 2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[60].setRotationPoint(-7.5F, 0F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 70
		bodyModel[61].setRotationPoint(-10.5F, 2.9F, 2F);

		bodyModel[62].addBox(0F, 0F, 0F, 8, 3, 8, 0F); // Box 72
		bodyModel[62].setRotationPoint(3.5F, 3F, 2F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 73
		bodyModel[63].setRotationPoint(6.5F, 2F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[64].setRotationPoint(6.5F, 0F, 2F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 75
		bodyModel[65].setRotationPoint(7F, -1F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 76
		bodyModel[66].setRotationPoint(3.5F, 2.9F, 2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 83
		bodyModel[67].setRotationPoint(7.5F, 2.9F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[68].setRotationPoint(-6F, 1F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[69].setRotationPoint(-6F, 2F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 107
		bodyModel[70].setRotationPoint(-7.5F, 0F, 2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 108
		bodyModel[71].setRotationPoint(-7.5F, 0F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 109
		bodyModel[72].setRotationPoint(-7.5F, 2F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 110
		bodyModel[73].setRotationPoint(-7.5F, 2F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 111
		bodyModel[74].setRotationPoint(-7F, -1F, 2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 112
		bodyModel[75].setRotationPoint(-7F, -1F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 114
		bodyModel[76].setRotationPoint(8F, -1F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 115
		bodyModel[77].setRotationPoint(7F, -1F, 2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 117
		bodyModel[78].setRotationPoint(6.5F, 2F, 2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 119
		bodyModel[79].setRotationPoint(7.5F, 2F, 6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 121
		bodyModel[80].setRotationPoint(6.5F, 0F, 2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 123
		bodyModel[81].setRotationPoint(7.5F, 0F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 130
		bodyModel[82].setRotationPoint(7F, -2.2F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 131
		bodyModel[83].setRotationPoint(7F, -2.2F, 2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 132
		bodyModel[84].setRotationPoint(7F, -2F, 2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 133
		bodyModel[85].setRotationPoint(7F, -2.8F, 2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 134
		bodyModel[86].setRotationPoint(-7F, -2F, 2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 137
		bodyModel[87].setRotationPoint(-7F, -2.2F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 138
		bodyModel[88].setRotationPoint(-7F, -2.2F, 2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 158
		bodyModel[89].setRotationPoint(-7F, -2.8F, 2F);

		bodyModel[90].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 242
		bodyModel[90].setRotationPoint(-2.5F, 3F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 243
		bodyModel[91].setRotationPoint(-10.5F, 2.9F, 6F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 244
		bodyModel[92].setRotationPoint(-7.5F, 2F, -10F);

		bodyModel[93].addBox(0F, 0F, 0F, 8, 3, 8, 0F); // Box 245
		bodyModel[93].setRotationPoint(-10.5F, 3F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 246
		bodyModel[94].setRotationPoint(-7F, -1F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[95].setRotationPoint(-7.5F, 0F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 248
		bodyModel[96].setRotationPoint(-10.5F, 2.9F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 249
		bodyModel[97].setRotationPoint(-7.5F, 0F, -6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 250
		bodyModel[98].setRotationPoint(-7.5F, 0F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 251
		bodyModel[99].setRotationPoint(-7.5F, 2F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 252
		bodyModel[100].setRotationPoint(-7.5F, 2F, -10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 253
		bodyModel[101].setRotationPoint(-7F, -1F, -6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 254
		bodyModel[102].setRotationPoint(-7F, -1F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 255
		bodyModel[103].setRotationPoint(-7F, -2F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 256
		bodyModel[104].setRotationPoint(-7F, -2.2F, -6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 257
		bodyModel[105].setRotationPoint(-7F, -2.2F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 258
		bodyModel[106].setRotationPoint(-7F, -2.8F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 259
		bodyModel[107].setRotationPoint(-10.5F, 2.9F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 260
		bodyModel[108].setRotationPoint(-6F, 1F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[109].setRotationPoint(-6F, 2F, -10F);

		bodyModel[110].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 262
		bodyModel[110].setRotationPoint(-2.5F, 3F, -10F);

		bodyModel[111].addBox(0F, 0F, 0F, 8, 3, 8, 0F); // Box 263
		bodyModel[111].setRotationPoint(3.5F, 3F, -10F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 264
		bodyModel[112].setRotationPoint(6.5F, 2F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[113].setRotationPoint(6.5F, 0F, -10F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 266
		bodyModel[114].setRotationPoint(7F, -1F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 267
		bodyModel[115].setRotationPoint(3.5F, 2.9F, -6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 268
		bodyModel[116].setRotationPoint(7.5F, 2.9F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 269
		bodyModel[117].setRotationPoint(8F, -1F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 270
		bodyModel[118].setRotationPoint(7F, -1F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 271
		bodyModel[119].setRotationPoint(6.5F, 2F, -6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 272
		bodyModel[120].setRotationPoint(7.5F, 2F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 273
		bodyModel[121].setRotationPoint(6.5F, 0F, -6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 274
		bodyModel[122].setRotationPoint(7.5F, 0F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 275
		bodyModel[123].setRotationPoint(7F, -2.2F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 276
		bodyModel[124].setRotationPoint(7F, -2.2F, -3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 277
		bodyModel[125].setRotationPoint(7F, -2F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 278
		bodyModel[126].setRotationPoint(7F, -2.8F, -6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 13, 1, 10, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[127].setRotationPoint(-5F, -18F, -5F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 280
		bodyModel[128].setRotationPoint(4F, -20F, -3F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 281
		bodyModel[129].setRotationPoint(4F, -20F, 1F);

		bodyModel[130].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 282
		bodyModel[130].setRotationPoint(3F, -18F, 0.5F);
		bodyModel[130].rotateAngleY = -3.14159265F;
		bodyModel[130].rotateAngleZ = 0.52359878F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 283
		bodyModel[131].setRotationPoint(-5.3F, -21.6F, 0.5F);
		bodyModel[131].rotateAngleY = -3.14159265F;
		bodyModel[131].rotateAngleZ = 2.61799388F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 284
		bodyModel[132].setRotationPoint(-5.3F, -21.6F, 0.5F);
		bodyModel[132].rotateAngleY = -3.14159265F;
		bodyModel[132].rotateAngleZ = 2.61799388F;

		bodyModel[133].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 285
		bodyModel[133].setRotationPoint(1F, -27.25F, -8F);

		this.flipAll();
	}
}