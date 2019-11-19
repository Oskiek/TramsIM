package metroim.models.trains;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Motor3700_v2 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public Motor3700_v2() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[136];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
        bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
        bodyModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 6
        bodyModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 7
        bodyModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 8
        bodyModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 9
        bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 10
        bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
        bodyModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
        bodyModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
        bodyModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 24
        bodyModel[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 25
        bodyModel[16] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 26
        bodyModel[17] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 30
        bodyModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 31
        bodyModel[19] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 32
        bodyModel[20] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 33
        bodyModel[21] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 34
        bodyModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 35
        bodyModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 36
        bodyModel[24] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 37
        bodyModel[25] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 38
        bodyModel[26] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 39
        bodyModel[27] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 40
        bodyModel[28] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 41
        bodyModel[29] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 42
        bodyModel[30] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 37
        bodyModel[31] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 38
        bodyModel[32] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 40
        bodyModel[33] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 42
        bodyModel[34] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 44
        bodyModel[35] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 45
        bodyModel[36] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 46
        bodyModel[37] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 47
        bodyModel[38] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 48
        bodyModel[39] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 49
        bodyModel[40] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 50
        bodyModel[41] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 51
        bodyModel[42] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 52
        bodyModel[43] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 53
        bodyModel[44] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 54
        bodyModel[45] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 55
        bodyModel[46] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 56
        bodyModel[47] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 57
        bodyModel[48] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 58
        bodyModel[49] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 59
        bodyModel[50] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 60
        bodyModel[51] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 61
        bodyModel[52] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 62
        bodyModel[53] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 63
        bodyModel[54] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 64
        bodyModel[55] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 65
        bodyModel[56] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 66
        bodyModel[57] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 67
        bodyModel[58] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 68
        bodyModel[59] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 69
        bodyModel[60] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 71
        bodyModel[61] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 72
        bodyModel[62] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 73
        bodyModel[63] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 74
        bodyModel[64] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 75
        bodyModel[65] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 76
        bodyModel[66] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 78
        bodyModel[67] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 79
        bodyModel[68] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 80
        bodyModel[69] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 81
        bodyModel[70] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 82
        bodyModel[71] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 83
        bodyModel[72] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 84
        bodyModel[73] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 85
        bodyModel[74] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 86
        bodyModel[75] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 87
        bodyModel[76] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 88
        bodyModel[77] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 89
        bodyModel[78] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 90
        bodyModel[79] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 91
        bodyModel[80] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 92
        bodyModel[81] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 93
        bodyModel[82] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 94
        bodyModel[83] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 95
        bodyModel[84] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 96
        bodyModel[85] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 98
        bodyModel[86] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 99
        bodyModel[87] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 100
        bodyModel[88] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 101
        bodyModel[89] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 102
        bodyModel[90] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 103
        bodyModel[91] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 105
        bodyModel[92] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 106
        bodyModel[93] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 107
        bodyModel[94] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 108
        bodyModel[95] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 109
        bodyModel[96] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 110
        bodyModel[97] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 111
        bodyModel[98] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 113
        bodyModel[99] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 114
        bodyModel[100] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 115
        bodyModel[101] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 116
        bodyModel[102] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 118
        bodyModel[103] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 119
        bodyModel[104] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 120
        bodyModel[105] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 121
        bodyModel[106] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 122
        bodyModel[107] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 123
        bodyModel[108] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 124
        bodyModel[109] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 125
        bodyModel[110] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 126
        bodyModel[111] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 127
        bodyModel[112] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 128
        bodyModel[113] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 129
        bodyModel[114] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 130
        bodyModel[115] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 131
        bodyModel[116] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 132
        bodyModel[117] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 111
        bodyModel[118] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 112
        bodyModel[119] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 116
        bodyModel[120] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 128
        bodyModel[121] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 115
        bodyModel[122] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 113
        bodyModel[123] = new ModelRendererTurbo(this, 10, 80, textureX, textureY); // Box 131
        bodyModel[124] = new ModelRendererTurbo(this, 23, 80, textureX, textureY); // Box 132
        bodyModel[125] = new ModelRendererTurbo(this, 2, 80, textureX, textureY); // Box 133
        bodyModel[126] = new ModelRendererTurbo(this, 2, 80, textureX, textureY); // Box 134
        bodyModel[127] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 135
        bodyModel[128] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 136
        bodyModel[129] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 137
        bodyModel[130] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 139
        bodyModel[131] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 22
        bodyModel[132] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 142
        bodyModel[133] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 134
        bodyModel[134] = new ModelRendererTurbo(this, 332, 70, textureX, textureY); // Box 119
        bodyModel[135] = new ModelRendererTurbo(this, 332, 70, textureX, textureY); // Box 120

        bodyModel[0].addShapeBox(0F, 0F, 0F, 19, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
        bodyModel[0].setRotationPoint(-34F, 0F, -9F);

        bodyModel[1].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 1
        bodyModel[1].setRotationPoint(-25F, -7F, -8.48F);
        bodyModel[1].rotateAngleY = -0.05235988F;

        bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.45F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        bodyModel[2].setRotationPoint(-20F, -16F, -8.74F);
        bodyModel[2].rotateAngleY = -0.05235988F;

        bodyModel[3].addBox(0F, 0F, -1F, 5, 7, 1, 0F); // Box 3
        bodyModel[3].setRotationPoint(-25F, -7F, 8.52F);
        bodyModel[3].rotateAngleY = 0.05235988F;

        bodyModel[4].addBox(0F, 0F, -1F, 5, 7, 1, 0F); // Box 4
        bodyModel[4].setRotationPoint(-20F, -7F, 8.78F);
        bodyModel[4].rotateAngleY = 0.05235988F;

        bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 5
        bodyModel[5].setRotationPoint(-34F, -7F, 7F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
        bodyModel[6].setRotationPoint(-34F, -7F, -8F);

        bodyModel[7].addShapeBox(0F, 0F, -1F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.53F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
        bodyModel[7].setRotationPoint(-25F, -16F, 8.52F);
        bodyModel[7].rotateAngleY = 0.05235988F;

        bodyModel[8].addShapeBox(0F, 0F, -1F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.44F, 0F, 0F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        bodyModel[8].setRotationPoint(-20F, -16F, 8.78F);
        bodyModel[8].rotateAngleY = 0.05235988F;

        bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        bodyModel[9].setRotationPoint(-25F, -16F, -8.48F);
        bodyModel[9].rotateAngleY = -0.05235988F;

        bodyModel[10].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 10
        bodyModel[10].setRotationPoint(-20F, -7F, -8.74F);
        bodyModel[10].rotateAngleY = -0.05235988F;

        bodyModel[11].addShapeBox(0F, 0F, 0F, 19, 3, 18, 0F,-1.5F, 0F, -1.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -1.56F, -1.48F, 0F, -1.39F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.48F, 0F, -1.5F); // Box 17
        bodyModel[11].setRotationPoint(-34F, -19F, -9F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 18
        bodyModel[12].setRotationPoint(-35F, -7F, 0F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 19
        bodyModel[13].setRotationPoint(-35F, -7F, -8F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.6F, -0.75F, 0F); // Box 24
        bodyModel[14].setRotationPoint(-35F, -2F, 5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.6F, -0.75F, 0F); // Box 25
        bodyModel[15].setRotationPoint(-35F, -2F, -7F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.3F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, -0.5F, -1.3F, 9F, -0.6F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.5F, 0F, 0F); // Box 26
        bodyModel[16].setRotationPoint(-34F, -10F, 7F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0.3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, -4F, 0F, 0.5F, 0F); // Box 30
        bodyModel[17].setRotationPoint(-34F, 1F, -8F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0.3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, 1F, 0F, 0.5F, 0F); // Box 31
        bodyModel[18].setRotationPoint(-34F, 1F, 4F);

        bodyModel[19].addBox(0F, 0F, 0F, 11, 2, 2, 0F); // Box 32
        bodyModel[19].setRotationPoint(-37F, 1F, -1F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[20].setRotationPoint(-38F, 1F, -2F);

        bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
        bodyModel[21].setRotationPoint(-38F, 3F, 2F);

        bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 35
        bodyModel[22].setRotationPoint(-38F, -0.25F, -2F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 36
        bodyModel[23].setRotationPoint(-38.5F, 0F, 2F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 37
        bodyModel[24].setRotationPoint(-38.5F, 0F, -2.2F);

        bodyModel[25].addBox(0F, 0F, 0F, 5, 7, 2, 0F); // Box 38
        bodyModel[25].setRotationPoint(-34F, -7F, -1F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        bodyModel[26].setRotationPoint(-34F, -7F, -7F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        bodyModel[27].setRotationPoint(-32F, -8F, -0.5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.8F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
        bodyModel[28].setRotationPoint(-32.5F, -8.2F, 0F);
        bodyModel[28].rotateAngleY = -1.57079633F;

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 42
        bodyModel[29].setRotationPoint(-32.5F, -8.2F, 1F);
        bodyModel[29].rotateAngleY = -1.57079633F;

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 37
        bodyModel[30].setRotationPoint(-32.1F, -8.9F, -2.8F);

        bodyModel[31].addBox(0F, 0F, 0F, 1, 16, 14, 0F); // Box 38
        bodyModel[31].setRotationPoint(-26F, -16F, -7F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 40
        bodyModel[32].setRotationPoint(-32F, -16F, -8.1F);
        bodyModel[32].rotateAngleY = -0.05235988F;

        bodyModel[33].addShapeBox(0F, 0F, -1F, 7, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.45F, 0.05F, 0F, -0.46F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.03F, 0F, 0F, 0F); // Box 42
        bodyModel[33].setRotationPoint(-32F, -16F, 8.11F);
        bodyModel[33].rotateAngleY = 0.05235988F;

        bodyModel[34].addBox(0F, 0F, 0F, 48, 1, 18, 0F); // Box 44
        bodyModel[34].setRotationPoint(-15F, 0F, -9F);

        bodyModel[35].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 45
        bodyModel[35].setRotationPoint(-15F, -7F, -9F);

        bodyModel[36].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 46
        bodyModel[36].setRotationPoint(-15F, -7F, 7F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        bodyModel[37].setRotationPoint(-15F, -16F, 7F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        bodyModel[38].setRotationPoint(-15F, -16F, -9F);

        bodyModel[39].addBox(0F, 0F, 0F, 21, 7, 1, 0F); // Box 49
        bodyModel[39].setRotationPoint(-13F, -7F, -9F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[40].setRotationPoint(-14F, -8F, -7F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[41].setRotationPoint(-14F, -8F, 2F);

        bodyModel[42].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 52
        bodyModel[42].setRotationPoint(-12F, -4F, 2F);

        bodyModel[43].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 53
        bodyModel[43].setRotationPoint(-12F, -4F, -8F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        bodyModel[44].setRotationPoint(-13F, -7F, -8F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
        bodyModel[45].setRotationPoint(-13F, -7F, 2F);

        bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 56
        bodyModel[46].setRotationPoint(-6F, -4F, 2F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        bodyModel[47].setRotationPoint(-3F, -7F, 2F);

        bodyModel[48].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 58
        bodyModel[48].setRotationPoint(-2F, -4F, 2F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
        bodyModel[49].setRotationPoint(-3F, -7F, -8F);

        bodyModel[50].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 60
        bodyModel[50].setRotationPoint(-6F, -4F, -8F);

        bodyModel[51].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 61
        bodyModel[51].setRotationPoint(-2F, -4F, -8F);

        bodyModel[52].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 62
        bodyModel[52].setRotationPoint(4F, -4F, -8F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[53].setRotationPoint(7F, -7F, -8F);

        bodyModel[54].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 64
        bodyModel[54].setRotationPoint(4F, -4F, 2F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[55].setRotationPoint(8F, -8F, -7F);

        bodyModel[56].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 66
        bodyModel[56].setRotationPoint(8F, -7F, -9F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
        bodyModel[57].setRotationPoint(8F, -16F, -9F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 21, 9, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        bodyModel[58].setRotationPoint(-13F, -16F, -9F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
        bodyModel[59].setRotationPoint(8F, -8F, 2F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
        bodyModel[60].setRotationPoint(7F, -7F, 2F);

        bodyModel[61].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 72
        bodyModel[61].setRotationPoint(8F, -7F, 7F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        bodyModel[62].setRotationPoint(8F, -16F, 7F);

        bodyModel[63].addBox(0F, 0F, 0F, 21, 7, 1, 0F); // Box 74
        bodyModel[63].setRotationPoint(-13F, -7F, 8F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 21, 9, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
        bodyModel[64].setRotationPoint(-13F, -16F, 8F);

        bodyModel[65].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 76
        bodyModel[65].setRotationPoint(10F, -7F, -9F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        bodyModel[66].setRotationPoint(10F, -16F, -9F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        bodyModel[67].setRotationPoint(15F, -16F, -9F);

        bodyModel[68].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 80
        bodyModel[68].setRotationPoint(15F, -7F, -9F);

        bodyModel[69].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 81
        bodyModel[69].setRotationPoint(10F, -7F, 8F);

        bodyModel[70].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 82
        bodyModel[70].setRotationPoint(15F, -7F, 8F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        bodyModel[71].setRotationPoint(10F, -16F, 8F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        bodyModel[72].setRotationPoint(15F, -16F, 8F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
        bodyModel[73].setRotationPoint(20F, -16F, 7F);

        bodyModel[74].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 86
        bodyModel[74].setRotationPoint(20F, -7F, 7F);

        bodyModel[75].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 87
        bodyModel[75].setRotationPoint(20F, -7F, -9F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        bodyModel[76].setRotationPoint(20F, -16F, -9F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
        bodyModel[77].setRotationPoint(21F, -8F, -7F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
        bodyModel[78].setRotationPoint(22F, -7F, -8F);

        bodyModel[79].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 91
        bodyModel[79].setRotationPoint(23F, -4F, -8F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
        bodyModel[80].setRotationPoint(21F, -8F, 2F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
        bodyModel[81].setRotationPoint(22F, -7F, 2F);

        bodyModel[82].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 94
        bodyModel[82].setRotationPoint(23F, -4F, 2F);

        bodyModel[83].addBox(0F, 0F, 0F, 11, 7, 1, 0F); // Box 95
        bodyModel[83].setRotationPoint(22F, -7F, -9F);

        bodyModel[84].addBox(0F, 0F, 0F, 11, 7, 1, 0F); // Box 96
        bodyModel[84].setRotationPoint(22F, -7F, 8F);

        bodyModel[85].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 98
        bodyModel[85].setRotationPoint(29F, -4F, 2F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
        bodyModel[86].setRotationPoint(32F, -7F, 2F);

        bodyModel[87].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 100
        bodyModel[87].setRotationPoint(29F, -4F, -8F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        bodyModel[88].setRotationPoint(32F, -7F, -8F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        bodyModel[89].setRotationPoint(22F, -16F, -9F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        bodyModel[90].setRotationPoint(22F, -16F, 8F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 50, 3, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 105
        bodyModel[91].setRotationPoint(-15F, -19F, -9F);

        bodyModel[92].addBox(0F, 0F, 0F, 19, 3, 6, 0F); // Box 106
        bodyModel[92].setRotationPoint(0F, 1F, -8F);

        bodyModel[93].addBox(0F, 0F, 0F, 7, 4, 6, 0F); // Box 107
        bodyModel[93].setRotationPoint(7F, 1F, -2F);

        bodyModel[94].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 108
        bodyModel[94].setRotationPoint(1F, 1F, 2F);

        bodyModel[95].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 109
        bodyModel[95].setRotationPoint(19F, 1F, 2F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 110
        bodyModel[96].setRotationPoint(-25F, 0F, 8F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[97].setRotationPoint(-25F, 0F, -9F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 12, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1.5F, 1F, 0F, 0.76F); // Box 113
        bodyModel[98].setRotationPoint(-28F, -22F, 0F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 12, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0.76F, 1F, 0F, 1.5F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 114
        bodyModel[99].setRotationPoint(-28F, -22F, -7F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 115
        bodyModel[100].setRotationPoint(-33F, -21F, 0F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-3F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 116
        bodyModel[101].setRotationPoint(-33F, -21F, -3F);

        bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 118
        bodyModel[102].setRotationPoint(31F, -20F, 3F);

        bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 119
        bodyModel[103].setRotationPoint(31F, -20F, -4F);

        bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 120
        bodyModel[104].setRotationPoint(31F, -20F, -4F);

        bodyModel[105].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 121
        bodyModel[105].setRotationPoint(24F, -21F, -4F);

        bodyModel[106].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 122
        bodyModel[106].setRotationPoint(24F, -21F, 3F);

        bodyModel[107].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 123
        bodyModel[107].setRotationPoint(24F, -20F, -4F);

        bodyModel[108].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 124
        bodyModel[108].setRotationPoint(24F, -20F, 3F);

        bodyModel[109].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 125
        bodyModel[109].setRotationPoint(27F, -21F, -3F);

        bodyModel[110].addBox(-9F, 0F, 0F, 9, 1, 2, 0F); // Box 126
        bodyModel[110].setRotationPoint(27F, -21F, -1F);
        bodyModel[110].rotateAngleZ = -0.40142573F;

        bodyModel[111].addBox(0F, 0F, -1F, 9, 1, 1, 0F); // Box 127
        bodyModel[111].setRotationPoint(18.4F, -25.4F, -1F);
        bodyModel[111].rotateAngleY = -0.26179939F;
        bodyModel[111].rotateAngleZ = 0.45378561F;

        bodyModel[112].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 128
        bodyModel[112].setRotationPoint(18.4F, -25.4F, 1F);
        bodyModel[112].rotateAngleY = 0.26179939F;
        bodyModel[112].rotateAngleZ = 0.45378561F;

        bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 129
        bodyModel[113].setRotationPoint(26F, -30F, -5F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
        bodyModel[114].setRotationPoint(26F, -30F, -6F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
        bodyModel[115].setRotationPoint(26F, -30F, 5F);

        bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 132
        bodyModel[116].setRotationPoint(17.1F, -24.5F, -2F);
        bodyModel[116].rotateAngleZ = 0.78539816F;

        bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 111
        bodyModel[117].setRotationPoint(33F, 0F, -9F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
        bodyModel[118].setRotationPoint(33F, 0F, 8F);

        bodyModel[119].addBox(0F, 0F, 0F, 2, 7, 5, 0F); // Box 116
        bodyModel[119].setRotationPoint(33F, -7F, 4F);

        bodyModel[120].addBox(0F, 0F, 0F, 2, 7, 5, 0F); // Box 128
        bodyModel[120].setRotationPoint(33F, -7F, -9F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 9, 3, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        bodyModel[121].setRotationPoint(33F, -16F, 6F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 9, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[122].setRotationPoint(33F, -16F, -9F);

        bodyModel[123].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 131
        bodyModel[123].setRotationPoint(-31F, -4F, -5.5F);

        bodyModel[124].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 132
        bodyModel[124].setRotationPoint(-28F, -9F, -5.5F);

        bodyModel[125].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 133
        bodyModel[125].setRotationPoint(-31F, -6F, -6.5F);

        bodyModel[126].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 134
        bodyModel[126].setRotationPoint(-31F, -6F, -2.5F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.3F, 9F, -0.6F, 0F, 9F, -0.5F, 0F, 9F, 0F, -1.3F, 9F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 135
        bodyModel[127].setRotationPoint(-34F, -10F, -8F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -3F, 0F, -0.9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 136
        bodyModel[128].setRotationPoint(-33F, -21F, 2F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 137
        bodyModel[129].setRotationPoint(-33F, -21F, -2F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1.5F, 0F, -0.01F, 0F, 1F, -0.01F, -1F, 1F, 0F, -0.4F, 0F, 0F, -1.5F, -0.8F, -0.01F, 0F, -0.8F, -0.01F, 0F, -0.8F, 0F, -0.4F, -0.8F, 0F); // Box 139
        bodyModel[130].setRotationPoint(-36F, -7F, -8F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,-1.5F, 3F, 0F, 1.5F, 3F, 0F, 1.3F, 3F, 0F, -1.3F, 3F, 0F, 1F, 3F, 0F, -1F, 3F, 0F, -0.5F, 3F, 0F, 0.5F, 3F, 0F); // Box 22
        bodyModel[131].setRotationPoint(-34F, -16F, 0F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 6, 7, 0F,-1.3F, 3F, 0F, 1.3F, 3F, 0F, 1.5F, 3F, 0F, -1.5F, 3F, 0F, 0.5F, 3F, 0F, -0.5F, 3F, 0F, -1F, 3F, 0F, 1F, 3F, 0F); // Box 142
        bodyModel[132].setRotationPoint(-34F, -16F, -7F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.4F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, -0.01F, -1.5F, 0F, -0.01F, -0.4F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.01F, -1.5F, -0.8F, -0.01F); // Box 134
        bodyModel[133].setRotationPoint(-36F, -7F, 0F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
        bodyModel[134].setRotationPoint(-34F, 3.5F, -8F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 120
        bodyModel[135].setRotationPoint(-34F, 5F, -8F);
        this.flipAll();
    }
}