package tramsim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class TatraK2 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public TatraK2() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[222];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 234, 303, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 356, 303, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 314, 330, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 257, 335, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 394, 329, textureX, textureY); // Box 4
        bodyModel[5] = new ModelRendererTurbo(this, 314, 354, textureX, textureY); // Box 5
        bodyModel[6] = new ModelRendererTurbo(this, 115, 107, textureX, textureY); // Box 6
        bodyModel[7] = new ModelRendererTurbo(this, 131, 101, textureX, textureY); // Box 7
        bodyModel[8] = new ModelRendererTurbo(this, 115, 101, textureX, textureY); // Box 8
        bodyModel[9] = new ModelRendererTurbo(this, 214, 206, textureX, textureY); // Box 9
        bodyModel[10] = new ModelRendererTurbo(this, 214, 202, textureX, textureY); // Box 10
        bodyModel[11] = new ModelRendererTurbo(this, 226, 202, textureX, textureY); // Box 11
        bodyModel[12] = new ModelRendererTurbo(this, 226, 206, textureX, textureY); // Box 12
        bodyModel[13] = new ModelRendererTurbo(this, 232, 202, textureX, textureY); // Box 13
        bodyModel[14] = new ModelRendererTurbo(this, 232, 206, textureX, textureY); // Box 14
        bodyModel[15] = new ModelRendererTurbo(this, 447, 390, textureX, textureY); // Box 27
        bodyModel[16] = new ModelRendererTurbo(this, 434, 308, textureX, textureY); // Box 28
        bodyModel[17] = new ModelRendererTurbo(this, 237, 119, textureX, textureY); // Box 29
        bodyModel[18] = new ModelRendererTurbo(this, 245, 112, textureX, textureY); // Box 30
        bodyModel[19] = new ModelRendererTurbo(this, 266, 112, textureX, textureY); // Box 31
        bodyModel[20] = new ModelRendererTurbo(this, 142, 100, textureX, textureY); // Box 32
        bodyModel[21] = new ModelRendererTurbo(this, 148, 94, textureX, textureY); // Box 33
        bodyModel[22] = new ModelRendererTurbo(this, 142, 95, textureX, textureY); // Box 34
        bodyModel[23] = new ModelRendererTurbo(this, 141, 106, textureX, textureY); // Box 35
        bodyModel[24] = new ModelRendererTurbo(this, 250, 102, textureX, textureY); // Box 36
        bodyModel[25] = new ModelRendererTurbo(this, 389, 361, textureX, textureY); // Box 37
        bodyModel[26] = new ModelRendererTurbo(this, 417, 368, textureX, textureY); // Box 40
        bodyModel[27] = new ModelRendererTurbo(this, 21, 226, textureX, textureY); // Box 46
        bodyModel[28] = new ModelRendererTurbo(this, 36, 267, textureX, textureY); // Box 47
        bodyModel[29] = new ModelRendererTurbo(this, 318, 277, textureX, textureY); // Box 51
        bodyModel[30] = new ModelRendererTurbo(this, 324, 172, textureX, textureY); // Box 52
        bodyModel[31] = new ModelRendererTurbo(this, 282, 175, textureX, textureY); // Box 54
        bodyModel[32] = new ModelRendererTurbo(this, 403, 258, textureX, textureY); // Box 63
        bodyModel[33] = new ModelRendererTurbo(this, 49, 261, textureX, textureY); // Box 64
        bodyModel[34] = new ModelRendererTurbo(this, 424, 198, textureX, textureY); // Box 65
        bodyModel[35] = new ModelRendererTurbo(this, 82, 267, textureX, textureY); // Box 66
        bodyModel[36] = new ModelRendererTurbo(this, 82, 273, textureX, textureY); // Box 67
        bodyModel[37] = new ModelRendererTurbo(this, 428, 260, textureX, textureY); // Box 68
        bodyModel[38] = new ModelRendererTurbo(this, 429, 253, textureX, textureY); // Box 69
        bodyModel[39] = new ModelRendererTurbo(this, 447, 195, textureX, textureY); // Box 70
        bodyModel[40] = new ModelRendererTurbo(this, 447, 202, textureX, textureY); // Box 71
        bodyModel[41] = new ModelRendererTurbo(this, 207, 233, textureX, textureY); // Box 72
        bodyModel[42] = new ModelRendererTurbo(this, 12, 252, textureX, textureY); // Box 75
        bodyModel[43] = new ModelRendererTurbo(this, 1, 219, textureX, textureY); // Box 80
        bodyModel[44] = new ModelRendererTurbo(this, 73, 205, textureX, textureY); // Box 81
        bodyModel[45] = new ModelRendererTurbo(this, 105, 205, textureX, textureY); // Box 82
        bodyModel[46] = new ModelRendererTurbo(this, 105, 205, textureX, textureY); // Box 83
        bodyModel[47] = new ModelRendererTurbo(this, 81, 205, textureX, textureY); // Box 85
        bodyModel[48] = new ModelRendererTurbo(this, 285, 248, textureX, textureY); // Box 86
        bodyModel[49] = new ModelRendererTurbo(this, 64, 247, textureX, textureY); // Box 87
        bodyModel[50] = new ModelRendererTurbo(this, 1, 219, textureX, textureY); // Box 91
        bodyModel[51] = new ModelRendererTurbo(this, 1, 219, textureX, textureY); // Box 96
        bodyModel[52] = new ModelRendererTurbo(this, 1, 219, textureX, textureY); // Box 97
        bodyModel[53] = new ModelRendererTurbo(this, 89, 205, textureX, textureY); // Box 98
        bodyModel[54] = new ModelRendererTurbo(this, 73, 195, textureX, textureY); // Box 99
        bodyModel[55] = new ModelRendererTurbo(this, 237, 248, textureX, textureY); // Box 100
        bodyModel[56] = new ModelRendererTurbo(this, 96, 205, textureX, textureY); // Box 101
        bodyModel[57] = new ModelRendererTurbo(this, 81, 195, textureX, textureY); // Box 104
        bodyModel[58] = new ModelRendererTurbo(this, 19, 247, textureX, textureY); // Box 109
        bodyModel[59] = new ModelRendererTurbo(this, 90, 195, textureX, textureY); // Box 115
        bodyModel[60] = new ModelRendererTurbo(this, 90, 195, textureX, textureY); // Box 116
        bodyModel[61] = new ModelRendererTurbo(this, 90, 195, textureX, textureY); // Box 117
        bodyModel[62] = new ModelRendererTurbo(this, 90, 195, textureX, textureY); // Box 119
        bodyModel[63] = new ModelRendererTurbo(this, 57, 138, textureX, textureY); // Box 107
        bodyModel[64] = new ModelRendererTurbo(this, 57, 146, textureX, textureY); // Box 109
        bodyModel[65] = new ModelRendererTurbo(this, 207, 135, textureX, textureY); // Box 110
        bodyModel[66] = new ModelRendererTurbo(this, 229, 135, textureX, textureY); // Box 111
        bodyModel[67] = new ModelRendererTurbo(this, 187, 247, textureX, textureY); // Box 112
        bodyModel[68] = new ModelRendererTurbo(this, 201, 146, textureX, textureY); // Box 115
        bodyModel[69] = new ModelRendererTurbo(this, 210, 146, textureX, textureY); // Box 116
        bodyModel[70] = new ModelRendererTurbo(this, 227, 168, textureX, textureY); // Box 117
        bodyModel[71] = new ModelRendererTurbo(this, 265, 168, textureX, textureY); // Box 118
        bodyModel[72] = new ModelRendererTurbo(this, 241, 157, textureX, textureY); // Box 119
        bodyModel[73] = new ModelRendererTurbo(this, 72, 146, textureX, textureY); // Box 130
        bodyModel[74] = new ModelRendererTurbo(this, 72, 138, textureX, textureY); // Box 131
        bodyModel[75] = new ModelRendererTurbo(this, 1, 216, textureX, textureY); // Box 139
        bodyModel[76] = new ModelRendererTurbo(this, 12, 215, textureX, textureY); // Box 140
        bodyModel[77] = new ModelRendererTurbo(this, 19, 216, textureX, textureY); // Box 141
        bodyModel[78] = new ModelRendererTurbo(this, 153, 220, textureX, textureY); // Box 135
        bodyModel[79] = new ModelRendererTurbo(this, 373, 218, textureX, textureY); // Box 136
        bodyModel[80] = new ModelRendererTurbo(this, 136, 211, textureX, textureY); // Box 137
        bodyModel[81] = new ModelRendererTurbo(this, 141, 217, textureX, textureY); // Box 138
        bodyModel[82] = new ModelRendererTurbo(this, 140, 201, textureX, textureY); // Box 139
        bodyModel[83] = new ModelRendererTurbo(this, 142, 195, textureX, textureY); // Box 140
        bodyModel[84] = new ModelRendererTurbo(this, 148, 201, textureX, textureY); // Box 141
        bodyModel[85] = new ModelRendererTurbo(this, 132, 201, textureX, textureY); // Box 142
        bodyModel[86] = new ModelRendererTurbo(this, 175, 192, textureX, textureY); // Box 143
        bodyModel[87] = new ModelRendererTurbo(this, 177, 227, textureX, textureY); // Box 146
        bodyModel[88] = new ModelRendererTurbo(this, 192, 210, textureX, textureY); // Box 147
        bodyModel[89] = new ModelRendererTurbo(this, 188, 188, textureX, textureY); // Box 148
        bodyModel[90] = new ModelRendererTurbo(this, 188, 188, textureX, textureY); // Box 150
        bodyModel[91] = new ModelRendererTurbo(this, 188, 188, textureX, textureY); // Box 151
        bodyModel[92] = new ModelRendererTurbo(this, 188, 188, textureX, textureY); // Box 152
        bodyModel[93] = new ModelRendererTurbo(this, 188, 188, textureX, textureY); // Box 159
        bodyModel[94] = new ModelRendererTurbo(this, 192, 210, textureX, textureY); // Box 165
        bodyModel[95] = new ModelRendererTurbo(this, 192, 210, textureX, textureY); // Box 166
        bodyModel[96] = new ModelRendererTurbo(this, 192, 210, textureX, textureY); // Box 167
        bodyModel[97] = new ModelRendererTurbo(this, 192, 210, textureX, textureY); // Box 168
        bodyModel[98] = new ModelRendererTurbo(this, 192, 210, textureX, textureY); // Box 169
        bodyModel[99] = new ModelRendererTurbo(this, 192, 210, textureX, textureY); // Box 170
        bodyModel[100] = new ModelRendererTurbo(this, 192, 210, textureX, textureY); // Box 171
        bodyModel[101] = new ModelRendererTurbo(this, 192, 210, textureX, textureY); // Box 172
        bodyModel[102] = new ModelRendererTurbo(this, 195, 198, textureX, textureY); // Box 179
        bodyModel[103] = new ModelRendererTurbo(this, 195, 198, textureX, textureY); // Box 180
        bodyModel[104] = new ModelRendererTurbo(this, 195, 198, textureX, textureY); // Box 181
        bodyModel[105] = new ModelRendererTurbo(this, 195, 198, textureX, textureY); // Box 182
        bodyModel[106] = new ModelRendererTurbo(this, 195, 198, textureX, textureY); // Box 183
        bodyModel[107] = new ModelRendererTurbo(this, 195, 198, textureX, textureY); // Box 184
        bodyModel[108] = new ModelRendererTurbo(this, 195, 198, textureX, textureY); // Box 185
        bodyModel[109] = new ModelRendererTurbo(this, 195, 198, textureX, textureY); // Box 186
        bodyModel[110] = new ModelRendererTurbo(this, 195, 198, textureX, textureY); // Box 187
        bodyModel[111] = new ModelRendererTurbo(this, 177, 175, textureX, textureY); // Box 196
        bodyModel[112] = new ModelRendererTurbo(this, 177, 175, textureX, textureY); // Box 199
        bodyModel[113] = new ModelRendererTurbo(this, 177, 175, textureX, textureY); // Box 202
        bodyModel[114] = new ModelRendererTurbo(this, 177, 175, textureX, textureY); // Box 203
        bodyModel[115] = new ModelRendererTurbo(this, 177, 175, textureX, textureY); // Box 204
        bodyModel[116] = new ModelRendererTurbo(this, 188, 175, textureX, textureY); // Box 205
        bodyModel[117] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 210
        bodyModel[118] = new ModelRendererTurbo(this, 194, 219, textureX, textureY); // Box 211
        bodyModel[119] = new ModelRendererTurbo(this, 194, 219, textureX, textureY); // Box 218
        bodyModel[120] = new ModelRendererTurbo(this, 194, 219, textureX, textureY); // Box 219
        bodyModel[121] = new ModelRendererTurbo(this, 194, 219, textureX, textureY); // Box 220
        bodyModel[122] = new ModelRendererTurbo(this, 194, 219, textureX, textureY); // Box 221
        bodyModel[123] = new ModelRendererTurbo(this, 194, 219, textureX, textureY); // Box 222
        bodyModel[124] = new ModelRendererTurbo(this, 194, 219, textureX, textureY); // Box 223
        bodyModel[125] = new ModelRendererTurbo(this, 194, 219, textureX, textureY); // Box 224
        bodyModel[126] = new ModelRendererTurbo(this, 194, 219, textureX, textureY); // Box 225
        bodyModel[127] = new ModelRendererTurbo(this, 176, 184, textureX, textureY); // Box 229
        bodyModel[128] = new ModelRendererTurbo(this, 176, 184, textureX, textureY); // Box 232
        bodyModel[129] = new ModelRendererTurbo(this, 176, 184, textureX, textureY); // Box 233
        bodyModel[130] = new ModelRendererTurbo(this, 176, 184, textureX, textureY); // Box 234
        bodyModel[131] = new ModelRendererTurbo(this, 176, 184, textureX, textureY); // Box 235
        bodyModel[132] = new ModelRendererTurbo(this, 160, 180, textureX, textureY); // Box 236
        bodyModel[133] = new ModelRendererTurbo(this, 160, 170, textureX, textureY); // Box 237
        bodyModel[134] = new ModelRendererTurbo(this, 57, 167, textureX, textureY); // Box 238
        bodyModel[135] = new ModelRendererTurbo(this, 57, 164, textureX, textureY); // Box 239
        bodyModel[136] = new ModelRendererTurbo(this, 170, 170, textureX, textureY); // Box 240
        bodyModel[137] = new ModelRendererTurbo(this, 170, 170, textureX, textureY); // Box 241
        bodyModel[138] = new ModelRendererTurbo(this, 170, 170, textureX, textureY); // Box 242
        bodyModel[139] = new ModelRendererTurbo(this, 170, 170, textureX, textureY); // Box 243
        bodyModel[140] = new ModelRendererTurbo(this, 170, 170, textureX, textureY); // Box 244
        bodyModel[141] = new ModelRendererTurbo(this, 170, 170, textureX, textureY); // Box 245
        bodyModel[142] = new ModelRendererTurbo(this, 170, 170, textureX, textureY); // Box 246
        bodyModel[143] = new ModelRendererTurbo(this, 170, 170, textureX, textureY); // Box 247
        bodyModel[144] = new ModelRendererTurbo(this, 170, 170, textureX, textureY); // Box 248
        bodyModel[145] = new ModelRendererTurbo(this, 170, 170, textureX, textureY); // Box 249
        bodyModel[146] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 255
        bodyModel[147] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 259
        bodyModel[148] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 260
        bodyModel[149] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 261
        bodyModel[150] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 262
        bodyModel[151] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 263
        bodyModel[152] = new ModelRendererTurbo(this, 485, 158, textureX, textureY); // Box 264
        bodyModel[153] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 265
        bodyModel[154] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 266
        bodyModel[155] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 267
        bodyModel[156] = new ModelRendererTurbo(this, 347, 196, textureX, textureY); // Box 268
        bodyModel[157] = new ModelRendererTurbo(this, 340, 195, textureX, textureY); // Box 270
        bodyModel[158] = new ModelRendererTurbo(this, 8, 46, textureX, textureY); // Box 244
        bodyModel[159] = new ModelRendererTurbo(this, 13, 46, textureX, textureY); // Box 245
        bodyModel[160] = new ModelRendererTurbo(this, 13, 49, textureX, textureY); // Box 246
        bodyModel[161] = new ModelRendererTurbo(this, 8, 49, textureX, textureY); // Box 247
        bodyModel[162] = new ModelRendererTurbo(this, 20, 46, textureX, textureY); // Box 248
        bodyModel[163] = new ModelRendererTurbo(this, 25, 46, textureX, textureY); // Box 249
        bodyModel[164] = new ModelRendererTurbo(this, 20, 49, textureX, textureY); // Box 250
        bodyModel[165] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 251
        bodyModel[166] = new ModelRendererTurbo(this, 8, 58, textureX, textureY); // Box 252
        bodyModel[167] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // Box 253
        bodyModel[168] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 254
        bodyModel[169] = new ModelRendererTurbo(this, 8, 62, textureX, textureY); // Box 255
        bodyModel[170] = new ModelRendererTurbo(this, 24, 22, textureX, textureY); // Box 261
        bodyModel[171] = new ModelRendererTurbo(this, 43, 28, textureX, textureY); // Box 262
        bodyModel[172] = new ModelRendererTurbo(this, 17, 28, textureX, textureY); // Box 265
        bodyModel[173] = new ModelRendererTurbo(this, 50, 28, textureX, textureY); // Box 266
        bodyModel[174] = new ModelRendererTurbo(this, 10, 28, textureX, textureY); // Box 267
        bodyModel[175] = new ModelRendererTurbo(this, 188, 175, textureX, textureY); // Box 268
        bodyModel[176] = new ModelRendererTurbo(this, 177, 227, textureX, textureY); // Box 269
        bodyModel[177] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 270
        bodyModel[178] = new ModelRendererTurbo(this, 160, 180, textureX, textureY); // Box 194
        bodyModel[179] = new ModelRendererTurbo(this, 160, 170, textureX, textureY); // Box 195
        bodyModel[180] = new ModelRendererTurbo(this, 188, 188, textureX, textureY); // Box 193
        bodyModel[181] = new ModelRendererTurbo(this, 176, 184, textureX, textureY); // Box 194
        bodyModel[182] = new ModelRendererTurbo(this, 177, 175, textureX, textureY); // Box 195
        bodyModel[183] = new ModelRendererTurbo(this, 160, 180, textureX, textureY); // Box 199
        bodyModel[184] = new ModelRendererTurbo(this, 160, 170, textureX, textureY); // Box 200
        bodyModel[185] = new ModelRendererTurbo(this, 318, 284, textureX, textureY); // Box 200
        bodyModel[186] = new ModelRendererTurbo(this, 21, 229, textureX, textureY); // Box 201
        bodyModel[187] = new ModelRendererTurbo(this, 446, 256, textureX, textureY); // Box 202
        bodyModel[188] = new ModelRendererTurbo(this, 446, 249, textureX, textureY); // Box 203
        bodyModel[189] = new ModelRendererTurbo(this, 36, 270, textureX, textureY); // Box 204
        bodyModel[190] = new ModelRendererTurbo(this, 157, 211, textureX, textureY); // Box 204
        bodyModel[191] = new ModelRendererTurbo(this, 157, 199, textureX, textureY); // Box 205
        bodyModel[192] = new ModelRendererTurbo(this, 154, 223, textureX, textureY); // Box 206
        bodyModel[193] = new ModelRendererTurbo(this, 28, 56, textureX, textureY); // Box 207
        bodyModel[194] = new ModelRendererTurbo(this, 71, 56, textureX, textureY); // Box 208
        bodyModel[195] = new ModelRendererTurbo(this, 63, 72, textureX, textureY); // Box 209
        bodyModel[196] = new ModelRendererTurbo(this, 38, 72, textureX, textureY); // Box 210
        bodyModel[197] = new ModelRendererTurbo(this, 45, 73, textureX, textureY); // Box 211
        bodyModel[198] = new ModelRendererTurbo(this, 58, 73, textureX, textureY); // Box 212
        bodyModel[199] = new ModelRendererTurbo(this, 26, 76, textureX, textureY); // Box 213
        bodyModel[200] = new ModelRendererTurbo(this, 70, 76, textureX, textureY); // Box 214
        bodyModel[201] = new ModelRendererTurbo(this, 78, 75, textureX, textureY); // Box 215
        bodyModel[202] = new ModelRendererTurbo(this, 20, 75, textureX, textureY); // Box 216
        bodyModel[203] = new ModelRendererTurbo(this, 37, 64, textureX, textureY); // Box 217
        bodyModel[204] = new ModelRendererTurbo(this, 33, 80, textureX, textureY); // Box 218
        bodyModel[205] = new ModelRendererTurbo(this, 55, 171, textureX, textureY); // Box 194
        bodyModel[206] = new ModelRendererTurbo(this, 66, 171, textureX, textureY); // Box 195
        bodyModel[207] = new ModelRendererTurbo(this, 77, 171, textureX, textureY); // Box 196
        bodyModel[208] = new ModelRendererTurbo(this, 46, 171, textureX, textureY); // Box 197
        bodyModel[209] = new ModelRendererTurbo(this, 110, 171, textureX, textureY); // Box 198
        bodyModel[210] = new ModelRendererTurbo(this, 121, 171, textureX, textureY); // Box 199
        bodyModel[211] = new ModelRendererTurbo(this, 132, 171, textureX, textureY); // Box 200
        bodyModel[212] = new ModelRendererTurbo(this, 101, 171, textureX, textureY); // Box 201
        bodyModel[213] = new ModelRendererTurbo(this, 38, 255, textureX, textureY); // Box 220
        bodyModel[214] = new ModelRendererTurbo(this, 38, 259, textureX, textureY); // Box 221
        bodyModel[215] = new ModelRendererTurbo(this, 1, 219, textureX, textureY); // Box 222
        bodyModel[216] = new ModelRendererTurbo(this, 1, 219, textureX, textureY); // Box 223
        bodyModel[217] = new ModelRendererTurbo(this, 1, 219, textureX, textureY); // Box 224
        bodyModel[218] = new ModelRendererTurbo(this, 1, 219, textureX, textureY); // Box 225
        bodyModel[219] = new ModelRendererTurbo(this, 22, 219, textureX, textureY); // Box 226
        bodyModel[220] = new ModelRendererTurbo(this, 54, 103, textureX, textureY); // Box 202
        bodyModel[221] = new ModelRendererTurbo(this, 24, 103, textureX, textureY); // Box 203

        bodyModel[0].addBox(0F, 0F, 0F, 35, 1, 20, 0F); // Box 0
        bodyModel[0].setRotationPoint(-21F, 2F, -10F);

        bodyModel[1].addBox(0F, 0F, 0F, 15, 1, 20, 0F); // Box 1
        bodyModel[1].setRotationPoint(27F, 2F, -10F);

        bodyModel[2].addBox(0F, 0F, 0F, 13, 3, 17, 0F); // Box 2
        bodyModel[2].setRotationPoint(14F, 2F, -10F);

        bodyModel[3].addBox(0F, 0F, 0F, 16, 2, 20, 0F); // Box 3
        bodyModel[3].setRotationPoint(-2F, 3F, -10F);

        bodyModel[4].addBox(0F, 0F, 0F, 9, 2, 20, 0F); // Box 4
        bodyModel[4].setRotationPoint(27F, 3F, -10F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 5
        bodyModel[5].setRotationPoint(13F, 5F, -10F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 6
        bodyModel[6].setRotationPoint(15F, 3F, 7F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 7
        bodyModel[7].setRotationPoint(14F, 2F, 7F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 8
        bodyModel[8].setRotationPoint(25F, 2F, 7F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 9
        bodyModel[9].setRotationPoint(36F, 3F, -10F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[10].setRotationPoint(36F, 3F, 10F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
        bodyModel[11].setRotationPoint(-4F, 3F, 10F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 12
        bodyModel[12].setRotationPoint(-4F, 3F, -10F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 13
        bodyModel[13].setRotationPoint(-21F, 3F, 10F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
        bodyModel[14].setRotationPoint(-21F, 3F, -10F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 1, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 27
        bodyModel[15].setRotationPoint(-33F, 5F, -10F);

        bodyModel[16].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 28
        bodyModel[16].setRotationPoint(-22F, 2F, -10F);

        bodyModel[17].addBox(0F, 0F, 0F, 18, 3, 10, 0F); // Box 29
        bodyModel[17].setRotationPoint(-40F, 2F, -5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 30
        bodyModel[18].setRotationPoint(-40F, 2F, 5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        bodyModel[19].setRotationPoint(-40F, 2F, -8F);

        bodyModel[20].addShapeBox(-11F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 32
        bodyModel[20].setRotationPoint(-22F, 2F, 5F);

        bodyModel[21].addShapeBox(-1F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F); // Box 33
        bodyModel[21].setRotationPoint(-22F, 2F, 6F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -2.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -2.1F, 0F, 0F, 0F); // Box 34
        bodyModel[22].setRotationPoint(-33F, 2F, 5F);

        bodyModel[23].addShapeBox(-11F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 35
        bodyModel[23].setRotationPoint(-22F, 3F, 6F);
        bodyModel[23].rotateAngleY = 0.16144296F;

        bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
        bodyModel[24].setRotationPoint(-33F, 2F, -10F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[25].setRotationPoint(-22F, 5F, -10F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 40
        bodyModel[26].setRotationPoint(-34F, 5F, -8F);

        bodyModel[27].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 46
        bodyModel[27].setRotationPoint(-22F, -14F, -10F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 47
        bodyModel[28].setRotationPoint(-33F, -14F, -8F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 51
        bodyModel[29].setRotationPoint(-22F, -16F, -10F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 64, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        bodyModel[30].setRotationPoint(-22F, -17F, -9F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 1, 18, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 54
        bodyModel[31].setRotationPoint(-33F, -17F, -9F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[32].setRotationPoint(-39F, -16F, -5F);

        bodyModel[33].addShapeBox(0F, 0F, 2F, 1, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 64
        bodyModel[33].setRotationPoint(-39F, -14F, -8F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 65
        bodyModel[34].setRotationPoint(-38F, -17F, -5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 66
        bodyModel[35].setRotationPoint(-38F, -14F, -8F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 67
        bodyModel[36].setRotationPoint(-38F, -14F, 5F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, -2.67F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 68
        bodyModel[37].setRotationPoint(-38F, -16F, -8F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.67F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 69
        bodyModel[38].setRotationPoint(-38F, -16F, 5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F); // Box 70
        bodyModel[39].setRotationPoint(-38F, -17F, 5F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 71
        bodyModel[40].setRotationPoint(-38F, -17F, -7F);

        bodyModel[41].addBox(0F, 0F, 0F, 64, 8, 1, 0F); // Box 72
        bodyModel[41].setRotationPoint(-22F, -6F, -10F);

        bodyModel[42].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 75
        bodyModel[42].setRotationPoint(-22F, -13F, -10F);

        bodyModel[43].addBox(0F, 0F, 0F, 10, 6, 0, 0F); // Box 80
        bodyModel[43].setRotationPoint(2F, -12F, 9.5F);

        bodyModel[44].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 81
        bodyModel[44].setRotationPoint(-22F, -12F, 9F);

        bodyModel[45].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 82
        bodyModel[45].setRotationPoint(-10F, -12F, 9F);

        bodyModel[46].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 83
        bodyModel[46].setRotationPoint(1F, -12F, 9F);

        bodyModel[47].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 85
        bodyModel[47].setRotationPoint(12F, -12F, 9F);

        bodyModel[48].addBox(0F, 0F, 0F, 36, 8, 1, 0F); // Box 86
        bodyModel[48].setRotationPoint(-22F, -6F, 9F);

        bodyModel[49].addBox(0F, 0F, 0F, 36, 1, 1, 0F); // Box 87
        bodyModel[49].setRotationPoint(-22F, -13F, 9F);

        bodyModel[50].addBox(0F, 0F, 0F, 10, 6, 0, 0F); // Box 91
        bodyModel[50].setRotationPoint(29F, -12F, 9.5F);

        bodyModel[51].addBox(0F, 0F, 0F, 10, 6, 0, 0F); // Box 96
        bodyModel[51].setRotationPoint(-9F, -12F, 9.5F);

        bodyModel[52].addBox(0F, 0F, 0F, 10, 6, 0, 0F); // Box 97
        bodyModel[52].setRotationPoint(-20F, -12F, 9.5F);

        bodyModel[53].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 98
        bodyModel[53].setRotationPoint(27F, -12F, 9F);

        bodyModel[54].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 99
        bodyModel[54].setRotationPoint(-22F, -12F, -10F);

        bodyModel[55].addBox(0F, 0F, 0F, 15, 8, 1, 0F); // Box 100
        bodyModel[55].setRotationPoint(27F, -6F, 9F);

        bodyModel[56].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 101
        bodyModel[56].setRotationPoint(39F, -12F, 9F);

        bodyModel[57].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 104
        bodyModel[57].setRotationPoint(39F, -12F, -10F);

        bodyModel[58].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 109
        bodyModel[58].setRotationPoint(27F, -13F, 9F);

        bodyModel[59].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 115
        bodyModel[59].setRotationPoint(-10F, -12F, -10F);

        bodyModel[60].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 116
        bodyModel[60].setRotationPoint(1F, -12F, -10F);

        bodyModel[61].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 117
        bodyModel[61].setRotationPoint(12F, -12F, -10F);

        bodyModel[62].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 119
        bodyModel[62].setRotationPoint(28F, -12F, -10F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 107
        bodyModel[63].setRotationPoint(-41F, 2F, 0F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 109
        bodyModel[64].setRotationPoint(-41F, -5F, 0F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 7, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 110
        bodyModel[65].setRotationPoint(-40F, -5F, 5F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 111
        bodyModel[66].setRotationPoint(-40F, -5F, -8F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 11, 15, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 112
        bodyModel[67].setRotationPoint(-33F, -13F, -10F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.275F); // Box 115
        bodyModel[68].setRotationPoint(-34F, -13F, 5F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, -0.275F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.75F); // Box 116
        bodyModel[69].setRotationPoint(-34F, -13F, -8F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 8, 0, 0F,-2F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F); // Box 117
        bodyModel[70].setRotationPoint(-40F, -13F, 5.5F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 8, 0, 0F,-2F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F); // Box 118
        bodyModel[71].setRotationPoint(-40F, -13F, -5.5F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 8, 11, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 119
        bodyModel[72].setRotationPoint(-41F, -13F, -5.5F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[73].setRotationPoint(-41F, -5F, -6F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[74].setRotationPoint(-41F, 2F, -6F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 139
        bodyModel[75].setRotationPoint(-44F, 3.5F, -0.25F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
        bodyModel[76].setRotationPoint(-45F, 3.25F, -0.75F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 141
        bodyModel[77].setRotationPoint(-46F, 3.5F, -0.75F);

        bodyModel[78].addBox(0F, 0F, 0F, 1, 16, 8, 0F); // Box 135
        bodyModel[78].setRotationPoint(-29F, -14F, -8F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 0F); // Box 136
        bodyModel[79].setRotationPoint(-40F, -5F, -5F);

        bodyModel[80].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 137
        bodyModel[80].setRotationPoint(-34F, -1F, -5F);

        bodyModel[81].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 138
        bodyModel[81].setRotationPoint(-33F, 0F, -4F);

        bodyModel[82].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 139
        bodyModel[82].setRotationPoint(-30F, -6F, -5F);

        bodyModel[83].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 140
        bodyModel[83].setRotationPoint(-30F, -8F, -4F);

        bodyModel[84].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 141
        bodyModel[84].setRotationPoint(-33F, -4F, -6F);

        bodyModel[85].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 142
        bodyModel[85].setRotationPoint(-33F, -4F, -1F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 15, 7, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
        bodyModel[86].setRotationPoint(-34F, -13F, 0F);

        bodyModel[87].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 146
        bodyModel[87].setRotationPoint(-18F, -1F, 5F);

        bodyModel[88].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 147
        bodyModel[88].setRotationPoint(-16F, -1F, -9F);

        bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 148
        bodyModel[89].setRotationPoint(-10F, -1F, 5F);

        bodyModel[90].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 150
        bodyModel[90].setRotationPoint(-4F, -1F, 5F);

        bodyModel[91].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 151
        bodyModel[91].setRotationPoint(2F, -1F, 5F);

        bodyModel[92].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 152
        bodyModel[92].setRotationPoint(8F, -1F, 5F);

        bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 159
        bodyModel[93].setRotationPoint(37F, -1F, 3.5F);
        bodyModel[93].rotateAngleY = 0.85521133F;

        bodyModel[94].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 165
        bodyModel[94].setRotationPoint(-10F, -1F, -9F);

        bodyModel[95].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 166
        bodyModel[95].setRotationPoint(-4F, -1F, -9F);

        bodyModel[96].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 167
        bodyModel[96].setRotationPoint(2F, -1F, -9F);

        bodyModel[97].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 168
        bodyModel[97].setRotationPoint(8F, -1F, -9F);

        bodyModel[98].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 169
        bodyModel[98].setRotationPoint(14F, -1F, -9F);

        bodyModel[99].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 170
        bodyModel[99].setRotationPoint(20F, -1F, -9F);

        bodyModel[100].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 171
        bodyModel[100].setRotationPoint(26F, -1F, -9F);

        bodyModel[101].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 172
        bodyModel[101].setRotationPoint(32F, -1F, -9F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
        bodyModel[102].setRotationPoint(-13F, -5F, -9F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
        bodyModel[103].setRotationPoint(-7F, -5F, -9F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
        bodyModel[104].setRotationPoint(-1F, -5F, -9F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
        bodyModel[105].setRotationPoint(5F, -5F, -9F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        bodyModel[106].setRotationPoint(11F, -5F, -9F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
        bodyModel[107].setRotationPoint(17F, -5F, -9F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        bodyModel[108].setRotationPoint(23F, -5F, -9F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        bodyModel[109].setRotationPoint(29F, -5F, -9F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
        bodyModel[110].setRotationPoint(35F, -5F, -9F);

        bodyModel[111].addShapeBox(1F, 0F, 2.25F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
        bodyModel[111].setRotationPoint(40F, -5F, 3.5F);
        bodyModel[111].rotateAngleY = 0.85521133F;

        bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
        bodyModel[112].setRotationPoint(11F, -5F, 5F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
        bodyModel[113].setRotationPoint(5F, -5F, 5F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
        bodyModel[114].setRotationPoint(-1F, -5F, 5F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
        bodyModel[115].setRotationPoint(-7F, -5F, 5F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
        bodyModel[116].setRotationPoint(-18F, -5F, 5F);

        bodyModel[117].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 210
        bodyModel[117].setRotationPoint(-17.5F, 0F, 5.5F);

        bodyModel[118].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 211
        bodyModel[118].setRotationPoint(-15.5F, 0F, -8.5F);

        bodyModel[119].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 218
        bodyModel[119].setRotationPoint(32.5F, 0F, -8.5F);

        bodyModel[120].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 219
        bodyModel[120].setRotationPoint(26.5F, 0F, -8.5F);

        bodyModel[121].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 220
        bodyModel[121].setRotationPoint(20.5F, 0F, -8.5F);

        bodyModel[122].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 221
        bodyModel[122].setRotationPoint(14.5F, 0F, -8.5F);

        bodyModel[123].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 222
        bodyModel[123].setRotationPoint(8.5F, 0F, -8.5F);

        bodyModel[124].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 223
        bodyModel[124].setRotationPoint(2.5F, 0F, -8.5F);

        bodyModel[125].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 224
        bodyModel[125].setRotationPoint(-3.5F, 0F, -8.5F);

        bodyModel[126].addBox(0F, 0F, 0F, 3, 2, 6, 0F); // Box 225
        bodyModel[126].setRotationPoint(-9.5F, 0F, -8.5F);

        bodyModel[127].addBox(0F, 0F, 0.5F, 3, 2, 3, 0F); // Box 229
        bodyModel[127].setRotationPoint(37.5F, 0F, 4F);
        bodyModel[127].rotateAngleY = 0.85521133F;

        bodyModel[128].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 232
        bodyModel[128].setRotationPoint(8.5F, 0F, 5.5F);

        bodyModel[129].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 233
        bodyModel[129].setRotationPoint(2.5F, 0F, 5.5F);

        bodyModel[130].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 234
        bodyModel[130].setRotationPoint(-3.5F, 0F, 5.5F);

        bodyModel[131].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 235
        bodyModel[131].setRotationPoint(-9.5F, 0F, 5.5F);

        bodyModel[132].addBox(0F, 0F, 0F, 1, 6, 5, 0F); // Box 236
        bodyModel[132].setRotationPoint(27F, -4F, 4F);

        bodyModel[133].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 237
        bodyModel[133].setRotationPoint(27F, -16F, 4F);

        bodyModel[134].addBox(0F, 0F, 0F, 53, 1, 1, 0F); // Box 238
        bodyModel[134].setRotationPoint(-18F, -14F, 2F);

        bodyModel[135].addBox(0F, 0F, 0F, 53, 1, 1, 0F); // Box 239
        bodyModel[135].setRotationPoint(-18F, -14F, -3F);

        bodyModel[136].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 240
        bodyModel[136].setRotationPoint(-18F, -16F, -3F);

        bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 241
        bodyModel[137].setRotationPoint(-18F, -16F, 2F);

        bodyModel[138].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 242
        bodyModel[138].setRotationPoint(-5F, -16F, -3F);

        bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 243
        bodyModel[139].setRotationPoint(-5F, -16F, 2F);

        bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 244
        bodyModel[140].setRotationPoint(8F, -16F, -3F);

        bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 245
        bodyModel[141].setRotationPoint(8F, -16F, 2F);

        bodyModel[142].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 246
        bodyModel[142].setRotationPoint(21F, -16F, -3F);

        bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 247
        bodyModel[143].setRotationPoint(21F, -16F, 2F);

        bodyModel[144].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 248
        bodyModel[144].setRotationPoint(34F, -16F, -3F);

        bodyModel[145].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 249
        bodyModel[145].setRotationPoint(34F, -16F, 2F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 255
        bodyModel[146].setRotationPoint(-5F, -22F, -4F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 259
        bodyModel[147].setRotationPoint(-12F, -27F, -4F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 260
        bodyModel[148].setRotationPoint(-12F, -27F, 3F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 7F, -6F, 0F, 7F, -6F, 0F, -7F, 6F, 0F, -7F); // Box 261
        bodyModel[149].setRotationPoint(-12F, -27F, 3F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 262
        bodyModel[150].setRotationPoint(-11F, -27F, 3F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 263
        bodyModel[151].setRotationPoint(-11F, -27F, -4F);

        bodyModel[152].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 264
        bodyModel[152].setRotationPoint(-12F, -27.5F, -5F);

        bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 265
        bodyModel[153].setRotationPoint(-5F, -22F, 3F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 266
        bodyModel[154].setRotationPoint(-18F, -22F, -4F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 267
        bodyModel[155].setRotationPoint(-18F, -22F, 3F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
        bodyModel[156].setRotationPoint(7F, -18F, -6F);

        bodyModel[157].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 270
        bodyModel[157].setRotationPoint(-22F, -19F, -1.5F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
        bodyModel[158].setRotationPoint(-42F, -2F, 3F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
        bodyModel[159].setRotationPoint(-42F, -2F, 2F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
        bodyModel[160].setRotationPoint(-42F, -1F, 2F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247
        bodyModel[161].setRotationPoint(-42F, -1F, 3F);

        bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
        bodyModel[162].setRotationPoint(-42F, -2F, -3F);

        bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
        bodyModel[163].setRotationPoint(-42F, -2F, -4F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 250
        bodyModel[164].setRotationPoint(-42F, -1F, -3F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
        bodyModel[165].setRotationPoint(-42F, -1F, -4F);

        bodyModel[166].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 252
        bodyModel[166].setRotationPoint(-10F, -10F, 10F);

        bodyModel[167].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 253
        bodyModel[167].setRotationPoint(-10F, -10F, -11F);

        bodyModel[168].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 254
        bodyModel[168].setRotationPoint(-37F, -2F, -7.85F);

        bodyModel[169].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 255
        bodyModel[169].setRotationPoint(-37F, -2F, 6.85F);

        bodyModel[170].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 261
        bodyModel[170].setRotationPoint(-42F, 1F, -4F);

        bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 262
        bodyModel[171].setRotationPoint(-42F, 1F, 4F);

        bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
        bodyModel[172].setRotationPoint(-42F, 1F, -6F);

        bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 266
        bodyModel[173].setRotationPoint(-41F, 1F, 6F);

        bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
        bodyModel[174].setRotationPoint(-41F, 1F, -8F);

        bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
        bodyModel[175].setRotationPoint(29F, -5F, 5F);

        bodyModel[176].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 269
        bodyModel[176].setRotationPoint(29F, -1F, 5F);

        bodyModel[177].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 270
        bodyModel[177].setRotationPoint(29.5F, 0F, 5.5F);

        bodyModel[178].addBox(0F, 0F, 0F, 1, 6, 5, 0F); // Box 194
        bodyModel[178].setRotationPoint(13F, -4F, 4F);

        bodyModel[179].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 195
        bodyModel[179].setRotationPoint(13F, -16F, 4F);

        bodyModel[180].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 193
        bodyModel[180].setRotationPoint(-22F, -1F, -9F);

        bodyModel[181].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 194
        bodyModel[181].setRotationPoint(-21.5F, 0F, -8.5F);

        bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
        bodyModel[182].setRotationPoint(-19F, -5F, -9F);

        bodyModel[183].addBox(0F, 0F, 0F, 1, 6, 5, 0F); // Box 199
        bodyModel[183].setRotationPoint(-20.5F, -4F, 4F);

        bodyModel[184].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 200
        bodyModel[184].setRotationPoint(-20.5F, -16F, 4F);

        bodyModel[185].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
        bodyModel[185].setRotationPoint(-22F, -16F, 8F);

        bodyModel[186].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 201
        bodyModel[186].setRotationPoint(-22F, -14F, 9F);

        bodyModel[187].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 202
        bodyModel[187].setRotationPoint(-33F, -16F, 7F);

        bodyModel[188].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 203
        bodyModel[188].setRotationPoint(-33F, -16F, -10F);

        bodyModel[189].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 204
        bodyModel[189].setRotationPoint(-33F, -14F, 7F);

        bodyModel[190].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 204
        bodyModel[190].setRotationPoint(-29F, -16F, -6F);

        bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 205
        bodyModel[191].setRotationPoint(-29F, -16F, 0F);

        bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
        bodyModel[192].setRotationPoint(-29F, -16F, -8F);

        bodyModel[193].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 207
        bodyModel[193].setRotationPoint(41F, -14F, -9F);

        bodyModel[194].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 208
        bodyModel[194].setRotationPoint(41F, -14F, 6F);

        bodyModel[195].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 209
        bodyModel[195].setRotationPoint(41F, -16F, 6F);

        bodyModel[196].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 210
        bodyModel[196].setRotationPoint(41F, -16F, -8F);

        bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
        bodyModel[197].setRotationPoint(41F, -16F, -9F);

        bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
        bodyModel[198].setRotationPoint(41F, -16F, 8F);

        bodyModel[199].addBox(0F, 0F, 0F, 2, 17, 3, 0F); // Box 213
        bodyModel[199].setRotationPoint(42F, -15F, -9F);

        bodyModel[200].addBox(0F, 0F, 0F, 2, 17, 3, 0F); // Box 214
        bodyModel[200].setRotationPoint(42F, -15F, 6F);

        bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
        bodyModel[201].setRotationPoint(42F, -16F, 7F);

        bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
        bodyModel[202].setRotationPoint(42F, -16F, -9F);

        bodyModel[203].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 217
        bodyModel[203].setRotationPoint(42F, -16F, -7F);

        bodyModel[204].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 218
        bodyModel[204].setRotationPoint(42F, 2F, -9F);

        bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 194
        bodyModel[205].setRotationPoint(20.5F, -13F, 8.75F);

        bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 195
        bodyModel[206].setRotationPoint(16.5F, -13F, 8.75F);

        bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 196
        bodyModel[207].setRotationPoint(14F, -13F, 8.75F);

        bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 197
        bodyModel[208].setRotationPoint(24F, -13F, 8.75F);

        bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
        bodyModel[209].setRotationPoint(-27.5F, -13F, 7.75F);
        bodyModel[209].rotateAngleY = 0.16144296F;

        bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 199
        bodyModel[210].setRotationPoint(-30.5F, -13F, 7.25F);
        bodyModel[210].rotateAngleY = 0.16144296F;

        bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 200
        bodyModel[211].setRotationPoint(-33.5F, -13F, 6.75F);
        bodyModel[211].rotateAngleY = 0.16144296F;

        bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 201
        bodyModel[212].setRotationPoint(-24.5F, -13F, 8.25F);
        bodyModel[212].rotateAngleY = 0.16144296F;

        bodyModel[213].addShapeBox(0F, 0F, 2F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.67F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
        bodyModel[213].setRotationPoint(-39F, -16F, -8F);

        bodyModel[214].addShapeBox(0F, 0F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.67F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 221
        bodyModel[214].setRotationPoint(-39F, -16F, 3F);

        bodyModel[215].addBox(0F, 0F, 0F, 10, 6, 0, 0F); // Box 222
        bodyModel[215].setRotationPoint(-20F, -12F, -9.5F);

        bodyModel[216].addBox(0F, 0F, 0F, 10, 6, 0, 0F); // Box 223
        bodyModel[216].setRotationPoint(-9F, -12F, -9.5F);

        bodyModel[217].addBox(0F, 0F, 0F, 10, 6, 0, 0F); // Box 224
        bodyModel[217].setRotationPoint(2F, -12F, -9.5F);

        bodyModel[218].addBox(0F, 0F, 0F, 10, 6, 0, 0F); // Box 225
        bodyModel[218].setRotationPoint(29F, -12F, -9.5F);

        bodyModel[219].addBox(0F, 0F, 0F, 15, 6, 0, 0F); // Box 226
        bodyModel[219].setRotationPoint(13F, -12F, -9.5F);

        bodyModel[220].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
        bodyModel[220].setRotationPoint(14F, -15F, 7F);

        bodyModel[221].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, -0.5F); // Box 203
        bodyModel[221].setRotationPoint(-33.5F, -15F, 6F);
        this.flipAll();
    }
}