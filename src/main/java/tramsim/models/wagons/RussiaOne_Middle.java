package tramsim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class RussiaOne_Middle extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public RussiaOne_Middle() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[100];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 3
        bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 16
        bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
        bodyModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 21
        bodyModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 34
        bodyModel[6] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 36
        bodyModel[7] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 44
        bodyModel[8] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 47
        bodyModel[9] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 50
        bodyModel[10] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 51
        bodyModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 52
        bodyModel[12] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 54
        bodyModel[13] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 55
        bodyModel[14] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 56
        bodyModel[15] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 57
        bodyModel[16] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 58
        bodyModel[17] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 59
        bodyModel[18] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 60
        bodyModel[19] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 61
        bodyModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 63
        bodyModel[21] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 64
        bodyModel[22] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 120
        bodyModel[23] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 121
        bodyModel[24] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 122
        bodyModel[25] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 123
        bodyModel[26] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 124
        bodyModel[27] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 125
        bodyModel[28] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 142
        bodyModel[29] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 143
        bodyModel[30] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 74
        bodyModel[31] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 75
        bodyModel[32] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 155
        bodyModel[33] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 156
        bodyModel[34] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 157
        bodyModel[35] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 158
        bodyModel[36] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 159
        bodyModel[37] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 160
        bodyModel[38] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 161
        bodyModel[39] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 162
        bodyModel[40] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 163
        bodyModel[41] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 164
        bodyModel[42] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 165
        bodyModel[43] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 166
        bodyModel[44] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 167
        bodyModel[45] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 168
        bodyModel[46] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 169
        bodyModel[47] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 170
        bodyModel[48] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 171
        bodyModel[49] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 172
        bodyModel[50] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 173
        bodyModel[51] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 174
        bodyModel[52] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 175
        bodyModel[53] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 176
        bodyModel[54] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 177
        bodyModel[55] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 178
        bodyModel[56] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 179
        bodyModel[57] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 180
        bodyModel[58] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 181
        bodyModel[59] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 182
        bodyModel[60] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 183
        bodyModel[61] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 184
        bodyModel[62] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 185
        bodyModel[63] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 186
        bodyModel[64] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 187
        bodyModel[65] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 188
        bodyModel[66] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 189
        bodyModel[67] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 190
        bodyModel[68] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 191
        bodyModel[69] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 192
        bodyModel[70] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 193
        bodyModel[71] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 194
        bodyModel[72] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 195
        bodyModel[73] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 196
        bodyModel[74] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 197
        bodyModel[75] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 198
        bodyModel[76] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 199
        bodyModel[77] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 200
        bodyModel[78] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 201
        bodyModel[79] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 202
        bodyModel[80] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 204
        bodyModel[81] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 205
        bodyModel[82] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 206
        bodyModel[83] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 207
        bodyModel[84] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 208
        bodyModel[85] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 209
        bodyModel[86] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 210
        bodyModel[87] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 211
        bodyModel[88] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 212
        bodyModel[89] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 213
        bodyModel[90] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 214
        bodyModel[91] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 215
        bodyModel[92] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 216
        bodyModel[93] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 217
        bodyModel[94] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 218
        bodyModel[95] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 219
        bodyModel[96] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 220
        bodyModel[97] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 221
        bodyModel[98] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 222
        bodyModel[99] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 223

        bodyModel[0].addShapeBox(0F, 0F, 0F, 70, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
        bodyModel[0].setRotationPoint(-35F, -2F, -11F);

        bodyModel[1].addBox(0F, 0F, 0F, 26, 6, 1, 0F); // Box 3
        bodyModel[1].setRotationPoint(-13F, -8F, -11F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 62, 4, 22, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bodyModel[2].setRotationPoint(-31F, -29F, -11F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 20, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 20
        bodyModel[3].setRotationPoint(-20F, -22F, -11F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 62, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 21
        bodyModel[4].setRotationPoint(-31F, -25F, -11F);

        bodyModel[5].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 34
        bodyModel[5].setRotationPoint(-13F, -22F, -11F);

        bodyModel[6].addBox(0F, 0F, 0F, 20, 14, 0, 0F); // Box 36
        bodyModel[6].setRotationPoint(-10F, -22F, -10.9F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 44
        bodyModel[7].setRotationPoint(31F, -8F, -10F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        bodyModel[8].setRotationPoint(31F, -5F, -10F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
        bodyModel[9].setRotationPoint(31F, -8F, 9F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 51
        bodyModel[10].setRotationPoint(31F, -5F, 6F);

        bodyModel[11].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 52
        bodyModel[11].setRotationPoint(30F, -22F, -10F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 62, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        bodyModel[12].setRotationPoint(-31F, -25F, 7F);

        bodyModel[13].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 55
        bodyModel[13].setRotationPoint(30F, -22F, 9F);

        bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 56
        bodyModel[14].setRotationPoint(30F, -25F, -7F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 57
        bodyModel[15].setRotationPoint(30F, -25F, -8F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 58
        bodyModel[16].setRotationPoint(30F, -25F, 7F);

        bodyModel[17].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 59
        bodyModel[17].setRotationPoint(31F, -22F, -10F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 60
        bodyModel[18].setRotationPoint(31F, -25F, -8F);

        bodyModel[19].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 61
        bodyModel[19].setRotationPoint(31F, -27F, -7F);

        bodyModel[20].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 63
        bodyModel[20].setRotationPoint(31F, -22F, 9F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 64
        bodyModel[21].setRotationPoint(31F, -25F, 7F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
        bodyModel[22].setRotationPoint(-10F, -8F, -10F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
        bodyModel[23].setRotationPoint(-9.5F, -8F, -10F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
        bodyModel[24].setRotationPoint(-11.5F, -12.5F, -10F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
        bodyModel[25].setRotationPoint(-12F, -12.5F, -10F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 124
        bodyModel[26].setRotationPoint(11F, -12.5F, -10F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 125
        bodyModel[27].setRotationPoint(-11.5F, -12F, -5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
        bodyModel[28].setRotationPoint(-9.5F, -21.5F, -10F);
        bodyModel[28].rotateAngleX = -0.10471976F;

        bodyModel[29].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
        bodyModel[29].setRotationPoint(-10.5F, -20F, -10.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 74
        bodyModel[30].setRotationPoint(-10.25F, -19F, -5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 4F, -2F, -0.25F, 4F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -6F, -0.5F, -0.25F, -6F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 75
        bodyModel[31].setRotationPoint(-10.25F, -20.5F, -10F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 155
        bodyModel[32].setRotationPoint(9.25F, -19F, -5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 4F, -2F, -0.25F, 4F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -6F, -0.5F, -0.25F, -6F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 156
        bodyModel[33].setRotationPoint(9.25F, -20.5F, -10F);

        bodyModel[34].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 157
        bodyModel[34].setRotationPoint(10F, -22F, -11F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 20, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 158
        bodyModel[35].setRotationPoint(-27F, -22F, -11F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 7, 20, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 159
        bodyModel[36].setRotationPoint(20F, -22F, -11F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 20, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 160
        bodyModel[37].setRotationPoint(13F, -22F, -11F);

        bodyModel[38].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 161
        bodyModel[38].setRotationPoint(-31F, -22F, -11F);

        bodyModel[39].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 162
        bodyModel[39].setRotationPoint(27F, -22F, -11F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        bodyModel[40].setRotationPoint(30F, -8F, -9F);

        bodyModel[41].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 164
        bodyModel[41].setRotationPoint(30F, -5F, -10F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 165
        bodyModel[42].setRotationPoint(30F, -8F, 6F);

        bodyModel[43].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 166
        bodyModel[43].setRotationPoint(30F, -5F, 6F);

        bodyModel[44].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 167
        bodyModel[44].setRotationPoint(-31F, -5F, -10F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
        bodyModel[45].setRotationPoint(-31F, -8F, -9F);

        bodyModel[46].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 169
        bodyModel[46].setRotationPoint(-31F, -22F, -10F);

        bodyModel[47].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 170
        bodyModel[47].setRotationPoint(-31F, -5F, 6F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 171
        bodyModel[48].setRotationPoint(-31F, -8F, 6F);

        bodyModel[49].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 172
        bodyModel[49].setRotationPoint(-31F, -22F, 9F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 173
        bodyModel[50].setRotationPoint(-35F, -8F, 9F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 174
        bodyModel[51].setRotationPoint(-35F, -5F, 6F);

        bodyModel[52].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 175
        bodyModel[52].setRotationPoint(-35F, -22F, 9F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
        bodyModel[53].setRotationPoint(-35F, -5F, -10F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 177
        bodyModel[54].setRotationPoint(-35F, -8F, -10F);

        bodyModel[55].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 178
        bodyModel[55].setRotationPoint(-35F, -22F, -10F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 179
        bodyModel[56].setRotationPoint(-35F, -25F, -8F);

        bodyModel[57].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 180
        bodyModel[57].setRotationPoint(-35F, -27F, -7F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 181
        bodyModel[58].setRotationPoint(-35F, -25F, 7F);

        bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 182
        bodyModel[59].setRotationPoint(-31F, -25F, -7F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 183
        bodyModel[60].setRotationPoint(-31F, -25F, -8F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 184
        bodyModel[61].setRotationPoint(-31F, -25F, 7F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185
        bodyModel[62].setRotationPoint(10F, -12F, -5F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 186
        bodyModel[63].setRotationPoint(9.5F, -8F, -10F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 187
        bodyModel[64].setRotationPoint(-10F, -7F, -9F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 188
        bodyModel[65].setRotationPoint(-10F, -6F, -9F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
        bodyModel[66].setRotationPoint(-11F, -4F, -8F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, -1F); // Box 190
        bodyModel[67].setRotationPoint(9F, -6F, -9F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 191
        bodyModel[68].setRotationPoint(9F, -7F, -9F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 192
        bodyModel[69].setRotationPoint(10F, -4F, -9F);

        bodyModel[70].addBox(0F, 0F, 0F, 26, 6, 1, 0F); // Box 193
        bodyModel[70].setRotationPoint(-13F, -8F, 10F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 20, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 194
        bodyModel[71].setRotationPoint(-20F, -22F, 10F);

        bodyModel[72].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 195
        bodyModel[72].setRotationPoint(-13F, -22F, 10F);

        bodyModel[73].addBox(0F, 0F, 0F, 20, 14, 0, 0F); // Box 196
        bodyModel[73].setRotationPoint(-10F, -22F, 10.9F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 197
        bodyModel[74].setRotationPoint(-10F, -8F, 4F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
        bodyModel[75].setRotationPoint(-9.5F, -8F, 9F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
        bodyModel[76].setRotationPoint(-11.5F, -12.5F, 9F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 200
        bodyModel[77].setRotationPoint(-12F, -12.5F, 4F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 201
        bodyModel[78].setRotationPoint(11F, -12.5F, 4F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 202
        bodyModel[79].setRotationPoint(-11.5F, -12F, 4F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 204
        bodyModel[80].setRotationPoint(-10.25F, -19F, 4F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 4F, -2F, -0.25F, 4F, -2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -6F, -0.5F, -0.25F, -6F, -0.5F); // Box 205
        bodyModel[81].setRotationPoint(-10.25F, -20.5F, 4F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 206
        bodyModel[82].setRotationPoint(9.25F, -19F, 4F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 4F, -2F, -0.25F, 4F, -2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -6F, -0.5F, -0.25F, -6F, -0.5F); // Box 207
        bodyModel[83].setRotationPoint(9.25F, -20.5F, 4F);

        bodyModel[84].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 208
        bodyModel[84].setRotationPoint(10F, -22F, 10F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 7, 20, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 209
        bodyModel[85].setRotationPoint(-27F, -22F, 10F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 7, 20, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 210
        bodyModel[86].setRotationPoint(20F, -22F, 10F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 20, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 211
        bodyModel[87].setRotationPoint(13F, -22F, 10F);

        bodyModel[88].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 212
        bodyModel[88].setRotationPoint(-31F, -22F, 10F);

        bodyModel[89].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 213
        bodyModel[89].setRotationPoint(27F, -22F, 10F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 214
        bodyModel[90].setRotationPoint(10F, -12F, 4F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 215
        bodyModel[91].setRotationPoint(9.5F, -8F, 4F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 216
        bodyModel[92].setRotationPoint(-10F, -7F, 4F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F); // Box 217
        bodyModel[93].setRotationPoint(-10F, -6F, 4F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 218
        bodyModel[94].setRotationPoint(-11F, -4F, 4F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 219
        bodyModel[95].setRotationPoint(9F, -6F, 4F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 220
        bodyModel[96].setRotationPoint(9F, -7F, 4F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 221
        bodyModel[97].setRotationPoint(10F, -4F, 5F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 222
        bodyModel[98].setRotationPoint(-9.5F, -21.5F, 9F);
        bodyModel[98].rotateAngleX = 0.10471976F;

        bodyModel[99].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 223
        bodyModel[99].setRotationPoint(-10.5F, -20F, 9.5F);
        this.flipAll();
    }
}