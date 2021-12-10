package tramsim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Combino_End extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public Combino_End() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[174];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
        bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
        bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 6
        bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
        bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 8
        bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
        bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
        bodyModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 11
        bodyModel[12] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 15
        bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 16
        bodyModel[14] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 17
        bodyModel[15] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 19
        bodyModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 20
        bodyModel[17] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 21
        bodyModel[18] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 23
        bodyModel[19] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 24
        bodyModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
        bodyModel[21] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 22
        bodyModel[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 23
        bodyModel[23] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 25
        bodyModel[24] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 27
        bodyModel[25] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 28
        bodyModel[26] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 29
        bodyModel[27] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 30
        bodyModel[28] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 31
        bodyModel[29] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 32
        bodyModel[30] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 36
        bodyModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 41
        bodyModel[32] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 42
        bodyModel[33] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 51
        bodyModel[34] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 47
        bodyModel[35] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 49
        bodyModel[36] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 50
        bodyModel[37] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 52
        bodyModel[38] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 53
        bodyModel[39] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 54
        bodyModel[40] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 55
        bodyModel[41] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 56
        bodyModel[42] = new ModelRendererTurbo(this, 416, 33, textureX, textureY); // Box 59
        bodyModel[43] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 60
        bodyModel[44] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 62
        bodyModel[45] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 63
        bodyModel[46] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 64
        bodyModel[47] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 65
        bodyModel[48] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 66
        bodyModel[49] = new ModelRendererTurbo(this, 416, 33, textureX, textureY); // Box 67
        bodyModel[50] = new ModelRendererTurbo(this, 12, 46, textureX, textureY); // Box 68
        bodyModel[51] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 69
        bodyModel[52] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 70
        bodyModel[53] = new ModelRendererTurbo(this, 12, 46, textureX, textureY); // Box 71
        bodyModel[54] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 72
        bodyModel[55] = new ModelRendererTurbo(this, 416, 33, textureX, textureY); // Box 73
        bodyModel[56] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 74
        bodyModel[57] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 75
        bodyModel[58] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 76
        bodyModel[59] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 77
        bodyModel[60] = new ModelRendererTurbo(this, 416, 33, textureX, textureY); // Box 78
        bodyModel[61] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 79
        bodyModel[62] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 80
        bodyModel[63] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 81
        bodyModel[64] = new ModelRendererTurbo(this, 12, 46, textureX, textureY); // Box 82
        bodyModel[65] = new ModelRendererTurbo(this, 12, 46, textureX, textureY); // Box 83
        bodyModel[66] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 84
        bodyModel[67] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 85
        bodyModel[68] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 86
        bodyModel[69] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 87
        bodyModel[70] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 88
        bodyModel[71] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 89
        bodyModel[72] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 91
        bodyModel[73] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 92
        bodyModel[74] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 93
        bodyModel[75] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 94
        bodyModel[76] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 95
        bodyModel[77] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 96
        bodyModel[78] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 97
        bodyModel[79] = new ModelRendererTurbo(this, 27, 76, textureX, textureY); // Box 98
        bodyModel[80] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 99
        bodyModel[81] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 100
        bodyModel[82] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box 101
        bodyModel[83] = new ModelRendererTurbo(this, 0, 54, textureX, textureY); // Box 102
        bodyModel[84] = new ModelRendererTurbo(this, 7, 51, textureX, textureY); // Box 103
        bodyModel[85] = new ModelRendererTurbo(this, 14, 53, textureX, textureY); // Box 104
        bodyModel[86] = new ModelRendererTurbo(this, 13, 38, textureX, textureY); // Box 105
        bodyModel[87] = new ModelRendererTurbo(this, 0, 46, textureX, textureY); // Box 106
        bodyModel[88] = new ModelRendererTurbo(this, 13, 38, textureX, textureY); // Box 107
        bodyModel[89] = new ModelRendererTurbo(this, 14, 53, textureX, textureY); // Box 108
        bodyModel[90] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box 109
        bodyModel[91] = new ModelRendererTurbo(this, 0, 54, textureX, textureY); // Box 110
        bodyModel[92] = new ModelRendererTurbo(this, 0, 46, textureX, textureY); // Box 111
        bodyModel[93] = new ModelRendererTurbo(this, 7, 51, textureX, textureY); // Box 112
        bodyModel[94] = new ModelRendererTurbo(this, 7, 51, textureX, textureY); // Box 113
        bodyModel[95] = new ModelRendererTurbo(this, 7, 51, textureX, textureY); // Box 114
        bodyModel[96] = new ModelRendererTurbo(this, 0, 46, textureX, textureY); // Box 115
        bodyModel[97] = new ModelRendererTurbo(this, 0, 46, textureX, textureY); // Box 116
        bodyModel[98] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box 117
        bodyModel[99] = new ModelRendererTurbo(this, 0, 39, textureX, textureY); // Box 118
        bodyModel[100] = new ModelRendererTurbo(this, 0, 54, textureX, textureY); // Box 119
        bodyModel[101] = new ModelRendererTurbo(this, 0, 54, textureX, textureY); // Box 120
        bodyModel[102] = new ModelRendererTurbo(this, 13, 38, textureX, textureY); // Box 121
        bodyModel[103] = new ModelRendererTurbo(this, 13, 38, textureX, textureY); // Box 122
        bodyModel[104] = new ModelRendererTurbo(this, 14, 53, textureX, textureY); // Box 123
        bodyModel[105] = new ModelRendererTurbo(this, 14, 53, textureX, textureY); // Box 124
        bodyModel[106] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 125
        bodyModel[107] = new ModelRendererTurbo(this, 10, 39, textureX, textureY); // Box 126
        bodyModel[108] = new ModelRendererTurbo(this, 10, 39, textureX, textureY); // Box 127
        bodyModel[109] = new ModelRendererTurbo(this, 0, 62, textureX, textureY); // Box 129
        bodyModel[110] = new ModelRendererTurbo(this, 10, 39, textureX, textureY); // Box 130
        bodyModel[111] = new ModelRendererTurbo(this, 10, 39, textureX, textureY); // Box 131
        bodyModel[112] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 132
        bodyModel[113] = new ModelRendererTurbo(this, 0, 62, textureX, textureY); // Box 133
        bodyModel[114] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 134
        bodyModel[115] = new ModelRendererTurbo(this, 13, 62, textureX, textureY); // Box 135
        bodyModel[116] = new ModelRendererTurbo(this, 10, 39, textureX, textureY); // Box 136
        bodyModel[117] = new ModelRendererTurbo(this, 10, 39, textureX, textureY); // Box 137
        bodyModel[118] = new ModelRendererTurbo(this, 10, 39, textureX, textureY); // Box 138
        bodyModel[119] = new ModelRendererTurbo(this, 10, 39, textureX, textureY); // Box 139
        bodyModel[120] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 140
        bodyModel[121] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 141
        bodyModel[122] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 144
        bodyModel[123] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 146
        bodyModel[124] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 147
        bodyModel[125] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 148
        bodyModel[126] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 149
        bodyModel[127] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 150
        bodyModel[128] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Box 151
        bodyModel[129] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 152
        bodyModel[130] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 153
        bodyModel[131] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 154
        bodyModel[132] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 155
        bodyModel[133] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 156
        bodyModel[134] = new ModelRendererTurbo(this, 0, 62, textureX, textureY); // Box 157
        bodyModel[135] = new ModelRendererTurbo(this, 0, 62, textureX, textureY); // Box 158
        bodyModel[136] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 148
        bodyModel[137] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 149
        bodyModel[138] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 150
        bodyModel[139] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 151
        bodyModel[140] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 152
        bodyModel[141] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 153
        bodyModel[142] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 154
        bodyModel[143] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 155
        bodyModel[144] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 156
        bodyModel[145] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 157
        bodyModel[146] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 158
        bodyModel[147] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 159
        bodyModel[148] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 160
        bodyModel[149] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 161
        bodyModel[150] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 162
        bodyModel[151] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 163
        bodyModel[152] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 164
        bodyModel[153] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 165
        bodyModel[154] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 166
        bodyModel[155] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 167
        bodyModel[156] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 168
        bodyModel[157] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 169
        bodyModel[158] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 170
        bodyModel[159] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 172
        bodyModel[160] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 173
        bodyModel[161] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 174
        bodyModel[162] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 175
        bodyModel[163] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 197
        bodyModel[164] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 198
        bodyModel[165] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 199
        bodyModel[166] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 201
        bodyModel[167] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 202
        bodyModel[168] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 203
        bodyModel[169] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 204
        bodyModel[170] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 206
        bodyModel[171] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 207
        bodyModel[172] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 208
        bodyModel[173] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 209

        bodyModel[0].addBox(0F, 0F, 0F, 35, 2, 22, 0F); // Box 0
        bodyModel[0].setRotationPoint(-11F, 6F, -11F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 1, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1
        bodyModel[1].setRotationPoint(-23F, 6F, -11F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 1, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -0.85F); // Box 2
        bodyModel[2].setRotationPoint(-23F, 7F, -11F);

        bodyModel[3].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 3
        bodyModel[3].setRotationPoint(-5F, -10F, -11F);

        bodyModel[4].addBox(0F, 0F, 0F, 29, 5, 1, 0F); // Box 4
        bodyModel[4].setRotationPoint(-5F, 1F, -11F);

        bodyModel[5].addBox(0F, 0F, 0F, 6, 11, 1, 0F); // Box 5
        bodyModel[5].setRotationPoint(18F, -10F, -11F);

        bodyModel[6].addBox(0F, 0F, 0F, 35, 5, 1, 0F); // Box 6
        bodyModel[6].setRotationPoint(-11F, -15F, -11F);

        bodyModel[7].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 7
        bodyModel[7].setRotationPoint(10F, -8F, -11F);

        bodyModel[8].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 8
        bodyModel[8].setRotationPoint(9F, -10F, -11F);

        bodyModel[9].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 9
        bodyModel[9].setRotationPoint(9F, -10F, 10F);

        bodyModel[10].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 10
        bodyModel[10].setRotationPoint(10F, -8F, 10F);

        bodyModel[11].addBox(0F, 0F, 0F, 6, 11, 1, 0F); // Box 11
        bodyModel[11].setRotationPoint(18F, -10F, 10F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 35, 2, 22, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        bodyModel[12].setRotationPoint(-11F, -17F, -11F);

        bodyModel[13].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 16
        bodyModel[13].setRotationPoint(-11F, -10F, -11F);

        bodyModel[14].addBox(0F, 0F, 0F, 35, 5, 1, 0F); // Box 17
        bodyModel[14].setRotationPoint(-11F, -15F, 10F);

        bodyModel[15].addBox(0F, 0F, 0F, 35, 5, 1, 0F); // Box 19
        bodyModel[15].setRotationPoint(-11F, 1F, 10F);

        bodyModel[16].addBox(0F, 0F, 0F, 11, 11, 1, 0F); // Box 20
        bodyModel[16].setRotationPoint(-11F, -10F, 10F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, 0F); // Box 21
        bodyModel[17].setRotationPoint(-23F, 1F, -9F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 23
        bodyModel[18].setRotationPoint(-23F, 0F, -9F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,-1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 24
        bodyModel[19].setRotationPoint(-23F, 1F, 8F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.34F, 0F, 0F, -0.18F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.34F, 0F, 0F, -0.18F, -1F, 0F, 0F); // Box 21
        bodyModel[20].setRotationPoint(-23F, 0F, -9F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, -0.18F, 0F, 0F, 0.34F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.18F, 0F, 0F, 0.34F, 0F, 0F, 0F); // Box 22
        bodyModel[21].setRotationPoint(-23F, 0F, 8F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1F, 0F, 0.17F, 1F, 0F, 0.5F, 1F, 0F, -0.36F, -2F, 0F, -0.18F, 0F, 0F, 0F, 0F, 0F, 0.34F, 0F, 0F, -0.18F, -1F, 0F, 0F); // Box 23
        bodyModel[22].setRotationPoint(-23F, -8F, -9F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-2F, 0F, -0.18F, 1F, 0F, -0.36F, 1F, 0F, 0.5F, -1F, 0F, 0.17F, -1F, 0F, 0F, 0F, 0F, -0.18F, 0F, 0F, 0.34F, 0F, 0F, 0F); // Box 25
        bodyModel[23].setRotationPoint(-23F, -8F, 8F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-1F, 0F, 0.18F, 1F, 0F, -0.82F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[24].setRotationPoint(-23F, -8F, -9F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.82F, -1F, 0F, 0.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 28
        bodyModel[25].setRotationPoint(-23F, -8F, 8F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2F, 0F, 0.5F, 2F, 0F, 0.83F, 2F, 0F, -0.72F, -3F, 0F, -0.55F, 0F, 0F, 0.18F, 0F, 0F, 0.5F, 0F, 0F, -0.36F, -1F, 0F, -0.18F); // Box 29
        bodyModel[26].setRotationPoint(-22F, -13F, -9F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0.5F, 2F, 0F, -0.45F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.18F, 0F, 0F, -0.826F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[27].setRotationPoint(-22F, -13F, -9F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.45F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.826F, 0F, 0F, 0.18F); // Box 31
        bodyModel[28].setRotationPoint(-22F, -13F, 8F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-3F, 0F, -0.55F, 2F, 0F, -0.72F, 2F, 0F, 0.83F, -2F, 0F, 0.5F, -1F, 0F, -0.18F, 0F, 0F, -0.36F, 0F, 0F, 0.5F, 0F, 0F, 0.18F); // Box 32
        bodyModel[29].setRotationPoint(-22F, -13F, 8F);

        bodyModel[30].addBox(0F, 0F, 0F, 1, 21, 4, 0F); // Box 36
        bodyModel[30].setRotationPoint(-11F, -15F, -10F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 0.57F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0.5F); // Box 41
        bodyModel[31].setRotationPoint(-20F, -14F, 8F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 0.7F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, 0.57F); // Box 42
        bodyModel[32].setRotationPoint(-19F, -15F, 8F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.125F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.125F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[33].setRotationPoint(-23F, -1F, -4F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 47
        bodyModel[34].setRotationPoint(23F, -10F, -10F);

        bodyModel[35].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 49
        bodyModel[35].setRotationPoint(23F, -15F, -10F);

        bodyModel[36].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 50
        bodyModel[36].setRotationPoint(24F, -11F, -9F);

        bodyModel[37].addBox(0F, 0F, 0F, 4, 2, 18, 0F); // Box 52
        bodyModel[37].setRotationPoint(24F, -14F, -9F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 21, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, -5F, 0F, -2F); // Box 53
        bodyModel[38].setRotationPoint(-11F, -15F, -6F);

        bodyModel[39].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 54
        bodyModel[39].setRotationPoint(-6F, -15F, 0F);

        bodyModel[40].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 55
        bodyModel[40].setRotationPoint(24F, 6F, -9F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-2F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1.75F, -2F, 1F, 1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1.5F, 0F, 0.7F); // Box 56
        bodyModel[41].setRotationPoint(-17F, -16F, 8F);

        bodyModel[42].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 59
        bodyModel[42].setRotationPoint(1.5F, 2F, 2F);

        bodyModel[43].addBox(0F, 0F, 0F, 8, 3, 8, 0F); // Box 60
        bodyModel[43].setRotationPoint(-1.5F, 3F, 2F);

        bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 62
        bodyModel[44].setRotationPoint(2F, -1F, 2F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[45].setRotationPoint(1.5F, 0F, 2F);

        bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 64
        bodyModel[46].setRotationPoint(2F, -1F, -10F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[47].setRotationPoint(1.5F, 0F, -10F);

        bodyModel[48].addBox(0F, 0F, 0F, 8, 3, 8, 0F); // Box 66
        bodyModel[48].setRotationPoint(-1.5F, 3F, -10F);

        bodyModel[49].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 67
        bodyModel[49].setRotationPoint(1.5F, 2F, -10F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 68
        bodyModel[50].setRotationPoint(-1.5F, 2.9F, -10F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 69
        bodyModel[51].setRotationPoint(-1.5F, 2.9F, -6F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 70
        bodyModel[52].setRotationPoint(-1.5F, 2.9F, 2F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 71
        bodyModel[53].setRotationPoint(-1.5F, 2.9F, 6F);

        bodyModel[54].addBox(0F, 0F, 0F, 8, 3, 8, 0F); // Box 72
        bodyModel[54].setRotationPoint(12.5F, 3F, 2F);

        bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 73
        bodyModel[55].setRotationPoint(15.5F, 2F, 2F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[56].setRotationPoint(15.5F, 0F, 2F);

        bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 75
        bodyModel[57].setRotationPoint(16F, -1F, 2F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 76
        bodyModel[58].setRotationPoint(12.5F, 2.9F, 2F);

        bodyModel[59].addBox(0F, 0F, 0F, 8, 3, 8, 0F); // Box 77
        bodyModel[59].setRotationPoint(12.5F, 3F, -10F);

        bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 78
        bodyModel[60].setRotationPoint(15.5F, 2F, -10F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        bodyModel[61].setRotationPoint(15.5F, 0F, -10F);

        bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 80
        bodyModel[62].setRotationPoint(16F, -1F, -10F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 81
        bodyModel[63].setRotationPoint(12.5F, 2.9F, -6F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 82
        bodyModel[64].setRotationPoint(16.5F, 2.9F, -10F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 83
        bodyModel[65].setRotationPoint(16.5F, 2.9F, 6F);

        bodyModel[66].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 84
        bodyModel[66].setRotationPoint(6.5F, 3F, 7F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 85
        bodyModel[67].setRotationPoint(8.5F, 1F, 6F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 86
        bodyModel[68].setRotationPoint(9F, 1F, 5.25F);

        bodyModel[69].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 87
        bodyModel[69].setRotationPoint(8F, 1F, 7F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        bodyModel[70].setRotationPoint(3F, 2F, 7F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        bodyModel[71].setRotationPoint(3F, 1F, 7F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        bodyModel[72].setRotationPoint(11F, 1F, 7F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
        bodyModel[73].setRotationPoint(11F, 2F, 7F);

        bodyModel[74].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 93
        bodyModel[74].setRotationPoint(8F, 1F, -10F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 94
        bodyModel[75].setRotationPoint(9F, 1F, -6.25F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 95
        bodyModel[76].setRotationPoint(8.5F, 1F, -7F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
        bodyModel[77].setRotationPoint(11F, 2F, -10F);

        bodyModel[78].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 97
        bodyModel[78].setRotationPoint(6.5F, 3F, -10F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 98
        bodyModel[79].setRotationPoint(11F, 1F, -10F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[80].setRotationPoint(3F, 2F, -10F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 100
        bodyModel[81].setRotationPoint(3F, 1F, -10F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 101
        bodyModel[82].setRotationPoint(1.5F, 2F, -6F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 102
        bodyModel[83].setRotationPoint(1.5F, 2F, -10F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 103
        bodyModel[84].setRotationPoint(2F, -1F, -10F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 104
        bodyModel[85].setRotationPoint(1.5F, 0F, -10F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 105
        bodyModel[86].setRotationPoint(1.5F, 0F, -6F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 106
        bodyModel[87].setRotationPoint(2F, -1F, -6F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 107
        bodyModel[88].setRotationPoint(1.5F, 0F, 2F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 108
        bodyModel[89].setRotationPoint(1.5F, 0F, 6F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 109
        bodyModel[90].setRotationPoint(1.5F, 2F, 2F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 110
        bodyModel[91].setRotationPoint(1.5F, 2F, 6F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 111
        bodyModel[92].setRotationPoint(2F, -1F, 2F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 112
        bodyModel[93].setRotationPoint(2F, -1F, 6F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 113
        bodyModel[94].setRotationPoint(17F, -1F, -10F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 114
        bodyModel[95].setRotationPoint(17F, -1F, 6F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 115
        bodyModel[96].setRotationPoint(16F, -1F, 2F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 116
        bodyModel[97].setRotationPoint(16F, -1F, -6F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 117
        bodyModel[98].setRotationPoint(15.5F, 2F, 2F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 118
        bodyModel[99].setRotationPoint(15.5F, 2F, -6F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 119
        bodyModel[100].setRotationPoint(16.5F, 2F, 6F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 120
        bodyModel[101].setRotationPoint(16.5F, 2F, -10F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 121
        bodyModel[102].setRotationPoint(15.5F, 0F, 2F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 122
        bodyModel[103].setRotationPoint(15.5F, 0F, -6F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 123
        bodyModel[104].setRotationPoint(16.5F, 0F, 6F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 124
        bodyModel[105].setRotationPoint(16.5F, 0F, -10F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 125
        bodyModel[106].setRotationPoint(16F, -2F, -6F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 126
        bodyModel[107].setRotationPoint(16F, -2.2F, -6F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 127
        bodyModel[108].setRotationPoint(16F, -2.2F, -3F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 129
        bodyModel[109].setRotationPoint(16F, -2.8F, -6F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 130
        bodyModel[110].setRotationPoint(16F, -2.2F, 5F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 131
        bodyModel[111].setRotationPoint(16F, -2.2F, 2F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 132
        bodyModel[112].setRotationPoint(16F, -2F, 2F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 133
        bodyModel[113].setRotationPoint(16F, -2.8F, 2F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 134
        bodyModel[114].setRotationPoint(2F, -2F, 2F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 135
        bodyModel[115].setRotationPoint(2F, -2F, -6F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 136
        bodyModel[116].setRotationPoint(2F, -2.2F, -6F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 137
        bodyModel[117].setRotationPoint(2F, -2.2F, 5F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 138
        bodyModel[118].setRotationPoint(2F, -2.2F, 2F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 139
        bodyModel[119].setRotationPoint(2F, -2.2F, -3F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        bodyModel[120].setRotationPoint(24F, -2F, -9F);

        bodyModel[121].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 141
        bodyModel[121].setRotationPoint(24F, 1F, -9F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 144
        bodyModel[122].setRotationPoint(24F, -12F, -9F);

        bodyModel[123].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 146
        bodyModel[123].setRotationPoint(24F, 1F, 6F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        bodyModel[124].setRotationPoint(24F, -2F, 6F);

        bodyModel[125].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 148
        bodyModel[125].setRotationPoint(24F, -11F, 8F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
        bodyModel[126].setRotationPoint(24F, -12F, 7F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 150
        bodyModel[127].setRotationPoint(23F, -1F, -10F);

        bodyModel[128].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 151
        bodyModel[128].setRotationPoint(23F, 1F, -10F);

        bodyModel[129].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 152
        bodyModel[129].setRotationPoint(23F, 1F, 6F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
        bodyModel[130].setRotationPoint(23F, -1F, 7F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 154
        bodyModel[131].setRotationPoint(23F, -10F, 7F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 155
        bodyModel[132].setRotationPoint(23F, -11F, -10F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        bodyModel[133].setRotationPoint(23F, -11F, 6F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 157
        bodyModel[134].setRotationPoint(2F, -2.8F, -6F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.4F, -0.8F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 158
        bodyModel[135].setRotationPoint(2F, -2.8F, 2F);

        bodyModel[136].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 148
        bodyModel[136].setRotationPoint(-14.5F, 3F, -2F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
        bodyModel[137].setRotationPoint(-11.5F, -2F, -2F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 150
        bodyModel[138].setRotationPoint(-14.5F, 2.9F, -2F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 151
        bodyModel[139].setRotationPoint(-11.5F, -2F, -2F);

        bodyModel[140].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 152
        bodyModel[140].setRotationPoint(-13.5F, 0F, -3F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
        bodyModel[141].setRotationPoint(-11F, -4F, -2F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 154
        bodyModel[142].setRotationPoint(-11F, -4F, -2F);

        bodyModel[143].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 155
        bodyModel[143].setRotationPoint(-13.5F, 0F, 2F);

        bodyModel[144].addBox(0F, 0F, 0F, 2, 6, 6, 0F); // Box 156
        bodyModel[144].setRotationPoint(-22F, 0F, -3F);

        bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 157
        bodyModel[145].setRotationPoint(-18F, -1F, -3F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[146].setRotationPoint(-20F, -1F, -3F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, -2F, 0F, 0F); // Box 159
        bodyModel[147].setRotationPoint(-18F, -1F, 3F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 160
        bodyModel[148].setRotationPoint(-20F, -1F, 3F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[149].setRotationPoint(-20F, -1F, -8F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 162
        bodyModel[150].setRotationPoint(-18F, -1F, -8F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 163
        bodyModel[151].setRotationPoint(-22F, 0F, 3F);

        bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
        bodyModel[152].setRotationPoint(-22F, 0F, -8F);

        bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
        bodyModel[153].setRotationPoint(-18.5F, 4F, -2F);
        bodyModel[153].rotateAngleZ = -0.52359878F;

        bodyModel[154].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 166
        bodyModel[154].setRotationPoint(-5F, -15F, -2F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 167
        bodyModel[155].setRotationPoint(-5F, -15F, -4F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 27, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 168
        bodyModel[156].setRotationPoint(-5F, -15F, 2F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 169
        bodyModel[157].setRotationPoint(-7F, -15F, -2F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -1F, -0.5F, -0.625F); // Box 170
        bodyModel[158].setRotationPoint(-9F, -15F, -4F);

        bodyModel[159].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 172
        bodyModel[159].setRotationPoint(-6F, -10F, 0F);

        bodyModel[160].addBox(0F, 0F, 0F, 1, 16, 3, 0F); // Box 173
        bodyModel[160].setRotationPoint(-6F, -10F, 7F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 16, 5, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 174
        bodyModel[161].setRotationPoint(-6F, -10F, 2F);

        bodyModel[162].addShapeBox(-5F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 175
        bodyModel[162].setRotationPoint(-5F, -10F, -11F);

        bodyModel[163].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.5F, 0F, 0.57F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 197
        bodyModel[163].setRotationPoint(-20F, -14F, -9F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.5F, 0F, 0.7F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.57F, 0F, 0F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 198
        bodyModel[164].setRotationPoint(-19F, -15F, -9F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-2F, 1F, 1F, 0F, 1F, 1.75F, 0F, 1F, -1F, -2F, 1F, -1F, 1.5F, 0F, 0.7F, 0F, 0F, 2F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 199
        bodyModel[165].setRotationPoint(-17F, -16F, -9F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 201
        bodyModel[166].setRotationPoint(-20F, -14F, 0F);

        bodyModel[167].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.62F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.45F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F); // Box 202
        bodyModel[167].setRotationPoint(-20F, -15F, 0F);

        bodyModel[168].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.71F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.7F, 0.62F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.45F); // Box 203
        bodyModel[168].setRotationPoint(-20F, -16F, 0F);

        bodyModel[169].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.82F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.71F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.7F); // Box 204
        bodyModel[169].setRotationPoint(-20F, -17F, 0F);

        bodyModel[170].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.82F, 0.4F, 0F, 0F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 0F, 0.71F, 0F, 0F); // Box 206
        bodyModel[170].setRotationPoint(-20F, -17F, -8F);

        bodyModel[171].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 0F, 0.71F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F, 1F, 0F, 0F, 0F, 0.62F, 0F, 0F); // Box 207
        bodyModel[171].setRotationPoint(-20F, -16F, -8F);

        bodyModel[172].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0.45F, 0F, 0F, 1F, 0F, 0F, 0F, 0.62F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 0F, 0.55F, 0F, 0F); // Box 208
        bodyModel[172].setRotationPoint(-20F, -15F, -8F);

        bodyModel[173].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 209
        bodyModel[173].setRotationPoint(-20F, -14F, -8F);
        this.flipAll();
    }
}