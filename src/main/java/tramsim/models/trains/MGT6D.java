package tramsim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class MGT6D extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public MGT6D() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[132];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
        bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
        bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
        bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 6
        bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
        bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
        bodyModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
        bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
        bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 11
        bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
        bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 16
        bodyModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
        bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 19
        bodyModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 20
        bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 24
        bodyModel[16] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 25
        bodyModel[17] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 26
        bodyModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 33
        bodyModel[19] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 36
        bodyModel[20] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 37
        bodyModel[21] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
        bodyModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 41
        bodyModel[23] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 42
        bodyModel[24] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 43
        bodyModel[25] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 44
        bodyModel[26] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 45
        bodyModel[27] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 46
        bodyModel[28] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 47
        bodyModel[29] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 48
        bodyModel[30] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 49
        bodyModel[31] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 50
        bodyModel[32] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 51
        bodyModel[33] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 52
        bodyModel[34] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 53
        bodyModel[35] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 54
        bodyModel[36] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 55
        bodyModel[37] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 56
        bodyModel[38] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 58
        bodyModel[39] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 59
        bodyModel[40] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 60
        bodyModel[41] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 61
        bodyModel[42] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 62
        bodyModel[43] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 63
        bodyModel[44] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 64
        bodyModel[45] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 65
        bodyModel[46] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 66
        bodyModel[47] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 67
        bodyModel[48] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 69
        bodyModel[49] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 70
        bodyModel[50] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 71
        bodyModel[51] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 72
        bodyModel[52] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 73
        bodyModel[53] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 74
        bodyModel[54] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 75
        bodyModel[55] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 76
        bodyModel[56] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 77
        bodyModel[57] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 78
        bodyModel[58] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 79
        bodyModel[59] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 80
        bodyModel[60] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 82
        bodyModel[61] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 84
        bodyModel[62] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 85
        bodyModel[63] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 86
        bodyModel[64] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 87
        bodyModel[65] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 88
        bodyModel[66] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 89
        bodyModel[67] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 90
        bodyModel[68] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 91
        bodyModel[69] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 92
        bodyModel[70] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 93
        bodyModel[71] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 94
        bodyModel[72] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 95
        bodyModel[73] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 97
        bodyModel[74] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 98
        bodyModel[75] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 99
        bodyModel[76] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 100
        bodyModel[77] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 102
        bodyModel[78] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 103
        bodyModel[79] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 107
        bodyModel[80] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 108
        bodyModel[81] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 109
        bodyModel[82] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 110
        bodyModel[83] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 112
        bodyModel[84] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 113
        bodyModel[85] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 114
        bodyModel[86] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 115
        bodyModel[87] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 98
        bodyModel[88] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 99
        bodyModel[89] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 100
        bodyModel[90] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 101
        bodyModel[91] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 102
        bodyModel[92] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 105
        bodyModel[93] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 106
        bodyModel[94] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 107
        bodyModel[95] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 146
        bodyModel[96] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 109
        bodyModel[97] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 110
        bodyModel[98] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 114
        bodyModel[99] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 112
        bodyModel[100] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 113
        bodyModel[101] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 114
        bodyModel[102] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 115
        bodyModel[103] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 116
        bodyModel[104] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 117
        bodyModel[105] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 118
        bodyModel[106] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 119
        bodyModel[107] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 120
        bodyModel[108] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 121
        bodyModel[109] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 122
        bodyModel[110] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 123
        bodyModel[111] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 115
        bodyModel[112] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 116
        bodyModel[113] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 117
        bodyModel[114] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 118
        bodyModel[115] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 115
        bodyModel[116] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 116
        bodyModel[117] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 117
        bodyModel[118] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 118
        bodyModel[119] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 119
        bodyModel[120] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 120
        bodyModel[121] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 121
        bodyModel[122] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 122
        bodyModel[123] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 123
        bodyModel[124] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 124
        bodyModel[125] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 125
        bodyModel[126] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 126
        bodyModel[127] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 127
        bodyModel[128] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 128
        bodyModel[129] = new ModelRendererTurbo(this, 0, 58, textureX, textureY); // Box 129
        bodyModel[130] = new ModelRendererTurbo(this, 18, 55, textureX, textureY); // Box 130
        bodyModel[131] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 131

        bodyModel[0].addBox(0F, 0F, 0F, 20, 8, 1, 0F); // Box 2
        bodyModel[0].setRotationPoint(-16F, -1F, -9F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 3
        bodyModel[1].setRotationPoint(-26F, 4F, -7F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 4
        bodyModel[2].setRotationPoint(-26F, -1F, -6.5F);

        bodyModel[3].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 5
        bodyModel[3].setRotationPoint(-27F, -1F, -3F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 6
        bodyModel[4].setRotationPoint(-27F, 0F, 3F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F); // Box 7
        bodyModel[5].setRotationPoint(-27F, -1F, 3F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        bodyModel[6].setRotationPoint(-27F, 0F, -6F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 9
        bodyModel[7].setRotationPoint(-27F, -1F, -6F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.8F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.8F, 1F, 0F, -0.2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, 1F); // Box 10
        bodyModel[8].setRotationPoint(-27F, 2.5F, -2F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 11
        bodyModel[9].setRotationPoint(-26F, -1F, -7F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 1.9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 15
        bodyModel[10].setRotationPoint(-26F, -5F, -7F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 16
        bodyModel[11].setRotationPoint(-26F, -5F, -6.5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-0.33F, 0F, -0.5F, 0F, 0F, 1.81F, 0F, 0F, -2F, -0.33F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.9F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 17
        bodyModel[12].setRotationPoint(-26F, -9F, -7F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,-0.33F, 0F, 0F, 0.33F, 0F, 0.2F, 0.33F, 0F, 0.2F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 19
        bodyModel[13].setRotationPoint(-26.01F, -9F, -6.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,-0.75F, 0F, 0F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 20
        bodyModel[14].setRotationPoint(-25.68F, -13F, -6.5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-1.05F, 0F, -0.5F, 0F, 0F, 1.69F, 0F, 0F, -2F, -1.05F, 0F, 0F, -0.33F, 0F, -0.5F, 0F, 0F, 1.81F, 0F, 0F, -2F, -0.33F, 0F, 0F); // Box 24
        bodyModel[15].setRotationPoint(-26F, -13F, -7F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,-0.7F, 0F, 0F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, -0.7F, 0F, -0.2F, -1.07F, 0F, -0.01F, 0F, 0F, 2.19F, 0F, 0F, 2.19F, -1.07F, 0F, -0.01F); // Box 25
        bodyModel[16].setRotationPoint(-26F, -17F, -6.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[17].setRotationPoint(-16F, -17F, -9F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-1.05F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.69F, -1.05F, 0F, -0.5F, -0.33F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.81F, -0.33F, 0F, -0.5F); // Box 33
        bodyModel[18].setRotationPoint(-26F, -13F, 6F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
        bodyModel[19].setRotationPoint(-16F, -17F, 8F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, 0.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.25F); // Box 37
        bodyModel[20].setRotationPoint(-25F, 3F, -6F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 38
        bodyModel[21].setRotationPoint(-25F, -2F, -4F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
        bodyModel[22].setRotationPoint(-25F, -2F, -6F);

        bodyModel[23].addBox(0F, 0F, 0F, 20, 1, 16, 0F); // Box 42
        bodyModel[23].setRotationPoint(-16F, 3F, -8F);

        bodyModel[24].addBox(0F, 0F, 0F, 20, 8, 1, 0F); // Box 43
        bodyModel[24].setRotationPoint(-16F, -1F, 8F);

        bodyModel[25].addBox(0F, 0F, 0F, 1, 3, 16, 0F); // Box 44
        bodyModel[25].setRotationPoint(3F, 4F, -8F);

        bodyModel[26].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 45
        bodyModel[26].setRotationPoint(3F, 5F, -8F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        bodyModel[27].setRotationPoint(4F, 5F, -9F);

        bodyModel[28].addBox(0F, 0F, 0F, 15, 2, 16, 0F); // Box 47
        bodyModel[28].setRotationPoint(14F, 5F, -8F);

        bodyModel[29].addBox(0F, 0F, 0F, 15, 8, 1, 0F); // Box 48
        bodyModel[29].setRotationPoint(14F, -1F, -9F);

        bodyModel[30].addBox(0F, 0F, 0F, 15, 8, 1, 0F); // Box 49
        bodyModel[30].setRotationPoint(14F, -1F, 8F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 15, 16, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[31].setRotationPoint(14F, -17F, -9F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 45, 4, 2, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 51
        bodyModel[32].setRotationPoint(-16F, -17F, -9F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 15, 16, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        bodyModel[33].setRotationPoint(14F, -17F, 8F);

        bodyModel[34].addBox(0F, 0F, 0F, 45, 1, 16, 0F); // Box 53
        bodyModel[34].setRotationPoint(-16F, -17F, -8F);

        bodyModel[35].addBox(0F, 0F, 0F, 10, 1, 18, 0F); // Box 54
        bodyModel[35].setRotationPoint(4F, 6F, -9F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 45, 4, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 55
        bodyModel[36].setRotationPoint(-16F, -17F, 7F);

        bodyModel[37].addBox(0F, 0F, 0F, 1, 21, 16, 0F); // Box 56
        bodyModel[37].setRotationPoint(-17F, -14F, -8F);

        bodyModel[38].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 58
        bodyModel[38].setRotationPoint(-28F, 5F, -1F);

        bodyModel[39].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 59
        bodyModel[39].setRotationPoint(-30F, 3.5F, -2F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 60
        bodyModel[40].setRotationPoint(3F, -5F, 4F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 61
        bodyModel[41].setRotationPoint(3F, -5F, -8F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 62
        bodyModel[42].setRotationPoint(14F, -3F, -8F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 63
        bodyModel[43].setRotationPoint(14F, -3F, 4F);

        bodyModel[44].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 64
        bodyModel[44].setRotationPoint(-4.5F, 0F, 2F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[45].setRotationPoint(-2F, -4F, -8F);

        bodyModel[46].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 66
        bodyModel[46].setRotationPoint(-4.5F, 0F, -8F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        bodyModel[47].setRotationPoint(-2F, -4F, 2F);

        bodyModel[48].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 69
        bodyModel[48].setRotationPoint(-13.5F, 0F, -8F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
        bodyModel[49].setRotationPoint(-11F, -4F, -8F);

        bodyModel[50].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 71
        bodyModel[50].setRotationPoint(-13.5F, 0F, 2F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
        bodyModel[51].setRotationPoint(-11F, -4F, 2F);

        bodyModel[52].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 73
        bodyModel[52].setRotationPoint(-10.5F, -6F, -4F);

        bodyModel[53].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 74
        bodyModel[53].setRotationPoint(-10.5F, -6F, 2F);

        bodyModel[54].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 75
        bodyModel[54].setRotationPoint(-1.5F, -6F, 2F);

        bodyModel[55].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 76
        bodyModel[55].setRotationPoint(-1.5F, -6F, -4F);

        bodyModel[56].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 77
        bodyModel[56].setRotationPoint(17F, 1F, -7.5F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        bodyModel[57].setRotationPoint(20F, -3F, -7.5F);

        bodyModel[58].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 79
        bodyModel[58].setRotationPoint(24F, 1F, -7.5F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        bodyModel[59].setRotationPoint(27F, -3F, -7.5F);

        bodyModel[60].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 82
        bodyModel[60].setRotationPoint(17F, 1F, 5F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        bodyModel[61].setRotationPoint(20F, -3F, 5F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
        bodyModel[62].setRotationPoint(20F, -3F, 1.5F);

        bodyModel[63].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 86
        bodyModel[63].setRotationPoint(17F, 1F, 1.5F);

        bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 87
        bodyModel[64].setRotationPoint(24F, 1F, 5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        bodyModel[65].setRotationPoint(27F, -3F, 5F);

        bodyModel[66].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 89
        bodyModel[66].setRotationPoint(24F, 1F, 1.5F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
        bodyModel[67].setRotationPoint(27F, -3F, 1.5F);

        bodyModel[68].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 91
        bodyModel[68].setRotationPoint(20.5F, -5F, -6.5F);

        bodyModel[69].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 92
        bodyModel[69].setRotationPoint(27.5F, -5F, -6.5F);

        bodyModel[70].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 93
        bodyModel[70].setRotationPoint(27.5F, -5F, 1.5F);

        bodyModel[71].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 94
        bodyModel[71].setRotationPoint(20.5F, -5F, 1.5F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-2F, 0F, -0.8F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, -2F, 0F, -0.1F, 0.3F, 0F, -0.4F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0.3F, 0F, -0.5F); // Box 95
        bodyModel[72].setRotationPoint(-25F, -19F, 5.8F);

        bodyModel[73].addBox(0F, 0F, 0F, 10, 3, 14, 0F); // Box 97
        bodyModel[73].setRotationPoint(-20F, -20F, -7F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0F, 0F, 1.8F); // Box 98
        bodyModel[74].setRotationPoint(-16F, -19F, -11.3F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0F, 0F, 1.8F); // Box 99
        bodyModel[75].setRotationPoint(-16F, -19F, 5.8F);

        bodyModel[76].addBox(0F, 0F, 0F, 10, 2, 14, 0F); // Box 100
        bodyModel[76].setRotationPoint(-10F, -19F, -7F);

        bodyModel[77].addBox(0F, 0F, 0F, 10, 3, 12, 0F); // Box 102
        bodyModel[77].setRotationPoint(0F, -20F, -6F);

        bodyModel[78].addBox(0F, 0F, 0F, 10, 3, 12, 0F); // Box 103
        bodyModel[78].setRotationPoint(11F, -20F, -6F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        bodyModel[79].setRotationPoint(9F, -13F, -9F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[80].setRotationPoint(9F, -13F, 8F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[81].setRotationPoint(4F, -13F, 8F);

        bodyModel[82].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 110
        bodyModel[82].setRotationPoint(4F, -1F, 8F);

        bodyModel[83].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 112
        bodyModel[83].setRotationPoint(29F, -1F, -9F);
        bodyModel[83].rotateAngleY = 0.17453293F;

        bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 18, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[84].setRotationPoint(29F, -19F, -9F);
        bodyModel[84].rotateAngleY = 0.17453293F;

        bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 18, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[85].setRotationPoint(29F, -19F, 9F);
        bodyModel[85].rotateAngleY = -0.17453293F;

        bodyModel[86].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 115
        bodyModel[86].setRotationPoint(29F, -1F, 9F);
        bodyModel[86].rotateAngleY = -0.17453293F;

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
        bodyModel[87].setRotationPoint(28F, -1F, 4F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[88].setRotationPoint(28F, -1F, -7F);

        bodyModel[89].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 100
        bodyModel[89].setRotationPoint(28F, -14F, 7F);

        bodyModel[90].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 101
        bodyModel[90].setRotationPoint(28F, -14F, -8F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        bodyModel[91].setRotationPoint(29F, -17F, -8F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
        bodyModel[92].setRotationPoint(29F, -17F, 8F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
        bodyModel[93].setRotationPoint(29F, -1F, -8F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        bodyModel[94].setRotationPoint(29F, -1F, 5F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 3F, -0.5F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -4F, -0.5F); // Box 146
        bodyModel[95].setRotationPoint(13F, -14F, -3F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
        bodyModel[96].setRotationPoint(16F, -14F, -3F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, -0.5F, 0F, 0F, -0.5F); // Box 110
        bodyModel[97].setRotationPoint(25F, -14F, -3F);

        bodyModel[98].addShapeBox(0F, -9F, 0F, 1, 20, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
        bodyModel[98].setRotationPoint(2.5F, -8F, -4F);

        bodyModel[99].addShapeBox(0F, -9F, 0F, 1, 20, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 112
        bodyModel[99].setRotationPoint(2.5F, -8F, 2.5F);

        bodyModel[100].addShapeBox(0F, -9F, 0F, 1, 22, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 113
        bodyModel[100].setRotationPoint(13.5F, -8F, 2.5F);

        bodyModel[101].addShapeBox(0F, -9F, 0F, 1, 22, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
        bodyModel[101].setRotationPoint(13.5F, -8F, -4F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-2F, 0F, -0.1F, 0F, 0F, 1.8F, 0F, 0F, -2.7F, -2F, 0F, -0.8F, 0.3F, 0F, -0.5F, 0F, 0F, 1.8F, 0F, 0F, -2.7F, 0.3F, 0F, -0.4F); // Box 115
        bodyModel[102].setRotationPoint(-25F, -19F, -7F);
        bodyModel[102].rotateAngleY = 0.02181662F;

        bodyModel[103].addBox(0F, -1F, 0F, 0, 1, 6, 0F); // Box 116
        bodyModel[103].setRotationPoint(-25.25F, -17F, -6.5F);
        bodyModel[103].rotateAngleZ = -0.78539816F;

        bodyModel[104].addShapeBox(0F, -1F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        bodyModel[104].setRotationPoint(-25.25F, -17F, 0.199999999999999F);
        bodyModel[104].rotateAngleZ = -0.78539816F;

        bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 118
        bodyModel[105].setRotationPoint(-25.2F, -18F, -0.65F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-0.33F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.81F, -0.33F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.9F, 0F, 0F, -0.5F); // Box 119
        bodyModel[106].setRotationPoint(-26F, -9F, 6F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.9F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F); // Box 120
        bodyModel[107].setRotationPoint(-26F, -5F, 6F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F); // Box 121
        bodyModel[108].setRotationPoint(-26F, -1F, 6F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F); // Box 122
        bodyModel[109].setRotationPoint(-26F, 4F, 6F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 123
        bodyModel[110].setRotationPoint(-27F, 4F, -6.5F);

        bodyModel[111].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 115
        bodyModel[111].setRotationPoint(9F, -1F, 8F);

        bodyModel[112].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 116
        bodyModel[112].setRotationPoint(4F, -1F, -9F);

        bodyModel[113].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 117
        bodyModel[113].setRotationPoint(9F, -1F, -9F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        bodyModel[114].setRotationPoint(4F, -13F, -9F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.9F, 0F, 0F); // Box 115
        bodyModel[115].setRotationPoint(-28F, -1F, 3F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1.9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -1.9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 116
        bodyModel[116].setRotationPoint(-28F, -1F, -6F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        bodyModel[117].setRotationPoint(-6.5F, -13F, -9F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        bodyModel[118].setRotationPoint(3F, -13F, -9F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        bodyModel[119].setRotationPoint(14F, -13F, -9F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
        bodyModel[120].setRotationPoint(21F, -13F, -9F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
        bodyModel[121].setRotationPoint(-16F, -13F, -9F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
        bodyModel[122].setRotationPoint(27.5F, -13F, -9F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        bodyModel[123].setRotationPoint(27.5F, -13F, 8F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        bodyModel[124].setRotationPoint(21F, -13F, 8F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
        bodyModel[125].setRotationPoint(14F, -13F, 8F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
        bodyModel[126].setRotationPoint(3F, -13F, 8F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        bodyModel[127].setRotationPoint(-6.5F, -13F, 8F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[128].setRotationPoint(-16F, -13F, 8F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 129
        bodyModel[129].setRotationPoint(8F, -16F, -3F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 130
        bodyModel[130].setRotationPoint(4F, -16F, -8F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[131].setRotationPoint(4F, -16F, 4F);
        this.flipAll();
    }
}