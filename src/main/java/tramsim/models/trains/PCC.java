
package tramsim.models.trains; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class PCC extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public PCC() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[215];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 58
		bodyModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 59
		bodyModel[46] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 61
		bodyModel[48] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 62
		bodyModel[49] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 63
		bodyModel[50] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 64
		bodyModel[51] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 66
		bodyModel[52] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 67
		bodyModel[53] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 68
		bodyModel[54] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 79
		bodyModel[56] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 84
		bodyModel[57] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 85
		bodyModel[58] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 86
		bodyModel[59] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 87
		bodyModel[60] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 88
		bodyModel[61] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 89
		bodyModel[62] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 90
		bodyModel[63] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 91
		bodyModel[64] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 92
		bodyModel[65] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 93
		bodyModel[66] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 94
		bodyModel[67] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 95
		bodyModel[68] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 96
		bodyModel[69] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 97
		bodyModel[70] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 98
		bodyModel[71] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 99
		bodyModel[72] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 100
		bodyModel[73] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 101
		bodyModel[74] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 102
		bodyModel[75] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 104
		bodyModel[76] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 105
		bodyModel[77] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 106
		bodyModel[78] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 107
		bodyModel[79] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 108
		bodyModel[80] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 109
		bodyModel[81] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 110
		bodyModel[82] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 111
		bodyModel[83] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 112
		bodyModel[84] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 113
		bodyModel[85] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 114
		bodyModel[86] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 115
		bodyModel[87] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 116
		bodyModel[88] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 117
		bodyModel[89] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 118
		bodyModel[90] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 119
		bodyModel[91] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 120
		bodyModel[92] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 121
		bodyModel[93] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 122
		bodyModel[94] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 123
		bodyModel[95] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 124
		bodyModel[96] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 125
		bodyModel[97] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 126
		bodyModel[98] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 127
		bodyModel[99] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 130
		bodyModel[100] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 131
		bodyModel[101] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 132
		bodyModel[102] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 133
		bodyModel[103] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 134
		bodyModel[104] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 135
		bodyModel[105] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 136
		bodyModel[106] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 137
		bodyModel[107] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 138
		bodyModel[108] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 139
		bodyModel[109] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 140
		bodyModel[110] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 141
		bodyModel[111] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 142
		bodyModel[112] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 116
		bodyModel[113] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 117
		bodyModel[114] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 118
		bodyModel[115] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 120
		bodyModel[116] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 121
		bodyModel[117] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 122
		bodyModel[118] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 126
		bodyModel[119] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 127
		bodyModel[120] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 128
		bodyModel[121] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 123
		bodyModel[122] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 124
		bodyModel[123] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 125
		bodyModel[124] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 126
		bodyModel[125] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 127
		bodyModel[126] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 129
		bodyModel[128] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 130
		bodyModel[129] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 131
		bodyModel[130] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 132
		bodyModel[131] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 133
		bodyModel[132] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 134
		bodyModel[133] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 135
		bodyModel[134] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 136
		bodyModel[135] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 137
		bodyModel[136] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 138
		bodyModel[137] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 140
		bodyModel[138] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 141
		bodyModel[139] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 142
		bodyModel[140] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 143
		bodyModel[141] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 144
		bodyModel[142] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 145
		bodyModel[143] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 146
		bodyModel[144] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 147
		bodyModel[145] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 148
		bodyModel[146] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 149
		bodyModel[147] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 150
		bodyModel[148] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 151
		bodyModel[149] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 152
		bodyModel[150] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 153
		bodyModel[151] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 154
		bodyModel[152] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 155
		bodyModel[153] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 156
		bodyModel[154] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 157
		bodyModel[155] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 159
		bodyModel[156] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 160
		bodyModel[157] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 161
		bodyModel[158] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 162
		bodyModel[159] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 163
		bodyModel[160] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 164
		bodyModel[161] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 165
		bodyModel[162] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 166
		bodyModel[163] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 167
		bodyModel[164] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 169
		bodyModel[165] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 171
		bodyModel[166] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 172
		bodyModel[167] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 173
		bodyModel[168] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 174
		bodyModel[169] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 175
		bodyModel[170] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 176
		bodyModel[171] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 177
		bodyModel[172] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 178
		bodyModel[173] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 179
		bodyModel[174] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 180
		bodyModel[175] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 181
		bodyModel[176] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 182
		bodyModel[177] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 183
		bodyModel[178] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 184
		bodyModel[179] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 185
		bodyModel[180] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 186
		bodyModel[181] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 187
		bodyModel[182] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 188
		bodyModel[183] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 189
		bodyModel[184] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 190
		bodyModel[185] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 191
		bodyModel[186] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 192
		bodyModel[187] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 193
		bodyModel[188] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 194
		bodyModel[189] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 195
		bodyModel[190] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 196
		bodyModel[191] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 197
		bodyModel[192] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 198
		bodyModel[193] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 199
		bodyModel[194] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 200
		bodyModel[195] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 201
		bodyModel[196] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 202
		bodyModel[197] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 203
		bodyModel[198] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 204
		bodyModel[199] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 205
		bodyModel[200] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 206
		bodyModel[201] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 207
		bodyModel[202] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 208
		bodyModel[203] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 209
		bodyModel[204] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 210
		bodyModel[205] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 211
		bodyModel[206] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 212
		bodyModel[207] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 213
		bodyModel[208] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 214
		bodyModel[209] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 215
		bodyModel[210] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 216
		bodyModel[211] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 217
		bodyModel[212] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 218
		bodyModel[213] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 219
		bodyModel[214] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 220

		bodyModel[0].addBox(0F, 0F, 0F, 52, 4, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-48F, 9F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 37, 4, 20, 0F); // Box 1
		bodyModel[1].setRotationPoint(20F, 9F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 52, 12, 1, 0F); // Box 5
		bodyModel[2].setRotationPoint(-48F, 2F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 52, 12, 1, 0F); // Box 6
		bodyModel[3].setRotationPoint(-48F, 2F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 16, 4, 16, 0F); // Box 7
		bodyModel[4].setRotationPoint(4F, 9F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 37, 12, 1, 0F); // Box 8
		bodyModel[5].setRotationPoint(20F, 2F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 9
		bodyModel[6].setRotationPoint(4F, 13F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 37, 12, 1, 0F); // Box 10
		bodyModel[7].setRotationPoint(20F, 2F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 16, 12, 1, 0F); // Box 11
		bodyModel[8].setRotationPoint(4F, 2F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 32, 1, 20, 0F); // Box 12
		bodyModel[9].setRotationPoint(-4F, 13F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(57F, 9F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(64F, 9F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 15
		bodyModel[12].setRotationPoint(-54F, 9F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 4, 13, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(-66F, 9F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 6, 21, 1, 0F); // Box 18
		bodyModel[14].setRotationPoint(-54F, -7F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 19
		bodyModel[15].setRotationPoint(-69F, 9F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.83F, -3F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.83F, -3F, 0F, 0.35F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-66F, 9F, 3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 21
		bodyModel[17].setRotationPoint(-66F, 2F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 22
		bodyModel[18].setRotationPoint(-69F, 2F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 23
		bodyModel[19].setRotationPoint(-69F, 2F, 4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 24
		bodyModel[20].setRotationPoint(64F, 2F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(64F, 2F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 26
		bodyModel[22].setRotationPoint(57F, 2F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(57F, 2F, 10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 28
		bodyModel[24].setRotationPoint(67F, 2F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 29
		bodyModel[25].setRotationPoint(-70F, 2F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.5F); // Box 31
		bodyModel[26].setRotationPoint(-66F, -7F, 7.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 14, 1, 20, 0F); // Box 32
		bodyModel[27].setRotationPoint(-54F, 13F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 33
		bodyModel[28].setRotationPoint(-66F, 13F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 34
		bodyModel[29].setRotationPoint(-54F, 13F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.65F, 0F, 0F, 1.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, 0F, 0F, 1.65F, 0F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(-64F, 13F, 8.35F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 16, 19, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 36
		bodyModel[31].setRotationPoint(4F, -6F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 16, 19, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -1.9F, 0F, 0F, 1.4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.9F, 0F, 0F, 1.4F, 0F, 0F, -0.25F); // Box 37
		bodyModel[32].setRotationPoint(-64F, -6F, 8.35F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 38
		bodyModel[33].setRotationPoint(20F, -2F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(20F, -6F, 10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(1F, -6F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 41
		bodyModel[36].setRotationPoint(1F, -2F, 10F);

		bodyModel[37].addBox(0F, 0F, 0F, 105, 1, 1, 0F); // Box 42
		bodyModel[37].setRotationPoint(-48F, -7F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[38].setRotationPoint(-48F, -6F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 52
		bodyModel[39].setRotationPoint(-48F, -2F, 10F);

		bodyModel[40].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 53
		bodyModel[40].setRotationPoint(-48F, -2F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[41].setRotationPoint(-48F, -6F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F); // Box 55
		bodyModel[42].setRotationPoint(61F, -2F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,1F, 0F, -1.14F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1.14F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F); // Box 56
		bodyModel[43].setRotationPoint(61F, -6F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F); // Box 58
		bodyModel[44].setRotationPoint(61F, -2F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 59
		bodyModel[45].setRotationPoint(57F, -7F, 10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,1F, 0F, 1.14F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.14F, 0F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F); // Box 60
		bodyModel[46].setRotationPoint(61F, -6F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 61
		bodyModel[47].setRotationPoint(57F, -7F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 105, 1, 1, 0F); // Box 62
		bodyModel[48].setRotationPoint(-48F, -7F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[49].setRotationPoint(1F, -6F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 64
		bodyModel[50].setRotationPoint(1F, -2F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 66
		bodyModel[51].setRotationPoint(21F, -2F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[52].setRotationPoint(21F, -6F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 68
		bodyModel[53].setRotationPoint(11F, -6F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 70
		bodyModel[54].setRotationPoint(-7F, -6F, -10.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 79
		bodyModel[55].setRotationPoint(-37F, -6F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 84
		bodyModel[56].setRotationPoint(-16F, -6F, -10.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 85
		bodyModel[57].setRotationPoint(-26F, -6F, -10.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 86
		bodyModel[58].setRotationPoint(-36F, -6F, -10.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 87
		bodyModel[59].setRotationPoint(-45F, -6F, -10.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 88
		bodyModel[60].setRotationPoint(-45F, -6F, 10.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 89
		bodyModel[61].setRotationPoint(-36F, -6F, 10.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 90
		bodyModel[62].setRotationPoint(-26F, -6F, 10.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 91
		bodyModel[63].setRotationPoint(-16F, -6F, 10.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 92
		bodyModel[64].setRotationPoint(-7F, -6F, 10.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 93
		bodyModel[65].setRotationPoint(-28F, -6F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 94
		bodyModel[66].setRotationPoint(-18F, -6F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 95
		bodyModel[67].setRotationPoint(-8F, -6F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 96
		bodyModel[68].setRotationPoint(3F, -6F, -10.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 97
		bodyModel[69].setRotationPoint(13F, -6F, -10.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 98
		bodyModel[70].setRotationPoint(23F, -6F, -10.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 99
		bodyModel[71].setRotationPoint(33F, -6F, -10.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 100
		bodyModel[72].setRotationPoint(43F, -6F, -10.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 101
		bodyModel[73].setRotationPoint(53F, -6F, -10.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F); // Box 102
		bodyModel[74].setRotationPoint(57F, -6F, -10.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 104
		bodyModel[75].setRotationPoint(53F, -6F, 10.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F); // Box 105
		bodyModel[76].setRotationPoint(57F, -6F, 10.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 106
		bodyModel[77].setRotationPoint(31F, -6F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 107
		bodyModel[78].setRotationPoint(41F, -6F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 108
		bodyModel[79].setRotationPoint(51F, -6F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 109
		bodyModel[80].setRotationPoint(43F, -6F, 10.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 110
		bodyModel[81].setRotationPoint(33F, -6F, 10.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 111
		bodyModel[82].setRotationPoint(23F, -6F, 10.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 112
		bodyModel[83].setRotationPoint(31F, -6F, 10F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 113
		bodyModel[84].setRotationPoint(41F, -6F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 114
		bodyModel[85].setRotationPoint(51F, -6F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[86].setRotationPoint(67F, -6F, -0.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 0, 8, 3, 0F); // Box 116
		bodyModel[87].setRotationPoint(67.5F, -6F, 0.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 117
		bodyModel[88].setRotationPoint(67.5F, -6F, 3.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 0, 8, 3, 0F); // Box 118
		bodyModel[89].setRotationPoint(67.5F, -6F, -3.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 8, 3, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[90].setRotationPoint(67.5F, -6F, -6.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 120
		bodyModel[91].setRotationPoint(67F, -7F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 121
		bodyModel[92].setRotationPoint(64F, -7F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 122
		bodyModel[93].setRotationPoint(64F, -7F, 8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0F, 0F, 0F); // Box 123
		bodyModel[94].setRotationPoint(64F, -6F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Box 124
		bodyModel[95].setRotationPoint(64F, -6F, 8F);

		bodyModel[96].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 125
		bodyModel[96].setRotationPoint(-54F, -7F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.65F, 0F, 0F, 1.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, 0F, 0F, 1.65F, 0F, 0F, 0F); // Box 126
		bodyModel[97].setRotationPoint(-64F, -7F, 8.35F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[98].setRotationPoint(-70F, -6F, -0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 8, 3, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[99].setRotationPoint(-69.5F, -6F, -3.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 8, 3, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[100].setRotationPoint(-69.5F, -6F, -6.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 132
		bodyModel[101].setRotationPoint(-37F, -6F, 10F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 133
		bodyModel[102].setRotationPoint(-28F, -6F, 10F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 134
		bodyModel[103].setRotationPoint(-18F, -6F, 10F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 135
		bodyModel[104].setRotationPoint(-8F, -6F, 10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.1F, 0F, 1.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, -2.52F, 0.1F, 0F, 1.52F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, -2.52F); // Box 136
		bodyModel[105].setRotationPoint(-67F, -6F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 137
		bodyModel[106].setRotationPoint(-69F, -7F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 138
		bodyModel[107].setRotationPoint(-69F, -7F, 8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 139
		bodyModel[108].setRotationPoint(-70F, -7F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 140
		bodyModel[109].setRotationPoint(-66F, -7F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 141
		bodyModel[110].setRotationPoint(-69F, -7F, -8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 142
		bodyModel[111].setRotationPoint(-66F, -7F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 8, 3, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[112].setRotationPoint(-69.5F, -6F, 0.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 8, 3, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 117
		bodyModel[113].setRotationPoint(-69.5F, -6F, 3.5F);

		bodyModel[114].addShapeBox(2F, 0F, 0F, 1, 15, 1, 0F,1.1F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -0.75F, 0F, 0F, -1.05F, 1.1F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -0.75F, 0F, 0F, -1.05F); // Box 118
		bodyModel[114].setRotationPoint(-68F, -6F, 8F);

		bodyModel[115].addShapeBox(2F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -1.05F, 0.5F, 0F, -0.75F, 0.5F, 0F, 1.5F, 1.1F, 0F, 1.5F, 0F, 0F, -1.05F, 0.5F, 0F, -0.75F, 0.5F, 0F, 1.5F, 1.1F, 0F, 1.5F); // Box 120
		bodyModel[115].setRotationPoint(-68F, -6F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.9F, 0F, -2.52F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 1.55F, 0.9F, 0F, -2.52F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 1.55F); // Box 121
		bodyModel[116].setRotationPoint(-67F, -6F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 122
		bodyModel[117].setRotationPoint(-71F, 4F, -1.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 126
		bodyModel[118].setRotationPoint(-71F, 4F, -0.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 127
		bodyModel[119].setRotationPoint(-71F, 5.5F, -0.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 128
		bodyModel[120].setRotationPoint(-71F, 5.5F, -1.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 123
		bodyModel[121].setRotationPoint(57F, -7F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 124
		bodyModel[122].setRotationPoint(64F, -7F, -8F);

		bodyModel[123].addBox(0F, 0F, 0F, 111, 1, 20, 0F); // Box 125
		bodyModel[123].setRotationPoint(-54F, -7F, -10F);

		bodyModel[124].addBox(0F, 0F, 0F, 111, 3, 22, 0F); // Box 126
		bodyModel[124].setRotationPoint(-54F, -10F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 12, 3, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 127
		bodyModel[125].setRotationPoint(-66F, -10F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 128
		bodyModel[126].setRotationPoint(-69F, -10F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 129
		bodyModel[127].setRotationPoint(-70F, -10F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 130
		bodyModel[128].setRotationPoint(67F, -10F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 131
		bodyModel[129].setRotationPoint(57F, -10F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 132
		bodyModel[130].setRotationPoint(64F, -10F, -9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 111, 2, 22, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[131].setRotationPoint(-54F, -12F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 111, 2, 19, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[132].setRotationPoint(-54F, -14F, -9.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 12, 2, 22, 0F,0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 135
		bodyModel[133].setRotationPoint(-66F, -12F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F,0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 136
		bodyModel[134].setRotationPoint(-69F, -12F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.25F, 0F, -3.5F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, -0.25F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 137
		bodyModel[135].setRotationPoint(-70F, -11F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 12, 2, 19, 0F,-2F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 138
		bodyModel[136].setRotationPoint(-66F, -14F, -9.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F,-2F, -1F, -6.5F, 2F, 0F, -4F, 2F, 0F, -4F, -2F, -1F, -6.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 140
		bodyModel[137].setRotationPoint(-69F, -14F, -7.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 7, 2, 22, 0F,0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 141
		bodyModel[138].setRotationPoint(57F, -12F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 1F, -1.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 142
		bodyModel[139].setRotationPoint(67F, -11F, -5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F,0F, 0F, -1.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 143
		bodyModel[140].setRotationPoint(64F, -12F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 7, 2, 19, 0F,0F, 0F, -4F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 144
		bodyModel[141].setRotationPoint(57F, -14F, -9.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F,2F, 0F, -4F, -2F, -1F, -6.5F, -2F, -1F, -6.5F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 145
		bodyModel[142].setRotationPoint(64F, -14F, -7.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 10, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F); // Box 146
		bodyModel[143].setRotationPoint(-64F, -6F, -8.9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.5F); // Box 147
		bodyModel[144].setRotationPoint(-66F, -6F, -8.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 148
		bodyModel[145].setRotationPoint(-54F, -7F, -10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 7, 16, 0F,0F, -0.5F, -4F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 149
		bodyModel[146].setRotationPoint(-69F, 2F, -8F);

		bodyModel[147].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 150
		bodyModel[147].setRotationPoint(-62F, 6F, -6F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 151
		bodyModel[148].setRotationPoint(-61F, 7F, -5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 152
		bodyModel[149].setRotationPoint(-57F, 1F, -6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 153
		bodyModel[150].setRotationPoint(-51F, 6F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 154
		bodyModel[151].setRotationPoint(-46F, 1F, -10F);

		bodyModel[152].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 155
		bodyModel[152].setRotationPoint(-43F, 6F, -10F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 156
		bodyModel[153].setRotationPoint(-50F, 7F, -9.25F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 157
		bodyModel[154].setRotationPoint(-42F, 7F, -9.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 159
		bodyModel[155].setRotationPoint(-38F, 1F, -10F);

		bodyModel[156].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 160
		bodyModel[156].setRotationPoint(-33F, 6F, -10F);

		bodyModel[157].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 161
		bodyModel[157].setRotationPoint(-23F, 6F, -10F);

		bodyModel[158].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 162
		bodyModel[158].setRotationPoint(-13F, 6F, -10F);

		bodyModel[159].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 163
		bodyModel[159].setRotationPoint(-3F, 6F, -10F);

		bodyModel[160].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 164
		bodyModel[160].setRotationPoint(7F, 6F, -10F);

		bodyModel[161].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 165
		bodyModel[161].setRotationPoint(17F, 6F, -10F);

		bodyModel[162].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 166
		bodyModel[162].setRotationPoint(27F, 6F, -10F);

		bodyModel[163].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 167
		bodyModel[163].setRotationPoint(37F, 6F, -10F);

		bodyModel[164].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 169
		bodyModel[164].setRotationPoint(47F, 6F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 171
		bodyModel[165].setRotationPoint(-46F, 6F, 9F);
		bodyModel[165].rotateAngleY = -1.57079633F;

		bodyModel[166].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 172
		bodyModel[166].setRotationPoint(-45.25F, 7F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 173
		bodyModel[167].setRotationPoint(-33F, 6F, 5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 174
		bodyModel[168].setRotationPoint(-23F, 6F, 5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 175
		bodyModel[169].setRotationPoint(-13F, 6F, 5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 176
		bodyModel[170].setRotationPoint(-3F, 6F, 5F);

		bodyModel[171].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 177
		bodyModel[171].setRotationPoint(27F, 6F, 2F);

		bodyModel[172].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 178
		bodyModel[172].setRotationPoint(37F, 6F, 2F);

		bodyModel[173].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 179
		bodyModel[173].setRotationPoint(47F, 6F, 2F);

		bodyModel[174].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[174].setRotationPoint(-32F, 7F, 5.75F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 181
		bodyModel[175].setRotationPoint(-22F, 7F, 5.75F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 182
		bodyModel[176].setRotationPoint(-12F, 7F, 5.75F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 183
		bodyModel[177].setRotationPoint(-2F, 7F, 5.75F);

		bodyModel[178].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 184
		bodyModel[178].setRotationPoint(-32F, 7F, -9.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 185
		bodyModel[179].setRotationPoint(-22F, 7F, -9.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 186
		bodyModel[180].setRotationPoint(-12F, 7F, -9.5F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 187
		bodyModel[181].setRotationPoint(-2F, 7F, -9.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 188
		bodyModel[182].setRotationPoint(8F, 7F, -9.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 189
		bodyModel[183].setRotationPoint(18F, 7F, -9.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 190
		bodyModel[184].setRotationPoint(28F, 7F, -9.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 191
		bodyModel[185].setRotationPoint(38F, 7F, -9.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 192
		bodyModel[186].setRotationPoint(48F, 7F, -9.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 193
		bodyModel[187].setRotationPoint(48F, 7F, 2.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 194
		bodyModel[188].setRotationPoint(38F, 7F, 2.5F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 2, 7, 0F); // Box 195
		bodyModel[189].setRotationPoint(28F, 7F, 2.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 196
		bodyModel[190].setRotationPoint(-28F, 1F, -10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 197
		bodyModel[191].setRotationPoint(-18F, 1F, -10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 198
		bodyModel[192].setRotationPoint(-8F, 1F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 199
		bodyModel[193].setRotationPoint(2F, 1F, -10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 200
		bodyModel[194].setRotationPoint(12F, 1F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 201
		bodyModel[195].setRotationPoint(22F, 1F, -10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 202
		bodyModel[196].setRotationPoint(32F, 1F, 2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 203
		bodyModel[197].setRotationPoint(42F, 1F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 204
		bodyModel[198].setRotationPoint(52F, 1F, 2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 205
		bodyModel[199].setRotationPoint(52F, 1F, -10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 206
		bodyModel[200].setRotationPoint(42F, 1F, 2F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 207
		bodyModel[201].setRotationPoint(32F, 1F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 208
		bodyModel[202].setRotationPoint(-42F, 1F, 9F);
		bodyModel[202].rotateAngleY = 1.57079633F;

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 209
		bodyModel[203].setRotationPoint(-28F, 1F, 5.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 210
		bodyModel[204].setRotationPoint(-18F, 1F, 5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 211
		bodyModel[205].setRotationPoint(-8F, 1F, 5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 212
		bodyModel[206].setRotationPoint(2F, 1F, 5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213
		bodyModel[207].setRotationPoint(4.5F, 11.5F, 8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 214
		bodyModel[208].setRotationPoint(13.5F, 11.5F, 8F);

		bodyModel[209].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 215
		bodyModel[209].setRotationPoint(4.5F, 10F, 6F);

		bodyModel[210].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 216
		bodyModel[210].setRotationPoint(13.5F, 10F, 6F);

		bodyModel[211].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 217
		bodyModel[211].setRotationPoint(-54F, 10F, 5.02F);
		bodyModel[211].rotateAngleY = 0.16406095F;

		bodyModel[212].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 218
		bodyModel[212].setRotationPoint(-61F, 10F, 3.85F);
		bodyModel[212].rotateAngleY = 0.16406095F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 219
		bodyModel[213].setRotationPoint(-54.33F, 11.5F, 7F);
		bodyModel[213].rotateAngleY = 0.16406095F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 220
		bodyModel[214].setRotationPoint(-61.33F, 11.5F, 5.84F);
		bodyModel[214].rotateAngleY = 0.16406095F;

		this.flipAll();
	}
}