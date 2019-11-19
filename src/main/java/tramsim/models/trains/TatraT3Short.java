package tramsim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class TatraT3Short extends ModelBase {

    int textureX = 512;
    int textureY = 512;

    public TatraT3Short() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[111];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 181, 119, textureX, textureY); // Box 18
        bodyModel[1] = new ModelRendererTurbo(this, 192, 101, textureX, textureY); // Box 19
        bodyModel[2] = new ModelRendererTurbo(this, 447, 367, textureX, textureY); // Box 20
        bodyModel[3] = new ModelRendererTurbo(this, 189, 112, textureX, textureY); // Box 21
        bodyModel[4] = new ModelRendererTurbo(this, 208, 112, textureX, textureY); // Box 22
        bodyModel[5] = new ModelRendererTurbo(this, 447, 390, textureX, textureY); // Box 27
        bodyModel[6] = new ModelRendererTurbo(this, 237, 119, textureX, textureY); // Box 29
        bodyModel[7] = new ModelRendererTurbo(this, 245, 112, textureX, textureY); // Box 30
        bodyModel[8] = new ModelRendererTurbo(this, 266, 112, textureX, textureY); // Box 31
        bodyModel[9] = new ModelRendererTurbo(this, 142, 100, textureX, textureY); // Box 32
        bodyModel[10] = new ModelRendererTurbo(this, 148, 94, textureX, textureY); // Box 33
        bodyModel[11] = new ModelRendererTurbo(this, 142, 95, textureX, textureY); // Box 34
        bodyModel[12] = new ModelRendererTurbo(this, 141, 106, textureX, textureY); // Box 35
        bodyModel[13] = new ModelRendererTurbo(this, 250, 102, textureX, textureY); // Box 36
        bodyModel[14] = new ModelRendererTurbo(this, 467, 344, textureX, textureY); // Box 39
        bodyModel[15] = new ModelRendererTurbo(this, 417, 368, textureX, textureY); // Box 40
        bodyModel[16] = new ModelRendererTurbo(this, 83, 261, textureX, textureY); // Box 45
        bodyModel[17] = new ModelRendererTurbo(this, 36, 267, textureX, textureY); // Box 47
        bodyModel[18] = new ModelRendererTurbo(this, 136, 263, textureX, textureY); // Box 48
        bodyModel[19] = new ModelRendererTurbo(this, 127, 263, textureX, textureY); // Box 49
        bodyModel[20] = new ModelRendererTurbo(this, 127, 257, textureX, textureY); // Box 50
        bodyModel[21] = new ModelRendererTurbo(this, 446, 249, textureX, textureY); // Box 53
        bodyModel[22] = new ModelRendererTurbo(this, 282, 175, textureX, textureY); // Box 54
        bodyModel[23] = new ModelRendererTurbo(this, 395, 228, textureX, textureY); // Box 55
        bodyModel[24] = new ModelRendererTurbo(this, 447, 196, textureX, textureY); // Box 56
        bodyModel[25] = new ModelRendererTurbo(this, 441, 220, textureX, textureY); // Box 57
        bodyModel[26] = new ModelRendererTurbo(this, 478, 222, textureX, textureY); // Box 58
        bodyModel[27] = new ModelRendererTurbo(this, 439, 234, textureX, textureY); // Box 59
        bodyModel[28] = new ModelRendererTurbo(this, 439, 241, textureX, textureY); // Box 60
        bodyModel[29] = new ModelRendererTurbo(this, 496, 247, textureX, textureY); // Box 61
        bodyModel[30] = new ModelRendererTurbo(this, 496, 240, textureX, textureY); // Box 62
        bodyModel[31] = new ModelRendererTurbo(this, 403, 258, textureX, textureY); // Box 63
        bodyModel[32] = new ModelRendererTurbo(this, 140, 276, textureX, textureY); // Box 64
        bodyModel[33] = new ModelRendererTurbo(this, 424, 198, textureX, textureY); // Box 65
        bodyModel[34] = new ModelRendererTurbo(this, 82, 267, textureX, textureY); // Box 66
        bodyModel[35] = new ModelRendererTurbo(this, 82, 273, textureX, textureY); // Box 67
        bodyModel[36] = new ModelRendererTurbo(this, 428, 260, textureX, textureY); // Box 68
        bodyModel[37] = new ModelRendererTurbo(this, 429, 253, textureX, textureY); // Box 69
        bodyModel[38] = new ModelRendererTurbo(this, 447, 195, textureX, textureY); // Box 70
        bodyModel[39] = new ModelRendererTurbo(this, 447, 202, textureX, textureY); // Box 71
        bodyModel[40] = new ModelRendererTurbo(this, 133, 171, textureX, textureY); // Box 106
        bodyModel[41] = new ModelRendererTurbo(this, 57, 138, textureX, textureY); // Box 107
        bodyModel[42] = new ModelRendererTurbo(this, 57, 146, textureX, textureY); // Box 109
        bodyModel[43] = new ModelRendererTurbo(this, 207, 135, textureX, textureY); // Box 110
        bodyModel[44] = new ModelRendererTurbo(this, 229, 135, textureX, textureY); // Box 111
        bodyModel[45] = new ModelRendererTurbo(this, 187, 247, textureX, textureY); // Box 112
        bodyModel[46] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 115
        bodyModel[47] = new ModelRendererTurbo(this, 210, 145, textureX, textureY); // Box 116
        bodyModel[48] = new ModelRendererTurbo(this, 227, 168, textureX, textureY); // Box 117
        bodyModel[49] = new ModelRendererTurbo(this, 265, 168, textureX, textureY); // Box 118
        bodyModel[50] = new ModelRendererTurbo(this, 241, 157, textureX, textureY); // Box 119
        bodyModel[51] = new ModelRendererTurbo(this, 271, 135, textureX, textureY); // Box 121
        bodyModel[52] = new ModelRendererTurbo(this, 251, 135, textureX, textureY); // Box 122
        bodyModel[53] = new ModelRendererTurbo(this, 366, 247, textureX, textureY); // Box 123
        bodyModel[54] = new ModelRendererTurbo(this, 191, 145, textureX, textureY); // Box 128
        bodyModel[55] = new ModelRendererTurbo(this, 182, 145, textureX, textureY); // Box 129
        bodyModel[56] = new ModelRendererTurbo(this, 72, 146, textureX, textureY); // Box 130
        bodyModel[57] = new ModelRendererTurbo(this, 72, 138, textureX, textureY); // Box 131
        bodyModel[58] = new ModelRendererTurbo(this, 241, 147, textureX, textureY); // Box 132
        bodyModel[59] = new ModelRendererTurbo(this, 106, 138, textureX, textureY); // Box 133
        bodyModel[60] = new ModelRendererTurbo(this, 91, 138, textureX, textureY); // Box 134
        bodyModel[61] = new ModelRendererTurbo(this, 106, 146, textureX, textureY); // Box 135
        bodyModel[62] = new ModelRendererTurbo(this, 91, 146, textureX, textureY); // Box 136
        bodyModel[63] = new ModelRendererTurbo(this, 229, 158, textureX, textureY); // Box 137
        bodyModel[64] = new ModelRendererTurbo(this, 265, 158, textureX, textureY); // Box 138
        bodyModel[65] = new ModelRendererTurbo(this, 1, 216, textureX, textureY); // Box 139
        bodyModel[66] = new ModelRendererTurbo(this, 12, 215, textureX, textureY); // Box 140
        bodyModel[67] = new ModelRendererTurbo(this, 19, 216, textureX, textureY); // Box 141
        bodyModel[68] = new ModelRendererTurbo(this, 1, 213, textureX, textureY); // Box 142
        bodyModel[69] = new ModelRendererTurbo(this, 12, 211, textureX, textureY); // Box 143
        bodyModel[70] = new ModelRendererTurbo(this, 19, 212, textureX, textureY); // Box 144
        bodyModel[71] = new ModelRendererTurbo(this, 155, 197, textureX, textureY); // Box 135
        bodyModel[72] = new ModelRendererTurbo(this, 373, 218, textureX, textureY); // Box 136
        bodyModel[73] = new ModelRendererTurbo(this, 136, 211, textureX, textureY); // Box 137
        bodyModel[74] = new ModelRendererTurbo(this, 141, 217, textureX, textureY); // Box 138
        bodyModel[75] = new ModelRendererTurbo(this, 140, 201, textureX, textureY); // Box 139
        bodyModel[76] = new ModelRendererTurbo(this, 142, 195, textureX, textureY); // Box 140
        bodyModel[77] = new ModelRendererTurbo(this, 148, 201, textureX, textureY); // Box 141
        bodyModel[78] = new ModelRendererTurbo(this, 132, 201, textureX, textureY); // Box 142
        bodyModel[79] = new ModelRendererTurbo(this, 175, 192, textureX, textureY); // Box 143
        bodyModel[80] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 259
        bodyModel[81] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 261
        bodyModel[82] = new ModelRendererTurbo(this, 472, 150, textureX, textureY); // Box 264
        bodyModel[83] = new ModelRendererTurbo(this, 500, 175, textureX, textureY); // Box 266
        bodyModel[84] = new ModelRendererTurbo(this, 188, 188, textureX, textureY); // Box 249
        bodyModel[85] = new ModelRendererTurbo(this, 177, 175, textureX, textureY); // Box 250
        bodyModel[86] = new ModelRendererTurbo(this, 176, 184, textureX, textureY); // Box 251
        bodyModel[87] = new ModelRendererTurbo(this, 8, 46, textureX, textureY); // Box 244
        bodyModel[88] = new ModelRendererTurbo(this, 13, 46, textureX, textureY); // Lamp1
        bodyModel[89] = new ModelRendererTurbo(this, 13, 49, textureX, textureY); // Box 246
        bodyModel[90] = new ModelRendererTurbo(this, 8, 49, textureX, textureY); // Box 247
        bodyModel[91] = new ModelRendererTurbo(this, 20, 46, textureX, textureY); // Box 248
        bodyModel[92] = new ModelRendererTurbo(this, 25, 46, textureX, textureY); // Lamp2
        bodyModel[93] = new ModelRendererTurbo(this, 20, 49, textureX, textureY); // Box 250
        bodyModel[94] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 251
        bodyModel[95] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 254
        bodyModel[96] = new ModelRendererTurbo(this, 8, 62, textureX, textureY); // Box 255
        bodyModel[97] = new ModelRendererTurbo(this, 13, 54, textureX, textureY); // Box 256
        bodyModel[98] = new ModelRendererTurbo(this, 8, 54, textureX, textureY); // Box 257
        bodyModel[99] = new ModelRendererTurbo(this, 24, 22, textureX, textureY); // Box 261
        bodyModel[100] = new ModelRendererTurbo(this, 43, 28, textureX, textureY); // Box 262
        bodyModel[101] = new ModelRendererTurbo(this, 17, 28, textureX, textureY); // Box 265
        bodyModel[102] = new ModelRendererTurbo(this, 50, 28, textureX, textureY); // Box 266
        bodyModel[103] = new ModelRendererTurbo(this, 10, 28, textureX, textureY); // Box 267
        bodyModel[104] = new ModelRendererTurbo(this, 10, 38, textureX, textureY); // Box 268
        bodyModel[105] = new ModelRendererTurbo(this, 17, 38, textureX, textureY); // Box 269
        bodyModel[106] = new ModelRendererTurbo(this, 24, 32, textureX, textureY); // Box 270
        bodyModel[107] = new ModelRendererTurbo(this, 43, 38, textureX, textureY); // Box 271
        bodyModel[108] = new ModelRendererTurbo(this, 50, 38, textureX, textureY); // Box 272
        bodyModel[109] = new ModelRendererTurbo(this, 192, 101, textureX, textureY); // Box 262
        bodyModel[110] = new ModelRendererTurbo(this, 366, 273, textureX, textureY); // Box 263

        bodyModel[0].addBox(0F, 0F, 0F, 17, 3, 10, 0F); // Box 18
        bodyModel[0].setRotationPoint(0F, 2F, -5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        bodyModel[1].setRotationPoint(0F, 2F, -10F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 11, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 20
        bodyModel[2].setRotationPoint(0F, 5F, -10F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
        bodyModel[3].setRotationPoint(11F, 2F, -8F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 22
        bodyModel[4].setRotationPoint(11F, 2F, 5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 1, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 27
        bodyModel[5].setRotationPoint(-11F, 5F, -10F);

        bodyModel[6].addBox(0F, 0F, 0F, 18, 3, 10, 0F); // Box 29
        bodyModel[6].setRotationPoint(-18F, 2F, -5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 30
        bodyModel[7].setRotationPoint(-18F, 2F, 5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        bodyModel[8].setRotationPoint(-18F, 2F, -8F);

        bodyModel[9].addShapeBox(-11F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 32
        bodyModel[9].setRotationPoint(0F, 2F, 5F);

        bodyModel[10].addShapeBox(-1F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F); // Box 33
        bodyModel[10].setRotationPoint(0F, 2F, 6F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -2.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -2.1F, 0F, 0F, 0F); // Box 34
        bodyModel[11].setRotationPoint(-11F, 2F, 5F);

        bodyModel[12].addShapeBox(-11F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 35
        bodyModel[12].setRotationPoint(0F, 3F, 6F);
        bodyModel[12].rotateAngleY = 0.16144296F;

        bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
        bodyModel[13].setRotationPoint(-11F, 2F, -10F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 39
        bodyModel[14].setRotationPoint(11F, 5F, -8F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 40
        bodyModel[15].setRotationPoint(-12F, 5F, -8F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 45
        bodyModel[16].setRotationPoint(0F, -14F, -10F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 1, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 47
        bodyModel[17].setRotationPoint(-11F, -14F, -10F);

        bodyModel[18].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 48
        bodyModel[18].setRotationPoint(11F, -14F, -5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 49
        bodyModel[19].setRotationPoint(11F, -14F, 5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[20].setRotationPoint(11F, -14F, -8F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 2, 20, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 53
        bodyModel[21].setRotationPoint(-11F, -16F, -10F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 1, 18, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 54
        bodyModel[22].setRotationPoint(-11F, -17F, -9F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 2, 20, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 55
        bodyModel[23].setRotationPoint(0F, -16F, -10F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 56
        bodyModel[24].setRotationPoint(0F, -17F, -9F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        bodyModel[25].setRotationPoint(11F, -16F, -5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
        bodyModel[26].setRotationPoint(11F, -17F, -5F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 59
        bodyModel[27].setRotationPoint(11F, -16F, 5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
        bodyModel[28].setRotationPoint(11F, -16F, -8F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
        bodyModel[29].setRotationPoint(11F, -17F, -7F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 62
        bodyModel[30].setRotationPoint(11F, -17F, 5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[31].setRotationPoint(-17F, -16F, -5F);

        bodyModel[32].addBox(0F, 0F, 2F, 6, 1, 10, 0F); // Box 64
        bodyModel[32].setRotationPoint(-17F, -14F, -7F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[33].setRotationPoint(-16F, -17F, -5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        bodyModel[34].setRotationPoint(-17F, -14F, -8F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 67
        bodyModel[35].setRotationPoint(-17F, -14F, 5F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,-1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        bodyModel[36].setRotationPoint(-17F, -16F, -8F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 69
        bodyModel[37].setRotationPoint(-17F, -16F, 5F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 70
        bodyModel[38].setRotationPoint(-16F, -17F, 5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
        bodyModel[39].setRotationPoint(-16F, -17F, -7F);

        bodyModel[40].addBox(-12F, 0F, 0F, 12, 18, 1, 0F); // Box 106
        bodyModel[40].setRotationPoint(0.5F, -13F, 8.5F);
        bodyModel[40].rotateAngleY = 0.16144296F;

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 107
        bodyModel[41].setRotationPoint(-19F, 2F, 0F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 109
        bodyModel[42].setRotationPoint(-19F, -5F, 0F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 110
        bodyModel[43].setRotationPoint(-18F, -5F, 5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 111
        bodyModel[44].setRotationPoint(-18F, -5F, -8F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 15, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 112
        bodyModel[45].setRotationPoint(-11F, -13F, -10F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 115
        bodyModel[46].setRotationPoint(-12F, -13F, 5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.75F); // Box 116
        bodyModel[47].setRotationPoint(-12F, -13F, -8F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 8, 0, 0F,-2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 117
        bodyModel[48].setRotationPoint(-18F, -13F, 5.5F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 8, 0, 0F,-2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 118
        bodyModel[49].setRotationPoint(-18F, -13F, -5.5F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 8, 11, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 119
        bodyModel[50].setRotationPoint(-19F, -13F, -5.5F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 121
        bodyModel[51].setRotationPoint(11F, -5F, 5F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 122
        bodyModel[52].setRotationPoint(11F, -5F, -8F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 11, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 123
        bodyModel[53].setRotationPoint(0F, -13F, -10F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 128
        bodyModel[54].setRotationPoint(11F, -13F, 5F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -2F); // Box 129
        bodyModel[55].setRotationPoint(11F, -13F, -8F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[56].setRotationPoint(-19F, -5F, -6F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[57].setRotationPoint(-19F, 2F, -6F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 8, 11, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 132
        bodyModel[58].setRotationPoint(18F, -13F, -5.5F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 133
        bodyModel[59].setRotationPoint(17F, 2F, 0F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
        bodyModel[60].setRotationPoint(17F, 2F, -6F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 135
        bodyModel[61].setRotationPoint(17F, -5F, 0F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        bodyModel[62].setRotationPoint(17F, -5F, -6F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 8, 0, 0F,0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 137
        bodyModel[63].setRotationPoint(12F, -13F, -5.5F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 8, 0, 0F,0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 138
        bodyModel[64].setRotationPoint(12F, -13F, 5.5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 139
        bodyModel[65].setRotationPoint(-22F, 3.5F, -0.25F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
        bodyModel[66].setRotationPoint(-23F, 3.25F, -0.75F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 141
        bodyModel[67].setRotationPoint(-24F, 3.5F, -0.75F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 142
        bodyModel[68].setRotationPoint(17F, 3.5F, -0.25F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 143
        bodyModel[69].setRotationPoint(21F, 3.25F, -0.75F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 144
        bodyModel[70].setRotationPoint(22F, 3.5F, 0.25F);

        bodyModel[71].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 135
        bodyModel[71].setRotationPoint(-7F, -13F, -8F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.125F, 0F, 0F, 1.125F, 0F, 0F, 0F); // Box 136
        bodyModel[72].setRotationPoint(-18F, -5F, -5F);

        bodyModel[73].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 137
        bodyModel[73].setRotationPoint(-12F, -1F, -5F);

        bodyModel[74].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 138
        bodyModel[74].setRotationPoint(-11F, 0F, -4F);

        bodyModel[75].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 139
        bodyModel[75].setRotationPoint(-8F, -6F, -5F);

        bodyModel[76].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 140
        bodyModel[76].setRotationPoint(-8F, -8F, -4F);

        bodyModel[77].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 141
        bodyModel[77].setRotationPoint(-11F, -4F, -6F);

        bodyModel[78].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 142
        bodyModel[78].setRotationPoint(-11F, -4F, -1F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 15, 7, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
        bodyModel[79].setRotationPoint(-12F, -13F, 0F);

        bodyModel[80].addShapeBox(0F, 0F, -3F, 1, 5, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 6F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 6F, 6F, 0F, 6F); // Box 259
        bodyModel[80].setRotationPoint(-1F, -27F, -4F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 6F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, -6F, 6F, 0F, -6F); // Box 261
        bodyModel[81].setRotationPoint(-1F, -27F, 6F);

        bodyModel[82].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 264
        bodyModel[82].setRotationPoint(-1F, -29.5F, -8F);

        bodyModel[83].addShapeBox(0F, 0F, 3F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 266
        bodyModel[83].setRotationPoint(-7F, -22F, -4F);

        bodyModel[84].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 249
        bodyModel[84].setRotationPoint(4F, -1F, -8F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
        bodyModel[85].setRotationPoint(7F, -5F, -8F);

        bodyModel[86].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 251
        bodyModel[86].setRotationPoint(4.5F, 0F, -7.5F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
        bodyModel[87].setRotationPoint(-20F, -2F, 3F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp1
        bodyModel[88].setRotationPoint(-20F, -2F, 2F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
        bodyModel[89].setRotationPoint(-20F, -1F, 2F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247
        bodyModel[90].setRotationPoint(-20F, -1F, 3F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
        bodyModel[91].setRotationPoint(-20F, -2F, -3F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp2
        bodyModel[92].setRotationPoint(-20F, -2F, -4F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 250
        bodyModel[93].setRotationPoint(-20F, -1F, -3F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
        bodyModel[94].setRotationPoint(-20F, -1F, -4F);

        bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 254
        bodyModel[95].setRotationPoint(-15F, -2F, -7.85F);

        bodyModel[96].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 255
        bodyModel[96].setRotationPoint(-15F, -2F, 6.85F);

        bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 256
        bodyModel[97].setRotationPoint(13F, -2F, -7.85F);

        bodyModel[98].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 257
        bodyModel[98].setRotationPoint(13F, -2F, 6.85F);

        bodyModel[99].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 261
        bodyModel[99].setRotationPoint(-20F, 1F, -4F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 262
        bodyModel[100].setRotationPoint(-20F, 1F, 4F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
        bodyModel[101].setRotationPoint(-20F, 1F, -6F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 266
        bodyModel[102].setRotationPoint(-19F, 1F, 6F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
        bodyModel[103].setRotationPoint(-19F, 1F, -8F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
        bodyModel[104].setRotationPoint(17F, 1F, -8F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
        bodyModel[105].setRotationPoint(18F, 1F, -6F);

        bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 270
        bodyModel[106].setRotationPoint(18F, 1F, -4F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 271
        bodyModel[107].setRotationPoint(18F, 1F, 4F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 272
        bodyModel[108].setRotationPoint(17F, 1F, 6F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 262
        bodyModel[109].setRotationPoint(0F, 2F, 5F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 11, 15, 5, 0F,0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 263
        bodyModel[110].setRotationPoint(0F, -13F, 5F);
        this.flipAll();
    }
}
