package metroim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Tail5500 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public Tail5500() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[188];

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
        bodyModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 156
        bodyModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 157
        bodyModel[9] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 162
        bodyModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 163
        bodyModel[11] = new ModelRendererTurbo(this, 447, -2, textureX, textureY); // Box 164
        bodyModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 166
        bodyModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 167
        bodyModel[14] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 171
        bodyModel[15] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 277
        bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 278
        bodyModel[17] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 295
        bodyModel[18] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 298
        bodyModel[19] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 326
        bodyModel[20] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 327
        bodyModel[21] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 330
        bodyModel[22] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 331
        bodyModel[23] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 338
        bodyModel[24] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 32
        bodyModel[25] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 33
        bodyModel[26] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 36
        bodyModel[27] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 343
        bodyModel[28] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 35
        bodyModel[29] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 34
        bodyModel[30] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 181
        bodyModel[31] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 182
        bodyModel[32] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 174
        bodyModel[33] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 175
        bodyModel[34] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 182
        bodyModel[35] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 183
        bodyModel[36] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 184
        bodyModel[37] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 185
        bodyModel[38] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 177
        bodyModel[39] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 178
        bodyModel[40] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 181
        bodyModel[41] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 184
        bodyModel[42] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 187
        bodyModel[43] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 82
        bodyModel[44] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 83
        bodyModel[45] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 84
        bodyModel[46] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 90
        bodyModel[47] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 91
        bodyModel[48] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 92
        bodyModel[49] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 93
        bodyModel[50] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 94
        bodyModel[51] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 95
        bodyModel[52] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 96
        bodyModel[53] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 97
        bodyModel[54] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 98
        bodyModel[55] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 99
        bodyModel[56] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 100
        bodyModel[57] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 101
        bodyModel[58] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 102
        bodyModel[59] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 103
        bodyModel[60] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 104
        bodyModel[61] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 105
        bodyModel[62] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 106
        bodyModel[63] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 107
        bodyModel[64] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 108
        bodyModel[65] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 109
        bodyModel[66] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 110
        bodyModel[67] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 111
        bodyModel[68] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 112
        bodyModel[69] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 113
        bodyModel[70] = new ModelRendererTurbo(this, 418, 66, textureX, textureY); // Box 147
        bodyModel[71] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 168
        bodyModel[72] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 169
        bodyModel[73] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 170
        bodyModel[74] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 171
        bodyModel[75] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 173
        bodyModel[76] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 174
        bodyModel[77] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 175
        bodyModel[78] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 178
        bodyModel[79] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 179
        bodyModel[80] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 183
        bodyModel[81] = new ModelRendererTurbo(this, 307, 34, textureX, textureY); // Box 184
        bodyModel[82] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 185
        bodyModel[83] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 186
        bodyModel[84] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 187
        bodyModel[85] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 151
        bodyModel[86] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 153
        bodyModel[87] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 154
        bodyModel[88] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 155
        bodyModel[89] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 156
        bodyModel[90] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 157
        bodyModel[91] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 158
        bodyModel[92] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 159
        bodyModel[93] = new ModelRendererTurbo(this, 0, 92, textureX, textureY); // Box 150
        bodyModel[94] = new ModelRendererTurbo(this, 5, 92, textureX, textureY); // Box 151
        bodyModel[95] = new ModelRendererTurbo(this, 5, 92, textureX, textureY); // Box 153
        bodyModel[96] = new ModelRendererTurbo(this, 5, 92, textureX, textureY); // Box 155
        bodyModel[97] = new ModelRendererTurbo(this, 5, 92, textureX, textureY); // Box 156
        bodyModel[98] = new ModelRendererTurbo(this, 10, 92, textureX, textureY); // Box 157
        bodyModel[99] = new ModelRendererTurbo(this, 5, 92, textureX, textureY); // Box 158
        bodyModel[100] = new ModelRendererTurbo(this, 5, 98, textureX, textureY); // Box 160
        bodyModel[101] = new ModelRendererTurbo(this, 5, 98, textureX, textureY); // Box 161
        bodyModel[102] = new ModelRendererTurbo(this, 0, 109, textureX, textureY); // Box 164
        bodyModel[103] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Box 165
        bodyModel[104] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Box 166
        bodyModel[105] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 167
        bodyModel[106] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 168
        bodyModel[107] = new ModelRendererTurbo(this, 5, 98, textureX, textureY); // Box 160
        bodyModel[108] = new ModelRendererTurbo(this, 5, 98, textureX, textureY); // Box 161
        bodyModel[109] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 164
        bodyModel[110] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 165
        bodyModel[111] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 166
        bodyModel[112] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 161
        bodyModel[113] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 162
        bodyModel[114] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 163
        bodyModel[115] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 164
        bodyModel[116] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 165
        bodyModel[117] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 166
        bodyModel[118] = new ModelRendererTurbo(this, 418, 66, textureX, textureY); // Box 167
        bodyModel[119] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 168
        bodyModel[120] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 169
        bodyModel[121] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 170
        bodyModel[122] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 171
        bodyModel[123] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 172
        bodyModel[124] = new ModelRendererTurbo(this, 418, 66, textureX, textureY); // Box 173
        bodyModel[125] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 174
        bodyModel[126] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 175
        bodyModel[127] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 176
        bodyModel[128] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 177
        bodyModel[129] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 178
        bodyModel[130] = new ModelRendererTurbo(this, 418, 66, textureX, textureY); // Box 179
        bodyModel[131] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 180
        bodyModel[132] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 181
        bodyModel[133] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 182
        bodyModel[134] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 183
        bodyModel[135] = new ModelRendererTurbo(this, 418, 66, textureX, textureY); // Box 184
        bodyModel[136] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 185
        bodyModel[137] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 186
        bodyModel[138] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 187
        bodyModel[139] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 188
        bodyModel[140] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 189
        bodyModel[141] = new ModelRendererTurbo(this, 418, 66, textureX, textureY); // Box 190
        bodyModel[142] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 191
        bodyModel[143] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 192
        bodyModel[144] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 193
        bodyModel[145] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 194
        bodyModel[146] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 195
        bodyModel[147] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 196
        bodyModel[148] = new ModelRendererTurbo(this, 418, 66, textureX, textureY); // Box 197
        bodyModel[149] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 198
        bodyModel[150] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 199
        bodyModel[151] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 200
        bodyModel[152] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 201
        bodyModel[153] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 202
        bodyModel[154] = new ModelRendererTurbo(this, 418, 66, textureX, textureY); // Box 203
        bodyModel[155] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 204
        bodyModel[156] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 205
        bodyModel[157] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 206
        bodyModel[158] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 207
        bodyModel[159] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 208
        bodyModel[160] = new ModelRendererTurbo(this, 418, 66, textureX, textureY); // Box 209
        bodyModel[161] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 210
        bodyModel[162] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 211
        bodyModel[163] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 212
        bodyModel[164] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 213
        bodyModel[165] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 214
        bodyModel[166] = new ModelRendererTurbo(this, 418, 66, textureX, textureY); // Box 215
        bodyModel[167] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 216
        bodyModel[168] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 217
        bodyModel[169] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 218
        bodyModel[170] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 219
        bodyModel[171] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 220
        bodyModel[172] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 221
        bodyModel[173] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 222
        bodyModel[174] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 223
        bodyModel[175] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 224
        bodyModel[176] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 225
        bodyModel[177] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 226
        bodyModel[178] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 227
        bodyModel[179] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 228
        bodyModel[180] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 229
        bodyModel[181] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 230
        bodyModel[182] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 231
        bodyModel[183] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 232
        bodyModel[184] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 233
        bodyModel[185] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 234
        bodyModel[186] = new ModelRendererTurbo(this, 0, 109, textureX, textureY); // Box 192
        bodyModel[187] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 193

        bodyModel[0].addShapeBox(0F, 0F, 0F, 71, 1, 19, 0F,-1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 2F, -1F, 0F, 2F); // Box 44
        bodyModel[0].setRotationPoint(-36F, 4F, -10.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 7, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        bodyModel[1].setRotationPoint(-36F, -3F, -9.5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        bodyModel[2].setRotationPoint(-35F, -3F, 9.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[3].setRotationPoint(-35F, -3F, -10.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 10, 19, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        bodyModel[4].setRotationPoint(-36F, -13F, -9.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 69, 3, 2, 0F,0F, 0F, 2F, 3F, 0F, 2F, 3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, -1F, 3F, 1F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[5].setRotationPoint(-35F, -17F, 8.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F); // Box 152
        bodyModel[6].setRotationPoint(-35F, 5F, -10.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        bodyModel[7].setRotationPoint(-35F, -13F, 9.5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
        bodyModel[8].setRotationPoint(-35F, -13F, -10.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 70, 1, 15, 0F,-0.3F, -0.8F, -4F, 3F, -0.8F, -4F, 3F, -0.8F, -3F, -0.3F, -0.8F, -3F, -0.3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, -0.3F, 0F, 1F); // Box 162
        bodyModel[9].setRotationPoint(-35F, -18F, -8F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -0.25F); // Box 163
        bodyModel[10].setRotationPoint(-35F, 5F, 4.5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
        bodyModel[11].setRotationPoint(-36F, -16F, -9.5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 166
        bodyModel[12].setRotationPoint(-31F, 5F, -10.5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 61, 1, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 167
        bodyModel[13].setRotationPoint(-31F, 5F, 9.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 19, 17, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 171
        bodyModel[14].setRotationPoint(-28F, -15F, -9.5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        bodyModel[15].setRotationPoint(-32F, -1F, -8.5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
        bodyModel[16].setRotationPoint(-32F, -1F, -5.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 9, 17, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
        bodyModel[17].setRotationPoint(-34F, -13F, -10.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 298
        bodyModel[18].setRotationPoint(-15F, -13F, -10.5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 326
        bodyModel[19].setRotationPoint(28F, -13F, -10.5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 17, 17, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 327
        bodyModel[20].setRotationPoint(37F, -13F, -9.5F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
        bodyModel[21].setRotationPoint(-36.3F, 3F, 6.5F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
        bodyModel[22].setRotationPoint(-36.3F, 3F, -8.5F);

        bodyModel[23].addBox(0F, 0F, 0F, 12, 5, 8, 0F); // Box 338
        bodyModel[23].setRotationPoint(2F, 5F, 1.5F);

        bodyModel[24].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 32
        bodyModel[24].setRotationPoint(-36F, 5F, -1F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[25].setRotationPoint(-38F, 5F, -2F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 36
        bodyModel[26].setRotationPoint(-38.5F, 4F, 2F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 343
        bodyModel[27].setRotationPoint(-38.5F, 4F, -2.2F);

        bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 35
        bodyModel[28].setRotationPoint(-38F, 3.75F, -2F);

        bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
        bodyModel[29].setRotationPoint(-38F, 7F, 2F);

        bodyModel[30].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 181
        bodyModel[30].setRotationPoint(33F, 5F, -1F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 182
        bodyModel[31].setRotationPoint(38F, 5F, -2F);

        bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 174
        bodyModel[32].setRotationPoint(-35F, -3F, -9.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 175
        bodyModel[33].setRotationPoint(-35.3F, -5F, -9.5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 182
        bodyModel[34].setRotationPoint(-29.5F, -6F, -7.5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        bodyModel[35].setRotationPoint(-30F, -5F, -5.5F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 184
        bodyModel[36].setRotationPoint(-30F, -5F, -8.5F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        bodyModel[37].setRotationPoint(-32F, -1F, -8.5F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 177
        bodyModel[38].setRotationPoint(6F, -13F, -10.5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 17, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
        bodyModel[39].setRotationPoint(-34F, -13F, 9.5F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 181
        bodyModel[40].setRotationPoint(-15F, -13F, 9.5F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 184
        bodyModel[41].setRotationPoint(6F, -13F, 9.5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 17, 1, 0F,1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 187
        bodyModel[42].setRotationPoint(28F, -13F, 9.5F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 82
        bodyModel[43].setRotationPoint(37F, -17F, -10.5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        bodyModel[44].setRotationPoint(37F, -17F, 8.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 84
        bodyModel[45].setRotationPoint(-25F, -14F, -10.5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 90
        bodyModel[46].setRotationPoint(-25F, -14F, 9.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 91
        bodyModel[47].setRotationPoint(37F, -17F, -8F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 69, 3, 2, 0F,0F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, -1F, 0F, 1F, -1F); // Box 92
        bodyModel[48].setRotationPoint(-35F, -17F, -10.5F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 69, 1, 15, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
        bodyModel[49].setRotationPoint(-35F, -17F, -7.5F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 94
        bodyModel[50].setRotationPoint(33F, 5F, -10.5F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 95
        bodyModel[51].setRotationPoint(33F, 5F, 4.5F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 96
        bodyModel[52].setRotationPoint(-13F, 1F, -9.5F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 97
        bodyModel[53].setRotationPoint(7F, 1F, -9.5F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 98
        bodyModel[54].setRotationPoint(28F, 1F, -9.5F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[55].setRotationPoint(28F, 1F, 6.5F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        bodyModel[56].setRotationPoint(7F, 1F, 6.5F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        bodyModel[57].setRotationPoint(-13F, 1F, 6.5F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 102
        bodyModel[58].setRotationPoint(7F, 0F, -9.5F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        bodyModel[59].setRotationPoint(7F, -4F, -9.5F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 104
        bodyModel[60].setRotationPoint(-13F, 0F, -9.5F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
        bodyModel[61].setRotationPoint(-13F, -4F, -9.5F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
        bodyModel[62].setRotationPoint(28F, -4F, -9.5F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 107
        bodyModel[63].setRotationPoint(28F, 0F, -9.5F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[64].setRotationPoint(28F, 0F, 5.5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[65].setRotationPoint(28F, -4F, 8.5F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[66].setRotationPoint(7F, 0F, 5.5F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[67].setRotationPoint(-13F, 0F, 5.5F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        bodyModel[68].setRotationPoint(7F, -4F, 8.5F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[69].setRotationPoint(-13F, -4F, 8.5F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 147
        bodyModel[70].setRotationPoint(-13F, -3F, -9.05F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 168
        bodyModel[71].setRotationPoint(-20F, -11F, -10.5F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 169
        bodyModel[72].setRotationPoint(-25F, -11F, -10.5F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 170
        bodyModel[73].setRotationPoint(-4F, -14F, -10.5F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 171
        bodyModel[74].setRotationPoint(17F, -14F, -10.5F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 173
        bodyModel[75].setRotationPoint(-4F, -14F, 9.5F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 174
        bodyModel[76].setRotationPoint(17F, -14F, 9.5F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 175
        bodyModel[77].setRotationPoint(1F, -11F, -10.5F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 178
        bodyModel[78].setRotationPoint(22F, -11F, -10.5F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
        bodyModel[79].setRotationPoint(-1F, -21F, -8F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        bodyModel[80].setRotationPoint(-19F, -21F, -4.25F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
        bodyModel[81].setRotationPoint(-33F, -21F, -3F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        bodyModel[82].setRotationPoint(-1F, -21F, 0F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        bodyModel[83].setRotationPoint(-10F, -21F, -4.25F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
        bodyModel[84].setRotationPoint(8F, -21F, -4.25F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 151
        bodyModel[85].setRotationPoint(1F, -11F, 9.5F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 153
        bodyModel[86].setRotationPoint(-25F, -11F, 9.5F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 154
        bodyModel[87].setRotationPoint(-20F, -11F, 9.5F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 155
        bodyModel[88].setRotationPoint(22F, -11F, 9.5F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 156
        bodyModel[89].setRotationPoint(-4F, -11F, 9.5F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
        bodyModel[90].setRotationPoint(17F, -11F, 9.5F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 158
        bodyModel[91].setRotationPoint(-4F, -11F, -10.5F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 15, 1, 0F,0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 159
        bodyModel[92].setRotationPoint(17F, -11F, -10.5F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.1F, 0.25F, -0.5F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0.25F, 0.2F, -0.5F, 0.25F, -0.1F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.2F, 0F, 0.25F); // Box 150
        bodyModel[93].setRotationPoint(-36F, -16F, -10.75F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, -3.25F, -2.25F, 0F, -3F, -2.25F, 0F, -4.2F, 1.25F, 0.2F, -4.2F, 1.25F, -0.1F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0.25F, 0.2F, 0.5F, 0.25F); // Box 151
        bodyModel[94].setRotationPoint(-36F, -20F, -10.75F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.2F, -4.2F, 1.25F, 0F, -4.2F, 1.25F, 0F, -3F, -2.25F, -0.1F, -3.25F, -2.25F, 0.2F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, -1.25F, 3.75F, -0.1F, -1F, 3.75F); // Box 153
        bodyModel[95].setRotationPoint(-36F, -20F, -7.25F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, -3.25F, -2.25F, 0F, -3F, -2.25F, 0F, -4.2F, 1.25F, 0.2F, -4.2F, 1.25F, -0.1F, -1F, 3.75F, 0F, -1.25F, 3.75F, 0F, 0F, -4.75F, 0.2F, 0F, -4.75F); // Box 155
        bodyModel[96].setRotationPoint(-36F, -20F, 6.25F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.2F, -4.2F, 1.25F, 0F, -4.2F, 1.25F, 0F, -3F, -2.25F, -0.1F, -3.25F, -2.25F, 0.2F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, -0.25F, -0.1F, -0.25F, -0.5F); // Box 156
        bodyModel[97].setRotationPoint(-36F, -20F, 9.75F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0.2F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, -0.25F, -0.1F, 0.25F, -0.5F, 0.2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -0.5F); // Box 157
        bodyModel[98].setRotationPoint(-36F, -16F, 9.75F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, -3F, -1.25F, 0F, -2.75F, -1.25F, 0F, -4F, 0.25F, 0.2F, -4F, 0.25F, -0.1F, -1F, 3.75F, 0F, -1.25F, 3.75F, 0F, 0F, -4.75F, 0.2F, 0F, -4.75F); // Box 158
        bodyModel[99].setRotationPoint(-36F, -20F, 1.25F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.2F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, -1.25F, 2.75F, -0.1F, -1F, 2.75F, 0.2F, -4.25F, 0.5F, 0F, -4.25F, 0.5F, 0F, -3.25F, -2.25F, -0.1F, -3.5F, -2.25F); // Box 160
        bodyModel[100].setRotationPoint(-36F, 6F, -8.25F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 1F, -0.5F, 0F, 1F, -0.25F, 0F, 1F, 0.25F, 0.2F, 1F, 0.25F, -0.1F, -2.5F, -1.25F, 0F, -2.25F, -1.25F, 0F, -3.25F, 1F, 0.2F, -3.25F, 1F); // Box 161
        bodyModel[101].setRotationPoint(-36F, 5F, -10.75F);

        bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 164
        bodyModel[102].setRotationPoint(-36F, 4F, -9.5F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.51F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 165
        bodyModel[103].setRotationPoint(-36F, 5F, -9.5F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.51F); // Box 166
        bodyModel[104].setRotationPoint(-36F, 5F, 4.5F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F); // Box 167
        bodyModel[105].setRotationPoint(-37F, 3F, 6.5F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F); // Box 168
        bodyModel[106].setRotationPoint(-37F, 3F, -8.5F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, -1F, 2.75F, 0F, -1.25F, 2.75F, 0F, 0F, -3.75F, 0.2F, 0F, -3.75F, -0.1F, -3.5F, -2.25F, 0F, -3.25F, -2.25F, 0F, -4.25F, 0.5F, 0.2F, -4.25F, 0.5F); // Box 160
        bodyModel[107].setRotationPoint(-36F, 6F, 7.25F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.2F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, -0.25F, -0.1F, 1F, -0.5F, 0.2F, -3.25F, 1F, 0F, -3.25F, 1F, 0F, -2.25F, -1.25F, -0.1F, -2.5F, -1.25F); // Box 161
        bodyModel[108].setRotationPoint(-36F, 5F, 9.75F);

        bodyModel[109].addBox(0F, 0F, 0F, 12, 5, 8, 0F); // Box 164
        bodyModel[109].setRotationPoint(-10F, 5F, 1.5F);

        bodyModel[110].addBox(0F, 0F, 0F, 12, 5, 8, 0F); // Box 165
        bodyModel[110].setRotationPoint(2F, 5F, -9.5F);

        bodyModel[111].addBox(0F, 0F, 0F, 12, 5, 8, 0F); // Box 166
        bodyModel[111].setRotationPoint(-10F, 5F, -9.5F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F); // Box 161
        bodyModel[112].setRotationPoint(-13.25F, -3F, -6.6F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 162
        bodyModel[113].setRotationPoint(-13.25F, -2.3F, -6.6F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 163
        bodyModel[114].setRotationPoint(-13.25F, -13F, -6.1F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 164
        bodyModel[115].setRotationPoint(-13.25F, -15F, -6.6F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 165
        bodyModel[116].setRotationPoint(-14.25F, -16.7F, -7.6F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 166
        bodyModel[117].setRotationPoint(-5.75F, -2.3F, -6.6F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 167
        bodyModel[118].setRotationPoint(-5.5F, -3F, -9.05F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F); // Box 168
        bodyModel[119].setRotationPoint(-5.75F, -3F, -6.6F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 169
        bodyModel[120].setRotationPoint(-5.75F, -13F, -6.1F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 170
        bodyModel[121].setRotationPoint(-5.75F, -15F, -6.6F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 171
        bodyModel[122].setRotationPoint(-6.75F, -16.7F, -7.6F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 172
        bodyModel[123].setRotationPoint(14.25F, -2.3F, -6.6F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
        bodyModel[124].setRotationPoint(14.5F, -3F, -9.05F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F); // Box 174
        bodyModel[125].setRotationPoint(14.25F, -3F, -6.6F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 175
        bodyModel[126].setRotationPoint(14.25F, -13F, -6.1F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 176
        bodyModel[127].setRotationPoint(14.25F, -15F, -6.6F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 177
        bodyModel[128].setRotationPoint(14.25F, -16.7F, -7.6F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 178
        bodyModel[129].setRotationPoint(6.75F, -2.3F, -6.6F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 179
        bodyModel[130].setRotationPoint(7F, -3F, -9.05F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F); // Box 180
        bodyModel[131].setRotationPoint(6.75F, -3F, -6.6F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 181
        bodyModel[132].setRotationPoint(6.75F, -13F, -6.1F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 182
        bodyModel[133].setRotationPoint(6.75F, -16.7F, -7.6F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 183
        bodyModel[134].setRotationPoint(6.75F, -15F, -6.6F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 184
        bodyModel[135].setRotationPoint(28F, -3F, -9.05F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 185
        bodyModel[136].setRotationPoint(27.75F, -2.3F, -6.6F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F); // Box 186
        bodyModel[137].setRotationPoint(27.75F, -3F, -6.6F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 187
        bodyModel[138].setRotationPoint(27.75F, -13F, -6.1F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 188
        bodyModel[139].setRotationPoint(27.75F, -15F, -6.6F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 189
        bodyModel[140].setRotationPoint(27.75F, -16.7F, -7.6F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 190
        bodyModel[141].setRotationPoint(28F, -2.5F, 5.95F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 191
        bodyModel[142].setRotationPoint(27.75F, -2.3F, 5.4F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 192
        bodyModel[143].setRotationPoint(27.75F, -3.3F, 4.9F);

        bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 193
        bodyModel[144].setRotationPoint(27.75F, -13F, 4.9F);

        bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F); // Box 194
        bodyModel[145].setRotationPoint(27.75F, -14.7F, 5.9F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 195
        bodyModel[146].setRotationPoint(27.75F, -16.7F, 6.4F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 196
        bodyModel[147].setRotationPoint(14.25F, -2.3F, 5.4F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 197
        bodyModel[148].setRotationPoint(14.5F, -2.5F, 5.95F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 198
        bodyModel[149].setRotationPoint(14.25F, -3.3F, 4.9F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 199
        bodyModel[150].setRotationPoint(14.25F, -13F, 4.9F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F); // Box 200
        bodyModel[151].setRotationPoint(14.25F, -14.7F, 5.9F);

        bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 201
        bodyModel[152].setRotationPoint(14.25F, -16.7F, 6.4F);

        bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 202
        bodyModel[153].setRotationPoint(6.75F, -2.3F, 5.4F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 203
        bodyModel[154].setRotationPoint(7F, -2.5F, 5.95F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 204
        bodyModel[155].setRotationPoint(6.75F, -3.3F, 4.9F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 205
        bodyModel[156].setRotationPoint(6.75F, -13F, 4.9F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F); // Box 206
        bodyModel[157].setRotationPoint(6.75F, -14.7F, 5.9F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 207
        bodyModel[158].setRotationPoint(6.75F, -16.7F, 6.4F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 208
        bodyModel[159].setRotationPoint(-13.25F, -2.3F, 5.4F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209
        bodyModel[160].setRotationPoint(-13F, -2.5F, 5.95F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 210
        bodyModel[161].setRotationPoint(-13.25F, -3.3F, 4.9F);

        bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 211
        bodyModel[162].setRotationPoint(-13.25F, -13F, 4.9F);

        bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F); // Box 212
        bodyModel[163].setRotationPoint(-13.25F, -14.7F, 5.9F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 213
        bodyModel[164].setRotationPoint(-14.25F, -16.7F, 6.4F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 214
        bodyModel[165].setRotationPoint(-5.75F, -2.3F, 5.4F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 215
        bodyModel[166].setRotationPoint(-5.5F, -2.5F, 5.95F);

        bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 216
        bodyModel[167].setRotationPoint(-5.75F, -3.3F, 4.9F);

        bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 217
        bodyModel[168].setRotationPoint(-5.75F, -13F, 4.9F);

        bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 218
        bodyModel[169].setRotationPoint(-6.75F, -16.7F, 6.4F);

        bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F); // Box 219
        bodyModel[170].setRotationPoint(-5.75F, -14.7F, 5.9F);

        bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 220
        bodyModel[171].setRotationPoint(-20.5F, -16.7F, -7.6F);

        bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 221
        bodyModel[172].setRotationPoint(-20.5F, -15F, -6.6F);

        bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F); // Box 222
        bodyModel[173].setRotationPoint(-20.5F, -14.7F, 5.9F);

        bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 223
        bodyModel[174].setRotationPoint(-20.5F, -16.7F, 6.4F);

        bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.9F, 10.4F, -0.3F, -0.9F, 10.4F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, 0F, 10.3F, -0.3F, 0F, 10.3F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 224
        bodyModel[175].setRotationPoint(-20.5F, -13.9F, 4.8F);

        bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.9F, 10.4F, -0.3F, -0.9F, 10.4F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, 0F, 10.3F, -0.3F, 0F, 10.3F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 225
        bodyModel[176].setRotationPoint(1F, -13.9F, 4.8F);

        bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 226
        bodyModel[177].setRotationPoint(1F, -15F, -6.6F);

        bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 227
        bodyModel[178].setRotationPoint(1F, -16.7F, -7.6F);

        bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F); // Box 228
        bodyModel[179].setRotationPoint(1F, -14.7F, 5.9F);

        bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 229
        bodyModel[180].setRotationPoint(1F, -16.7F, 6.4F);

        bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.9F, 10.4F, -0.3F, -0.9F, 10.4F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, 0F, 10.3F, -0.3F, 0F, 10.3F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 230
        bodyModel[181].setRotationPoint(21F, -13.9F, 4.8F);

        bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 231
        bodyModel[182].setRotationPoint(21F, -15F, -6.6F);

        bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 232
        bodyModel[183].setRotationPoint(21F, -16.7F, -7.6F);

        bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, -1.4F, -0.3F, -0.3F, -1.4F); // Box 233
        bodyModel[184].setRotationPoint(21F, -14.7F, 5.9F);

        bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 234
        bodyModel[185].setRotationPoint(21F, -16.7F, 6.4F);

        bodyModel[186].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 192
        bodyModel[186].setRotationPoint(-36F, 4F, 4.5F);

        bodyModel[187].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
        bodyModel[187].setRotationPoint(20F, -21F, -4.25F);

        this.flipAll();
    }
}