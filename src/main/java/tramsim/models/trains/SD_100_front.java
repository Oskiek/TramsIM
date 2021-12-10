package tramsim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class SD_100_front extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 256;

    public SD_100_front() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[182];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 91
        bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
        bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 13
        bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 18
        bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 19
        bodyModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 20
        bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 21
        bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
        bodyModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 35
        bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 36
        bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 37
        bodyModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 37
        bodyModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 38
        bodyModel[13] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 48
        bodyModel[14] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 49
        bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 52
        bodyModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 53
        bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 255
        bodyModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 114
        bodyModel[19] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 264
        bodyModel[20] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 144
        bodyModel[21] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 145
        bodyModel[22] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 205
        bodyModel[23] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 217
        bodyModel[24] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 218
        bodyModel[25] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 219
        bodyModel[26] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 220
        bodyModel[27] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 221
        bodyModel[28] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 224
        bodyModel[29] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 225
        bodyModel[30] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 226
        bodyModel[31] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 227
        bodyModel[32] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 228
        bodyModel[33] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 229
        bodyModel[34] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 221
        bodyModel[35] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 235
        bodyModel[36] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 236
        bodyModel[37] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 238
        bodyModel[38] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 37
        bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 220
        bodyModel[40] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 88
        bodyModel[41] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 89
        bodyModel[42] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 90
        bodyModel[43] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 92
        bodyModel[44] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 155
        bodyModel[45] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 156
        bodyModel[46] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 158
        bodyModel[47] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 159
        bodyModel[48] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 390
        bodyModel[49] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 391
        bodyModel[50] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 180
        bodyModel[51] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 181
        bodyModel[52] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 143
        bodyModel[53] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 254
        bodyModel[54] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 255
        bodyModel[55] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 256
        bodyModel[56] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 257
        bodyModel[57] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 256
        bodyModel[58] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 257
        bodyModel[59] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 260
        bodyModel[60] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 103
        bodyModel[61] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 105
        bodyModel[62] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 107
        bodyModel[63] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 108
        bodyModel[64] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 109
        bodyModel[65] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 113
        bodyModel[66] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 114
        bodyModel[67] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 115
        bodyModel[68] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 116
        bodyModel[69] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 117
        bodyModel[70] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 118
        bodyModel[71] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 362
        bodyModel[72] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 230
        bodyModel[73] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 231
        bodyModel[74] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 232
        bodyModel[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 233
        bodyModel[76] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 337
        bodyModel[77] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 338
        bodyModel[78] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 388
        bodyModel[79] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 389
        bodyModel[80] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 242
        bodyModel[81] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 243
        bodyModel[82] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 244
        bodyModel[83] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 245
        bodyModel[84] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 309
        bodyModel[85] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 302
        bodyModel[86] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 68
        bodyModel[87] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 170
        bodyModel[88] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 171
        bodyModel[89] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 172
        bodyModel[90] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 173
        bodyModel[91] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 311
        bodyModel[92] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 312
        bodyModel[93] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 313
        bodyModel[94] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 316
        bodyModel[95] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 155
        bodyModel[96] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 318
        bodyModel[97] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 319
        bodyModel[98] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 320
        bodyModel[99] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 321
        bodyModel[100] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 322
        bodyModel[101] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 323
        bodyModel[102] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 324
        bodyModel[103] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 325
        bodyModel[104] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 326
        bodyModel[105] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 327
        bodyModel[106] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 328
        bodyModel[107] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 337
        bodyModel[108] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 338
        bodyModel[109] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 339
        bodyModel[110] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 340
        bodyModel[111] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 341
        bodyModel[112] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 342
        bodyModel[113] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 343
        bodyModel[114] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 344
        bodyModel[115] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 345
        bodyModel[116] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 346
        bodyModel[117] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 347
        bodyModel[118] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 348
        bodyModel[119] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 126
        bodyModel[120] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 127
        bodyModel[121] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 128
        bodyModel[122] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 122
        bodyModel[123] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 126
        bodyModel[124] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 182
        bodyModel[125] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 134
        bodyModel[126] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 135
        bodyModel[127] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 137
        bodyModel[128] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 138
        bodyModel[129] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 140
        bodyModel[130] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 141
        bodyModel[131] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 142
        bodyModel[132] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 143
        bodyModel[133] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 144
        bodyModel[134] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 145
        bodyModel[135] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 146
        bodyModel[136] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 142
        bodyModel[137] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 143
        bodyModel[138] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 144
        bodyModel[139] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 145
        bodyModel[140] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 146
        bodyModel[141] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 147
        bodyModel[142] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 148
        bodyModel[143] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 149
        bodyModel[144] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 150
        bodyModel[145] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 151
        bodyModel[146] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 152
        bodyModel[147] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 153
        bodyModel[148] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 154
        bodyModel[149] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 155
        bodyModel[150] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 156
        bodyModel[151] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 157
        bodyModel[152] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 158
        bodyModel[153] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 159
        bodyModel[154] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 160
        bodyModel[155] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 161
        bodyModel[156] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 162
        bodyModel[157] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 163
        bodyModel[158] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 164
        bodyModel[159] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 165
        bodyModel[160] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 162
        bodyModel[161] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 163
        bodyModel[162] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 164
        bodyModel[163] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 165
        bodyModel[164] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 166
        bodyModel[165] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 168
        bodyModel[166] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 169
        bodyModel[167] = new ModelRendererTurbo(this, 0, 164, textureX, textureY); // Box 167
        bodyModel[168] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 168
        bodyModel[169] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 169
        bodyModel[170] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 170
        bodyModel[171] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 171
        bodyModel[172] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 172
        bodyModel[173] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 173
        bodyModel[174] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 174
        bodyModel[175] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 175
        bodyModel[176] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 176
        bodyModel[177] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 177
        bodyModel[178] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 230
        bodyModel[179] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 231
        bodyModel[180] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 232
        bodyModel[181] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 233

        bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 1, 19, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
        bodyModel[0].setRotationPoint(-8.5F, 3F, -9.55F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[1].setRotationPoint(-20.5F, -15F, -10.55F);

        bodyModel[2].addBox(0F, 0F, 0F, 24, 22, 1, 0F); // Box 13
        bodyModel[2].setRotationPoint(-8F, -15F, -10.55F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0.25F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 2F); // Box 18
        bodyModel[3].setRotationPoint(-29.5F, -5F, -10.55F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,-0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F); // Box 19
        bodyModel[4].setRotationPoint(-29.5F, -15F, 9.45F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 21, 0F,-0.7F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.7F, 0F, -2.5F, -0.5F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -2.25F); // Box 20
        bodyModel[5].setRotationPoint(-29.5F, -18F, -10.8F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 19, 0F,0.22F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.22F, 0F, -1.75F, 0.25F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -1.75F); // Box 21
        bodyModel[6].setRotationPoint(-29.5F, 3F, -9.8F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 31
        bodyModel[7].setRotationPoint(-29.75F, 1F, -6.85F);

        bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 35
        bodyModel[8].setRotationPoint(-29F, -17F, 6.25F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 36
        bodyModel[9].setRotationPoint(-30F, 0.7F, -7.15F);

        bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
        bodyModel[10].setRotationPoint(-29F, -17F, -7.35F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 22, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[11].setRotationPoint(-21.5F, -15F, -9.55F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38
        bodyModel[12].setRotationPoint(37.5F, -18F, -10.8F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 58, 3, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        bodyModel[13].setRotationPoint(-20.5F, -18F, 8.45F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 58, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        bodyModel[14].setRotationPoint(-20.5F, -18F, -10.55F);

        bodyModel[15].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 52
        bodyModel[15].setRotationPoint(12.5F, 0F, -9.55F);

        bodyModel[16].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 53
        bodyModel[16].setRotationPoint(12.5F, 0F, 2.55F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 255
        bodyModel[17].setRotationPoint(3.75F, -17F, -4F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[18].setRotationPoint(15F, -17F, -4F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 264
        bodyModel[19].setRotationPoint(-7F, -15.5F, -4F);

        bodyModel[20].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 144
        bodyModel[20].setRotationPoint(-7.4F, 0F, -9.55F);

        bodyModel[21].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 145
        bodyModel[21].setRotationPoint(-7.4F, 0F, 2.45F);

        bodyModel[22].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 205
        bodyModel[22].setRotationPoint(-19F, -17.9F, -6.3F);

        bodyModel[23].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 217
        bodyModel[23].setRotationPoint(-10.75F, -17.9F, -6.3F);

        bodyModel[24].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 218
        bodyModel[24].setRotationPoint(-2.5F, -17.9F, -6.3F);

        bodyModel[25].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 219
        bodyModel[25].setRotationPoint(5.75F, -17.9F, -6.3F);

        bodyModel[26].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 220
        bodyModel[26].setRotationPoint(14F, -17.9F, -6.3F);

        bodyModel[27].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 221
        bodyModel[27].setRotationPoint(22.25F, -17.9F, -6.3F);

        bodyModel[28].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 224
        bodyModel[28].setRotationPoint(-2.5F, -17.9F, 4.2F);

        bodyModel[29].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 225
        bodyModel[29].setRotationPoint(-10.75F, -17.9F, 4.2F);

        bodyModel[30].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 226
        bodyModel[30].setRotationPoint(-19F, -17.9F, 4.2F);

        bodyModel[31].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 227
        bodyModel[31].setRotationPoint(5.75F, -17.9F, 4.2F);

        bodyModel[32].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 228
        bodyModel[32].setRotationPoint(14F, -17.9F, 4.2F);

        bodyModel[33].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 229
        bodyModel[33].setRotationPoint(22.25F, -17.9F, 4.2F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -1F, 0F, 1F, -2F, 0F, 1F, -2F, -6F, 0F, -1F, -6F); // Box 221
        bodyModel[34].setRotationPoint(-29F, -6F, -4.55F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
        bodyModel[35].setRotationPoint(-28F, -5F, -7.05F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.35F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
        bodyModel[36].setRotationPoint(-29F, -5F, -7.05F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 238
        bodyModel[37].setRotationPoint(-28.5F, -5.8F, -7.05F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 37
        bodyModel[38].setRotationPoint(-28.5F, -6.6F, -7.05F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
        bodyModel[39].setRotationPoint(-28.5F, -4F, -7.55F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88
        bodyModel[40].setRotationPoint(-27.5F, -2F, -3.55F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.5F); // Box 89
        bodyModel[41].setRotationPoint(-27.5F, -2F, 0.449999999999999F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0.5F, -0.5F, -0.5F); // Box 90
        bodyModel[42].setRotationPoint(-23.5F, -6.5F, 0.449999999999999F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92
        bodyModel[43].setRotationPoint(-23.5F, -6.5F, -3.55F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 155
        bodyModel[44].setRotationPoint(-23F, -8.5F, -2.55F);

        bodyModel[45].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 156
        bodyModel[45].setRotationPoint(-26.5F, -1F, -1.55F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 158
        bodyModel[46].setRotationPoint(-27.5F, -4F, 0.949999999999999F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 159
        bodyModel[47].setRotationPoint(-27.5F, -4F, -4.05F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -5.5F, 0F, -4.15F, -5.5F, 0F, -0.15F, 0F, 0F, 0F, 0F, -3F, -4F, -5.5F, -3F, -4.15F, -5.5F, -3F, -0.15F, 0F, -3F, 0F); // Box 390
        bodyModel[48].setRotationPoint(-27.5F, -1.7F, -7.05F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, -5.25F, -4.5F, 0F, -5.25F, -4.5F, 0F, -5.25F, 0.5F, 0F, -5.25F, 1F, 0.5F, 0F, -5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 391
        bodyModel[49].setRotationPoint(-22.95F, -11.8F, -7.75F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0.5F, 0F, -2.5F, 0F, 0F, -2F, 0F); // Box 180
        bodyModel[50].setRotationPoint(37.5F, -16F, -7.55F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F); // Box 181
        bodyModel[51].setRotationPoint(37.5F, -16F, -5.55F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1.25F, 0.5F, 0F, -1F, 0F); // Box 143
        bodyModel[52].setRotationPoint(37.5F, -16F, 5.45F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 19, 3, 0F,-2F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1F, -1F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1F, -1F, 0F, -3F); // Box 254
        bodyModel[53].setRotationPoint(36.5F, -15F, -9.55F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 19, 3, 0F,-1F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, -1.5F, -2F, 0F, 0F); // Box 255
        bodyModel[54].setRotationPoint(36.5F, -15F, 6.45F);

        bodyModel[55].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 256
        bodyModel[55].setRotationPoint(36.5F, -18F, 7.45F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
        bodyModel[56].setRotationPoint(36.5F, -17F, 5.45F);

        bodyModel[57].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 256
        bodyModel[57].setRotationPoint(36.5F, -18F, -9.55F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 257
        bodyModel[58].setRotationPoint(36.5F, -17F, -7.55F);

        bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 11, 0F); // Box 260
        bodyModel[59].setRotationPoint(36.5F, -17F, -5.55F);

        bodyModel[60].addBox(-1F, 0F, 0F, 1, 9, 2, 0F); // Box 103
        bodyModel[60].setRotationPoint(29F, -27F, -1.05F);
        bodyModel[60].rotateAngleZ = 0.71558499F;

        bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 105
        bodyModel[61].setRotationPoint(34F, -20F, -3.05F);

        bodyModel[62].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 107
        bodyModel[62].setRotationPoint(32F, -19F, -3.05F);

        bodyModel[63].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 108
        bodyModel[63].setRotationPoint(32F, -19F, 1.95F);

        bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 109
        bodyModel[64].setRotationPoint(28.5F, -27.25F, -2.05F);

        bodyModel[65].addBox(-1F, 0F, 0F, 1, 10, 1, 0F); // Box 113
        bodyModel[65].setRotationPoint(36F, -33.7F, -4.05F);
        bodyModel[65].rotateAngleX = 0.2268928F;
        bodyModel[65].rotateAngleZ = -0.75049158F;

        bodyModel[66].addBox(-1F, 0F, -1F, 1, 10, 1, 0F); // Box 114
        bodyModel[66].setRotationPoint(36F, -33.7F, 3.95F);
        bodyModel[66].rotateAngleX = -0.2268928F;
        bodyModel[66].rotateAngleZ = -0.75049158F;

        bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 115
        bodyModel[67].setRotationPoint(35.25F, -35F, -7.05F);

        bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 116
        bodyModel[68].setRotationPoint(37.25F, -35F, -7.05F);

        bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 117
        bodyModel[69].setRotationPoint(36.25F, -35F, -4.05F);

        bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 118
        bodyModel[70].setRotationPoint(36.25F, -35F, 2.95F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 362
        bodyModel[71].setRotationPoint(-25F, 6F, -8.55F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 230
        bodyModel[72].setRotationPoint(-32.7F, 4.7F, -0.2F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 231
        bodyModel[73].setRotationPoint(-32.7F, 4.7F, -0.85F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 232
        bodyModel[74].setRotationPoint(-32.7F, 3.95F, -0.95F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 233
        bodyModel[75].setRotationPoint(-32.7F, 3.95F, -0.2F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
        bodyModel[76].setRotationPoint(-34F, 3.7F, -1.6F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 338
        bodyModel[77].setRotationPoint(-34.5F, 4.2F, 0.199999999999999F);

        bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 388
        bodyModel[78].setRotationPoint(-27.5F, 4.2F, -1.6F);

        bodyModel[79].addBox(0F, 0F, 0F, 12, 3, 0, 0F); // Box 389
        bodyModel[79].setRotationPoint(-33.5F, 4.5F, -1.45F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
        bodyModel[80].setRotationPoint(-34.1F, 3.7F, 1.4F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
        bodyModel[81].setRotationPoint(-34.1F, 3.7F, -2.6F);

        bodyModel[82].addBox(0F, 0F, 0F, 12, 3, 0, 0F); // Box 244
        bodyModel[82].setRotationPoint(-33.5F, 4.5F, 1.25F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 245
        bodyModel[83].setRotationPoint(-33F, 3.7F, -1.6F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 309
        bodyModel[84].setRotationPoint(-28.5F, -4F, 5.45F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0.5F, 0F, -2.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.7F, -3F, -1F, -1.77F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -1F, 1F); // Box 302
        bodyModel[85].setRotationPoint(-28.5F, 4F, -10.55F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 60, 1, 19, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 68
        bodyModel[86].setRotationPoint(-20.5F, -18F, -9.8F);

        bodyModel[87].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        bodyModel[87].setRotationPoint(-20F, -15F, -10.1F);

        bodyModel[88].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
        bodyModel[88].setRotationPoint(-17F, -15F, -10.1F);

        bodyModel[89].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
        bodyModel[89].setRotationPoint(-14F, -15F, -10.1F);

        bodyModel[90].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
        bodyModel[90].setRotationPoint(-11F, -15F, -10.1F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 8, 15, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0.22F, 0F, -0.5F, 0.22F, 0F, -0.5F, 0F, 0.22F, 0F, 0F, 0F, 0F, 0.22F, 0F, 0F, 0.22F, 0.22F, 0F, 0F); // Box 311
        bodyModel[91].setRotationPoint(-29.5F, -5F, -7.55F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,-0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F); // Box 312
        bodyModel[92].setRotationPoint(-29.5F, -15F, -10.55F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0.25F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2.5F); // Box 313
        bodyModel[93].setRotationPoint(-29.5F, -5F, 9.45F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 10, 15, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.38F, 0F, 0F, -0.38F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0.22F, 0F, 0.5F, 0.22F, 0F, 0.5F, 0F); // Box 316
        bodyModel[94].setRotationPoint(-29.5F, -15F, -7.55F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 12, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 155
        bodyModel[95].setRotationPoint(-20.5F, 4F, -7F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 318
        bodyModel[96].setRotationPoint(-20.5F, 7F, -10.55F);

        bodyModel[97].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
        bodyModel[97].setRotationPoint(-20F, -15F, 9.7F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 320
        bodyModel[98].setRotationPoint(-20.5F, -15F, 9.45F);

        bodyModel[99].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
        bodyModel[99].setRotationPoint(-17F, -15F, 9.7F);

        bodyModel[100].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
        bodyModel[100].setRotationPoint(-14F, -15F, 9.7F);

        bodyModel[101].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
        bodyModel[101].setRotationPoint(-11F, -15F, 9.7F);

        bodyModel[102].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
        bodyModel[102].setRotationPoint(22F, -15F, -10.1F);

        bodyModel[103].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
        bodyModel[103].setRotationPoint(25F, -15F, -10.1F);

        bodyModel[104].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        bodyModel[104].setRotationPoint(19F, -15F, -10.1F);

        bodyModel[105].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
        bodyModel[105].setRotationPoint(16F, -15F, -10.1F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 11, 22, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 328
        bodyModel[106].setRotationPoint(28F, -15F, -10.55F);

        bodyModel[107].addBox(0F, 0F, 0F, 24, 22, 1, 0F); // Box 337
        bodyModel[107].setRotationPoint(-8F, -15F, 9.45F);

        bodyModel[108].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
        bodyModel[108].setRotationPoint(16F, -15F, 9.9F);

        bodyModel[109].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
        bodyModel[109].setRotationPoint(19F, -15F, 9.9F);

        bodyModel[110].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
        bodyModel[110].setRotationPoint(22F, -15F, 9.9F);

        bodyModel[111].addShapeBox(0F, 0F, -0.5F, 3, 22, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
        bodyModel[111].setRotationPoint(25F, -15F, 9.9F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0.5F, 0F, 1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.35F, -3F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -1F, -1.77F); // Box 342
        bodyModel[112].setRotationPoint(-28.5F, 4F, 9.45F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 11, 22, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
        bodyModel[113].setRotationPoint(28F, -15F, 9.45F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
        bodyModel[114].setRotationPoint(16F, 7F, -10.55F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 12, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 345
        bodyModel[115].setRotationPoint(16F, 3F, -7F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 346
        bodyModel[116].setRotationPoint(-8F, 6F, -10.55F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 347
        bodyModel[117].setRotationPoint(-8.5F, 4F, -10F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 348
        bodyModel[118].setRotationPoint(-8F, 6F, 9.45F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 126
        bodyModel[119].setRotationPoint(11F, 4F, -10F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 127
        bodyModel[120].setRotationPoint(15F, 6F, -10.55F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 128
        bodyModel[121].setRotationPoint(15F, 6F, 9.45F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 122
        bodyModel[122].setRotationPoint(-7.1F, -10.8F, -14F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,0F, 0F, -4F, -5.5F, 0F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -5.5F, -3F, -4F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 126
        bodyModel[123].setRotationPoint(-7.1F, -0.8F, -13.5F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 182
        bodyModel[124].setRotationPoint(-7.5F, -5.8F, -9.5F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 13, 4, 11, 0F,0F, 0F, -4F, -5.5F, 0F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -5.5F, -3F, -4F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 134
        bodyModel[125].setRotationPoint(0.4F, -0.8F, -13.5F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 135
        bodyModel[126].setRotationPoint(3.5F, -10.8F, -14F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,0F, 0F, -4F, -5.5F, 0F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -5.5F, -3F, -4F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 137
        bodyModel[127].setRotationPoint(11F, -0.8F, -13.5F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 138
        bodyModel[128].setRotationPoint(14.5F, -10.8F, -14F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 140
        bodyModel[129].setRotationPoint(-7F, -17F, -4F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 141
        bodyModel[130].setRotationPoint(15F, -7F, -10F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 142
        bodyModel[131].setRotationPoint(15F, -14F, -10F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 143
        bodyModel[132].setRotationPoint(28F, 6F, -10.55F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 144
        bodyModel[133].setRotationPoint(28F, 4F, -10F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 145
        bodyModel[134].setRotationPoint(28F, 6F, 9.45F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 9, 1, 19, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 146
        bodyModel[135].setRotationPoint(28F, 3F, -9.55F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 142
        bodyModel[136].setRotationPoint(14.5F, -10.8F, -2F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,0F, 0F, -4F, -5.5F, 0F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -5.5F, -3F, -4F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 143
        bodyModel[137].setRotationPoint(11F, -0.8F, -1.5F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 13, 4, 11, 0F,0F, 0F, -4F, -5.5F, 0F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -5.5F, -3F, -4F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 144
        bodyModel[138].setRotationPoint(0.4F, -0.8F, -1.5F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 145
        bodyModel[139].setRotationPoint(3.5F, -10.8F, -2F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,0F, 0F, -4F, -5.5F, 0F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -5.5F, -3F, -4F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 146
        bodyModel[140].setRotationPoint(-7.1F, -0.8F, -1.5F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 147
        bodyModel[141].setRotationPoint(-7.1F, -10.8F, -2F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 148
        bodyModel[142].setRotationPoint(-7.5F, -5.8F, 2.5F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
        bodyModel[143].setRotationPoint(-30F, 0.7F, -5.15F);

        bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 150
        bodyModel[144].setRotationPoint(-29.75F, 1F, -4.85F);

        bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 151
        bodyModel[145].setRotationPoint(-30F, 0.7F, 5.45F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 152
        bodyModel[146].setRotationPoint(-29.75F, 1F, 5.75F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
        bodyModel[147].setRotationPoint(-30F, 0.7F, 3.45F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 154
        bodyModel[148].setRotationPoint(-29.75F, 1F, 3.75F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 155
        bodyModel[149].setRotationPoint(15F, -17F, 2.25F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 156
        bodyModel[150].setRotationPoint(-7F, -15.5F, 2.25F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 157
        bodyModel[151].setRotationPoint(3.75F, -17F, 2.25F);

        bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[152].setRotationPoint(-7F, -17F, 2.25F);

        bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 159
        bodyModel[153].setRotationPoint(15F, -14F, 3F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 160
        bodyModel[154].setRotationPoint(15F, -7F, 3F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[155].setRotationPoint(-25F, 6F, 0.45F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 12, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 162
        bodyModel[156].setRotationPoint(-20.5F, 3F, -7F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
        bodyModel[157].setRotationPoint(-20.5F, 7F, 5.45F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 12, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 164
        bodyModel[158].setRotationPoint(-20.5F, 4F, 6F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 165
        bodyModel[159].setRotationPoint(-8.5F, 4F, 6F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, -0.5F, -1.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.35F, -0.5F, -0.5F, -0.65F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.35F, -0.5F, 0F, -0.65F); // Box 162
        bodyModel[160].setRotationPoint(-30.65F, 1.95F, -8.35F);
        bodyModel[160].rotateAngleZ = -0.01745329F;

        bodyModel[161].addShapeBox(0F, 0F, 0F, 24, 4, 16, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        bodyModel[161].setRotationPoint(-9F, -22F, -8.05F);

        bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 164
        bodyModel[162].setRotationPoint(37.5F, -18F, 9.7F);

        bodyModel[163].addShapeBox(0F, 0F, 0F, 9, 1, 21, 0F,-0.8F, -0.5F, -3.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, -0.8F, -0.5F, -2.75F, -0.7F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.7F, 0F, -2.5F); // Box 165
        bodyModel[163].setRotationPoint(-29.5F, -19F, -10.8F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 166
        bodyModel[164].setRotationPoint(15.5F, -5.8F, -9.5F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 168
        bodyModel[165].setRotationPoint(15.5F, -5.8F, 2.5F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 60, 1, 21, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
        bodyModel[166].setRotationPoint(-20.5F, -19F, -10.8F);

        bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 14, 16, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -10F, 0F, -8F, -10F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0.2F, 0F, -10F); // Box 167
        bodyModel[167].setRotationPoint(-29.55F, -11.5F, -3F);

        bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 168
        bodyModel[168].setRotationPoint(28.4F, -10.8F, -14F);

        bodyModel[169].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,0F, 0F, -4F, -5.5F, 0F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -5.5F, -3F, -4F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 169
        bodyModel[169].setRotationPoint(28.4F, -0.8F, -13.5F);

        bodyModel[170].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 170
        bodyModel[170].setRotationPoint(28.1F, 0F, -9.55F);

        bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 171
        bodyModel[171].setRotationPoint(28F, -5.8F, -9.5F);

        bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 172
        bodyModel[172].setRotationPoint(28.5F, -17F, -4F);

        bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 173
        bodyModel[173].setRotationPoint(28.4F, -10.8F, -2F);

        bodyModel[174].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,0F, 0F, -4F, -5.5F, 0F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -5.5F, -3F, -4F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 174
        bodyModel[174].setRotationPoint(28.4F, -0.8F, -1.5F);

        bodyModel[175].addBox(0F, 0F, 0F, 3, 3, 7, 0F); // Box 175
        bodyModel[175].setRotationPoint(28.1F, 0F, 2.45F);

        bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 176
        bodyModel[176].setRotationPoint(28F, -5.8F, 2.5F);

        bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 177
        bodyModel[177].setRotationPoint(28.5F, -17F, 2.25F);

        bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 230
        bodyModel[178].setRotationPoint(-28.8F, -19.5F, -0.55F);

        bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 231
        bodyModel[179].setRotationPoint(-28.8F, -19.5F, -1.3F);

        bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 232
        bodyModel[180].setRotationPoint(-28.8F, -20.25F, -1.3F);

        bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 233
        bodyModel[181].setRotationPoint(-28.8F, -20.25F, -0.55F);
        this.flipAll();
    }
}