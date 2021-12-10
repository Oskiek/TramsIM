
package spanish_pack.models.trains; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Renfe269 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public Renfe269() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[158];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 152
		bodyModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 151
		bodyModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 153
		bodyModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 456
		bodyModel[47] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 460
		bodyModel[48] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 385
		bodyModel[49] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 386
		bodyModel[50] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 387
		bodyModel[51] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 394
		bodyModel[52] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 62
		bodyModel[60] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 63
		bodyModel[61] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 64
		bodyModel[62] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 66
		bodyModel[64] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 67
		bodyModel[65] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 69
		bodyModel[67] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 70
		bodyModel[68] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 71
		bodyModel[69] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 73
		bodyModel[71] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 74
		bodyModel[72] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 75
		bodyModel[73] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 81
		bodyModel[77] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 82
		bodyModel[78] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 83
		bodyModel[79] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 84
		bodyModel[80] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 85
		bodyModel[81] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 86
		bodyModel[82] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 87
		bodyModel[83] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 88
		bodyModel[84] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 89
		bodyModel[85] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 90
		bodyModel[86] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 91
		bodyModel[87] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 92
		bodyModel[88] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 93
		bodyModel[89] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 94
		bodyModel[90] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 95
		bodyModel[91] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 91
		bodyModel[92] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 92
		bodyModel[93] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 101
		bodyModel[94] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 102
		bodyModel[95] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 4
		bodyModel[96] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 8
		bodyModel[97] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 9
		bodyModel[98] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 10
		bodyModel[99] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 107
		bodyModel[100] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 108
		bodyModel[101] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 109
		bodyModel[102] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 110
		bodyModel[103] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 111
		bodyModel[104] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 112
		bodyModel[105] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 113
		bodyModel[106] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 114
		bodyModel[107] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 115
		bodyModel[108] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 116
		bodyModel[109] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 117
		bodyModel[110] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 118
		bodyModel[111] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 119
		bodyModel[112] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 120
		bodyModel[113] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 122
		bodyModel[114] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 123
		bodyModel[115] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 124
		bodyModel[116] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 125
		bodyModel[117] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 126
		bodyModel[118] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 127
		bodyModel[119] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 129
		bodyModel[121] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 130
		bodyModel[122] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 131
		bodyModel[123] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 132
		bodyModel[124] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 133
		bodyModel[125] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 134
		bodyModel[126] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 135
		bodyModel[127] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 136
		bodyModel[128] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 137
		bodyModel[129] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 138
		bodyModel[130] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 139
		bodyModel[131] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 140
		bodyModel[132] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 142
		bodyModel[133] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 143
		bodyModel[134] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 145
		bodyModel[135] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 146
		bodyModel[136] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 147
		bodyModel[137] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 148
		bodyModel[138] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 149
		bodyModel[139] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 150
		bodyModel[140] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 151
		bodyModel[141] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 152
		bodyModel[142] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 153
		bodyModel[143] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 154
		bodyModel[144] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 155
		bodyModel[145] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 156
		bodyModel[146] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 157
		bodyModel[147] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 158
		bodyModel[148] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 159
		bodyModel[149] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 160
		bodyModel[150] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 161
		bodyModel[151] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 162
		bodyModel[152] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 163
		bodyModel[153] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 164
		bodyModel[154] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 165
		bodyModel[155] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 166
		bodyModel[156] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 167
		bodyModel[157] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 168

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 18, 10, 0F,0.2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 0
		bodyModel[0].setRotationPoint(-34F, -17F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 18, 10, 0F,0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0.2F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-34F, -17F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 62, 2, 20, 0F,1F, 0F, 1.4F, 1F, 0F, 1.4F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1.4F, 1F, 0F, 1.4F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-32F, 1F, -9.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 62, 18, 1, 0F,1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-32F, -17F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 62, 18, 1, 0F,1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-32F, -17F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 62, 1, 20, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 8
		bodyModel[5].setRotationPoint(-32F, -19F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-33F, 3F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[7].setRotationPoint(-34.5F, -1.5F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[8].setRotationPoint(-34.5F, -1.5F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 151
		bodyModel[9].setRotationPoint(-34.5F, -0.5F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[10].setRotationPoint(-34.5F, -0.5F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(-34.5F, -1.5F, 2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[12].setRotationPoint(-34.5F, -1.5F, 3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 16
		bodyModel[13].setRotationPoint(-34.5F, -0.5F, 3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-34.5F, -0.5F, 2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(-34.5F, -1.5F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-34.5F, -1.5F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 20
		bodyModel[17].setRotationPoint(-34.5F, -0.5F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[18].setRotationPoint(-34.5F, -0.5F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-34.5F, -1.5F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(-34.5F, -1.5F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 24
		bodyModel[21].setRotationPoint(-34.5F, -0.5F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(-34.5F, -0.5F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.35F, 1F, -0.7F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, -0.35F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(-34F, -17F, -11.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -0.35F, 1F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.7F); // Box 27
		bodyModel[24].setRotationPoint(-34F, -17F, 10.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.7F); // Box 28
		bodyModel[25].setRotationPoint(-33.9F, 1F, 10.4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-33.9F, 1F, -11.4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 30
		bodyModel[27].setRotationPoint(-33.9F, 1F, 0.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(-33.9F, 1F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.6F, -0.65F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.7F); // Box 32
		bodyModel[29].setRotationPoint(-34F, -19F, 10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.8F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.35F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(-34F, -19F, -11.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(-34F, -19F, 0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(-34F, -19F, -10.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[33].setRotationPoint(-33F, 3F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 37
		bodyModel[34].setRotationPoint(30.9F, 1F, 0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, 0F, 0F, -0.5F); // Box 38
		bodyModel[35].setRotationPoint(30.9F, 1F, 10.4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, -0.35F, 1F, -0.7F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, 0F, 0F, -0.5F); // Box 39
		bodyModel[36].setRotationPoint(31F, -17F, 10.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 18, 10, 0F,0F, 1F, 0F, 0.2F, 1F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 40
		bodyModel[37].setRotationPoint(31F, -17F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 18, 10, 0F,0F, 1F, 0.5F, 0F, 1F, 0.5F, 0.2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[38].setRotationPoint(31F, -17F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 42
		bodyModel[39].setRotationPoint(30.9F, 1F, -10.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[40].setRotationPoint(30.9F, 1F, -11.4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 1F, -0.5F, -0.35F, 1F, -0.7F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[41].setRotationPoint(31F, -17F, -11.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.6F, -0.65F, -0.5F, -0.8F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[42].setRotationPoint(31F, -19F, -11.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[43].setRotationPoint(31F, -19F, -10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[44].setRotationPoint(31F, -19F, 0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.65F, -0.5F, -0.8F, 0F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, 0F, 0F, -0.5F); // Box 48
		bodyModel[45].setRotationPoint(31F, -19F, 10.5F);

		bodyModel[46].addShapeBox(-18F, 0F, -3F, 18, 1, 12, 0F,-9F, 0F, 0F, 1F, -0.5F, -1F, 1F, -0.5F, -7F, -9F, 0F, -6F, -9F, 0F, 0F, 1F, 0.5F, -1F, 1F, 0.5F, -7F, -9F, 0F, -6F); // Box 456
		bodyModel[46].setRotationPoint(-18F, -21.5F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, -1F, 8, 1, 2, 0F,1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F); // Box 460
		bodyModel[47].setRotationPoint(-25F, -20.5F, 0F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 385
		bodyModel[48].setRotationPoint(-27F, -20.5F, -4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 386
		bodyModel[49].setRotationPoint(-27F, -19.5F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 387
		bodyModel[50].setRotationPoint(-27F, -19.5F, 3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 394
		bodyModel[51].setRotationPoint(-29F, -22.5F, -5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 55
		bodyModel[52].setRotationPoint(23F, -19.5F, 3F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 56
		bodyModel[53].setRotationPoint(23F, -20.5F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 57
		bodyModel[54].setRotationPoint(23F, -19.5F, -5F);

		bodyModel[55].addShapeBox(-9F, -1F, -1F, 8, 1, 2, 0F,0F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F); // Box 58
		bodyModel[55].setRotationPoint(24F, -20F, 0F);

		bodyModel[56].addShapeBox(1F, -1F, -3F, 18, 1, 12, 0F,1F, 0F, -1F, -9F, 4F, 0F, -9F, 4F, -6F, 1F, 0F, -7F, 1F, 0F, -1F, -9F, -4F, 0F, -9F, -4F, -6F, 1F, 0F, -7F); // Box 59
		bodyModel[56].setRotationPoint(15F, -23.5F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[57].setRotationPoint(23.5F, -29.5F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[58].setRotationPoint(-34F, 3F, 5.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[59].setRotationPoint(-34F, 3F, -10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.35F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[60].setRotationPoint(-34F, 3F, -11.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.7F); // Box 64
		bodyModel[61].setRotationPoint(-34F, 3F, 10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 65
		bodyModel[62].setRotationPoint(-36F, 2.5F, 5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 66
		bodyModel[63].setRotationPoint(-36F, 2.5F, -9F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 67
		bodyModel[64].setRotationPoint(-35F, 3F, -8.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 68
		bodyModel[65].setRotationPoint(-35F, 3F, 6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 62, 1, 1, 0F,1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 69
		bodyModel[66].setRotationPoint(-32F, -19F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 62, 1, 1, 0F,1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 70
		bodyModel[67].setRotationPoint(-32F, -19F, 10F);

		bodyModel[68].addBox(0F, 0F, 0F, 40, 18, 20, 0F); // Box 71
		bodyModel[68].setRotationPoint(-21F, -17F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[69].setRotationPoint(28F, 3F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[70].setRotationPoint(31F, 3F, -11.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 74
		bodyModel[71].setRotationPoint(33F, 2.5F, -9F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 75
		bodyModel[72].setRotationPoint(32F, 3F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.7F, 0F, 0F, -0.5F); // Box 78
		bodyModel[73].setRotationPoint(31F, 3F, 10.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[74].setRotationPoint(28F, 3F, 7F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 80
		bodyModel[75].setRotationPoint(32F, 3F, 6.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[76].setRotationPoint(33F, 2.5F, 5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 82
		bodyModel[77].setRotationPoint(-34F, 3F, -5.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[78].setRotationPoint(-34F, 5F, -10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[79].setRotationPoint(-34F, 5F, 7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 85
		bodyModel[80].setRotationPoint(-33.75F, 4F, -5.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[81].setRotationPoint(30.75F, 4F, -4.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[82].setRotationPoint(31F, 5F, 7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[83].setRotationPoint(31F, 3F, 5.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[84].setRotationPoint(31F, 3F, -5.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[85].setRotationPoint(31F, 3F, -10.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[86].setRotationPoint(31F, 5F, -10.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 92
		bodyModel[87].setRotationPoint(-33F, 5F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 93
		bodyModel[88].setRotationPoint(-33F, 5F, 7F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 94
		bodyModel[89].setRotationPoint(29F, 5F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 95
		bodyModel[90].setRotationPoint(29F, 5F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[91].setRotationPoint(-34.5F, -20F, -1.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[92].setRotationPoint(30.5F, -20F, -1.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 8, 4, 9, 0F); // Box 101
		bodyModel[93].setRotationPoint(-2F, 3F, 0F);

		bodyModel[94].addBox(0F, 0F, 0F, 6, 4, 11, 0F); // Box 102
		bodyModel[94].setRotationPoint(-8F, 3F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[95].setRotationPoint(-34.6F, -20F, -1.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 8
		bodyModel[96].setRotationPoint(-34.6F, -20F, -0.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 9
		bodyModel[97].setRotationPoint(-34.6F, -19F, -0.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 10
		bodyModel[98].setRotationPoint(-34.6F, -19F, -1.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[99].setRotationPoint(-34.6F, -20F, -0.25F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 108
		bodyModel[100].setRotationPoint(-34.6F, -20F, 0.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 109
		bodyModel[101].setRotationPoint(-34.6F, -19F, 0.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 110
		bodyModel[102].setRotationPoint(-34.6F, -19F, -0.25F);

		bodyModel[103].addBox(0F, 0F, 0F, 11, 3, 12, 0F); // Box 111
		bodyModel[103].setRotationPoint(2F, -22F, -6F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 112
		bodyModel[104].setRotationPoint(-31F, -20F, -9F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 113
		bodyModel[105].setRotationPoint(25F, -20F, 8F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 5, 3, 0F); // Box 114
		bodyModel[106].setRotationPoint(-28F, -4F, 3F);

		bodyModel[107].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 115
		bodyModel[107].setRotationPoint(-29F, -4.5F, 2F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 116
		bodyModel[108].setRotationPoint(-24F, -11F, 2F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 5, 19, 0F); // Box 117
		bodyModel[109].setRotationPoint(-33F, -4F, -9.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 3, 19, 0F,0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[110].setRotationPoint(-33F, -7F, -9.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[111].setRotationPoint(-33F, -11F, 0F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 7, 3, 0F); // Box 120
		bodyModel[112].setRotationPoint(-31F, -6F, -2F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 122
		bodyModel[113].setRotationPoint(-31F, -6F, 7.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 3, 19, 0F,2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[114].setRotationPoint(29F, -7F, -9.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 5, 19, 0F); // Box 124
		bodyModel[115].setRotationPoint(29F, -4F, -9.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[116].setRotationPoint(30F, -11F, -9F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 7, 3, 0F); // Box 126
		bodyModel[117].setRotationPoint(25F, -6F, -1F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 127
		bodyModel[118].setRotationPoint(25F, -6F, -9.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 128
		bodyModel[119].setRotationPoint(22F, -4.5F, -7F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 5, 3, 0F); // Box 129
		bodyModel[120].setRotationPoint(23F, -4F, -6F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 130
		bodyModel[121].setRotationPoint(21F, -11F, -7F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 131
		bodyModel[122].setRotationPoint(-35F, -7F, 8F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 132
		bodyModel[123].setRotationPoint(-35.5F, 2.5F, -1F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 133
		bodyModel[124].setRotationPoint(31.5F, 2.5F, -1F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		bodyModel[125].setRotationPoint(-35F, -4F, 5F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 135
		bodyModel[126].setRotationPoint(-35.5F, 1F, 6F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 136
		bodyModel[127].setRotationPoint(-35.5F, 1F, -9F);

		bodyModel[128].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 137
		bodyModel[128].setRotationPoint(31.5F, 1F, -9F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 138
		bodyModel[129].setRotationPoint(31.5F, 1F, 6F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 139
		bodyModel[130].setRotationPoint(32F, -4F, -6F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 140
		bodyModel[131].setRotationPoint(32F, -7F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F, -6F); // Box 142
		bodyModel[132].setRotationPoint(-35F, -7F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F, -6F); // Box 143
		bodyModel[133].setRotationPoint(33F, -7F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[134].setRotationPoint(31.5F, -0.5F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 146
		bodyModel[135].setRotationPoint(31.5F, -0.5F, -3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[136].setRotationPoint(31.5F, -1.5F, -3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[137].setRotationPoint(31.5F, -1.5F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[138].setRotationPoint(31.5F, -1.5F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[139].setRotationPoint(31.5F, -1.5F, -9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[140].setRotationPoint(31.5F, -0.5F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 152
		bodyModel[141].setRotationPoint(31.5F, -0.5F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[142].setRotationPoint(31.5F, -0.5F, 2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[143].setRotationPoint(31.5F, -1.5F, 2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[144].setRotationPoint(31.5F, -1.5F, 3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 156
		bodyModel[145].setRotationPoint(31.5F, -0.5F, 3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[146].setRotationPoint(31.5F, -0.5F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 158
		bodyModel[147].setRotationPoint(31.5F, -0.5F, 8F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[148].setRotationPoint(31.5F, -1.5F, 8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[149].setRotationPoint(31.5F, -1.5F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 161
		bodyModel[150].setRotationPoint(31.6F, -20F, -0.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[151].setRotationPoint(31.6F, -20F, -1.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 163
		bodyModel[152].setRotationPoint(31.6F, -19F, -1.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 164
		bodyModel[153].setRotationPoint(31.6F, -19F, -0.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 165
		bodyModel[154].setRotationPoint(31.6F, -19F, 0.75F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 166
		bodyModel[155].setRotationPoint(31.6F, -20F, 0.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[156].setRotationPoint(31.6F, -20F, -0.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 168
		bodyModel[157].setRotationPoint(31.6F, -19F, -0.25F);
	}
}