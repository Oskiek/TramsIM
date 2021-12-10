
package metroim.models.trains; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Euskotren200 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public Euskotren200() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[169];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 69
		bodyModel[53] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 70
		bodyModel[54] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
		bodyModel[56] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 76
		bodyModel[57] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 78
		bodyModel[58] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 79
		bodyModel[59] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 80
		bodyModel[60] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 81
		bodyModel[61] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 82
		bodyModel[62] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 91
		bodyModel[63] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 90
		bodyModel[64] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 80
		bodyModel[65] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 81
		bodyModel[66] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 82
		bodyModel[67] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 83
		bodyModel[68] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 84
		bodyModel[69] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 85
		bodyModel[70] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 86
		bodyModel[71] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 87
		bodyModel[72] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 88
		bodyModel[73] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 89
		bodyModel[74] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 90
		bodyModel[75] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 91
		bodyModel[76] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 92
		bodyModel[77] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 93
		bodyModel[78] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 94
		bodyModel[79] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 95
		bodyModel[80] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 96
		bodyModel[81] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 98
		bodyModel[82] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 99
		bodyModel[83] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 100
		bodyModel[84] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 98
		bodyModel[85] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 99
		bodyModel[86] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 100
		bodyModel[87] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 101
		bodyModel[88] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 104
		bodyModel[91] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 105
		bodyModel[92] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 106
		bodyModel[93] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 107
		bodyModel[94] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 123
		bodyModel[95] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 127
		bodyModel[96] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 128
		bodyModel[97] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 129
		bodyModel[98] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 132
		bodyModel[99] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 133
		bodyModel[100] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 147
		bodyModel[101] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 148
		bodyModel[102] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 114
		bodyModel[103] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 150
		bodyModel[104] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 151
		bodyModel[105] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 152
		bodyModel[106] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 153
		bodyModel[107] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 154
		bodyModel[108] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 155
		bodyModel[109] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 156
		bodyModel[110] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 157
		bodyModel[111] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 158
		bodyModel[112] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 159
		bodyModel[113] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 160
		bodyModel[114] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 161
		bodyModel[115] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 162
		bodyModel[116] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 163
		bodyModel[117] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 164
		bodyModel[118] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 165
		bodyModel[119] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 166
		bodyModel[120] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 167
		bodyModel[121] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 168
		bodyModel[122] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 169
		bodyModel[123] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 170
		bodyModel[124] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 171
		bodyModel[125] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 172
		bodyModel[126] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 173
		bodyModel[127] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 174
		bodyModel[128] = new ModelRendererTurbo(this, 497, 24, textureX, textureY); // Box 162
		bodyModel[129] = new ModelRendererTurbo(this, 7, 105, textureX, textureY); // Box 163
		bodyModel[130] = new ModelRendererTurbo(this, 2, 105, textureX, textureY); // Box 164
		bodyModel[131] = new ModelRendererTurbo(this, 457, 8, textureX, textureY); // Box 165
		bodyModel[132] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 163
		bodyModel[133] = new ModelRendererTurbo(this, 457, 28, textureX, textureY); // Box 164
		bodyModel[134] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 165
		bodyModel[135] = new ModelRendererTurbo(this, 473, 98, textureX, textureY); // Box 166
		bodyModel[136] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 159
		bodyModel[137] = new ModelRendererTurbo(this, 27, 105, textureX, textureY); // Box 159
		bodyModel[138] = new ModelRendererTurbo(this, 13, 105, textureX, textureY); // Box 160
		bodyModel[139] = new ModelRendererTurbo(this, 13, 113, textureX, textureY); // Box 161
		bodyModel[140] = new ModelRendererTurbo(this, 27, 105, textureX, textureY); // Box 162
		bodyModel[141] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 163
		bodyModel[142] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 165
		bodyModel[143] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 166
		bodyModel[144] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 167
		bodyModel[145] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 168
		bodyModel[146] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 165
		bodyModel[147] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 166
		bodyModel[148] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 168
		bodyModel[149] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 169
		bodyModel[150] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 8
		bodyModel[151] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 9
		bodyModel[152] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 10
		bodyModel[153] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 11
		bodyModel[154] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 12
		bodyModel[155] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 13
		bodyModel[156] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 15
		bodyModel[157] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 17
		bodyModel[158] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 19
		bodyModel[159] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 21
		bodyModel[160] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 22
		bodyModel[161] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 24
		bodyModel[162] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 22
		bodyModel[163] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 23
		bodyModel[164] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 24
		bodyModel[165] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 25
		bodyModel[166] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 27
		bodyModel[167] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 30
		bodyModel[168] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 18

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 1F, 0.5F, -1F, 0.4F, -0.5F, -1F, -0.2F); // Box 0
		bodyModel[0].setRotationPoint(-38F, 4F, 4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -1F, -0.2F, 0.5F, -1F, 0.4F, 0.5F, -1F, 1F, -0.5F, -1F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-38F, 4F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, -0.5F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-38.5F, 0F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-38.5F, -4F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 12, 17, 0F,-1F, -1F, -0.5F, 1F, -1F, -0.1F, 1F, -1F, -0.1F, -1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-38.5F, -16F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 5, 16, 0F,-0.3F, -2F, -1F, 0.7F, -1F, -1F, 0.7F, -1F, -1F, -0.3F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-37.5F, -20F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 8
		bodyModel[6].setRotationPoint(-36.5F, -4F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F,-1F, -1F, -1.1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 1.6F, -1F, 0F, -0.48F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 1F); // Box 9
		bodyModel[7].setRotationPoint(-36.5F, -16F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0.375F, 0F, 1F, 1F, 0F, 0.5F, 1F, 0F, 0.33F, 0.375F, 0F, -0.6F, 0F, -1F, 1F, 0F, -1F, 0.5F, 0F, -1F, 0.23F, 0F, -1F, -0.6F); // Box 11
		bodyModel[8].setRotationPoint(-35.5F, 5F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F); // Box 12
		bodyModel[9].setRotationPoint(-36.5F, -4F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, -0.625F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.625F, 0F, -0.6F); // Box 16
		bodyModel[10].setRotationPoint(-36.5F, 0F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F,0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.625F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, -0.625F, 0F, 1F); // Box 17
		bodyModel[11].setRotationPoint(-36.5F, 0F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0.375F, 0F, -0.6F, 1F, 0F, 0.33F, 1F, 0F, 0.5F, 0.375F, 0F, 1F, 0F, -1F, -0.6F, 0F, -1F, 0.23F, 0F, -1F, 0.5F, 0F, -1F, 1F); // Box 18
		bodyModel[12].setRotationPoint(-35.5F, 5F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,-0.7F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, -0.7F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.6F); // Box 20
		bodyModel[13].setRotationPoint(-35.5F, -19F, 7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 51, 1, 19, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 21
		bodyModel[14].setRotationPoint(-25.5F, 3F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F,-1F, -1F, 1.6F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, -1.1F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -0.48F); // Box 22
		bodyModel[15].setRotationPoint(-36.5F, -16F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,-0.7F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, -0.7F, 0F, 2F, 0F, 0F, -0.6F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F); // Box 23
		bodyModel[16].setRotationPoint(-35.5F, -19F, -9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-25.5F, 3F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-25.5F, 3F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-24.5F, -4F, 9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-19.5F, -4F, 9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, -0.5F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-38.5F, 0F, 6F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 4, 13, 0F); // Box 22
		bodyModel[22].setRotationPoint(-38F, 0F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, -0.5F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-38.5F, 0F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-38.1F, 2.25F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 25
		bodyModel[25].setRotationPoint(-38.1F, 2.25F, 3.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[26].setRotationPoint(-24.5F, -4F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(-19.5F, -4F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,-1F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, -1F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(-19.5F, -16F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,-1F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, -1F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
		bodyModel[29].setRotationPoint(-24.5F, -16F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,-1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 34
		bodyModel[30].setRotationPoint(22.5F, -4F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,1F, 0F, 0.33F, 0F, 0F, -0.6F, 0F, 0F, 0.8F, 1F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, -0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F); // Box 35
		bodyModel[31].setRotationPoint(28.5F, 4F, -10.25F);
		bodyModel[31].rotateAngleY = -0.05235988F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 36
		bodyModel[32].setRotationPoint(17.5F, -4F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[33].setRotationPoint(12.5F, -4F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 27, 7, 1, 0F); // Box 40
		bodyModel[34].setRotationPoint(-13.5F, -4F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 27, 7, 1, 0F); // Box 41
		bodyModel[35].setRotationPoint(-13.5F, -4F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 27, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 42
		bodyModel[36].setRotationPoint(-13.5F, -16F, 8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 27, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 43
		bodyModel[37].setRotationPoint(-13.5F, -16F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 50
		bodyModel[38].setRotationPoint(12.5F, -4F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 51
		bodyModel[39].setRotationPoint(17.5F, -4F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.6F, 1F, 0F, 0.33F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0.23F); // Box 53
		bodyModel[40].setRotationPoint(28.5F, 4F, 8.3F);
		bodyModel[40].rotateAngleY = 0.05235988F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, -0.25F, 0F, 0F); // Box 54
		bodyModel[41].setRotationPoint(-38.5F, 0F, 3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, -0.25F, 0F, 0F); // Box 55
		bodyModel[42].setRotationPoint(-38.5F, 0F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 51, 4, 3, 0F,-2F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 56
		bodyModel[43].setRotationPoint(-25.5F, -19F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 51, 4, 3, 0F,-2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 57
		bodyModel[44].setRotationPoint(-25.5F, -19F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,-1F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, -1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -2F); // Box 61
		bodyModel[45].setRotationPoint(22.5F, -16F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 14, 1, 19, 0F,-1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F); // Box 62
		bodyModel[46].setRotationPoint(-37.5F, 3F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 12, 1, 19, 0F,-1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 63
		bodyModel[47].setRotationPoint(22.5F, 3F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-1F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, 3.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, 0F); // Box 64
		bodyModel[48].setRotationPoint(22.5F, -19F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-1F, 0F, 1.5F, 0F, 0F, 3.5F, 0F, 0F, -2.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 65
		bodyModel[49].setRotationPoint(22.5F, -19F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 51, 1, 15, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 66
		bodyModel[50].setRotationPoint(-25.5F, -19F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 4, 15, 0F,-0.7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 67
		bodyModel[51].setRotationPoint(-35.5F, -19F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 1, 15, 0F,-1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F); // Box 69
		bodyModel[52].setRotationPoint(22.5F, -19F, -8F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 70
		bodyModel[53].setRotationPoint(33.5F, -4F, -8.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 73
		bodyModel[54].setRotationPoint(33.5F, -4F, 3.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[55].setRotationPoint(33.5F, -16F, -8.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 18, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[56].setRotationPoint(33.5F, -15F, -4.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[57].setRotationPoint(33.5F, -18F, -7.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 79
		bodyModel[58].setRotationPoint(33.5F, -16F, -4.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[59].setRotationPoint(34.5F, -16F, -6.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[60].setRotationPoint(34.5F, -16F, 3.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 82
		bodyModel[61].setRotationPoint(34.5F, 3F, -4.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[62].setRotationPoint(-11F, -1F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[63].setRotationPoint(-12F, -6F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 80
		bodyModel[64].setRotationPoint(-3.5F, -1F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[65].setRotationPoint(-12F, -6F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[66].setRotationPoint(-11F, -1F, 2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 83
		bodyModel[67].setRotationPoint(-3.5F, -1F, 2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[68].setRotationPoint(-0.5F, -6F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[69].setRotationPoint(0.5F, -1F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 86
		bodyModel[70].setRotationPoint(8F, -1F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[71].setRotationPoint(11F, -6F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[72].setRotationPoint(11F, -6F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 89
		bodyModel[73].setRotationPoint(8F, -1F, 2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[74].setRotationPoint(0.5F, -1F, 2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[75].setRotationPoint(-0.5F, -6F, 2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.922F, -1F, 0F, -0.922F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 92
		bodyModel[76].setRotationPoint(9.5F, 3F, -11.4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.922F, -1F, 0F, -0.922F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 93
		bodyModel[77].setRotationPoint(-27.5F, 3F, -11.4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.922F, -1F, 0F, -0.922F); // Box 94
		bodyModel[78].setRotationPoint(10.5F, 3F, 9.4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.922F, -1F, 0F, -0.922F); // Box 95
		bodyModel[79].setRotationPoint(-27.5F, 3F, 9.4F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 7, 19, 0F); // Box 96
		bodyModel[80].setRotationPoint(-24.5F, -4F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[81].setRotationPoint(-24.5F, -16F, -10.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[82].setRotationPoint(-24.5F, -16F, 5.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[83].setRotationPoint(-24.5F, -16F, -6.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 1, 15, 0F); // Box 98
		bodyModel[84].setRotationPoint(-36.5F, -4F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[85].setRotationPoint(-36.5F, -6F, 4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[86].setRotationPoint(-36.5F, -6F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[87].setRotationPoint(-36.5F, -6F, -5F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 102
		bodyModel[88].setRotationPoint(-30F, -1F, -2F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 103
		bodyModel[89].setRotationPoint(-31F, -2F, -3F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 104
		bodyModel[90].setRotationPoint(-27F, -7F, -3F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 105
		bodyModel[91].setRotationPoint(-27F, -10F, -2.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 106
		bodyModel[92].setRotationPoint(-31F, -5F, -4F);

		bodyModel[93].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 107
		bodyModel[93].setRotationPoint(-31F, -5F, 1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[94].setRotationPoint(25F, -6F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[95].setRotationPoint(33F, -6F, -8.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[96].setRotationPoint(33F, -6F, 3.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[97].setRotationPoint(25F, -6F, 1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 132
		bodyModel[98].setRotationPoint(30F, -2F, 3.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 133
		bodyModel[99].setRotationPoint(30F, -2F, -8.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[100].setRotationPoint(-23.5F, -5F, -9.2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[101].setRotationPoint(-23.5F, -5F, -6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
		bodyModel[102].setRotationPoint(-12.5F, -18F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 150
		bodyModel[103].setRotationPoint(-12.5F, -18F, 2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 151
		bodyModel[104].setRotationPoint(-0.75F, -18F, 2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 152
		bodyModel[105].setRotationPoint(-0.75F, -18F, -4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 153
		bodyModel[106].setRotationPoint(10.75F, -18F, -4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 154
		bodyModel[107].setRotationPoint(10.75F, -18F, 2F);

		bodyModel[108].addBox(0F, 0F, 0F, 10, 3, 11, 0F); // Box 155
		bodyModel[108].setRotationPoint(-8F, 4F, -7F);

		bodyModel[109].addBox(0F, 0F, 0F, 10, 4, 11, 0F); // Box 156
		bodyModel[109].setRotationPoint(2F, 4F, -9F);

		bodyModel[110].addBox(0F, 0F, 0F, 5, 4, 11, 0F); // Box 157
		bodyModel[110].setRotationPoint(-14F, 4F, -7F);

		bodyModel[111].addBox(0F, 0F, 0F, 9, 4, 3, 0F); // Box 158
		bodyModel[111].setRotationPoint(4F, 4F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[112].setRotationPoint(-0.5F, -1F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[113].setRotationPoint(-0.5F, -1F, 5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[114].setRotationPoint(-23.5F, -5F, 2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[115].setRotationPoint(-23.5F, -5F, 5.2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 163
		bodyModel[116].setRotationPoint(-13F, -5F, 5.7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 164
		bodyModel[117].setRotationPoint(-13F, -5F, 2.2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 165
		bodyModel[118].setRotationPoint(24F, -5F, 5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 166
		bodyModel[119].setRotationPoint(24F, -5F, 1.7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 167
		bodyModel[120].setRotationPoint(-13F, -5F, -6.3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 168
		bodyModel[121].setRotationPoint(-13F, -5F, -9.7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 169
		bodyModel[122].setRotationPoint(24F, -5F, -6.3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 170
		bodyModel[123].setRotationPoint(24F, -5F, -9.7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[124].setRotationPoint(12F, -5F, -6.2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[125].setRotationPoint(12F, -5F, -9.7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[126].setRotationPoint(12F, -5F, 2.2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[127].setRotationPoint(12F, -5F, 5.7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,-1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 162
		bodyModel[128].setRotationPoint(-24.5F, -16F, 9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.1F, -1F, -1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.52F, 0F, 0F, 0.4F); // Box 163
		bodyModel[129].setRotationPoint(-36.5F, -16F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-1F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.52F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[130].setRotationPoint(-36.5F, -16F, -9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,-1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 165
		bodyModel[131].setRotationPoint(17.5F, -16F, 9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,-1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 163
		bodyModel[132].setRotationPoint(12.5F, -16F, 9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,-1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[133].setRotationPoint(-19.5F, -16F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,-1F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, -1F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 165
		bodyModel[134].setRotationPoint(17.5F, -16F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,-1F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, -1F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 166
		bodyModel[135].setRotationPoint(12.5F, -16F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 18, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[136].setRotationPoint(33.5F, -15F, -0.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 159
		bodyModel[137].setRotationPoint(-39F, 4F, -1.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 160
		bodyModel[138].setRotationPoint(-41F, 3.5F, -2.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 161
		bodyModel[139].setRotationPoint(-41F, 5.5F, 1.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 162
		bodyModel[140].setRotationPoint(30F, 4F, -1.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 163
		bodyModel[141].setRotationPoint(22.5F, -4F, 8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,-1F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 1F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 2F); // Box 165
		bodyModel[142].setRotationPoint(22.5F, -16F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 166
		bodyModel[143].setRotationPoint(33.5F, -16F, 3.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 167
		bodyModel[144].setRotationPoint(33.5F, -4F, 4.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 168
		bodyModel[145].setRotationPoint(33.5F, -4F, -9.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[146].setRotationPoint(-12F, -1F, 5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[147].setRotationPoint(11F, -1F, 5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[148].setRotationPoint(-12F, -1F, -7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[149].setRotationPoint(11F, -1F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 8
		bodyModel[150].setRotationPoint(-22.5F, -35F, -5.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 9
		bodyModel[151].setRotationPoint(-20.5F, -35F, -5.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 10
		bodyModel[152].setRotationPoint(-22.5F, -34F, -5.25F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 11
		bodyModel[153].setRotationPoint(-22.5F, -34F, 2.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 12
		bodyModel[154].setRotationPoint(-20.5F, -35F, -7.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 13
		bodyModel[155].setRotationPoint(-22.5F, -35F, 4.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 15
		bodyModel[156].setRotationPoint(-22.5F, -35F, -7.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,6F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, 0F, 0.5F, 6F, 0F, 0.5F, -3.5F, 1F, -4.5F, 3F, 1F, -4.5F, 3F, 1F, 4F, -3.5F, 1F, 4F); // Box 17
		bodyModel[157].setRotationPoint(-15F, -33F, -5.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[158].setRotationPoint(-24.5F, -21F, -5.25F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[159].setRotationPoint(-24.5F, -21F, 2.75F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 22
		bodyModel[160].setRotationPoint(-25F, -20F, -5.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 24
		bodyModel[161].setRotationPoint(-20.5F, -35F, 4.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 22
		bodyModel[162].setRotationPoint(-22.5F, -22F, -5.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 23
		bodyModel[163].setRotationPoint(-25F, -20F, 2F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 24
		bodyModel[164].setRotationPoint(-20F, -20F, -5.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 25
		bodyModel[165].setRotationPoint(-20F, -20F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, -1.5F, 1F, 0F, 7F, -2F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 7F, -2F, 0F); // Box 27
		bodyModel[166].setRotationPoint(-15F, -26F, -1.25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,6F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, -0.5F, 6F, 0F, -0.5F, -3.5F, 1F, 4F, 3F, 1F, 4F, 3F, 1F, -4.5F, -3.5F, 1F, -4.5F); // Box 30
		bodyModel[167].setRotationPoint(-15F, -33F, 3.25F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 18
		bodyModel[168].setRotationPoint(-13.5F, -27.5F, -1.25F);
		this.flipAll();
	}
}