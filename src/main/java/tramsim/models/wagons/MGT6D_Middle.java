package tramsim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class MGT6D_Middle extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public MGT6D_Middle() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[127];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
        bodyModel[1] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 26
        bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 36
        bodyModel[3] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 43
        bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 46
        bodyModel[5] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 51
        bodyModel[6] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 53
        bodyModel[7] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 54
        bodyModel[8] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 55
        bodyModel[9] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 60
        bodyModel[10] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 61
        bodyModel[11] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 62
        bodyModel[12] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 63
        bodyModel[13] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 64
        bodyModel[14] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 65
        bodyModel[15] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 66
        bodyModel[16] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 67
        bodyModel[17] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 69
        bodyModel[18] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 70
        bodyModel[19] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 71
        bodyModel[20] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 72
        bodyModel[21] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 73
        bodyModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 74
        bodyModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 75
        bodyModel[24] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 76
        bodyModel[25] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 97
        bodyModel[26] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 98
        bodyModel[27] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 99
        bodyModel[28] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 102
        bodyModel[29] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 103
        bodyModel[30] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 107
        bodyModel[31] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 108
        bodyModel[32] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 109
        bodyModel[33] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 110
        bodyModel[34] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 112
        bodyModel[35] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 113
        bodyModel[36] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 114
        bodyModel[37] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 115
        bodyModel[38] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 98
        bodyModel[39] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 99
        bodyModel[40] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 100
        bodyModel[41] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 101
        bodyModel[42] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 102
        bodyModel[43] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 105
        bodyModel[44] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 106
        bodyModel[45] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 107
        bodyModel[46] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 146
        bodyModel[47] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 109
        bodyModel[48] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 110
        bodyModel[49] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 114
        bodyModel[50] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 112
        bodyModel[51] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 113
        bodyModel[52] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 114
        bodyModel[53] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 115
        bodyModel[54] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 116
        bodyModel[55] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 117
        bodyModel[56] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 118
        bodyModel[57] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 108
        bodyModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 109
        bodyModel[59] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 110
        bodyModel[60] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 111
        bodyModel[61] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 112
        bodyModel[62] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 113
        bodyModel[63] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 79
        bodyModel[64] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 80
        bodyModel[65] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 81
        bodyModel[66] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 82
        bodyModel[67] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 83
        bodyModel[68] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 84
        bodyModel[69] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 85
        bodyModel[70] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 86
        bodyModel[71] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 87
        bodyModel[72] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 88
        bodyModel[73] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 89
        bodyModel[74] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 90
        bodyModel[75] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 91
        bodyModel[76] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 92
        bodyModel[77] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 93
        bodyModel[78] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 94
        bodyModel[79] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 95
        bodyModel[80] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 96
        bodyModel[81] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 97
        bodyModel[82] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 99
        bodyModel[83] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 100
        bodyModel[84] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 101
        bodyModel[85] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 102
        bodyModel[86] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 103
        bodyModel[87] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 124
        bodyModel[88] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 105
        bodyModel[89] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 106
        bodyModel[90] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 107
        bodyModel[91] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 108
        bodyModel[92] = new ModelRendererTurbo(this, 4, 27, textureX, textureY); // Box 109
        bodyModel[93] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 120
        bodyModel[94] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 111
        bodyModel[95] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 112
        bodyModel[96] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 113
        bodyModel[97] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 114
        bodyModel[98] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 115
        bodyModel[99] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 99
        bodyModel[100] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 100
        bodyModel[101] = new ModelRendererTurbo(this, 0, 58, textureX, textureY); // Box 129
        bodyModel[102] = new ModelRendererTurbo(this, 18, 55, textureX, textureY); // Box 130
        bodyModel[103] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 131
        bodyModel[104] = new ModelRendererTurbo(this, 158, 49, textureX, textureY); // Box 119
        bodyModel[105] = new ModelRendererTurbo(this, 158, 49, textureX, textureY); // Box 120
        bodyModel[106] = new ModelRendererTurbo(this, 158, 54, textureX, textureY); // Box 117
        bodyModel[107] = new ModelRendererTurbo(this, 155, 57, textureX, textureY); // Box 124
        bodyModel[108] = new ModelRendererTurbo(this, 157, 57, textureX, textureY); // Box 109
        bodyModel[109] = new ModelRendererTurbo(this, 152, 56, textureX, textureY); // Box 122
        bodyModel[110] = new ModelRendererTurbo(this, 151, 62, textureX, textureY); // Box 116
        bodyModel[111] = new ModelRendererTurbo(this, 156, 57, textureX, textureY); // Box 125
        bodyModel[112] = new ModelRendererTurbo(this, 151, 62, textureX, textureY); // Box 129
        bodyModel[113] = new ModelRendererTurbo(this, 151, 62, textureX, textureY); // Box 128
        bodyModel[114] = new ModelRendererTurbo(this, 156, 60, textureX, textureY); // Box 131
        bodyModel[115] = new ModelRendererTurbo(this, 156, 54, textureX, textureY); // Box 116
        bodyModel[116] = new ModelRendererTurbo(this, 142, 66, textureX, textureY); // Box 130
        bodyModel[117] = new ModelRendererTurbo(this, 142, 66, textureX, textureY); // Box 118
        bodyModel[118] = new ModelRendererTurbo(this, 158, 54, textureX, textureY); // Box 119
        bodyModel[119] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 119
        bodyModel[120] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 120
        bodyModel[121] = new ModelRendererTurbo(this, 0, 69, textureX, textureY); // Box 122
        bodyModel[122] = new ModelRendererTurbo(this, 0, 69, textureX, textureY); // Box 123
        bodyModel[123] = new ModelRendererTurbo(this, 5, 81, textureX, textureY); // Box 124
        bodyModel[124] = new ModelRendererTurbo(this, 5, 81, textureX, textureY); // Box 125
        bodyModel[125] = new ModelRendererTurbo(this, 5, 81, textureX, textureY); // Box 127
        bodyModel[126] = new ModelRendererTurbo(this, 5, 81, textureX, textureY); // Box 128

        bodyModel[0].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        bodyModel[0].setRotationPoint(-25F, -1F, -9F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[1].setRotationPoint(-25F, -17F, -9F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
        bodyModel[2].setRotationPoint(-25F, -17F, 8F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[3].setRotationPoint(-25F, -1F, 8F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        bodyModel[4].setRotationPoint(-5F, 5F, -9F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 45, 4, 2, 0F,0F, 0F, -0.4F, 5F, 0F, -0.4F, 5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.3F, 5F, 0F, -0.3F, 5F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 51
        bodyModel[5].setRotationPoint(-25F, -17F, -9F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 45, 1, 16, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 53
        bodyModel[6].setRotationPoint(-25F, -17F, -8F);

        bodyModel[7].addBox(0F, 0F, 0F, 10, 1, 18, 0F); // Box 54
        bodyModel[7].setRotationPoint(-5F, 6F, -9F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 45, 4, 2, 0F,0F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.7F, 5F, 0F, 0.7F, 5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 55
        bodyModel[8].setRotationPoint(-25F, -17F, 7F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 60
        bodyModel[9].setRotationPoint(-6F, -5F, 4F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 61
        bodyModel[10].setRotationPoint(-6F, -5F, -8F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 62
        bodyModel[11].setRotationPoint(5F, -3F, -8F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 63
        bodyModel[12].setRotationPoint(5F, -3F, 4F);

        bodyModel[13].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 64
        bodyModel[13].setRotationPoint(-13.5F, 2F, 2F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[14].setRotationPoint(-11F, -2F, -8F);

        bodyModel[15].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 66
        bodyModel[15].setRotationPoint(-13.5F, 2F, -8F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        bodyModel[16].setRotationPoint(-11F, -2F, 2F);

        bodyModel[17].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 69
        bodyModel[17].setRotationPoint(-22.5F, 2F, -8F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
        bodyModel[18].setRotationPoint(-20F, -2F, -8F);

        bodyModel[19].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 71
        bodyModel[19].setRotationPoint(-22.5F, 2F, 2F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
        bodyModel[20].setRotationPoint(-20F, -2F, 2F);

        bodyModel[21].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 73
        bodyModel[21].setRotationPoint(-19.5F, -4F, -4F);

        bodyModel[22].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 74
        bodyModel[22].setRotationPoint(-19.5F, -4F, 2F);

        bodyModel[23].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 75
        bodyModel[23].setRotationPoint(-10.5F, -4F, 2F);

        bodyModel[24].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 76
        bodyModel[24].setRotationPoint(-10.5F, -4F, -4F);

        bodyModel[25].addBox(0F, 0F, 0F, 10, 3, 14, 0F); // Box 97
        bodyModel[25].setRotationPoint(-24F, -20F, -7F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, 0F, -2.7F, 5F, 0F, -2.7F, 5F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -2.7F, 5F, 0F, -2.7F, 5F, 0F, 1.8F, 0F, 0F, 1.8F); // Box 98
        bodyModel[26].setRotationPoint(-25F, -19F, -11.3F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 45, 2, 1, 0F,0F, 0F, -2.7F, 5F, 0F, -2.7F, 5F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -2.7F, 5F, 0F, -2.7F, 5F, 0F, 1.8F, 0F, 0F, 1.8F); // Box 99
        bodyModel[27].setRotationPoint(-25F, -19F, 5.8F);

        bodyModel[28].addBox(0F, 0F, 0F, 10, 3, 12, 0F); // Box 102
        bodyModel[28].setRotationPoint(7F, -20F, -6F);

        bodyModel[29].addBox(0F, 0F, 0F, 8, 3, 12, 0F); // Box 103
        bodyModel[29].setRotationPoint(17F, -20F, -6F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        bodyModel[30].setRotationPoint(0F, -13F, -9F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[31].setRotationPoint(0F, -13F, 8F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[32].setRotationPoint(-5F, -13F, 8F);

        bodyModel[33].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 110
        bodyModel[33].setRotationPoint(-5F, -1F, 8F);

        bodyModel[34].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 112
        bodyModel[34].setRotationPoint(25F, -1F, -9F);
        bodyModel[34].rotateAngleY = 0.17453293F;

        bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 18, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[35].setRotationPoint(25F, -19F, -9F);
        bodyModel[35].rotateAngleY = 0.17453293F;

        bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 18, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[36].setRotationPoint(25F, -19F, 9F);
        bodyModel[36].rotateAngleY = -0.17453293F;

        bodyModel[37].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 115
        bodyModel[37].setRotationPoint(25F, -1F, 9F);
        bodyModel[37].rotateAngleY = -0.17453293F;

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
        bodyModel[38].setRotationPoint(24F, -1F, 4F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[39].setRotationPoint(24F, -1F, -7F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 100
        bodyModel[40].setRotationPoint(24F, -14F, 7F);

        bodyModel[41].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 101
        bodyModel[41].setRotationPoint(24F, -14F, -8F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        bodyModel[42].setRotationPoint(25F, -17F, -8F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
        bodyModel[43].setRotationPoint(25F, -17F, 8F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
        bodyModel[44].setRotationPoint(25F, -1F, -8F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        bodyModel[45].setRotationPoint(25F, -1F, 5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 3F, -0.5F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -4F, -0.5F); // Box 146
        bodyModel[46].setRotationPoint(4F, -14F, -3F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 109
        bodyModel[47].setRotationPoint(7F, -14F, -3F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, -0.5F, 0F, 0F, -0.5F); // Box 110
        bodyModel[48].setRotationPoint(16F, -14F, -3F);

        bodyModel[49].addShapeBox(0F, -9F, 0F, 1, 20, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
        bodyModel[49].setRotationPoint(-6.5F, -8F, -4F);

        bodyModel[50].addShapeBox(0F, -9F, 0F, 1, 20, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 112
        bodyModel[50].setRotationPoint(-6.5F, -8F, 2.5F);

        bodyModel[51].addShapeBox(0F, -9F, 0F, 1, 22, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 113
        bodyModel[51].setRotationPoint(4.5F, -8F, 2.5F);

        bodyModel[52].addShapeBox(0F, -9F, 0F, 1, 22, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
        bodyModel[52].setRotationPoint(4.5F, -8F, -4F);

        bodyModel[53].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 115
        bodyModel[53].setRotationPoint(0F, -1F, 8F);

        bodyModel[54].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 116
        bodyModel[54].setRotationPoint(-5F, -1F, -9F);

        bodyModel[55].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 117
        bodyModel[55].setRotationPoint(0F, -1F, -9F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        bodyModel[56].setRotationPoint(-5F, -13F, -9F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 15, 2, 16, 0F,5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 108
        bodyModel[57].setRotationPoint(-20F, 5F, -8F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[58].setRotationPoint(5F, -1F, -9F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[59].setRotationPoint(5F, -17F, -9F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 15, 2, 16, 0F,5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 111
        bodyModel[60].setRotationPoint(10F, 5F, -8F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        bodyModel[61].setRotationPoint(5F, -1F, 8F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 20, 16, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[62].setRotationPoint(5F, -17F, 8F);

        bodyModel[63].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 79
        bodyModel[63].setRotationPoint(7.5F, 2F, -8F);

        bodyModel[64].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 80
        bodyModel[64].setRotationPoint(16.5F, 2F, -8F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
        bodyModel[65].setRotationPoint(10F, -2F, -8F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        bodyModel[66].setRotationPoint(19F, -2F, -8F);

        bodyModel[67].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 83
        bodyModel[67].setRotationPoint(7.5F, 2F, 2F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        bodyModel[68].setRotationPoint(10F, -2F, 2F);

        bodyModel[69].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 85
        bodyModel[69].setRotationPoint(16.5F, 2F, 2F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
        bodyModel[70].setRotationPoint(19F, -2F, 2F);

        bodyModel[71].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 87
        bodyModel[71].setRotationPoint(10.5F, -4F, -4F);

        bodyModel[72].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 88
        bodyModel[72].setRotationPoint(19.5F, -4F, -4F);

        bodyModel[73].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 89
        bodyModel[73].setRotationPoint(19.5F, -4F, 2F);

        bodyModel[74].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 90
        bodyModel[74].setRotationPoint(10.5F, -4F, 2F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        bodyModel[75].setRotationPoint(-25F, -1F, 4F);

        bodyModel[76].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 92
        bodyModel[76].setRotationPoint(-25F, -14F, 7F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
        bodyModel[77].setRotationPoint(-25F, -1F, -7F);

        bodyModel[78].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 94
        bodyModel[78].setRotationPoint(-25F, -14F, -8F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
        bodyModel[79].setRotationPoint(-28F, -1F, 5F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
        bodyModel[80].setRotationPoint(-28F, -1F, -8F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
        bodyModel[81].setRotationPoint(-28F, -17F, -8F);

        bodyModel[82].addShapeBox(-2F, 0F, 0F, 4, 18, 0, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[82].setRotationPoint(-27F, -19F, -8.9F);
        bodyModel[82].rotateAngleX = 0.01745329F;
        bodyModel[82].rotateAngleY = -0.17453293F;

        bodyModel[83].addBox(-2F, 0F, 0F, 4, 8, 0, 0F); // Box 100
        bodyModel[83].setRotationPoint(-27F, -1F, -8.6F);
        bodyModel[83].rotateAngleY = -0.17453293F;

        bodyModel[84].addBox(-2F, 0F, 0F, 4, 8, 0, 0F); // Box 101
        bodyModel[84].setRotationPoint(-27F, -1F, 8.6F);
        bodyModel[84].rotateAngleY = 0.17453293F;

        bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        bodyModel[85].setRotationPoint(-28F, -17F, 8F);

        bodyModel[86].addShapeBox(2F, 0F, 0F, 4, 18, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        bodyModel[86].setRotationPoint(-31F, -19F, 7.9F);
        bodyModel[86].rotateAngleY = 0.17453293F;

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        bodyModel[87].setRotationPoint(14F, -13F, 8F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
        bodyModel[88].setRotationPoint(24F, -13F, 8F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
        bodyModel[89].setRotationPoint(5F, -13F, 8F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        bodyModel[90].setRotationPoint(-6F, -13F, 8F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[91].setRotationPoint(-16F, -13F, 8F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[92].setRotationPoint(-25F, -13F, 8F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
        bodyModel[93].setRotationPoint(14.5F, -13F, -9F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[94].setRotationPoint(24F, -13F, -9F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        bodyModel[95].setRotationPoint(5F, -13F, -9F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[96].setRotationPoint(-6F, -13F, -9F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[97].setRotationPoint(-15.5F, -13F, -9F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bodyModel[98].setRotationPoint(-25F, -13F, -9F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[99].setRotationPoint(25F, -17F, -6.5F);
        bodyModel[99].rotateAngleX = 1.57079633F;

        bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 14, 0, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        bodyModel[100].setRotationPoint(-28F, -17F, -6.5F);
        bodyModel[100].rotateAngleX = 1.57079633F;

        bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 129
        bodyModel[101].setRotationPoint(-1F, -16F, -3F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 130
        bodyModel[102].setRotationPoint(-5F, -16F, -8F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[103].setRotationPoint(-5F, -16F, 4F);

        bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 119
        bodyModel[104].setRotationPoint(0F, -18F, 3F);

        bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 120
        bodyModel[105].setRotationPoint(4F, -18F, 3F);

        bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 117
        bodyModel[106].setRotationPoint(4F, -18F, -4F);

        bodyModel[107].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 124
        bodyModel[107].setRotationPoint(0F, -19F, 3F);

        bodyModel[108].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 109
        bodyModel[108].setRotationPoint(0F, -19F, -4F);

        bodyModel[109].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 122
        bodyModel[109].setRotationPoint(2F, -19F, -4F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[110].setRotationPoint(-6F, -24F, -1F);

        bodyModel[111].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 125
        bodyModel[111].setRotationPoint(-7F, -24F, -2F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 2F); // Box 129
        bodyModel[112].setRotationPoint(-6F, -29F, -4F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -2F); // Box 128
        bodyModel[113].setRotationPoint(-6F, -29F, 3F);

        bodyModel[114].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 131
        bodyModel[114].setRotationPoint(2F, -29F, 3F);

        bodyModel[115].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 116
        bodyModel[115].setRotationPoint(2F, -29F, -4F);

        bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 130
        bodyModel[116].setRotationPoint(2F, -30F, -7F);

        bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 118
        bodyModel[117].setRotationPoint(4F, -30F, -7F);

        bodyModel[118].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 119
        bodyModel[118].setRotationPoint(0F, -18F, -4F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 10, 1, 16, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 119
        bodyModel[119].setRotationPoint(-18F, 4F, -8F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 10, 1, 16, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 120
        bodyModel[120].setRotationPoint(12F, 4F, -8F);

        bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 122
        bodyModel[121].setRotationPoint(-28F, 5F, -5F);

        bodyModel[122].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 123
        bodyModel[122].setRotationPoint(25F, 4.95F, -5F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 124
        bodyModel[123].setRotationPoint(28F, 4.95F, -5F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 125
        bodyModel[124].setRotationPoint(28F, 4.95F, 0F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 127
        bodyModel[125].setRotationPoint(-31F, 4.95F, -5F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 128
        bodyModel[126].setRotationPoint(-31F, 4.95F, 0F);
        this.flipAll();
    }
}