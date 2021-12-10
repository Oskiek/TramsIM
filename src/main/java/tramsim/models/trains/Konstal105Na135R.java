
package tramsim.models.trains; //Path where the model is located

import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Konstal105Na135R extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public Konstal105Na135R() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[174];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 4
        bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 7
        bodyModel[3] = new ModelRendererTurbo(this, 190, 82, textureX, textureY); // Box 8
        bodyModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 10
        bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 12
        bodyModel[6] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 21
        bodyModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 22
        bodyModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 24
        bodyModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
        bodyModel[10] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 24
        bodyModel[11] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 25
        bodyModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 27
        bodyModel[13] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 17
        bodyModel[14] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 32
        bodyModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 36
        bodyModel[16] = new ModelRendererTurbo(this, 268, 25, textureX, textureY); // Box 46
        bodyModel[17] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 48
        bodyModel[18] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 50
        bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 51
        bodyModel[20] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 52
        bodyModel[21] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 53
        bodyModel[22] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 54
        bodyModel[23] = new ModelRendererTurbo(this, 414, 40, textureX, textureY); // Box 55
        bodyModel[24] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 68
        bodyModel[25] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 73
        bodyModel[26] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 74
        bodyModel[27] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 75
        bodyModel[28] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 77
        bodyModel[29] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 79
        bodyModel[30] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 80
        bodyModel[31] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 82
        bodyModel[32] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 92
        bodyModel[33] = new ModelRendererTurbo(this, 180, 106, textureX, textureY); // Box 100
        bodyModel[34] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 124
        bodyModel[35] = new ModelRendererTurbo(this, 178, 101, textureX, textureY); // Box 125
        bodyModel[36] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 127
        bodyModel[37] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 128
        bodyModel[38] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 132
        bodyModel[39] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 139
        bodyModel[40] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 141
        bodyModel[41] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 142
        bodyModel[42] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 143
        bodyModel[43] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 133
        bodyModel[44] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 134
        bodyModel[45] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 136
        bodyModel[46] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 138
        bodyModel[47] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 112
        bodyModel[48] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 117
        bodyModel[49] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 118
        bodyModel[50] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 119
        bodyModel[51] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 120
        bodyModel[52] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 122
        bodyModel[53] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 124
        bodyModel[54] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 125
        bodyModel[55] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 126
        bodyModel[56] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 127
        bodyModel[57] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 128
        bodyModel[58] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 130
        bodyModel[59] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 131
        bodyModel[60] = new ModelRendererTurbo(this, 0, 109, textureX, textureY); // Box 132
        bodyModel[61] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 134
        bodyModel[62] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 135
        bodyModel[63] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 136
        bodyModel[64] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 137
        bodyModel[65] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 138
        bodyModel[66] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 140
        bodyModel[67] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 141
        bodyModel[68] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 144
        bodyModel[69] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 145
        bodyModel[70] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 147
        bodyModel[71] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 148
        bodyModel[72] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 149
        bodyModel[73] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 150
        bodyModel[74] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 151
        bodyModel[75] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 152
        bodyModel[76] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 153
        bodyModel[77] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 154
        bodyModel[78] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 155
        bodyModel[79] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 156
        bodyModel[80] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 157
        bodyModel[81] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 158
        bodyModel[82] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 159
        bodyModel[83] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 160
        bodyModel[84] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 161
        bodyModel[85] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 166
        bodyModel[86] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 167
        bodyModel[87] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 168
        bodyModel[88] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 172
        bodyModel[89] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 173
        bodyModel[90] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 174
        bodyModel[91] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 154
        bodyModel[92] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 157
        bodyModel[93] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 158
        bodyModel[94] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 165
        bodyModel[95] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 166
        bodyModel[96] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 167
        bodyModel[97] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 168
        bodyModel[98] = new ModelRendererTurbo(this, 153, 65, textureX, textureY, StaticModelAnimator.tagLamp(0,5)); // Box 169
        bodyModel[99] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 172
        bodyModel[100] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 173
        bodyModel[101] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 175
        bodyModel[102] = new ModelRendererTurbo(this, 313, 103, textureX, textureY); // Box 174
        bodyModel[103] = new ModelRendererTurbo(this, 493, 97, textureX, textureY); // Box 175
        bodyModel[104] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 177
        bodyModel[105] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 178
        bodyModel[106] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 179
        bodyModel[107] = new ModelRendererTurbo(this, 198, 92, textureX, textureY); // Box 180
        bodyModel[108] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 181
        bodyModel[109] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 182
        bodyModel[110] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 183
        bodyModel[111] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 184
        bodyModel[112] = new ModelRendererTurbo(this, 20, 111, textureX, textureY); // Box 185
        bodyModel[113] = new ModelRendererTurbo(this, 20, 111, textureX, textureY); // Box 186
        bodyModel[114] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 187
        bodyModel[115] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 189
        bodyModel[116] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 193
        bodyModel[117] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 194
        bodyModel[118] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 182
        bodyModel[119] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 183
        bodyModel[120] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 184
        bodyModel[121] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 185
        bodyModel[122] = new ModelRendererTurbo(this, 53, 120, textureX, textureY); // Box 186
        bodyModel[123] = new ModelRendererTurbo(this, 20, 111, textureX, textureY); // Box 197
        bodyModel[124] = new ModelRendererTurbo(this, 20, 111, textureX, textureY); // Box 198
        bodyModel[125] = new ModelRendererTurbo(this, 20, 111, textureX, textureY); // Box 200
        bodyModel[126] = new ModelRendererTurbo(this, 20, 111, textureX, textureY); // Box 201
        bodyModel[127] = new ModelRendererTurbo(this, 20, 111, textureX, textureY); // Box 202
        bodyModel[128] = new ModelRendererTurbo(this, 20, 111, textureX, textureY); // Box 203
        bodyModel[129] = new ModelRendererTurbo(this, 20, 111, textureX, textureY); // Box 204
        bodyModel[130] = new ModelRendererTurbo(this, 20, 111, textureX, textureY); // Box 205
        bodyModel[131] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 215
        bodyModel[132] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 216
        bodyModel[133] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 0
        bodyModel[134] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 1
        bodyModel[135] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 2
        bodyModel[136] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 3
        bodyModel[137] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 4
        bodyModel[138] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 5
        bodyModel[139] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 6
        bodyModel[140] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 7
        bodyModel[141] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 20
        bodyModel[142] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 21
        bodyModel[143] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 22
        bodyModel[144] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 23
        bodyModel[145] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 24
        bodyModel[146] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 25
        bodyModel[147] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 26
        bodyModel[148] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 27
        bodyModel[149] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 28
        bodyModel[150] = new ModelRendererTurbo(this, 43, 110, textureX, textureY); // Box 242
        bodyModel[151] = new ModelRendererTurbo(this, 95, 59, textureX, textureY); // Box 243
        bodyModel[152] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 0
        bodyModel[153] = new ModelRendererTurbo(this, 145, 75, textureX, textureY); // Box 1
        bodyModel[154] = new ModelRendererTurbo(this, 145, 75, textureX, textureY); // Box 2
        bodyModel[155] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 3
        bodyModel[156] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 4
        bodyModel[157] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 5
        bodyModel[158] = new ModelRendererTurbo(this, 414, 29, textureX, textureY); // Box 249
        bodyModel[159] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 250
        bodyModel[160] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 251
        bodyModel[161] = new ModelRendererTurbo(this, 339, 65, textureX, textureY); // Box 252
        bodyModel[162] = new ModelRendererTurbo(this, 350, 65, textureX, textureY); // Box 253
        bodyModel[163] = new ModelRendererTurbo(this, 42, 97, textureX, textureY); // Box 254
        bodyModel[164] = new ModelRendererTurbo(this, 178, 101, textureX, textureY); // Box 255
        bodyModel[165] = new ModelRendererTurbo(this, 161, 118, textureX, textureY); // Box 256
        bodyModel[166] = new ModelRendererTurbo(this, 130, 98, textureX, textureY); // Box 257
        bodyModel[167] = new ModelRendererTurbo(this, 268, 31, textureX, textureY); // Box 258
        bodyModel[168] = new ModelRendererTurbo(this, 268, 31, textureX, textureY); // Box 259
        bodyModel[169] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 181
        bodyModel[170] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 182
        bodyModel[171] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 183
        bodyModel[172] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 184
        bodyModel[173] = new ModelRendererTurbo(this, 498, 1, textureX, textureY); // Box 185

        bodyModel[0].addShapeBox(0F, 0F, 0F, 33, 1, 20, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
        bodyModel[0].setRotationPoint(-16F, 6F, -10F);

        bodyModel[1].addBox(0F, 0F, 0F, 29, 2, 20, 0F); // Box 4
        bodyModel[1].setRotationPoint(-42F, 2F, -10F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 7
        bodyModel[2].setRotationPoint(-16F, 4F, -10F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 8
        bodyModel[3].setRotationPoint(-1F, 4F, -10F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[4].setRotationPoint(-13F, 4F, -10F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
        bodyModel[5].setRotationPoint(-12F, 4F, 6F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 21
        bodyModel[6].setRotationPoint(40F, 4F, -10F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 22
        bodyModel[7].setRotationPoint(-19F, 4F, -10F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 24
        bodyModel[8].setRotationPoint(17F, 4F, -10F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 25
        bodyModel[9].setRotationPoint(-42F, 4F, -10F);

        bodyModel[10].addBox(0F, 0F, 0F, 12, 2, 16, 0F); // Box 24
        bodyModel[10].setRotationPoint(-13F, 2F, -10F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 18, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        bodyModel[11].setRotationPoint(-13F, -12F, 8.65F);

        bodyModel[12].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 27
        bodyModel[12].setRotationPoint(-1F, -12F, 9F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 20, 1, 20, 0F,0F, 0F, -0.65F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -0.65F, 0F, 0F, -1F, -1F, 0F, -5.5F, -1F, 0F, -5.5F, 0F, 0F, -1F); // Box 17
        bodyModel[13].setRotationPoint(43F, 6F, -10F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 20, 1, 20, 0F,-0.5F, 0F, -4.5F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -0.5F, 0F, -4.5F, -1F, 0F, -5.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5.5F); // Box 32
        bodyModel[14].setRotationPoint(-62F, 6F, -10F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.85F); // Box 36
        bodyModel[15].setRotationPoint(-43F, 4F, 6F);

        bodyModel[16].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 46
        bodyModel[16].setRotationPoint(-13F, -15F, 9F);

        bodyModel[17].addBox(0F, 0F, 0F, 29, 6, 1, 0F); // Box 48
        bodyModel[17].setRotationPoint(-42F, -4F, 9F);

        bodyModel[18].addBox(0F, 0F, 0F, 29, 1, 1, 0F); // Box 50
        bodyModel[18].setRotationPoint(-42F, -15F, 9F);

        bodyModel[19].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 51
        bodyModel[19].setRotationPoint(-14F, -14F, 9F);

        bodyModel[20].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 52
        bodyModel[20].setRotationPoint(-29F, -14F, 9F);

        bodyModel[21].addBox(0F, 0F, 0F, 13, 10, 0, 0F); // Box 53
        bodyModel[21].setRotationPoint(-42F, -14F, 9.5F);

        bodyModel[22].addBox(0F, 0F, 0F, 13, 10, 0, 0F); // Box 54
        bodyModel[22].setRotationPoint(-27F, -14F, 9.5F);

        bodyModel[23].addBox(0F, 0F, 0F, 41, 6, 1, 0F); // Box 55
        bodyModel[23].setRotationPoint(2F, -4F, 9F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 47, 1, 20, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        bodyModel[24].setRotationPoint(-42F, -16F, -10F);

        bodyModel[25].addBox(0F, 0F, 0F, 44, 6, 1, 0F); // Box 73
        bodyModel[25].setRotationPoint(-42F, -4F, -10F);

        bodyModel[26].addBox(0F, 0F, 0F, 13, 10, 0, 0F); // Box 74
        bodyModel[26].setRotationPoint(-42F, -14F, -9.5F);

        bodyModel[27].addBox(0F, 0F, 0F, 44, 1, 1, 0F); // Box 75
        bodyModel[27].setRotationPoint(-42F, -15F, -10F);

        bodyModel[28].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 77
        bodyModel[28].setRotationPoint(-29F, -14F, -10F);

        bodyModel[29].addBox(0F, 0F, 0F, 13, 10, 0, 0F); // Box 79
        bodyModel[29].setRotationPoint(-27F, -14F, -9.5F);

        bodyModel[30].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 80
        bodyModel[30].setRotationPoint(-14F, -14F, -10F);

        bodyModel[31].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 82
        bodyModel[31].setRotationPoint(0F, -14F, -10F);

        bodyModel[32].addBox(0F, 0F, 0F, 1, 4, 12, 0F); // Box 92
        bodyModel[32].setRotationPoint(-43F, 2F, -6F);

        bodyModel[33].addBox(0F, 0F, 0F, 44, 2, 20, 0F); // Box 100
        bodyModel[33].setRotationPoint(-1F, 2F, -10F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 20, 1, 14, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
        bodyModel[34].setRotationPoint(-39F, -17F, -7F);

        bodyModel[35].addBox(0F, 0F, 0F, 1, 17, 6, 0F); // Box 125
        bodyModel[35].setRotationPoint(0F, -15F, 3F);

        bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 127
        bodyModel[36].setRotationPoint(-14F, -7F, 5F);

        bodyModel[37].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 128
        bodyModel[37].setRotationPoint(-14F, -15F, 4F);

        bodyModel[38].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 132
        bodyModel[38].setRotationPoint(-42F, -15F, 4F);

        bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 139
        bodyModel[39].setRotationPoint(-14F, -15F, -5F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 141
        bodyModel[40].setRotationPoint(-42F, -15F, -5F);

        bodyModel[41].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Box 142
        bodyModel[41].setRotationPoint(-41F, -13F, -5F);

        bodyModel[42].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Box 143
        bodyModel[42].setRotationPoint(-41F, -13F, 4F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 133
        bodyModel[43].setRotationPoint(-35F, -23F, -1F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-5F, 0F, 3.5F, 5F, 0F, 3.5F, 5F, 0F, -3.5F, -5F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 134
        bodyModel[44].setRotationPoint(-35F, -29F, -1.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        bodyModel[45].setRotationPoint(-30.5F, -30F, -8F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 138
        bodyModel[46].setRotationPoint(-30.5F, -30F, 8F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,1F, 0F, 0.75F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0.75F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F); // Box 112
        bodyModel[47].setRotationPoint(-54F, 2F, -4F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Box 117
        bodyModel[48].setRotationPoint(-43F, 2F, 6F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        bodyModel[49].setRotationPoint(-43F, 4F, -10F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        bodyModel[50].setRotationPoint(-43F, 2F, -10F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0.75F, 0F, 0F, 0F, 0F, 3.85F, 0F, 0F, 0F, 0.75F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 3.15F, 0F, 0F, 0F, 0.5F, 0F, 1F); // Box 120
        bodyModel[51].setRotationPoint(-61F, 4F, -6F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 3.85F, 0F, 0F, -1F, 1F, 0F, 1F, 0.75F, 0F, 0F, 0F, 0F, 3.85F, 0F, 0F, 0F, 0.75F, 0F, 1F); // Box 122
        bodyModel[52].setRotationPoint(-61F, 2F, -6F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0.75F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1.2F, 0.75F, 0F, 0F, 0.5F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0.6F, 0.5F, 0F, -0.5F); // Box 124
        bodyModel[53].setRotationPoint(-61F, 4F, 5F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F,1F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 125
        bodyModel[54].setRotationPoint(-61F, 2F, -4F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -1.05F); // Box 126
        bodyModel[55].setRotationPoint(-44F, 4F, 6F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.35F); // Box 127
        bodyModel[56].setRotationPoint(-44F, 2F, 6F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1.2F, 1F, 0F, 0F, 0.75F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1.2F, 0.75F, 0F, 0F); // Box 128
        bodyModel[57].setRotationPoint(-61F, 2F, 5F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 1.5F, 0F, 0F, 0F); // Box 130
        bodyModel[58].setRotationPoint(-54F, 4F, 4F);

        bodyModel[59].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 131
        bodyModel[59].setRotationPoint(-62F, -4F, -4F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 3.85F, 0F, 0F, -4F, -1F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 3.85F, 0F, 0F, -4F, -0.9F, 0F, 0F); // Box 132
        bodyModel[60].setRotationPoint(-62F, -15F, -6F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
        bodyModel[61].setRotationPoint(-43F, -15F, -10F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Box 135
        bodyModel[62].setRotationPoint(-43F, -15F, 9F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        bodyModel[63].setRotationPoint(-62F, -4F, -5F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,-0.9F, 0F, 0F, -2F, 0F, 0.45F, -2F, 0F, -0.46F, -0.9F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.2F, -4F, 0F, -0.21F, 0F, 0F, 0F); // Box 137
        bodyModel[64].setRotationPoint(-62F, -14F, -6F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 3.85F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.85F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 138
        bodyModel[65].setRotationPoint(-62F, -4F, -6F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 140
        bodyModel[66].setRotationPoint(-62F, -4F, 4F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, 0F, -0.7F, 0F, -1.45F, -1F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1.45F, -1F, 0F, 1.2F, 0F, 0F, 0F); // Box 141
        bodyModel[67].setRotationPoint(-62F, -4F, 5F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3.85F, -1F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3.85F, -0.9F, 0F, 0F); // Box 144
        bodyModel[68].setRotationPoint(-62F, -15F, 5F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.35F, -0.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.35F); // Box 145
        bodyModel[69].setRotationPoint(-44F, -14F, 9F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.15F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 147
        bodyModel[70].setRotationPoint(-57F, -14F, -7F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,-0.9F, 0F, 0F, -2F, 0F, -0.46F, -2F, 0F, 0.45F, -0.9F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.21F, -4F, 0F, 0.2F, 0F, 0F, 0F); // Box 148
        bodyModel[71].setRotationPoint(-62F, -14F, 5F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0.1F, 0.3F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0.3F, 0F, -0.45F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 149
        bodyModel[72].setRotationPoint(-57F, -14F, 6F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 13, 10, 0, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F); // Box 150
        bodyModel[73].setRotationPoint(-56F, -14F, -9.5F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 12, 18, 1, 0F,0F, 0F, -0.5F, 0.15F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.15F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Box 151
        bodyModel[74].setRotationPoint(-56F, -12F, 6F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 19, 1, 20, 0F,-0.2F, 0F, -4.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -4.4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 152
        bodyModel[75].setRotationPoint(-61F, -16F, -10F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0.22F, 0F, 0F, 0.22F, 0F, 0F, 0F, 0.09F, 0F, 0F, -0.09F, 0F, 0.22F, -0.09F, 0F, 0.22F, 0.09F, 0F, 0F); // Box 153
        bodyModel[76].setRotationPoint(-61F, -15F, -5F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-0.31F, 0F, -0.21F, 0.2F, 0F, -3F, 0F, 0F, 2.65F, 0F, 0F, 0.1F, -0.31F, 0F, -0.25F, 0.2F, 0F, -3F, 0F, 0F, 2.65F, 0F, 0F, 0.12F); // Box 154
        bodyModel[77].setRotationPoint(-56F, -14F, 6F);

        bodyModel[78].addBox(0F, 0F, 0F, 1, 4, 12, 0F); // Box 155
        bodyModel[78].setRotationPoint(43F, 2F, -6F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.65F); // Box 156
        bodyModel[79].setRotationPoint(43F, 4F, 6F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Box 157
        bodyModel[80].setRotationPoint(43F, 2F, 6F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
        bodyModel[81].setRotationPoint(43F, 4F, -10F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
        bodyModel[82].setRotationPoint(43F, 2F, -10F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F,0F, 0F, 0.75F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.75F); // Box 160
        bodyModel[83].setRotationPoint(56F, 2F, -4F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, 0F, 2F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0F, 0F, 2F); // Box 161
        bodyModel[84].setRotationPoint(44F, 2F, -4F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 3.85F, 0.75F, 0F, 0F, 0.75F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3.15F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0F, 0F); // Box 166
        bodyModel[85].setRotationPoint(44F, 4F, -6F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 3.85F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3.85F, 0.75F, 0F, 0F, 0.75F, 0F, 1F, 0F, 0F, 0F); // Box 167
        bodyModel[86].setRotationPoint(44F, 2F, -6F);

        bodyModel[87].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 168
        bodyModel[87].setRotationPoint(62F, -4F, -4F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 172
        bodyModel[88].setRotationPoint(62F, -4F, 4F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
        bodyModel[89].setRotationPoint(62F, -4F, -5F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F,0F, 0F, 3.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 174
        bodyModel[90].setRotationPoint(44F, -4F, -6F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 10, 10, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
        bodyModel[91].setRotationPoint(-61.5F, -14F, -5F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 10, 0, 0F,-2F, 0F, -2.5F, 1F, 0F, -2F, 1F, 0F, 2F, -2F, 0F, 2.5F, 0F, 0F, -2.75F, 1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F, 2.75F); // Box 157
        bodyModel[92].setRotationPoint(-61F, -14F, -8.5F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 10, 0, 0F,-2F, 0F, 2.5F, 1F, 0F, 2F, 1F, 0F, -2F, -2F, 0F, -2.5F, 0F, 0F, 2.75F, 1F, 0F, 2F, 1F, 0F, -2F, 0F, 0F, -2.75F); // Box 158
        bodyModel[93].setRotationPoint(-61F, -14F, 8.5F);

        bodyModel[94].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 165
        bodyModel[94].setRotationPoint(-60F, -14F, -4F);

        bodyModel[95].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 166
        bodyModel[95].setRotationPoint(-60F, -15F, -3F);

        bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 167
        bodyModel[96].setRotationPoint(-60F, -15F, 2F);

        bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 168
        bodyModel[97].setRotationPoint(-62.5F, -0.5F, -4.5F);

        bodyModel[98].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 169
        bodyModel[98].setRotationPoint(-62.5F, -0.5F, 2.5F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 172
        bodyModel[99].setRotationPoint(-62.5F, 6F, -7F);
        bodyModel[99].rotateAngleZ = -0.52359878F;

        bodyModel[100].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 173
        bodyModel[100].setRotationPoint(-62.4F, 7F, -1F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 175
        bodyModel[101].setRotationPoint(62.25F, -3.5F, -3F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 17, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F); // Box 174
        bodyModel[102].setRotationPoint(-49F, -15F, -8F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 21, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
        bodyModel[103].setRotationPoint(-49F, -15F, 0F);
        bodyModel[103].rotateAngleY = 0.27925268F;

        bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
        bodyModel[104].setRotationPoint(-61F, -3F, -5F);

        bodyModel[105].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 178
        bodyModel[105].setRotationPoint(-54F, 0F, -2F);

        bodyModel[106].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 179
        bodyModel[106].setRotationPoint(-55F, -1F, -3F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 180
        bodyModel[107].setRotationPoint(-51.5F, -6F, -3F);

        bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 181
        bodyModel[108].setRotationPoint(-51.5F, -8F, -2F);

        bodyModel[109].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 182
        bodyModel[109].setRotationPoint(-55F, -4F, -4F);

        bodyModel[110].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 183
        bodyModel[110].setRotationPoint(-55F, -4F, 1F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 184
        bodyModel[111].setRotationPoint(-40F, -1F, 4F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 185
        bodyModel[112].setRotationPoint(-36.5F, -5F, 4F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 186
        bodyModel[113].setRotationPoint(-29.5F, -5F, 4F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 187
        bodyModel[114].setRotationPoint(-33F, -1F, 4F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 189
        bodyModel[115].setRotationPoint(-40F, -1F, -9F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 193
        bodyModel[116].setRotationPoint(-26F, -1F, 4F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
        bodyModel[117].setRotationPoint(-19F, -1F, 4F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 182
        bodyModel[118].setRotationPoint(-33F, -1F, -9F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 183
        bodyModel[119].setRotationPoint(-26F, -1F, -9F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 184
        bodyModel[120].setRotationPoint(-19F, -1F, -9F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 185
        bodyModel[121].setRotationPoint(-12F, -1F, -9F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 186
        bodyModel[122].setRotationPoint(-5F, -1F, -9F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 197
        bodyModel[123].setRotationPoint(-22.5F, -5F, 4F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 198
        bodyModel[124].setRotationPoint(-15.5F, -5F, 4F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 200
        bodyModel[125].setRotationPoint(-8.5F, -5F, -9F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 201
        bodyModel[126].setRotationPoint(-15.5F, -5F, -9F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 202
        bodyModel[127].setRotationPoint(-22.5F, -5F, -9F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 203
        bodyModel[128].setRotationPoint(-29.5F, -5F, -9F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 204
        bodyModel[129].setRotationPoint(-36.5F, -5F, -9F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 205
        bodyModel[130].setRotationPoint(-1.5F, -5F, -9F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-5F, 0F, -3.5F, 5F, 0F, -3.5F, 5F, 0F, 3.5F, -5F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 215
        bodyModel[131].setRotationPoint(-35F, -29F, 0.5F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
        bodyModel[132].setRotationPoint(-30.5F, -30F, -9F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 0
        bodyModel[133].setRotationPoint(-39F, 4F, -10F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 1
        bodyModel[134].setRotationPoint(-39F, 4F, 8F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.5F, 1F, 0F, -1.5F); // Box 2
        bodyModel[135].setRotationPoint(20F, 4F, -10F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 3
        bodyModel[136].setRotationPoint(20F, 4F, 8F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 4
        bodyModel[137].setRotationPoint(-21F, 4F, -10F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 5
        bodyModel[138].setRotationPoint(-21F, 4F, 8F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F); // Box 6
        bodyModel[139].setRotationPoint(38F, 4F, -10F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F); // Box 7
        bodyModel[140].setRotationPoint(38F, 4F, 8F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 20
        bodyModel[141].setRotationPoint(-36.4F, -6F, 4F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 21
        bodyModel[142].setRotationPoint(-36.4F, -6F, -9F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 22
        bodyModel[143].setRotationPoint(-29.4F, -6F, 4F);

        bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 23
        bodyModel[144].setRotationPoint(-29.4F, -6F, -9F);

        bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 24
        bodyModel[145].setRotationPoint(-22.4F, -6F, 4F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 25
        bodyModel[146].setRotationPoint(-22.4F, -6F, -9F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 26
        bodyModel[147].setRotationPoint(-15.4F, -6F, 4F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 27
        bodyModel[148].setRotationPoint(-15.4F, -6F, -9F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 28
        bodyModel[149].setRotationPoint(-8.4F, -6F, -9F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 242
        bodyModel[150].setRotationPoint(-1.4F, -6F, -9F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 14, 1, 12, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
        bodyModel[151].setRotationPoint(-12F, -17F, -6F);

        bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
        bodyModel[152].setRotationPoint(62.25F, -3.5F, 1F);

        bodyModel[153].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 1
        bodyModel[153].setRotationPoint(-62.25F, -0.5F, 4.5F);

        bodyModel[154].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 2
        bodyModel[154].setRotationPoint(-62.25F, -0.5F, -5.5F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 3
        bodyModel[155].setRotationPoint(-25F, -23F, -1F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,5F, 0F, -3.5F, -5F, 0F, -3.5F, -5F, 0F, 3.5F, 5F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
        bodyModel[156].setRotationPoint(-25F, -29F, 0.5F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,5F, 0F, 3.5F, -5F, 0F, 3.5F, -5F, 0F, -3.5F, 5F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 5
        bodyModel[157].setRotationPoint(-25F, -29F, -1.5F);

        bodyModel[158].addBox(0F, 0F, 0F, 41, 6, 1, 0F); // Box 249
        bodyModel[158].setRotationPoint(2F, -4F, -10F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 1F, 0.75F, 0F, 0F, 0F, 0F, 3.85F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 3.15F); // Box 250
        bodyModel[159].setRotationPoint(44F, 4F, 5F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 3.85F, 0F, 0F, 0F, 0.75F, 0F, 1F, 0.75F, 0F, 0F, 0F, 0F, 3.85F); // Box 251
        bodyModel[160].setRotationPoint(44F, 2F, 5F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 252
        bodyModel[161].setRotationPoint(43F, -4F, -10F);

        bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Box 253
        bodyModel[162].setRotationPoint(43F, -4F, 6F);

        bodyModel[163].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.85F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.85F); // Box 254
        bodyModel[163].setRotationPoint(44F, -4F, 5F);

        bodyModel[164].addBox(0F, 0F, 0F, 1, 17, 6, 0F); // Box 255
        bodyModel[164].setRotationPoint(0F, -15F, -9F);

        bodyModel[165].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 256
        bodyModel[165].setRotationPoint(0F, -15F, -3F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 257
        bodyModel[166].setRotationPoint(-0.25F, -12F, -3F);

        bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 258
        bodyModel[167].setRotationPoint(2F, -15F, -10F);

        bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 259
        bodyModel[168].setRotationPoint(2F, -15F, 9F);

        bodyModel[169].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 181
        bodyModel[169].setRotationPoint(-12F, -14F, -10F);

        bodyModel[170].addBox(0F, 0F, 0F, 1, 6, 8, 0F); // Box 182
        bodyModel[170].setRotationPoint(-2F, -12F, -10F);
        bodyModel[170].rotateAngleY = 1.57079633F;

        bodyModel[171].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 183
        bodyModel[171].setRotationPoint(-2F, -14F, -10F);

        bodyModel[172].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 184
        bodyModel[172].setRotationPoint(-10F, -12F, -10F);
        bodyModel[172].rotateAngleZ = 1.57079633F;

        bodyModel[173].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 185
        bodyModel[173].setRotationPoint(-14F, -4F, -10F);
        bodyModel[173].rotateAngleZ = 1.57079633F;

        this.flipAll();
    }
}