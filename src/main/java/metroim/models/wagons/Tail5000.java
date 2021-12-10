package metroim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Tail5000 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public Tail5000() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[144];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {

        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
        bodyModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 4
        bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
        bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 10
        bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 11
        bodyModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 12
        bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 152
        bodyModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 153
        bodyModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 155
        bodyModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 156
        bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 157
        bodyModel[11] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 162
        bodyModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 163
        bodyModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 164
        bodyModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 166
        bodyModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 167
        bodyModel[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 169
        bodyModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 170
        bodyModel[18] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 171
        bodyModel[19] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 277
        bodyModel[20] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 278
        bodyModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 295
        bodyModel[22] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 298
        bodyModel[23] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 326
        bodyModel[24] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 327
        bodyModel[25] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 330
        bodyModel[26] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 331
        bodyModel[27] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 338
        bodyModel[28] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 339
        bodyModel[29] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 32
        bodyModel[30] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 33
        bodyModel[31] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 36
        bodyModel[32] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 343
        bodyModel[33] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 35
        bodyModel[34] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 34
        bodyModel[35] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 346
        bodyModel[36] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 181
        bodyModel[37] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 182
        bodyModel[38] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 174
        bodyModel[39] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 175
        bodyModel[40] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 182
        bodyModel[41] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 183
        bodyModel[42] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 184
        bodyModel[43] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 185
        bodyModel[44] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 177
        bodyModel[45] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 178
        bodyModel[46] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 181
        bodyModel[47] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 184
        bodyModel[48] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 187
        bodyModel[49] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 188
        bodyModel[50] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 189
        bodyModel[51] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 82
        bodyModel[52] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 83
        bodyModel[53] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 84
        bodyModel[54] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 90
        bodyModel[55] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 91
        bodyModel[56] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 92
        bodyModel[57] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 93
        bodyModel[58] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 94
        bodyModel[59] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 95
        bodyModel[60] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 96
        bodyModel[61] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 97
        bodyModel[62] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 98
        bodyModel[63] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 99
        bodyModel[64] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 100
        bodyModel[65] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 101
        bodyModel[66] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 102
        bodyModel[67] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 103
        bodyModel[68] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 104
        bodyModel[69] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 105
        bodyModel[70] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 106
        bodyModel[71] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 107
        bodyModel[72] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 108
        bodyModel[73] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 109
        bodyModel[74] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 110
        bodyModel[75] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 111
        bodyModel[76] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 112
        bodyModel[77] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 113
        bodyModel[78] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 114
        bodyModel[79] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 115
        bodyModel[80] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 116
        bodyModel[81] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 117
        bodyModel[82] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 118
        bodyModel[83] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 119
        bodyModel[84] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 120
        bodyModel[85] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 122
        bodyModel[86] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 123
        bodyModel[87] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 124
        bodyModel[88] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 125
        bodyModel[89] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 126
        bodyModel[90] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 127
        bodyModel[91] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 128
        bodyModel[92] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 129
        bodyModel[93] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 130
        bodyModel[94] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 131
        bodyModel[95] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 132
        bodyModel[96] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 133
        bodyModel[97] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 134
        bodyModel[98] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 135
        bodyModel[99] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 136
        bodyModel[100] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 137
        bodyModel[101] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 138
        bodyModel[102] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 139
        bodyModel[103] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 140
        bodyModel[104] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 141
        bodyModel[105] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 142
        bodyModel[106] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 143
        bodyModel[107] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 144
        bodyModel[108] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 145
        bodyModel[109] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 146
        bodyModel[110] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 147
        bodyModel[111] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 148
        bodyModel[112] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 149
        bodyModel[113] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 150
        bodyModel[114] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 151
        bodyModel[115] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 152
        bodyModel[116] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 153
        bodyModel[117] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 154
        bodyModel[118] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 155
        bodyModel[119] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 156
        bodyModel[120] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 157
        bodyModel[121] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 158
        bodyModel[122] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 168
        bodyModel[123] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 169
        bodyModel[124] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 170
        bodyModel[125] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 171
        bodyModel[126] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 173
        bodyModel[127] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 174
        bodyModel[128] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 175
        bodyModel[129] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 178
        bodyModel[130] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 179
        bodyModel[131] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 183
        bodyModel[132] = new ModelRendererTurbo(this, 307, 34, textureX, textureY); // Box 184
        bodyModel[133] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 185
        bodyModel[134] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 186
        bodyModel[135] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 187
        bodyModel[136] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 151
        bodyModel[137] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 153
        bodyModel[138] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 154
        bodyModel[139] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 155
        bodyModel[140] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 156
        bodyModel[141] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 157
        bodyModel[142] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 158
        bodyModel[143] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 159

        bodyModel[0].addShapeBox(0F, 0F, 0F, 71, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 44
        bodyModel[0].setRotationPoint(-34F, 4F, -10.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 7, 19, 0F,0.8F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0.8F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 4
        bodyModel[1].setRotationPoint(-34F, -3F, -10.5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        bodyModel[2].setRotationPoint(-33F, -3F, 9.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[3].setRotationPoint(-33F, -3F, -10.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 10, 19, 0F,-0.6F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 2F, -0.6F, 1F, 2F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.3F, 0F, 2F); // Box 11
        bodyModel[4].setRotationPoint(-34.5F, -13F, -10.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 69, 3, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[5].setRotationPoint(-33F, -17F, 8.5F);

        bodyModel[6].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 152
        bodyModel[6].setRotationPoint(-34F, 5F, -10.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 153
        bodyModel[7].setRotationPoint(-35F, 4F, -3F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F); // Box 155
        bodyModel[8].setRotationPoint(-36F, 4F, -3F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 156
        bodyModel[9].setRotationPoint(-33F, -13F, 9.5F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 157
        bodyModel[10].setRotationPoint(-33F, -13F, -10.5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 69, 1, 15, 0F,-0.3F, -0.8F, -4F, 0F, -0.8F, -4F, 0F, -0.8F, -3F, -0.3F, -0.8F, -3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.3F, 0F, 1F); // Box 162
        bodyModel[11].setRotationPoint(-32F, -18F, -8F);

        bodyModel[12].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 163
        bodyModel[12].setRotationPoint(-34F, 5F, 4.5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 15, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.3F, 0F, 1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.1F, 0F, 1F); // Box 164
        bodyModel[13].setRotationPoint(-34F, -17F, -8F);

        bodyModel[14].addBox(0F, 0F, 0F, 61, 1, 1, 0F); // Box 166
        bodyModel[14].setRotationPoint(-29F, 5F, -10.5F);

        bodyModel[15].addBox(0F, 0F, 0F, 61, 1, 1, 0F); // Box 167
        bodyModel[15].setRotationPoint(-29F, 5F, 9.5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
        bodyModel[16].setRotationPoint(-34F, 7F, -10.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 170
        bodyModel[17].setRotationPoint(-34F, 7F, 4.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 19, 17, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 171
        bodyModel[18].setRotationPoint(-27F, -15F, -9.5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        bodyModel[19].setRotationPoint(-30F, 0F, -8.5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        bodyModel[20].setRotationPoint(-30F, 0F, -5.5F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 17, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
        bodyModel[21].setRotationPoint(-32F, -13F, -10.5F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
        bodyModel[22].setRotationPoint(-13F, -13F, -10.5F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        bodyModel[23].setRotationPoint(27F, -13F, -10.5F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 17, 17, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 327
        bodyModel[24].setRotationPoint(36F, -13F, -9.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
        bodyModel[25].setRotationPoint(-34.7F, 3F, 6.5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
        bodyModel[26].setRotationPoint(-34.7F, 3F, -9.5F);

        bodyModel[27].addBox(0F, 0F, 0F, 12, 5, 8, 0F); // Box 338
        bodyModel[27].setRotationPoint(-2F, 5F, 0.5F);

        bodyModel[28].addBox(0F, 0F, 0F, 12, 4, 8, 0F); // Box 339
        bodyModel[28].setRotationPoint(-8F, 5F, -9.5F);

        bodyModel[29].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 32
        bodyModel[29].setRotationPoint(-36F, 5F, -1F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[30].setRotationPoint(-38F, 5F, -2F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 36
        bodyModel[31].setRotationPoint(-38.5F, 4F, 2F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 343
        bodyModel[32].setRotationPoint(-38.5F, 4F, -2.2F);

        bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 35
        bodyModel[33].setRotationPoint(-38F, 3.75F, -2F);

        bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
        bodyModel[34].setRotationPoint(-38F, 7F, 2F);

        bodyModel[35].addBox(0F, 0F, 0F, 4, 5, 8, 0F); // Box 346
        bodyModel[35].setRotationPoint(5F, 5F, -9.5F);

        bodyModel[36].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 181
        bodyModel[36].setRotationPoint(31F, 5F, -1F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 182
        bodyModel[37].setRotationPoint(37F, 5F, -2F);

        bodyModel[38].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 174
        bodyModel[38].setRotationPoint(-33.6F, -3F, -9.5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 175
        bodyModel[39].setRotationPoint(-33.9F, -5F, -9.5F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 182
        bodyModel[40].setRotationPoint(-27.5F, -5F, -7.5F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        bodyModel[41].setRotationPoint(-28F, -4F, -5.5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 184
        bodyModel[42].setRotationPoint(-28F, -4F, -8.5F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        bodyModel[43].setRotationPoint(-30F, 0F, -8.5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
        bodyModel[44].setRotationPoint(7F, -13F, -10.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 17, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        bodyModel[45].setRotationPoint(-32F, -13F, 9.5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
        bodyModel[46].setRotationPoint(-13F, -13F, 9.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
        bodyModel[47].setRotationPoint(7F, -13F, 9.5F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
        bodyModel[48].setRotationPoint(27F, -13F, 9.5F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.1F, 0F, 0.5F); // Box 188
        bodyModel[49].setRotationPoint(-34F, -17F, -10.5F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 189
        bodyModel[50].setRotationPoint(-34F, -17F, 8.5F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 82
        bodyModel[51].setRotationPoint(36F, -17F, -10.5F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        bodyModel[52].setRotationPoint(36F, -17F, 8.5F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 84
        bodyModel[53].setRotationPoint(-23F, -14F, -10.5F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 90
        bodyModel[54].setRotationPoint(-23F, -14F, 9.5F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 91
        bodyModel[55].setRotationPoint(36F, -17F, -8F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 69, 3, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 92
        bodyModel[56].setRotationPoint(-33F, -17F, -10.5F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 69, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 93
        bodyModel[57].setRotationPoint(-33F, -17F, -8F);

        bodyModel[58].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 94
        bodyModel[58].setRotationPoint(32F, 5F, -10.5F);

        bodyModel[59].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 95
        bodyModel[59].setRotationPoint(32F, 5F, 4.5F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 96
        bodyModel[60].setRotationPoint(-12F, 1F, -9.5F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 97
        bodyModel[61].setRotationPoint(8F, 1F, -9.5F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 98
        bodyModel[62].setRotationPoint(28F, 1F, -9.5F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[63].setRotationPoint(28F, 1F, 6.5F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        bodyModel[64].setRotationPoint(8F, 1F, 6.5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        bodyModel[65].setRotationPoint(-12F, 1F, 6.5F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 102
        bodyModel[66].setRotationPoint(8F, 0F, -9.5F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        bodyModel[67].setRotationPoint(8F, -4F, -9.5F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 104
        bodyModel[68].setRotationPoint(-12F, 0F, -9.5F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
        bodyModel[69].setRotationPoint(-12F, -4F, -9.5F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
        bodyModel[70].setRotationPoint(28F, -4F, -9.5F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 107
        bodyModel[71].setRotationPoint(28F, 0F, -9.5F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[72].setRotationPoint(28F, 0F, 5.5F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[73].setRotationPoint(28F, -4F, 8.5F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[74].setRotationPoint(8F, 0F, 5.5F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[75].setRotationPoint(-12F, 0F, 5.5F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        bodyModel[76].setRotationPoint(8F, -4F, 8.5F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[77].setRotationPoint(-12F, -4F, 8.5F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 114
        bodyModel[78].setRotationPoint(-4.5F, -11F, -6F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 115
        bodyModel[79].setRotationPoint(-13F, -11F, -6F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 116
        bodyModel[80].setRotationPoint(7F, -11F, -6F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 117
        bodyModel[81].setRotationPoint(27F, -11F, -6F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 118
        bodyModel[82].setRotationPoint(27F, -11F, 4.5F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 119
        bodyModel[83].setRotationPoint(7F, -11F, 4.5F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 120
        bodyModel[84].setRotationPoint(15.5F, -11F, -6F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
        bodyModel[85].setRotationPoint(-4.5F, -11F, 4.5F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 123
        bodyModel[86].setRotationPoint(-13F, -11F, 4.5F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 124
        bodyModel[87].setRotationPoint(15.5F, -11F, 4.5F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 125
        bodyModel[88].setRotationPoint(-4F, -4F, 5F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 126
        bodyModel[89].setRotationPoint(-12.5F, -4F, 5F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
        bodyModel[90].setRotationPoint(-12.5F, -4F, -10F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[91].setRotationPoint(-4F, -4F, -10F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
        bodyModel[92].setRotationPoint(16F, -4F, -10F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[93].setRotationPoint(7.5F, -4F, -10F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[94].setRotationPoint(7.5F, -4F, 5F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 132
        bodyModel[95].setRotationPoint(27.5F, -4F, 5F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 133
        bodyModel[96].setRotationPoint(27.5F, -4F, -10F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 134
        bodyModel[97].setRotationPoint(16F, -4F, 5F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 135
        bodyModel[98].setRotationPoint(7F, -13F, -6F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 136
        bodyModel[99].setRotationPoint(7F, -13F, 5F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 137
        bodyModel[100].setRotationPoint(-4.5F, -13F, 5F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 138
        bodyModel[101].setRotationPoint(-13F, -13F, 5F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 139
        bodyModel[102].setRotationPoint(-13F, -13F, -6F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 140
        bodyModel[103].setRotationPoint(-4.5F, -13F, -6F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 141
        bodyModel[104].setRotationPoint(15.5F, -13F, -6F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 142
        bodyModel[105].setRotationPoint(15.5F, -13F, 5F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 143
        bodyModel[106].setRotationPoint(27F, -13F, -6F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 144
        bodyModel[107].setRotationPoint(27F, -13F, 5F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 62, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
        bodyModel[108].setRotationPoint(-26F, -14F, -3.5F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 62, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 146
        bodyModel[109].setRotationPoint(-26F, -14F, 3F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 147
        bodyModel[110].setRotationPoint(-8.25F, -3F, -9F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F); // Box 148
        bodyModel[111].setRotationPoint(-8.75F, -2F, -6.1F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F); // Box 149
        bodyModel[112].setRotationPoint(11.25F, -2F, -6.1F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 150
        bodyModel[113].setRotationPoint(11.75F, -3F, -9F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 151
        bodyModel[114].setRotationPoint(11.75F, -3F, 5F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F); // Box 152
        bodyModel[115].setRotationPoint(11.25F, -2F, 5.1F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F); // Box 153
        bodyModel[116].setRotationPoint(-8.75F, -2F, 5.1F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 154
        bodyModel[117].setRotationPoint(-8.25F, -3F, 5F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 155
        bodyModel[118].setRotationPoint(32.5F, -3F, 5F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F); // Box 156
        bodyModel[119].setRotationPoint(32F, -2F, 5.1F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F); // Box 157
        bodyModel[120].setRotationPoint(32F, -2F, -6.1F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[121].setRotationPoint(32.5F, -3F, -9F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 168
        bodyModel[122].setRotationPoint(-18F, -11F, -10.5F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 169
        bodyModel[123].setRotationPoint(-23F, -11F, -10.5F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 170
        bodyModel[124].setRotationPoint(-3F, -14F, -10.5F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 171
        bodyModel[125].setRotationPoint(17F, -14F, -10.5F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 173
        bodyModel[126].setRotationPoint(-3F, -14F, 9.5F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 174
        bodyModel[127].setRotationPoint(17F, -14F, 9.5F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 175
        bodyModel[128].setRotationPoint(2F, -11F, -10.5F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 178
        bodyModel[129].setRotationPoint(22F, -11F, -10.5F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
        bodyModel[130].setRotationPoint(-2F, -21F, -8F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        bodyModel[131].setRotationPoint(-20F, -21F, -4.25F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
        bodyModel[132].setRotationPoint(-31F, -21F, -3F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        bodyModel[133].setRotationPoint(-2F, -21F, 0F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        bodyModel[134].setRotationPoint(-8F, -21F, -4.25F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
        bodyModel[135].setRotationPoint(7F, -21F, -4.25F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 151
        bodyModel[136].setRotationPoint(2F, -11F, 9.5F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 153
        bodyModel[137].setRotationPoint(-23F, -11F, 9.5F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 154
        bodyModel[138].setRotationPoint(-18F, -11F, 9.5F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 155
        bodyModel[139].setRotationPoint(22F, -11F, 9.5F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 156
        bodyModel[140].setRotationPoint(-3F, -11F, 9.5F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
        bodyModel[141].setRotationPoint(17F, -11F, 9.5F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 158
        bodyModel[142].setRotationPoint(-3F, -11F, -10.5F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 159
        bodyModel[143].setRotationPoint(17F, -11F, -10.5F);

        this.flipAll();
    }
}