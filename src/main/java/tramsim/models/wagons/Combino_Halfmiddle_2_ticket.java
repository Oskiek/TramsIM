package tramsim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Combino_Halfmiddle_2_ticket extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Combino_Halfmiddle_2_ticket() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[184];

		initbodyModel_1();

	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 150
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 151
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 152
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 153
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 154
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 155
		bodyModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 156
		bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 47
		bodyModel[10] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 49
		bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 50
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 52
		bodyModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 140
		bodyModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 141
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 144
		bodyModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 146
		bodyModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 147
		bodyModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 148
		bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 149
		bodyModel[20] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 150
		bodyModel[21] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 151
		bodyModel[22] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 152
		bodyModel[23] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 153
		bodyModel[24] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 154
		bodyModel[25] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 155
		bodyModel[26] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 156
		bodyModel[27] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 175
		bodyModel[31] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 46
		bodyModel[34] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 54
		bodyModel[41] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 56
		bodyModel[42] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 57
		bodyModel[43] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 58
		bodyModel[44] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 61
		bodyModel[45] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 62
		bodyModel[46] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 63
		bodyModel[47] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 64
		bodyModel[48] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 65
		bodyModel[49] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 66
		bodyModel[50] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 91
		bodyModel[51] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 92
		bodyModel[52] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 93
		bodyModel[53] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 102
		bodyModel[54] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 103
		bodyModel[55] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 104
		bodyModel[56] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 105
		bodyModel[57] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 106
		bodyModel[58] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 107
		bodyModel[59] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 108
		bodyModel[60] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 109
		bodyModel[61] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 110
		bodyModel[62] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 111
		bodyModel[63] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 112
		bodyModel[64] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 113
		bodyModel[65] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 114
		bodyModel[66] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 115
		bodyModel[67] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 116
		bodyModel[68] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 117
		bodyModel[69] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 118
		bodyModel[70] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 119
		bodyModel[71] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 120
		bodyModel[72] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 121
		bodyModel[73] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 122
		bodyModel[74] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 123
		bodyModel[75] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 124
		bodyModel[76] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 125
		bodyModel[77] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 228
		bodyModel[78] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 229
		bodyModel[79] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 230
		bodyModel[80] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 231
		bodyModel[81] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 232
		bodyModel[82] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 233
		bodyModel[83] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 234
		bodyModel[84] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 235
		bodyModel[85] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 236
		bodyModel[86] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 237
		bodyModel[87] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 238
		bodyModel[88] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 239
		bodyModel[89] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 240
		bodyModel[90] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 241
		bodyModel[91] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 242
		bodyModel[92] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 243
		bodyModel[93] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 244
		bodyModel[94] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 245
		bodyModel[95] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 246
		bodyModel[96] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 247
		bodyModel[97] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 248
		bodyModel[98] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 249
		bodyModel[99] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 250
		bodyModel[100] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 251
		bodyModel[101] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 252
		bodyModel[102] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 253
		bodyModel[103] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 254
		bodyModel[104] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 55
		bodyModel[105] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 146
		bodyModel[106] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 147
		bodyModel[107] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 346
		bodyModel[108] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 347
		bodyModel[109] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 348
		bodyModel[110] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 175
		bodyModel[111] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 43
		bodyModel[112] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 62
		bodyModel[113] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 63
		bodyModel[114] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 64
		bodyModel[115] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 65
		bodyModel[116] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 66
		bodyModel[117] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 356
		bodyModel[118] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 357
		bodyModel[119] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 358
		bodyModel[120] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 359
		bodyModel[121] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 360
		bodyModel[122] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 361
		bodyModel[123] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 362
		bodyModel[124] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 363
		bodyModel[125] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 364
		bodyModel[126] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 365
		bodyModel[127] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 366
		bodyModel[128] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 367
		bodyModel[129] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 368
		bodyModel[130] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 369
		bodyModel[131] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 370
		bodyModel[132] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 371
		bodyModel[133] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 372
		bodyModel[134] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 373
		bodyModel[135] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 374
		bodyModel[136] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 375
		bodyModel[137] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 376
		bodyModel[138] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 377
		bodyModel[139] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 378
		bodyModel[140] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 379
		bodyModel[141] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 380
		bodyModel[142] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 381
		bodyModel[143] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 382
		bodyModel[144] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 383
		bodyModel[145] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 384
		bodyModel[146] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 385
		bodyModel[147] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 385
		bodyModel[148] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 388
		bodyModel[149] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 397
		bodyModel[150] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 398
		bodyModel[151] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 399
		bodyModel[152] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 400
		bodyModel[153] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 401
		bodyModel[154] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 402
		bodyModel[155] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 403
		bodyModel[156] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 404
		bodyModel[157] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 405
		bodyModel[158] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 406
		bodyModel[159] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 407
		bodyModel[160] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 408
		bodyModel[161] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 409
		bodyModel[162] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 148
		bodyModel[163] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 149
		bodyModel[164] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 150
		bodyModel[165] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 151
		bodyModel[166] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 152
		bodyModel[167] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 153
		bodyModel[168] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 154
		bodyModel[169] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 155
		bodyModel[170] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 418
		bodyModel[171] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 166
		bodyModel[172] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 167
		bodyModel[173] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 168
		bodyModel[174] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 423
		bodyModel[175] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 184
		bodyModel[176] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 185
		bodyModel[177] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 186
		bodyModel[178] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 187
		bodyModel[179] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 188
		bodyModel[180] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 189
		bodyModel[181] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 190
		bodyModel[182] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 191
		bodyModel[183] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 192

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 47
		bodyModel[0].setRotationPoint(-26F, -10F, 7F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 49
		bodyModel[1].setRotationPoint(-26F, -15F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[2].setRotationPoint(-26F, -1F, 7F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 151
		bodyModel[3].setRotationPoint(-26F, 1F, 6F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 152
		bodyModel[4].setRotationPoint(-26F, 1F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 153
		bodyModel[5].setRotationPoint(-26F, -1F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 154
		bodyModel[6].setRotationPoint(-26F, -10F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[7].setRotationPoint(-26F, -11F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 156
		bodyModel[8].setRotationPoint(-26F, -11F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 47
		bodyModel[9].setRotationPoint(26F, -10F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 49
		bodyModel[10].setRotationPoint(26F, -15F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 50
		bodyModel[11].setRotationPoint(27F, -11F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 2, 18, 0F); // Box 52
		bodyModel[12].setRotationPoint(27F, -14F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[13].setRotationPoint(27F, -2F, -9F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 141
		bodyModel[14].setRotationPoint(27F, 1F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 144
		bodyModel[15].setRotationPoint(27F, -12F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 146
		bodyModel[16].setRotationPoint(27F, 1F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[17].setRotationPoint(27F, -2F, 6F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 148
		bodyModel[18].setRotationPoint(27F, -11F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[19].setRotationPoint(27F, -12F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 150
		bodyModel[20].setRotationPoint(26F, -1F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 151
		bodyModel[21].setRotationPoint(26F, 1F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 152
		bodyModel[22].setRotationPoint(26F, 1F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[23].setRotationPoint(26F, -1F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 154
		bodyModel[24].setRotationPoint(26F, -10F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 155
		bodyModel[25].setRotationPoint(26F, -11F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[26].setRotationPoint(26F, -11F, 6F);

		bodyModel[27].addBox(0F, 0F, 0F, 53, 2, 22, 0F); // Box 0
		bodyModel[27].setRotationPoint(-26F, 6F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 53, 5, 1, 0F); // Box 40
		bodyModel[28].setRotationPoint(-26F, 1F, -11F);

		bodyModel[29].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 41
		bodyModel[29].setRotationPoint(-26F, 1F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 175
		bodyModel[30].setRotationPoint(-17F, -10F, 10F);

		bodyModel[31].addShapeBox(-5F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 43
		bodyModel[31].setRotationPoint(-7F, -10F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 53, 5, 1, 0F); // Box 44
		bodyModel[32].setRotationPoint(-26F, -15F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 53, 5, 1, 0F); // Box 46
		bodyModel[33].setRotationPoint(-26F, -15F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 11, 1, 0F); // Box 47
		bodyModel[34].setRotationPoint(-26F, -10F, 10F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 11, 1, 0F); // Box 48
		bodyModel[35].setRotationPoint(-7F, -10F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 11, 1, 0F); // Box 49
		bodyModel[36].setRotationPoint(6F, -10F, 10F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 11, 1, 0F); // Box 50
		bodyModel[37].setRotationPoint(18F, -10F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 15, 5, 1, 0F); // Box 51
		bodyModel[38].setRotationPoint(-7F, 1F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 8, 11, 1, 0F); // Box 52
		bodyModel[39].setRotationPoint(19F, -10F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 54
		bodyModel[40].setRotationPoint(-18F, -10F, -10.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 8, 11, 1, 0F); // Box 56
		bodyModel[41].setRotationPoint(-26F, -10F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 11, 1, 0F); // Box 57
		bodyModel[42].setRotationPoint(-7F, -10F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 11, 1, 0F); // Box 58
		bodyModel[43].setRotationPoint(6F, -10F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 61
		bodyModel[44].setRotationPoint(-5F, -10F, -10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 62
		bodyModel[45].setRotationPoint(-19F, -10F, 9F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 63
		bodyModel[46].setRotationPoint(-6F, -10F, 9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0.5F, -1.25F, -1.25F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[47].setRotationPoint(-18.5F, -10F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 65
		bodyModel[48].setRotationPoint(-6.5F, -10F, 7F);

		bodyModel[49].addBox(0F, 0F, 0F, 13, 5, 3, 0F); // Box 66
		bodyModel[49].setRotationPoint(-18.5F, -15F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 91
		bodyModel[50].setRotationPoint(-23.5F, 4.5F, 2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[51].setRotationPoint(-23.5F, 4.5F, 3F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 93
		bodyModel[52].setRotationPoint(-23.5F, 3.5F, 3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.2F, -0.1F, -0.75F, -0.2F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F); // Box 102
		bodyModel[53].setRotationPoint(-23.5F, 2.9F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 103
		bodyModel[54].setRotationPoint(-24F, -1F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 104
		bodyModel[55].setRotationPoint(-23.5F, 2F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.9F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, -0.9F, 0F, -0.1F); // Box 105
		bodyModel[56].setRotationPoint(-24.5F, 0F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[57].setRotationPoint(-24.5F, 3F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[58].setRotationPoint(-24.5F, 2F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 108
		bodyModel[59].setRotationPoint(-25F, 0F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[60].setRotationPoint(-25F, -1F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[61].setRotationPoint(-24.5F, 3F, 2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[62].setRotationPoint(-24.5F, 2F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 112
		bodyModel[63].setRotationPoint(-25F, 0F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[64].setRotationPoint(-25F, -1F, 2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.2F, -0.1F, -0.75F, -0.2F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F); // Box 114
		bodyModel[65].setRotationPoint(-23.5F, 2.9F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 115
		bodyModel[66].setRotationPoint(-23.5F, 2F, 2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.9F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, -0.9F, 0F, -0.1F); // Box 116
		bodyModel[67].setRotationPoint(-24.5F, 0F, 2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 117
		bodyModel[68].setRotationPoint(-24F, -1F, 2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 118
		bodyModel[69].setRotationPoint(-25F, -2F, 2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 119
		bodyModel[70].setRotationPoint(-25F, -2.2F, 5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 120
		bodyModel[71].setRotationPoint(-25F, -2.2F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 121
		bodyModel[72].setRotationPoint(-25F, -2.8F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 122
		bodyModel[73].setRotationPoint(-25F, -2F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 123
		bodyModel[74].setRotationPoint(-25F, -2.2F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 124
		bodyModel[75].setRotationPoint(-25F, -2.2F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 125
		bodyModel[76].setRotationPoint(-25F, -2.8F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[77].setRotationPoint(22.5F, 4.5F, 3F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 229
		bodyModel[78].setRotationPoint(22.5F, 3.5F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
		bodyModel[79].setRotationPoint(22.5F, 4.5F, 2.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[80].setRotationPoint(21.5F, 3F, 2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[81].setRotationPoint(21.5F, 3F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.2F, -0.1F, -0.75F, -0.2F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F); // Box 233
		bodyModel[82].setRotationPoint(21.5F, 2.9F, 6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 234
		bodyModel[83].setRotationPoint(24.5F, 2F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 235
		bodyModel[84].setRotationPoint(24.5F, 0F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 236
		bodyModel[85].setRotationPoint(25F, -1F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.2F, -0.1F, -0.75F, -0.2F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F); // Box 237
		bodyModel[86].setRotationPoint(21.5F, 2.9F, 2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 238
		bodyModel[87].setRotationPoint(24.5F, 2F, 2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 239
		bodyModel[88].setRotationPoint(24.5F, 0F, 2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 240
		bodyModel[89].setRotationPoint(25F, -1F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 241
		bodyModel[90].setRotationPoint(25F, -2.2F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 242
		bodyModel[91].setRotationPoint(25F, -2F, 6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 243
		bodyModel[92].setRotationPoint(25F, -2.2F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 244
		bodyModel[93].setRotationPoint(25F, -2.8F, 6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[94].setRotationPoint(24.5F, 2F, 6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[95].setRotationPoint(24.5F, 2F, 2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 247
		bodyModel[96].setRotationPoint(25F, 0F, 2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 248
		bodyModel[97].setRotationPoint(25F, 0F, 6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[98].setRotationPoint(25F, -1F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[99].setRotationPoint(25F, -1F, 2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 251
		bodyModel[100].setRotationPoint(25F, -2.2F, 2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 252
		bodyModel[101].setRotationPoint(25F, -2F, 2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 253
		bodyModel[102].setRotationPoint(25F, -2.2F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 254
		bodyModel[103].setRotationPoint(25F, -2.8F, 2F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 55
		bodyModel[104].setRotationPoint(-30F, 6F, -9F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 146
		bodyModel[105].setRotationPoint(-30F, 1F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[106].setRotationPoint(-30F, -2F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 11, 1, 0F); // Box 346
		bodyModel[107].setRotationPoint(-19F, -10F, 10F);

		bodyModel[108].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 347
		bodyModel[108].setRotationPoint(18F, 1F, 10F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 11, 1, 0F); // Box 348
		bodyModel[109].setRotationPoint(25F, -10F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 175
		bodyModel[110].setRotationPoint(8F, -10F, 10F);

		bodyModel[111].addShapeBox(-5F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 43
		bodyModel[111].setRotationPoint(18F, -10F, 10F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 62
		bodyModel[112].setRotationPoint(6F, -10F, 9F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 63
		bodyModel[113].setRotationPoint(19F, -10F, 9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0.5F, -1.25F, -1.25F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[114].setRotationPoint(6.5F, -10F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 65
		bodyModel[115].setRotationPoint(18.5F, -10F, 7F);

		bodyModel[116].addBox(0F, 0F, 0F, 13, 5, 3, 0F); // Box 66
		bodyModel[116].setRotationPoint(6.5F, -15F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 356
		bodyModel[117].setRotationPoint(-23.5F, 4.5F, -3.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 357
		bodyModel[118].setRotationPoint(-23.5F, 4.5F, -10F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 358
		bodyModel[119].setRotationPoint(-23.5F, 3.5F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.2F, -0.1F, -0.75F, -0.2F); // Box 359
		bodyModel[120].setRotationPoint(-23.5F, 2.9F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F); // Box 360
		bodyModel[121].setRotationPoint(-24F, -1F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F); // Box 361
		bodyModel[122].setRotationPoint(-23.5F, 2F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.9F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, -0.9F, 0F, -0.2F); // Box 362
		bodyModel[123].setRotationPoint(-24.5F, 0F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 363
		bodyModel[124].setRotationPoint(-24.5F, 3F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 364
		bodyModel[125].setRotationPoint(-24.5F, 2F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Box 365
		bodyModel[126].setRotationPoint(-25F, 0F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 366
		bodyModel[127].setRotationPoint(-25F, -1F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 367
		bodyModel[128].setRotationPoint(-24.5F, 3F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 368
		bodyModel[129].setRotationPoint(-24.5F, 2F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Box 369
		bodyModel[130].setRotationPoint(-25F, 0F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 370
		bodyModel[131].setRotationPoint(-25F, -1F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.2F, -0.1F, -0.75F, -0.2F); // Box 371
		bodyModel[132].setRotationPoint(-23.5F, 2.9F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F); // Box 372
		bodyModel[133].setRotationPoint(-23.5F, 2F, -6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.9F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, -0.9F, 0F, -0.2F); // Box 373
		bodyModel[134].setRotationPoint(-24.5F, 0F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F); // Box 374
		bodyModel[135].setRotationPoint(-24F, -1F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 375
		bodyModel[136].setRotationPoint(-25F, -2F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 376
		bodyModel[137].setRotationPoint(-25F, -2.2F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 377
		bodyModel[138].setRotationPoint(-25F, -2.2F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 378
		bodyModel[139].setRotationPoint(-25F, -2.8F, -6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 379
		bodyModel[140].setRotationPoint(-25F, -2F, -10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 380
		bodyModel[141].setRotationPoint(-25F, -2.2F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 381
		bodyModel[142].setRotationPoint(-25F, -2.2F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 382
		bodyModel[143].setRotationPoint(-25F, -2.8F, -10F);

		bodyModel[144].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 383
		bodyModel[144].setRotationPoint(-5F, -10F, 10.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 11, 11, 0, 0F); // Box 384
		bodyModel[145].setRotationPoint(8F, -10F, -10.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 5, 11, 0, 0F); // Box 385
		bodyModel[146].setRotationPoint(20F, -10F, 10.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 5, 11, 0, 0F); // Box 385
		bodyModel[147].setRotationPoint(-24F, -10F, 10.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 388
		bodyModel[148].setRotationPoint(7F, 0F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, -5F, 0F, -1F); // Box 397
		bodyModel[149].setRotationPoint(7F, 0F, -6F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 398
		bodyModel[150].setRotationPoint(12F, -10F, -2F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 399
		bodyModel[151].setRotationPoint(7F, -10F, -7F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 400
		bodyModel[152].setRotationPoint(7F, -15F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, -5F, 0F, -1F); // Box 401
		bodyModel[153].setRotationPoint(7F, -15F, -6F);

		bodyModel[154].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 402
		bodyModel[154].setRotationPoint(12F, 0F, -2F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 403
		bodyModel[155].setRotationPoint(21F, -10F, -2F);

		bodyModel[156].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 404
		bodyModel[156].setRotationPoint(12F, 0F, -2F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 405
		bodyModel[157].setRotationPoint(21F, -10F, -10F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 406
		bodyModel[158].setRotationPoint(21F, -10F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 407
		bodyModel[159].setRotationPoint(21F, -10F, -8F);

		bodyModel[160].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Box 408
		bodyModel[160].setRotationPoint(12F, -15F, -2F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Box 409
		bodyModel[161].setRotationPoint(21F, -15F, -10F);

		bodyModel[162].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 148
		bodyModel[162].setRotationPoint(11.5F, 3F, -8.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[163].setRotationPoint(14.5F, -2F, -8.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 150
		bodyModel[164].setRotationPoint(11.5F, 2.9F, -8.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 151
		bodyModel[165].setRotationPoint(14.5F, -2F, -8.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 152
		bodyModel[166].setRotationPoint(12.5F, 0F, -9.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[167].setRotationPoint(15F, -4F, -8.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 154
		bodyModel[168].setRotationPoint(15F, -4F, -8.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 155
		bodyModel[169].setRotationPoint(12.5F, 0F, -4.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 418
		bodyModel[170].setRotationPoint(8F, 1F, -10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 166
		bodyModel[171].setRotationPoint(-25F, -15F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F, 1F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 167
		bodyModel[172].setRotationPoint(-25F, -15F, -4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 51, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 168
		bodyModel[173].setRotationPoint(-25F, -15F, 2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 423
		bodyModel[174].setRotationPoint(22F, -15F, -4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 53, 2, 22, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[175].setRotationPoint(-26F, -17F, -11F);

		bodyModel[176].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 185
		bodyModel[176].setRotationPoint(27F, 6F, -9F);

		bodyModel[177].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 186
		bodyModel[177].setRotationPoint(-30F, 1F, 6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[178].setRotationPoint(-30F, -2F, 6F);

		bodyModel[179].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 188
		bodyModel[179].setRotationPoint(-30F, -11F, 8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[180].setRotationPoint(-30F, -12F, 7F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 190
		bodyModel[181].setRotationPoint(-30F, -11F, -9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 191
		bodyModel[182].setRotationPoint(-30F, -12F, -9F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 2, 18, 0F); // Box 192
		bodyModel[183].setRotationPoint(-30F, -14F, -9F);
		this.flipAll();
	}
}