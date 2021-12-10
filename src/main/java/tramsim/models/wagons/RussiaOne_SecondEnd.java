package tramsim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class RussiaOne_SecondEnd extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public RussiaOne_SecondEnd() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[152];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 146, 248, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 178, 220, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 178, 220, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 293, 215, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 293, 225, textureX, textureY); // Box 4
        bodyModel[5] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 5
        bodyModel[6] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 10
        bodyModel[7] = new ModelRendererTurbo(this, 3, 113, textureX, textureY); // Box 13
        bodyModel[8] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 14
        bodyModel[9] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 15
        bodyModel[10] = new ModelRendererTurbo(this, 170, 187, textureX, textureY); // Box 16
        bodyModel[11] = new ModelRendererTurbo(this, 35, 255, textureX, textureY); // Box 17
        bodyModel[12] = new ModelRendererTurbo(this, 129, 197, textureX, textureY); // Box 18
        bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 19
        bodyModel[14] = new ModelRendererTurbo(this, 129, 180, textureX, textureY); // Box 20
        bodyModel[15] = new ModelRendererTurbo(this, 170, 229, textureX, textureY); // Box 21
        bodyModel[16] = new ModelRendererTurbo(this, 152, 180, textureX, textureY); // Box 23
        bodyModel[17] = new ModelRendererTurbo(this, 152, 197, textureX, textureY); // Box 24
        bodyModel[18] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 26
        bodyModel[19] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 27
        bodyModel[20] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 28
        bodyModel[21] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 29
        bodyModel[22] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 30
        bodyModel[23] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 31
        bodyModel[24] = new ModelRendererTurbo(this, 35, 230, textureX, textureY); // Box 32
        bodyModel[25] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 33
        bodyModel[26] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 34
        bodyModel[27] = new ModelRendererTurbo(this, 62, 158, textureX, textureY); // Box 35
        bodyModel[28] = new ModelRendererTurbo(this, 68, 169, textureX, textureY); // Box 36
        bodyModel[29] = new ModelRendererTurbo(this, 62, 158, textureX, textureY); // Box 37
        bodyModel[30] = new ModelRendererTurbo(this, 68, 169, textureX, textureY); // Box 38
        bodyModel[31] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 32
        bodyModel[32] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 33
        bodyModel[33] = new ModelRendererTurbo(this, 24, 195, textureX, textureY); // Box 34
        bodyModel[34] = new ModelRendererTurbo(this, 24, 175, textureX, textureY); // Box 35
        bodyModel[35] = new ModelRendererTurbo(this, 24, 195, textureX, textureY); // Box 36
        bodyModel[36] = new ModelRendererTurbo(this, 24, 175, textureX, textureY); // Box 37
        bodyModel[37] = new ModelRendererTurbo(this, 24, 195, textureX, textureY); // Box 38
        bodyModel[38] = new ModelRendererTurbo(this, 24, 175, textureX, textureY); // Box 39
        bodyModel[39] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 40
        bodyModel[40] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 41
        bodyModel[41] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 42
        bodyModel[42] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 43
        bodyModel[43] = new ModelRendererTurbo(this, 442, 178, textureX, textureY); // Box 44
        bodyModel[44] = new ModelRendererTurbo(this, 426, 233, textureX, textureY); // Box 45
        bodyModel[45] = new ModelRendererTurbo(this, 433, 221, textureX, textureY); // Box 46
        bodyModel[46] = new ModelRendererTurbo(this, 440, 183, textureX, textureY); // Box 47
        bodyModel[47] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 48
        bodyModel[48] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 49
        bodyModel[49] = new ModelRendererTurbo(this, 492, 178, textureX, textureY); // Box 50
        bodyModel[50] = new ModelRendererTurbo(this, 488, 183, textureX, textureY); // Box 51
        bodyModel[51] = new ModelRendererTurbo(this, 436, 205, textureX, textureY); // Box 52
        bodyModel[52] = new ModelRendererTurbo(this, 165, 238, textureX, textureY); // Box 54
        bodyModel[53] = new ModelRendererTurbo(this, 475, 205, textureX, textureY); // Box 55
        bodyModel[54] = new ModelRendererTurbo(this, 442, 212, textureX, textureY); // Box 56
        bodyModel[55] = new ModelRendererTurbo(this, 436, 200, textureX, textureY); // Box 57
        bodyModel[56] = new ModelRendererTurbo(this, 475, 200, textureX, textureY); // Box 58
        bodyModel[57] = new ModelRendererTurbo(this, 442, 162, textureX, textureY); // Box 59
        bodyModel[58] = new ModelRendererTurbo(this, 442, 157, textureX, textureY); // Box 60
        bodyModel[59] = new ModelRendererTurbo(this, 454, 144, textureX, textureY); // Box 61
        bodyModel[60] = new ModelRendererTurbo(this, 492, 162, textureX, textureY); // Box 63
        bodyModel[61] = new ModelRendererTurbo(this, 492, 157, textureX, textureY); // Box 64
        bodyModel[62] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 65
        bodyModel[63] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 66
        bodyModel[64] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 67
        bodyModel[65] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 68
        bodyModel[66] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 70
        bodyModel[67] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 71
        bodyModel[68] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 72
        bodyModel[69] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 73
        bodyModel[70] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 74
        bodyModel[71] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 75
        bodyModel[72] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 72
        bodyModel[73] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 74
        bodyModel[74] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 76
        bodyModel[75] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 77
        bodyModel[76] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 78
        bodyModel[77] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 80
        bodyModel[78] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 81
        bodyModel[79] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 82
        bodyModel[80] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 83
        bodyModel[81] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 84
        bodyModel[82] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 85
        bodyModel[83] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 86
        bodyModel[84] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 87
        bodyModel[85] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 88
        bodyModel[86] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 89
        bodyModel[87] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 90
        bodyModel[88] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 91
        bodyModel[89] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 92
        bodyModel[90] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 93
        bodyModel[91] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 94
        bodyModel[92] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 95
        bodyModel[93] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 96
        bodyModel[94] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 97
        bodyModel[95] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 98
        bodyModel[96] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 102
        bodyModel[97] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 105
        bodyModel[98] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 106
        bodyModel[99] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 109
        bodyModel[100] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 110
        bodyModel[101] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 111
        bodyModel[102] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 112
        bodyModel[103] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 113
        bodyModel[104] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 114
        bodyModel[105] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 115
        bodyModel[106] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 116
        bodyModel[107] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 117
        bodyModel[108] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 118
        bodyModel[109] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 119
        bodyModel[110] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 120
        bodyModel[111] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 121
        bodyModel[112] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 122
        bodyModel[113] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 123
        bodyModel[114] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 124
        bodyModel[115] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 125
        bodyModel[116] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 126
        bodyModel[117] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 127
        bodyModel[118] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 128
        bodyModel[119] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 129
        bodyModel[120] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 131
        bodyModel[121] = new ModelRendererTurbo(this, 480, 81, textureX, textureY); // Box 132
        bodyModel[122] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 133
        bodyModel[123] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 134
        bodyModel[124] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 135
        bodyModel[125] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 136
        bodyModel[126] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 137
        bodyModel[127] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 139
        bodyModel[128] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 140
        bodyModel[129] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 141
        bodyModel[130] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 142
        bodyModel[131] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 143
        bodyModel[132] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 144
        bodyModel[133] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 145
        bodyModel[134] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 146
        bodyModel[135] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 147
        bodyModel[136] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 148
        bodyModel[137] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 149
        bodyModel[138] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 140
        bodyModel[139] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 141
        bodyModel[140] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 142
        bodyModel[141] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 143
        bodyModel[142] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 144
        bodyModel[143] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 145
        bodyModel[144] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 146
        bodyModel[145] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 147
        bodyModel[146] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 148
        bodyModel[147] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 149
        bodyModel[148] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 155
        bodyModel[149] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 156
        bodyModel[150] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 157
        bodyModel[151] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 158

        bodyModel[0].addShapeBox(0F, 0F, 0F, 58, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        bodyModel[0].setRotationPoint(-17F, -2F, -11F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 42, 5, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        bodyModel[1].setRotationPoint(-6F, -7F, -11F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 42, 5, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        bodyModel[2].setRotationPoint(-6F, -7F, 10F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 44, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 3
        bodyModel[3].setRotationPoint(-7F, -8F, -11F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 44, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 4
        bodyModel[4].setRotationPoint(-7F, -8F, 10F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 3, 11, 0F,0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 5
        bodyModel[5].setRotationPoint(-21F, -2F, -11F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 10
        bodyModel[6].setRotationPoint(-21F, -7F, -11F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 18, 18, 0F,3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, -0.75F, 0F, 0F); // Box 13
        bodyModel[7].setRotationPoint(-38F, -25F, -9F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F,0.25F, 0F, 0F, 2F, 0F, 1.6F, -3F, 0F, 0F, 0.25F, 0F, 0F, 0F, -7F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -0.5F, -4F, 0F); // Box 14
        bodyModel[8].setRotationPoint(-37F, -7F, -9F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 24, 4, 18, 0F,0.6F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 15
        bodyModel[9].setRotationPoint(-41F, -29F, -9F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 54, 4, 22, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bodyModel[10].setRotationPoint(-17F, -29F, -11F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 24, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -4.75F, 0F, 0F); // Box 17
        bodyModel[11].setRotationPoint(-41F, -25F, -9F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 18
        bodyModel[12].setRotationPoint(-14F, -8F, -11F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
        bodyModel[13].setRotationPoint(-17F, -8F, -11F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 14, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 20
        bodyModel[14].setRotationPoint(-14F, -22F, -11F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 54, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 21
        bodyModel[15].setRotationPoint(-17F, -25F, -11F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 14, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 23
        bodyModel[16].setRotationPoint(-14F, -22F, 10F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 24
        bodyModel[17].setRotationPoint(-14F, -8F, 10F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[18].setRotationPoint(-17F, -22F, -11F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 27
        bodyModel[19].setRotationPoint(-17F, -8F, 10F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[20].setRotationPoint(-17F, -22F, 10F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 11, 0F,5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 29
        bodyModel[21].setRotationPoint(-21F, -2F, 0F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.4F); // Box 30
        bodyModel[22].setRotationPoint(-21F, -7F, 0F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F,0.25F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 1.6F, 0.25F, 0F, 0F, -0.5F, -4F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, -7F, 0F); // Box 31
        bodyModel[23].setRotationPoint(-37F, -7F, 0F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 24, 18, 1, 0F,-1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, -4.75F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -3.75F, 0F, 0F); // Box 32
        bodyModel[24].setRotationPoint(-41F, -25F, 8F);

        bodyModel[25].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 33
        bodyModel[25].setRotationPoint(-7F, -22F, 10F);

        bodyModel[26].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 34
        bodyModel[26].setRotationPoint(-7F, -22F, -11F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0.7F, 0F, -3F, -0.7F, 0F, -2F, 0F, -7F, 0F, -0.25F, -7F, 0F, -0.3F, 0F, -2F, -0.7F); // Box 35
        bodyModel[27].setRotationPoint(-31F, -14F, 9F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -0.3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 3F, 0F, -1.3F); // Box 36
        bodyModel[28].setRotationPoint(-23F, -14F, 10F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,0F, -3F, -0.7F, 0F, 0F, 0.7F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -2F, -0.7F, -7F, 0F, -0.3F, -7F, 0F, -0.25F, 0F, -2F, 0F); // Box 37
        bodyModel[29].setRotationPoint(-31F, -14F, -11F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,-4F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, -1.3F, 0F, 0F, -1.2F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 38
        bodyModel[30].setRotationPoint(-23F, -14F, -12F);

        bodyModel[31].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 32
        bodyModel[31].setRotationPoint(7F, -22F, 10F);

        bodyModel[32].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 33
        bodyModel[32].setRotationPoint(7F, -22F, -11F);

        bodyModel[33].addBox(0F, 0F, 0F, 12, 14, 0, 0F); // Box 34
        bodyModel[33].setRotationPoint(-5F, -22F, -10.9F);

        bodyModel[34].addBox(0F, 0F, 0F, 12, 14, 0, 0F); // Box 35
        bodyModel[34].setRotationPoint(-5F, -22F, 10.9F);

        bodyModel[35].addBox(0F, 0F, 0F, 12, 14, 0, 0F); // Box 36
        bodyModel[35].setRotationPoint(9F, -22F, -10.9F);

        bodyModel[36].addBox(0F, 0F, 0F, 12, 14, 0, 0F); // Box 37
        bodyModel[36].setRotationPoint(9F, -22F, 10.9F);

        bodyModel[37].addBox(0F, 0F, 0F, 12, 14, 0, 0F); // Box 38
        bodyModel[37].setRotationPoint(23F, -22F, -10.9F);

        bodyModel[38].addBox(0F, 0F, 0F, 12, 14, 0, 0F); // Box 39
        bodyModel[38].setRotationPoint(23F, -22F, 10.9F);

        bodyModel[39].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 40
        bodyModel[39].setRotationPoint(21F, -22F, -11F);

        bodyModel[40].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 41
        bodyModel[40].setRotationPoint(21F, -22F, 10F);

        bodyModel[41].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 42
        bodyModel[41].setRotationPoint(35F, -22F, -11F);

        bodyModel[42].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 43
        bodyModel[42].setRotationPoint(35F, -22F, 10F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 44
        bodyModel[43].setRotationPoint(37F, -8F, -10F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
        bodyModel[44].setRotationPoint(36F, -5F, -9F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        bodyModel[45].setRotationPoint(36F, -8F, -9F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        bodyModel[46].setRotationPoint(37F, -5F, -10F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        bodyModel[47].setRotationPoint(36F, -5F, 6F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 49
        bodyModel[48].setRotationPoint(36F, -8F, 6F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
        bodyModel[49].setRotationPoint(37F, -8F, 9F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 51
        bodyModel[50].setRotationPoint(37F, -5F, 6F);

        bodyModel[51].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 52
        bodyModel[51].setRotationPoint(36F, -22F, -10F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 54, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        bodyModel[52].setRotationPoint(-17F, -25F, 7F);

        bodyModel[53].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 55
        bodyModel[53].setRotationPoint(36F, -22F, 9F);

        bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 56
        bodyModel[54].setRotationPoint(36F, -25F, -7F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 57
        bodyModel[55].setRotationPoint(36F, -25F, -8F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 58
        bodyModel[56].setRotationPoint(36F, -25F, 7F);

        bodyModel[57].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 59
        bodyModel[57].setRotationPoint(37F, -22F, -10F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 60
        bodyModel[58].setRotationPoint(37F, -25F, -8F);

        bodyModel[59].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 61
        bodyModel[59].setRotationPoint(37F, -27F, -7F);

        bodyModel[60].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 63
        bodyModel[60].setRotationPoint(37F, -22F, 9F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 64
        bodyModel[61].setRotationPoint(37F, -25F, 7F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 65
        bodyModel[62].setRotationPoint(-6.5F, -8F, 4F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 66
        bodyModel[63].setRotationPoint(-6F, -7F, 4F);

        bodyModel[64].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 67
        bodyModel[64].setRotationPoint(-6.5F, -4F, 4F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 68
        bodyModel[65].setRotationPoint(-6.5F, -19F, 4F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 4F, -2F, -0.25F, 4F, -2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -6F, -0.5F, -0.25F, -6F, -0.5F); // Box 70
        bodyModel[66].setRotationPoint(-6.5F, -20.5F, 4F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 71
        bodyModel[67].setRotationPoint(-6.5F, -8F, -9F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 72
        bodyModel[68].setRotationPoint(-6F, -7F, -9F);

        bodyModel[69].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 73
        bodyModel[69].setRotationPoint(-6.5F, -4F, -9F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 74
        bodyModel[70].setRotationPoint(-6.5F, -19F, -5F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 4F, -2F, -0.25F, 4F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -6F, -0.5F, -0.25F, -6F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 75
        bodyModel[71].setRotationPoint(-6.5F, -20.5F, -10F);

        bodyModel[72].addBox(0F, 0F, 0F, 31, 1, 6, 0F); // Box 72
        bodyModel[72].setRotationPoint(-1F, -3F, 3F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 74
        bodyModel[73].setRotationPoint(-2F, -5F, 3F);

        bodyModel[74].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 76
        bodyModel[74].setRotationPoint(-1F, -5F, 3F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 77
        bodyModel[75].setRotationPoint(-2F, -10F, 3F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 78
        bodyModel[76].setRotationPoint(-2F, -6F, 3F);

        bodyModel[77].addBox(0F, 0F, 0F, 17, 5, 3, 0F); // Box 80
        bodyModel[77].setRotationPoint(6F, -8F, 6F);

        bodyModel[78].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 81
        bodyModel[78].setRotationPoint(-1F, -6F, 3F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        bodyModel[79].setRotationPoint(4F, -10F, 3F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 83
        bodyModel[80].setRotationPoint(-2F, -10F, 8F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 84
        bodyModel[81].setRotationPoint(30F, -5F, 3F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 85
        bodyModel[82].setRotationPoint(30F, -6F, 3F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 86
        bodyModel[83].setRotationPoint(25F, -10F, 8F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
        bodyModel[84].setRotationPoint(23F, -10F, 3F);

        bodyModel[85].addBox(0F, 0F, 0F, 2, 6, 6, 0F); // Box 88
        bodyModel[85].setRotationPoint(23F, -9F, 3F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, -1F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 89
        bodyModel[86].setRotationPoint(25F, -10F, 3F);

        bodyModel[87].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 90
        bodyModel[87].setRotationPoint(25F, -6F, 3F);

        bodyModel[88].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 91
        bodyModel[88].setRotationPoint(25F, -5F, 3F);

        bodyModel[89].addBox(0F, 0F, 0F, 2, 6, 6, 0F); // Box 92
        bodyModel[89].setRotationPoint(4F, -9F, 3F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93
        bodyModel[90].setRotationPoint(6F, -9F, 3F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 94
        bodyModel[91].setRotationPoint(22F, -9F, 3F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
        bodyModel[92].setRotationPoint(6.5F, -9F, 8F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
        bodyModel[93].setRotationPoint(6.5F, -12.5F, 8F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 97
        bodyModel[94].setRotationPoint(6F, -12.5F, 3F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 98
        bodyModel[95].setRotationPoint(22F, -12.5F, 3F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 102
        bodyModel[96].setRotationPoint(6.75F, -22F, 3F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 105
        bodyModel[97].setRotationPoint(1.75F, -22.5F, 3F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 106
        bodyModel[98].setRotationPoint(21.25F, -22F, 3F);

        bodyModel[99].addBox(0F, 0F, 0F, 31, 1, 6, 0F); // Box 109
        bodyModel[99].setRotationPoint(-1F, -3F, -9F);

        bodyModel[100].addBox(0F, 0F, 0F, 17, 5, 3, 0F); // Box 110
        bodyModel[100].setRotationPoint(6F, -8F, -9F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 111
        bodyModel[101].setRotationPoint(30F, -5F, -9F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 112
        bodyModel[102].setRotationPoint(30F, -6F, -9F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[103].setRotationPoint(25F, -10F, -9F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[104].setRotationPoint(23F, -10F, -9F);

        bodyModel[105].addBox(0F, 0F, 0F, 2, 6, 6, 0F); // Box 115
        bodyModel[105].setRotationPoint(23F, -9F, -9F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[106].setRotationPoint(25F, -10F, -4F);

        bodyModel[107].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 117
        bodyModel[107].setRotationPoint(25F, -6F, -9F);

        bodyModel[108].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 118
        bodyModel[108].setRotationPoint(25F, -5F, -9F);

        bodyModel[109].addBox(0F, 0F, 0F, 2, 6, 6, 0F); // Box 119
        bodyModel[109].setRotationPoint(4F, -9F, -9F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
        bodyModel[110].setRotationPoint(6F, -9F, -9F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
        bodyModel[111].setRotationPoint(6.5F, -9F, -9F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
        bodyModel[112].setRotationPoint(6.5F, -12.5F, -9F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
        bodyModel[113].setRotationPoint(6F, -12.5F, -9F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 124
        bodyModel[114].setRotationPoint(22F, -12.5F, -9F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 125
        bodyModel[115].setRotationPoint(6.5F, -12F, -4F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 126
        bodyModel[116].setRotationPoint(6.75F, -22F, -4F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 127
        bodyModel[117].setRotationPoint(1.75F, -22.5F, -4F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 128
        bodyModel[118].setRotationPoint(21.25F, -22F, -4F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -3.25F, -3F, -3.5F, 2.25F, -3.5F, -3.5F, 2.25F, -3.5F, 3F, -3.25F, -3F, 3F); // Box 129
        bodyModel[119].setRotationPoint(-1.25F, -25F, -7F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 131
        bodyModel[120].setRotationPoint(-2F, -5F, -9F);

        bodyModel[121].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 132
        bodyModel[121].setRotationPoint(-1F, -5F, -9F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 133
        bodyModel[122].setRotationPoint(-2F, -10F, -4F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 134
        bodyModel[123].setRotationPoint(-2F, -6F, -9F);

        bodyModel[124].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 135
        bodyModel[124].setRotationPoint(-1F, -6F, -9F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        bodyModel[125].setRotationPoint(4F, -10F, -9F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 137
        bodyModel[126].setRotationPoint(-2F, -10F, -9F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -3.25F, -3F, 3F, 2.25F, -3.5F, 3F, 2.25F, -3.5F, -3.5F, -3.25F, -3F, -3.5F); // Box 139
        bodyModel[127].setRotationPoint(-1.25F, -25F, 6F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 2.25F, -3.5F, 3F, -3.25F, -3F, 3F, -3.25F, -3F, -3.5F, 2.25F, -3.5F, -3.5F); // Box 140
        bodyModel[128].setRotationPoint(29.25F, -25F, 6F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 2.25F, -3.5F, -3.5F, -3.25F, -3F, -3.5F, -3.25F, -3F, 3F, 2.25F, -3.5F, 3F); // Box 141
        bodyModel[129].setRotationPoint(29.25F, -25F, -7F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
        bodyModel[130].setRotationPoint(6.75F, -21.5F, -10F);
        bodyModel[130].rotateAngleX = -0.10471976F;

        bodyModel[131].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
        bodyModel[131].setRotationPoint(7.75F, -20F, -10.5F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144
        bodyModel[132].setRotationPoint(6.75F, -21.5F, 9F);
        bodyModel[132].rotateAngleX = 0.10471976F;

        bodyModel[133].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
        bodyModel[133].setRotationPoint(7.75F, -20F, 9.5F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 18, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 146
        bodyModel[134].setRotationPoint(-18F, -25F, -10.5F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        bodyModel[135].setRotationPoint(-18F, -25F, 5.5F);

        bodyModel[136].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 148
        bodyModel[136].setRotationPoint(-18F, -25F, 0F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 149
        bodyModel[137].setRotationPoint(-18.25F, -21F, 0F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        bodyModel[138].setRotationPoint(-37F, -13F, -8F);

        bodyModel[139].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // Box 141
        bodyModel[139].setRotationPoint(-37F, -10F, -8F);

        bodyModel[140].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // Box 142
        bodyModel[140].setRotationPoint(-37F, -10F, 6F);

        bodyModel[141].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 143
        bodyModel[141].setRotationPoint(-30F, -9F, -1F);

        bodyModel[142].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 144
        bodyModel[142].setRotationPoint(-31F, -10F, -2F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        bodyModel[143].setRotationPoint(-28F, -15F, -2F);

        bodyModel[144].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 146
        bodyModel[144].setRotationPoint(-27.5F, -17F, -1F);

        bodyModel[145].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 147
        bodyModel[145].setRotationPoint(-31F, -12.5F, -3F);

        bodyModel[146].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 148
        bodyModel[146].setRotationPoint(-31F, -12.5F, 2F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 149
        bodyModel[147].setRotationPoint(-37F, -25F, -8F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 155
        bodyModel[148].setRotationPoint(6.5F, -12F, 3F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 156
        bodyModel[149].setRotationPoint(21.5F, -12F, -4F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 157
        bodyModel[150].setRotationPoint(21.5F, -12F, 3F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 158
        bodyModel[151].setRotationPoint(22F, -9F, -9F);
        this.flipAll();
    }
}