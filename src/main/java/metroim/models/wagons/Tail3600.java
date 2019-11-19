package metroim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Tail3600 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public Tail3600() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[160];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
        bodyModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
        bodyModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 74
        bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
        bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 8
        bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 9
        bodyModel[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 10
        bodyModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 11
        bodyModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 12
        bodyModel[9] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 151
        bodyModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 152
        bodyModel[11] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 153
        bodyModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 155
        bodyModel[13] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 156
        bodyModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 157
        bodyModel[15] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 158
        bodyModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 159
        bodyModel[17] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 161
        bodyModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 162
        bodyModel[19] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 163
        bodyModel[20] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 164
        bodyModel[21] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 165
        bodyModel[22] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 166
        bodyModel[23] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 167
        bodyModel[24] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 168
        bodyModel[25] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 169
        bodyModel[26] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 170
        bodyModel[27] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 171
        bodyModel[28] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 179
        bodyModel[29] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 186
        bodyModel[30] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 190
        bodyModel[31] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 193
        bodyModel[32] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 194
        bodyModel[33] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 205
        bodyModel[34] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 206
        bodyModel[35] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 207
        bodyModel[36] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 208
        bodyModel[37] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 209
        bodyModel[38] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 210
        bodyModel[39] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 211
        bodyModel[40] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 212
        bodyModel[41] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 215
        bodyModel[42] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 218
        bodyModel[43] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 219
        bodyModel[44] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 220
        bodyModel[45] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 221
        bodyModel[46] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 226
        bodyModel[47] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 227
        bodyModel[48] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 228
        bodyModel[49] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 229
        bodyModel[50] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 231
        bodyModel[51] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 232
        bodyModel[52] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 233
        bodyModel[53] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 234
        bodyModel[54] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 235
        bodyModel[55] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 236
        bodyModel[56] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 237
        bodyModel[57] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 238
        bodyModel[58] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 239
        bodyModel[59] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 243
        bodyModel[60] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 244
        bodyModel[61] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 245
        bodyModel[62] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 246
        bodyModel[63] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 259
        bodyModel[64] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 260
        bodyModel[65] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 261
        bodyModel[66] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 262
        bodyModel[67] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 264
        bodyModel[68] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 265
        bodyModel[69] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 266
        bodyModel[70] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 267
        bodyModel[71] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 269
        bodyModel[72] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 270
        bodyModel[73] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 271
        bodyModel[74] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 272
        bodyModel[75] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 277
        bodyModel[76] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 278
        bodyModel[77] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 281
        bodyModel[78] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 282
        bodyModel[79] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 283
        bodyModel[80] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 284
        bodyModel[81] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 285
        bodyModel[82] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 286
        bodyModel[83] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 287
        bodyModel[84] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 288
        bodyModel[85] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 289
        bodyModel[86] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 290
        bodyModel[87] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 291
        bodyModel[88] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 292
        bodyModel[89] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 293
        bodyModel[90] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 294
        bodyModel[91] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 295
        bodyModel[92] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 298
        bodyModel[93] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 299
        bodyModel[94] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 300
        bodyModel[95] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 301
        bodyModel[96] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 302
        bodyModel[97] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 303
        bodyModel[98] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 304
        bodyModel[99] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 305
        bodyModel[100] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 306
        bodyModel[101] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 307
        bodyModel[102] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 308
        bodyModel[103] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 309
        bodyModel[104] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 310
        bodyModel[105] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 311
        bodyModel[106] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 312
        bodyModel[107] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 313
        bodyModel[108] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 314
        bodyModel[109] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 315
        bodyModel[110] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 320
        bodyModel[111] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 321
        bodyModel[112] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 322
        bodyModel[113] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 323
        bodyModel[114] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 326
        bodyModel[115] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 327
        bodyModel[116] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 328
        bodyModel[117] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 329
        bodyModel[118] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 330
        bodyModel[119] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 331
        bodyModel[120] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 332
        bodyModel[121] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 333
        bodyModel[122] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 334
        bodyModel[123] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 335
        bodyModel[124] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 336
        bodyModel[125] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 337
        bodyModel[126] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 338
        bodyModel[127] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 339
        bodyModel[128] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 32
        bodyModel[129] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 33
        bodyModel[130] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 36
        bodyModel[131] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 343
        bodyModel[132] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 35
        bodyModel[133] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 34
        bodyModel[134] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 346
        bodyModel[135] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 172
        bodyModel[136] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 173
        bodyModel[137] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 174
        bodyModel[138] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 175
        bodyModel[139] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 176
        bodyModel[140] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 177
        bodyModel[141] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 178
        bodyModel[142] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 179
        bodyModel[143] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 180
        bodyModel[144] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 181
        bodyModel[145] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 182
        bodyModel[146] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 183
        bodyModel[147] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 184
        bodyModel[148] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 174
        bodyModel[149] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 175
        bodyModel[150] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 176
        bodyModel[151] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 177
        bodyModel[152] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 178
        bodyModel[153] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 179
        bodyModel[154] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 180
        bodyModel[155] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 181
        bodyModel[156] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 182
        bodyModel[157] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 183
        bodyModel[158] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 184
        bodyModel[159] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 185

        bodyModel[0].addBox(0F, 0F, 0F, 68, 1, 19, 0F); // Box 44
        bodyModel[0].setRotationPoint(-34F, 0F, -9.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 7, 19, 0F,0.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        bodyModel[1].setRotationPoint(-34F, -7F, -9.5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 21, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[2].setRotationPoint(-9F, -16F, 8.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
        bodyModel[3].setRotationPoint(17F, -16F, 8.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        bodyModel[4].setRotationPoint(-33F, -7F, 8.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        bodyModel[5].setRotationPoint(22F, -16F, 8.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[6].setRotationPoint(-33F, -7F, -9.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 9, 19, 0F,-0.6F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.6F, 1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 11
        bodyModel[7].setRotationPoint(-34.5F, -16F, -9.5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 68, 3, 2, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.8F, -0.2F, -1F, -0.8F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 12
        bodyModel[8].setRotationPoint(-34F, -20F, 7.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 68, 3, 2, 0F,-0.2F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 151
        bodyModel[9].setRotationPoint(-34F, -20F, -9.5F);

        bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 152
        bodyModel[10].setRotationPoint(-34F, 1F, -9.5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 153
        bodyModel[11].setRotationPoint(-35F, 0F, -3F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F); // Box 155
        bodyModel[12].setRotationPoint(-36F, 0F, -3F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 156
        bodyModel[13].setRotationPoint(-33F, -16F, 8.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 157
        bodyModel[14].setRotationPoint(-33F, -16F, -9.5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[15].setRotationPoint(-33F, -19F, 6.5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 67, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 159
        bodyModel[16].setRotationPoint(-33F, -19F, -7.5F);

        bodyModel[17].addBox(0F, 0F, 0F, 67, 1, 15, 0F); // Box 161
        bodyModel[17].setRotationPoint(-33F, -20F, -7.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 68, 1, 15, 0F,-0.2F, -0.8F, -4F, 0F, -0.8F, -4F, 0F, -0.8F, -4F, -0.2F, -0.8F, -4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 162
        bodyModel[18].setRotationPoint(-34F, -21F, -7.5F);

        bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 163
        bodyModel[19].setRotationPoint(-34F, 1F, 3.5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 15, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 164
        bodyModel[20].setRotationPoint(-34F, -20F, -7.5F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 13, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
        bodyModel[21].setRotationPoint(-32F, -16F, 8.5F);

        bodyModel[22].addBox(0F, 0F, 0F, 67, 1, 1, 0F); // Box 166
        bodyModel[22].setRotationPoint(-33F, 1F, -9.5F);

        bodyModel[23].addBox(0F, 0F, 0F, 67, 1, 1, 0F); // Box 167
        bodyModel[23].setRotationPoint(-33F, 1F, 8.5F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, 0.3F, 0F, -1F); // Box 168
        bodyModel[24].setRotationPoint(-34F, 4F, -8.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
        bodyModel[25].setRotationPoint(-34F, 3F, -9.5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 170
        bodyModel[26].setRotationPoint(-34F, 3F, 3.5F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 18, 17, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
        bodyModel[27].setRotationPoint(-27F, -18F, -8.5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 179
        bodyModel[28].setRotationPoint(-20.5F, -9F, -7.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 186
        bodyModel[29].setRotationPoint(-21F, -8F, -8.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
        bodyModel[30].setRotationPoint(-23F, -4F, -8.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
        bodyModel[31].setRotationPoint(-21F, -8F, -5.5F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
        bodyModel[32].setRotationPoint(-23F, -4F, -0.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
        bodyModel[33].setRotationPoint(-23F, -4F, 4.5F);

        bodyModel[34].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 206
        bodyModel[34].setRotationPoint(-20F, -9F, -8.5F);

        bodyModel[35].addBox(0F, 0F, 0F, 1, 9, 9, 0F); // Box 207
        bodyModel[35].setRotationPoint(-20F, -9F, -0.5F);

        bodyModel[36].addBox(0F, 0F, 0F, 1, 9, 9, 0F); // Box 208
        bodyModel[36].setRotationPoint(-9F, -9F, -0.5F);

        bodyModel[37].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 209
        bodyModel[37].setRotationPoint(-9F, -9F, -8.5F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 210
        bodyModel[38].setRotationPoint(-8F, -9F, 0.5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 211
        bodyModel[39].setRotationPoint(-8F, -8F, -0.5F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
        bodyModel[40].setRotationPoint(-8F, -8F, 2.5F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
        bodyModel[41].setRotationPoint(-8F, -4F, -0.5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 218
        bodyModel[42].setRotationPoint(-8F, -9F, 5.5F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
        bodyModel[43].setRotationPoint(-8F, -4F, 4.5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
        bodyModel[44].setRotationPoint(-8F, -8F, 7.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 221
        bodyModel[45].setRotationPoint(-8F, -8F, 4.5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        bodyModel[46].setRotationPoint(-8F, -4F, -8.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 227
        bodyModel[47].setRotationPoint(-8F, -8F, -8.5F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
        bodyModel[48].setRotationPoint(-8F, -8F, -5.5F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 229
        bodyModel[49].setRotationPoint(-8F, -9F, -7.5F);

        bodyModel[50].addBox(0F, 0F, 0F, 1, 9, 9, 0F); // Box 231
        bodyModel[50].setRotationPoint(11F, -9F, -0.5F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
        bodyModel[51].setRotationPoint(-2F, -4F, -0.5F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
        bodyModel[52].setRotationPoint(2F, -4F, -0.5F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
        bodyModel[53].setRotationPoint(8F, -4F, -0.5F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 235
        bodyModel[54].setRotationPoint(2F, -9F, 0.5F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 236
        bodyModel[55].setRotationPoint(0.5F, -9F, 0.5F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
        bodyModel[56].setRotationPoint(0F, -8F, 2.5F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
        bodyModel[57].setRotationPoint(10F, -8F, 2.5F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
        bodyModel[58].setRotationPoint(2F, -8F, 2.5F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 243
        bodyModel[59].setRotationPoint(10.5F, -9F, 0.5F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 244
        bodyModel[60].setRotationPoint(0F, -8F, -0.5F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 245
        bodyModel[61].setRotationPoint(10F, -8F, -0.5F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 246
        bodyModel[62].setRotationPoint(2F, -8F, -0.5F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
        bodyModel[63].setRotationPoint(2F, -4F, 4.5F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 260
        bodyModel[64].setRotationPoint(2F, -9F, 5.5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
        bodyModel[65].setRotationPoint(2F, -8F, 7.5F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 262
        bodyModel[66].setRotationPoint(2F, -8F, 4.5F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
        bodyModel[67].setRotationPoint(8F, -4F, 4.5F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 265
        bodyModel[68].setRotationPoint(10.5F, -9F, 5.5F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
        bodyModel[69].setRotationPoint(10F, -8F, 7.5F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 267
        bodyModel[70].setRotationPoint(10F, -8F, 4.5F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        bodyModel[71].setRotationPoint(-2F, -4F, 4.5F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 270
        bodyModel[72].setRotationPoint(0.5F, -9F, 5.5F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
        bodyModel[73].setRotationPoint(0F, -8F, 7.5F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 272
        bodyModel[74].setRotationPoint(0F, -8F, 4.5F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        bodyModel[75].setRotationPoint(-30F, -4F, -7.5F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        bodyModel[76].setRotationPoint(-30F, -4F, -4.5F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
        bodyModel[77].setRotationPoint(-2F, -4F, -8.5F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 282
        bodyModel[78].setRotationPoint(0F, -8F, -8.5F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
        bodyModel[79].setRotationPoint(0F, -8F, -5.5F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 284
        bodyModel[80].setRotationPoint(0.5F, -9F, -7.5F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 285
        bodyModel[81].setRotationPoint(2F, -8F, -8.5F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
        bodyModel[82].setRotationPoint(2F, -8F, -5.5F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        bodyModel[83].setRotationPoint(2F, -4F, -8.5F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 288
        bodyModel[84].setRotationPoint(2F, -9F, -7.5F);

        bodyModel[85].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 289
        bodyModel[85].setRotationPoint(11F, -9F, -8.5F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
        bodyModel[86].setRotationPoint(8F, -4F, -8.5F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 291
        bodyModel[87].setRotationPoint(10F, -8F, -8.5F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
        bodyModel[88].setRotationPoint(10F, -8F, -5.5F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 293
        bodyModel[89].setRotationPoint(10.5F, -9F, -7.5F);

        bodyModel[90].addBox(0F, 0F, 0F, 1, 9, 9, 0F); // Box 294
        bodyModel[90].setRotationPoint(22F, -9F, -0.5F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 13, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
        bodyModel[91].setRotationPoint(-32F, -16F, -9.5F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 21, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        bodyModel[92].setRotationPoint(-9F, -16F, -9.5F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 299
        bodyModel[93].setRotationPoint(23F, -9F, 0.5F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 300
        bodyModel[94].setRotationPoint(23F, -8F, -0.5F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        bodyModel[95].setRotationPoint(23F, -4F, -0.5F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
        bodyModel[96].setRotationPoint(23F, -8F, 2.5F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 303
        bodyModel[97].setRotationPoint(23F, -9F, 5.5F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 304
        bodyModel[98].setRotationPoint(23F, -8F, 4.5F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
        bodyModel[99].setRotationPoint(23F, -8F, 7.5F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
        bodyModel[100].setRotationPoint(23F, -4F, 4.5F);

        bodyModel[101].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 307
        bodyModel[101].setRotationPoint(22F, -9F, -8.5F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 308
        bodyModel[102].setRotationPoint(23F, -8F, -8.5F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
        bodyModel[103].setRotationPoint(23F, -8F, -5.5F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 310
        bodyModel[104].setRotationPoint(23F, -9F, -7.5F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
        bodyModel[105].setRotationPoint(23F, -4F, -8.5F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 312
        bodyModel[106].setRotationPoint(32.5F, -9F, -7.5F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
        bodyModel[107].setRotationPoint(30F, -4F, -8.5F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
        bodyModel[108].setRotationPoint(32F, -8F, -5.5F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 315
        bodyModel[109].setRotationPoint(32F, -8F, -8.5F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
        bodyModel[110].setRotationPoint(30F, -4F, 4.5F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
        bodyModel[111].setRotationPoint(32F, -8F, 7.5F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
        bodyModel[112].setRotationPoint(32.5F, -9F, 5.5F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 323
        bodyModel[113].setRotationPoint(32F, -8F, 4.5F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        bodyModel[114].setRotationPoint(22F, -16F, -9.5F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 18, 17, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
        bodyModel[115].setRotationPoint(33F, -18F, -8.5F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 328
        bodyModel[116].setRotationPoint(-34.9F, -5F, 4F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 329
        bodyModel[117].setRotationPoint(-34.9F, -5F, -8F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
        bodyModel[118].setRotationPoint(-34.7F, -2F, 6.5F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
        bodyModel[119].setRotationPoint(-34.7F, -2F, -7.5F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
        bodyModel[120].setRotationPoint(-34.1F, -19F, 0.5F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
        bodyModel[121].setRotationPoint(-34.1F, -19F, -1.5F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 334
        bodyModel[122].setRotationPoint(-35.05F, -10F, 2.7F);
        bodyModel[122].rotateAngleX = 1.57079633F;
        bodyModel[122].rotateAngleZ = -0.08726646F;

        bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 335
        bodyModel[123].setRotationPoint(-35.05F, -10F, -3F);
        bodyModel[123].rotateAngleX = 1.57079633F;
        bodyModel[123].rotateAngleZ = -0.08726646F;

        bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
        bodyModel[124].setRotationPoint(-34.1F, -19F, 6.5F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
        bodyModel[125].setRotationPoint(-34.1F, -19F, -7.5F);

        bodyModel[126].addBox(0F, 0F, 0F, 12, 5, 8, 0F); // Box 338
        bodyModel[126].setRotationPoint(-2F, 1F, 0.5F);

        bodyModel[127].addBox(0F, 0F, 0F, 12, 4, 8, 0F); // Box 339
        bodyModel[127].setRotationPoint(-8F, 1F, -8.5F);

        bodyModel[128].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 32
        bodyModel[128].setRotationPoint(-36F, 1F, -1F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[129].setRotationPoint(-38F, 1F, -2F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 36
        bodyModel[130].setRotationPoint(-38.5F, 0F, 2F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 343
        bodyModel[131].setRotationPoint(-38.5F, 0F, -2.2F);

        bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 35
        bodyModel[132].setRotationPoint(-38F, -0.25F, -2F);

        bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
        bodyModel[133].setRotationPoint(-38F, 3F, 2F);

        bodyModel[134].addBox(0F, 0F, 0F, 4, 5, 8, 0F); // Box 346
        bodyModel[134].setRotationPoint(5F, 1F, -8.5F);

        bodyModel[135].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 172
        bodyModel[135].setRotationPoint(34F, -16F, 3.5F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
        bodyModel[136].setRotationPoint(12F, -16F, 8.5F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
        bodyModel[137].setRotationPoint(-14F, -16F, 8.5F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
        bodyModel[138].setRotationPoint(-19F, -16F, 8.5F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
        bodyModel[139].setRotationPoint(-19F, -16F, -9.5F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
        bodyModel[140].setRotationPoint(-14F, -16F, -9.5F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        bodyModel[141].setRotationPoint(12F, -16F, -9.5F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
        bodyModel[142].setRotationPoint(17F, -16F, -9.5F);

        bodyModel[143].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 180
        bodyModel[143].setRotationPoint(34F, -16F, -4.5F);

        bodyModel[144].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 181
        bodyModel[144].setRotationPoint(29F, 1F, -1F);

        bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 182
        bodyModel[145].setRotationPoint(35F, 1F, -2F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 183
        bodyModel[146].setRotationPoint(34F, -1F, -3F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, -0.8F, 0F); // Box 184
        bodyModel[147].setRotationPoint(35F, -1F, -3F);

        bodyModel[148].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 174
        bodyModel[148].setRotationPoint(-33.6F, -7F, -8.5F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 175
        bodyModel[149].setRotationPoint(-33.9F, -9F, -8.5F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 176
        bodyModel[150].setRotationPoint(-20.5F, -9F, 0.5F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 177
        bodyModel[151].setRotationPoint(-21F, -8F, -0.5F);

        bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        bodyModel[152].setRotationPoint(-21F, -8F, 2.5F);

        bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 179
        bodyModel[153].setRotationPoint(-20.5F, -9F, 5.5F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
        bodyModel[154].setRotationPoint(-21F, -8F, 7.5F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 181
        bodyModel[155].setRotationPoint(-21F, -8F, 4.5F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 182
        bodyModel[156].setRotationPoint(-27.5F, -9F, -6.5F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        bodyModel[157].setRotationPoint(-28F, -8F, -4.5F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 184
        bodyModel[158].setRotationPoint(-28F, -8F, -7.5F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        bodyModel[159].setRotationPoint(-30F, -4F, -7.5F);
        this.flipAll();
    }
}