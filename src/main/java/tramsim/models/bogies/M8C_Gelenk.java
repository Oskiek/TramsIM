package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class M8C_Gelenk extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public M8C_Gelenk() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[87];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 308
        bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 309
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 310
        bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 312
        bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 313
        bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 314
        bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 315
        bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 316
        bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 317
        bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 318
        bodyModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 319
        bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 320
        bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 321
        bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 322
        bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 323
        bodyModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 324
        bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 325
        bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 326
        bodyModel[18] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 327
        bodyModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 328
        bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 329
        bodyModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 330
        bodyModel[22] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 331
        bodyModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 332
        bodyModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 333
        bodyModel[25] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 334
        bodyModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 335
        bodyModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 336
        bodyModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 338
        bodyModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 340
        bodyModel[30] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 341
        bodyModel[31] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 26
        bodyModel[32] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 67
        bodyModel[33] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 68
        bodyModel[34] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 69
        bodyModel[35] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 0
        bodyModel[36] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 1
        bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
        bodyModel[38] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 7
        bodyModel[39] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
        bodyModel[40] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 9
        bodyModel[41] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 15
        bodyModel[42] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 16
        bodyModel[43] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 19
        bodyModel[44] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 21
        bodyModel[45] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 22
        bodyModel[46] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 23
        bodyModel[47] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 24
        bodyModel[48] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 26
        bodyModel[49] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 28
        bodyModel[50] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 29
        bodyModel[51] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 32
        bodyModel[52] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 35
        bodyModel[53] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 36
        bodyModel[54] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 40
        bodyModel[55] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 41
        bodyModel[56] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 42
        bodyModel[57] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 43
        bodyModel[58] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 44
        bodyModel[59] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 45
        bodyModel[60] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 46
        bodyModel[61] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 47
        bodyModel[62] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 48
        bodyModel[63] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 49
        bodyModel[64] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 50
        bodyModel[65] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 51
        bodyModel[66] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 52
        bodyModel[67] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 53
        bodyModel[68] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 53
        bodyModel[69] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 89
        bodyModel[70] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 90
        bodyModel[71] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 91
        bodyModel[72] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 92
        bodyModel[73] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 93
        bodyModel[74] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 94
        bodyModel[75] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 101
        bodyModel[76] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 102
        bodyModel[77] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 103
        bodyModel[78] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 104
        bodyModel[79] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 105
        bodyModel[80] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 106
        bodyModel[81] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 107
        bodyModel[82] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 108
        bodyModel[83] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 109
        bodyModel[84] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 110
        bodyModel[85] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 111
        bodyModel[86] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 112

        bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 308
        bodyModel[0].setRotationPoint(-1F, -3F, 8.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F); // Box 309
        bodyModel[1].setRotationPoint(-1F, 5F, 8.5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 310
        bodyModel[2].setRotationPoint(-1F, -15.5F, 8.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 312
        bodyModel[3].setRotationPoint(-1F, -18.5F, 8F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 313
        bodyModel[4].setRotationPoint(-1F, -18.5F, -9F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 12, 1, 0F,1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 314
        bodyModel[5].setRotationPoint(-1F, -15.5F, -9.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 315
        bodyModel[6].setRotationPoint(-1F, 5F, -9.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 316
        bodyModel[7].setRotationPoint(-1F, -3F, -9.5F);

        bodyModel[8].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 317
        bodyModel[8].setRotationPoint(-1.5F, 4F, -6F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 19, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
        bodyModel[9].setRotationPoint(-1.5F, -14F, -7F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
        bodyModel[10].setRotationPoint(-2.5F, -14F, -7F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
        bodyModel[11].setRotationPoint(1.5F, -14F, -7F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 321
        bodyModel[12].setRotationPoint(-0.5F, -2F, -6F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 322
        bodyModel[13].setRotationPoint(-0.25F, -10F, -6.35F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 323
        bodyModel[14].setRotationPoint(-0.5F, -12F, -6F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 324
        bodyModel[15].setRotationPoint(-0.5F, -2F, 5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 325
        bodyModel[16].setRotationPoint(-0.25F, -10F, 4.65F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        bodyModel[17].setRotationPoint(-0.5F, -12F, 5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 1F, 0F, 2F); // Box 327
        bodyModel[18].setRotationPoint(-1F, -18.5F, -9.5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 19, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        bodyModel[19].setRotationPoint(-1.5F, -14F, 6F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 329
        bodyModel[20].setRotationPoint(1.5F, -14F, 6F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 330
        bodyModel[21].setRotationPoint(-2.5F, -14F, 6F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -2.5F, 0F, 0.25F, -2.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
        bodyModel[22].setRotationPoint(-2.5F, -15.5F, -7F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -2.5F, 0F, 0F, -2.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
        bodyModel[23].setRotationPoint(1.5F, -15.5F, -7F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0.25F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 333
        bodyModel[24].setRotationPoint(-2.5F, -15.5F, 6F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, -2.5F, 0F, 0.25F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 334
        bodyModel[25].setRotationPoint(1.5F, -15.5F, 6F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0.25F, -2.5F, 0F, 0.25F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
        bodyModel[26].setRotationPoint(-1.5F, -15.5F, 6F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, -2.5F, 0F, 0.25F, -2.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
        bodyModel[27].setRotationPoint(-1.5F, -15.5F, -7F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 338
        bodyModel[28].setRotationPoint(-1.5F, -15.75F, -4.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 340
        bodyModel[29].setRotationPoint(-2.5F, -15.75F, -4.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 341
        bodyModel[30].setRotationPoint(1.5F, -15.75F, -4.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F); // Box 26
        bodyModel[31].setRotationPoint(-4.5F, 3.99F, -5.5F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F); // Box 67
        bodyModel[32].setRotationPoint(-4.5F, 3.99F, 0.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0.5F, 0F, 0F, -1.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 68
        bodyModel[33].setRotationPoint(1.5F, 3.99F, -5.5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 69
        bodyModel[34].setRotationPoint(1.5F, 3.99F, 0.5F);

        bodyModel[35].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        bodyModel[35].setRotationPoint(-8F, 5F, -5F);

        bodyModel[36].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
        bodyModel[36].setRotationPoint(2.85F, 5F, -5F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
        bodyModel[37].setRotationPoint(-6F, 7F, -5F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 7
        bodyModel[38].setRotationPoint(-8.2F, 6.15F, -6.5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 8
        bodyModel[39].setRotationPoint(-4.8F, 6.15F, -6.5F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
        bodyModel[40].setRotationPoint(-7.5F, 8.75F, -6.5F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 15
        bodyModel[41].setRotationPoint(6.05F, 6.15F, -6.5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
        bodyModel[42].setRotationPoint(3.35F, 8.75F, -6.5F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
        bodyModel[43].setRotationPoint(4.85F, 7F, -5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 21
        bodyModel[44].setRotationPoint(2.65F, 6.15F, -6.5F);

        bodyModel[45].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 22
        bodyModel[45].setRotationPoint(2.85F, 5F, 5F);

        bodyModel[46].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[46].setRotationPoint(-8F, 5F, 5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 24
        bodyModel[47].setRotationPoint(-4.8F, 6.15F, 5F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 26
        bodyModel[48].setRotationPoint(-6.5F, 6.5F, 4.5F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 28
        bodyModel[49].setRotationPoint(-8.2F, 6.15F, 5F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
        bodyModel[50].setRotationPoint(-7.5F, 8.75F, 5F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 32
        bodyModel[51].setRotationPoint(-4.2F, 8.25F, 5F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 35
        bodyModel[52].setRotationPoint(2.65F, 6.15F, 5F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
        bodyModel[53].setRotationPoint(3.35F, 8.75F, 5F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 40
        bodyModel[54].setRotationPoint(6.05F, 6.15F, 5F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 1, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 41
        bodyModel[55].setRotationPoint(-8.5F, 8.5F, -4.5F);

        bodyModel[56].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 42
        bodyModel[56].setRotationPoint(-8.5F, 5.5F, -5.5F);

        bodyModel[57].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 43
        bodyModel[57].setRotationPoint(-8.5F, 5.5F, 4.5F);

        bodyModel[58].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 44
        bodyModel[58].setRotationPoint(-7F, 6F, -3F);

        bodyModel[59].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 45
        bodyModel[59].setRotationPoint(4F, 6F, -3F);

        bodyModel[60].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 46
        bodyModel[60].setRotationPoint(-4F, 6F, -2F);

        bodyModel[61].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 47
        bodyModel[61].setRotationPoint(-2.5F, 6.5F, -5F);

        bodyModel[62].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 48
        bodyModel[62].setRotationPoint(-2.5F, 6.5F, 4F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 49
        bodyModel[63].setRotationPoint(1F, 6F, -4F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 50
        bodyModel[64].setRotationPoint(-2F, 6F, -4F);

        bodyModel[65].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 51
        bodyModel[65].setRotationPoint(8.5F, 5.5F, -5.5F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 52
        bodyModel[66].setRotationPoint(8.5F, 8.5F, -4.5F);

        bodyModel[67].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 53
        bodyModel[67].setRotationPoint(8.5F, 5.5F, 4.5F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 53
        bodyModel[68].setRotationPoint(-6F, 5F, -2F);

        bodyModel[69].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 89
        bodyModel[69].setRotationPoint(-2.5F, 6.5F, 6F);

        bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 90
        bodyModel[70].setRotationPoint(-2.5F, 7F, 7F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 91
        bodyModel[71].setRotationPoint(4.35F, 6.5F, 4.5F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 92
        bodyModel[72].setRotationPoint(4.35F, 6.5F, -6F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 93
        bodyModel[73].setRotationPoint(-6.5F, 6.5F, -6F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 94
        bodyModel[74].setRotationPoint(-4.2F, 8.25F, -6F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        bodyModel[75].setRotationPoint(1.3F, 7.5F, 6F);

        bodyModel[76].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 102
        bodyModel[76].setRotationPoint(1.3F, 4.5F, 7F);

        bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 103
        bodyModel[77].setRotationPoint(1.3F, 8F, 6.8F);
        bodyModel[77].rotateAngleX = 0.78539816F;

        bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 104
        bodyModel[78].setRotationPoint(-2.7F, 7.5F, -7F);

        bodyModel[79].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 105
        bodyModel[79].setRotationPoint(-2.7F, 4.5F, -8F);

        bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 106
        bodyModel[80].setRotationPoint(-2.7F, 8F, -8.2F);
        bodyModel[80].rotateAngleX = 0.78539816F;

        bodyModel[81].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 107
        bodyModel[81].setRotationPoint(1.5F, 6.5F, -7F);

        bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 108
        bodyModel[82].setRotationPoint(1.5F, 7F, -8F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 109
        bodyModel[83].setRotationPoint(0.5F, 6.5F, -7F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[84].setRotationPoint(2.5F, 6.5F, -7F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[85].setRotationPoint(-1.5F, 6.5F, 6F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 112
        bodyModel[86].setRotationPoint(-3.5F, 6.5F, 6F);
    }
}