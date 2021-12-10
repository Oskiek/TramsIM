package spanish_pack.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Euskotren200Middle extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public Euskotren200Middle() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[140];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 21
        bodyModel[1] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 17
        bodyModel[2] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 18
        bodyModel[3] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 19
        bodyModel[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 20
        bodyModel[5] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 30
        bodyModel[6] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 31
        bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
        bodyModel[8] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 33
        bodyModel[9] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 34
        bodyModel[10] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 35
        bodyModel[11] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 36
        bodyModel[12] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 37
        bodyModel[13] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 40
        bodyModel[14] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 41
        bodyModel[15] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 42
        bodyModel[16] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 43
        bodyModel[17] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 50
        bodyModel[18] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 51
        bodyModel[19] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 53
        bodyModel[20] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 56
        bodyModel[21] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 57
        bodyModel[22] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 61
        bodyModel[23] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 63
        bodyModel[24] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 64
        bodyModel[25] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 65
        bodyModel[26] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 66
        bodyModel[27] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 69
        bodyModel[28] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 70
        bodyModel[29] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 73
        bodyModel[30] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
        bodyModel[31] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 76
        bodyModel[32] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 78
        bodyModel[33] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 79
        bodyModel[34] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 80
        bodyModel[35] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 81
        bodyModel[36] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 82
        bodyModel[37] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 91
        bodyModel[38] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 90
        bodyModel[39] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 80
        bodyModel[40] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 81
        bodyModel[41] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 82
        bodyModel[42] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 83
        bodyModel[43] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 84
        bodyModel[44] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 85
        bodyModel[45] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 86
        bodyModel[46] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 87
        bodyModel[47] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 88
        bodyModel[48] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 89
        bodyModel[49] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 90
        bodyModel[50] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 91
        bodyModel[51] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 92
        bodyModel[52] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 93
        bodyModel[53] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 94
        bodyModel[54] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 95
        bodyModel[55] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 123
        bodyModel[56] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 127
        bodyModel[57] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 128
        bodyModel[58] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 129
        bodyModel[59] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 132
        bodyModel[60] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 133
        bodyModel[61] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 147
        bodyModel[62] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 148
        bodyModel[63] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 114
        bodyModel[64] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 150
        bodyModel[65] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 151
        bodyModel[66] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 152
        bodyModel[67] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 153
        bodyModel[68] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 154
        bodyModel[69] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 155
        bodyModel[70] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 156
        bodyModel[71] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 157
        bodyModel[72] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 158
        bodyModel[73] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 159
        bodyModel[74] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 160
        bodyModel[75] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 161
        bodyModel[76] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 162
        bodyModel[77] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 163
        bodyModel[78] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 164
        bodyModel[79] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 165
        bodyModel[80] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 166
        bodyModel[81] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 167
        bodyModel[82] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 168
        bodyModel[83] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 169
        bodyModel[84] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 170
        bodyModel[85] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 171
        bodyModel[86] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 172
        bodyModel[87] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 173
        bodyModel[88] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 174
        bodyModel[89] = new ModelRendererTurbo(this, 497, 24, textureX, textureY); // Box 162
        bodyModel[90] = new ModelRendererTurbo(this, 457, 8, textureX, textureY); // Box 165
        bodyModel[91] = new ModelRendererTurbo(this, 497, 24, textureX, textureY); // Box 163
        bodyModel[92] = new ModelRendererTurbo(this, 457, 8, textureX, textureY); // Box 164
        bodyModel[93] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 165
        bodyModel[94] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 166
        bodyModel[95] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 159
        bodyModel[96] = new ModelRendererTurbo(this, 27, 105, textureX, textureY); // Box 159
        bodyModel[97] = new ModelRendererTurbo(this, 27, 105, textureX, textureY); // Box 162
        bodyModel[98] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 163
        bodyModel[99] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 165
        bodyModel[100] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 166
        bodyModel[101] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 167
        bodyModel[102] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 168
        bodyModel[103] = new ModelRendererTurbo(this, 87, 102, textureX, textureY); // Box 165
        bodyModel[104] = new ModelRendererTurbo(this, 60, 110, textureX, textureY); // Box 166
        bodyModel[105] = new ModelRendererTurbo(this, 28, 110, textureX, textureY); // Box 167
        bodyModel[106] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 168
        bodyModel[107] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 170
        bodyModel[108] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 171
        bodyModel[109] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 172
        bodyModel[110] = new ModelRendererTurbo(this, 117, 111, textureX, textureY); // Box 173
        bodyModel[111] = new ModelRendererTurbo(this, 117, 111, textureX, textureY); // Box 174
        bodyModel[112] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 175
        bodyModel[113] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 176
        bodyModel[114] = new ModelRendererTurbo(this, 87, 113, textureX, textureY); // Box 177
        bodyModel[115] = new ModelRendererTurbo(this, 129, 102, textureX, textureY); // Box 178
        bodyModel[116] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 179
        bodyModel[117] = new ModelRendererTurbo(this, 113, 104, textureX, textureY); // Box 180
        bodyModel[118] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 181
        bodyModel[119] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 182
        bodyModel[120] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 183
        bodyModel[121] = new ModelRendererTurbo(this, 146, 102, textureX, textureY); // Box 184
        bodyModel[122] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 185
        bodyModel[123] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 186
        bodyModel[124] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 187
        bodyModel[125] = new ModelRendererTurbo(this, 160, 112, textureX, textureY); // Box 188
        bodyModel[126] = new ModelRendererTurbo(this, 160, 112, textureX, textureY); // Box 189
        bodyModel[127] = new ModelRendererTurbo(this, 170, 107, textureX, textureY); // Box 190
        bodyModel[128] = new ModelRendererTurbo(this, 170, 107, textureX, textureY); // Box 191
        bodyModel[129] = new ModelRendererTurbo(this, 160, 112, textureX, textureY); // Box 192
        bodyModel[130] = new ModelRendererTurbo(this, 160, 112, textureX, textureY); // Box 193
        bodyModel[131] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 131
        bodyModel[132] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 133
        bodyModel[133] = new ModelRendererTurbo(this, 146, 102, textureX, textureY); // Box 184
        bodyModel[134] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 185
        bodyModel[135] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 186
        bodyModel[136] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 187
        bodyModel[137] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 138
        bodyModel[138] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 139
        bodyModel[139] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 140

        bodyModel[0].addShapeBox(0F, 0F, 0F, 51, 1, 19, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 21
        bodyModel[0].setRotationPoint(-26F, 3F, -9.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 17
        bodyModel[1].setRotationPoint(-26F, 3F, -10.5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 18
        bodyModel[2].setRotationPoint(-26F, 3F, 9.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 19
        bodyModel[3].setRotationPoint(-24F, -4F, 9.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 20
        bodyModel[4].setRotationPoint(-19F, -4F, 9.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[5].setRotationPoint(-24F, -4F, -10.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 31
        bodyModel[6].setRotationPoint(-19F, -4F, -10.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 32
        bodyModel[7].setRotationPoint(-19F, -16F, -10.5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[8].setRotationPoint(-24F, -16F, -10.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 34
        bodyModel[9].setRotationPoint(23F, -4F, -9.5F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,1F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F); // Box 35
        bodyModel[10].setRotationPoint(28F, 4F, -10F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 36
        bodyModel[11].setRotationPoint(18F, -4F, -10.5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[12].setRotationPoint(13F, -4F, -10.5F);

        bodyModel[13].addBox(0F, 0F, 0F, 27, 7, 1, 0F); // Box 40
        bodyModel[13].setRotationPoint(-14F, -4F, -10.5F);

        bodyModel[14].addBox(0F, 0F, 0F, 27, 7, 1, 0F); // Box 41
        bodyModel[14].setRotationPoint(-14F, -4F, 9.5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 27, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 42
        bodyModel[15].setRotationPoint(-14F, -16F, 8.5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 27, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 43
        bodyModel[16].setRotationPoint(-14F, -16F, -9.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[17].setRotationPoint(13F, -4F, 9.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[18].setRotationPoint(18F, -4F, 9.5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.6F, 1F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0F); // Box 53
        bodyModel[19].setRotationPoint(28F, 4F, 9F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 51, 4, 3, 0F,-2F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 56
        bodyModel[20].setRotationPoint(-26F, -20F, 6.5F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 51, 4, 3, 0F,-2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 57
        bodyModel[21].setRotationPoint(-26F, -20F, -9.5F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -2F); // Box 61
        bodyModel[22].setRotationPoint(23F, -16F, -8.5F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 12, 1, 19, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 63
        bodyModel[23].setRotationPoint(23F, 3F, -9.5F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, -1.5F, -1F, 0F, -2.5F, -1F, 0F, 3.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 2F, 0F, 0F, 0F); // Box 64
        bodyModel[24].setRotationPoint(23F, -20F, -9.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 1.5F, -1F, 0F, 3.5F, -1F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 65
        bodyModel[25].setRotationPoint(23F, -20F, 6.5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 51, 1, 15, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 66
        bodyModel[26].setRotationPoint(-26F, -20F, -7.5F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 1, 15, 0F,0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 69
        bodyModel[27].setRotationPoint(23F, -20F, -7.5F);

        bodyModel[28].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 70
        bodyModel[28].setRotationPoint(33F, -4F, -8F);

        bodyModel[29].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 73
        bodyModel[29].setRotationPoint(33F, -4F, 4F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[30].setRotationPoint(33F, -16F, -8F);

        bodyModel[31].addBox(0F, 0F, 0F, 1, 18, 4, 0F); // Box 76
        bodyModel[31].setRotationPoint(33F, -15F, -4F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        bodyModel[32].setRotationPoint(33F, -19F, -7F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 79
        bodyModel[33].setRotationPoint(34F, -16F, -4F);

        bodyModel[34].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 80
        bodyModel[34].setRotationPoint(34F, -16F, -6F);

        bodyModel[35].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 81
        bodyModel[35].setRotationPoint(34F, -16F, 4F);

        bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 82
        bodyModel[36].setRotationPoint(34F, 3F, -4F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
        bodyModel[37].setRotationPoint(-11.5F, -1F, -9.5F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
        bodyModel[38].setRotationPoint(-12.5F, -6F, -9.5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 80
        bodyModel[39].setRotationPoint(-4F, -1F, -9.5F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
        bodyModel[40].setRotationPoint(-12.5F, -6F, 2.5F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
        bodyModel[41].setRotationPoint(-11.5F, -1F, 2.5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 83
        bodyModel[42].setRotationPoint(-4F, -1F, 2.5F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        bodyModel[43].setRotationPoint(-1F, -6F, -9.5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 85
        bodyModel[44].setRotationPoint(0F, -1F, -9.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 86
        bodyModel[45].setRotationPoint(7.5F, -1F, -9.5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
        bodyModel[46].setRotationPoint(10.5F, -6F, -9.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        bodyModel[47].setRotationPoint(10.5F, -6F, 2.5F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 89
        bodyModel[48].setRotationPoint(7.5F, -1F, 2.5F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 90
        bodyModel[49].setRotationPoint(0F, -1F, 2.5F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        bodyModel[50].setRotationPoint(-1F, -6F, 2.5F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.922F, -1F, 0F, -0.922F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 92
        bodyModel[51].setRotationPoint(9F, 3F, -10.9F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.922F, -1F, 0F, -0.922F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 93
        bodyModel[52].setRotationPoint(-28F, 3F, -10.9F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.922F, -1F, 0F, -0.922F); // Box 94
        bodyModel[53].setRotationPoint(9F, 3F, 9.9F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.922F, -1F, 0F, -0.922F); // Box 95
        bodyModel[54].setRotationPoint(-28F, 3F, 9.9F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        bodyModel[55].setRotationPoint(23.5F, -6F, -9.5F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        bodyModel[56].setRotationPoint(32.5F, -6F, -8F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[57].setRotationPoint(32.5F, -6F, 4F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        bodyModel[58].setRotationPoint(23.5F, -6F, 2.5F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 132
        bodyModel[59].setRotationPoint(29.5F, -2F, 4F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 133
        bodyModel[60].setRotationPoint(29.5F, -2F, -8F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 147
        bodyModel[61].setRotationPoint(-23F, -5F, -8.7F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 148
        bodyModel[62].setRotationPoint(-23F, -5F, -5.5F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
        bodyModel[63].setRotationPoint(-13F, -19F, -3.5F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 150
        bodyModel[64].setRotationPoint(-13F, -19F, 2.5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 151
        bodyModel[65].setRotationPoint(-1.25F, -19F, 2.5F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 152
        bodyModel[66].setRotationPoint(-1.25F, -19F, -3.5F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 153
        bodyModel[67].setRotationPoint(10.25F, -19F, -3.5F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 154
        bodyModel[68].setRotationPoint(10.25F, -19F, 2.5F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 3, 11, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 155
        bodyModel[69].setRotationPoint(-8.5F, 4.5F, -6.5F);

        bodyModel[70].addBox(0F, 0F, 0F, 10, 4, 11, 0F); // Box 156
        bodyModel[70].setRotationPoint(1.5F, 4.5F, -8.5F);

        bodyModel[71].addBox(0F, 0F, 0F, 5, 4, 11, 0F); // Box 157
        bodyModel[71].setRotationPoint(-12.5F, 4.5F, -6.5F);

        bodyModel[72].addBox(0F, 0F, 0F, 9, 4, 3, 0F); // Box 158
        bodyModel[72].setRotationPoint(3.5F, 4.5F, 3.5F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
        bodyModel[73].setRotationPoint(-1F, -1F, -6.5F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        bodyModel[74].setRotationPoint(-1F, -1F, 5.5F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[75].setRotationPoint(-23F, -5F, 2.5F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 162
        bodyModel[76].setRotationPoint(-23F, -5F, 5.7F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 163
        bodyModel[77].setRotationPoint(-13.5F, -5F, 6.2F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 164
        bodyModel[78].setRotationPoint(-13.5F, -5F, 2.7F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 165
        bodyModel[79].setRotationPoint(22.5F, -5F, 6.5F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 166
        bodyModel[80].setRotationPoint(22.5F, -5F, 3.2F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 167
        bodyModel[81].setRotationPoint(-13.5F, -5F, -5.8F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 168
        bodyModel[82].setRotationPoint(-13.5F, -5F, -9.2F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 169
        bodyModel[83].setRotationPoint(22.5F, -5F, -5.8F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 170
        bodyModel[84].setRotationPoint(22.5F, -5F, -9.2F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 171
        bodyModel[85].setRotationPoint(11.5F, -5F, -5.7F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 172
        bodyModel[86].setRotationPoint(11.5F, -5F, -9.2F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 173
        bodyModel[87].setRotationPoint(11.5F, -5F, 2.7F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 174
        bodyModel[88].setRotationPoint(11.5F, -5F, 6.2F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 162
        bodyModel[89].setRotationPoint(-24F, -16F, 9.5F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
        bodyModel[90].setRotationPoint(18F, -16F, 9.5F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 163
        bodyModel[91].setRotationPoint(13F, -16F, 9.5F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 164
        bodyModel[92].setRotationPoint(-19F, -16F, 9.5F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 165
        bodyModel[93].setRotationPoint(18F, -16F, -10.5F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 166
        bodyModel[94].setRotationPoint(13F, -16F, -10.5F);

        bodyModel[95].addBox(0F, 0F, 0F, 1, 18, 4, 0F); // Box 159
        bodyModel[95].setRotationPoint(33F, -15F, 0F);

        bodyModel[96].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 159
        bodyModel[96].setRotationPoint(-36.5F, 4F, -1F);

        bodyModel[97].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 162
        bodyModel[97].setRotationPoint(29.5F, 4F, -1F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F); // Box 163
        bodyModel[98].setRotationPoint(23F, -4F, 8.5F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 2F); // Box 165
        bodyModel[99].setRotationPoint(23F, -16F, 7.5F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 166
        bodyModel[100].setRotationPoint(33F, -16F, 4F);

        bodyModel[101].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 167
        bodyModel[101].setRotationPoint(33F, -4F, 5F);

        bodyModel[102].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 168
        bodyModel[102].setRotationPoint(33F, -4F, -9F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F); // Box 165
        bodyModel[103].setRotationPoint(-35F, -4F, -10.5F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, -1F); // Box 166
        bodyModel[104].setRotationPoint(-35F, -16F, -8.5F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 1F); // Box 167
        bodyModel[105].setRotationPoint(-35F, -16F, 7.5F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 12, 1, 19, 0F,0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 168
        bodyModel[106].setRotationPoint(-35F, 3F, -9.5F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        bodyModel[107].setRotationPoint(-24F, -6F, 2.5F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
        bodyModel[108].setRotationPoint(-24F, -6F, -9.5F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
        bodyModel[109].setRotationPoint(32.5F, -6F, -8F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
        bodyModel[110].setRotationPoint(-34F, -6F, -8F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
        bodyModel[111].setRotationPoint(-34F, -6F, 4F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 175
        bodyModel[112].setRotationPoint(-32.5F, -2F, 4F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 176
        bodyModel[113].setRotationPoint(-32.5F, -2F, -8F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 177
        bodyModel[114].setRotationPoint(-35F, -4F, 8.5F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        bodyModel[115].setRotationPoint(-35F, -19F, -7F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 3.5F, -1F, 0F, 1.5F, -1F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 179
        bodyModel[116].setRotationPoint(-35F, -20F, 6.5F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, -2.5F, -1F, 0F, -1.5F, -1F, 0F, 1.5F, 0F, 0F, 3.5F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F); // Box 180
        bodyModel[117].setRotationPoint(-35F, -20F, -9.5F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 12, 1, 15, 0F,0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F); // Box 181
        bodyModel[118].setRotationPoint(-35F, -20F, -7.5F);

        bodyModel[119].addBox(0F, 0F, 0F, 1, 18, 4, 0F); // Box 182
        bodyModel[119].setRotationPoint(-35F, -15F, 0F);

        bodyModel[120].addBox(0F, 0F, 0F, 1, 18, 4, 0F); // Box 183
        bodyModel[120].setRotationPoint(-35F, -15F, -4F);

        bodyModel[121].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 184
        bodyModel[121].setRotationPoint(-36F, -16F, -4F);

        bodyModel[122].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 185
        bodyModel[122].setRotationPoint(-36F, -16F, 4F);

        bodyModel[123].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 186
        bodyModel[123].setRotationPoint(-36F, -16F, -6F);

        bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 187
        bodyModel[124].setRotationPoint(-36F, 3F, -4F);

        bodyModel[125].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 188
        bodyModel[125].setRotationPoint(-35F, -4F, 5F);

        bodyModel[126].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 189
        bodyModel[126].setRotationPoint(-35F, -4F, -9F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 190
        bodyModel[127].setRotationPoint(-35F, -16F, 4F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
        bodyModel[128].setRotationPoint(-35F, -16F, -8F);

        bodyModel[129].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 192
        bodyModel[129].setRotationPoint(-35F, -4F, 4F);

        bodyModel[130].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 193
        bodyModel[130].setRotationPoint(-35F, -4F, -8F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0.33F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.23F, 0F, 0F, -0.6F); // Box 131
        bodyModel[131].setRotationPoint(-35F, 4F, 8.75F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.25F, 1F, 0F, 0.33F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0.23F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 133
        bodyModel[132].setRotationPoint(-35F, 4F, -9.75F);

        bodyModel[133].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 184
        bodyModel[133].setRotationPoint(-37F, -16F, -4F);

        bodyModel[134].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 185
        bodyModel[134].setRotationPoint(-37F, -16F, 4F);

        bodyModel[135].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 186
        bodyModel[135].setRotationPoint(-37F, -16F, -6F);

        bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 187
        bodyModel[136].setRotationPoint(-37F, 3F, -4F);

        bodyModel[137].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 138
        bodyModel[137].setRotationPoint(35F, -16F, 4F);

        bodyModel[138].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Box 139
        bodyModel[138].setRotationPoint(35F, -16F, -6F);

        bodyModel[139].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 140
        bodyModel[139].setRotationPoint(35F, 3F, -4F);

        this.flipAll();
    }
}