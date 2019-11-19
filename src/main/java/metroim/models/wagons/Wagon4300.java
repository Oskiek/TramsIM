package metroim.models.wagons;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Wagon4300 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public Wagon4300() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[110];

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
        bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
        bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
        bodyModel[11] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 24
        bodyModel[12] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 25
        bodyModel[13] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 26
        bodyModel[14] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 27
        bodyModel[15] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 28
        bodyModel[16] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 28
        bodyModel[17] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 29
        bodyModel[18] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 30
        bodyModel[19] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 62
        bodyModel[20] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 63
        bodyModel[21] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 64
        bodyModel[22] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 65
        bodyModel[23] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 66
        bodyModel[24] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 67
        bodyModel[25] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 68
        bodyModel[26] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 70
        bodyModel[27] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 72
        bodyModel[28] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 73
        bodyModel[29] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 75
        bodyModel[30] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 76
        bodyModel[31] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 77
        bodyModel[32] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 78
        bodyModel[33] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 79
        bodyModel[34] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 80
        bodyModel[35] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 81
        bodyModel[36] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 82
        bodyModel[37] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 83
        bodyModel[38] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 87
        bodyModel[39] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 92
        bodyModel[40] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 96
        bodyModel[41] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 108
        bodyModel[42] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 109
        bodyModel[43] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 110
        bodyModel[44] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 111
        bodyModel[45] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 112
        bodyModel[46] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 113
        bodyModel[47] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 114
        bodyModel[48] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 115
        bodyModel[49] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 133
        bodyModel[50] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 134
        bodyModel[51] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 135
        bodyModel[52] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 137
        bodyModel[53] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 138
        bodyModel[54] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 139
        bodyModel[55] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 126
        bodyModel[56] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 127
        bodyModel[57] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 128
        bodyModel[58] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 129
        bodyModel[59] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 130
        bodyModel[60] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 131
        bodyModel[61] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 132
        bodyModel[62] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 133
        bodyModel[63] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 134
        bodyModel[64] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 135
        bodyModel[65] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 136
        bodyModel[66] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 137
        bodyModel[67] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 138
        bodyModel[68] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 139
        bodyModel[69] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 140
        bodyModel[70] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 141
        bodyModel[71] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 143
        bodyModel[72] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 144
        bodyModel[73] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 145
        bodyModel[74] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 146
        bodyModel[75] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 147
        bodyModel[76] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 148
        bodyModel[77] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 149
        bodyModel[78] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 151
        bodyModel[79] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 152
        bodyModel[80] = new ModelRendererTurbo(this, 457, 85, textureX, textureY); // Box 154
        bodyModel[81] = new ModelRendererTurbo(this, 457, 85, textureX, textureY); // Box 155
        bodyModel[82] = new ModelRendererTurbo(this, 457, 85, textureX, textureY); // Box 156
        bodyModel[83] = new ModelRendererTurbo(this, 265, 94, textureX, textureY); // Box 157
        bodyModel[84] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 158
        bodyModel[85] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 159
        bodyModel[86] = new ModelRendererTurbo(this, 129, 87, textureX, textureY); // Box 160
        bodyModel[87] = new ModelRendererTurbo(this, 157, 87, textureX, textureY); // Box 161
        bodyModel[88] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 162
        bodyModel[89] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 163
        bodyModel[90] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 164
        bodyModel[91] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 165
        bodyModel[92] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 166
        bodyModel[93] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 167
        bodyModel[94] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 168
        bodyModel[95] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 169
        bodyModel[96] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 171
        bodyModel[97] = new ModelRendererTurbo(this, 0, 87, textureX, textureY); // Box 110
        bodyModel[98] = new ModelRendererTurbo(this, 0, 87, textureX, textureY); // Box 111
        bodyModel[99] = new ModelRendererTurbo(this, 0, 87, textureX, textureY); // Box 112
        bodyModel[100] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 111
        bodyModel[101] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 112
        bodyModel[102] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 113
        bodyModel[103] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 114
        bodyModel[104] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 115
        bodyModel[105] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 116
        bodyModel[106] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 117
        bodyModel[107] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 118
        bodyModel[108] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 119
        bodyModel[109] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 120

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

        bodyModel[7].addShapeBox(0F, -3F, 0F, 52, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
        bodyModel[7].setRotationPoint(-20F, -21F, 8F);

        bodyModel[8].addShapeBox(0F, -3F, 0F, 52, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
        bodyModel[8].setRotationPoint(-20F, -21F, -9F);

        bodyModel[9].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 19
        bodyModel[9].setRotationPoint(-10F, -4F, -7F);

        bodyModel[10].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 20
        bodyModel[10].setRotationPoint(-29F, -4F, 4F);

        bodyModel[11].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 24
        bodyModel[11].setRotationPoint(24F, -4F, -7F);

        bodyModel[12].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 25
        bodyModel[12].setRotationPoint(24F, -4F, 4F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[13].setRotationPoint(30F, -18F, -8F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[14].setRotationPoint(30F, -18F, 5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[15].setRotationPoint(22F, -16F, 7F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 60, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[16].setRotationPoint(-30F, -19F, -8F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 60, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        bodyModel[17].setRotationPoint(-30F, -19F, 6F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[18].setRotationPoint(30F, -18F, -5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        bodyModel[19].setRotationPoint(12F, -16F, 7F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[20].setRotationPoint(-5F, -16F, 7F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        bodyModel[21].setRotationPoint(-14F, -16F, 7F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[22].setRotationPoint(-15F, -16F, -8F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        bodyModel[23].setRotationPoint(-5F, -16F, -8F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        bodyModel[24].setRotationPoint(12F, -16F, -8F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        bodyModel[25].setRotationPoint(22F, -16F, -8F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 70
        bodyModel[26].setRotationPoint(-10F, -8F, -8F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 72
        bodyModel[27].setRotationPoint(24F, -8F, -8F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        bodyModel[28].setRotationPoint(24F, -8F, 7F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
        bodyModel[29].setRotationPoint(-11F, -8F, 7F);

        bodyModel[30].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 76
        bodyModel[30].setRotationPoint(-14F, -7F, -7F);

        bodyModel[31].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 77
        bodyModel[31].setRotationPoint(-13F, -7F, 5F);

        bodyModel[32].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 78
        bodyModel[32].setRotationPoint(-4F, -7F, 5F);

        bodyModel[33].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 79
        bodyModel[33].setRotationPoint(-4F, -7F, -7F);

        bodyModel[34].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 80
        bodyModel[34].setRotationPoint(13F, -7F, -7F);

        bodyModel[35].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 81
        bodyModel[35].setRotationPoint(13F, -7F, 5F);

        bodyModel[36].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 82
        bodyModel[36].setRotationPoint(23F, -7F, 5F);

        bodyModel[37].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 83
        bodyModel[37].setRotationPoint(23F, -7F, -7F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
        bodyModel[38].setRotationPoint(-4F, -18F, -5F);

        bodyModel[39].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 92
        bodyModel[39].setRotationPoint(-4F, 1F, -7F);

        bodyModel[40].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 96
        bodyModel[40].setRotationPoint(0F, 1F, 4F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[41].setRotationPoint(-4F, -16F, -9F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[42].setRotationPoint(14F, -16F, -9F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[43].setRotationPoint(14F, -16F, 8F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[44].setRotationPoint(-4F, -16F, 8F);

        bodyModel[45].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // Box 112
        bodyModel[45].setRotationPoint(-17F, -23F, -7F);

        bodyModel[46].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 113
        bodyModel[46].setRotationPoint(-27F, -24F, -7F);

        bodyModel[47].addBox(0F, 0F, 0F, 6, 3, 10, 0F); // Box 114
        bodyModel[47].setRotationPoint(-2F, -23F, -4F);

        bodyModel[48].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 115
        bodyModel[48].setRotationPoint(5F, -24F, -6F);

        bodyModel[49].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 133
        bodyModel[49].setRotationPoint(32F, -1F, -5F);

        bodyModel[50].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 134
        bodyModel[50].setRotationPoint(32F, -17F, -5F);

        bodyModel[51].addBox(0F, 0F, 0F, 3, 15, 1, 0F); // Box 135
        bodyModel[51].setRotationPoint(32F, -16F, -6F);

        bodyModel[52].addBox(0F, 0F, 0F, 3, 15, 1, 0F); // Box 137
        bodyModel[52].setRotationPoint(32F, -16F, 5F);

        bodyModel[53].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 138
        bodyModel[53].setRotationPoint(28F, 1F, -1F);

        bodyModel[54].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 139
        bodyModel[54].setRotationPoint(34F, 0F, -2F);

        bodyModel[55].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 126
        bodyModel[55].setRotationPoint(19F, -24F, -7F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
        bodyModel[56].setRotationPoint(-14F, -18F, 8F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[57].setRotationPoint(-14F, -18F, -9F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        bodyModel[58].setRotationPoint(4F, -18F, -9F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[59].setRotationPoint(-22F, -16F, -9F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
        bodyModel[60].setRotationPoint(-32F, -18F, -9F);

        bodyModel[61].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 132
        bodyModel[61].setRotationPoint(7F, -4F, -7F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 133
        bodyModel[62].setRotationPoint(7F, -8F, -8F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
        bodyModel[63].setRotationPoint(4F, -16F, -8F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
        bodyModel[64].setRotationPoint(5F, -18F, -5F);

        bodyModel[65].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 136
        bodyModel[65].setRotationPoint(5F, -7F, -7F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        bodyModel[66].setRotationPoint(4F, -18F, 8F);

        bodyModel[67].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 138
        bodyModel[67].setRotationPoint(-4F, -19F, -9F);

        bodyModel[68].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 139
        bodyModel[68].setRotationPoint(-22F, -19F, -9F);

        bodyModel[69].addBox(0F, 0F, 0F, 2, 16, 1, 0F); // Box 140
        bodyModel[69].setRotationPoint(-5F, -16F, 7F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
        bodyModel[70].setRotationPoint(4F, -16F, 7F);

        bodyModel[71].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 143
        bodyModel[71].setRotationPoint(5F, -7F, 5F);

        bodyModel[72].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 144
        bodyModel[72].setRotationPoint(-11F, -4F, 4F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        bodyModel[73].setRotationPoint(-22F, -16F, 8F);

        bodyModel[74].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 146
        bodyModel[74].setRotationPoint(-22F, -19F, 8F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        bodyModel[75].setRotationPoint(-32F, -18F, 8F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
        bodyModel[76].setRotationPoint(-24F, -16F, 7F);

        bodyModel[77].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 149
        bodyModel[77].setRotationPoint(-23F, -7F, 5F);

        bodyModel[78].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 151
        bodyModel[78].setRotationPoint(-23F, -7F, -7F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
        bodyModel[79].setRotationPoint(-24F, -16F, -8F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
        bodyModel[80].setRotationPoint(-32F, -18F, -8F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
        bodyModel[81].setRotationPoint(-32F, -18F, 5F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
        bodyModel[82].setRotationPoint(-32F, -18F, 5F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
        bodyModel[83].setRotationPoint(-32F, -18F, -5F);

        bodyModel[84].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 158
        bodyModel[84].setRotationPoint(-29F, -4F, -7F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 159
        bodyModel[85].setRotationPoint(-29F, -8F, -8F);

        bodyModel[86].addShapeBox(0F, -3F, 0F, 12, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        bodyModel[86].setRotationPoint(-32F, -21F, 8F);

        bodyModel[87].addShapeBox(0F, -3F, 0F, 12, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[87].setRotationPoint(-32F, -21F, -9F);

        bodyModel[88].addBox(0F, 0F, 0F, 52, 1, 18, 0F); // Box 162
        bodyModel[88].setRotationPoint(-32F, 0F, -9F);

        bodyModel[89].addBox(0F, 0F, 0F, 12, 1, 16, 0F); // Box 163
        bodyModel[89].setRotationPoint(-32F, -20F, -8F);

        bodyModel[90].addBox(0F, 0F, 0F, 6, 3, 10, 0F); // Box 164
        bodyModel[90].setRotationPoint(-11F, -23F, -7F);

        bodyModel[91].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 165
        bodyModel[91].setRotationPoint(-35F, -17F, -5F);

        bodyModel[92].addBox(0F, 0F, 0F, 3, 15, 1, 0F); // Box 166
        bodyModel[92].setRotationPoint(-35F, -16F, -6F);

        bodyModel[93].addBox(0F, 0F, 0F, 3, 15, 1, 0F); // Box 167
        bodyModel[93].setRotationPoint(-35F, -16F, 5F);

        bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 168
        bodyModel[94].setRotationPoint(-35F, -1F, -5F);

        bodyModel[95].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 169
        bodyModel[95].setRotationPoint(-34F, 1F, -1F);

        bodyModel[96].addBox(0F, -1F, 0F, 2, 3, 4, 0F); // Box 171
        bodyModel[96].setRotationPoint(-36F, 1F, -2F);

        bodyModel[97].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 110
        bodyModel[97].setRotationPoint(-20F, 1F, -1.5F);

        bodyModel[98].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 111
        bodyModel[98].setRotationPoint(17F, 1F, -1.5F);

        bodyModel[99].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 112
        bodyModel[99].setRotationPoint(17F, 1F, -1.5F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[100].setRotationPoint(13F, -18F, -5F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        bodyModel[101].setRotationPoint(23F, -18F, -5F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[102].setRotationPoint(-14F, -18F, -5F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
        bodyModel[103].setRotationPoint(-23F, -18F, -5F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bodyModel[104].setRotationPoint(-23F, -18F, 4F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[105].setRotationPoint(-14F, -18F, 4F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        bodyModel[106].setRotationPoint(-4F, -18F, 4F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        bodyModel[107].setRotationPoint(5F, -18F, 4F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        bodyModel[108].setRotationPoint(13F, -18F, 4F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
        bodyModel[109].setRotationPoint(23F, -18F, 4F);
        this.flipAll();
    }
}