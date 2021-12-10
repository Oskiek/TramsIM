package metroim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Wagon4300 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public Wagon4300() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[162];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 6
        bodyModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 9
        bodyModel[3] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 11
        bodyModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 12
        bodyModel[5] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 13
        bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 16
        bodyModel[7] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 17
        bodyModel[8] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 18
        bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
        bodyModel[10] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 24
        bodyModel[11] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 25
        bodyModel[12] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 26
        bodyModel[13] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 27
        bodyModel[14] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 28
        bodyModel[15] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 28
        bodyModel[16] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 29
        bodyModel[17] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 30
        bodyModel[18] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 62
        bodyModel[19] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 63
        bodyModel[20] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 64
        bodyModel[21] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 65
        bodyModel[22] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 66
        bodyModel[23] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 67
        bodyModel[24] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 68
        bodyModel[25] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 72
        bodyModel[26] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 73
        bodyModel[27] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 75
        bodyModel[28] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 92
        bodyModel[29] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 96
        bodyModel[30] = new ModelRendererTurbo(this, 238, 57, textureX, textureY); // Box 108
        bodyModel[31] = new ModelRendererTurbo(this, 118, 65, textureX, textureY); // Box 109
        bodyModel[32] = new ModelRendererTurbo(this, 143, 65, textureX, textureY); // Box 110
        bodyModel[33] = new ModelRendererTurbo(this, 166, 65, textureX, textureY); // Box 111
        bodyModel[34] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 112
        bodyModel[35] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 113
        bodyModel[36] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 114
        bodyModel[37] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 115
        bodyModel[38] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 138
        bodyModel[39] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 139
        bodyModel[40] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 126
        bodyModel[41] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 127
        bodyModel[42] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 128
        bodyModel[43] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 129
        bodyModel[44] = new ModelRendererTurbo(this, 238, 57, textureX, textureY); // Box 130
        bodyModel[45] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 131
        bodyModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 132
        bodyModel[47] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 133
        bodyModel[48] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 134
        bodyModel[49] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 137
        bodyModel[50] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 138
        bodyModel[51] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 139
        bodyModel[52] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 141
        bodyModel[53] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 144
        bodyModel[54] = new ModelRendererTurbo(this, 166, 65, textureX, textureY); // Box 145
        bodyModel[55] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 146
        bodyModel[56] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 147
        bodyModel[57] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 148
        bodyModel[58] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 151
        bodyModel[59] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 152
        bodyModel[60] = new ModelRendererTurbo(this, 457, 85, textureX, textureY); // Box 154
        bodyModel[61] = new ModelRendererTurbo(this, 457, 85, textureX, textureY); // Box 155
        bodyModel[62] = new ModelRendererTurbo(this, 457, 85, textureX, textureY); // Box 156
        bodyModel[63] = new ModelRendererTurbo(this, 265, 94, textureX, textureY); // Box 157
        bodyModel[64] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 158
        bodyModel[65] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 159
        bodyModel[66] = new ModelRendererTurbo(this, 129, 87, textureX, textureY); // Box 160
        bodyModel[67] = new ModelRendererTurbo(this, 157, 87, textureX, textureY); // Box 161
        bodyModel[68] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 162
        bodyModel[69] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 163
        bodyModel[70] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 164
        bodyModel[71] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 166
        bodyModel[72] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 168
        bodyModel[73] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 169
        bodyModel[74] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 171
        bodyModel[75] = new ModelRendererTurbo(this, 0, 87, textureX, textureY); // Box 110
        bodyModel[76] = new ModelRendererTurbo(this, 0, 87, textureX, textureY); // Box 111
        bodyModel[77] = new ModelRendererTurbo(this, 0, 87, textureX, textureY); // Box 112
        bodyModel[78] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 114
        bodyModel[79] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 110
        bodyModel[80] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 111
        bodyModel[81] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 112
        bodyModel[82] = new ModelRendererTurbo(this, 154, 65, textureX, textureY); // Box 113
        bodyModel[83] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 114
        bodyModel[84] = new ModelRendererTurbo(this, 154, 65, textureX, textureY); // Box 115
        bodyModel[85] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 122
        bodyModel[86] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 123
        bodyModel[87] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 124
        bodyModel[88] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 125
        bodyModel[89] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 126
        bodyModel[90] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 127
        bodyModel[91] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 128
        bodyModel[92] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 129
        bodyModel[93] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 130
        bodyModel[94] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 131
        bodyModel[95] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 132
        bodyModel[96] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 133
        bodyModel[97] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 134
        bodyModel[98] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 135
        bodyModel[99] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 136
        bodyModel[100] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 137
        bodyModel[101] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 138
        bodyModel[102] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 139
        bodyModel[103] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 140
        bodyModel[104] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 141
        bodyModel[105] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 142
        bodyModel[106] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 143
        bodyModel[107] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 144
        bodyModel[108] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 145
        bodyModel[109] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 146
        bodyModel[110] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 147
        bodyModel[111] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 148
        bodyModel[112] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 149
        bodyModel[113] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 150
        bodyModel[114] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 151
        bodyModel[115] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 152
        bodyModel[116] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 153
        bodyModel[117] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 154
        bodyModel[118] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 155
        bodyModel[119] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 156
        bodyModel[120] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 157
        bodyModel[121] = new ModelRendererTurbo(this, 153, 0, textureX, textureY); // Box 158
        bodyModel[122] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 159
        bodyModel[123] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 160
        bodyModel[124] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 130
        bodyModel[125] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 131
        bodyModel[126] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 132
        bodyModel[127] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 133
        bodyModel[128] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 134
        bodyModel[129] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 135
        bodyModel[130] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 137
        bodyModel[131] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 138
        bodyModel[132] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 139
        bodyModel[133] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 140
        bodyModel[134] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 141
        bodyModel[135] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 142
        bodyModel[136] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 143
        bodyModel[137] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 144
        bodyModel[138] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 145
        bodyModel[139] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 146
        bodyModel[140] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 147
        bodyModel[141] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 148
        bodyModel[142] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 149
        bodyModel[143] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 150
        bodyModel[144] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 151
        bodyModel[145] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 152
        bodyModel[146] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 153
        bodyModel[147] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 154
        bodyModel[148] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 155
        bodyModel[149] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 156
        bodyModel[150] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 157
        bodyModel[151] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 158
        bodyModel[152] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 159
        bodyModel[153] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 160
        bodyModel[154] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 163
        bodyModel[155] = new ModelRendererTurbo(this, 3, 42, textureX, textureY); // Box 164
        bodyModel[156] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 165
        bodyModel[157] = new ModelRendererTurbo(this, 3, 42, textureX, textureY); // Box 166
        bodyModel[158] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 158
        bodyModel[159] = new ModelRendererTurbo(this, 18, 42, textureX, textureY); // Box 159
        bodyModel[160] = new ModelRendererTurbo(this, 31, 42, textureX, textureY); // Box 160
        bodyModel[161] = new ModelRendererTurbo(this, 31, 42, textureX, textureY); // Box 161

        bodyModel[0].addBox(0F, 0F, 0F, 52, 1, 18, 0F); // Box 0
        bodyModel[0].setRotationPoint(-20F, 0F, -9F);

        bodyModel[1].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 6
        bodyModel[1].setRotationPoint(14F, -19F, -9F);

        bodyModel[2].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 9
        bodyModel[2].setRotationPoint(-4F, -19F, 8F);

        bodyModel[3].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 11
        bodyModel[3].setRotationPoint(14F, -19F, 8F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[4].setRotationPoint(22F, -18F, -9F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        bodyModel[5].setRotationPoint(22F, -18F, 8F);

        bodyModel[6].addBox(0F, 0F, 0F, 52, 1, 16, 0F); // Box 16
        bodyModel[6].setRotationPoint(-20F, -20F, -8F);

        bodyModel[7].addShapeBox(0F, -3F, 0F, 52, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
        bodyModel[7].setRotationPoint(-20F, -21F, 8F);

        bodyModel[8].addShapeBox(0F, -3F, 0F, 52, 5, 1, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
        bodyModel[8].setRotationPoint(-20F, -21F, -9F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 20
        bodyModel[9].setRotationPoint(-29F, -4F, 4F);

        bodyModel[10].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 24
        bodyModel[10].setRotationPoint(24F, -4F, -7F);

        bodyModel[11].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 25
        bodyModel[11].setRotationPoint(24F, -4F, 4F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[12].setRotationPoint(30F, -18F, -8F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[13].setRotationPoint(30F, -18F, 5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[14].setRotationPoint(22F, -16F, 7F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 60, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[15].setRotationPoint(-30F, -19F, -8F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 60, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        bodyModel[16].setRotationPoint(-30F, -19F, 6F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[17].setRotationPoint(30F, -19F, -5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        bodyModel[18].setRotationPoint(12F, -16F, 7F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[19].setRotationPoint(-6F, -16F, 7F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        bodyModel[20].setRotationPoint(-14F, -16F, 7F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[21].setRotationPoint(-14F, -16F, -8F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        bodyModel[22].setRotationPoint(-6F, -16F, -8F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        bodyModel[23].setRotationPoint(12F, -16F, -8F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        bodyModel[24].setRotationPoint(22F, -16F, -8F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 72
        bodyModel[25].setRotationPoint(24F, -8F, -8F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        bodyModel[26].setRotationPoint(24F, -8F, 7F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 75
        bodyModel[27].setRotationPoint(-12F, -8F, 7F);

        bodyModel[28].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 92
        bodyModel[28].setRotationPoint(-4F, 1F, -7F);

        bodyModel[29].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 96
        bodyModel[29].setRotationPoint(0F, 1F, 4F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[30].setRotationPoint(-4F, -16F, -9F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[31].setRotationPoint(14F, -16F, -9F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[32].setRotationPoint(14F, -16F, 8F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[33].setRotationPoint(-4F, -16F, 8F);

        bodyModel[34].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 112
        bodyModel[34].setRotationPoint(-17F, -23F, -7F);

        bodyModel[35].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 113
        bodyModel[35].setRotationPoint(-27F, -24F, -7F);

        bodyModel[36].addBox(0F, 0F, 0F, 6, 3, 10, 0F); // Box 114
        bodyModel[36].setRotationPoint(-2F, -23F, -4F);

        bodyModel[37].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 115
        bodyModel[37].setRotationPoint(5F, -24F, -6F);

        bodyModel[38].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 138
        bodyModel[38].setRotationPoint(29F, 1F, -1F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 139
        bodyModel[39].setRotationPoint(33F, 2F, -2F);

        bodyModel[40].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 126
        bodyModel[40].setRotationPoint(19F, -24F, -7F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        bodyModel[41].setRotationPoint(-14F, -18F, 8F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[42].setRotationPoint(-14F, -18F, -9F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        bodyModel[43].setRotationPoint(4F, -18F, -9F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[44].setRotationPoint(-22F, -16F, -9F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[45].setRotationPoint(-32F, -18F, -9F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 132
        bodyModel[46].setRotationPoint(7F, -4F, -7F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 133
        bodyModel[47].setRotationPoint(7F, -8F, -8F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
        bodyModel[48].setRotationPoint(4F, -16F, -8F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        bodyModel[49].setRotationPoint(4F, -18F, 8F);

        bodyModel[50].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 138
        bodyModel[50].setRotationPoint(-4F, -19F, -9F);

        bodyModel[51].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 139
        bodyModel[51].setRotationPoint(-22F, -19F, -9F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
        bodyModel[52].setRotationPoint(4F, -16F, 7F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 144
        bodyModel[53].setRotationPoint(-12F, -4F, 4F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        bodyModel[54].setRotationPoint(-22F, -16F, 8F);

        bodyModel[55].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 146
        bodyModel[55].setRotationPoint(-22F, -19F, 8F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        bodyModel[56].setRotationPoint(-32F, -18F, 8F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
        bodyModel[57].setRotationPoint(-24F, -16F, 7F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
        bodyModel[58].setRotationPoint(-24F, -7F, -7F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
        bodyModel[59].setRotationPoint(-24F, -16F, -8F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
        bodyModel[60].setRotationPoint(-32F, -18F, -8F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
        bodyModel[61].setRotationPoint(-32F, -18F, 5F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        bodyModel[62].setRotationPoint(-32F, -18F, 5F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
        bodyModel[63].setRotationPoint(-32F, -19F, -5F);

        bodyModel[64].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 158
        bodyModel[64].setRotationPoint(-29F, -4F, -7F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 159
        bodyModel[65].setRotationPoint(-29F, -8F, -8F);

        bodyModel[66].addShapeBox(0F, -3F, 0F, 12, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        bodyModel[66].setRotationPoint(-32F, -21F, 8F);

        bodyModel[67].addShapeBox(0F, -3F, 0F, 12, 5, 1, 0F,0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[67].setRotationPoint(-32F, -21F, -9F);

        bodyModel[68].addBox(0F, 0F, 0F, 52, 1, 18, 0F); // Box 162
        bodyModel[68].setRotationPoint(-32F, 0F, -9F);

        bodyModel[69].addBox(0F, 0F, 0F, 12, 1, 16, 0F); // Box 163
        bodyModel[69].setRotationPoint(-32F, -20F, -8F);

        bodyModel[70].addBox(0F, 0F, 0F, 6, 3, 10, 0F); // Box 164
        bodyModel[70].setRotationPoint(-11F, -23F, -7F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, 0F, 1F, 0F, -2F, 1F, 0F, -2.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 166
        bodyModel[71].setRotationPoint(-35F, -16F, -6F);

        bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 168
        bodyModel[72].setRotationPoint(-35F, -1F, -5F);

        bodyModel[73].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 169
        bodyModel[73].setRotationPoint(-35F, 1F, -1F);

        bodyModel[74].addShapeBox(0F, -1F, 0F, 2, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 171
        bodyModel[74].setRotationPoint(-35F, 3F, -2F);

        bodyModel[75].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 110
        bodyModel[75].setRotationPoint(-20F, 1F, -1.5F);

        bodyModel[76].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 111
        bodyModel[76].setRotationPoint(17F, 1F, -1.5F);

        bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 112
        bodyModel[77].setRotationPoint(17F, 1F, -1.5F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[78].setRotationPoint(-24F, -18F, -4.5F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[79].setRotationPoint(-18F, -16F, -9F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[80].setRotationPoint(0F, -16F, -9F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        bodyModel[81].setRotationPoint(18F, -16F, -9F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[82].setRotationPoint(18F, -16F, 8F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[83].setRotationPoint(0F, -16F, 8F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bodyModel[84].setRotationPoint(-18F, -16F, 8F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
        bodyModel[85].setRotationPoint(-24F, -5F, -5.5F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        bodyModel[86].setRotationPoint(-12F, -5F, -5.5F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        bodyModel[87].setRotationPoint(-12F, -7F, -7F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
        bodyModel[88].setRotationPoint(-12F, -18F, -4.5F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 126
        bodyModel[89].setRotationPoint(-12F, -4F, -7F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 127
        bodyModel[90].setRotationPoint(-12F, -8F, -8F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[91].setRotationPoint(-6F, -5F, -5.5F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        bodyModel[92].setRotationPoint(-6F, -18F, -4.5F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[93].setRotationPoint(-6F, -7F, -7F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[94].setRotationPoint(6F, -5F, -5.5F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
        bodyModel[95].setRotationPoint(6F, -18F, -4.5F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
        bodyModel[96].setRotationPoint(6F, -7F, -7F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
        bodyModel[97].setRotationPoint(12F, -5F, -5.5F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
        bodyModel[98].setRotationPoint(12F, -7F, -7F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        bodyModel[99].setRotationPoint(12F, -18F, -4.5F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        bodyModel[100].setRotationPoint(24F, -5F, -5.5F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
        bodyModel[101].setRotationPoint(24F, -7F, -7F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
        bodyModel[102].setRotationPoint(24F, -18F, -4.5F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        bodyModel[103].setRotationPoint(24F, -5F, 4.5F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
        bodyModel[104].setRotationPoint(24F, -18F, 3.5F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
        bodyModel[105].setRotationPoint(24F, -7F, 4F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
        bodyModel[106].setRotationPoint(12F, -18F, 3.5F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
        bodyModel[107].setRotationPoint(12F, -5F, 4.5F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        bodyModel[108].setRotationPoint(12F, -7F, 4F);

        bodyModel[109].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 146
        bodyModel[109].setRotationPoint(6F, -4F, 4F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        bodyModel[110].setRotationPoint(6F, -8F, 7F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
        bodyModel[111].setRotationPoint(6F, -5F, 4.5F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
        bodyModel[112].setRotationPoint(6F, -7F, 4F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
        bodyModel[113].setRotationPoint(6F, -18F, 3.5F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
        bodyModel[114].setRotationPoint(-6F, -5F, 4.5F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
        bodyModel[115].setRotationPoint(-6F, -7F, 4F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
        bodyModel[116].setRotationPoint(-6F, -18F, 3.5F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
        bodyModel[117].setRotationPoint(-12F, -5F, 4.5F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
        bodyModel[118].setRotationPoint(-12F, -7F, 4F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        bodyModel[119].setRotationPoint(-12F, -18F, 3.5F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 157
        bodyModel[120].setRotationPoint(-30F, -8F, 7F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[121].setRotationPoint(-24F, -7F, 4F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 0, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
        bodyModel[122].setRotationPoint(-24F, -18F, 3.5F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        bodyModel[123].setRotationPoint(-24F, -5F, 4.5F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, 0F, 1F, 0F, -2F, 1F, 0F, -2.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 130
        bodyModel[124].setRotationPoint(-36F, -16F, -6F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, 0F, 1F, 0F, -2F, 1F, 0F, -2.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 131
        bodyModel[125].setRotationPoint(-37F, -16F, -6F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.5F, -2.25F, 1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F); // Box 132
        bodyModel[126].setRotationPoint(-37F, -16F, 5F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.5F, -2.25F, 1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F); // Box 133
        bodyModel[127].setRotationPoint(-36F, -16F, 5F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,-2F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.5F, -2.25F, 1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F); // Box 134
        bodyModel[128].setRotationPoint(-35F, -16F, 5F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 135
        bodyModel[129].setRotationPoint(-36F, -18F, -5F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -1F, -8.5F, -0.25F, -1F, -8.5F, -0.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 137
        bodyModel[130].setRotationPoint(-36F, -18F, -14F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -1F, -8.5F, -0.25F, -1F, -8.5F, -0.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 138
        bodyModel[131].setRotationPoint(-37F, -18F, -14F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -1F, -8.5F, -0.25F, -1F, -8.5F, -0.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 139
        bodyModel[132].setRotationPoint(-35F, -18F, -14F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -8.5F, -2.25F, -1F, -8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F); // Box 140
        bodyModel[133].setRotationPoint(-35F, -18F, 4F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 141
        bodyModel[134].setRotationPoint(-37F, -18F, -5F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 142
        bodyModel[135].setRotationPoint(-35F, -18F, -5F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -8.5F, -2.25F, -1F, -8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F); // Box 143
        bodyModel[136].setRotationPoint(-37F, -18F, 4F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -8.5F, -2.25F, -1F, -8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F); // Box 144
        bodyModel[137].setRotationPoint(-36F, -18F, 4F);

        bodyModel[138].addBox(20F, 0F, 0F, 3, 1, 10, 0F); // Box 145
        bodyModel[138].setRotationPoint(12F, -1F, -5F);

        bodyModel[139].addShapeBox(20F, 0F, 0F, 3, 15, 1, 0F,-2.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, 0F, 1F, 0F, -2F, 1F, 0F, -2.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 146
        bodyModel[139].setRotationPoint(10F, -16F, -6F);

        bodyModel[140].addShapeBox(20F, 0F, 0F, 3, 15, 1, 0F,-2.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, 0F, 1F, 0F, -2F, 1F, 0F, -2.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 147
        bodyModel[140].setRotationPoint(11F, -16F, -6F);

        bodyModel[141].addShapeBox(20F, 0F, 0F, 3, 15, 1, 0F,-2.25F, 1F, -0.5F, -0.25F, 1F, -0.5F, 0F, 1F, 0F, -2F, 1F, 0F, -2.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 148
        bodyModel[141].setRotationPoint(12F, -16F, -6F);

        bodyModel[142].addShapeBox(20F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -1F, -8.5F, -0.25F, -1F, -8.5F, -0.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 149
        bodyModel[142].setRotationPoint(10F, -18F, -14F);

        bodyModel[143].addShapeBox(20F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -1F, -8.5F, -0.25F, -1F, -8.5F, -0.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 150
        bodyModel[143].setRotationPoint(11F, -18F, -14F);

        bodyModel[144].addShapeBox(20F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -1F, -8.5F, -0.25F, -1F, -8.5F, -0.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 151
        bodyModel[144].setRotationPoint(12F, -18F, -14F);

        bodyModel[145].addShapeBox(20F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 152
        bodyModel[145].setRotationPoint(10F, -18F, -5F);

        bodyModel[146].addShapeBox(20F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 153
        bodyModel[146].setRotationPoint(11F, -18F, -5F);

        bodyModel[147].addShapeBox(20F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -2.25F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 154
        bodyModel[147].setRotationPoint(12F, -18F, -5F);

        bodyModel[148].addShapeBox(20F, 0F, 0F, 3, 15, 1, 0F,-2F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.5F, -2.25F, 1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F); // Box 155
        bodyModel[148].setRotationPoint(12F, -16F, 5F);

        bodyModel[149].addShapeBox(20F, 0F, 0F, 3, 15, 1, 0F,-2F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.5F, -2.25F, 1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F); // Box 156
        bodyModel[149].setRotationPoint(11F, -16F, 5F);

        bodyModel[150].addShapeBox(20F, 0F, 0F, 3, 15, 1, 0F,-2F, 1F, 0F, 0F, 1F, 0F, -0.25F, 1F, -0.5F, -2.25F, 1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F); // Box 157
        bodyModel[150].setRotationPoint(10F, -16F, 5F);

        bodyModel[151].addShapeBox(20F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -8.5F, -2.25F, -1F, -8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F); // Box 158
        bodyModel[151].setRotationPoint(10F, -18F, 4F);

        bodyModel[152].addShapeBox(20F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -8.5F, -2.25F, -1F, -8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F); // Box 159
        bodyModel[152].setRotationPoint(11F, -18F, 4F);

        bodyModel[153].addShapeBox(20F, 0F, 0F, 3, 1, 10, 0F,-2.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -8.5F, -2.25F, -1F, -8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F); // Box 160
        bodyModel[153].setRotationPoint(12F, -18F, 4F);

        bodyModel[154].addBox(0F, 0F, 0F, 6, 4, 0, 0F); // Box 163
        bodyModel[154].setRotationPoint(27F, 1F, -2F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 4, 0, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 164
        bodyModel[155].setRotationPoint(27F, 1F, -3F);

        bodyModel[156].addBox(0F, 0F, 0F, 6, 4, 0, 0F); // Box 165
        bodyModel[156].setRotationPoint(27F, 1F, 2F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 6, 4, 0, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 166
        bodyModel[157].setRotationPoint(27F, 1F, 3F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 6, 4, 0, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 158
        bodyModel[158].setRotationPoint(-33F, 1F, -5F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 6, 4, 0, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 159
        bodyModel[159].setRotationPoint(-33F, 1F, 5F);

        bodyModel[160].addBox(0F, 0F, 0F, 6, 4, 0, 0F); // Box 160
        bodyModel[160].setRotationPoint(-33F, 1F, -2F);

        bodyModel[161].addBox(0F, 0F, 0F, 6, 4, 0, 0F); // Box 161
        bodyModel[161].setRotationPoint(-33F, 1F, 2F);
        this.flipAll();
    }
}