package metroim.models.wagons;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Tail3700_v2 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public Tail3700_v2() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[138];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
        bodyModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 6
        bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 7
        bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 8
        bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 9
        bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 10
        bodyModel[10] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
        bodyModel[11] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
        bodyModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 24
        bodyModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 25
        bodyModel[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 30
        bodyModel[15] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 31
        bodyModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 32
        bodyModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 33
        bodyModel[18] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 34
        bodyModel[19] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 35
        bodyModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 36
        bodyModel[21] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 37
        bodyModel[22] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 38
        bodyModel[23] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 39
        bodyModel[24] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 40
        bodyModel[25] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 41
        bodyModel[26] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 42
        bodyModel[27] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 37
        bodyModel[28] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 38
        bodyModel[29] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 40
        bodyModel[30] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 44
        bodyModel[31] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 45
        bodyModel[32] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 46
        bodyModel[33] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 47
        bodyModel[34] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 48
        bodyModel[35] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 49
        bodyModel[36] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 50
        bodyModel[37] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 51
        bodyModel[38] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 52
        bodyModel[39] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 53
        bodyModel[40] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 54
        bodyModel[41] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 55
        bodyModel[42] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 56
        bodyModel[43] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 57
        bodyModel[44] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 58
        bodyModel[45] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 59
        bodyModel[46] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 60
        bodyModel[47] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 61
        bodyModel[48] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 62
        bodyModel[49] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 63
        bodyModel[50] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 64
        bodyModel[51] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 65
        bodyModel[52] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 66
        bodyModel[53] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 67
        bodyModel[54] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 68
        bodyModel[55] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 69
        bodyModel[56] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 71
        bodyModel[57] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 72
        bodyModel[58] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 73
        bodyModel[59] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 74
        bodyModel[60] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 75
        bodyModel[61] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 76
        bodyModel[62] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 78
        bodyModel[63] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 79
        bodyModel[64] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 80
        bodyModel[65] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 81
        bodyModel[66] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 82
        bodyModel[67] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 83
        bodyModel[68] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 84
        bodyModel[69] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 85
        bodyModel[70] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 86
        bodyModel[71] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 87
        bodyModel[72] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 88
        bodyModel[73] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 89
        bodyModel[74] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 90
        bodyModel[75] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 91
        bodyModel[76] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 92
        bodyModel[77] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 93
        bodyModel[78] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 94
        bodyModel[79] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 95
        bodyModel[80] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 96
        bodyModel[81] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 98
        bodyModel[82] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 99
        bodyModel[83] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 100
        bodyModel[84] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 101
        bodyModel[85] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 102
        bodyModel[86] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 103
        bodyModel[87] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 105
        bodyModel[88] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 106
        bodyModel[89] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 107
        bodyModel[90] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 109
        bodyModel[91] = new ModelRendererTurbo(this, 341, 1, textureX, textureY); // Box 111
        bodyModel[92] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 115
        bodyModel[93] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 116
        bodyModel[94] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 117
        bodyModel[95] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 111
        bodyModel[96] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 112
        bodyModel[97] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 116
        bodyModel[98] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 128
        bodyModel[99] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 115
        bodyModel[100] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 113
        bodyModel[101] = new ModelRendererTurbo(this, 10, 80, textureX, textureY); // Box 131
        bodyModel[102] = new ModelRendererTurbo(this, 23, 80, textureX, textureY); // Box 132
        bodyModel[103] = new ModelRendererTurbo(this, 2, 80, textureX, textureY); // Box 133
        bodyModel[104] = new ModelRendererTurbo(this, 2, 80, textureX, textureY); // Box 134
        bodyModel[105] = new ModelRendererTurbo(this, 343, 77, textureX, textureY); // Box 119
        bodyModel[106] = new ModelRendererTurbo(this, 343, 77, textureX, textureY); // Box 136
        bodyModel[107] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 137
        bodyModel[108] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 138
        bodyModel[109] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
        bodyModel[110] = new ModelRendererTurbo(this, 361, 70, textureX, textureY); // Box 22
        bodyModel[111] = new ModelRendererTurbo(this, 378, 70, textureX, textureY); // Box 142
        bodyModel[112] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 135
        bodyModel[113] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 139
        bodyModel[114] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 113
        bodyModel[115] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 114
        bodyModel[116] = new ModelRendererTurbo(this, 0, 88, textureX, textureY); // Box 138
        bodyModel[117] = new ModelRendererTurbo(this, 72, 88, textureX, textureY); // Box 139
        bodyModel[118] = new ModelRendererTurbo(this, 343, 77, textureX, textureY); // Box 139
        bodyModel[119] = new ModelRendererTurbo(this, 343, 77, textureX, textureY); // Box 140
        bodyModel[120] = new ModelRendererTurbo(this, 27, 107, textureX, textureY); // Box 141
        bodyModel[121] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 142
        bodyModel[122] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 143
        bodyModel[123] = new ModelRendererTurbo(this, 336, 3, textureX, textureY); // Box 144
        bodyModel[124] = new ModelRendererTurbo(this, 3, 12, textureX, textureY); // Box 142
        bodyModel[125] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 143
        bodyModel[126] = new ModelRendererTurbo(this, 3, 12, textureX, textureY); // Box 144
        bodyModel[127] = new ModelRendererTurbo(this, 297, 75, textureX, textureY); // Box 145
        bodyModel[128] = new ModelRendererTurbo(this, 3, 12, textureX, textureY); // Box 147
        bodyModel[129] = new ModelRendererTurbo(this, 3, 12, textureX, textureY); // Box 150
        bodyModel[130] = new ModelRendererTurbo(this, 297, 85, textureX, textureY); // Box 151
        bodyModel[131] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 152
        bodyModel[132] = new ModelRendererTurbo(this, 230, 22, textureX, textureY); // Box 141
        bodyModel[133] = new ModelRendererTurbo(this, 230, 26, textureX, textureY); // Box 142
        bodyModel[134] = new ModelRendererTurbo(this, 230, 22, textureX, textureY); // Box 143
        bodyModel[135] = new ModelRendererTurbo(this, 230, 26, textureX, textureY); // Box 144
        bodyModel[136] = new ModelRendererTurbo(this, 230, 22, textureX, textureY); // Box 145
        bodyModel[137] = new ModelRendererTurbo(this, 230, 26, textureX, textureY); // Box 146

        bodyModel[0].addShapeBox(0F, 0F, 0F, 19, 1, 18, 0F,0F, 0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -1F); // Box 0
        bodyModel[0].setRotationPoint(-34F, 0F, -9F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        bodyModel[1].setRotationPoint(-25F, -7F, -9F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.45F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
        bodyModel[2].setRotationPoint(-20F, -17F, -9F);

        bodyModel[3].addShapeBox(0F, 0F, -1F, 5, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
        bodyModel[3].setRotationPoint(-25F, -7F, 9F);

        bodyModel[4].addShapeBox(0F, 0F, -1F, 5, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
        bodyModel[4].setRotationPoint(-20F, -7F, 9F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 6
        bodyModel[5].setRotationPoint(-34F, -7F, -8F);

        bodyModel[6].addShapeBox(0F, 0F, -1F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.53F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 7
        bodyModel[6].setRotationPoint(-25F, -17F, 9F);

        bodyModel[7].addShapeBox(0F, 0F, -1F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.44F, 0F, 0F, -0.46F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 8
        bodyModel[7].setRotationPoint(-20F, -17F, 9F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 9
        bodyModel[8].setRotationPoint(-25F, -17F, -9F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[9].setRotationPoint(-20F, -7F, -9F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-0.4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 18
        bodyModel[10].setRotationPoint(-35F, -7F, 0F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 19
        bodyModel[11].setRotationPoint(-35F, -7F, -8F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.6F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.6F, -0.75F, 0F); // Box 24
        bodyModel[12].setRotationPoint(-35F, -2F, 5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.6F, -0.75F, 0F); // Box 25
        bodyModel[13].setRotationPoint(-35F, -2F, -7F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, 0F, 0F, -10F, 0F, 1F, -10F, 0F, -4F, 0.3F, 0F, 1F, 0F, 0.5F, 0F, -10F, 0.5F, 1F, -10F, 0.5F, -4F, 0F, 0.5F, 1F); // Box 30
        bodyModel[14].setRotationPoint(-34F, 1F, -8F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0.3F, 0F, 1F, -10F, 0F, -4F, -10F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 1F, -10F, 0.5F, -4F, -10F, 0.5F, 1F, 0F, 0.5F, 0F); // Box 31
        bodyModel[15].setRotationPoint(-34F, 1F, 4F);

        bodyModel[16].addBox(0F, 0F, 0F, 11, 2, 2, 0F); // Box 32
        bodyModel[16].setRotationPoint(-37F, 1F, -1F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[17].setRotationPoint(-38F, 1F, -2F);

        bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
        bodyModel[18].setRotationPoint(-38F, 3F, 2F);

        bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 35
        bodyModel[19].setRotationPoint(-38F, -0.25F, -2F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 36
        bodyModel[20].setRotationPoint(-38.5F, 0F, 2F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 37
        bodyModel[21].setRotationPoint(-38.5F, 0F, -2.2F);

        bodyModel[22].addBox(0F, 0F, 0F, 5, 7, 2, 0F); // Box 38
        bodyModel[22].setRotationPoint(-34F, -7F, -1F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        bodyModel[23].setRotationPoint(-34F, -7F, -7F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        bodyModel[24].setRotationPoint(-32F, -8F, -0.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.8F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
        bodyModel[25].setRotationPoint(-32.5F, -8.2F, 0F);
        bodyModel[25].rotateAngleY = -1.57079633F;

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 42
        bodyModel[26].setRotationPoint(-32.5F, -8.2F, 1F);
        bodyModel[26].rotateAngleY = -1.57079633F;

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 37
        bodyModel[27].setRotationPoint(-32.1F, -8.9F, -2.8F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 16, 14, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 38
        bodyModel[28].setRotationPoint(-26F, -16F, -8F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 0F, -0.44F, 0F, 0F, 0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0.5F, 0.12F, 0F, 0.5F, 0.51F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F); // Box 40
        bodyModel[29].setRotationPoint(-32F, -17F, -8.1F);
        bodyModel[29].rotateAngleY = -0.05235988F;

        bodyModel[30].addShapeBox(0F, 0F, 0F, 48, 1, 18, 0F,10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 44
        bodyModel[30].setRotationPoint(-15F, 0F, -9F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
        bodyModel[31].setRotationPoint(-15F, -7F, -9F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
        bodyModel[32].setRotationPoint(-15F, -7F, 7F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 47
        bodyModel[33].setRotationPoint(-15F, -17F, 7F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
        bodyModel[34].setRotationPoint(-15F, -17F, -9F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 21, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        bodyModel[35].setRotationPoint(-13F, -7F, -9F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[36].setRotationPoint(-14F, -8F, -7F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[37].setRotationPoint(-14F, -8F, 2F);

        bodyModel[38].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 52
        bodyModel[38].setRotationPoint(-12F, -4F, 2F);

        bodyModel[39].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 53
        bodyModel[39].setRotationPoint(-12F, -4F, -8F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        bodyModel[40].setRotationPoint(-13F, -7F, -8F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
        bodyModel[41].setRotationPoint(-13F, -7F, 2F);

        bodyModel[42].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 56
        bodyModel[42].setRotationPoint(-6F, -4F, 2F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        bodyModel[43].setRotationPoint(-3F, -7F, 2F);

        bodyModel[44].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 58
        bodyModel[44].setRotationPoint(-2F, -4F, 2F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
        bodyModel[45].setRotationPoint(-3F, -7F, -8F);

        bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 60
        bodyModel[46].setRotationPoint(-6F, -4F, -8F);

        bodyModel[47].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 61
        bodyModel[47].setRotationPoint(-2F, -4F, -8F);

        bodyModel[48].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 62
        bodyModel[48].setRotationPoint(4F, -4F, -8F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[49].setRotationPoint(7F, -7F, -8F);

        bodyModel[50].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 64
        bodyModel[50].setRotationPoint(4F, -4F, 2F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[51].setRotationPoint(8F, -8F, -7F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        bodyModel[52].setRotationPoint(8F, -7F, -9F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 67
        bodyModel[53].setRotationPoint(8F, -17F, -9F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 21, 9, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 68
        bodyModel[54].setRotationPoint(-13F, -17F, -9F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
        bodyModel[55].setRotationPoint(8F, -8F, 2F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
        bodyModel[56].setRotationPoint(7F, -7F, 2F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
        bodyModel[57].setRotationPoint(8F, -7F, 7F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 73
        bodyModel[58].setRotationPoint(8F, -17F, 7F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 21, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[59].setRotationPoint(-13F, -7F, 8F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 21, 9, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 75
        bodyModel[60].setRotationPoint(-13F, -17F, 8F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
        bodyModel[61].setRotationPoint(10F, -7F, -9F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 78
        bodyModel[62].setRotationPoint(10F, -17F, -9F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 79
        bodyModel[63].setRotationPoint(15F, -17F, -9F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        bodyModel[64].setRotationPoint(15F, -7F, -9F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
        bodyModel[65].setRotationPoint(10F, -7F, 8F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
        bodyModel[66].setRotationPoint(15F, -7F, 8F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 83
        bodyModel[67].setRotationPoint(10F, -17F, 8F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 84
        bodyModel[68].setRotationPoint(15F, -17F, 8F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 85
        bodyModel[69].setRotationPoint(20F, -17F, 7F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
        bodyModel[70].setRotationPoint(20F, -7F, 7F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
        bodyModel[71].setRotationPoint(20F, -7F, -9F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88
        bodyModel[72].setRotationPoint(20F, -17F, -9F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        bodyModel[73].setRotationPoint(21F, -8F, -7F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
        bodyModel[74].setRotationPoint(22F, -7F, -8F);

        bodyModel[75].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 91
        bodyModel[75].setRotationPoint(23F, -4F, -8F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
        bodyModel[76].setRotationPoint(21F, -8F, 2F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
        bodyModel[77].setRotationPoint(22F, -7F, 2F);

        bodyModel[78].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 94
        bodyModel[78].setRotationPoint(23F, -4F, 2F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
        bodyModel[79].setRotationPoint(22F, -7F, -9F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
        bodyModel[80].setRotationPoint(22F, -7F, 8F);

        bodyModel[81].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 98
        bodyModel[81].setRotationPoint(29F, -4F, 2F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[82].setRotationPoint(32F, -7F, 2F);

        bodyModel[83].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 100
        bodyModel[83].setRotationPoint(29F, -4F, -8F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        bodyModel[84].setRotationPoint(32F, -7F, -8F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 102
        bodyModel[85].setRotationPoint(22F, -17F, -9F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 103
        bodyModel[86].setRotationPoint(22F, -17F, 8F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 50, 3, 18, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 105
        bodyModel[87].setRotationPoint(-15F, -20F, -9F);

        bodyModel[88].addBox(0F, 0F, 0F, 19, 3, 6, 0F); // Box 106
        bodyModel[88].setRotationPoint(-3F, 1F, -8F);

        bodyModel[89].addBox(0F, 0F, 0F, 7, 4, 6, 0F); // Box 107
        bodyModel[89].setRotationPoint(7F, 1F, -2F);

        bodyModel[90].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 109
        bodyModel[90].setRotationPoint(19F, 1F, 2F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[91].setRotationPoint(-25F, 0.5F, -9F);

        bodyModel[92].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 115
        bodyModel[92].setRotationPoint(-31.6F, -22F, -1F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[93].setRotationPoint(-31.6F, -22F, -2F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        bodyModel[94].setRotationPoint(-31.6F, -22F, 1F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 111
        bodyModel[95].setRotationPoint(33F, 0F, -9F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        bodyModel[96].setRotationPoint(33F, 0F, 8F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[97].setRotationPoint(33F, -7F, 4F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[98].setRotationPoint(33F, -7F, -9F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 9, 3, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 115
        bodyModel[99].setRotationPoint(33F, -17F, 6F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 9, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 113
        bodyModel[100].setRotationPoint(33F, -17F, -9F);

        bodyModel[101].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 131
        bodyModel[101].setRotationPoint(-31F, -4F, -5.5F);

        bodyModel[102].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 132
        bodyModel[102].setRotationPoint(-28F, -9F, -5.5F);

        bodyModel[103].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 133
        bodyModel[103].setRotationPoint(-31F, -6F, -6.5F);

        bodyModel[104].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 134
        bodyModel[104].setRotationPoint(-31F, -6F, -2.5F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
        bodyModel[105].setRotationPoint(-34F, 3.5F, -7F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 1F, -3F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 1F, -3F, -2F, 1F); // Box 136
        bodyModel[106].setRotationPoint(-37F, 3.5F, 0F);

        bodyModel[107].addBox(0F, 0F, 0F, 19, 3, 6, 0F); // Box 137
        bodyModel[107].setRotationPoint(-3F, 1F, 2F);

        bodyModel[108].addBox(0F, 0F, 0F, 7, 4, 6, 0F); // Box 138
        bodyModel[108].setRotationPoint(17F, 1F, -4F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 19, 3, 18, 0F,-1.5F, -0.5F, -1.58F, -10F, -0.5F, -0.5F, -10F, -0.5F, -0.5F, -1.5F, -0.5F, -1.58F, -1.48F, 0F, -1.41F, -10F, 0F, -0.5F, -10F, 0F, -0.4F, -1.48F, 0F, -1.52F); // Box 17
        bodyModel[109].setRotationPoint(-34F, -20F, -9F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,-1.3F, 4F, 0F, 1.5F, 4F, 0F, 1.3F, 4F, 0F, -1.3F, 4F, 0F, 1.2F, 2.5F, 0F, -1F, 3F, 0F, -0.5F, 3F, 0F, 0.5F, 2.5F, 0F); // Box 22
        bodyModel[110].setRotationPoint(-34F, -15F, 0F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,-1.3F, 4F, 0F, 1.3F, 4F, 0F, 1.5F, 4F, 0F, -1.3F, 4F, 0F, 0.5F, 2.5F, 0F, -0.5F, 3F, 0F, -1F, 3F, 0F, 1.2F, 2.5F, 0F); // Box 142
        bodyModel[111].setRotationPoint(-34F, -15F, -7F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.3F, 9.5F, -0.6F, 0F, 9.5F, -0.48F, 0F, 10F, -0.27F, -1.3F, 10F, -0.1F, 0.28F, 0F, 0F, 0F, 0F, 0.2F, 0.1F, 0F, -0.1F, 0.4F, 0F, -0.6F); // Box 135
        bodyModel[112].setRotationPoint(-34F, -10F, -8F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1.525F, 0.5F, -0.15F, -0.3F, 1F, 0F, -0.75F, 1.3F, -3F, -0.75F, 0.8F, -3F, -1.5F, -1.2F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -3F, -0.6F, -1.6F, -3F); // Box 139
        bodyModel[113].setRotationPoint(-36F, -7F, -8F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1.2F, 1F, 0F, 0.3F); // Box 113
        bodyModel[114].setRotationPoint(-28F, -23F, 0F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 12, 3, 7, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0.3F, 1F, 0F, 1.2F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 114
        bodyModel[115].setRotationPoint(-28F, -23F, -7F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 19, 1, 17, 0F,-1.6F, -0.5F, -1.2F, -10.4F, -0.5F, -0.3F, -10.4F, -0.5F, -0.3F, -1.6F, -0.5F, -1.2F, -1.6F, 0F, -1F, -10.4F, 0F, 0F, -10.4F, 0F, 0F, -1.6F, 0F, -1F); // Box 138
        bodyModel[116].setRotationPoint(-33.6F, -20.5F, -8.5F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 50, 1, 17, 0F,10F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 10F, -0.5F, -0.3F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 139
        bodyModel[117].setRotationPoint(-15F, -20.5F, -8.5F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 1F, -2.5F, 0F); // Box 139
        bodyModel[118].setRotationPoint(-34F, 4.5F, -7F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.5F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, -1F, 1F, -2.5F, -1F); // Box 140
        bodyModel[119].setRotationPoint(-34F, 4.5F, 1F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 10, 3, 18, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 141
        bodyModel[120].setRotationPoint(-25F, -20F, -9F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, -0.44F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0.22F); // Box 142
        bodyModel[121].setRotationPoint(-32F, -17F, 7F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 143
        bodyModel[122].setRotationPoint(-34F, -7F, 7F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
        bodyModel[123].setRotationPoint(-25F, 0.5F, 8F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0F, -0.3F, 0F, 0F, -0.15F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.4F, 0F, -0.15F, -0.4F, 0F); // Box 142
        bodyModel[124].setRotationPoint(-33F, -19.5F, 3F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.3F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -0.3F, 0.4F, 0F, -0.15F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.15F, -0.9F, 0F); // Box 143
        bodyModel[125].setRotationPoint(-33F, -19.5F, -3F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.6F, 0F, -0.3F, 0.4F, 0F, -0.15F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.9F, 0F, -0.15F, -0.9F, 0F); // Box 144
        bodyModel[126].setRotationPoint(-33F, -19.5F, -7F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.75F, 0.8F, -2F, -0.75F, 1.3F, -2F, -0.75F, 1.3F, 0F, -0.75F, 0.8F, 0F, -0.6F, -1.6F, -2F, 0F, -0.7F, -2F, 0F, -0.7F, 0F, -0.6F, -1.6F, 0F); // Box 145
        bodyModel[127].setRotationPoint(-36F, -7F, -5F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0.5F, -3.85F, 0.7F, 0.9F, -3.75F, 0.7F, 0.9F, 0.5F, -1F, 0.5F, 0.5F, 0.6F, 10F, -3.4F, -1.5F, 11F, -3.5F, -1.5F, 11F, 0F, 0.7F, 10F, 0F); // Box 147
        bodyModel[128].setRotationPoint(-33.7F, -19F, -11F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0.5F, 0.5F, 0.7F, 0.9F, 0.5F, 0.7F, 0.9F, -3.75F, -1F, 0.5F, -3.85F, 0.7F, 10F, 0F, -1.5F, 11F, 0F, -1.5F, 11F, -3.5F, 0.6F, 10F, -3.4F); // Box 150
        bodyModel[129].setRotationPoint(-33.7F, -19F, 7F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.75F, 0.8F, -3F, -0.75F, 1.3F, -3F, -0.3F, 1F, 0F, -1.525F, 0.5F, -0.15F, -0.6F, -1.6F, -3F, 0F, -0.7F, -3F, 0F, -0.7F, -0.05F, -1.5F, -1.2F, -0.05F); // Box 151
        bodyModel[130].setRotationPoint(-36F, -7F, 0F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.2F, 10F, -0.1F, 0F, 10F, -0.27F, 0F, 9.5F, -0.48F, -1.3F, 9.5F, -0.6F, 0.4F, 0F, -0.6F, 0.1F, 0F, -0.1F, 0F, 0F, 0.2F, 0.28F, -0.5F, 0F); // Box 152
        bodyModel[131].setRotationPoint(-34F, -10F, 7F);

        bodyModel[132].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 141
        bodyModel[132].setRotationPoint(21.5F, -11F, -7F);

        bodyModel[133].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 142
        bodyModel[133].setRotationPoint(21.5F, -11F, 2F);

        bodyModel[134].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 143
        bodyModel[134].setRotationPoint(8.5F, -11F, -7F);

        bodyModel[135].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 144
        bodyModel[135].setRotationPoint(8.5F, -11F, 2F);

        bodyModel[136].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 145
        bodyModel[136].setRotationPoint(-13.5F, -11F, -7F);

        bodyModel[137].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 146
        bodyModel[137].setRotationPoint(-13.5F, -11F, 2F);
        this.flipAll();
    }
}