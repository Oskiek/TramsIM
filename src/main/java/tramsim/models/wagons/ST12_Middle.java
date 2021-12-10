package tramsim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ST12_Middle extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ST12_Middle() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[105];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
        bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
        bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
        bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
        bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 20
        bodyModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 22
        bodyModel[6] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 24
        bodyModel[7] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 27
        bodyModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 29
        bodyModel[9] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 59
        bodyModel[10] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 62
        bodyModel[11] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 88
        bodyModel[12] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 139
        bodyModel[13] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 140
        bodyModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 141
        bodyModel[15] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 142
        bodyModel[16] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 171
        bodyModel[17] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 173
        bodyModel[18] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 175
        bodyModel[19] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 176
        bodyModel[20] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 177
        bodyModel[21] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 187
        bodyModel[22] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 188
        bodyModel[23] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 169
        bodyModel[24] = new ModelRendererTurbo(this, 145, 67, textureX, textureY); // Box 306
        bodyModel[25] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 333
        bodyModel[26] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 334
        bodyModel[27] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 335
        bodyModel[28] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 336
        bodyModel[29] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 337
        bodyModel[30] = new ModelRendererTurbo(this, 127, 85, textureX, textureY); // Box 338
        bodyModel[31] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 358
        bodyModel[32] = new ModelRendererTurbo(this, 126, 79, textureX, textureY); // Box 213
        bodyModel[33] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 215
        bodyModel[34] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 216
        bodyModel[35] = new ModelRendererTurbo(this, 387, 75, textureX, textureY); // Box 199
        bodyModel[36] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 224
        bodyModel[37] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 225
        bodyModel[38] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 227
        bodyModel[39] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 228
        bodyModel[40] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 230
        bodyModel[41] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 231
        bodyModel[42] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 232
        bodyModel[43] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 233
        bodyModel[44] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 234
        bodyModel[45] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 235
        bodyModel[46] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 236
        bodyModel[47] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 237
        bodyModel[48] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 238
        bodyModel[49] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 243
        bodyModel[50] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 244
        bodyModel[51] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 245
        bodyModel[52] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 246
        bodyModel[53] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 247
        bodyModel[54] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 248
        bodyModel[55] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 249
        bodyModel[56] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 250
        bodyModel[57] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 252
        bodyModel[58] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 254
        bodyModel[59] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 255
        bodyModel[60] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 256
        bodyModel[61] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 257
        bodyModel[62] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 258
        bodyModel[63] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 259
        bodyModel[64] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 260
        bodyModel[65] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 261
        bodyModel[66] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 262
        bodyModel[67] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 264
        bodyModel[68] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 266
        bodyModel[69] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 267
        bodyModel[70] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 268
        bodyModel[71] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 272
        bodyModel[72] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 273
        bodyModel[73] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 274
        bodyModel[74] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 276
        bodyModel[75] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 277
        bodyModel[76] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 298
        bodyModel[77] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 299
        bodyModel[78] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 300
        bodyModel[79] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 301
        bodyModel[80] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 245
        bodyModel[81] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 246
        bodyModel[82] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 237
        bodyModel[83] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 238
        bodyModel[84] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 239
        bodyModel[85] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 240
        bodyModel[86] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 241
        bodyModel[87] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 237
        bodyModel[88] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 238
        bodyModel[89] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 239
        bodyModel[90] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 240
        bodyModel[91] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 241
        bodyModel[92] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 242
        bodyModel[93] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 96
        bodyModel[94] = new ModelRendererTurbo(this, 328, 89, textureX, textureY); // Box 97
        bodyModel[95] = new ModelRendererTurbo(this, 97, 22, textureX, textureY); // Box 98
        bodyModel[96] = new ModelRendererTurbo(this, 128, 9, textureX, textureY); // Box 99
        bodyModel[97] = new ModelRendererTurbo(this, 113, 22, textureX, textureY); // Box 100
        bodyModel[98] = new ModelRendererTurbo(this, 345, 95, textureX, textureY); // Box 101
        bodyModel[99] = new ModelRendererTurbo(this, 145, 126, textureX, textureY); // Box 102
        bodyModel[100] = new ModelRendererTurbo(this, 489, 79, textureX, textureY); // Box 103
        bodyModel[101] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 105
        bodyModel[102] = new ModelRendererTurbo(this, 136, 85, textureX, textureY); // Box 106
        bodyModel[103] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 107
        bodyModel[104] = new ModelRendererTurbo(this, 145, 67, textureX, textureY); // Box 105

        bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 4
        bodyModel[0].setRotationPoint(-4.5F, 4F, -8.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 5
        bodyModel[1].setRotationPoint(-4.5F, 6F, 4.5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 6
        bodyModel[2].setRotationPoint(-4.5F, 4F, 3.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        bodyModel[3].setRotationPoint(15.5F, -13F, -10.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 20
        bodyModel[4].setRotationPoint(-20.5F, -14F, 8.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 22
        bodyModel[5].setRotationPoint(-6.5F, -14F, 8.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 24
        bodyModel[6].setRotationPoint(5.5F, -14F, 8.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 27
        bodyModel[7].setRotationPoint(15.5F, -14F, 8.5F);

        bodyModel[8].addBox(0F, 0F, 0F, 14, 9, 1, 0F); // Box 29
        bodyModel[8].setRotationPoint(5.5F, -5F, 8.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 49, 9, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 59
        bodyModel[9].setRotationPoint(-29.5F, -5F, -10.5F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 49, 1, 15, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -9F, 0F, 1F); // Box 62
        bodyModel[10].setRotationPoint(-29.5F, -18.5F, -8F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, -1F, 0F, 0F, 0F); // Box 88
        bodyModel[11].setRotationPoint(17.5F, -13.5F, -9F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 50, 1, 1, 0F,-10F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.2F, -10F, 0F, -0.2F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 139
        bodyModel[12].setRotationPoint(-30.5F, -15.5F, 8F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 47, 2, 2, 0F,-7F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 140
        bodyModel[13].setRotationPoint(-27.5F, -17.5F, 7F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 49, 1, 1, 0F,-9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.25F, -9F, 0F, 0.25F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 141
        bodyModel[14].setRotationPoint(-29.5F, -15.5F, -10F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 49, 2, 2, 0F,-9F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -9F, 0F, -0.75F); // Box 142
        bodyModel[15].setRotationPoint(-29.5F, -17.5F, -10F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, 0F, -1F, 0F, 0F, 0F); // Box 171
        bodyModel[16].setRotationPoint(17.5F, -17.5F, -9F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 1, 16, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 173
        bodyModel[17].setRotationPoint(5.5F, 4F, -8.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, -1.5F, 3.5F, 0F, -1F, 3.5F); // Box 175
        bodyModel[18].setRotationPoint(17.5F, -17.5F, -6F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 3.5F, 1F, -1.5F, 3.5F, 1F, 0F, 1F, 0F, 0F, 0F); // Box 176
        bodyModel[19].setRotationPoint(17.5F, -17.5F, 3F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 177
        bodyModel[20].setRotationPoint(5.5F, 5F, -8.5F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 49, 3, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 187
        bodyModel[21].setRotationPoint(-29.5F, 4F, -10.5F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 26, 3, 1, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, -11F, -0.5F, -0.2F); // Box 188
        bodyModel[22].setRotationPoint(-31.5F, 4F, 8.5F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 169
        bodyModel[23].setRotationPoint(-6.5F, 5F, -8.5F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 306
        bodyModel[24].setRotationPoint(-17.5F, -17.5F, -1.5F);

        bodyModel[25].addShapeBox(0F, 0F, -0.5F, 5, 11, 1, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 333
        bodyModel[25].setRotationPoint(0.5F, -5F, 9.25F);

        bodyModel[26].addShapeBox(0F, 0F, -0.5F, 5, 11, 1, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 334
        bodyModel[26].setRotationPoint(-5F, -5F, 9.25F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 335
        bodyModel[27].setRotationPoint(-6.5F, -14F, -10.5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 336
        bodyModel[28].setRotationPoint(4.5F, -14F, -10.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 337
        bodyModel[29].setRotationPoint(-17.5F, -14F, -10.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 338
        bodyModel[30].setRotationPoint(-20.5F, -14F, -10.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 358
        bodyModel[31].setRotationPoint(5.5F, 4F, 8.5F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 37, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
        bodyModel[32].setRotationPoint(-19.5F, -17.5F, 6.5F);

        bodyModel[33].addShapeBox(0F, 0F, -0.5F, 5, 10, 1, 0F,0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 215
        bodyModel[33].setRotationPoint(-5F, -15F, 9.25F);

        bodyModel[34].addShapeBox(0F, 0F, -0.5F, 5, 10, 1, 0F,0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 216
        bodyModel[34].setRotationPoint(0.5F, -15F, 9.25F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 199
        bodyModel[35].setRotationPoint(-4.5F, 7F, 6.5F);

        bodyModel[36].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 224
        bodyModel[36].setRotationPoint(-9.7F, -0.5F, 4F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -5.5F, -3F, -5F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 225
        bodyModel[37].setRotationPoint(-10F, -0.8F, -1.5F);

        bodyModel[38].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 227
        bodyModel[38].setRotationPoint(13.8F, -0.5F, 4F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -5.5F, -3F, -5F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 228
        bodyModel[39].setRotationPoint(13.5F, -0.8F, -1.5F);

        bodyModel[40].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 230
        bodyModel[40].setRotationPoint(5.9F, -0.5F, 4F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -5.5F, -3F, -5F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 231
        bodyModel[41].setRotationPoint(5.5F, -0.8F, -1.5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 232
        bodyModel[42].setRotationPoint(5.5F, -10.8F, -2F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 233
        bodyModel[43].setRotationPoint(4.9F, -10.8F, -15F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -5.5F, -3F, -5F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 234
        bodyModel[44].setRotationPoint(-7F, -0.8F, -14.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 235
        bodyModel[45].setRotationPoint(-7F, -10.8F, -15F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -5.5F, -3F, -5F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 236
        bodyModel[46].setRotationPoint(1.4F, -0.8F, -14.5F);

        bodyModel[47].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 237
        bodyModel[47].setRotationPoint(1.9F, -0.5F, -10F);

        bodyModel[48].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 238
        bodyModel[48].setRotationPoint(-7F, -0.5F, -10F);

        bodyModel[49].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 243
        bodyModel[49].setRotationPoint(13.7F, -0.5F, -10F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -5.5F, -3F, -5F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 244
        bodyModel[50].setRotationPoint(13.4F, -0.8F, -14.5F);

        bodyModel[51].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 245
        bodyModel[51].setRotationPoint(5.4F, -0.5F, -10F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -5.5F, -3F, -5F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 246
        bodyModel[52].setRotationPoint(5.4F, -0.8F, -14.5F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 247
        bodyModel[53].setRotationPoint(5.4F, -10.8F, -15F);

        bodyModel[54].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 248
        bodyModel[54].setRotationPoint(-10.5F, -0.5F, -10F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -5.5F, -3F, -5F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 249
        bodyModel[55].setRotationPoint(-11F, -0.8F, -14.5F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 250
        bodyModel[56].setRotationPoint(-7.5F, -10.8F, -15F);

        bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 252
        bodyModel[57].setRotationPoint(-0.5F, -17.5F, -4.5F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 254
        bodyModel[58].setRotationPoint(-18.3F, -13.5F, 3.5F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 255
        bodyModel[59].setRotationPoint(-6F, -13.5F, 3.5F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 256
        bodyModel[60].setRotationPoint(6F, -13.5F, 3.5F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 257
        bodyModel[61].setRotationPoint(6F, -17.5F, 2F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 258
        bodyModel[62].setRotationPoint(-6F, -17.5F, 2F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 259
        bodyModel[63].setRotationPoint(-19.3F, -17.5F, 2F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F, -0.6F, 0F, -2.1F, -0.6F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 260
        bodyModel[64].setRotationPoint(6F, -15.5F, 2F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F, -0.6F, 0F, -2.1F, -0.6F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 261
        bodyModel[65].setRotationPoint(-6F, -15.5F, 2F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F, -0.6F, 0F, -2.1F, -0.6F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 262
        bodyModel[66].setRotationPoint(-18.3F, -15.5F, 2F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 264
        bodyModel[67].setRotationPoint(-19F, -16.5F, 2F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 266
        bodyModel[68].setRotationPoint(-7.4F, -17.5F, -5.8F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 267
        bodyModel[69].setRotationPoint(5.4F, -17.5F, -5.8F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 268
        bodyModel[70].setRotationPoint(17.2F, -17.5F, -5.8F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 272
        bodyModel[71].setRotationPoint(-16.5F, -14F, -10.5F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 273
        bodyModel[72].setRotationPoint(5.5F, -14F, -10.5F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 274
        bodyModel[73].setRotationPoint(-5.5F, -14F, -10.5F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 276
        bodyModel[74].setRotationPoint(-16.5F, -14F, 8.5F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 277
        bodyModel[75].setRotationPoint(6.5F, -14F, 8.5F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 2.5F, 1F, 0F, 2.5F, 1F, 1F, 2.5F, -1F, 0F, 2.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0F); // Box 298
        bodyModel[76].setRotationPoint(17.5F, -3F, -9F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -3F, 1F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 299
        bodyModel[77].setRotationPoint(17.5F, -17.5F, 6F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 300
        bodyModel[78].setRotationPoint(17.5F, -13.5F, 6F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 2.5F, 0F, 1F, 2.5F, -1F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 301
        bodyModel[79].setRotationPoint(17.5F, -3F, 6F);

        bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 245
        bodyModel[80].setRotationPoint(-5.5F, 4.5F, 7.5F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 246
        bodyModel[81].setRotationPoint(-5.3F, -14.5F, 7.2F);

        bodyModel[82].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 237
        bodyModel[82].setRotationPoint(4.5F, 4.5F, 7.5F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 238
        bodyModel[83].setRotationPoint(4.7F, -14.5F, 7.2F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 239
        bodyModel[84].setRotationPoint(-6.5F, -10.8F, -2F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 240
        bodyModel[85].setRotationPoint(17F, -10.8F, -2F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 241
        bodyModel[86].setRotationPoint(16.9F, -10.8F, -15F);

        bodyModel[87].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 237
        bodyModel[87].setRotationPoint(-18.4F, -0.5F, -10F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 238
        bodyModel[88].setRotationPoint(-18.5F, -10.8F, -2F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -5.5F, -3F, -5F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 239
        bodyModel[89].setRotationPoint(-18.5F, -0.8F, -1.5F);

        bodyModel[90].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 240
        bodyModel[90].setRotationPoint(-18.4F, -0.5F, 4F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, -5.5F, -3F, -5F, -5.5F, -3F, 0F, 0F, -3F, 0F); // Box 241
        bodyModel[91].setRotationPoint(-18.5F, -0.8F, -14.5F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F,0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 242
        bodyModel[92].setRotationPoint(-18.5F, -10.8F, -15F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, 2.5F, 0F, 1F, 2.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -1F); // Box 96
        bodyModel[93].setRotationPoint(-19.5F, -3F, -9F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, -1F); // Box 97
        bodyModel[94].setRotationPoint(-19.5F, -13.5F, -9F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 3.5F, 1F, -1.5F, 3.5F); // Box 98
        bodyModel[95].setRotationPoint(-19.5F, -17.5F, -6F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 1F, -3F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F, 0F, -1F); // Box 99
        bodyModel[96].setRotationPoint(-19.5F, -17.5F, -9F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, -1.5F, 3.5F, 0F, -1F, 3.5F, 0F, 0F, 0F, 1F, 0F, 1F); // Box 100
        bodyModel[97].setRotationPoint(-19.5F, -17.5F, 3F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,1F, -3F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 101
        bodyModel[98].setRotationPoint(-19.5F, -17.5F, 6F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 102
        bodyModel[99].setRotationPoint(-19.5F, -13.5F, 6F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,1F, 2.5F, -1F, 0F, 2.5F, 0F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 103
        bodyModel[100].setRotationPoint(-19.5F, -3F, 6F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.5F, -0.6F, -0.6F, -0.5F, -0.6F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 105
        bodyModel[101].setRotationPoint(6F, -16.5F, 2F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 14, 9, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 106
        bodyModel[102].setRotationPoint(-20.5F, -5F, 8.5F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 14, 1, 16, 0F,1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 107
        bodyModel[103].setRotationPoint(-19.5F, 4F, -8.5F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Box 105
        bodyModel[104].setRotationPoint(1.5F, -17.5F, -1.5F);
        this.flipAll();
    }
}