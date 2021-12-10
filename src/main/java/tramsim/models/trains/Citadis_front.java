package tramsim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Citadis_front extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 256;

    public Citadis_front() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[169];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
        bodyModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 5
        bodyModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
        bodyModel[7] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 7
        bodyModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 8
        bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
        bodyModel[10] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 10
        bodyModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 11
        bodyModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 12
        bodyModel[13] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 13
        bodyModel[14] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 14
        bodyModel[15] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 16
        bodyModel[16] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 17
        bodyModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 18
        bodyModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 19
        bodyModel[19] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 20
        bodyModel[20] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 21
        bodyModel[21] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 22
        bodyModel[22] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 23
        bodyModel[23] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 24
        bodyModel[24] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 25
        bodyModel[25] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 28
        bodyModel[26] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 30
        bodyModel[27] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 32
        bodyModel[28] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 33
        bodyModel[29] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 30
        bodyModel[30] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 31
        bodyModel[31] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 32
        bodyModel[32] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 33
        bodyModel[33] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 34
        bodyModel[34] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 36
        bodyModel[35] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 37
        bodyModel[36] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 38
        bodyModel[37] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 39
        bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
        bodyModel[39] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 41
        bodyModel[40] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 42
        bodyModel[41] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 43
        bodyModel[42] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 44
        bodyModel[43] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 45
        bodyModel[44] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 46
        bodyModel[45] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 47
        bodyModel[46] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 49
        bodyModel[47] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 51
        bodyModel[48] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 52
        bodyModel[49] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 53
        bodyModel[50] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 54
        bodyModel[51] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 55
        bodyModel[52] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 56
        bodyModel[53] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 57
        bodyModel[54] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 58
        bodyModel[55] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 59
        bodyModel[56] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 60
        bodyModel[57] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 61
        bodyModel[58] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 62
        bodyModel[59] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 63
        bodyModel[60] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 61
        bodyModel[61] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 62
        bodyModel[62] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 63
        bodyModel[63] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 64
        bodyModel[64] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 65
        bodyModel[65] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 66
        bodyModel[66] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 67
        bodyModel[67] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 68
        bodyModel[68] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 69
        bodyModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 70
        bodyModel[70] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 71
        bodyModel[71] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 72
        bodyModel[72] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 73
        bodyModel[73] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 74
        bodyModel[74] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 75
        bodyModel[75] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 76
        bodyModel[76] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 77
        bodyModel[77] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 78
        bodyModel[78] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 79
        bodyModel[79] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 99
        bodyModel[80] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 100
        bodyModel[81] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 101
        bodyModel[82] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 102
        bodyModel[83] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 103
        bodyModel[84] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 104
        bodyModel[85] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 105
        bodyModel[86] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 106
        bodyModel[87] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 107
        bodyModel[88] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 108
        bodyModel[89] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 109
        bodyModel[90] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 110
        bodyModel[91] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 111
        bodyModel[92] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 112
        bodyModel[93] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 113
        bodyModel[94] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 114
        bodyModel[95] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 115
        bodyModel[96] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 116
        bodyModel[97] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 117
        bodyModel[98] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 118
        bodyModel[99] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 119
        bodyModel[100] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 120
        bodyModel[101] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 121
        bodyModel[102] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 122
        bodyModel[103] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 123
        bodyModel[104] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 124
        bodyModel[105] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 125
        bodyModel[106] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 126
        bodyModel[107] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 127
        bodyModel[108] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 128
        bodyModel[109] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 129
        bodyModel[110] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 130
        bodyModel[111] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 131
        bodyModel[112] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 132
        bodyModel[113] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 133
        bodyModel[114] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 134
        bodyModel[115] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 135
        bodyModel[116] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 136
        bodyModel[117] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 137
        bodyModel[118] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 138
        bodyModel[119] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 139
        bodyModel[120] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 140
        bodyModel[121] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 141
        bodyModel[122] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 142
        bodyModel[123] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 143
        bodyModel[124] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 144
        bodyModel[125] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 145
        bodyModel[126] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 146
        bodyModel[127] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 147
        bodyModel[128] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 148
        bodyModel[129] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 149
        bodyModel[130] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 150
        bodyModel[131] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 153
        bodyModel[132] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 154
        bodyModel[133] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 258
        bodyModel[134] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 134
        bodyModel[135] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 258
        bodyModel[136] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 138
        bodyModel[137] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 140
        bodyModel[138] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 141
        bodyModel[139] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 142
        bodyModel[140] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 143
        bodyModel[141] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 144
        bodyModel[142] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 255
        bodyModel[143] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 146
        bodyModel[144] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 147
        bodyModel[145] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 148
        bodyModel[146] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 87
        bodyModel[147] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 88
        bodyModel[148] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 89
        bodyModel[149] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 90
        bodyModel[150] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 91
        bodyModel[151] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 92
        bodyModel[152] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 155
        bodyModel[153] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 156
        bodyModel[154] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 158
        bodyModel[155] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 159
        bodyModel[156] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 220
        bodyModel[157] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 221
        bodyModel[158] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 222
        bodyModel[159] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 159
        bodyModel[160] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 160
        bodyModel[161] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 161
        bodyModel[162] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 162
        bodyModel[163] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 163
        bodyModel[164] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 164
        bodyModel[165] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 165
        bodyModel[166] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 166
        bodyModel[167] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 167
        bodyModel[168] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 168

        bodyModel[0].addShapeBox(0F, 0F, 0F, 25, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 0
        bodyModel[0].setRotationPoint(-7F, 6F, -9.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        bodyModel[1].setRotationPoint(0F, -2F, 8.5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
        bodyModel[2].setRotationPoint(-7F, -21F, 8.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 3
        bodyModel[3].setRotationPoint(0F, -14F, 9.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        bodyModel[4].setRotationPoint(0F, -2F, -9.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 18, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 5
        bodyModel[5].setRotationPoint(0F, -14F, -10.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 25, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
        bodyModel[6].setRotationPoint(-7F, -21F, -10.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 19, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, -3F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -3F); // Box 7
        bodyModel[7].setRotationPoint(-15F, 6F, -9.5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 17, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, -1F, 0.1F, -5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, -1F, 0.1F, -5F); // Box 8
        bodyModel[8].setRotationPoint(-22F, 6F, -8.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, -1F, 2F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        bodyModel[9].setRotationPoint(18F, -2F, 7.5F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 10
        bodyModel[10].setRotationPoint(18F, -14F, 8.5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 11
        bodyModel[11].setRotationPoint(18F, -21F, 7.5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[12].setRotationPoint(17F, -2F, -8.5F);

        bodyModel[13].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 13
        bodyModel[13].setRotationPoint(17F, -13F, -9.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
        bodyModel[14].setRotationPoint(17F, -21F, -8.5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 16
        bodyModel[15].setRotationPoint(-15F, -2F, -9.5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F); // Box 17
        bodyModel[16].setRotationPoint(-15F, -14F, -10.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 18
        bodyModel[17].setRotationPoint(-15F, -21F, -10.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 19
        bodyModel[18].setRotationPoint(-15F, -2F, 8.5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F); // Box 20
        bodyModel[19].setRotationPoint(-15F, -14F, 9.5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 21
        bodyModel[20].setRotationPoint(-15F, -21F, 9.5F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,-0.5F, -1F, 2F, 0F, -1F, -1F, 0F, -1F, 1F, -0.5F, -1F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 22
        bodyModel[21].setRotationPoint(-22F, -2F, 6.5F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,-2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0.5F, 1F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, -3F); // Box 23
        bodyModel[22].setRotationPoint(-21F, -14F, 7.5F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-4F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -1F, -4F, 0F, -1.5F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F); // Box 24
        bodyModel[23].setRotationPoint(-20F, -21F, 7.5F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,-0.5F, -1F, -2F, 0F, -1F, 1F, 0F, -1F, -1F, -0.5F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 25
        bodyModel[24].setRotationPoint(-22F, -2F, -7.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,-0.5F, -2F, 0F, 0.5F, -2F, 0.5F, 0.5F, -2F, 0.5F, -0.5F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 28
        bodyModel[25].setRotationPoint(-22F, -3F, -4.5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 7, 12, 0F,-1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0F, 2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -0.5F); // Box 30
        bodyModel[26].setRotationPoint(-17F, -21F, -6F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-4F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 1F, -4F, 0F, 1.5F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F); // Box 32
        bodyModel[27].setRotationPoint(-20F, -21F, -8.5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 0.5F, 1F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 3F); // Box 33
        bodyModel[28].setRotationPoint(-21F, -14F, -8.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 30
        bodyModel[29].setRotationPoint(-6F, -14F, 9.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        bodyModel[30].setRotationPoint(-6F, -2F, 8.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 32
        bodyModel[31].setRotationPoint(-6F, -14F, -10.5F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[32].setRotationPoint(-6F, -2F, -9.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 34
        bodyModel[33].setRotationPoint(17F, -21F, -8F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 36
        bodyModel[34].setRotationPoint(18F, 6F, -8.5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[35].setRotationPoint(17F, -2F, 7.5F);

        bodyModel[36].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 38
        bodyModel[36].setRotationPoint(17F, -13F, 8.5F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 39
        bodyModel[37].setRotationPoint(17F, -21F, 7.5F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 2F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 40
        bodyModel[38].setRotationPoint(18F, -2F, -8.5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F); // Box 41
        bodyModel[39].setRotationPoint(18F, -14F, -9.5F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -1F, 0F, 0F, -1F); // Box 42
        bodyModel[40].setRotationPoint(18F, -21F, -8.5F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -1F, 0.5F, 2F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 43
        bodyModel[41].setRotationPoint(18F, 6F, 0.5F);

        bodyModel[42].addBox(0F, 0F, 0F, 1, 23, 6, 0F); // Box 44
        bodyModel[42].setRotationPoint(-8F, -16F, -8.5F);

        bodyModel[43].addBox(0F, 0F, 0F, 1, 23, 6, 0F); // Box 45
        bodyModel[43].setRotationPoint(-8F, -16F, 2.5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 6F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        bodyModel[44].setRotationPoint(-8F, -14F, 8.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 47
        bodyModel[45].setRotationPoint(-8F, -14F, -9.5F);

        bodyModel[46].addBox(0F, 0F, 0F, 24, 1, 19, 0F); // Box 49
        bodyModel[46].setRotationPoint(-7F, -17F, -9.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 51
        bodyModel[47].setRotationPoint(18F, -15.5F, -8.5F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        bodyModel[48].setRotationPoint(18F, -15.5F, 0.5F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 53
        bodyModel[49].setRotationPoint(-7F, -14F, 9.5F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        bodyModel[50].setRotationPoint(-7F, -2F, 8.5F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 55
        bodyModel[51].setRotationPoint(-7F, -14F, -10.5F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
        bodyModel[52].setRotationPoint(-7F, -2F, -9.5F);

        bodyModel[53].addBox(0F, 0F, 0F, 8, 5, 12, 0F); // Box 57
        bodyModel[53].setRotationPoint(-7F, -22F, -6F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 1, 19, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 58
        bodyModel[54].setRotationPoint(-15F, -17F, -9.5F);

        bodyModel[55].addBox(0F, 0F, 0F, 12, 6, 14, 0F); // Box 59
        bodyModel[55].setRotationPoint(2F, -23F, -7F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, 1F, 2F, -1F, 1F, 2F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F); // Box 60
        bodyModel[56].setRotationPoint(18F, -2F, -7.5F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -1F, -2F, 2F, -1F, -2F, 2F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 61
        bodyModel[57].setRotationPoint(18F, -2F, 6.5F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F); // Box 62
        bodyModel[58].setRotationPoint(17F, -2F, -7.5F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[59].setRotationPoint(17F, -2F, 6.5F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 61
        bodyModel[60].setRotationPoint(2F, 5F, 1.5F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 62
        bodyModel[61].setRotationPoint(2F, 5F, -8.5F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 63
        bodyModel[62].setRotationPoint(3F, 7F, -4F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 64
        bodyModel[63].setRotationPoint(14F, 7F, -4F);

        bodyModel[64].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 65
        bodyModel[64].setRotationPoint(1F, 7F, -5F);

        bodyModel[65].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 66
        bodyModel[65].setRotationPoint(12F, 7F, -5F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        bodyModel[66].setRotationPoint(0F, 7F, -3F);

        bodyModel[67].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 68
        bodyModel[67].setRotationPoint(1F, 7F, 5F);

        bodyModel[68].addBox(0F, 0F, 0F, 5, 3, 0, 0F); // Box 69
        bodyModel[68].setRotationPoint(12F, 7F, 5F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 70
        bodyModel[69].setRotationPoint(2F, 8F, -6F);

        bodyModel[70].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 71
        bodyModel[70].setRotationPoint(2F, 7F, -6F);

        bodyModel[71].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 72
        bodyModel[71].setRotationPoint(13F, 7F, -6F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 73
        bodyModel[72].setRotationPoint(13F, 8F, -6F);

        bodyModel[73].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 74
        bodyModel[73].setRotationPoint(13F, 7F, 5F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 75
        bodyModel[74].setRotationPoint(13F, 8F, 5F);

        bodyModel[75].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 76
        bodyModel[75].setRotationPoint(2F, 7F, 5F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 77
        bodyModel[76].setRotationPoint(2F, 8F, 5F);

        bodyModel[77].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 78
        bodyModel[77].setRotationPoint(6.5F, 7F, 4.5F);

        bodyModel[78].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 79
        bodyModel[78].setRotationPoint(6.5F, 7F, -5.5F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[79].setRotationPoint(9.5F, -3.5F, 5F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        bodyModel[80].setRotationPoint(9F, -5.5F, 5F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        bodyModel[81].setRotationPoint(9.5F, -3.5F, 0.899999999999999F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        bodyModel[82].setRotationPoint(9F, -5.5F, 0.899999999999999F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 103
        bodyModel[83].setRotationPoint(9.5F, 1.5F, 5F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 104
        bodyModel[84].setRotationPoint(9.5F, 1.5F, 0.899999999999999F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 105
        bodyModel[85].setRotationPoint(3.1F, 1.5F, 0.899999999999999F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 106
        bodyModel[86].setRotationPoint(3.1F, 1.5F, 5F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        bodyModel[87].setRotationPoint(7.1F, -3.5F, 5F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[88].setRotationPoint(7.6F, -5.5F, 0.899999999999999F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[89].setRotationPoint(7.1F, -3.5F, 0.899999999999999F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[90].setRotationPoint(7.6F, -5.5F, 5F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 111
        bodyModel[91].setRotationPoint(9.5F, 1.5F, -8.1F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        bodyModel[92].setRotationPoint(9.5F, -3.5F, -8.1F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[93].setRotationPoint(9F, -5.5F, -8.1F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[94].setRotationPoint(7.6F, -5.5F, -8.1F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bodyModel[95].setRotationPoint(7.1F, -3.5F, -8.1F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[96].setRotationPoint(3.1F, 1.5F, -8.1F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        bodyModel[97].setRotationPoint(5F, 2.5F, 2.5F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        bodyModel[98].setRotationPoint(5F, 2.5F, -8.5F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 119
        bodyModel[99].setRotationPoint(6.45F, 0.5F, 5.05F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 120
        bodyModel[100].setRotationPoint(6.45F, 0.5F, 0.949999999999999F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 121
        bodyModel[101].setRotationPoint(6.45F, 0.5F, -8.05F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 122
        bodyModel[102].setRotationPoint(-0.95F, 0.5F, -8.05F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 123
        bodyModel[103].setRotationPoint(-0.95F, 0.5F, 0.949999999999999F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,-4.1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -4.1F, -4.1F, -0.9F, -4.1F, -4.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.1F, -4.1F, 0F, -4.1F); // Box 124
        bodyModel[104].setRotationPoint(-0.95F, 0.5F, 5.05F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4.1F, 0.5F, 0F, -4.1F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -4.1F, 0F, -5F, -4.1F); // Box 125
        bodyModel[105].setRotationPoint(10.5F, -3.5F, 0.949999999999999F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4.1F, 0.5F, 0F, -4.1F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -4.1F, 0F, -5F, -4.1F); // Box 126
        bodyModel[106].setRotationPoint(10.5F, -3.5F, 5.05F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4.1F, 0.5F, 0F, -4.1F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -4.1F, 0F, -5F, -4.1F); // Box 127
        bodyModel[107].setRotationPoint(10.5F, -3.5F, -8.05F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.1F, -1.4F, 0F, -4.1F, -0.9F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4.1F, -0.9F, -5F, -4.1F); // Box 128
        bodyModel[108].setRotationPoint(6.1F, -3.5F, -8.05F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.1F, -1.4F, 0F, -4.1F, -0.9F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4.1F, -0.9F, -5F, -4.1F); // Box 129
        bodyModel[109].setRotationPoint(6.1F, -3.5F, 0.949999999999999F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-1.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.1F, -1.4F, 0F, -4.1F, -0.9F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4.1F, -0.9F, -5F, -4.1F); // Box 130
        bodyModel[110].setRotationPoint(6.1F, -3.5F, 5.05F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 24, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 131
        bodyModel[111].setRotationPoint(-7F, -15F, -9.5F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 24, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
        bodyModel[112].setRotationPoint(-7F, -15F, 6.5F);

        bodyModel[113].addBox(0F, 0F, 0F, 24, 1, 3, 0F); // Box 133
        bodyModel[113].setRotationPoint(-7F, -16F, -9.5F);

        bodyModel[114].addBox(0F, 0F, 0F, 24, 1, 3, 0F); // Box 134
        bodyModel[114].setRotationPoint(-7F, -16F, 6.5F);

        bodyModel[115].addBox(0F, 0F, 0F, 24, 1, 1, 0F); // Box 135
        bodyModel[115].setRotationPoint(-7F, -16F, 4.5F);

        bodyModel[116].addBox(0F, 0F, 0F, 24, 1, 1, 0F); // Box 136
        bodyModel[116].setRotationPoint(-7F, -16F, -5.5F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 137
        bodyModel[117].setRotationPoint(-7F, -16F, -4F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
        bodyModel[118].setRotationPoint(-7F, -16F, 0F);

        bodyModel[119].addBox(0F, 0F, 0F, 1, 23, 5, 0F); // Box 139
        bodyModel[119].setRotationPoint(-8F, -16F, -2.5F);

        bodyModel[120].addBox(0F, 1F, 0F, 1, 1, 19, 0F); // Box 140
        bodyModel[120].setRotationPoint(17F, -15F, -9.5F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 141
        bodyModel[121].setRotationPoint(-20F, -2.5F, -5F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
        bodyModel[122].setRotationPoint(-20F, -1F, -7.5F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 7, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
        bodyModel[123].setRotationPoint(-15F, -1F, -7.5F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
        bodyModel[124].setRotationPoint(-15F, -1F, -8.5F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        bodyModel[125].setRotationPoint(-15F, -1F, 4.5F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 146
        bodyModel[126].setRotationPoint(-20F, -1F, 4.5F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.75F); // Box 147
        bodyModel[127].setRotationPoint(-15F, -1F, 7.5F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
        bodyModel[128].setRotationPoint(-13.5F, -2F, -6F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
        bodyModel[129].setRotationPoint(-22F, 1F, 3.5F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
        bodyModel[130].setRotationPoint(-22F, 1F, 1.5F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
        bodyModel[131].setRotationPoint(-22F, 1F, -3.5F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
        bodyModel[132].setRotationPoint(-22F, 1F, -2.5F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -2F, -0.6F, 0F, -2F, -0.6F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 258
        bodyModel[133].setRotationPoint(8.6F, -7.5F, 1.5F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 1F, -0.6F, -0.6F, 1F, -0.6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.6F, -0.6F, 0F, -2.6F, -0.6F, 0F, 2.4F, 0F, 0F, 2.4F); // Box 134
        bodyModel[134].setRotationPoint(8.6F, -7.5F, 4.5F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 258
        bodyModel[135].setRotationPoint(-4.5F, 2.5F, -1.5F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 138
        bodyModel[136].setRotationPoint(-4.5F, -3.5F, -0.9F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, -1.2F, -1F, 0F, -1.2F); // Box 140
        bodyModel[137].setRotationPoint(-4.5F, -5.5F, -1.5F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 141
        bodyModel[138].setRotationPoint(-4.5F, -5.5F, -0.9F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F, 0.6F, -1F, 0F, 0.6F, -1F, 0F, -1.2F, 0.4F, 0F, -1.2F); // Box 142
        bodyModel[139].setRotationPoint(-5.1F, -5.5F, -1.5F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, -1.2F, -1F, 0F, -1.2F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 143
        bodyModel[140].setRotationPoint(-4.5F, -3.5F, -1.5F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.4F, 0F, 0.6F, -1F, 0F, 0.6F, -1F, 0F, -1.2F, 0.4F, 0F, -1.2F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 144
        bodyModel[141].setRotationPoint(-5.1F, -3.5F, -1.5F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 255
        bodyModel[142].setRotationPoint(17.5F, -13.5F, -5F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 146
        bodyModel[143].setRotationPoint(17.5F, -13.5F, 3F);

        bodyModel[144].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 147
        bodyModel[144].setRotationPoint(17F, 4F, 3.5F);

        bodyModel[145].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 148
        bodyModel[145].setRotationPoint(17F, 4F, -5.5F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F); // Box 87
        bodyModel[146].setRotationPoint(-15F, -0.5F, -1.5F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88
        bodyModel[147].setRotationPoint(-15F, -1F, -2.5F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.5F); // Box 89
        bodyModel[148].setRotationPoint(-15F, -1F, 1.5F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0.5F, -0.5F, -0.5F); // Box 90
        bodyModel[149].setRotationPoint(-11F, -5.5F, 1.5F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
        bodyModel[150].setRotationPoint(-11F, -5.5F, -1.5F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92
        bodyModel[151].setRotationPoint(-11F, -5.5F, -2.5F);

        bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 155
        bodyModel[152].setRotationPoint(-10.5F, -7.5F, -1.5F);

        bodyModel[153].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 156
        bodyModel[153].setRotationPoint(-14F, 0F, -1F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 158
        bodyModel[154].setRotationPoint(-15F, -3F, 2F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 159
        bodyModel[155].setRotationPoint(-15F, -3F, -3F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 220
        bodyModel[156].setRotationPoint(0.5F, -8.5F, 7F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 221
        bodyModel[157].setRotationPoint(0.5F, -0.5F, 8F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.6F, 0F, 0.4F, -0.6F, 0F, -1F, 0F, 0F, -1F); // Box 222
        bodyModel[158].setRotationPoint(0.5F, -14.5F, 8F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 159
        bodyModel[159].setRotationPoint(0.5F, -8.5F, -8F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 160
        bodyModel[160].setRotationPoint(0.5F, -0.5F, -9F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 161
        bodyModel[161].setRotationPoint(0.5F, -14.5F, -9F);

        bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 12, 11, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2.5F, 1F, -1F, -2F, 1F, -0.4F, -2F, 1F, -0.4F, 2.5F, 1F, -1F); // Box 162
        bodyModel[162].setRotationPoint(-19F, -14F, -5.5F);

        bodyModel[163].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 163
        bodyModel[163].setRotationPoint(-17F, -17F, -7F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 164
        bodyModel[164].setRotationPoint(-7F, -14F, -9.5F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 165
        bodyModel[165].setRotationPoint(0F, -14F, -9.5F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
        bodyModel[166].setRotationPoint(-7F, -14F, 8.5F);

        bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
        bodyModel[167].setRotationPoint(0F, -14F, 8.5F);

        bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
        bodyModel[168].setRotationPoint(-16.5F, -20F, 0F);
        this.flipAll();
    }
}