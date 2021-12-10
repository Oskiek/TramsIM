package tramsim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class MGT6D extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public MGT6D() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[136];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
        bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
        bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
        bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 6
        bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
        bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
        bodyModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 11
        bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
        bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 16
        bodyModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
        bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 19
        bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 20
        bodyModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 24
        bodyModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 25
        bodyModel[15] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 26
        bodyModel[16] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 33
        bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 36
        bodyModel[18] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 37
        bodyModel[19] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
        bodyModel[20] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 41
        bodyModel[21] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 42
        bodyModel[22] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 43
        bodyModel[23] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 44
        bodyModel[24] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 45
        bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 46
        bodyModel[26] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 47
        bodyModel[27] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 48
        bodyModel[28] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 49
        bodyModel[29] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 50
        bodyModel[30] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 51
        bodyModel[31] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 52
        bodyModel[32] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 53
        bodyModel[33] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 54
        bodyModel[34] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 55
        bodyModel[35] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 56
        bodyModel[36] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 58
        bodyModel[37] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 59
        bodyModel[38] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 60
        bodyModel[39] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 61
        bodyModel[40] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 62
        bodyModel[41] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 63
        bodyModel[42] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 64
        bodyModel[43] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 65
        bodyModel[44] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 66
        bodyModel[45] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 67
        bodyModel[46] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 69
        bodyModel[47] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 70
        bodyModel[48] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 71
        bodyModel[49] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 72
        bodyModel[50] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 73
        bodyModel[51] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 74
        bodyModel[52] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 75
        bodyModel[53] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 76
        bodyModel[54] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 77
        bodyModel[55] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 78
        bodyModel[56] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 79
        bodyModel[57] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 80
        bodyModel[58] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 82
        bodyModel[59] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 84
        bodyModel[60] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 85
        bodyModel[61] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 86
        bodyModel[62] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 87
        bodyModel[63] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 88
        bodyModel[64] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 89
        bodyModel[65] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 90
        bodyModel[66] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 91
        bodyModel[67] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 92
        bodyModel[68] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 93
        bodyModel[69] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 94
        bodyModel[70] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 95
        bodyModel[71] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 97
        bodyModel[72] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 98
        bodyModel[73] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 99
        bodyModel[74] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 100
        bodyModel[75] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 102
        bodyModel[76] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 103
        bodyModel[77] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 107
        bodyModel[78] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 108
        bodyModel[79] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 109
        bodyModel[80] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 110
        bodyModel[81] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 112
        bodyModel[82] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 113
        bodyModel[83] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 114
        bodyModel[84] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 115
        bodyModel[85] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 98
        bodyModel[86] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 99
        bodyModel[87] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 100
        bodyModel[88] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 101
        bodyModel[89] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 102
        bodyModel[90] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 105
        bodyModel[91] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 106
        bodyModel[92] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 107
        bodyModel[93] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 146
        bodyModel[94] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 109
        bodyModel[95] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 110
        bodyModel[96] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 114
        bodyModel[97] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 112
        bodyModel[98] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 113
        bodyModel[99] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 114
        bodyModel[100] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 116
        bodyModel[101] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 117
        bodyModel[102] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 118
        bodyModel[103] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 119
        bodyModel[104] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 120
        bodyModel[105] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 121
        bodyModel[106] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 122
        bodyModel[107] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 123
        bodyModel[108] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 115
        bodyModel[109] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 116
        bodyModel[110] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 117
        bodyModel[111] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 118
        bodyModel[112] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 115
        bodyModel[113] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 116
        bodyModel[114] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 117
        bodyModel[115] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 118
        bodyModel[116] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 119
        bodyModel[117] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 120
        bodyModel[118] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 121
        bodyModel[119] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 122
        bodyModel[120] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 123
        bodyModel[121] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 124
        bodyModel[122] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 125
        bodyModel[123] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 126
        bodyModel[124] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 127
        bodyModel[125] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 128
        bodyModel[126] = new ModelRendererTurbo(this, 0, 58, textureX, textureY); // Box 129
        bodyModel[127] = new ModelRendererTurbo(this, 18, 55, textureX, textureY); // Box 130
        bodyModel[128] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 131
        bodyModel[129] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 132
        bodyModel[130] = new ModelRendererTurbo(this, 32, 66, textureX, textureY); // Box 133
        bodyModel[131] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 134
        bodyModel[132] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 135
        bodyModel[133] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 136
        bodyModel[134] = new ModelRendererTurbo(this, 140, 10, textureX, textureY); // Box 261
        bodyModel[135] = new ModelRendererTurbo(this, 140, 10, textureX, textureY); // Box 135

        bodyModel[0].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        bodyModel[0].setRotationPoint(-18F, -1F, -9F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 3
        bodyModel[1].setRotationPoint(-28F, 4F, -7F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 4
        bodyModel[2].setRotationPoint(-28F, -1F, -6.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        bodyModel[3].setRotationPoint(-29F, -1F, -3F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0.5F, -1F, -0.8F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 6
        bodyModel[4].setRotationPoint(-29F, 0F, 3F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        bodyModel[5].setRotationPoint(-29F, 0F, -6F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.8F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.8F, 1F, 0F, -0.2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, 1F); // Box 10
        bodyModel[6].setRotationPoint(-29F, 2.5F, -2F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 11
        bodyModel[7].setRotationPoint(-28F, -1F, -7F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 1.9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 15
        bodyModel[8].setRotationPoint(-28F, -5F, -7F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 16
        bodyModel[9].setRotationPoint(-28F, -5F, -6.5F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-0.33F, 0F, -0.5F, 0F, 0F, 1.81F, 0F, 0F, -2F, -0.33F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.9F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 17
        bodyModel[10].setRotationPoint(-28F, -9F, -7F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,-0.33F, 0F, 0F, 0.33F, 0F, 0.2F, 0.33F, 0F, 0.2F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 19
        bodyModel[11].setRotationPoint(-28.01F, -9F, -6.5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,-0.78F, 0F, 0F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, -0.78F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 20
        bodyModel[12].setRotationPoint(-27.68F, -13F, -6.5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-1.1F, 0F, -0.5F, 0F, 0F, 1.69F, 0F, 0F, -2F, -1.1F, 0F, 0F, -0.33F, 0F, -0.5F, 0F, 0F, 1.81F, 0F, 0F, -2F, -0.33F, 0F, 0F); // Box 24
        bodyModel[13].setRotationPoint(-28F, -13F, -7F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,-0.8F, 0F, 0F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, -0.8F, 0F, -0.2F, -1.1F, 0F, -0.01F, 0F, 0F, 2.19F, 0F, 0F, 2.19F, -1.1F, 0F, -0.01F); // Box 25
        bodyModel[14].setRotationPoint(-28F, -17F, -6.5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[15].setRotationPoint(-18F, -17F, -9F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-1.1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.69F, -1.1F, 0F, -0.5F, -0.33F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.81F, -0.33F, 0F, -0.5F); // Box 33
        bodyModel[16].setRotationPoint(-28F, -13F, 6F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
        bodyModel[17].setRotationPoint(-18F, -17F, 8F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, 0.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.25F); // Box 37
        bodyModel[18].setRotationPoint(-27F, 3F, -6F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 38
        bodyModel[19].setRotationPoint(-27F, -2F, -4F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
        bodyModel[20].setRotationPoint(-27F, -2F, -6F);

        bodyModel[21].addBox(0F, 0F, 0F, 20, 1, 16, 0F); // Box 42
        bodyModel[21].setRotationPoint(-18F, 3F, -8F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[22].setRotationPoint(-18F, -1F, 8F);

        bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 44
        bodyModel[23].setRotationPoint(1F, 4F, -8F);

        bodyModel[24].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 45
        bodyModel[24].setRotationPoint(1F, 5F, -8F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        bodyModel[25].setRotationPoint(2F, 5F, -9F);

        bodyModel[26].addBox(0F, 0F, 0F, 15, 2, 16, 0F); // Box 47
        bodyModel[26].setRotationPoint(12F, 5F, -8F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 15, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
        bodyModel[27].setRotationPoint(12F, -1.5F, -9F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 15, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        bodyModel[28].setRotationPoint(12F, -1F, 8F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 16, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[29].setRotationPoint(12F, -17F, -9F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 45, 4, 2, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 51
        bodyModel[30].setRotationPoint(-18F, -17F, -9F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 15, 16, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        bodyModel[31].setRotationPoint(12F, -17F, 8F);

        bodyModel[32].addBox(0F, 0F, 0F, 45, 1, 16, 0F); // Box 53
        bodyModel[32].setRotationPoint(-18F, -17F, -8F);

        bodyModel[33].addBox(0F, 0F, 0F, 10, 1, 18, 0F); // Box 54
        bodyModel[33].setRotationPoint(2F, 6F, -9F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 45, 4, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 55
        bodyModel[34].setRotationPoint(-18F, -17F, 7F);

        bodyModel[35].addBox(0F, 0F, 0F, 1, 21, 16, 0F); // Box 56
        bodyModel[35].setRotationPoint(-19F, -14F, -8F);

        bodyModel[36].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 58
        bodyModel[36].setRotationPoint(-29.5F, 5F, -1F);

        bodyModel[37].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 59
        bodyModel[37].setRotationPoint(-31F, 4F, -2F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 60
        bodyModel[38].setRotationPoint(1F, -5.01F, 3.99F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 61
        bodyModel[39].setRotationPoint(1F, -5.01F, -7.99F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 62
        bodyModel[40].setRotationPoint(12F, -3.01F, -7.99F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 63
        bodyModel[41].setRotationPoint(12F, -3.01F, 3.99F);

        bodyModel[42].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 64
        bodyModel[42].setRotationPoint(-6.5F, 0F, 2F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[43].setRotationPoint(-4F, -4F, -8F);

        bodyModel[44].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 66
        bodyModel[44].setRotationPoint(-6.5F, 0F, -8F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        bodyModel[45].setRotationPoint(-4F, -4F, 2F);

        bodyModel[46].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 69
        bodyModel[46].setRotationPoint(-15.5F, 0F, -8F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
        bodyModel[47].setRotationPoint(-13F, -4F, -8F);

        bodyModel[48].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 71
        bodyModel[48].setRotationPoint(-15.5F, 0F, 2F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
        bodyModel[49].setRotationPoint(-13F, -4F, 2F);

        bodyModel[50].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 73
        bodyModel[50].setRotationPoint(-12.5F, -6F, -4F);

        bodyModel[51].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 74
        bodyModel[51].setRotationPoint(-12.5F, -6F, 2F);

        bodyModel[52].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 75
        bodyModel[52].setRotationPoint(-3.5F, -6F, 2F);

        bodyModel[53].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 76
        bodyModel[53].setRotationPoint(-3.5F, -6F, -4F);

        bodyModel[54].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 77
        bodyModel[54].setRotationPoint(15F, 1F, -7.5F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        bodyModel[55].setRotationPoint(18F, -3F, -7.5F);

        bodyModel[56].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 79
        bodyModel[56].setRotationPoint(22F, 1F, -7.5F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        bodyModel[57].setRotationPoint(25F, -3F, -7.5F);

        bodyModel[58].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 82
        bodyModel[58].setRotationPoint(15F, 1F, 5F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        bodyModel[59].setRotationPoint(18F, -3F, 5F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
        bodyModel[60].setRotationPoint(18F, -3F, 1.5F);

        bodyModel[61].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 86
        bodyModel[61].setRotationPoint(15F, 1F, 1.5F);

        bodyModel[62].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 87
        bodyModel[62].setRotationPoint(22F, 1F, 5F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        bodyModel[63].setRotationPoint(25F, -3F, 5F);

        bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 89
        bodyModel[64].setRotationPoint(22F, 1F, 1.5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
        bodyModel[65].setRotationPoint(25F, -3F, 1.5F);

        bodyModel[66].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 91
        bodyModel[66].setRotationPoint(18.5F, -5F, -6.5F);

        bodyModel[67].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 92
        bodyModel[67].setRotationPoint(25.5F, -5F, -6.5F);

        bodyModel[68].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 93
        bodyModel[68].setRotationPoint(25.5F, -5F, 1.5F);

        bodyModel[69].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 94
        bodyModel[69].setRotationPoint(18.5F, -5F, 1.5F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1.5F, -0.4F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0F, -1.5F, -0.4F, 0.25F, 0F, -0.4F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0.25F, 0F, -0.5F); // Box 95
        bodyModel[70].setRotationPoint(-27F, -19F, 5.8F);

        bodyModel[71].addBox(0F, 0F, 0F, 10, 3, 14, 0F); // Box 97
        bodyModel[71].setRotationPoint(-22F, -20F, -7F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0F, 0F, 1.8F); // Box 98
        bodyModel[72].setRotationPoint(-18F, -19F, -11.3F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 1.8F, 0F, 0F, 1.8F); // Box 99
        bodyModel[73].setRotationPoint(-18F, -19F, 5.8F);

        bodyModel[74].addBox(0F, 0F, 0F, 10, 2, 14, 0F); // Box 100
        bodyModel[74].setRotationPoint(-12F, -19F, -7F);

        bodyModel[75].addBox(0F, 0F, 0F, 10, 3, 12, 0F); // Box 102
        bodyModel[75].setRotationPoint(-2F, -20F, -6F);

        bodyModel[76].addBox(0F, 0F, 0F, 10, 3, 12, 0F); // Box 103
        bodyModel[76].setRotationPoint(9F, -20F, -6F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        bodyModel[77].setRotationPoint(7F, -13F, -9F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[78].setRotationPoint(7F, -13F, 8F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[79].setRotationPoint(2F, -13F, 8F);

        bodyModel[80].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 110
        bodyModel[80].setRotationPoint(2F, -1F, 8F);

        bodyModel[81].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 112
        bodyModel[81].setRotationPoint(27F, -1F, -9F);
        bodyModel[81].rotateAngleY = 0.17453293F;

        bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 18, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[82].setRotationPoint(27F, -19F, -9F);
        bodyModel[82].rotateAngleY = 0.17453293F;

        bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 18, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[83].setRotationPoint(27F, -19F, 9F);
        bodyModel[83].rotateAngleY = -0.17453293F;

        bodyModel[84].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 115
        bodyModel[84].setRotationPoint(27F, -1F, 9F);
        bodyModel[84].rotateAngleY = -0.17453293F;

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
        bodyModel[85].setRotationPoint(26F, -1F, 4F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[86].setRotationPoint(26F, -1F, -7F);

        bodyModel[87].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 100
        bodyModel[87].setRotationPoint(26F, -14F, 7F);

        bodyModel[88].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 101
        bodyModel[88].setRotationPoint(26F, -14F, -8F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        bodyModel[89].setRotationPoint(27F, -17F, -8F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
        bodyModel[90].setRotationPoint(27F, -17F, 8F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
        bodyModel[91].setRotationPoint(27F, -1F, -8F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        bodyModel[92].setRotationPoint(27F, -1F, 5F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 3F, -0.5F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -4F, -0.5F); // Box 146
        bodyModel[93].setRotationPoint(11F, -14F, -3F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
        bodyModel[94].setRotationPoint(14F, -14F, -3F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, -0.5F, 0F, 0F, -0.5F); // Box 110
        bodyModel[95].setRotationPoint(23F, -14F, -3F);

        bodyModel[96].addShapeBox(0F, -9F, 0F, 1, 20, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
        bodyModel[96].setRotationPoint(0.5F, -8F, -4F);

        bodyModel[97].addShapeBox(0F, -9F, 0F, 1, 20, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 112
        bodyModel[97].setRotationPoint(0.5F, -8F, 2.5F);

        bodyModel[98].addShapeBox(0F, -9F, 0F, 1, 22, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 113
        bodyModel[98].setRotationPoint(11.5F, -8F, 2.5F);

        bodyModel[99].addShapeBox(0F, -9F, 0F, 1, 22, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
        bodyModel[99].setRotationPoint(11.5F, -8F, -4F);

        bodyModel[100].addBox(0F, -1F, 0F, 0, 1, 6, 0F); // Box 116
        bodyModel[100].setRotationPoint(-27.25F, -17F, -6.5F);
        bodyModel[100].rotateAngleZ = -0.78539816F;

        bodyModel[101].addShapeBox(0F, -1F, 0F, 0, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        bodyModel[101].setRotationPoint(-27.25F, -17F, 0.199999999999999F);
        bodyModel[101].rotateAngleZ = -0.78539816F;

        bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 118
        bodyModel[102].setRotationPoint(-27.2F, -18F, -0.65F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-0.33F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.81F, -0.33F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.9F, 0F, 0F, -0.5F); // Box 119
        bodyModel[103].setRotationPoint(-28F, -9F, 6F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-0.01F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.9F, 0F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F); // Box 120
        bodyModel[104].setRotationPoint(-28F, -5F, 6F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F); // Box 121
        bodyModel[105].setRotationPoint(-28F, -1F, 6F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.5F); // Box 122
        bodyModel[106].setRotationPoint(-28F, 4F, 6F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 123
        bodyModel[107].setRotationPoint(-29F, 4F, -6.5F);

        bodyModel[108].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 115
        bodyModel[108].setRotationPoint(7F, -1F, 8F);

        bodyModel[109].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 116
        bodyModel[109].setRotationPoint(2F, -1F, -9F);

        bodyModel[110].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 117
        bodyModel[110].setRotationPoint(7F, -1F, -9F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        bodyModel[111].setRotationPoint(2F, -13F, -9F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.9F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0.5F, -1.9F, 0.25F, 0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1.9F, 0F, 0.5F); // Box 115
        bodyModel[112].setRotationPoint(-30F, -1F, 3F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1.9F, 0.25F, 0.5F, 1F, 0.25F, 0.5F, 0F, 0.25F, 0F, -0.9F, 0.25F, 0F, -1.9F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 116
        bodyModel[113].setRotationPoint(-30F, -1F, -6F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        bodyModel[114].setRotationPoint(-8.5F, -13F, -9F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        bodyModel[115].setRotationPoint(1F, -13F, -9F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
        bodyModel[116].setRotationPoint(12F, -13F, -9F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
        bodyModel[117].setRotationPoint(19F, -13F, -9F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
        bodyModel[118].setRotationPoint(-18F, -13F, -9F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 122
        bodyModel[119].setRotationPoint(25.5F, -13F, -9F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        bodyModel[120].setRotationPoint(25.5F, -13F, 8F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        bodyModel[121].setRotationPoint(19F, -13F, 8F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
        bodyModel[122].setRotationPoint(12F, -13F, 8F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
        bodyModel[123].setRotationPoint(1F, -13F, 8F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        bodyModel[124].setRotationPoint(-8.5F, -13F, 8F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[125].setRotationPoint(-18F, -13F, 8F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 129
        bodyModel[126].setRotationPoint(6F, -16F, -3F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 130
        bodyModel[127].setRotationPoint(2F, -16F, -8F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[128].setRotationPoint(2F, -16F, 4F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 132
        bodyModel[129].setRotationPoint(27F, -17F, 7.5F);
        bodyModel[129].rotateAngleX = -1.57079633F;

        bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 133
        bodyModel[130].setRotationPoint(-28F, 4F, -6.5F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0.5F, -1F, -0.8F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 134
        bodyModel[131].setRotationPoint(-29F, -2F, 3F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
        bodyModel[132].setRotationPoint(-29F, -2F, -6F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1.5F, -0.3F, 0F, 0F, 1.8F, 0F, 0F, -2.7F, 0F, -1.5F, -0.4F, 0.25F, 0F, -0.3F, 0F, 0F, 1.8F, 0F, 0F, -2.7F, 0.25F, 0F, -0.4F); // Box 136
        bodyModel[133].setRotationPoint(-27F, -19F, -6.8F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 261
        bodyModel[134].setRotationPoint(27F, 5F, -5.5F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
        bodyModel[135].setRotationPoint(27F, 5F, 3.5F);
        this.flipAll();
    }
}