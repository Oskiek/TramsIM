package metroim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Tail4300 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public Tail4300() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[128];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {

        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 4
        bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 5
        bodyModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 6
        bodyModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 8
        bodyModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 9
        bodyModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 10
        bodyModel[10] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 11
        bodyModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 12
        bodyModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 13
        bodyModel[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 14
        bodyModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 16
        bodyModel[15] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 17
        bodyModel[16] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 18
        bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
        bodyModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
        bodyModel[19] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 21
        bodyModel[20] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 22
        bodyModel[21] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 23
        bodyModel[22] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 24
        bodyModel[23] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 25
        bodyModel[24] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 26
        bodyModel[25] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 27
        bodyModel[26] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 28
        bodyModel[27] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 27
        bodyModel[28] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 28
        bodyModel[29] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 29
        bodyModel[30] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 30
        bodyModel[31] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 32
        bodyModel[32] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 38
        bodyModel[33] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 40
        bodyModel[34] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 41
        bodyModel[35] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 42
        bodyModel[36] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 43
        bodyModel[37] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 44
        bodyModel[38] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 45
        bodyModel[39] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 47
        bodyModel[40] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 48
        bodyModel[41] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 50
        bodyModel[42] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 51
        bodyModel[43] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 52
        bodyModel[44] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 53
        bodyModel[45] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 54
        bodyModel[46] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 55
        bodyModel[47] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 56
        bodyModel[48] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 58
        bodyModel[49] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 59
        bodyModel[50] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 61
        bodyModel[51] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 62
        bodyModel[52] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 63
        bodyModel[53] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 64
        bodyModel[54] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 67
        bodyModel[55] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 69
        bodyModel[56] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 70
        bodyModel[57] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 71
        bodyModel[58] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 72
        bodyModel[59] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 73
        bodyModel[60] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
        bodyModel[61] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 75
        bodyModel[62] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 76
        bodyModel[63] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 77
        bodyModel[64] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 78
        bodyModel[65] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 79
        bodyModel[66] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 80
        bodyModel[67] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 81
        bodyModel[68] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 82
        bodyModel[69] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 83
        bodyModel[70] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 84
        bodyModel[71] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 85
        bodyModel[72] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 86
        bodyModel[73] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 87
        bodyModel[74] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 88
        bodyModel[75] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 89
        bodyModel[76] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 90
        bodyModel[77] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 91
        bodyModel[78] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 92
        bodyModel[79] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 93
        bodyModel[80] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 95
        bodyModel[81] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 96
        bodyModel[82] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 97
        bodyModel[83] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 98
        bodyModel[84] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 99
        bodyModel[85] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 100
        bodyModel[86] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 101
        bodyModel[87] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 102
        bodyModel[88] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 103
        bodyModel[89] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 104
        bodyModel[90] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 105
        bodyModel[91] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 106
        bodyModel[92] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 107
        bodyModel[93] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 108
        bodyModel[94] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 109
        bodyModel[95] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 110
        bodyModel[96] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 111
        bodyModel[97] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 112
        bodyModel[98] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 113
        bodyModel[99] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 114
        bodyModel[100] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 115
        bodyModel[101] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 116
        bodyModel[102] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 117
        bodyModel[103] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 118
        bodyModel[104] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 119
        bodyModel[105] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 120
        bodyModel[106] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 122
        bodyModel[107] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 123
        bodyModel[108] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 124
        bodyModel[109] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 125
        bodyModel[110] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 126
        bodyModel[111] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 128
        bodyModel[112] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 129
        bodyModel[113] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 130
        bodyModel[114] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 131
        bodyModel[115] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 132
        bodyModel[116] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 133
        bodyModel[117] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 134
        bodyModel[118] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 135
        bodyModel[119] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 137
        bodyModel[120] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 138
        bodyModel[121] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 139
        bodyModel[122] = new ModelRendererTurbo(this, 0, 89, textureX, textureY); // Box 126
        bodyModel[123] = new ModelRendererTurbo(this, 0, 89, textureX, textureY); // Box 127
        bodyModel[124] = new ModelRendererTurbo(this, 0, 89, textureX, textureY); // Box 128
        bodyModel[125] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 128
        bodyModel[126] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 129
        bodyModel[127] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 130

        bodyModel[0].addBox(0F, 0F, 0F, 52, 1, 18, 0F); // Box 0
        bodyModel[0].setRotationPoint(-20F, 0F, -9F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1
        bodyModel[1].setRotationPoint(-28F, 0F, -8F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0.2F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0.2F, 0F, -0.5F); // Box 2
        bodyModel[2].setRotationPoint(-32F, 0F, -7F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 18, 1, 0F,0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 3
        bodyModel[3].setRotationPoint(-28F, -18F, -9F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 19, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        bodyModel[4].setRotationPoint(-5F, -18F, -9F);

        bodyModel[5].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 5
        bodyModel[5].setRotationPoint(-13F, -19F, -9F);

        bodyModel[6].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 6
        bodyModel[6].setRotationPoint(14F, -19F, -9F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        bodyModel[7].setRotationPoint(-20F, -18F, 8F);

        bodyModel[8].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 9
        bodyModel[8].setRotationPoint(-13F, -19F, 8F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 19, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[9].setRotationPoint(-5F, -18F, 8F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        bodyModel[10].setRotationPoint(14F, -19F, 8F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[11].setRotationPoint(22F, -18F, -9F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        bodyModel[12].setRotationPoint(22F, -18F, 8F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        bodyModel[13].setRotationPoint(-20F, -18F, -9F);

        bodyModel[14].addBox(0F, 0F, 0F, 52, 1, 16, 0F); // Box 16
        bodyModel[14].setRotationPoint(-20F, -20F, -8F);

        bodyModel[15].addShapeBox(0F, -3F, 0F, 52, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
        bodyModel[15].setRotationPoint(-20F, -21F, 8F);

        bodyModel[16].addShapeBox(0F, -3F, 0F, 52, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
        bodyModel[16].setRotationPoint(-20F, -21F, -9F);

        bodyModel[17].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 19
        bodyModel[17].setRotationPoint(-20F, -4F, -7F);

        bodyModel[18].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 20
        bodyModel[18].setRotationPoint(-20F, -4F, 4F);

        bodyModel[19].addBox(0F, 0F, 0F, 15, 1, 3, 0F); // Box 21
        bodyModel[19].setRotationPoint(-3F, -4F, 4F);

        bodyModel[20].addBox(0F, 0F, 0F, 15, 1, 3, 0F); // Box 22
        bodyModel[20].setRotationPoint(-3F, -4F, -7F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 5, 16, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F); // Box 23
        bodyModel[21].setRotationPoint(-29F, -24F, -8F);

        bodyModel[22].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 24
        bodyModel[22].setRotationPoint(24F, -4F, -7F);

        bodyModel[23].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 25
        bodyModel[23].setRotationPoint(24F, -4F, 4F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[24].setRotationPoint(30F, -18F, -8F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[25].setRotationPoint(30F, -18F, 5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[26].setRotationPoint(22F, -16F, 7F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 18, 1, 0F,0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 27
        bodyModel[27].setRotationPoint(-28F, -18F, 8F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 50, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[28].setRotationPoint(-20F, -19F, -8F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 50, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        bodyModel[29].setRotationPoint(-20F, -19F, 6F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[30].setRotationPoint(30F, -18F, -5F);

        bodyModel[31].addBox(0F, 0F, 0F, 1, 19, 16, 0F); // Box 32
        bodyModel[31].setRotationPoint(-21F, -19F, -8F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.1F, 0F, 0.65F, 0F, 0F, -1F, 0F, 0F, 1F, -0.1F, 0F, -0.3F, 0.2F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0.2F, 0F, -0.5F); // Box 38
        bodyModel[32].setRotationPoint(-32F, -4F, 6F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-3F, 1F, -0.5F, 0F, 1F, -1F, 0F, 1F, 1F, -3F, 1F, 0.7F, -0.7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.7F, 0F, 0F); // Box 40
        bodyModel[33].setRotationPoint(-32F, -18F, 6F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.7F, 0F, 0F, -0.1F, 0F, 0.65F, 0F, 0F, -1F, 0F, 0F, 1F, -0.1F, 0F, -0.3F); // Box 41
        bodyModel[34].setRotationPoint(-32F, -9F, 6F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.1F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1F, -0.1F, 0F, 0.65F, 0.2F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0.2F, 0F, 2F); // Box 42
        bodyModel[35].setRotationPoint(-32F, -4F, -7F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.7F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.7F, 0F, 0F, -0.1F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1F, -0.1F, 0F, 0.65F); // Box 43
        bodyModel[36].setRotationPoint(-32F, -9F, -7F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-3F, 1F, 0.7F, 0F, 1F, 1F, 0F, 1F, -1F, -3F, 1F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.7F, 0F, 0F); // Box 44
        bodyModel[37].setRotationPoint(-32F, -18F, -7F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 45
        bodyModel[38].setRotationPoint(-28F, -24F, -9F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 47
        bodyModel[39].setRotationPoint(-28F, -24F, 8F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,-0.1F, 0F, 1.35F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, -0.1F, 0F, 1.35F, 0.2F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.5F, 0.2F, 0F, 0F); // Box 48
        bodyModel[40].setRotationPoint(-32F, -4F, -4F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,-0.6F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -0.6F, 0F, 0.5F, 0F, 0F, -0.15F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0F, 0F, 0F, -0.15F); // Box 50
        bodyModel[41].setRotationPoint(-31.9F, -9F, -5.5F);

        bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 51
        bodyModel[42].setRotationPoint(-25F, -5F, -2F);

        bodyModel[43].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 52
        bodyModel[43].setRotationPoint(-22F, -10F, -2F);

        bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 53
        bodyModel[44].setRotationPoint(-25F, -7F, -3F);

        bodyModel[45].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 54
        bodyModel[45].setRotationPoint(-25F, -7F, 2F);

        bodyModel[46].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 55
        bodyModel[46].setRotationPoint(-24F, -4F, -1F);

        bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 56
        bodyModel[47].setRotationPoint(-22F, -12F, -1F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
        bodyModel[48].setRotationPoint(-31F, -6.5F, -6F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,-0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
        bodyModel[49].setRotationPoint(-31F, -9.5F, -6F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 1F, 0.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0.5F, 2.3F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0.1F, 2.3F, 0F, 0F); // Box 61
        bodyModel[50].setRotationPoint(-29F, -18F, -6F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        bodyModel[51].setRotationPoint(12F, -16F, 7F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[52].setRotationPoint(-5F, -16F, 7F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        bodyModel[53].setRotationPoint(-15F, -16F, 7F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        bodyModel[54].setRotationPoint(12F, -16F, -8F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F); // Box 69
        bodyModel[55].setRotationPoint(-27F, -23F, -7F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 70
        bodyModel[56].setRotationPoint(-20F, -8F, -8F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 71
        bodyModel[57].setRotationPoint(-3F, -8F, -8F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 72
        bodyModel[58].setRotationPoint(24F, -8F, -8F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        bodyModel[59].setRotationPoint(24F, -8F, 7F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[60].setRotationPoint(-3F, -8F, 7F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
        bodyModel[61].setRotationPoint(-20F, -8F, 7F);

        bodyModel[62].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 76
        bodyModel[62].setRotationPoint(-14F, -7F, -7F);

        bodyModel[63].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 77
        bodyModel[63].setRotationPoint(-14F, -7F, 5F);

        bodyModel[64].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 78
        bodyModel[64].setRotationPoint(-4F, -7F, 5F);

        bodyModel[65].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 79
        bodyModel[65].setRotationPoint(-4F, -7F, -7F);

        bodyModel[66].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 80
        bodyModel[66].setRotationPoint(13F, -7F, -7F);

        bodyModel[67].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 81
        bodyModel[67].setRotationPoint(13F, -7F, 5F);

        bodyModel[68].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 82
        bodyModel[68].setRotationPoint(23F, -7F, 5F);

        bodyModel[69].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 83
        bodyModel[69].setRotationPoint(23F, -7F, -7F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        bodyModel[70].setRotationPoint(-14F, -18F, -5F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
        bodyModel[71].setRotationPoint(-14F, -18F, 4F);

        bodyModel[72].addShapeBox(0F, -8F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
        bodyModel[72].setRotationPoint(-4F, -10F, 4F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
        bodyModel[73].setRotationPoint(-4F, -18F, -5F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        bodyModel[74].setRotationPoint(13F, -18F, -5F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        bodyModel[75].setRotationPoint(23F, -18F, -5F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
        bodyModel[76].setRotationPoint(23F, -18F, 4F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        bodyModel[77].setRotationPoint(13F, -18F, 4F);

        bodyModel[78].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 92
        bodyModel[78].setRotationPoint(2F, 1F, -8F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 93
        bodyModel[79].setRotationPoint(-32F, 1F, -8F);

        bodyModel[80].addBox(0F, 0F, 0F, 4, 4, 16, 0F); // Box 95
        bodyModel[80].setRotationPoint(-3F, 1F, -8F);

        bodyModel[81].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 96
        bodyModel[81].setRotationPoint(1F, 1F, 4F);

        bodyModel[82].addBox(0F, 0F, 0F, 10, 5, 4, 0F); // Box 97
        bodyModel[82].setRotationPoint(1F, 1F, -2F);

        bodyModel[83].addBox(0F, 0F, 0F, 4, 4, 16, 0F); // Box 98
        bodyModel[83].setRotationPoint(11F, 1F, -8F);

        bodyModel[84].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 99
        bodyModel[84].setRotationPoint(-31F, 3F, -1F);

        bodyModel[85].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 100
        bodyModel[85].setRotationPoint(-34F, 2F, -2F);

        bodyModel[86].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
        bodyModel[86].setRotationPoint(-34F, 4F, 2F);

        bodyModel[87].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 102
        bodyModel[87].setRotationPoint(-29F, 3F, -7F);

        bodyModel[88].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 103
        bodyModel[88].setRotationPoint(-29F, 3F, 3F);

        bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 104
        bodyModel[89].setRotationPoint(-29F, 5F, -3F);

        bodyModel[90].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 105
        bodyModel[90].setRotationPoint(-28F, 3F, -6F);

        bodyModel[91].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 106
        bodyModel[91].setRotationPoint(-28F, 3F, 5F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F); // Box 107
        bodyModel[92].setRotationPoint(-32F, 1F, 6F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[93].setRotationPoint(-13F, -16F, -9F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[94].setRotationPoint(14F, -16F, -9F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[95].setRotationPoint(14F, -16F, 8F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[96].setRotationPoint(-13F, -16F, 8F);

        bodyModel[97].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 112
        bodyModel[97].setRotationPoint(-17F, -23F, -7F);

        bodyModel[98].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 113
        bodyModel[98].setRotationPoint(-12F, -24F, -7F);

        bodyModel[99].addBox(0F, 0F, 0F, 6, 3, 10, 0F); // Box 114
        bodyModel[99].setRotationPoint(-2F, -23F, -4F);

        bodyModel[100].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 115
        bodyModel[100].setRotationPoint(5F, -24F, -6F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[101].setRotationPoint(20F, -23F, -1F);

        bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 117
        bodyModel[102].setRotationPoint(21F, -21F, -4F);

        bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 118
        bodyModel[103].setRotationPoint(17F, -21F, -4F);

        bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 119
        bodyModel[104].setRotationPoint(17F, -21F, 3F);

        bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 120
        bodyModel[105].setRotationPoint(21F, -21F, 3F);

        bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 122
        bodyModel[106].setRotationPoint(19F, -23F, -4F);

        bodyModel[107].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 123
        bodyModel[107].setRotationPoint(17F, -22F, -4F);

        bodyModel[108].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 124
        bodyModel[108].setRotationPoint(17F, -22F, 3F);

        bodyModel[109].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 125
        bodyModel[109].setRotationPoint(28F, -24F, -2F);

        bodyModel[110].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 126
        bodyModel[110].setRotationPoint(19F, -26F, -7F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 128
        bodyModel[111].setRotationPoint(20F, -24F, -2F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F); // Box 129
        bodyModel[112].setRotationPoint(20F, -24F, 1F);

        bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 130
        bodyModel[113].setRotationPoint(17F, -26F, -7F);

        bodyModel[114].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 131
        bodyModel[114].setRotationPoint(17F, -25F, 3F);

        bodyModel[115].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 132
        bodyModel[115].setRotationPoint(17F, -25F, -4F);

        bodyModel[116].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 133
        bodyModel[116].setRotationPoint(32F, -1F, -5F);

        bodyModel[117].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 134
        bodyModel[117].setRotationPoint(32F, -17F, -5F);

        bodyModel[118].addBox(0F, 0F, 0F, 3, 15, 1, 0F); // Box 135
        bodyModel[118].setRotationPoint(32F, -16F, -6F);

        bodyModel[119].addBox(0F, 0F, 0F, 3, 15, 1, 0F); // Box 137
        bodyModel[119].setRotationPoint(32F, -16F, 5F);

        bodyModel[120].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 138
        bodyModel[120].setRotationPoint(28F, 1F, -1F);

        bodyModel[121].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 139
        bodyModel[121].setRotationPoint(34F, 0F, -2F);

        bodyModel[122].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 126
        bodyModel[122].setRotationPoint(-13F, 1F, -1.5F);

        bodyModel[123].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 127
        bodyModel[123].setRotationPoint(22F, 1F, -1.5F);

        bodyModel[124].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 128
        bodyModel[124].setRotationPoint(22F, 1F, -1.5F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[125].setRotationPoint(22F, -16F, -8F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        bodyModel[126].setRotationPoint(-5F, -16F, -8F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[127].setRotationPoint(-15F, -16F, -8F);
        this.flipAll();
    }
}