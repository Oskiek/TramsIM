package tramsim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModeruBeta_Middle extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public ModeruBeta_Middle() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[101];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 205
        bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 207
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 208
        bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 209
        bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 24
        bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 100
        bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 55
        bodyModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 68
        bodyModel[8] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 75
        bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
        bodyModel[10] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 11
        bodyModel[11] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 12
        bodyModel[12] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 13
        bodyModel[13] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 194
        bodyModel[14] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 208
        bodyModel[15] = new ModelRendererTurbo(this, 134, 62, textureX, textureY); // Box 33
        bodyModel[16] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 17
        bodyModel[17] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 18
        bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 19
        bodyModel[19] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 20
        bodyModel[20] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 21
        bodyModel[21] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 22
        bodyModel[22] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 23
        bodyModel[23] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 24
        bodyModel[24] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 25
        bodyModel[25] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 194
        bodyModel[26] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 208
        bodyModel[27] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 33
        bodyModel[28] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 29
        bodyModel[29] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 30
        bodyModel[30] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 31
        bodyModel[31] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 32
        bodyModel[32] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 33
        bodyModel[33] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 34
        bodyModel[34] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 35
        bodyModel[35] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 36
        bodyModel[36] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 37
        bodyModel[37] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 38
        bodyModel[38] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 39
        bodyModel[39] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 41
        bodyModel[40] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 292
        bodyModel[41] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 294
        bodyModel[42] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 42
        bodyModel[43] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 43
        bodyModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
        bodyModel[45] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 45
        bodyModel[46] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 46
        bodyModel[47] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 47
        bodyModel[48] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 48
        bodyModel[49] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 49
        bodyModel[50] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 50
        bodyModel[51] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 51
        bodyModel[52] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 52
        bodyModel[53] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 53
        bodyModel[54] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 54
        bodyModel[55] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 55
        bodyModel[56] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 56
        bodyModel[57] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 57
        bodyModel[58] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 58
        bodyModel[59] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 59
        bodyModel[60] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 60
        bodyModel[61] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 61
        bodyModel[62] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 62
        bodyModel[63] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 63
        bodyModel[64] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 64
        bodyModel[65] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 65
        bodyModel[66] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 66
        bodyModel[67] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 67
        bodyModel[68] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 70
        bodyModel[69] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 71
        bodyModel[70] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 72
        bodyModel[71] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 73
        bodyModel[72] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 74
        bodyModel[73] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 75
        bodyModel[74] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 76
        bodyModel[75] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 77
        bodyModel[76] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 78
        bodyModel[77] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 79
        bodyModel[78] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 80
        bodyModel[79] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 81
        bodyModel[80] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 82
        bodyModel[81] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 83
        bodyModel[82] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 84
        bodyModel[83] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 85
        bodyModel[84] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 86
        bodyModel[85] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 87
        bodyModel[86] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 88
        bodyModel[87] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 89
        bodyModel[88] = new ModelRendererTurbo(this, 134, 62, textureX, textureY); // Box 90
        bodyModel[89] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 91
        bodyModel[90] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 92
        bodyModel[91] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 93
        bodyModel[92] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 94
        bodyModel[93] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 95
        bodyModel[94] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 96
        bodyModel[95] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 97
        bodyModel[96] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 98
        bodyModel[97] = new ModelRendererTurbo(this, 241, 28, textureX, textureY); // Box 97
        bodyModel[98] = new ModelRendererTurbo(this, 241, 28, textureX, textureY); // Box 98
        bodyModel[99] = new ModelRendererTurbo(this, 241, 28, textureX, textureY); // Box 99
        bodyModel[100] = new ModelRendererTurbo(this, 241, 28, textureX, textureY); // Box 100

        bodyModel[0].addBox(0F, 0F, 0F, 3, 18, 2, 0F); // Box 205
        bodyModel[0].setRotationPoint(29F, -15F, 7F);

        bodyModel[1].addBox(0F, 0F, 0F, 3, 18, 2, 0F); // Box 207
        bodyModel[1].setRotationPoint(29F, -15F, -9F);

        bodyModel[2].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 208
        bodyModel[2].setRotationPoint(29F, -15F, -7F);

        bodyModel[3].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 209
        bodyModel[3].setRotationPoint(29F, 2F, -7F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
        bodyModel[4].setRotationPoint(21F, 4F, -10F);

        bodyModel[5].addBox(0F, 0F, 0F, 8, 2, 20, 0F); // Box 100
        bodyModel[5].setRotationPoint(21F, 2F, -10F);

        bodyModel[6].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 55
        bodyModel[6].setRotationPoint(21F, -14F, 9F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 58, 1, 20, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        bodyModel[7].setRotationPoint(-29F, -16F, -10F);

        bodyModel[8].addBox(0F, 0F, 0F, 58, 1, 1, 0F); // Box 75
        bodyModel[8].setRotationPoint(-29F, -15F, -10F);

        bodyModel[9].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 10
        bodyModel[9].setRotationPoint(21F, -14F, -10F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        bodyModel[10].setRotationPoint(6F, 4F, -10F);

        bodyModel[11].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 12
        bodyModel[11].setRotationPoint(6F, 6F, -9F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        bodyModel[12].setRotationPoint(14F, -5F, -10F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
        bodyModel[13].setRotationPoint(23F, -1F, -8F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 208
        bodyModel[14].setRotationPoint(28F, -5F, -7.5F);
        bodyModel[14].rotateAngleY = -3.14159265F;

        bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 33
        bodyModel[15].setRotationPoint(23F, -6F, -8.6F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
        bodyModel[16].setRotationPoint(21F, -15F, 2F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 18
        bodyModel[17].setRotationPoint(21F, -4F, -9F);

        bodyModel[18].addBox(0F, 0F, 0F, 58, 1, 1, 0F); // Box 19
        bodyModel[18].setRotationPoint(-29F, -15F, 9F);

        bodyModel[19].addBox(0F, 0F, 0F, 1, 18, 4, 0F); // Box 20
        bodyModel[19].setRotationPoint(28F, -15F, -9F);

        bodyModel[20].addBox(0F, 0F, 0F, 1, 18, 4, 0F); // Box 21
        bodyModel[20].setRotationPoint(28F, -15F, 5F);

        bodyModel[21].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 22
        bodyModel[21].setRotationPoint(19F, -14F, -10F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
        bodyModel[22].setRotationPoint(6F, 4F, 9F);

        bodyModel[23].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 24
        bodyModel[23].setRotationPoint(6F, -14F, -10F);

        bodyModel[24].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 25
        bodyModel[24].setRotationPoint(9F, -1F, -10F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
        bodyModel[25].setRotationPoint(20F, 3F, -4F);
        bodyModel[25].rotateAngleY = -3.14159265F;

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 208
        bodyModel[26].setRotationPoint(19.5F, -1F, -9F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 33
        bodyModel[27].setRotationPoint(19.6F, -2F, -9F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
        bodyModel[28].setRotationPoint(20F, 3F, 1.5F);
        bodyModel[28].rotateAngleY = -3.14159265F;

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[29].setRotationPoint(19.5F, -1F, -3.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 31
        bodyModel[30].setRotationPoint(19.6F, -2F, -3.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
        bodyModel[31].setRotationPoint(17.5F, 3.5F, -9F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[32].setRotationPoint(14F, -5F, 9F);

        bodyModel[33].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 34
        bodyModel[33].setRotationPoint(19F, -14F, 9F);

        bodyModel[34].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 35
        bodyModel[34].setRotationPoint(6F, -14F, 9F);

        bodyModel[35].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 36
        bodyModel[35].setRotationPoint(9F, -1F, 9F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[36].setRotationPoint(19F, 3F, 2F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
        bodyModel[37].setRotationPoint(17F, 4F, 2F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 39
        bodyModel[38].setRotationPoint(17F, -1F, 2F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 41
        bodyModel[39].setRotationPoint(17F, -1F, 2F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 292
        bodyModel[40].setRotationPoint(-6F, -12F, -9.65F);

        bodyModel[41].addShapeBox(-6F, 0F, 0F, 6, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 294
        bodyModel[41].setRotationPoint(6F, -12F, -9.65F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
        bodyModel[42].setRotationPoint(-6F, -12F, 8.65F);

        bodyModel[43].addShapeBox(-6F, 0F, 0F, 6, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[43].setRotationPoint(6F, -12F, 8.65F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
        bodyModel[44].setRotationPoint(-6F, 6F, -10F);

        bodyModel[45].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 45
        bodyModel[45].setRotationPoint(-6F, -14F, -10F);

        bodyModel[46].addBox(0F, 0F, 0F, 14, 3, 3, 0F); // Box 46
        bodyModel[46].setRotationPoint(-7F, -15F, -9F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
        bodyModel[47].setRotationPoint(6F, -12F, -7F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
        bodyModel[48].setRotationPoint(-6.5F, -12F, -7F);

        bodyModel[49].addBox(0F, 0F, 0F, 14, 3, 3, 0F); // Box 49
        bodyModel[49].setRotationPoint(-7F, -15F, 6F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[50].setRotationPoint(6F, -12F, 6F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[51].setRotationPoint(-6.5F, -12F, 6F);

        bodyModel[52].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 52
        bodyModel[52].setRotationPoint(-6F, -14F, 9F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
        bodyModel[53].setRotationPoint(-19F, -5F, -10F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 54
        bodyModel[54].setRotationPoint(-29F, 4F, -10F);

        bodyModel[55].addBox(0F, 0F, 0F, 8, 2, 20, 0F); // Box 55
        bodyModel[55].setRotationPoint(-29F, 2F, -10F);

        bodyModel[56].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 56
        bodyModel[56].setRotationPoint(-29F, -14F, -10F);

        bodyModel[57].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 57
        bodyModel[57].setRotationPoint(-21F, -14F, -10F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
        bodyModel[58].setRotationPoint(-21F, 4F, -10F);

        bodyModel[59].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 59
        bodyModel[59].setRotationPoint(-14F, -1F, -10F);

        bodyModel[60].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 60
        bodyModel[60].setRotationPoint(-9F, -14F, -10F);

        bodyModel[61].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 61
        bodyModel[61].setRotationPoint(-21F, 6F, -9F);

        bodyModel[62].addBox(0F, 0F, 0F, 3, 18, 1, 0F); // Box 62
        bodyModel[62].setRotationPoint(-9F, -14F, 9F);

        bodyModel[63].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 63
        bodyModel[63].setRotationPoint(-14F, -1F, 9F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 64
        bodyModel[64].setRotationPoint(-21F, 4F, 9F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[65].setRotationPoint(-19F, -5F, 9F);

        bodyModel[66].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 66
        bodyModel[66].setRotationPoint(-21F, -14F, 9F);

        bodyModel[67].addBox(0F, 0F, 0F, 8, 16, 1, 0F); // Box 67
        bodyModel[67].setRotationPoint(-29F, -14F, 9F);

        bodyModel[68].addBox(0F, 0F, 0F, 1, 18, 4, 0F); // Box 70
        bodyModel[68].setRotationPoint(-29F, -15F, -9F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 71
        bodyModel[69].setRotationPoint(-22F, -15F, -3F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
        bodyModel[70].setRotationPoint(-19F, 4F, -9F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        bodyModel[71].setRotationPoint(-21F, 3F, -9F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74
        bodyModel[72].setRotationPoint(-20F, 3F, -1.5F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 75
        bodyModel[73].setRotationPoint(-19.5F, -1F, 3.5F);
        bodyModel[73].rotateAngleY = -3.14159265F;

        bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F); // Box 76
        bodyModel[74].setRotationPoint(-20.6F, -2F, -1.5F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F); // Box 77
        bodyModel[75].setRotationPoint(-20.6F, -2F, 4F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
        bodyModel[76].setRotationPoint(-19.5F, -1F, 9F);
        bodyModel[76].rotateAngleY = -3.14159265F;

        bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
        bodyModel[77].setRotationPoint(-20F, 3F, 4F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 80
        bodyModel[78].setRotationPoint(-18F, -1F, -3F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, -3.5F, 0F); // Box 81
        bodyModel[79].setRotationPoint(-22F, -1F, -3F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 82
        bodyModel[80].setRotationPoint(-22F, -4F, -2F);

        bodyModel[81].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 83
        bodyModel[81].setRotationPoint(-32F, -15F, -7F);

        bodyModel[82].addBox(0F, 0F, 0F, 3, 18, 2, 0F); // Box 84
        bodyModel[82].setRotationPoint(-32F, -15F, 7F);

        bodyModel[83].addBox(0F, 0F, 0F, 1, 18, 4, 0F); // Box 85
        bodyModel[83].setRotationPoint(-29F, -15F, 5F);

        bodyModel[84].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 86
        bodyModel[84].setRotationPoint(-32F, 2F, -7F);

        bodyModel[85].addBox(0F, 0F, 0F, 3, 18, 2, 0F); // Box 87
        bodyModel[85].setRotationPoint(-32F, -15F, -9F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88
        bodyModel[86].setRotationPoint(-28F, -1F, 4F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
        bodyModel[87].setRotationPoint(-28F, -5F, 7.5F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F); // Box 90
        bodyModel[88].setRotationPoint(-28F, -6F, 7.6F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 91
        bodyModel[89].setRotationPoint(9F, -5F, -9.5F);

        bodyModel[90].addBox(0F, 0F, 0F, 10, 9, 0, 0F); // Box 92
        bodyModel[90].setRotationPoint(9F, -14F, -9.5F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 93
        bodyModel[91].setRotationPoint(9F, -5F, 9.5F);

        bodyModel[92].addBox(0F, 0F, 0F, 10, 9, 0, 0F); // Box 94
        bodyModel[92].setRotationPoint(9F, -14F, 9.5F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 95
        bodyModel[93].setRotationPoint(-19F, -5F, -9.5F);

        bodyModel[94].addBox(0F, 0F, 0F, 10, 9, 0, 0F); // Box 96
        bodyModel[94].setRotationPoint(-19F, -14F, -9.5F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 10, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 97
        bodyModel[95].setRotationPoint(-19F, -5F, 9.5F);

        bodyModel[96].addBox(0F, 0F, 0F, 10, 9, 0, 0F); // Box 98
        bodyModel[96].setRotationPoint(-19F, -14F, 9.5F);

        bodyModel[97].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 97
        bodyModel[97].setRotationPoint(-19F, 2F, 9F);

        bodyModel[98].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 98
        bodyModel[98].setRotationPoint(14F, 2F, 9F);

        bodyModel[99].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 99
        bodyModel[99].setRotationPoint(-14F, 2F, -9F);
        bodyModel[99].rotateAngleY = -3.14159265F;

        bodyModel[100].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 100
        bodyModel[100].setRotationPoint(19F, 2F, -9F);
        bodyModel[100].rotateAngleY = -3.14159265F;
        this.flipAll();
    }
}