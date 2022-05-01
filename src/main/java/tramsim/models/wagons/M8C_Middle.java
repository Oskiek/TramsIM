package tramsim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class M8C_Middle extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 256;

    public M8C_Middle() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[108];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 226, 150, textureX, textureY); // Box 24
        bodyModel[1] = new ModelRendererTurbo(this, 309, 150, textureX, textureY); // Box 25
        bodyModel[2] = new ModelRendererTurbo(this, 401, 136, textureX, textureY); // Box 27
        bodyModel[3] = new ModelRendererTurbo(this, 401, 142, textureX, textureY); // Box 28
        bodyModel[4] = new ModelRendererTurbo(this, 309, 136, textureX, textureY); // Box 57
        bodyModel[5] = new ModelRendererTurbo(this, 226, 140, textureX, textureY); // Box 58
        bodyModel[6] = new ModelRendererTurbo(this, 403, 156, textureX, textureY); // Box 59
        bodyModel[7] = new ModelRendererTurbo(this, 402, 148, textureX, textureY); // Box 99
        bodyModel[8] = new ModelRendererTurbo(this, 402, 152, textureX, textureY); // Box 109
        bodyModel[9] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 130
        bodyModel[10] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 136
        bodyModel[11] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 137
        bodyModel[12] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 138
        bodyModel[13] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 139
        bodyModel[14] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 127
        bodyModel[15] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 128
        bodyModel[16] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 129
        bodyModel[17] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 130
        bodyModel[18] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 131
        bodyModel[19] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 132
        bodyModel[20] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 133
        bodyModel[21] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 135
        bodyModel[22] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 136
        bodyModel[23] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 137
        bodyModel[24] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 138
        bodyModel[25] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 139
        bodyModel[26] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 140
        bodyModel[27] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 156
        bodyModel[28] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 161
        bodyModel[29] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 117
        bodyModel[30] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 118
        bodyModel[31] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 119
        bodyModel[32] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 120
        bodyModel[33] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 121
        bodyModel[34] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 127
        bodyModel[35] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 128
        bodyModel[36] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 131
        bodyModel[37] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 132
        bodyModel[38] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 177
        bodyModel[39] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 180
        bodyModel[40] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 181
        bodyModel[41] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 142
        bodyModel[42] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 143
        bodyModel[43] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 144
        bodyModel[44] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 145
        bodyModel[45] = new ModelRendererTurbo(this, 296, 164, textureX, textureY); // Box 152
        bodyModel[46] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 326
        bodyModel[47] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 327
        bodyModel[48] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 328
        bodyModel[49] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 329
        bodyModel[50] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 256
        bodyModel[51] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 343
        bodyModel[52] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 188
        bodyModel[53] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 189
        bodyModel[54] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 191
        bodyModel[55] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 192
        bodyModel[56] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 193
        bodyModel[57] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 194
        bodyModel[58] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 195
        bodyModel[59] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 196
        bodyModel[60] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 198
        bodyModel[61] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 200
        bodyModel[62] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 205
        bodyModel[63] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 206
        bodyModel[64] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 207
        bodyModel[65] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 209
        bodyModel[66] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 296
        bodyModel[67] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 298
        bodyModel[68] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 299
        bodyModel[69] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 300
        bodyModel[70] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 301
        bodyModel[71] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 302
        bodyModel[72] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 303
        bodyModel[73] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 304
        bodyModel[74] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 305
        bodyModel[75] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 306
        bodyModel[76] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 305
        bodyModel[77] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 306
        bodyModel[78] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 307
        bodyModel[79] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 308
        bodyModel[80] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 309
        bodyModel[81] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 310
        bodyModel[82] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 311
        bodyModel[83] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 312
        bodyModel[84] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 313
        bodyModel[85] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 314
        bodyModel[86] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 315
        bodyModel[87] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 120
        bodyModel[88] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 121
        bodyModel[89] = new ModelRendererTurbo(this, 10, 23, textureX, textureY); // Box 122
        bodyModel[90] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 123
        bodyModel[91] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 124
        bodyModel[92] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 125
        bodyModel[93] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 326
        bodyModel[94] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 327
        bodyModel[95] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 328
        bodyModel[96] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 329
        bodyModel[97] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 130
        bodyModel[98] = new ModelRendererTurbo(this, 485, 136, textureX, textureY); // Box 131
        bodyModel[99] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 132
        bodyModel[100] = new ModelRendererTurbo(this, 469, 156, textureX, textureY); // Box 133
        bodyModel[101] = new ModelRendererTurbo(this, 486, 164, textureX, textureY); // Box 134
        bodyModel[102] = new ModelRendererTurbo(this, 469, 156, textureX, textureY); // Box 135
        bodyModel[103] = new ModelRendererTurbo(this, 494, 136, textureX, textureY); // Box 136
        bodyModel[104] = new ModelRendererTurbo(this, 503, 138, textureX, textureY); // Box 137
        bodyModel[105] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 113
        bodyModel[106] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 114
        bodyModel[107] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 107

        bodyModel[0].addShapeBox(0F, 0F, 0F, 40, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
        bodyModel[0].setRotationPoint(-20F, -3F, 9F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 40, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        bodyModel[1].setRotationPoint(-20F, -15.5F, 9F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 40, 4, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[2].setRotationPoint(-20F, -19.5F, 8.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 40, 4, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
        bodyModel[3].setRotationPoint(-20F, -19.5F, -9.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 40, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        bodyModel[4].setRotationPoint(-20F, -15.5F, -10F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 40, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
        bodyModel[5].setRotationPoint(-20F, -3F, -10F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 1, 17, 0F,-2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 59
        bodyModel[6].setRotationPoint(-17F, 4F, -8F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 99
        bodyModel[7].setRotationPoint(-20F, 5F, 9F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 40, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[8].setRotationPoint(-20F, 5F, -10F);

        bodyModel[9].addBox(0F, 0F, 0F, 4, 4, 7, 0F); // Box 130
        bodyModel[9].setRotationPoint(-8.4F, 0.5F, -9.31F);

        bodyModel[10].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 136
        bodyModel[10].setRotationPoint(-8F, 0.5F, 5.1F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 137
        bodyModel[11].setRotationPoint(-10F, -0.5F, 1F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 138
        bodyModel[12].setRotationPoint(-6.5F, -9.5F, 0.5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 139
        bodyModel[13].setRotationPoint(-6F, -0.5F, 1F);

        bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 127
        bodyModel[14].setRotationPoint(-15F, 5F, -9F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 128
        bodyModel[15].setRotationPoint(-6.7F, -9.5F, -9.51F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 129
        bodyModel[16].setRotationPoint(-6.2F, -0.5F, -9F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 130
        bodyModel[17].setRotationPoint(-10.2F, -0.5F, -9.01F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 131
        bodyModel[18].setRotationPoint(-6.7F, -9.5F, -13.51F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 132
        bodyModel[19].setRotationPoint(-6.2F, -0.5F, -12.5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 133
        bodyModel[20].setRotationPoint(-10.2F, -0.5F, -13.01F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 135
        bodyModel[21].setRotationPoint(-17.5F, -0.5F, 1F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 136
        bodyModel[22].setRotationPoint(-17.5F, -9.5F, 0.5F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 137
        bodyModel[23].setRotationPoint(-17.5F, -9.5F, -13.51F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 138
        bodyModel[24].setRotationPoint(-17.5F, -0.5F, -13.01F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 139
        bodyModel[25].setRotationPoint(-17.5F, -9.5F, -9.51F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 140
        bodyModel[26].setRotationPoint(-17.5F, -0.5F, -9.01F);

        bodyModel[27].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 156
        bodyModel[27].setRotationPoint(3F, 5F, -9F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 1, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[28].setRotationPoint(7F, 4F, -8F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 117
        bodyModel[29].setRotationPoint(17.31F, -9.5F, -13.51F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 118
        bodyModel[30].setRotationPoint(17.31F, -9.5F, -9.51F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 119
        bodyModel[31].setRotationPoint(14.31F, -0.5F, -9.01F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 120
        bodyModel[32].setRotationPoint(14.31F, -0.5F, -13.01F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
        bodyModel[33].setRotationPoint(15.3F, 0.5F, -6.31F);

        bodyModel[34].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 127
        bodyModel[34].setRotationPoint(3.59F, 0.5F, 5.1F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 128
        bodyModel[35].setRotationPoint(1.6F, -0.5F, 1F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 131
        bodyModel[36].setRotationPoint(14.3F, -0.5F, 1F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 132
        bodyModel[37].setRotationPoint(17.3F, -9.5F, 0.5F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 22, 3, 0F,0F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 177
        bodyModel[38].setRotationPoint(18.25F, -18F, -9.5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0.5F, 0F, -2.5F, 0F, 0F, -2F, 0F); // Box 180
        bodyModel[39].setRotationPoint(18.25F, -18.5F, -6.5F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F); // Box 181
        bodyModel[40].setRotationPoint(18.25F, -18.5F, -3.5F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 142
        bodyModel[41].setRotationPoint(18.25F, -7F, -6.5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1.25F, 0.5F, 0F, -1F, 0F); // Box 143
        bodyModel[42].setRotationPoint(18.25F, -18.5F, 4.5F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 22, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
        bodyModel[43].setRotationPoint(18.25F, -18F, 6.5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -2F, -0.5F, -0.5F, -2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 145
        bodyModel[44].setRotationPoint(18.25F, -7F, 5.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 40, 1, 13, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 152
        bodyModel[45].setRotationPoint(-20F, -19F, -7F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F); // Box 326
        bodyModel[46].setRotationPoint(17F, 4F, -9F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F); // Box 327
        bodyModel[47].setRotationPoint(15F, 4F, -9F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        bodyModel[48].setRotationPoint(15F, 4F, 5F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
        bodyModel[49].setRotationPoint(17F, 4F, 7F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 256
        bodyModel[50].setRotationPoint(5F, -17.5F, -3F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 343
        bodyModel[51].setRotationPoint(-6.5F, -17.5F, -3F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 188
        bodyModel[52].setRotationPoint(5F, -17.5F, 5F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 189
        bodyModel[53].setRotationPoint(-6.5F, -17.5F, 5F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, -0.5F, -0.6F, 11F, -0.5F, -0.6F, 11F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.6F, 11F, 0F, -0.6F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 191
        bodyModel[54].setRotationPoint(-17F, -16.5F, 5F);

        bodyModel[55].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 192
        bodyModel[55].setRotationPoint(8.5F, -16F, 4.8F);

        bodyModel[56].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 193
        bodyModel[56].setRotationPoint(2.5F, -16F, 4.8F);

        bodyModel[57].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 194
        bodyModel[57].setRotationPoint(-4.5F, -16F, 4.8F);

        bodyModel[58].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 195
        bodyModel[58].setRotationPoint(-8.5F, -16F, 4.8F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 196
        bodyModel[59].setRotationPoint(17.7F, -17.5F, 5F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 198
        bodyModel[60].setRotationPoint(17.5F, -17.5F, -2.5F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.6F, -0.6F, 0.25F, -0.6F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.6F, -0.6F, 0.25F, -0.6F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 200
        bodyModel[61].setRotationPoint(-6.5F, -10F, -2.6F);

        bodyModel[62].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 205
        bodyModel[62].setRotationPoint(-7F, -18.8F, -0.5F);

        bodyModel[63].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 206
        bodyModel[63].setRotationPoint(-15.1F, -18.8F, -0.5F);

        bodyModel[64].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 207
        bodyModel[64].setRotationPoint(8.9F, -18.8F, -0.5F);

        bodyModel[65].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 209
        bodyModel[65].setRotationPoint(1.1F, -18.8F, -0.5F);

        bodyModel[66].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 296
        bodyModel[66].setRotationPoint(14.5F, -2F, -1F);

        bodyModel[67].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 298
        bodyModel[67].setRotationPoint(-5F, -2F, -0.99F);

        bodyModel[68].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 299
        bodyModel[68].setRotationPoint(-10.5F, -2F, -1F);

        bodyModel[69].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 300
        bodyModel[69].setRotationPoint(-16.5F, -2F, -1F);

        bodyModel[70].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 301
        bodyModel[70].setRotationPoint(-16.5F, -2F, 4.99F);

        bodyModel[71].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 302
        bodyModel[71].setRotationPoint(-10F, -2F, 4.99F);

        bodyModel[72].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 303
        bodyModel[72].setRotationPoint(-5F, -2F, 4.99F);

        bodyModel[73].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 304
        bodyModel[73].setRotationPoint(1.5F, -2F, 4.99F);

        bodyModel[74].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 305
        bodyModel[74].setRotationPoint(6.5F, -2F, 4.99F);

        bodyModel[75].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 306
        bodyModel[75].setRotationPoint(14.25F, -2F, 4.99F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 305
        bodyModel[76].setRotationPoint(17F, 0.5F, 5.7F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 306
        bodyModel[77].setRotationPoint(14F, 0.5F, 5.7F);

        bodyModel[78].addBox(0F, 0F, 0F, 4, 4, 7, 0F); // Box 307
        bodyModel[78].setRotationPoint(3.1F, 0.5F, -9.31F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 308
        bodyModel[79].setRotationPoint(5.3F, -0.5F, -9.01F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 309
        bodyModel[80].setRotationPoint(5.3F, -0.5F, -13.01F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 310
        bodyModel[81].setRotationPoint(4.8F, -9.5F, -9.51F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 311
        bodyModel[82].setRotationPoint(4.8F, -9.5F, -13.51F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 312
        bodyModel[83].setRotationPoint(1.3F, -0.5F, -9.01F);

        bodyModel[84].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 313
        bodyModel[84].setRotationPoint(1F, -2F, -1F);

        bodyModel[85].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 314
        bodyModel[85].setRotationPoint(6.5F, -2F, -1F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 315
        bodyModel[86].setRotationPoint(1.3F, -0.5F, -13.01F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 120
        bodyModel[87].setRotationPoint(5F, -9.5F, 0.5F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -6F, -3F, -4F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 121
        bodyModel[88].setRotationPoint(5.5F, -0.5F, 1F);

        bodyModel[89].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 122
        bodyModel[89].setRotationPoint(6.5F, -2F, 4.49F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        bodyModel[90].setRotationPoint(-15.7F, 0.5F, -6.31F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 124
        bodyModel[91].setRotationPoint(-17.5F, 0.5F, 5.7F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 125
        bodyModel[92].setRotationPoint(-14.5F, 0.5F, 5.7F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F); // Box 326
        bodyModel[93].setRotationPoint(-20F, 4F, -9F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F); // Box 327
        bodyModel[94].setRotationPoint(-17F, 4F, -9F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
        bodyModel[95].setRotationPoint(-17F, 4F, 5F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
        bodyModel[96].setRotationPoint(-20F, 4F, 7F);

        bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 130
        bodyModel[97].setRotationPoint(14F, 5F, -9F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 22, 3, 0F,0F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 131
        bodyModel[98].setRotationPoint(-19F, -18F, -9.5F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, -0.5F, -0.5F, -2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 132
        bodyModel[99].setRotationPoint(-19F, -7F, -6.5F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.5F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 133
        bodyModel[100].setRotationPoint(-19F, -18.5F, -6.5F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 2F); // Box 134
        bodyModel[101].setRotationPoint(-19F, -18.5F, -4.5F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0.5F); // Box 135
        bodyModel[102].setRotationPoint(-19F, -18.5F, 4.5F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 22, 3, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
        bodyModel[103].setRotationPoint(-19F, -18F, 6.5F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.5F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 137
        bodyModel[104].setRotationPoint(-19F, -7F, 5.5F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[105].setRotationPoint(-17.25F, -17.5F, -3F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[106].setRotationPoint(-17.3F, -17.5F, 5F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.6F, -0.6F, 0.25F, -0.6F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.6F, -0.6F, 0.25F, -0.6F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 107
        bodyModel[107].setRotationPoint(5F, -10F, -2.6F);
        this.flipAll();
    }
}