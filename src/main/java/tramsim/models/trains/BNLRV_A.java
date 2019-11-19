package tramsim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BNLRV_A extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public BNLRV_A() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[164];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        bodyModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 5
        bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 7
        bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 8
        bodyModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 9
        bodyModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 10
        bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 10
        bodyModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 11
        bodyModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 12
        bodyModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 14
        bodyModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 15
        bodyModel[14] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 16
        bodyModel[15] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 17
        bodyModel[16] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 18
        bodyModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 22
        bodyModel[18] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 23
        bodyModel[19] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 24
        bodyModel[20] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 25
        bodyModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 26
        bodyModel[22] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 27
        bodyModel[23] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 28
        bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
        bodyModel[25] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 30
        bodyModel[26] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 31
        bodyModel[27] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 32
        bodyModel[28] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 33
        bodyModel[29] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 34
        bodyModel[30] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 36
        bodyModel[31] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 37
        bodyModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 38
        bodyModel[33] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 40
        bodyModel[34] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 41
        bodyModel[35] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 43
        bodyModel[36] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 44
        bodyModel[37] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 45
        bodyModel[38] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 46
        bodyModel[39] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 47
        bodyModel[40] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 48
        bodyModel[41] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 49
        bodyModel[42] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 50
        bodyModel[43] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 51
        bodyModel[44] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 52
        bodyModel[45] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 53
        bodyModel[46] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 54
        bodyModel[47] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 55
        bodyModel[48] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 56
        bodyModel[49] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 57
        bodyModel[50] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 58
        bodyModel[51] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 59
        bodyModel[52] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 60
        bodyModel[53] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 61
        bodyModel[54] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 62
        bodyModel[55] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 63
        bodyModel[56] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 64
        bodyModel[57] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 65
        bodyModel[58] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 66
        bodyModel[59] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 67
        bodyModel[60] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 68
        bodyModel[61] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 69
        bodyModel[62] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 70
        bodyModel[63] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 71
        bodyModel[64] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 72
        bodyModel[65] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 73
        bodyModel[66] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 74
        bodyModel[67] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 80
        bodyModel[68] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 81
        bodyModel[69] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 82
        bodyModel[70] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 83
        bodyModel[71] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 84
        bodyModel[72] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 85
        bodyModel[73] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 86
        bodyModel[74] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 79
        bodyModel[75] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 80
        bodyModel[76] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 81
        bodyModel[77] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 82
        bodyModel[78] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 83
        bodyModel[79] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 84
        bodyModel[80] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 85
        bodyModel[81] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 86
        bodyModel[82] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 87
        bodyModel[83] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 88
        bodyModel[84] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 89
        bodyModel[85] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 90
        bodyModel[86] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 91
        bodyModel[87] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 92
        bodyModel[88] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 93
        bodyModel[89] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 94
        bodyModel[90] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 95
        bodyModel[91] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 96
        bodyModel[92] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 97
        bodyModel[93] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 98
        bodyModel[94] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 99
        bodyModel[95] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 100
        bodyModel[96] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 101
        bodyModel[97] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 102
        bodyModel[98] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 103
        bodyModel[99] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 104
        bodyModel[100] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 105
        bodyModel[101] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 106
        bodyModel[102] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 107
        bodyModel[103] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 108
        bodyModel[104] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 109
        bodyModel[105] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 110
        bodyModel[106] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 111
        bodyModel[107] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 112
        bodyModel[108] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 113
        bodyModel[109] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 114
        bodyModel[110] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 115
        bodyModel[111] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 116
        bodyModel[112] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 117
        bodyModel[113] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 118
        bodyModel[114] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 131
        bodyModel[115] = new ModelRendererTurbo(this, 421, 101, textureX, textureY); // Box 135
        bodyModel[116] = new ModelRendererTurbo(this, 421, 101, textureX, textureY); // Box 136
        bodyModel[117] = new ModelRendererTurbo(this, 421, 101, textureX, textureY); // Box 137
        bodyModel[118] = new ModelRendererTurbo(this, 421, 101, textureX, textureY); // Box 138
        bodyModel[119] = new ModelRendererTurbo(this, 420, 104, textureX, textureY); // Box 139
        bodyModel[120] = new ModelRendererTurbo(this, 420, 104, textureX, textureY); // Box 140
        bodyModel[121] = new ModelRendererTurbo(this, 420, 104, textureX, textureY); // Box 141
        bodyModel[122] = new ModelRendererTurbo(this, 420, 104, textureX, textureY); // Box 142
        bodyModel[123] = new ModelRendererTurbo(this, 421, 101, textureX, textureY); // Box 143
        bodyModel[124] = new ModelRendererTurbo(this, 421, 101, textureX, textureY); // Box 144
        bodyModel[125] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 145
        bodyModel[126] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 146
        bodyModel[127] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 147
        bodyModel[128] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 148
        bodyModel[129] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 149
        bodyModel[130] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 150
        bodyModel[131] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 151
        bodyModel[132] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 152
        bodyModel[133] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 153
        bodyModel[134] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 154
        bodyModel[135] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 155
        bodyModel[136] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 156
        bodyModel[137] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 157
        bodyModel[138] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 158
        bodyModel[139] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 159
        bodyModel[140] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 161
        bodyModel[141] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 162
        bodyModel[142] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 163
        bodyModel[143] = new ModelRendererTurbo(this, 411, 103, textureX, textureY); // Box 164
        bodyModel[144] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 165
        bodyModel[145] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 166
        bodyModel[146] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 167
        bodyModel[147] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 168
        bodyModel[148] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 169
        bodyModel[149] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 170
        bodyModel[150] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 171
        bodyModel[151] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 172
        bodyModel[152] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 173
        bodyModel[153] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 174
        bodyModel[154] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 175
        bodyModel[155] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 176
        bodyModel[156] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 177
        bodyModel[157] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 178
        bodyModel[158] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 179
        bodyModel[159] = new ModelRendererTurbo(this, 436, 92, textureX, textureY); // Box 180
        bodyModel[160] = new ModelRendererTurbo(this, 395, 94, textureX, textureY); // Box 181
        bodyModel[161] = new ModelRendererTurbo(this, 395, 89, textureX, textureY); // Box 182
        bodyModel[162] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 163
        bodyModel[163] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 164

        bodyModel[0].addBox(0F, 0F, 0F, 34, 2, 20, 0F); // Box 0
        bodyModel[0].setRotationPoint(-17F, -3F, -10F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 27, 18, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        bodyModel[1].setRotationPoint(-28F, -27F, -9F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 0F); // Box 2
        bodyModel[2].setRotationPoint(-38F, -11F, 6F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0.72F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0.5F); // Box 4
        bodyModel[3].setRotationPoint(-35F, -4F, 6F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
        bodyModel[4].setRotationPoint(-38F, -11F, -7F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0.72F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.5F); // Box 7
        bodyModel[5].setRotationPoint(-35F, -4F, -7F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 8
        bodyModel[6].setRotationPoint(-38F, -11F, -6F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, -2.45F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 2.45F, 0F, 0F, -2.45F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 2.45F); // Box 9
        bodyModel[7].setRotationPoint(-29F, -23F, 6F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 2.45F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2.45F, 0F, 0F, 2.45F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2.45F); // Box 10
        bodyModel[8].setRotationPoint(-29F, -23F, -7F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 22, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[9].setRotationPoint(-27F, -23F, -10F);

        bodyModel[10].addBox(0F, 0F, 0F, 10, 2, 14, 0F); // Box 11
        bodyModel[10].setRotationPoint(-27F, -3F, -7F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 22, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[11].setRotationPoint(-22F, -23F, -10F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        bodyModel[12].setRotationPoint(-25F, -3F, 7F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 15
        bodyModel[13].setRotationPoint(-25F, -3F, -9F);

        bodyModel[14].addBox(0F, 0F, 0F, 10, 2, 14, 0F); // Box 16
        bodyModel[14].setRotationPoint(17F, -3F, -7F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
        bodyModel[15].setRotationPoint(19F, -3F, 7F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 18
        bodyModel[16].setRotationPoint(19F, -3F, -9F);

        bodyModel[17].addBox(0F, 0F, 0F, 12, 2, 20, 0F); // Box 22
        bodyModel[17].setRotationPoint(27F, -3F, -10F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 66, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 23
        bodyModel[18].setRotationPoint(-27F, -1F, -10F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 2.7F, 0F, 0F, 0.3F); // Box 24
        bodyModel[19].setRotationPoint(-35F, -1F, 6F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 2.7F, 0F, 0F, -3F, 0F, 0F, -0.5F); // Box 25
        bodyModel[20].setRotationPoint(-35F, -1F, -7F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 22, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[21].setRotationPoint(-22F, -23F, 9F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 22, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[22].setRotationPoint(-27F, -23F, 9F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 22, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[23].setRotationPoint(17F, -23F, 9F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 22, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        bodyModel[24].setRotationPoint(22F, -23F, 9F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 22, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[25].setRotationPoint(22F, -23F, -10F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 22, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        bodyModel[26].setRotationPoint(17F, -23F, -10F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 4, 20, 0F,1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 32
        bodyModel[27].setRotationPoint(-34F, -26F, -10F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 65, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 33
        bodyModel[28].setRotationPoint(-27F, -26F, -10F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 34, 20, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
        bodyModel[29].setRotationPoint(-17F, -23F, -10F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 34, 20, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
        bodyModel[30].setRotationPoint(-17F, -23F, 9F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[31].setRotationPoint(27F, -23F, 9F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
        bodyModel[32].setRotationPoint(27F, -23F, -10F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 66, 1, 20, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        bodyModel[33].setRotationPoint(-27F, -27F, -10F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0.7F, 0F, -2.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.7F, 0F, -2.3F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F); // Box 41
        bodyModel[34].setRotationPoint(-34F, -27F, -10F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 65, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[35].setRotationPoint(-27F, -26F, 6F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 1, 18, 0F,1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 44
        bodyModel[36].setRotationPoint(-36F, -5F, -9F);

        bodyModel[37].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 45
        bodyModel[37].setRotationPoint(-38F, -2F, -1F);

        bodyModel[38].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 46
        bodyModel[38].setRotationPoint(-40F, -3F, -3F);

        bodyModel[39].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 47
        bodyModel[39].setRotationPoint(-16F, -8F, 2F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 4, 7, 0F); // Box 48
        bodyModel[40].setRotationPoint(-17F, -12F, 2F);

        bodyModel[41].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 49
        bodyModel[41].setRotationPoint(-9F, -8F, 2F);

        bodyModel[42].addBox(0F, 0F, 0F, 1, 4, 7, 0F); // Box 50
        bodyModel[42].setRotationPoint(-6F, -12F, 2F);

        bodyModel[43].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 51
        bodyModel[43].setRotationPoint(-5F, -8F, 2F);

        bodyModel[44].addBox(0F, 0F, 0F, 1, 4, 7, 0F); // Box 52
        bodyModel[44].setRotationPoint(5F, -12F, 2F);

        bodyModel[45].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 53
        bodyModel[45].setRotationPoint(2F, -8F, 2F);

        bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 54
        bodyModel[46].setRotationPoint(6F, -8F, 2F);

        bodyModel[47].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 55
        bodyModel[47].setRotationPoint(13F, -8F, 2F);

        bodyModel[48].addBox(0F, 0F, 0F, 1, 4, 7, 0F); // Box 56
        bodyModel[48].setRotationPoint(16F, -12F, 2F);

        bodyModel[49].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 57
        bodyModel[49].setRotationPoint(16F, -12F, -9F);

        bodyModel[50].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 58
        bodyModel[50].setRotationPoint(5F, -12F, -9F);

        bodyModel[51].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 59
        bodyModel[51].setRotationPoint(-6F, -12F, -9F);

        bodyModel[52].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 60
        bodyModel[52].setRotationPoint(-17F, -12F, -9F);

        bodyModel[53].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 61
        bodyModel[53].setRotationPoint(-16F, -8F, -9F);

        bodyModel[54].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 62
        bodyModel[54].setRotationPoint(-9F, -8F, -9F);

        bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 63
        bodyModel[55].setRotationPoint(-5F, -8F, -9F);

        bodyModel[56].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 64
        bodyModel[56].setRotationPoint(2F, -8F, -9F);

        bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 65
        bodyModel[57].setRotationPoint(6F, -8F, -9F);

        bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 66
        bodyModel[58].setRotationPoint(13F, -8F, -9F);

        bodyModel[59].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 67
        bodyModel[59].setRotationPoint(-16F, -7F, 4F);

        bodyModel[60].addBox(0F, 0F, 0F, 7, 4, 5, 0F); // Box 68
        bodyModel[60].setRotationPoint(-9F, -7F, 4F);

        bodyModel[61].addBox(0F, 0F, 0F, 7, 4, 5, 0F); // Box 69
        bodyModel[61].setRotationPoint(2F, -7F, 4F);

        bodyModel[62].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 70
        bodyModel[62].setRotationPoint(13F, -7F, 4F);

        bodyModel[63].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 71
        bodyModel[63].setRotationPoint(13F, -7F, -9F);

        bodyModel[64].addBox(0F, 0F, 0F, 7, 4, 3, 0F); // Box 72
        bodyModel[64].setRotationPoint(2F, -7F, -9F);

        bodyModel[65].addBox(0F, 0F, 0F, 7, 4, 3, 0F); // Box 73
        bodyModel[65].setRotationPoint(-9F, -7F, -9F);

        bodyModel[66].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 74
        bodyModel[66].setRotationPoint(-16F, -7F, -9F);

        bodyModel[67].addBox(0F, 0F, 0F, 8, 9, 3, 0F); // Box 80
        bodyModel[67].setRotationPoint(29F, -12F, -9F);

        bodyModel[68].addBox(-1F, 0F, 0F, 3, 4, 3, 0F); // Box 81
        bodyModel[68].setRotationPoint(34F, -7F, 6F);

        bodyModel[69].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 82
        bodyModel[69].setRotationPoint(33F, -8F, 5F);

        bodyModel[70].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 83
        bodyModel[70].setRotationPoint(36F, -12F, 5F);

        bodyModel[71].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 84
        bodyModel[71].setRotationPoint(28F, -7F, 6F);

        bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 85
        bodyModel[72].setRotationPoint(28F, -8F, 5F);

        bodyModel[73].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 86
        bodyModel[73].setRotationPoint(27F, -12F, 5F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 12, 0, 0F,-4F, -1F, 1F, 0F, -1F, 2.45F, 0F, -1F, -2.45F, -4F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 2.45F, 0F, 0F, -2.45F, 0F, 0F, 0F); // Box 79
        bodyModel[74].setRotationPoint(-38F, -23F, -7F);

        bodyModel[75].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 80
        bodyModel[75].setRotationPoint(-32F, -9F, -2F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 12, 0, 0F,-4F, -1F, -1F, 0F, -1F, -2.45F, 0F, -1F, 2.45F, -4F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -2.45F, 0F, 0F, 2.45F, 0F, 0F, 0F); // Box 81
        bodyModel[76].setRotationPoint(-38F, -23F, 7F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 0, 12, 14, 0F,-4F, -1F, 1F, 4F, -1F, 1F, 4F, -1F, 1F, -4F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        bodyModel[77].setRotationPoint(-38F, -23F, -7F);

        bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 83
        bodyModel[78].setRotationPoint(-38F, -7F, 3F);

        bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 84
        bodyModel[79].setRotationPoint(-38F, -7F, -6F);

        bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 85
        bodyModel[80].setRotationPoint(-38F, -7F, -2.5F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
        bodyModel[81].setRotationPoint(37F, -24F, -9F);

        bodyModel[82].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 87
        bodyModel[82].setRotationPoint(38F, -26F, -10F);

        bodyModel[83].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 88
        bodyModel[83].setRotationPoint(38F, -26F, 9F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 21, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        bodyModel[84].setRotationPoint(37F, -24F, 7F);

        bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 90
        bodyModel[85].setRotationPoint(37F, -26F, -6F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        bodyModel[86].setRotationPoint(37F, -26F, 7F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
        bodyModel[87].setRotationPoint(37F, -26F, -9F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
        bodyModel[88].setRotationPoint(-27F, -28F, -9F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
        bodyModel[89].setRotationPoint(-27F, -28F, 8F);

        bodyModel[90].addBox(0F, 0F, 0F, 7, 2, 8, 0F); // Box 95
        bodyModel[90].setRotationPoint(-1F, -29F, -4F);

        bodyModel[91].addBox(0F, 0F, 0F, 10, 3, 10, 0F); // Box 96
        bodyModel[91].setRotationPoint(8F, -30F, -5F);

        bodyModel[92].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 97
        bodyModel[92].setRotationPoint(-32F, -28F, -3F);

        bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 98
        bodyModel[93].setRotationPoint(-32F, -11F, -3F);

        bodyModel[94].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 99
        bodyModel[94].setRotationPoint(-29F, -14F, -2F);

        bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 100
        bodyModel[95].setRotationPoint(-29F, -17F, -1.5F);

        bodyModel[96].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 101
        bodyModel[96].setRotationPoint(-32F, -11F, 2F);

        bodyModel[97].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 102
        bodyModel[97].setRotationPoint(-37F, -11F, -6F);

        bodyModel[98].addBox(-1F, 0F, 0F, 1, 8, 2, 0F); // Box 103
        bodyModel[98].setRotationPoint(-21.3F, -37F, -1F);
        bodyModel[98].rotateAngleZ = 0.55850536F;

        bodyModel[99].addBox(0F, 0F, 0F, 1, 8, 2, 0F); // Box 104
        bodyModel[99].setRotationPoint(-10F, -36.7F, -1F);
        bodyModel[99].rotateAngleZ = -0.55850536F;

        bodyModel[100].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 105
        bodyModel[100].setRotationPoint(-18F, -30F, -3F);

        bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 106
        bodyModel[101].setRotationPoint(-14F, -30F, -3F);

        bodyModel[102].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 107
        bodyModel[102].setRotationPoint(-18F, -29F, -3F);

        bodyModel[103].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 108
        bodyModel[103].setRotationPoint(-18F, -29F, 2F);

        bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 109
        bodyModel[104].setRotationPoint(-22F, -37F, -2F);

        bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 110
        bodyModel[105].setRotationPoint(-10F, -37F, -2F);

        bodyModel[106].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 111
        bodyModel[106].setRotationPoint(-15F, -43.7F, -4F);
        bodyModel[106].rotateAngleX = 0.2268928F;
        bodyModel[106].rotateAngleZ = 0.68067841F;

        bodyModel[107].addBox(0F, 0F, -1F, 1, 9, 1, 0F); // Box 112
        bodyModel[107].setRotationPoint(-15F, -43.7F, 4F);
        bodyModel[107].rotateAngleX = -0.2268928F;
        bodyModel[107].rotateAngleZ = 0.68067841F;

        bodyModel[108].addBox(-1F, 0F, 0F, 1, 9, 1, 0F); // Box 113
        bodyModel[108].setRotationPoint(-16F, -43.7F, -4F);
        bodyModel[108].rotateAngleX = 0.2268928F;
        bodyModel[108].rotateAngleZ = -0.68067841F;

        bodyModel[109].addBox(-1F, 0F, -1F, 1, 9, 1, 0F); // Box 114
        bodyModel[109].setRotationPoint(-16F, -43.7F, 4F);
        bodyModel[109].rotateAngleX = -0.2268928F;
        bodyModel[109].rotateAngleZ = -0.68067841F;

        bodyModel[110].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 115
        bodyModel[110].setRotationPoint(-17F, -45F, -7F);

        bodyModel[111].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 116
        bodyModel[111].setRotationPoint(-15F, -45F, -7F);

        bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 117
        bodyModel[112].setRotationPoint(-16F, -45F, -4F);

        bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 118
        bodyModel[113].setRotationPoint(-16F, -45F, 3F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 131
        bodyModel[114].setRotationPoint(36F, -13F, 5F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 135
        bodyModel[115].setRotationPoint(-17F, -13.3F, -7.5F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 136
        bodyModel[116].setRotationPoint(-6F, -13.3F, -7.5F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 137
        bodyModel[117].setRotationPoint(5F, -13.3F, -7.5F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 138
        bodyModel[118].setRotationPoint(16F, -13.3F, -7.5F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 139
        bodyModel[119].setRotationPoint(16F, -13.3F, 3.5F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 140
        bodyModel[120].setRotationPoint(5F, -13.3F, 3.5F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 141
        bodyModel[121].setRotationPoint(-6F, -13.3F, 3.5F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 142
        bodyModel[122].setRotationPoint(-17F, -13.3F, 3.5F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 143
        bodyModel[123].setRotationPoint(27F, -13.3F, 6.5F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 144
        bodyModel[124].setRotationPoint(36F, -13.3F, 6.5F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 145
        bodyModel[125].setRotationPoint(36F, -13F, 8F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 146
        bodyModel[126].setRotationPoint(27F, -13F, 5F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 147
        bodyModel[127].setRotationPoint(27F, -13F, 8F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 148
        bodyModel[128].setRotationPoint(16F, -13F, 8F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 149
        bodyModel[129].setRotationPoint(16F, -13F, 2F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 150
        bodyModel[130].setRotationPoint(5F, -13F, 2F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 151
        bodyModel[131].setRotationPoint(5F, -13F, 8F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 152
        bodyModel[132].setRotationPoint(-17F, -13F, 8F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 153
        bodyModel[133].setRotationPoint(-17F, -13F, 2F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 154
        bodyModel[134].setRotationPoint(-17F, -13F, -9F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 155
        bodyModel[135].setRotationPoint(-17F, -13F, -6F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 156
        bodyModel[136].setRotationPoint(-6F, -13F, -6F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 157
        bodyModel[137].setRotationPoint(-6F, -13F, 8F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 158
        bodyModel[138].setRotationPoint(-6F, -13F, 2F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 159
        bodyModel[139].setRotationPoint(5F, -13F, -6F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 161
        bodyModel[140].setRotationPoint(-6F, -13F, -9F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 162
        bodyModel[141].setRotationPoint(5F, -13F, -9F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 163
        bodyModel[142].setRotationPoint(16F, -13F, -9F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 164
        bodyModel[143].setRotationPoint(16F, -13F, -6F);

        bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 165
        bodyModel[144].setRotationPoint(-17F, -27F, -5.75F);

        bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 166
        bodyModel[145].setRotationPoint(-6F, -27F, -5.75F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 167
        bodyModel[146].setRotationPoint(5F, -27F, -5.75F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 168
        bodyModel[147].setRotationPoint(16F, -27F, -5.75F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 169
        bodyModel[148].setRotationPoint(16F, -27F, 1.9F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 170
        bodyModel[149].setRotationPoint(5F, -27F, 1.9F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 171
        bodyModel[150].setRotationPoint(-6F, -27F, 1.9F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 172
        bodyModel[151].setRotationPoint(-17F, -27F, 1.9F);

        bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 173
        bodyModel[152].setRotationPoint(27F, -27F, 4.9F);

        bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 174
        bodyModel[153].setRotationPoint(36F, -27F, 4.9F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 175
        bodyModel[154].setRotationPoint(16.5F, -27F, 4.25F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 176
        bodyModel[155].setRotationPoint(26.5F, -27F, 4.25F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 177
        bodyModel[156].setRotationPoint(26.5F, -27F, -5.75F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 178
        bodyModel[157].setRotationPoint(16.5F, -27F, -5.75F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 179
        bodyModel[158].setRotationPoint(-22.5F, -27F, -5.75F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 180
        bodyModel[159].setRotationPoint(-22.5F, -27F, 4.25F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 181
        bodyModel[160].setRotationPoint(-6F, -21F, -10F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
        bodyModel[161].setRotationPoint(-6F, -21F, 9F);

        bodyModel[162].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 163
        bodyModel[162].setRotationPoint(-18F, -28F, -3F);

        bodyModel[163].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 164
        bodyModel[163].setRotationPoint(-18F, -28F, 2F);
        this.flipAll();
    }
}