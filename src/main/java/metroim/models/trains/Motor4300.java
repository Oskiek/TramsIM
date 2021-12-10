package metroim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Motor4300 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public Motor4300() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[167];

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
        bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
        bodyModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 8
        bodyModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 9
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
        bodyModel[21] = new ModelRendererTurbo(this, 418, 19, textureX, textureY); // Box 23
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
        bodyModel[32] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 45
        bodyModel[33] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 48
        bodyModel[34] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 50
        bodyModel[35] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 51
        bodyModel[36] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 52
        bodyModel[37] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 53
        bodyModel[38] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 54
        bodyModel[39] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 55
        bodyModel[40] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 56
        bodyModel[41] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 58
        bodyModel[42] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 59
        bodyModel[43] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 61
        bodyModel[44] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 62
        bodyModel[45] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 63
        bodyModel[46] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 64
        bodyModel[47] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 67
        bodyModel[48] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 69
        bodyModel[49] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 70
        bodyModel[50] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 71
        bodyModel[51] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 72
        bodyModel[52] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 73
        bodyModel[53] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
        bodyModel[54] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 75
        bodyModel[55] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 92
        bodyModel[56] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 93
        bodyModel[57] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 95
        bodyModel[58] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 96
        bodyModel[59] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 97
        bodyModel[60] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 99
        bodyModel[61] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 100
        bodyModel[62] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 101
        bodyModel[63] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 102
        bodyModel[64] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 103
        bodyModel[65] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 104
        bodyModel[66] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 106
        bodyModel[67] = new ModelRendererTurbo(this, 238, 57, textureX, textureY); // Box 108
        bodyModel[68] = new ModelRendererTurbo(this, 118, 65, textureX, textureY); // Box 109
        bodyModel[69] = new ModelRendererTurbo(this, 143, 65, textureX, textureY); // Box 110
        bodyModel[70] = new ModelRendererTurbo(this, 166, 65, textureX, textureY); // Box 111
        bodyModel[71] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 112
        bodyModel[72] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 113
        bodyModel[73] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 114
        bodyModel[74] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 115
        bodyModel[75] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 116
        bodyModel[76] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 117
        bodyModel[77] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 118
        bodyModel[78] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 119
        bodyModel[79] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 120
        bodyModel[80] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 122
        bodyModel[81] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 123
        bodyModel[82] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 124
        bodyModel[83] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 125
        bodyModel[84] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 126
        bodyModel[85] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 128
        bodyModel[86] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 129
        bodyModel[87] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 130
        bodyModel[88] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 131
        bodyModel[89] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 132
        bodyModel[90] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 138
        bodyModel[91] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 139
        bodyModel[92] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 128
        bodyModel[93] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 129
        bodyModel[94] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 130
        bodyModel[95] = new ModelRendererTurbo(this, 154, 65, textureX, textureY); // Box 128
        bodyModel[96] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 129
        bodyModel[97] = new ModelRendererTurbo(this, 154, 65, textureX, textureY); // Box 130
        bodyModel[98] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 131
        bodyModel[99] = new ModelRendererTurbo(this, 5, 94, textureX, textureY); // Box 4
        bodyModel[100] = new ModelRendererTurbo(this, 4, 97, textureX, textureY); // Box 140
        bodyModel[101] = new ModelRendererTurbo(this, 4, 97, textureX, textureY); // Box 142
        bodyModel[102] = new ModelRendererTurbo(this, 4, 97, textureX, textureY); // Box 143
        bodyModel[103] = new ModelRendererTurbo(this, 4, 97, textureX, textureY); // Box 144
        bodyModel[104] = new ModelRendererTurbo(this, 4, 97, textureX, textureY); // Box 145
        bodyModel[105] = new ModelRendererTurbo(this, 5, 94, textureX, textureY); // Box 146
        bodyModel[106] = new ModelRendererTurbo(this, 4, 97, textureX, textureY); // Box 147
        bodyModel[107] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 166
        bodyModel[108] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 168
        bodyModel[109] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 130
        bodyModel[110] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 131
        bodyModel[111] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 132
        bodyModel[112] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 133
        bodyModel[113] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 134
        bodyModel[114] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 135
        bodyModel[115] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 137
        bodyModel[116] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 138
        bodyModel[117] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 139
        bodyModel[118] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 140
        bodyModel[119] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 141
        bodyModel[120] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 142
        bodyModel[121] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 143
        bodyModel[122] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 144
        bodyModel[123] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 158
        bodyModel[124] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 159
        bodyModel[125] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 160
        bodyModel[126] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 155
        bodyModel[127] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 156
        bodyModel[128] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 157
        bodyModel[129] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 158
        bodyModel[130] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 159
        bodyModel[131] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 160
        bodyModel[132] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 161
        bodyModel[133] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 162
        bodyModel[134] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 163
        bodyModel[135] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 164
        bodyModel[136] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 165
        bodyModel[137] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 166
        bodyModel[138] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 167
        bodyModel[139] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 168
        bodyModel[140] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 169
        bodyModel[141] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 170
        bodyModel[142] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 171
        bodyModel[143] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 172
        bodyModel[144] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 173
        bodyModel[145] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 174
        bodyModel[146] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 175
        bodyModel[147] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 178
        bodyModel[148] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 174
        bodyModel[149] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 176
        bodyModel[150] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 177
        bodyModel[151] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 180
        bodyModel[152] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 172
        bodyModel[153] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 173
        bodyModel[154] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 174
        bodyModel[155] = new ModelRendererTurbo(this, 2, 88, textureX, textureY); // Box 162
        bodyModel[156] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 163
        bodyModel[157] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 163
        bodyModel[158] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 164
        bodyModel[159] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 165
        bodyModel[160] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 166
        bodyModel[161] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 167
        bodyModel[162] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 168
        bodyModel[163] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 163
        bodyModel[164] = new ModelRendererTurbo(this, 3, 42, textureX, textureY); // Box 164
        bodyModel[165] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 165
        bodyModel[166] = new ModelRendererTurbo(this, 3, 42, textureX, textureY); // Box 166

        bodyModel[0].addShapeBox(0F, 0F, 0F, 52, 1, 18, 0F,4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F); // Box 0
        bodyModel[0].setRotationPoint(-18F, 0F, -9F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 16, 0F,0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 1F); // Box 1
        bodyModel[1].setRotationPoint(-26F, 0F, -8F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0.2F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 0F, -0.5F); // Box 2
        bodyModel[2].setRotationPoint(-30F, 0F, -7F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 18, 1, 0F,0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 3
        bodyModel[3].setRotationPoint(-26F, -18F, -9F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 19, 18, 1, 0F,0F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 4
        bodyModel[4].setRotationPoint(-3F, -18F, -9F);

        bodyModel[5].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 5
        bodyModel[5].setRotationPoint(-11F, -19F, -9F);

        bodyModel[6].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 6
        bodyModel[6].setRotationPoint(18F, -19F, -9F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        bodyModel[7].setRotationPoint(-18F, -18F, 8F);

        bodyModel[8].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 9
        bodyModel[8].setRotationPoint(-11F, -19F, 8F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 19, 18, 1, 0F,0F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[9].setRotationPoint(-3F, -18F, 8F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        bodyModel[10].setRotationPoint(18F, -19F, 8F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[11].setRotationPoint(26F, -18F, -9F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        bodyModel[12].setRotationPoint(26F, -18F, 8F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        bodyModel[13].setRotationPoint(-18F, -18F, -9F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 52, 1, 16, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bodyModel[14].setRotationPoint(-18F, -20F, -8F);

        bodyModel[15].addShapeBox(0F, -3F, 0F, 52, 5, 1, 0F,0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 17
        bodyModel[15].setRotationPoint(-18F, -21F, 8F);

        bodyModel[16].addShapeBox(0F, -3F, 0F, 52, 5, 1, 0F,0F, -2F, -0.5F, 2F, -2F, -0.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 18
        bodyModel[16].setRotationPoint(-18F, -21F, -9F);

        bodyModel[17].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 19
        bodyModel[17].setRotationPoint(-18F, -4F, -7F);

        bodyModel[18].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 20
        bodyModel[18].setRotationPoint(-18F, -4F, 4F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 21
        bodyModel[19].setRotationPoint(-1F, -4F, 4F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 22
        bodyModel[20].setRotationPoint(-1F, -4F, -7F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F,-1F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, -1F, -0.3F, 0.2F, 0F, -0.3F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, -0.3F); // Box 23
        bodyModel[21].setRotationPoint(-27F, -24F, -7F);

        bodyModel[22].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 24
        bodyModel[22].setRotationPoint(28F, -4F, -7F);

        bodyModel[23].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 25
        bodyModel[23].setRotationPoint(28F, -4F, 4F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[24].setRotationPoint(34F, -18F, -8F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[25].setRotationPoint(34F, -18F, 5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[26].setRotationPoint(26F, -16F, 7F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 18, 1, 0F,0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[27].setRotationPoint(-26F, -18F, 8F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 50, 2, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[28].setRotationPoint(-18F, -19F, -8F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 50, 2, 2, 0F,0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 29
        bodyModel[29].setRotationPoint(-18F, -19F, 6F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[30].setRotationPoint(34F, -19F, -5F);

        bodyModel[31].addBox(0F, 0F, 0F, 1, 19, 16, 0F); // Box 32
        bodyModel[31].setRotationPoint(-19F, -19F, -8F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-1F, -2F, -0.8F, 0F, -2F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 45
        bodyModel[32].setRotationPoint(-26F, -24F, -9F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,-0.1F, 0F, 1.35F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, -0.1F, 0F, 1.35F, 0.2F, 0F, 0.3F, 0F, 0F, 0.6F, 0F, 0F, 0.5F, 0.2F, 0F, 0.3F); // Box 48
        bodyModel[33].setRotationPoint(-30F, -4F, -4F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,-0.8F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -0.8F, 0F, 0.5F, 0F, 0F, -0.15F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0F, 0F, 0F, -0.15F); // Box 50
        bodyModel[34].setRotationPoint(-29.9F, -9F, -5.5F);

        bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 51
        bodyModel[35].setRotationPoint(-23F, -5F, -2F);

        bodyModel[36].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 52
        bodyModel[36].setRotationPoint(-20F, -10F, -2F);

        bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 53
        bodyModel[37].setRotationPoint(-23F, -7F, -3F);

        bodyModel[38].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 54
        bodyModel[38].setRotationPoint(-23F, -7F, 2F);

        bodyModel[39].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 55
        bodyModel[39].setRotationPoint(-22F, -4F, -1F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 56
        bodyModel[40].setRotationPoint(-20F, -12F, -1F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
        bodyModel[41].setRotationPoint(-29F, -6.5F, -6F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,-0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
        bodyModel[42].setRotationPoint(-29F, -9.5F, -6F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0.2F, 1F, 0.7F, 0F, 1F, 1F, 0F, 1F, 1F, 0.2F, 1F, 0.7F, 2.1F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0.1F, 2.1F, 0F, 0F); // Box 61
        bodyModel[43].setRotationPoint(-27F, -18F, -6F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 62
        bodyModel[44].setRotationPoint(16F, -16F, 7F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[45].setRotationPoint(-3F, -16F, 7F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 64
        bodyModel[46].setRotationPoint(-13F, -16F, 7F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 67
        bodyModel[47].setRotationPoint(16F, -16F, -8F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F); // Box 69
        bodyModel[48].setRotationPoint(-25F, -23F, -7F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 70
        bodyModel[49].setRotationPoint(-18F, -8F, -8F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 71
        bodyModel[50].setRotationPoint(-1F, -8F, -8F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 72
        bodyModel[51].setRotationPoint(28F, -8F, -8F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        bodyModel[52].setRotationPoint(28F, -8F, 7F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[53].setRotationPoint(-1F, -8F, 7F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
        bodyModel[54].setRotationPoint(-18F, -8F, 7F);

        bodyModel[55].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 92
        bodyModel[55].setRotationPoint(1.5F, 1F, -8F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 2F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F); // Box 93
        bodyModel[56].setRotationPoint(-30F, 1F, -9F);

        bodyModel[57].addBox(0F, 0F, 0F, 4, 4, 16, 0F); // Box 95
        bodyModel[57].setRotationPoint(-3F, 1F, -8F);

        bodyModel[58].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 96
        bodyModel[58].setRotationPoint(1F, 1F, 4F);

        bodyModel[59].addBox(0F, 0F, 0F, 10, 5, 4, 0F); // Box 97
        bodyModel[59].setRotationPoint(2F, 1F, -2F);

        bodyModel[60].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 99
        bodyModel[60].setRotationPoint(-29F, 3F, -1F);

        bodyModel[61].addBox(0F, 0F, 0F, 3, 3, 4, 0F); // Box 100
        bodyModel[61].setRotationPoint(-32F, 2F, -2F);

        bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 101
        bodyModel[62].setRotationPoint(-32F, 4F, 2F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        bodyModel[63].setRotationPoint(-28F, 3F, -7F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F); // Box 103
        bodyModel[64].setRotationPoint(-28F, 3F, 3F);

        bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 104
        bodyModel[65].setRotationPoint(-28F, 5F, -3F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 106
        bodyModel[66].setRotationPoint(-27F, 2.5F, 5F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[67].setRotationPoint(-11F, -16F, -9F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[68].setRotationPoint(18F, -16F, -9F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[69].setRotationPoint(18F, -16F, 8F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[70].setRotationPoint(-11F, -16F, 8F);

        bodyModel[71].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 112
        bodyModel[71].setRotationPoint(-15F, -23F, -7F);

        bodyModel[72].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 113
        bodyModel[72].setRotationPoint(-10F, -24F, -7F);

        bodyModel[73].addBox(0F, 0F, 0F, 6, 3, 10, 0F); // Box 114
        bodyModel[73].setRotationPoint(0F, -23F, -4F);

        bodyModel[74].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 115
        bodyModel[74].setRotationPoint(7F, -24F, -6F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[75].setRotationPoint(22F, -23F, -1F);

        bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 117
        bodyModel[76].setRotationPoint(23F, -21F, -4F);

        bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 118
        bodyModel[77].setRotationPoint(19F, -21F, -4F);

        bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 119
        bodyModel[78].setRotationPoint(19F, -21F, 3F);

        bodyModel[79].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 120
        bodyModel[79].setRotationPoint(23F, -21F, 3F);

        bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 122
        bodyModel[80].setRotationPoint(21F, -23F, -4F);

        bodyModel[81].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 123
        bodyModel[81].setRotationPoint(19F, -22F, -4F);

        bodyModel[82].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 124
        bodyModel[82].setRotationPoint(19F, -22F, 3F);

        bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 125
        bodyModel[83].setRotationPoint(30F, -26F, -2F);

        bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 126
        bodyModel[84].setRotationPoint(21F, -30F, -7F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 128
        bodyModel[85].setRotationPoint(22F, -26F, -2F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F); // Box 129
        bodyModel[86].setRotationPoint(22F, -26F, 1F);

        bodyModel[87].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 130
        bodyModel[87].setRotationPoint(19F, -30F, -7F);

        bodyModel[88].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 131
        bodyModel[88].setRotationPoint(19F, -29F, 3F);

        bodyModel[89].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 132
        bodyModel[89].setRotationPoint(19F, -29F, -4F);

        bodyModel[90].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 138
        bodyModel[90].setRotationPoint(33F, 1F, -1F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 139
        bodyModel[91].setRotationPoint(37F, 2F, -2F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
        bodyModel[92].setRotationPoint(26F, -16F, -8F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 129
        bodyModel[93].setRotationPoint(-3F, -16F, -8F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[94].setRotationPoint(-13F, -16F, -8F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[95].setRotationPoint(22F, -16F, 8F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        bodyModel[96].setRotationPoint(22F, -16F, -9F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[97].setRotationPoint(-7F, -16F, 8F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[98].setRotationPoint(-7F, -16F, -9F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, -0.6F, -0.3F, -0.2F, -0.6F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 4
        bodyModel[99].setRotationPoint(-30.15F, -2.5F, 4.5F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.6F, 0F, 0F, -0.6F, -0.3F, -0.2F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.3F); // Box 140
        bodyModel[100].setRotationPoint(-30.15F, -2.5F, 5.5F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.6F, -0.3F, -0.2F, -0.6F, 0F, 0F, 0F, -0.3F, 0F); // Box 142
        bodyModel[101].setRotationPoint(-30.15F, -1.5F, 4.5F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, -0.6F, 0F, 0F, -0.6F, -0.3F, -0.2F, 0F, -0.6F, -0.5F); // Box 143
        bodyModel[102].setRotationPoint(-30.15F, -1.5F, 5.5F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, -0.6F, 0F, 0F, -0.6F, -0.3F, -0.2F, 0F, -0.6F, -0.5F); // Box 144
        bodyModel[103].setRotationPoint(-30.15F, -1.5F, -5.5F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.6F, -0.3F, -0.2F, -0.6F, 0F, 0F, 0F, -0.3F, 0F); // Box 145
        bodyModel[104].setRotationPoint(-30.15F, -1.5F, -6.5F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, -0.6F, -0.3F, -0.2F, -0.6F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 146
        bodyModel[105].setRotationPoint(-30.15F, -2.5F, -6.5F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.6F, 0F, 0F, -0.6F, -0.3F, -0.2F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.3F); // Box 147
        bodyModel[106].setRotationPoint(-30.15F, -2.5F, -5.5F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, 0F, 1F, 0F, -2F, 1F, 0F, -2.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 166
        bodyModel[107].setRotationPoint(36F, -16F, -6F);

        bodyModel[108].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 168
        bodyModel[108].setRotationPoint(36F, -1F, -5F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, 0F, 1F, 0F, -2F, 1F, 0F, -2.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 130
        bodyModel[109].setRotationPoint(35F, -16F, -6F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, 0F, 1F, 0F, -2F, 1F, 0F, -2.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 131
        bodyModel[110].setRotationPoint(34F, -16F, -6F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.5F, -2.25F, 1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F); // Box 132
        bodyModel[111].setRotationPoint(34F, -16F, 5F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.5F, -2.25F, 1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F); // Box 133
        bodyModel[112].setRotationPoint(35F, -16F, 5F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.5F, -2.25F, 1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F); // Box 134
        bodyModel[113].setRotationPoint(36F, -16F, 5F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 135
        bodyModel[114].setRotationPoint(35F, -18F, -5F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -1F, -8.5F, -0.25F, -1F, -8.5F, -0.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 137
        bodyModel[115].setRotationPoint(35F, -18F, -14F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -1F, -8.5F, -0.25F, -1F, -8.5F, -0.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 138
        bodyModel[116].setRotationPoint(34F, -18F, -14F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -1F, -8.5F, -0.25F, -1F, -8.5F, -0.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 139
        bodyModel[117].setRotationPoint(36F, -18F, -14F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -8.5F, -2.25F, -1F, -8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F); // Box 140
        bodyModel[118].setRotationPoint(36F, -18F, 4F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 141
        bodyModel[119].setRotationPoint(34F, -18F, -5F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 142
        bodyModel[120].setRotationPoint(36F, -18F, -5F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -8.5F, -2.25F, -1F, -8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F); // Box 143
        bodyModel[121].setRotationPoint(34F, -18F, 4F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -8.5F, -2.25F, -1F, -8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F); // Box 144
        bodyModel[122].setRotationPoint(35F, -18F, 4F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[123].setRotationPoint(28F, -7F, 4F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
        bodyModel[124].setRotationPoint(28F, -18F, 3.5F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        bodyModel[125].setRotationPoint(28F, -5F, 4.5F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
        bodyModel[126].setRotationPoint(16F, -7F, 4F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        bodyModel[127].setRotationPoint(16F, -5F, 4.5F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
        bodyModel[128].setRotationPoint(16F, -18F, 3.5F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[129].setRotationPoint(-1F, -7F, 4F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
        bodyModel[130].setRotationPoint(-1F, -5F, 4.5F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        bodyModel[131].setRotationPoint(-1F, -18F, 3.5F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[132].setRotationPoint(-13F, -7F, 4F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
        bodyModel[133].setRotationPoint(-13F, -5F, 4.5F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        bodyModel[134].setRotationPoint(-13F, -18F, 3.5F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
        bodyModel[135].setRotationPoint(-13F, -5F, -5.5F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
        bodyModel[136].setRotationPoint(-13F, -7F, -7F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
        bodyModel[137].setRotationPoint(-13F, -18F, -4.5F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
        bodyModel[138].setRotationPoint(-1F, -18F, -4.5F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
        bodyModel[139].setRotationPoint(-1F, -7F, -7F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
        bodyModel[140].setRotationPoint(-1F, -5F, -5.5F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        bodyModel[141].setRotationPoint(16F, -18F, -4.5F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
        bodyModel[142].setRotationPoint(16F, -7F, -7F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
        bodyModel[143].setRotationPoint(16F, -5F, -5.5F);

        bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
        bodyModel[144].setRotationPoint(28F, -18F, -4.5F);

        bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
        bodyModel[145].setRotationPoint(28F, -7F, -7F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
        bodyModel[146].setRotationPoint(28F, -5F, -5.5F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 178
        bodyModel[147].setRotationPoint(-27F, 2.5F, -6F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.1F, 0F, -1.25F, 0F, 0F, 0.9F, 0F, 0F, 0F, -0.1F, 0F, 1.65F, 0.2F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 2.7F); // Box 174
        bodyModel[148].setRotationPoint(-30F, -4F, -8F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.9F, 0F, -0.7F, 0F, 0F, 0.97F, 0F, 0F, -0.3F, -0.9F, 0F, 0.8F, -0.1F, 0F, -1.05F, 0F, 0F, 1.1F, 0F, 0F, -0.3F, -0.1F, 0F, 1.45F); // Box 176
        bodyModel[149].setRotationPoint(-30F, -9F, -7.8F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-2.8F, 1F, 0.6F, 0F, 1F, 1.5F, 0F, 1F, -1F, -2.8F, 1F, -0.7F, -0.9F, 0F, 0.1F, 0F, 0F, 1.76F, 0F, 0F, -1F, -0.9F, 0F, 0F); // Box 177
        bodyModel[150].setRotationPoint(-30F, -18F, -7F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-3.7F, 0F, 0.6F, 1F, 0F, 1.2F, 1F, 0F, -0.7F, -3.7F, 0F, -0.7F, -2.8F, 0F, 0.6F, 0F, 0F, 1.5F, 0F, 0F, -1F, -2.8F, 0F, -0.7F); // Box 180
        bodyModel[151].setRotationPoint(-30F, -22F, -7F);

        bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.1F, 0F, 1.65F, 0F, 0F, 0F, 0F, 0F, 0.9F, -0.1F, 0F, -1.25F, 0.2F, 0F, 2.7F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, -1.5F); // Box 172
        bodyModel[152].setRotationPoint(-30F, -4F, 7F);

        bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.7F, 0F, 0.8F, 0F, 0F, -0.3F, 0F, 0F, 0.97F, -0.7F, 0F, -0.7F, -0.1F, 0F, 1.45F, 0F, 0F, -0.3F, 0F, 0F, 1.1F, -0.1F, 0F, -1.05F); // Box 173
        bodyModel[153].setRotationPoint(-30F, -9F, 6.8F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,-2.8F, 1F, -0.7F, 0F, 1F, -1F, 0F, 1F, 1.5F, -2.8F, 1F, 0.6F, -0.7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.76F, -0.7F, 0F, 0.1F); // Box 174
        bodyModel[154].setRotationPoint(-30F, -18F, 6F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 162
        bodyModel[155].setRotationPoint(-27.4F, -18.75F, -13.5F);
        bodyModel[155].rotateAngleZ = -0.15707963F;

        bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -2.5F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2.5F); // Box 163
        bodyModel[156].setRotationPoint(-30F, 1F, 7F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-3.1F, -1F, 0.55F, 0F, 0F, 0.5F, 0F, 0F, -0.7F, -3F, -1F, -0.7F, -2.7F, 0F, 0.6F, 0F, 0F, 1.2F, 0F, 0F, -1F, -2.7F, 0F, -0.7F); // Box 163
        bodyModel[157].setRotationPoint(-29F, -24F, -7F);

        bodyModel[158].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 164
        bodyModel[158].setRotationPoint(7.5F, 1F, 4F);

        bodyModel[159].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 165
        bodyModel[159].setRotationPoint(8F, 1F, -8F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-3.7F, 0F, -0.7F, 1F, 0F, -0.7F, 1F, 0F, 1.2F, -3.7F, 0F, 0.6F, -2.8F, 0F, -0.7F, 0F, 0F, -1F, 0F, 0F, 1.5F, -2.8F, 0F, 0.6F); // Box 166
        bodyModel[160].setRotationPoint(-30F, -22F, 6F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-3F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.5F, -3.1F, -1F, 0.55F, -2.7F, 0F, -0.7F, 0F, 0F, -1F, 0F, 0F, 1.2F, -2.7F, 0F, 0.6F); // Box 167
        bodyModel[161].setRotationPoint(-29F, -24F, 6F);

        bodyModel[162].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -0.5F, -1F, -2F, -0.8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 168
        bodyModel[162].setRotationPoint(-26F, -24F, 8F);

        bodyModel[163].addBox(0F, 0F, 0F, 6, 4, 0, 0F); // Box 163
        bodyModel[163].setRotationPoint(31F, 1F, -2F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 6, 4, 0, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 164
        bodyModel[164].setRotationPoint(31F, 1F, -3F);

        bodyModel[165].addBox(0F, 0F, 0F, 6, 4, 0, 0F); // Box 165
        bodyModel[165].setRotationPoint(31F, 1F, 2F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 6, 4, 0, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 166
        bodyModel[166].setRotationPoint(31F, 1F, 3F);
        this.flipAll();
    }
}