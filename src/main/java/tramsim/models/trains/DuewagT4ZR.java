package tramsim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class DuewagT4ZR extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 256;

    public DuewagT4ZR() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[333];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 9
        bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 62
        bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 63
        bodyModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 65
        bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 66
        bodyModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 67
        bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 72
        bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 75
        bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 76
        bodyModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 77
        bodyModel[10] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 76
        bodyModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 79
        bodyModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 80
        bodyModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 81
        bodyModel[14] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Sta_Light_1
        bodyModel[15] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Sta_Light_2
        bodyModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Sta_Light_4
        bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Sta_Light_3
        bodyModel[18] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 140
        bodyModel[19] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 142
        bodyModel[20] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 145
        bodyModel[21] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
        bodyModel[22] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 165
        bodyModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 184
        bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 185
        bodyModel[25] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 186
        bodyModel[26] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 82
        bodyModel[27] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 58
        bodyModel[28] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 86
        bodyModel[29] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 179
        bodyModel[30] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 180
        bodyModel[31] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 181
        bodyModel[32] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 182
        bodyModel[33] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 183
        bodyModel[34] = new ModelRendererTurbo(this, 41, 23, textureX, textureY); // Box 161
        bodyModel[35] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 139
        bodyModel[36] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 141
        bodyModel[37] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 156
        bodyModel[38] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 294
        bodyModel[39] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 306
        bodyModel[40] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 0
        bodyModel[41] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 4
        bodyModel[42] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 5
        bodyModel[43] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 6
        bodyModel[44] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 294
        bodyModel[45] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 170
        bodyModel[46] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 92
        bodyModel[47] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 93
        bodyModel[48] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 94
        bodyModel[49] = new ModelRendererTurbo(this, 328, 33, textureX, textureY); // Box 95
        bodyModel[50] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 96
        bodyModel[51] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 97
        bodyModel[52] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 98
        bodyModel[53] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 99
        bodyModel[54] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 100
        bodyModel[55] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 103
        bodyModel[56] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 104
        bodyModel[57] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 105
        bodyModel[58] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 106
        bodyModel[59] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 107
        bodyModel[60] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 109
        bodyModel[61] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 110
        bodyModel[62] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 111
        bodyModel[63] = new ModelRendererTurbo(this, 114, 41, textureX, textureY); // Box 112
        bodyModel[64] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 113
        bodyModel[65] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 114
        bodyModel[66] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 115
        bodyModel[67] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 116
        bodyModel[68] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 117
        bodyModel[69] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 118
        bodyModel[70] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 119
        bodyModel[71] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 120
        bodyModel[72] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 121
        bodyModel[73] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 122
        bodyModel[74] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 123
        bodyModel[75] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 126
        bodyModel[76] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 127
        bodyModel[77] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 128
        bodyModel[78] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 129
        bodyModel[79] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 130
        bodyModel[80] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 131
        bodyModel[81] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 132
        bodyModel[82] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 133
        bodyModel[83] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 135
        bodyModel[84] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 136
        bodyModel[85] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 137
        bodyModel[86] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 138
        bodyModel[87] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 139
        bodyModel[88] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 141
        bodyModel[89] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 144
        bodyModel[90] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 145
        bodyModel[91] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 146
        bodyModel[92] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 147
        bodyModel[93] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 148
        bodyModel[94] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 149
        bodyModel[95] = new ModelRendererTurbo(this, 392, 65, textureX, textureY); // Box 150
        bodyModel[96] = new ModelRendererTurbo(this, 239, 57, textureX, textureY); // Box 151
        bodyModel[97] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 152
        bodyModel[98] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 153
        bodyModel[99] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 154
        bodyModel[100] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 155
        bodyModel[101] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 156
        bodyModel[102] = new ModelRendererTurbo(this, 26, 9, textureX, textureY); // Box 157
        bodyModel[103] = new ModelRendererTurbo(this, 58, 73, textureX, textureY); // Box 158
        bodyModel[104] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 159
        bodyModel[105] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 160
        bodyModel[106] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 165
        bodyModel[107] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 166
        bodyModel[108] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 167
        bodyModel[109] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 168
        bodyModel[110] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 169
        bodyModel[111] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 170
        bodyModel[112] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 171
        bodyModel[113] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 173
        bodyModel[114] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 174
        bodyModel[115] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 175
        bodyModel[116] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 176
        bodyModel[117] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 177
        bodyModel[118] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 178
        bodyModel[119] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 179
        bodyModel[120] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 180
        bodyModel[121] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 181
        bodyModel[122] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 182
        bodyModel[123] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 183
        bodyModel[124] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 184
        bodyModel[125] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 185
        bodyModel[126] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 186
        bodyModel[127] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 187
        bodyModel[128] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 188
        bodyModel[129] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 189
        bodyModel[130] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 190
        bodyModel[131] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 226
        bodyModel[132] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 227
        bodyModel[133] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 228
        bodyModel[134] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 195
        bodyModel[135] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 196
        bodyModel[136] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 197
        bodyModel[137] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 198
        bodyModel[138] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 199
        bodyModel[139] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 200
        bodyModel[140] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 202
        bodyModel[141] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 203
        bodyModel[142] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 204
        bodyModel[143] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 205
        bodyModel[144] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 206
        bodyModel[145] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 207
        bodyModel[146] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 208
        bodyModel[147] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 209
        bodyModel[148] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 211
        bodyModel[149] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 212
        bodyModel[150] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 8
        bodyModel[151] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 9
        bodyModel[152] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 10
        bodyModel[153] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 11
        bodyModel[154] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 12
        bodyModel[155] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 13
        bodyModel[156] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 15
        bodyModel[157] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 19
        bodyModel[158] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 21
        bodyModel[159] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 24
        bodyModel[160] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 124
        bodyModel[161] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 125
        bodyModel[162] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 127
        bodyModel[163] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 128
        bodyModel[164] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 129
        bodyModel[165] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 130
        bodyModel[166] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 131
        bodyModel[167] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 126
        bodyModel[168] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 449
        bodyModel[169] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 450
        bodyModel[170] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 385
        bodyModel[171] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 386
        bodyModel[172] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 388
        bodyModel[173] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 389
        bodyModel[174] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 390
        bodyModel[175] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 391
        bodyModel[176] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 392
        bodyModel[177] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 393
        bodyModel[178] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 394
        bodyModel[179] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 399
        bodyModel[180] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 400
        bodyModel[181] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 401
        bodyModel[182] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 405
        bodyModel[183] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 406
        bodyModel[184] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 407
        bodyModel[185] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 408
        bodyModel[186] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 409
        bodyModel[187] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 410
        bodyModel[188] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 414
        bodyModel[189] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 419
        bodyModel[190] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 420
        bodyModel[191] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 421
        bodyModel[192] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 422
        bodyModel[193] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 426
        bodyModel[194] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 427
        bodyModel[195] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 431
        bodyModel[196] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 432
        bodyModel[197] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 433
        bodyModel[198] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 434
        bodyModel[199] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 435
        bodyModel[200] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 436
        bodyModel[201] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 24
        bodyModel[202] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 457
        bodyModel[203] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 458
        bodyModel[204] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 461
        bodyModel[205] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 268
        bodyModel[206] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 269
        bodyModel[207] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 64
        bodyModel[208] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 65
        bodyModel[209] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 237
        bodyModel[210] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 238
        bodyModel[211] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 275
        bodyModel[212] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 276
        bodyModel[213] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 277
        bodyModel[214] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 278
        bodyModel[215] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 279
        bodyModel[216] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 280
        bodyModel[217] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 281
        bodyModel[218] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 282
        bodyModel[219] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 283
        bodyModel[220] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 284
        bodyModel[221] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 285
        bodyModel[222] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 286
        bodyModel[223] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 287
        bodyModel[224] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 288
        bodyModel[225] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 289
        bodyModel[226] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 290
        bodyModel[227] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 291
        bodyModel[228] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 292
        bodyModel[229] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 293
        bodyModel[230] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 294
        bodyModel[231] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 295
        bodyModel[232] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 296
        bodyModel[233] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 297
        bodyModel[234] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 298
        bodyModel[235] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 299
        bodyModel[236] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 300
        bodyModel[237] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 301
        bodyModel[238] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 302
        bodyModel[239] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 303
        bodyModel[240] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 304
        bodyModel[241] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 305
        bodyModel[242] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 306
        bodyModel[243] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 307
        bodyModel[244] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 308
        bodyModel[245] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 309
        bodyModel[246] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 310
        bodyModel[247] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 311
        bodyModel[248] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 312
        bodyModel[249] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 313
        bodyModel[250] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 314
        bodyModel[251] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 315
        bodyModel[252] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 316
        bodyModel[253] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 317
        bodyModel[254] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 318
        bodyModel[255] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 319
        bodyModel[256] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 320
        bodyModel[257] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 322
        bodyModel[258] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 323
        bodyModel[259] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 324
        bodyModel[260] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 325
        bodyModel[261] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 326
        bodyModel[262] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 327
        bodyModel[263] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 328
        bodyModel[264] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 329
        bodyModel[265] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 330
        bodyModel[266] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 331
        bodyModel[267] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 332
        bodyModel[268] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 333
        bodyModel[269] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 334
        bodyModel[270] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 335
        bodyModel[271] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 336
        bodyModel[272] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 337
        bodyModel[273] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 338
        bodyModel[274] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 339
        bodyModel[275] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 340
        bodyModel[276] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 341
        bodyModel[277] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 342
        bodyModel[278] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 343
        bodyModel[279] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 344
        bodyModel[280] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 345
        bodyModel[281] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 346
        bodyModel[282] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 347
        bodyModel[283] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 348
        bodyModel[284] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 349
        bodyModel[285] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 350
        bodyModel[286] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 351
        bodyModel[287] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 352
        bodyModel[288] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 353
        bodyModel[289] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 354
        bodyModel[290] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 355
        bodyModel[291] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 356
        bodyModel[292] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 357
        bodyModel[293] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 358
        bodyModel[294] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 359
        bodyModel[295] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 360
        bodyModel[296] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 361
        bodyModel[297] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 362
        bodyModel[298] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 363
        bodyModel[299] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 364
        bodyModel[300] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 365
        bodyModel[301] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 366
        bodyModel[302] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 367
        bodyModel[303] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 368
        bodyModel[304] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 369
        bodyModel[305] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 370
        bodyModel[306] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 371
        bodyModel[307] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 372
        bodyModel[308] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 373
        bodyModel[309] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 374
        bodyModel[310] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 375
        bodyModel[311] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 376
        bodyModel[312] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 377
        bodyModel[313] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 378
        bodyModel[314] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 379
        bodyModel[315] = new ModelRendererTurbo(this, 375, 96, textureX, textureY); // Box 380
        bodyModel[316] = new ModelRendererTurbo(this, 371, 107, textureX, textureY); // Box 381
        bodyModel[317] = new ModelRendererTurbo(this, 41, 23, textureX, textureY); // Box 322
        bodyModel[318] = new ModelRendererTurbo(this, 267, 122, textureX, textureY); // Box 239
        bodyModel[319] = new ModelRendererTurbo(this, 267, 130, textureX, textureY); // Box 325
        bodyModel[320] = new ModelRendererTurbo(this, 476, 100, textureX, textureY); // Box 325
        bodyModel[321] = new ModelRendererTurbo(this, 495, 101, textureX, textureY); // Box 326
        bodyModel[322] = new ModelRendererTurbo(this, 223, 92, textureX, textureY); // Box 328
        bodyModel[323] = new ModelRendererTurbo(this, 476, 114, textureX, textureY); // Box 329
        bodyModel[324] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 331
        bodyModel[325] = new ModelRendererTurbo(this, 495, 115, textureX, textureY); // Box 333
        bodyModel[326] = new ModelRendererTurbo(this, 495, 101, textureX, textureY); // Box 334
        bodyModel[327] = new ModelRendererTurbo(this, 495, 115, textureX, textureY); // Box 335
        bodyModel[328] = new ModelRendererTurbo(this, 223, 92, textureX, textureY); // Box 336
        bodyModel[329] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 337
        bodyModel[330] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 338
        bodyModel[331] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 339
        bodyModel[332] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 340

        bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F); // Box 9
        bodyModel[0].setRotationPoint(-30F, 4F, -8F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 52, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        bodyModel[1].setRotationPoint(-26F, -19F, -8F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, -2.3F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -3.3F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 63
        bodyModel[2].setRotationPoint(-36F, -18F, -9F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 65
        bodyModel[3].setRotationPoint(-38F, -18F, -7F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 66
        bodyModel[4].setRotationPoint(-39F, -18F, -6F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.35F, -0.7F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -0.35F, -0.7F, -2F, -0.3F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -2F); // Box 67
        bodyModel[5].setRotationPoint(-40F, -17F, -5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 72
        bodyModel[6].setRotationPoint(-29F, -21F, 5.25F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 75
        bodyModel[7].setRotationPoint(-27F, -21F, -7.5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 76
        bodyModel[8].setRotationPoint(-27F, -21F, 6.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
        bodyModel[9].setRotationPoint(-29F, -21F, -7.25F);

        bodyModel[10].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 76
        bodyModel[10].setRotationPoint(-5F, -14F, 9.5F);

        bodyModel[11].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 79
        bodyModel[11].setRotationPoint(5F, -14F, 9.5F);

        bodyModel[12].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 80
        bodyModel[12].setRotationPoint(2.5F, -14F, 9.5F);

        bodyModel[13].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 81
        bodyModel[13].setRotationPoint(-2.5F, -14F, 9.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Sta_Light_1
        bodyModel[14].setRotationPoint(-40.3F, -0.5F, -0.88F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F); // Sta_Light_2
        bodyModel[15].setRotationPoint(-40.3F, -0.5F, -0.129999999999999F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Sta_Light_4
        bodyModel[16].setRotationPoint(-40.3F, 0.25F, -0.129999999999999F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F); // Sta_Light_3
        bodyModel[17].setRotationPoint(-40.3F, 0.25F, -0.88F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 52, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        bodyModel[18].setRotationPoint(-26F, -18F, 8F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 52, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 142
        bodyModel[19].setRotationPoint(-26F, -18F, -10F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -2.5F, 0F, 0F, -1.3F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -2.3F); // Box 145
        bodyModel[20].setRotationPoint(-36F, -19F, -8F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 154
        bodyModel[21].setRotationPoint(-31F, -18F, -9F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
        bodyModel[22].setRotationPoint(-31F, -19F, -8F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 184
        bodyModel[23].setRotationPoint(-38F, -15F, 6F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 185
        bodyModel[24].setRotationPoint(-39F, -15F, 4.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, -0.5F, 0F, -3F, -0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, -0.5F, 0F, -3F); // Box 186
        bodyModel[25].setRotationPoint(-41F, 4F, -6F);

        bodyModel[26].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, 0.25F, 0.5F, 1F, -0.75F, 0.5F, 1F, 0.25F, 0F, 1F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, -0.75F); // Box 82
        bodyModel[26].setRotationPoint(-36F, -14F, 7.5F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 58
        bodyModel[27].setRotationPoint(-36F, -16F, 5.5F);

        bodyModel[28].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, 0F, 0.5F, 1F, -1F, 0.5F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 86
        bodyModel[28].setRotationPoint(-33.5F, -14F, 8.25F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 179
        bodyModel[29].setRotationPoint(-31F, -16F, 6.5F);

        bodyModel[30].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.5F, 0.5F, 1F, -0.75F, 0.5F, 1F, 0.25F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, 0F); // Box 180
        bodyModel[30].setRotationPoint(-31F, -14F, 8.75F);

        bodyModel[31].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.5F, 0.5F, 1F, -0.75F, 0.5F, 1F, 0.25F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, 0F); // Box 181
        bodyModel[31].setRotationPoint(-28.5F, -14F, 9F);

        bodyModel[32].addShapeBox(0F, 1F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 182
        bodyModel[32].setRotationPoint(-31F, 5F, 6.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 183
        bodyModel[33].setRotationPoint(-36F, 6F, 5.5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[34].setRotationPoint(-39F, -16F, -5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
        bodyModel[35].setRotationPoint(-26F, -16F, 9F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
        bodyModel[36].setRotationPoint(-26F, -16F, -10F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 21, 20, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        bodyModel[37].setRotationPoint(-26F, -14F, 9F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
        bodyModel[38].setRotationPoint(-5F, -18F, 6F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 46, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 306
        bodyModel[39].setRotationPoint(-23F, -18F, -1F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 21, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
        bodyModel[40].setRotationPoint(-26F, 4F, -9F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        bodyModel[41].setRotationPoint(-5F, 4F, -6F);

        bodyModel[42].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 5
        bodyModel[42].setRotationPoint(-5F, 6F, 7F);

        bodyModel[43].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 6
        bodyModel[43].setRotationPoint(-5F, 4F, 7F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F); // Box 294
        bodyModel[44].setRotationPoint(-39.69F, -19F, -1.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,0F, 0F, -6F, 0F, -0.3F, -6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 170
        bodyModel[45].setRotationPoint(-39.7F, -19F, -7.5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 92
        bodyModel[46].setRotationPoint(-38F, -15F, -7F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 93
        bodyModel[47].setRotationPoint(-39F, -15F, -6.5F);

        bodyModel[48].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, 0F, 0.5F, 1F, 0.25F, 0.5F, 1F, -0.75F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.5F); // Box 94
        bodyModel[48].setRotationPoint(-28.5F, -14F, -9F);

        bodyModel[49].addShapeBox(0F, 0F, -0.5F, 3, 20, 1, 0F,0F, 1F, -0.2F, 0.5F, 1F, 0.25F, 0.5F, 1F, -0.75F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.2F); // Box 95
        bodyModel[49].setRotationPoint(-32F, -14F, -8.75F);

        bodyModel[50].addShapeBox(0F, 1F, 0F, 6, 1, 3, 0F,0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 96
        bodyModel[50].setRotationPoint(-32F, 5F, -9.5F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 97
        bodyModel[51].setRotationPoint(-31F, -16F, -9.5F);

        bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 98
        bodyModel[52].setRotationPoint(-33F, 5F, -8F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F,0F, 1F, -1.5F, 0F, 1F, 0.1F, 0F, 1F, -0.1F, 0F, 1F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.5F); // Box 99
        bodyModel[53].setRotationPoint(-36F, -15F, -9F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.7F); // Box 100
        bodyModel[54].setRotationPoint(-38F, 6F, 6F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 103
        bodyModel[55].setRotationPoint(-38F, 6F, -7F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.5F, 0F, -0.2F, -1.7F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.5F); // Box 104
        bodyModel[56].setRotationPoint(-36F, 6F, -9F);

        bodyModel[57].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 105
        bodyModel[57].setRotationPoint(-5F, 4F, -8F);

        bodyModel[58].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 106
        bodyModel[58].setRotationPoint(-5F, 6F, -10F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 107
        bodyModel[59].setRotationPoint(-26F, 6F, 9F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 9, 11, 0F,-0.9F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.9F, 0.5F, -1.5F, -0.9F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1.5F); // Box 109
        bodyModel[60].setRotationPoint(-41F, -4F, -5.5F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.2F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -1.2F, -0.5F, -1F, -1.2F, -0.15F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1.2F, -0.15F, -1F); // Box 110
        bodyModel[61].setRotationPoint(-41F, -14F, -6F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F,-1.2F, 0.15F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0.15F, -1.5F, -0.9F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.9F, 0.5F, -1.5F); // Box 111
        bodyModel[62].setRotationPoint(-41F, -13F, -5.5F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 112
        bodyModel[63].setRotationPoint(-36F, 4F, -7F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, -1F); // Box 113
        bodyModel[64].setRotationPoint(-29F, 5F, -6.5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 21, 20, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[65].setRotationPoint(5F, -14F, 9F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 115
        bodyModel[66].setRotationPoint(5F, 6F, 9F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 116
        bodyModel[67].setRotationPoint(-5F, -18F, -9F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 21, 20, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        bodyModel[68].setRotationPoint(-26F, -14F, -10F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        bodyModel[69].setRotationPoint(-26F, 6F, -10F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 21, 1, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        bodyModel[70].setRotationPoint(5F, 4F, -8F);

        bodyModel[71].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 120
        bodyModel[71].setRotationPoint(5F, -14F, -9.5F);

        bodyModel[72].addShapeBox(-2F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 121
        bodyModel[72].setRotationPoint(2.5F, -14F, -9.5F);

        bodyModel[73].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 122
        bodyModel[73].setRotationPoint(-5F, -14F, -9.5F);

        bodyModel[74].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 123
        bodyModel[74].setRotationPoint(-2.5F, -14F, -9.5F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 126
        bodyModel[75].setRotationPoint(36F, -15F, -7F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 127
        bodyModel[76].setRotationPoint(31F, -16F, -8.5F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, -1.25F, 0F, 0F, -3.3F, 0F, 0F, -2.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 128
        bodyModel[77].setRotationPoint(31F, -18F, -10F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, 0F, -1F, 0F, -0.5F, -2.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2.3F, 0F, 0F, -1.3F, 0F, 0F, 1F); // Box 129
        bodyModel[78].setRotationPoint(31F, -19F, -9F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 130
        bodyModel[79].setRotationPoint(36F, -18F, -8F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 131
        bodyModel[80].setRotationPoint(38F, -15F, -6.5F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 9, 11, 0F,0F, 0.5F, 0.5F, -0.9F, 0.5F, -1F, -0.9F, 0.5F, -2F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, -0.9F, 0F, -1F, -0.9F, 0F, -2F, 0F, 0F, -0.5F); // Box 132
        bodyModel[81].setRotationPoint(39F, -4F, -5F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F,0F, 0F, 0.5F, -1.2F, 0.15F, -1F, -1.2F, 0.15F, -2F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, -0.9F, 0.5F, -1F, -0.9F, 0.5F, -2F, 0F, 0.5F, -0.5F); // Box 133
        bodyModel[82].setRotationPoint(39F, -13F, -5F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0.5F, -1F, -0.35F, -0.7F, -2F, -0.35F, -0.7F, -1F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -2F, -0.3F, 0F, -1F, 0F, 0F, 0.5F); // Box 135
        bodyModel[83].setRotationPoint(39F, -17F, -6F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 20, 2, 0F,0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 136
        bodyModel[84].setRotationPoint(38F, -15F, 4.5F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 137
        bodyModel[85].setRotationPoint(38F, -18F, -7F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 138
        bodyModel[86].setRotationPoint(36F, -15F, 6F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 139
        bodyModel[87].setRotationPoint(36F, 6F, -7F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -3F, 0F, 0F, -2F); // Box 141
        bodyModel[88].setRotationPoint(39.9F, 4F, -6F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 144
        bodyModel[89].setRotationPoint(31F, 6F, -8.5F);

        bodyModel[90].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, 0.25F, 0.5F, 1F, -0.75F, 0.5F, 1F, 0.25F, 0F, 1F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, -0.75F); // Box 145
        bodyModel[90].setRotationPoint(31F, -14F, -8.5F);

        bodyModel[91].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0F, 1F, 0F, 0.5F, 1F, -1F, 0.5F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 146
        bodyModel[91].setRotationPoint(33.5F, -14F, -7.75F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F); // Box 147
        bodyModel[92].setRotationPoint(26F, -18F, -10F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 148
        bodyModel[93].setRotationPoint(26F, -16F, 6.5F);

        bodyModel[94].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, -0.75F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0.5F, 1F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.25F); // Box 149
        bodyModel[94].setRotationPoint(26.5F, -14F, 9F);

        bodyModel[95].addShapeBox(0F, 0F, -0.5F, 3, 20, 1, 0F,0.5F, 1F, -0.75F, 0F, 1F, -0.1F, 0F, 1F, -0.4F, 0.5F, 1F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, 0.5F, 0F, 0.25F); // Box 150
        bodyModel[95].setRotationPoint(29F, -14F, 8.75F);

        bodyModel[96].addShapeBox(0F, 1F, 0F, 6, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.5F); // Box 151
        bodyModel[96].setRotationPoint(26F, 5F, 6.5F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 152
        bodyModel[97].setRotationPoint(26F, -19F, -9F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 153
        bodyModel[98].setRotationPoint(26F, -16F, -9.5F);

        bodyModel[99].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, 0.25F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.5F, 1F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.75F); // Box 154
        bodyModel[99].setRotationPoint(29F, -14F, -8.75F);

        bodyModel[100].addShapeBox(0F, 0F, -0.5F, 2, 20, 1, 0F,0.5F, 1F, 0.25F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.5F, 1F, -0.75F, 0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.75F); // Box 155
        bodyModel[100].setRotationPoint(26.5F, -14F, -9F);

        bodyModel[101].addShapeBox(0F, 1F, 0F, 5, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 156
        bodyModel[101].setRotationPoint(26F, 5F, -9.5F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 1.5F, 0F, -0.2F, -1.7F, 0F, -0.2F, -0.1F); // Box 157
        bodyModel[102].setRotationPoint(32F, 6F, 8F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 21, 1, 0F,0F, 1F, -1.1F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, 1.1F, 0F, 0F, -1.1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.1F); // Box 158
        bodyModel[103].setRotationPoint(32F, -15F, 7F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
        bodyModel[104].setRotationPoint(5F, 6F, -10F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 21, 20, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        bodyModel[105].setRotationPoint(5F, -14F, -10F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F); // Box 165
        bodyModel[106].setRotationPoint(26F, 4F, -7.5F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 166
        bodyModel[107].setRotationPoint(31F, 4F, -5.5F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,0F, -0.3F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 167
        bodyModel[108].setRotationPoint(38.72F, -19F, -7.5F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F); // Box 168
        bodyModel[109].setRotationPoint(38.71F, -19F, -1.5F);

        bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 169
        bodyModel[110].setRotationPoint(32F, 5F, -6F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F,0F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F); // Box 170
        bodyModel[111].setRotationPoint(26F, 5F, -6.5F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F); // Box 171
        bodyModel[112].setRotationPoint(-39F, 4F, -5.5F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F); // Box 173
        bodyModel[113].setRotationPoint(-36F, 5F, 5F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
        bodyModel[114].setRotationPoint(32F, 5F, -6F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F); // Box 175
        bodyModel[115].setRotationPoint(36F, 4F, -4.5F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.2F); // Box 176
        bodyModel[116].setRotationPoint(-37F, 4.9F, 5F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
        bodyModel[117].setRotationPoint(36F, 4.9F, -6F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        bodyModel[118].setRotationPoint(25F, 5F, -8F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 179
        bodyModel[119].setRotationPoint(5F, 5F, -8.5F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 180
        bodyModel[120].setRotationPoint(-6F, 5F, -8.5F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
        bodyModel[121].setRotationPoint(-26F, 5F, -8F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 7, 7, 5, 0F,0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
        bodyModel[122].setRotationPoint(-39F, -3F, -8.5F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 7, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 183
        bodyModel[123].setRotationPoint(32F, -3F, 3.5F);

        bodyModel[124].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 184
        bodyModel[124].setRotationPoint(-39F, -3.5F, -3.5F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 185
        bodyModel[125].setRotationPoint(-37F, -3.5F, 3F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        bodyModel[126].setRotationPoint(-39F, -3F, 2.5F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
        bodyModel[127].setRotationPoint(37F, -3F, -4.5F);

        bodyModel[128].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 188
        bodyModel[128].setRotationPoint(37F, -3.5F, -2.5F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        bodyModel[129].setRotationPoint(35F, -3.5F, -5.5F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F); // Box 190
        bodyModel[130].setRotationPoint(36F, 6F, 6F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 226
        bodyModel[131].setRotationPoint(-7F, -5F, -8.5F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
        bodyModel[132].setRotationPoint(-10F, 0F, -8.5F);

        bodyModel[133].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 228
        bodyModel[133].setRotationPoint(-7.75F, 0.5F, -6F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
        bodyModel[134].setRotationPoint(-6.25F, -17F, -5.5F);

        bodyModel[135].addBox(0F, 0F, 0F, 0, 22, 4, 0F); // Box 196
        bodyModel[135].setRotationPoint(5.1F, -17F, -8.5F);

        bodyModel[136].addBox(0F, 0F, 0F, 0, 22, 4, 0F); // Box 197
        bodyModel[136].setRotationPoint(-5.1F, -17F, 4.5F);

        bodyModel[137].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 198
        bodyModel[137].setRotationPoint(6.25F, 0.5F, 5F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
        bodyModel[138].setRotationPoint(6F, 0F, 4.5F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 200
        bodyModel[139].setRotationPoint(5.5F, -5F, 4.5F);

        bodyModel[140].addBox(0F, 0F, 0F, 0, 22, 4, 0F); // Box 202
        bodyModel[140].setRotationPoint(25.9F, -17F, 4.5F);

        bodyModel[141].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 203
        bodyModel[141].setRotationPoint(33.25F, 0.5F, 0F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 204
        bodyModel[142].setRotationPoint(32F, 0F, -1.5F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 205
        bodyModel[143].setRotationPoint(31.5F, -4F, -1.5F);

        bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 206
        bodyModel[144].setRotationPoint(31.5F, -6F, -1.5F);

        bodyModel[145].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 207
        bodyModel[145].setRotationPoint(-34.75F, 0.5F, -1F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 208
        bodyModel[146].setRotationPoint(-36F, 0F, -2.5F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 209
        bodyModel[147].setRotationPoint(-33F, -4F, -2.5F);

        bodyModel[148].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 211
        bodyModel[148].setRotationPoint(6.4F, -14.5F, 6F);

        bodyModel[149].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 212
        bodyModel[149].setRotationPoint(6.5F, -14.5F, -8.5F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 8
        bodyModel[150].setRotationPoint(-20.5F, -33.75F, -4.75F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 9
        bodyModel[151].setRotationPoint(-18.5F, -33.75F, -4.75F);

        bodyModel[152].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 10
        bodyModel[152].setRotationPoint(-20.5F, -32.75F, -5F);

        bodyModel[153].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 11
        bodyModel[153].setRotationPoint(-20.5F, -32.75F, 4F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 12
        bodyModel[154].setRotationPoint(-18.5F, -33.75F, -6.75F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 13
        bodyModel[155].setRotationPoint(-20.5F, -33.75F, 5.25F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 15
        bodyModel[156].setRotationPoint(-20.5F, -33.75F, -6.75F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        bodyModel[157].setRotationPoint(-21.5F, -20F, -4.25F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
        bodyModel[158].setRotationPoint(-21.5F, -20F, 3.25F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F); // Box 24
        bodyModel[159].setRotationPoint(-18.5F, -33.75F, 5.25F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F); // Box 124
        bodyModel[160].setRotationPoint(-28.5F, -21F, -5F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,1F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 4F, 0F); // Box 125
        bodyModel[161].setRotationPoint(-28.5F, -30.25F, -5F);

        bodyModel[162].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,1F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 4F, 0F); // Box 127
        bodyModel[162].setRotationPoint(-28.5F, -30.25F, 5F);

        bodyModel[163].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[163].setRotationPoint(-16.5F, -21F, 5F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 2F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, -2F, 0F); // Box 129
        bodyModel[164].setRotationPoint(-17.5F, -30.25F, 5F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[165].setRotationPoint(-16.5F, -21F, -5F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, 2F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, -2F, 0F); // Box 131
        bodyModel[166].setRotationPoint(-17.5F, -30.25F, -5F);

        bodyModel[167].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F); // Box 126
        bodyModel[167].setRotationPoint(-28.5F, -21F, 5F);

        bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 449
        bodyModel[168].setRotationPoint(-21.5F, -21F, -5F);

        bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 450
        bodyModel[169].setRotationPoint(-17.5F, -21F, -5F);

        bodyModel[170].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 385
        bodyModel[170].setRotationPoint(-13.5F, 6F, -2.5F);

        bodyModel[171].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 386
        bodyModel[171].setRotationPoint(-21.5F, 6F, -1.5F);

        bodyModel[172].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 388
        bodyModel[172].setRotationPoint(-24.5F, 6F, -2.5F);

        bodyModel[173].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 389
        bodyModel[173].setRotationPoint(-14.65F, 5F, -4.5F);

        bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 390
        bodyModel[174].setRotationPoint(-13.15F, 6.5F, -5.5F);

        bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 391
        bodyModel[175].setRotationPoint(-12.65F, 7F, -4.5F);

        bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 392
        bodyModel[176].setRotationPoint(-11.45F, 6.15F, -6F);

        bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 393
        bodyModel[177].setRotationPoint(-14.15F, 8.75F, -6F);

        bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 394
        bodyModel[178].setRotationPoint(-14.85F, 6.15F, -6F);

        bodyModel[179].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 399
        bodyModel[179].setRotationPoint(-20F, 6.5F, -4.5F);

        bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 400
        bodyModel[180].setRotationPoint(-19.5F, 6F, -3.5F);

        bodyModel[181].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 401
        bodyModel[181].setRotationPoint(-21.7F, 8.25F, -6F);

        bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 405
        bodyModel[182].setRotationPoint(-22.3F, 6.15F, -6F);

        bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 406
        bodyModel[183].setRotationPoint(-25F, 8.75F, -6F);

        bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 407
        bodyModel[184].setRotationPoint(-24F, 6.5F, -5.5F);

        bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 408
        bodyModel[185].setRotationPoint(-23.5F, 7F, -4.5F);

        bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 409
        bodyModel[186].setRotationPoint(-25.7F, 6.15F, -6F);

        bodyModel[187].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 410
        bodyModel[187].setRotationPoint(-21.7F, 8.25F, 6F);

        bodyModel[188].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 414
        bodyModel[188].setRotationPoint(-20F, 6.5F, 4.5F);

        bodyModel[189].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 419
        bodyModel[189].setRotationPoint(-14.65F, 5F, 5.5F);

        bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 420
        bodyModel[190].setRotationPoint(-14.15F, 8.75F, 5.5F);

        bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 421
        bodyModel[191].setRotationPoint(-13.15F, 6.5F, 5F);

        bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 422
        bodyModel[192].setRotationPoint(-11.45F, 6.15F, 5.5F);

        bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 426
        bodyModel[193].setRotationPoint(-16.5F, 6F, -3.5F);

        bodyModel[194].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 427
        bodyModel[194].setRotationPoint(-25.5F, 5F, -4.5F);

        bodyModel[195].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 431
        bodyModel[195].setRotationPoint(-25.5F, 5F, 5.5F);

        bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 432
        bodyModel[196].setRotationPoint(-24F, 6.5F, 5F);

        bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 433
        bodyModel[197].setRotationPoint(-25F, 8.75F, 5.5F);

        bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 434
        bodyModel[198].setRotationPoint(-22.3F, 6.15F, 5.5F);

        bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 435
        bodyModel[199].setRotationPoint(-25.7F, 6.15F, 5.5F);

        bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 436
        bodyModel[200].setRotationPoint(-14.85F, 6.15F, 5.5F);

        bodyModel[201].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 24
        bodyModel[201].setRotationPoint(-8.5F, 8.5F, -6.5F);

        bodyModel[202].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 457
        bodyModel[202].setRotationPoint(-26.5F, 8.5F, -7.5F);

        bodyModel[203].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 458
        bodyModel[203].setRotationPoint(-27.5F, 8.5F, -6.5F);

        bodyModel[204].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
        bodyModel[204].setRotationPoint(-26.5F, 8.5F, 7.5F);

        bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
        bodyModel[205].setRotationPoint(18F, -21F, -7.25F);

        bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -0.375F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 269
        bodyModel[206].setRotationPoint(18F, -21F, 5.25F);

        bodyModel[207].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 64
        bodyModel[207].setRotationPoint(-40.5F, 6.5F, -0.5F);

        bodyModel[208].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 65
        bodyModel[208].setRotationPoint(32.5F, 6.5F, -0.5F);

        bodyModel[209].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 237
        bodyModel[209].setRotationPoint(-41.5F, 6F, -1F);

        bodyModel[210].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 238
        bodyModel[210].setRotationPoint(40.5F, 6F, -1F);

        bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
        bodyModel[211].setRotationPoint(-40F, 2.5F, 4F);

        bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
        bodyModel[212].setRotationPoint(-40F, 2.5F, -5.25F);

        bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        bodyModel[213].setRotationPoint(39F, 2.5F, -5.25F);

        bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        bodyModel[214].setRotationPoint(39F, 2.5F, 4F);

        bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 279
        bodyModel[215].setRotationPoint(-40F, 4F, -5.5F);

        bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F); // Box 280
        bodyModel[216].setRotationPoint(-40F, 4F, 4.5F);

        bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F); // Box 281
        bodyModel[217].setRotationPoint(38.9F, 4F, 4.5F);

        bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 282
        bodyModel[218].setRotationPoint(38.9F, 4F, -5.5F);

        bodyModel[219].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 283
        bodyModel[219].setRotationPoint(8.5F, 8.5F, -7.5F);

        bodyModel[220].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 284
        bodyModel[220].setRotationPoint(7.5F, 8.5F, -6.5F);

        bodyModel[221].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 285
        bodyModel[221].setRotationPoint(9.5F, 5F, -4.5F);

        bodyModel[222].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 286
        bodyModel[222].setRotationPoint(10.5F, 6F, -2.5F);

        bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 287
        bodyModel[223].setRotationPoint(9.3F, 6.15F, -6F);

        bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 288
        bodyModel[224].setRotationPoint(10F, 8.75F, -6F);

        bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 289
        bodyModel[225].setRotationPoint(11F, 6.5F, -5.5F);

        bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 290
        bodyModel[226].setRotationPoint(12.7F, 6.15F, -6F);

        bodyModel[227].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 291
        bodyModel[227].setRotationPoint(13.3F, 8.25F, -6F);

        bodyModel[228].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 292
        bodyModel[228].setRotationPoint(15F, 6.5F, -4.5F);

        bodyModel[229].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 293
        bodyModel[229].setRotationPoint(13.5F, 6F, -1.5F);

        bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 294
        bodyModel[230].setRotationPoint(11.5F, 7F, -4.5F);

        bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 295
        bodyModel[231].setRotationPoint(15.5F, 6F, -3.5F);

        bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 296
        bodyModel[232].setRotationPoint(18.5F, 6F, -3.5F);

        bodyModel[233].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 297
        bodyModel[233].setRotationPoint(20.35F, 5F, -4.5F);

        bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 298
        bodyModel[234].setRotationPoint(20.15F, 6.15F, -6F);

        bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 299
        bodyModel[235].setRotationPoint(21.85F, 6.5F, -5.5F);

        bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 300
        bodyModel[236].setRotationPoint(22.35F, 7F, -4.5F);

        bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
        bodyModel[237].setRotationPoint(20.85F, 8.75F, -6F);

        bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 302
        bodyModel[238].setRotationPoint(23.55F, 6.15F, -6F);

        bodyModel[239].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 303
        bodyModel[239].setRotationPoint(26.5F, 8.5F, -6.5F);

        bodyModel[240].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 304
        bodyModel[240].setRotationPoint(21.5F, 6F, -2.5F);

        bodyModel[241].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 305
        bodyModel[241].setRotationPoint(20.35F, 5F, 5.5F);

        bodyModel[242].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 306
        bodyModel[242].setRotationPoint(15F, 6.5F, 4.5F);

        bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 307
        bodyModel[243].setRotationPoint(10F, 8.75F, 5.5F);

        bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 308
        bodyModel[244].setRotationPoint(12.7F, 6.15F, 5.5F);

        bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 309
        bodyModel[245].setRotationPoint(11F, 6.5F, 5F);

        bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 310
        bodyModel[246].setRotationPoint(9.3F, 6.15F, 5.5F);

        bodyModel[247].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 311
        bodyModel[247].setRotationPoint(13.3F, 8.25F, 6F);

        bodyModel[248].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
        bodyModel[248].setRotationPoint(8.5F, 8.5F, 7.5F);

        bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 313
        bodyModel[249].setRotationPoint(20.85F, 8.75F, 5.5F);

        bodyModel[250].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 314
        bodyModel[250].setRotationPoint(9.5F, 5F, 5.5F);

        bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 315
        bodyModel[251].setRotationPoint(23.55F, 6.15F, 5.5F);

        bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 316
        bodyModel[252].setRotationPoint(20.15F, 6.15F, 5.5F);

        bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 317
        bodyModel[253].setRotationPoint(21.85F, 6.5F, 5F);

        bodyModel[254].addBox(0F, 0F, 0F, 0, 22, 4, 0F); // Box 318
        bodyModel[254].setRotationPoint(-25.9F, -17F, -8.5F);

        bodyModel[255].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 319
        bodyModel[255].setRotationPoint(-24.5F, -14.5F, -8.5F);

        bodyModel[256].addBox(0F, 0F, 0F, 19, 0, 3, 0F); // Box 320
        bodyModel[256].setRotationPoint(-25.6F, -14.5F, 6F);

        bodyModel[257].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 322
        bodyModel[257].setRotationPoint(-13.75F, 0.5F, -6F);

        bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 323
        bodyModel[258].setRotationPoint(-13F, -5F, -8.5F);

        bodyModel[259].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 324
        bodyModel[259].setRotationPoint(-16F, 0F, -8.5F);

        bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
        bodyModel[260].setRotationPoint(-12.25F, -17F, -5.5F);

        bodyModel[261].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 326
        bodyModel[261].setRotationPoint(-18.75F, 0.5F, -6F);

        bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
        bodyModel[262].setRotationPoint(-18F, -5F, -8.5F);

        bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 328
        bodyModel[263].setRotationPoint(-21F, 0F, -8.5F);

        bodyModel[264].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
        bodyModel[264].setRotationPoint(-17.25F, -17F, -5.5F);

        bodyModel[265].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 330
        bodyModel[265].setRotationPoint(-22.75F, 0.5F, -6F);

        bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 331
        bodyModel[266].setRotationPoint(-22F, -5F, -8.5F);

        bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 332
        bodyModel[267].setRotationPoint(-25F, 0F, -8.5F);

        bodyModel[268].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
        bodyModel[268].setRotationPoint(-21.25F, -17F, -5.5F);

        bodyModel[269].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 334
        bodyModel[269].setRotationPoint(-22.75F, 0.5F, 7F);

        bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 335
        bodyModel[270].setRotationPoint(-22F, -5F, 4.5F);

        bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 336
        bodyModel[271].setRotationPoint(-25F, 0F, 4.5F);

        bodyModel[272].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
        bodyModel[272].setRotationPoint(-21.25F, -17F, 4.5F);

        bodyModel[273].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 338
        bodyModel[273].setRotationPoint(-18.75F, 0.5F, 7F);

        bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 339
        bodyModel[274].setRotationPoint(-21F, 0F, 4.5F);

        bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 340
        bodyModel[275].setRotationPoint(-18F, -5F, 4.5F);

        bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341
        bodyModel[276].setRotationPoint(-16F, 0F, 4.5F);

        bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
        bodyModel[277].setRotationPoint(-13F, -5F, 4.5F);

        bodyModel[278].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 343
        bodyModel[278].setRotationPoint(-13.75F, 0.5F, 7F);

        bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 344
        bodyModel[279].setRotationPoint(-10F, 0F, 4.5F);

        bodyModel[280].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 345
        bodyModel[280].setRotationPoint(-7.75F, 0.5F, 7F);

        bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 346
        bodyModel[281].setRotationPoint(-7F, -5F, 4.5F);

        bodyModel[282].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
        bodyModel[282].setRotationPoint(-17.25F, -17F, 4.5F);

        bodyModel[283].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
        bodyModel[283].setRotationPoint(-12.25F, -17F, 4.5F);

        bodyModel[284].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
        bodyModel[284].setRotationPoint(-6.25F, -17F, 4.5F);

        bodyModel[285].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
        bodyModel[285].setRotationPoint(5.75F, -17F, 4.5F);

        bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 351
        bodyModel[286].setRotationPoint(10.5F, -5F, 4.5F);

        bodyModel[287].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
        bodyModel[287].setRotationPoint(10.75F, -17F, 4.5F);

        bodyModel[288].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 353
        bodyModel[288].setRotationPoint(11.25F, 0.5F, 5F);

        bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 354
        bodyModel[289].setRotationPoint(11F, 0F, 4.5F);

        bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 355
        bodyModel[290].setRotationPoint(15.5F, -5F, 4.5F);

        bodyModel[291].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
        bodyModel[291].setRotationPoint(15.75F, -17F, 4.5F);

        bodyModel[292].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 357
        bodyModel[292].setRotationPoint(16.25F, 0.5F, 5F);

        bodyModel[293].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 358
        bodyModel[293].setRotationPoint(16F, 0F, 4.5F);

        bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 359
        bodyModel[294].setRotationPoint(20.5F, -5F, 4.5F);

        bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
        bodyModel[295].setRotationPoint(20.75F, -17F, 4.5F);

        bodyModel[296].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 361
        bodyModel[296].setRotationPoint(21.25F, 0.5F, 5F);

        bodyModel[297].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 362
        bodyModel[297].setRotationPoint(21F, 0F, 4.5F);

        bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 363
        bodyModel[298].setRotationPoint(15.5F, -5F, -8.5F);

        bodyModel[299].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 364
        bodyModel[299].setRotationPoint(21.25F, 0.5F, -8F);

        bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 365
        bodyModel[300].setRotationPoint(20.5F, -5F, -8.5F);

        bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 366
        bodyModel[301].setRotationPoint(21F, 0F, -8.5F);

        bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 367
        bodyModel[302].setRotationPoint(16F, 0F, -8.5F);

        bodyModel[303].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 368
        bodyModel[303].setRotationPoint(16.25F, 0.5F, -8F);

        bodyModel[304].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 369
        bodyModel[304].setRotationPoint(11F, 0F, -8.5F);

        bodyModel[305].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 370
        bodyModel[305].setRotationPoint(11.25F, 0.5F, -8F);

        bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 371
        bodyModel[306].setRotationPoint(10.5F, -5F, -8.5F);

        bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 372
        bodyModel[307].setRotationPoint(5.5F, -5F, -8.5F);

        bodyModel[308].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 373
        bodyModel[308].setRotationPoint(6.25F, 0.5F, -8F);

        bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 374
        bodyModel[309].setRotationPoint(6F, 0F, -8.5F);

        bodyModel[310].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
        bodyModel[310].setRotationPoint(10.75F, -17F, -6F);

        bodyModel[311].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
        bodyModel[311].setRotationPoint(5.75F, -17F, -6F);

        bodyModel[312].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
        bodyModel[312].setRotationPoint(15.75F, -17F, -6F);

        bodyModel[313].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
        bodyModel[313].setRotationPoint(20.75F, -17F, -6F);

        bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 379
        bodyModel[314].setRotationPoint(-32.5F, -6F, -2.5F);

        bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F); // Box 380
        bodyModel[315].setRotationPoint(-32F, -16F, -9F);

        bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.5F); // Box 381
        bodyModel[316].setRotationPoint(31F, -16F, 6F);

        bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
        bodyModel[317].setRotationPoint(38F, -16F, -5F);

        bodyModel[318].addShapeBox(0F, 0F, 0F, 100, 6, 1, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -3F, 0F, -50F, -3F, 0F, -50F, -3F, -0.9F, 0F, -3F, -0.9F); // Box 239
        bodyModel[318].setRotationPoint(-25F, -20F, -9.5F);

        bodyModel[319].addShapeBox(0F, 0F, 0F, 100, 6, 1, 0F,0F, 0F, 0F, -50F, 0F, 0F, -50F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -3F, 0F, -50F, -3F, 0F, -50F, -3F, -0.9F, 0F, -3F, -0.9F); // Box 325
        bodyModel[319].setRotationPoint(-25F, -20F, 9.5F);

        bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1.3F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -1.3F, -0.5F, -1F, -1.3F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1.3F, 0F, -1F); // Box 325
        bodyModel[320].setRotationPoint(-41F, -16.5F, -6F);

        bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.3F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.3F, 0F, 0.5F, -1.2F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.2F, 0F, 0.5F); // Box 326
        bodyModel[321].setRotationPoint(-41F, -15.5F, -6.5F);

        bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 6, 22, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -13.5F, 0F, 0F, -13.7F, 0F, -4F, -0.2F, 0F, -4F, 0F, 0F, -4F, -13.5F, 0F, -4F, -13.7F); // Box 328
        bodyModel[322].setRotationPoint(-39.6F, -15.5F, -4.25F);

        bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -0.5F, -0.5F, -1.3F, -0.5F, -2F, -1.3F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, -1.3F, 0F, -2F, -1.3F, 0F, -1F, 0F, 0F, 0.5F); // Box 329
        bodyModel[323].setRotationPoint(39F, -16.5F, -6F);

        bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -0.5F, -0.5F, -1.2F, -0.5F, -2F, -1.2F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, -1.2F, -0.15F, -2F, -1.2F, -0.15F, -1F, 0F, 0F, 0.5F); // Box 331
        bodyModel[324].setRotationPoint(39F, -14F, -6F);

        bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1.3F, 0F, -2.5F, -1.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1.2F, 0F, -2.5F); // Box 333
        bodyModel[325].setRotationPoint(-41F, -15.5F, 4.5F);

        bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, -2.5F, -1F, 0F, -1F, -0.3F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -2.5F, -1F, 0F, -1F, -0.2F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 334
        bodyModel[326].setRotationPoint(38F, -15.5F, -6.5F);

        bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0.5F, -0.3F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -2.5F, -1F, 0F, 0.5F, -0.2F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -2.5F); // Box 335
        bodyModel[327].setRotationPoint(38F, -15.5F, 4.5F);

        bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 6, 22, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -13.5F, 0F, 0F, -13.7F, 0F, -4F, -0.2F, 0F, -4F, 0F, 0F, -4F, -13.5F, 0F, -4F, -13.7F); // Box 336
        bodyModel[328].setRotationPoint(38.4F, -15.5F, -4.25F);

        bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 337
        bodyModel[329].setRotationPoint(39.3F, -0.5F, -0.88F);

        bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F); // Box 338
        bodyModel[330].setRotationPoint(39.3F, -0.5F, -0.129999999999999F);

        bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 339
        bodyModel[331].setRotationPoint(39.3F, 0.25F, -0.129999999999999F);

        bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F); // Box 340
        bodyModel[332].setRotationPoint(39.3F, 0.25F, -0.88F);
        this.flipAll();
    }
}