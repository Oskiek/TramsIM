package metroim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Middle3600 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public Middle3600() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[145];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
        bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 74
        bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
        bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 9
        bodyModel[4] = new ModelRendererTurbo(this, 268, 1, textureX, textureY); // Box 12
        bodyModel[5] = new ModelRendererTurbo(this, 268, 9, textureX, textureY); // Box 151
        bodyModel[6] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 153
        bodyModel[7] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 155
        bodyModel[8] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 158
        bodyModel[9] = new ModelRendererTurbo(this, 3, 25, textureX, textureY); // Box 159
        bodyModel[10] = new ModelRendererTurbo(this, 279, 25, textureX, textureY); // Box 161
        bodyModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 162
        bodyModel[12] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 166
        bodyModel[13] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 167
        bodyModel[14] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 179
        bodyModel[15] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 186
        bodyModel[16] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 190
        bodyModel[17] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 193
        bodyModel[18] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 194
        bodyModel[19] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 205
        bodyModel[20] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 206
        bodyModel[21] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 207
        bodyModel[22] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 208
        bodyModel[23] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 209
        bodyModel[24] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 210
        bodyModel[25] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 211
        bodyModel[26] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 212
        bodyModel[27] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 215
        bodyModel[28] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 218
        bodyModel[29] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 219
        bodyModel[30] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 220
        bodyModel[31] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 221
        bodyModel[32] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 226
        bodyModel[33] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 227
        bodyModel[34] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 228
        bodyModel[35] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 229
        bodyModel[36] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 231
        bodyModel[37] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 232
        bodyModel[38] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 233
        bodyModel[39] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 234
        bodyModel[40] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 235
        bodyModel[41] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 236
        bodyModel[42] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 237
        bodyModel[43] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 238
        bodyModel[44] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 239
        bodyModel[45] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 243
        bodyModel[46] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 244
        bodyModel[47] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 245
        bodyModel[48] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 246
        bodyModel[49] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 259
        bodyModel[50] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 260
        bodyModel[51] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 261
        bodyModel[52] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 262
        bodyModel[53] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 264
        bodyModel[54] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 265
        bodyModel[55] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 266
        bodyModel[56] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 267
        bodyModel[57] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 269
        bodyModel[58] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 270
        bodyModel[59] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 271
        bodyModel[60] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 272
        bodyModel[61] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 281
        bodyModel[62] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 282
        bodyModel[63] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 283
        bodyModel[64] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 284
        bodyModel[65] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 285
        bodyModel[66] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 286
        bodyModel[67] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 287
        bodyModel[68] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 288
        bodyModel[69] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 289
        bodyModel[70] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 290
        bodyModel[71] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 291
        bodyModel[72] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 292
        bodyModel[73] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 293
        bodyModel[74] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 294
        bodyModel[75] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 298
        bodyModel[76] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 299
        bodyModel[77] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 300
        bodyModel[78] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 301
        bodyModel[79] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 302
        bodyModel[80] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 303
        bodyModel[81] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 304
        bodyModel[82] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 305
        bodyModel[83] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 306
        bodyModel[84] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 307
        bodyModel[85] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 308
        bodyModel[86] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 309
        bodyModel[87] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 310
        bodyModel[88] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 311
        bodyModel[89] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 312
        bodyModel[90] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 313
        bodyModel[91] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 314
        bodyModel[92] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 315
        bodyModel[93] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 320
        bodyModel[94] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 321
        bodyModel[95] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 322
        bodyModel[96] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 323
        bodyModel[97] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 326
        bodyModel[98] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 327
        bodyModel[99] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 338
        bodyModel[100] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 339
        bodyModel[101] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 32
        bodyModel[102] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 33
        bodyModel[103] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 34
        bodyModel[104] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 346
        bodyModel[105] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 172
        bodyModel[106] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 173
        bodyModel[107] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 174
        bodyModel[108] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 175
        bodyModel[109] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 176
        bodyModel[110] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 177
        bodyModel[111] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 178
        bodyModel[112] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 179
        bodyModel[113] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 180
        bodyModel[114] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 181
        bodyModel[115] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 182
        bodyModel[116] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 183
        bodyModel[117] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 184
        bodyModel[118] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 176
        bodyModel[119] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 177
        bodyModel[120] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 178
        bodyModel[121] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 179
        bodyModel[122] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 180
        bodyModel[123] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 181
        bodyModel[124] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 160
        bodyModel[125] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 161
        bodyModel[126] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 162
        bodyModel[127] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 163
        bodyModel[128] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 164
        bodyModel[129] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 165
        bodyModel[130] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 166
        bodyModel[131] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 167
        bodyModel[132] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 168
        bodyModel[133] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 169
        bodyModel[134] = new ModelRendererTurbo(this, 200, 87, textureX, textureY); // Box 170
        bodyModel[135] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 135
        bodyModel[136] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 136
        bodyModel[137] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 183
        bodyModel[138] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 184
        bodyModel[139] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 185
        bodyModel[140] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 186
        bodyModel[141] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 187
        bodyModel[142] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 188
        bodyModel[143] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 189
        bodyModel[144] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 190

        bodyModel[0].addShapeBox(0F, 0F, 0F, 68, 1, 19, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 44
        bodyModel[0].setRotationPoint(-34F, 0F, -9.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 21, 16, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 74
        bodyModel[1].setRotationPoint(-9F, -16F, 8.5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 7
        bodyModel[2].setRotationPoint(17F, -16F, 8.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 9
        bodyModel[3].setRotationPoint(22F, -16F, 8.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 65, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[4].setRotationPoint(-31F, -19F, 7.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 65, 3, 2, 0F,0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
        bodyModel[5].setRotationPoint(-31F, -19F, -9.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 153
        bodyModel[6].setRotationPoint(-32F, 0F, -3F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F); // Box 155
        bodyModel[7].setRotationPoint(-33F, 0F, -3F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 65, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[8].setRotationPoint(-31F, -18F, 6.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 65, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 159
        bodyModel[9].setRotationPoint(-31F, -18F, -7.5F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 65, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[10].setRotationPoint(-31F, -19F, -7.5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 65, 1, 15, 0F,-0.2F, -0.8F, -4F, 0F, -0.8F, -4F, 0F, -0.8F, -4F, -0.2F, -0.8F, -4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 162
        bodyModel[11].setRotationPoint(-31F, -20F, -7.5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 67, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 166
        bodyModel[12].setRotationPoint(-33F, 1F, -9.5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 67, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 167
        bodyModel[13].setRotationPoint(-33F, 1F, 8.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 179
        bodyModel[14].setRotationPoint(-20.5F, -9F, -7.5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 186
        bodyModel[15].setRotationPoint(-21F, -8F, -8.5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
        bodyModel[16].setRotationPoint(-23F, -4F, -8.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
        bodyModel[17].setRotationPoint(-21F, -8F, -5.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
        bodyModel[18].setRotationPoint(-23F, -4F, -0.5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
        bodyModel[19].setRotationPoint(-23F, -4F, 4.5F);

        bodyModel[20].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 206
        bodyModel[20].setRotationPoint(-20F, -9F, -8.5F);

        bodyModel[21].addBox(0F, 0F, 0F, 1, 9, 9, 0F); // Box 207
        bodyModel[21].setRotationPoint(-20F, -9F, -0.5F);

        bodyModel[22].addBox(0F, 0F, 0F, 1, 9, 9, 0F); // Box 208
        bodyModel[22].setRotationPoint(-9F, -9F, -0.5F);

        bodyModel[23].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 209
        bodyModel[23].setRotationPoint(-9F, -9F, -8.5F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 210
        bodyModel[24].setRotationPoint(-8F, -9F, 0.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 211
        bodyModel[25].setRotationPoint(-8F, -8F, -0.5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
        bodyModel[26].setRotationPoint(-8F, -8F, 2.5F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
        bodyModel[27].setRotationPoint(-8F, -4F, -0.5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 218
        bodyModel[28].setRotationPoint(-8F, -9F, 5.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
        bodyModel[29].setRotationPoint(-8F, -4F, 4.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
        bodyModel[30].setRotationPoint(-8F, -8F, 7.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 221
        bodyModel[31].setRotationPoint(-8F, -8F, 4.5F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
        bodyModel[32].setRotationPoint(-8F, -4F, -8.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 227
        bodyModel[33].setRotationPoint(-8F, -8F, -8.5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
        bodyModel[34].setRotationPoint(-8F, -8F, -5.5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 229
        bodyModel[35].setRotationPoint(-8F, -9F, -7.5F);

        bodyModel[36].addBox(0F, 0F, 0F, 1, 9, 9, 0F); // Box 231
        bodyModel[36].setRotationPoint(11F, -9F, -0.5F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
        bodyModel[37].setRotationPoint(-2F, -4F, -0.5F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
        bodyModel[38].setRotationPoint(2F, -4F, -0.5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
        bodyModel[39].setRotationPoint(8F, -4F, -0.5F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 235
        bodyModel[40].setRotationPoint(2F, -9F, 0.5F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 236
        bodyModel[41].setRotationPoint(0.5F, -9F, 0.5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
        bodyModel[42].setRotationPoint(0F, -8F, 2.5F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
        bodyModel[43].setRotationPoint(10F, -8F, 2.5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
        bodyModel[44].setRotationPoint(2F, -8F, 2.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 243
        bodyModel[45].setRotationPoint(10.5F, -9F, 0.5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 244
        bodyModel[46].setRotationPoint(0F, -8F, -0.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 245
        bodyModel[47].setRotationPoint(10F, -8F, -0.5F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 246
        bodyModel[48].setRotationPoint(2F, -8F, -0.5F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
        bodyModel[49].setRotationPoint(2F, -4F, 4.5F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 260
        bodyModel[50].setRotationPoint(2F, -9F, 5.5F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
        bodyModel[51].setRotationPoint(2F, -8F, 7.5F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 262
        bodyModel[52].setRotationPoint(2F, -8F, 4.5F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
        bodyModel[53].setRotationPoint(8F, -4F, 4.5F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 265
        bodyModel[54].setRotationPoint(10.5F, -9F, 5.5F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
        bodyModel[55].setRotationPoint(10F, -8F, 7.5F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 267
        bodyModel[56].setRotationPoint(10F, -8F, 4.5F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        bodyModel[57].setRotationPoint(-2F, -4F, 4.5F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 270
        bodyModel[58].setRotationPoint(0.5F, -9F, 5.5F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
        bodyModel[59].setRotationPoint(0F, -8F, 7.5F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 272
        bodyModel[60].setRotationPoint(0F, -8F, 4.5F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
        bodyModel[61].setRotationPoint(-2F, -4F, -8.5F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 282
        bodyModel[62].setRotationPoint(0F, -8F, -8.5F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
        bodyModel[63].setRotationPoint(0F, -8F, -5.5F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 284
        bodyModel[64].setRotationPoint(0.5F, -9F, -7.5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 285
        bodyModel[65].setRotationPoint(2F, -8F, -8.5F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
        bodyModel[66].setRotationPoint(2F, -8F, -5.5F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
        bodyModel[67].setRotationPoint(2F, -4F, -8.5F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 288
        bodyModel[68].setRotationPoint(2F, -9F, -7.5F);

        bodyModel[69].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 289
        bodyModel[69].setRotationPoint(11F, -9F, -8.5F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
        bodyModel[70].setRotationPoint(8F, -4F, -8.5F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 291
        bodyModel[71].setRotationPoint(10F, -8F, -8.5F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
        bodyModel[72].setRotationPoint(10F, -8F, -5.5F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 293
        bodyModel[73].setRotationPoint(10.5F, -9F, -7.5F);

        bodyModel[74].addBox(0F, 0F, 0F, 1, 9, 9, 0F); // Box 294
        bodyModel[74].setRotationPoint(22F, -9F, -0.5F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 21, 16, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 298
        bodyModel[75].setRotationPoint(-9F, -16F, -9.5F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 299
        bodyModel[76].setRotationPoint(23F, -9F, 0.5F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 300
        bodyModel[77].setRotationPoint(23F, -8F, -0.5F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
        bodyModel[78].setRotationPoint(23F, -4F, -0.5F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
        bodyModel[79].setRotationPoint(23F, -8F, 2.5F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 303
        bodyModel[80].setRotationPoint(23F, -9F, 5.5F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 304
        bodyModel[81].setRotationPoint(23F, -8F, 4.5F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
        bodyModel[82].setRotationPoint(23F, -8F, 7.5F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
        bodyModel[83].setRotationPoint(23F, -4F, 4.5F);

        bodyModel[84].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 307
        bodyModel[84].setRotationPoint(22F, -9F, -8.5F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 308
        bodyModel[85].setRotationPoint(23F, -8F, -8.5F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
        bodyModel[86].setRotationPoint(23F, -8F, -5.5F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 310
        bodyModel[87].setRotationPoint(23F, -9F, -7.5F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
        bodyModel[88].setRotationPoint(23F, -4F, -8.5F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 312
        bodyModel[89].setRotationPoint(32.5F, -9F, -7.5F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
        bodyModel[90].setRotationPoint(30F, -4F, -8.5F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
        bodyModel[91].setRotationPoint(32F, -8F, -5.5F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 315
        bodyModel[92].setRotationPoint(32F, -8F, -8.5F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
        bodyModel[93].setRotationPoint(30F, -4F, 4.5F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
        bodyModel[94].setRotationPoint(32F, -8F, 7.5F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
        bodyModel[95].setRotationPoint(32.5F, -9F, 5.5F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 323
        bodyModel[96].setRotationPoint(32F, -8F, 4.5F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 326
        bodyModel[97].setRotationPoint(22F, -16F, -9.5F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 18, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
        bodyModel[98].setRotationPoint(33F, -18F, -8.5F);

        bodyModel[99].addBox(0F, 0F, 0F, 12, 5, 8, 0F); // Box 338
        bodyModel[99].setRotationPoint(-2F, 1F, 0.5F);

        bodyModel[100].addBox(0F, 0F, 0F, 12, 4, 8, 0F); // Box 339
        bodyModel[100].setRotationPoint(-8F, 1F, -8.5F);

        bodyModel[101].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 32
        bodyModel[101].setRotationPoint(-32F, 1F, -1F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[102].setRotationPoint(-33F, 1F, -2F);

        bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
        bodyModel[103].setRotationPoint(-33F, 3F, 2F);

        bodyModel[104].addBox(0F, 0F, 0F, 4, 5, 8, 0F); // Box 346
        bodyModel[104].setRotationPoint(5F, 1F, -8.5F);

        bodyModel[105].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 172
        bodyModel[105].setRotationPoint(34F, -16F, 3.5F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,-1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 173
        bodyModel[106].setRotationPoint(12F, -16F, 8.5F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 174
        bodyModel[107].setRotationPoint(-14F, -16F, 8.5F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,-1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 175
        bodyModel[108].setRotationPoint(-19F, -16F, 8.5F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,-1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 176
        bodyModel[109].setRotationPoint(-19F, -16F, -9.5F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 177
        bodyModel[110].setRotationPoint(-14F, -16F, -9.5F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,-1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 178
        bodyModel[111].setRotationPoint(12F, -16F, -9.5F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 179
        bodyModel[112].setRotationPoint(17F, -16F, -9.5F);

        bodyModel[113].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 180
        bodyModel[113].setRotationPoint(34F, -16F, -4.5F);

        bodyModel[114].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 181
        bodyModel[114].setRotationPoint(28F, 1F, -1F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 182
        bodyModel[115].setRotationPoint(34F, 1F, -2F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 183
        bodyModel[116].setRotationPoint(34F, -1F, -3F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, -0.8F, 0F); // Box 184
        bodyModel[117].setRotationPoint(35F, -1F, -3F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 176
        bodyModel[118].setRotationPoint(-20.5F, -9F, 0.5F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 177
        bodyModel[119].setRotationPoint(-21F, -8F, -0.5F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        bodyModel[120].setRotationPoint(-21F, -8F, 2.5F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 179
        bodyModel[121].setRotationPoint(-20.5F, -9F, 5.5F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
        bodyModel[122].setRotationPoint(-21F, -8F, 7.5F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 181
        bodyModel[123].setRotationPoint(-21F, -8F, 4.5F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 160
        bodyModel[124].setRotationPoint(-31F, -16F, 8.5F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[125].setRotationPoint(-31F, -16F, -9.5F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
        bodyModel[126].setRotationPoint(-30F, -4F, 4.5F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 163
        bodyModel[127].setRotationPoint(-30F, -9F, 5.5F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
        bodyModel[128].setRotationPoint(-30F, -8F, 7.5F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 165
        bodyModel[129].setRotationPoint(-30F, -8F, 4.5F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 166
        bodyModel[130].setRotationPoint(-30F, -9F, -7.5F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
        bodyModel[131].setRotationPoint(-30F, -4F, -8.5F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 168
        bodyModel[132].setRotationPoint(-30F, -8F, -8.5F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
        bodyModel[133].setRotationPoint(-30F, -8F, -5.5F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 18, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        bodyModel[134].setRotationPoint(-31F, -18F, -8.5F);

        bodyModel[135].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 135
        bodyModel[135].setRotationPoint(-32F, -16F, -4.5F);

        bodyModel[136].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 136
        bodyModel[136].setRotationPoint(-32F, -16F, 3.5F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 183
        bodyModel[137].setRotationPoint(-10.6F, -1F, -9.45F);
        bodyModel[137].rotateAngleX = 1.57079633F;

        bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 184
        bodyModel[138].setRotationPoint(-10.6F, -1F, 9.25F);
        bodyModel[138].rotateAngleX = 1.57079633F;

        bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 185
        bodyModel[139].setRotationPoint(20.4F, -1F, 9.25F);
        bodyModel[139].rotateAngleX = 1.57079633F;

        bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 186
        bodyModel[140].setRotationPoint(20.4F, -1F, -9.45F);
        bodyModel[140].rotateAngleX = 1.57079633F;

        bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 187
        bodyModel[141].setRotationPoint(13.6F, -6F, -9.45F);
        bodyModel[141].rotateAngleX = 1.57079633F;
        bodyModel[141].rotateAngleZ = 3.14159265F;

        bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 188
        bodyModel[142].setRotationPoint(-17.4F, -6F, -9.45F);
        bodyModel[142].rotateAngleX = 1.57079633F;
        bodyModel[142].rotateAngleZ = 3.14159265F;

        bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 189
        bodyModel[143].setRotationPoint(-17.4F, -6F, 9.25F);
        bodyModel[143].rotateAngleX = 1.57079633F;
        bodyModel[143].rotateAngleZ = 3.14159265F;

        bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 190
        bodyModel[144].setRotationPoint(13.6F, -6F, 9.25F);
        bodyModel[144].rotateAngleX = 1.57079633F;
        bodyModel[144].rotateAngleZ = 3.14159265F;

        this.flipAll();
    }
}