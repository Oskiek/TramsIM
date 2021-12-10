package tramsim.models.trains;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Triebwagen105 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public Triebwagen105() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[523];

        initbodyModel_1();
        initbodyModel_2();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // 03
        bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // 04
        bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // 07
        bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // 10
        bodyModel[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // 11
        bodyModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // 12
        bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // 13
        bodyModel[7] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // 14
        bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // 18
        bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // 22
        bodyModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // 23
        bodyModel[11] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // 25
        bodyModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // 26
        bodyModel[13] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // 27
        bodyModel[14] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // 28
        bodyModel[15] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // 29
        bodyModel[16] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // 30
        bodyModel[17] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // 31
        bodyModel[18] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // 32
        bodyModel[19] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // 33
        bodyModel[20] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // 34
        bodyModel[21] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // 35
        bodyModel[22] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // 36
        bodyModel[23] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // 37
        bodyModel[24] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // 38
        bodyModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // 39
        bodyModel[26] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // 40
        bodyModel[27] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // 41
        bodyModel[28] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // 42
        bodyModel[29] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // 43
        bodyModel[30] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // 44
        bodyModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // 45
        bodyModel[32] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // 46
        bodyModel[33] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // 47
        bodyModel[34] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // 48
        bodyModel[35] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // 49
        bodyModel[36] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // 50
        bodyModel[37] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // 51
        bodyModel[38] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // 52
        bodyModel[39] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // 53
        bodyModel[40] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // 54
        bodyModel[41] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // 55
        bodyModel[42] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // 56
        bodyModel[43] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // 57
        bodyModel[44] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // 58
        bodyModel[45] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // 59
        bodyModel[46] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // 60
        bodyModel[47] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // 61
        bodyModel[48] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // 62
        bodyModel[49] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // 63
        bodyModel[50] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // 64
        bodyModel[51] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // 65
        bodyModel[52] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // 66
        bodyModel[53] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // 67
        bodyModel[54] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // 68
        bodyModel[55] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // 69
        bodyModel[56] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // 70
        bodyModel[57] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // 71
        bodyModel[58] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // 76
        bodyModel[59] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // 77
        bodyModel[60] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // 78
        bodyModel[61] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // 79
        bodyModel[62] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // 80
        bodyModel[63] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // 81
        bodyModel[64] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // 82
        bodyModel[65] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // 83
        bodyModel[66] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // 84
        bodyModel[67] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // 85
        bodyModel[68] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // 86
        bodyModel[69] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // 87
        bodyModel[70] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // 88
        bodyModel[71] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // 89
        bodyModel[72] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // 90
        bodyModel[73] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // 91
        bodyModel[74] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // 92
        bodyModel[75] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // 93
        bodyModel[76] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // 95
        bodyModel[77] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // 96
        bodyModel[78] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // 98
        bodyModel[79] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // 99
        bodyModel[80] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // 100
        bodyModel[81] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // 101
        bodyModel[82] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // 102
        bodyModel[83] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // 103
        bodyModel[84] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // 104
        bodyModel[85] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 104
        bodyModel[86] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 104
        bodyModel[87] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 124
        bodyModel[88] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 124
        bodyModel[89] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 124
        bodyModel[90] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 124
        bodyModel[91] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 124
        bodyModel[92] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 124
        bodyModel[93] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 124
        bodyModel[94] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 124
        bodyModel[95] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 124
        bodyModel[96] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 124
        bodyModel[97] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 124
        bodyModel[98] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 124
        bodyModel[99] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 124
        bodyModel[100] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 124
        bodyModel[101] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 124
        bodyModel[102] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 124
        bodyModel[103] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 124
        bodyModel[104] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 124
        bodyModel[105] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 124
        bodyModel[106] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 124
        bodyModel[107] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 124
        bodyModel[108] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 124
        bodyModel[109] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 124
        bodyModel[110] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 124
        bodyModel[111] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 124
        bodyModel[112] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 124
        bodyModel[113] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 124
        bodyModel[114] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 124
        bodyModel[115] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 124
        bodyModel[116] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 124
        bodyModel[117] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 124
        bodyModel[118] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 124
        bodyModel[119] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 124
        bodyModel[120] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 124
        bodyModel[121] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 124
        bodyModel[122] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 124
        bodyModel[123] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 124
        bodyModel[124] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 124
        bodyModel[125] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 124
        bodyModel[126] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 124
        bodyModel[127] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 124
        bodyModel[128] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 124
        bodyModel[129] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 124
        bodyModel[130] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 124
        bodyModel[131] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 104
        bodyModel[132] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 104
        bodyModel[133] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 104
        bodyModel[134] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 104
        bodyModel[135] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 104
        bodyModel[136] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 104
        bodyModel[137] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 104
        bodyModel[138] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 104
        bodyModel[139] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 104
        bodyModel[140] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 104
        bodyModel[141] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 104
        bodyModel[142] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 104
        bodyModel[143] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 104
        bodyModel[144] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 104
        bodyModel[145] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 104
        bodyModel[146] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 104
        bodyModel[147] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 104
        bodyModel[148] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 104
        bodyModel[149] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 104
        bodyModel[150] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 104
        bodyModel[151] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 104
        bodyModel[152] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 104
        bodyModel[153] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 104
        bodyModel[154] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 104
        bodyModel[155] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 104
        bodyModel[156] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 104
        bodyModel[157] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 124
        bodyModel[158] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 124
        bodyModel[159] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 124
        bodyModel[160] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 124
        bodyModel[161] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 124
        bodyModel[162] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 124
        bodyModel[163] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 124
        bodyModel[164] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 124
        bodyModel[165] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 124
        bodyModel[166] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 124
        bodyModel[167] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 124
        bodyModel[168] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 124
        bodyModel[169] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 124
        bodyModel[170] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 124
        bodyModel[171] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 124
        bodyModel[172] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 124
        bodyModel[173] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 124
        bodyModel[174] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 124
        bodyModel[175] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 124
        bodyModel[176] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 260
        bodyModel[177] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 260
        bodyModel[178] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 260
        bodyModel[179] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 260
        bodyModel[180] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 260
        bodyModel[181] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 260
        bodyModel[182] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 260
        bodyModel[183] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 260
        bodyModel[184] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 260
        bodyModel[185] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 260
        bodyModel[186] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 260
        bodyModel[187] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 241
        bodyModel[188] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 241
        bodyModel[189] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 241
        bodyModel[190] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 241
        bodyModel[191] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 258
        bodyModel[192] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 259
        bodyModel[193] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 260
        bodyModel[194] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 261
        bodyModel[195] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 262
        bodyModel[196] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 251
        bodyModel[197] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 253
        bodyModel[198] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 251
        bodyModel[199] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 255
        bodyModel[200] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 255
        bodyModel[201] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 255
        bodyModel[202] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 258
        bodyModel[203] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 258
        bodyModel[204] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 255
        bodyModel[205] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 255
        bodyModel[206] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 255
        bodyModel[207] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 255
        bodyModel[208] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 255
        bodyModel[209] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 255
        bodyModel[210] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 255
        bodyModel[211] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 255
        bodyModel[212] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 258
        bodyModel[213] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 270
        bodyModel[214] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 270
        bodyModel[215] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 272
        bodyModel[216] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 273
        bodyModel[217] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 274
        bodyModel[218] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 275
        bodyModel[219] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 276
        bodyModel[220] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 277
        bodyModel[221] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 278
        bodyModel[222] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 279
        bodyModel[223] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 280
        bodyModel[224] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 281
        bodyModel[225] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Box 282
        bodyModel[226] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 283
        bodyModel[227] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 284
        bodyModel[228] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 285
        bodyModel[229] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 286
        bodyModel[230] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Box 287
        bodyModel[231] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Box 288
        bodyModel[232] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Box 289
        bodyModel[233] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 290
        bodyModel[234] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 291
        bodyModel[235] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 292
        bodyModel[236] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Box 293
        bodyModel[237] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 294
        bodyModel[238] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Box 295
        bodyModel[239] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 296
        bodyModel[240] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 297
        bodyModel[241] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 298
        bodyModel[242] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 299
        bodyModel[243] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 300
        bodyModel[244] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Box 301
        bodyModel[245] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 302
        bodyModel[246] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Box 303
        bodyModel[247] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 304
        bodyModel[248] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 305
        bodyModel[249] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 306
        bodyModel[250] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 307
        bodyModel[251] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 308
        bodyModel[252] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 309
        bodyModel[253] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 310
        bodyModel[254] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 311
        bodyModel[255] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 312
        bodyModel[256] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 312
        bodyModel[257] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 312
        bodyModel[258] = new ModelRendererTurbo(this, 41, 233, textureX, textureY); // Box 317
        bodyModel[259] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 318
        bodyModel[260] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 319
        bodyModel[261] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 312
        bodyModel[262] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 312
        bodyModel[263] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 312
        bodyModel[264] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Box 317
        bodyModel[265] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 318
        bodyModel[266] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 319
        bodyModel[267] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 329
        bodyModel[268] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 330
        bodyModel[269] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // 90
        bodyModel[270] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // 90
        bodyModel[271] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 337
        bodyModel[272] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 258
        bodyModel[273] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Box 341
        bodyModel[274] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Box 342
        bodyModel[275] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 344
        bodyModel[276] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 344
        bodyModel[277] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 104
        bodyModel[278] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // Box 104
        bodyModel[279] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Box 104
        bodyModel[280] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 104
        bodyModel[281] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 104
        bodyModel[282] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 104
        bodyModel[283] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 104
        bodyModel[284] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 104
        bodyModel[285] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 104
        bodyModel[286] = new ModelRendererTurbo(this, 345, 241, textureX, textureY); // Box 104
        bodyModel[287] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // 76
        bodyModel[288] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // 77
        bodyModel[289] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // 78
        bodyModel[290] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // 79
        bodyModel[291] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // 92
        bodyModel[292] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Box 329
        bodyModel[293] = new ModelRendererTurbo(this, 49, 249, textureX, textureY); // Box 330
        bodyModel[294] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // 90
        bodyModel[295] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 342
        bodyModel[296] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 342
        bodyModel[297] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 342
        bodyModel[298] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 104
        bodyModel[299] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 104
        bodyModel[300] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Box 104
        bodyModel[301] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 104
        bodyModel[302] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 104
        bodyModel[303] = new ModelRendererTurbo(this, 81, 257, textureX, textureY); // Box 104
        bodyModel[304] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 104
        bodyModel[305] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 104
        bodyModel[306] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 104
        bodyModel[307] = new ModelRendererTurbo(this, 81, 265, textureX, textureY); // Box 104
        bodyModel[308] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Box 104
        bodyModel[309] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 104
        bodyModel[310] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Box 104
        bodyModel[311] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Box 104
        bodyModel[312] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 104
        bodyModel[313] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Box 104
        bodyModel[314] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 104
        bodyModel[315] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 104
        bodyModel[316] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 316
        bodyModel[317] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 316
        bodyModel[318] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 316
        bodyModel[319] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Box 316
        bodyModel[320] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 316
        bodyModel[321] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Box 316
        bodyModel[322] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Box 316
        bodyModel[323] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 316
        bodyModel[324] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 316
        bodyModel[325] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Box 316
        bodyModel[326] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box 316
        bodyModel[327] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 316
        bodyModel[328] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 316
        bodyModel[329] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 316
        bodyModel[330] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 316
        bodyModel[331] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Box 316
        bodyModel[332] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 316
        bodyModel[333] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 316
        bodyModel[334] = new ModelRendererTurbo(this, 353, 265, textureX, textureY); // Box 316
        bodyModel[335] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 316
        bodyModel[336] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Box 316
        bodyModel[337] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Box 316
        bodyModel[338] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 316
        bodyModel[339] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 316
        bodyModel[340] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 316
        bodyModel[341] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Box 316
        bodyModel[342] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 316
        bodyModel[343] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Box 349
        bodyModel[344] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 350
        bodyModel[345] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 316
        bodyModel[346] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Box 352
        bodyModel[347] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Box 353
        bodyModel[348] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Box 354
        bodyModel[349] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Box 355
        bodyModel[350] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 356
        bodyModel[351] = new ModelRendererTurbo(this, 9, 273, textureX, textureY); // Box 357
        bodyModel[352] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 359
        bodyModel[353] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Box 360
        bodyModel[354] = new ModelRendererTurbo(this, 105, 273, textureX, textureY); // Box 361
        bodyModel[355] = new ModelRendererTurbo(this, 57, 273, textureX, textureY); // Box 362
        bodyModel[356] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 363
        bodyModel[357] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 364
        bodyModel[358] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 365
        bodyModel[359] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 366
        bodyModel[360] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 367
        bodyModel[361] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Box 368
        bodyModel[362] = new ModelRendererTurbo(this, 97, 273, textureX, textureY); // Box 369
        bodyModel[363] = new ModelRendererTurbo(this, 145, 273, textureX, textureY); // Box 370
        bodyModel[364] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Box 371
        bodyModel[365] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Box 372
        bodyModel[366] = new ModelRendererTurbo(this, 105, 273, textureX, textureY); // Box 373
        bodyModel[367] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 374
        bodyModel[368] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 375
        bodyModel[369] = new ModelRendererTurbo(this, 153, 273, textureX, textureY); // Box 376
        bodyModel[370] = new ModelRendererTurbo(this, 169, 273, textureX, textureY); // Box 377
        bodyModel[371] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 378
        bodyModel[372] = new ModelRendererTurbo(this, 257, 273, textureX, textureY); // Box 379
        bodyModel[373] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Box 380
        bodyModel[374] = new ModelRendererTurbo(this, 273, 273, textureX, textureY); // Box 381
        bodyModel[375] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 382
        bodyModel[376] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 383
        bodyModel[377] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 384
        bodyModel[378] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 385
        bodyModel[379] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 386
        bodyModel[380] = new ModelRendererTurbo(this, 361, 273, textureX, textureY); // Box 387
        bodyModel[381] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 388
        bodyModel[382] = new ModelRendererTurbo(this, 497, 273, textureX, textureY); // Box 389
        bodyModel[383] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Box 390
        bodyModel[384] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 391
        bodyModel[385] = new ModelRendererTurbo(this, 9, 281, textureX, textureY); // Box 392
        bodyModel[386] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 393
        bodyModel[387] = new ModelRendererTurbo(this, 185, 281, textureX, textureY); // Box 394
        bodyModel[388] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Box 395
        bodyModel[389] = new ModelRendererTurbo(this, 169, 281, textureX, textureY); // Box 396
        bodyModel[390] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Box 397
        bodyModel[391] = new ModelRendererTurbo(this, 153, 281, textureX, textureY); // Box 398
        bodyModel[392] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Box 399
        bodyModel[393] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Box 400
        bodyModel[394] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 401
        bodyModel[395] = new ModelRendererTurbo(this, 361, 273, textureX, textureY); // Box 365
        bodyModel[396] = new ModelRendererTurbo(this, 377, 281, textureX, textureY); // Box 403
        bodyModel[397] = new ModelRendererTurbo(this, 89, 289, textureX, textureY); // Box 404
        bodyModel[398] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Box 405
        bodyModel[399] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); // Box 406
        bodyModel[400] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 407
        bodyModel[401] = new ModelRendererTurbo(this, 217, 281, textureX, textureY); // Box 408
        bodyModel[402] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 409
        bodyModel[403] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Box 410
        bodyModel[404] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Box 411
        bodyModel[405] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 412
        bodyModel[406] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Box 413
        bodyModel[407] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); // Box 414
        bodyModel[408] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 415
        bodyModel[409] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Box 416
        bodyModel[410] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Box 417
        bodyModel[411] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 418
        bodyModel[412] = new ModelRendererTurbo(this, 265, 281, textureX, textureY); // Box 419
        bodyModel[413] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Box 420
        bodyModel[414] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 421
        bodyModel[415] = new ModelRendererTurbo(this, 297, 297, textureX, textureY); // Box 422
        bodyModel[416] = new ModelRendererTurbo(this, 81, 305, textureX, textureY); // Box 423
        bodyModel[417] = new ModelRendererTurbo(this, 113, 305, textureX, textureY); // Box 424
        bodyModel[418] = new ModelRendererTurbo(this, 177, 297, textureX, textureY); // Box 425
        bodyModel[419] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 426
        bodyModel[420] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 427
        bodyModel[421] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 428
        bodyModel[422] = new ModelRendererTurbo(this, 217, 297, textureX, textureY); // Box 429
        bodyModel[423] = new ModelRendererTurbo(this, 393, 281, textureX, textureY); // Box 430
        bodyModel[424] = new ModelRendererTurbo(this, 73, 297, textureX, textureY); // Box 431
        bodyModel[425] = new ModelRendererTurbo(this, 361, 297, textureX, textureY); // Box 432
        bodyModel[426] = new ModelRendererTurbo(this, 489, 297, textureX, textureY); // Box 433
        bodyModel[427] = new ModelRendererTurbo(this, 257, 297, textureX, textureY); // Box 434
        bodyModel[428] = new ModelRendererTurbo(this, 377, 281, textureX, textureY); // Box 435
        bodyModel[429] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 436
        bodyModel[430] = new ModelRendererTurbo(this, 113, 289, textureX, textureY); // Box 437
        bodyModel[431] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Box 438
        bodyModel[432] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Box 439
        bodyModel[433] = new ModelRendererTurbo(this, 393, 297, textureX, textureY); // Box 440
        bodyModel[434] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Box 441
        bodyModel[435] = new ModelRendererTurbo(this, 353, 305, textureX, textureY); // Box 442
        bodyModel[436] = new ModelRendererTurbo(this, 425, 297, textureX, textureY); // Box 443
        bodyModel[437] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Box 444
        bodyModel[438] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Box 445
        bodyModel[439] = new ModelRendererTurbo(this, 353, 289, textureX, textureY); // Box 446
        bodyModel[440] = new ModelRendererTurbo(this, 409, 305, textureX, textureY); // Box 447
        bodyModel[441] = new ModelRendererTurbo(this, 433, 305, textureX, textureY); // Box 448
        bodyModel[442] = new ModelRendererTurbo(this, 457, 297, textureX, textureY); // Box 449
        bodyModel[443] = new ModelRendererTurbo(this, 473, 305, textureX, textureY); // Box 450
        bodyModel[444] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 451
        bodyModel[445] = new ModelRendererTurbo(this, 201, 305, textureX, textureY); // Box 452
        bodyModel[446] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 453
        bodyModel[447] = new ModelRendererTurbo(this, 425, 289, textureX, textureY); // Box 454
        bodyModel[448] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Box 455
        bodyModel[449] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 456
        bodyModel[450] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 457
        bodyModel[451] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 458
        bodyModel[452] = new ModelRendererTurbo(this, 457, 289, textureX, textureY); // Box 459
        bodyModel[453] = new ModelRendererTurbo(this, 25, 297, textureX, textureY); // Box 460
        bodyModel[454] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 461
        bodyModel[455] = new ModelRendererTurbo(this, 169, 297, textureX, textureY); // Box 462
        bodyModel[456] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Box 463
        bodyModel[457] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 464
        bodyModel[458] = new ModelRendererTurbo(this, 281, 305, textureX, textureY); // Box 465
        bodyModel[459] = new ModelRendererTurbo(this, 369, 305, textureX, textureY); // Box 466
        bodyModel[460] = new ModelRendererTurbo(this, 489, 305, textureX, textureY); // Box 467
        bodyModel[461] = new ModelRendererTurbo(this, 17, 313, textureX, textureY); // Box 468
        bodyModel[462] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 469
        bodyModel[463] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Box 470
        bodyModel[464] = new ModelRendererTurbo(this, 81, 305, textureX, textureY); // Box 471
        bodyModel[465] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 472
        bodyModel[466] = new ModelRendererTurbo(this, 33, 313, textureX, textureY); // Box 473
        bodyModel[467] = new ModelRendererTurbo(this, 145, 313, textureX, textureY); // Box 474
        bodyModel[468] = new ModelRendererTurbo(this, 161, 313, textureX, textureY); // Box 475
        bodyModel[469] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 476
        bodyModel[470] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 477
        bodyModel[471] = new ModelRendererTurbo(this, 233, 313, textureX, textureY); // Box 478
        bodyModel[472] = new ModelRendererTurbo(this, 249, 313, textureX, textureY); // Box 479
        bodyModel[473] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Box 480
        bodyModel[474] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Box 481
        bodyModel[475] = new ModelRendererTurbo(this, 297, 313, textureX, textureY); // Box 482
        bodyModel[476] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 483
        bodyModel[477] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 484
        bodyModel[478] = new ModelRendererTurbo(this, 137, 305, textureX, textureY); // Box 485
        bodyModel[479] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 486
        bodyModel[480] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Box 487
        bodyModel[481] = new ModelRendererTurbo(this, 329, 313, textureX, textureY); // Box 488
        bodyModel[482] = new ModelRendererTurbo(this, 345, 313, textureX, textureY); // Box 489
        bodyModel[483] = new ModelRendererTurbo(this, 361, 313, textureX, textureY); // Box 490
        bodyModel[484] = new ModelRendererTurbo(this, 377, 313, textureX, textureY); // Box 491
        bodyModel[485] = new ModelRendererTurbo(this, 393, 313, textureX, textureY); // Box 492
        bodyModel[486] = new ModelRendererTurbo(this, 409, 313, textureX, textureY); // Box 493
        bodyModel[487] = new ModelRendererTurbo(this, 425, 313, textureX, textureY); // Box 494
        bodyModel[488] = new ModelRendererTurbo(this, 441, 313, textureX, textureY); // Box 495
        bodyModel[489] = new ModelRendererTurbo(this, 457, 313, textureX, textureY); // Box 496
        bodyModel[490] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 497
        bodyModel[491] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 470
        bodyModel[492] = new ModelRendererTurbo(this, 209, 305, textureX, textureY); // Box 492
        bodyModel[493] = new ModelRendererTurbo(this, 249, 305, textureX, textureY); // Box 493
        bodyModel[494] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 496
        bodyModel[495] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Box 497
        bodyModel[496] = new ModelRendererTurbo(this, 505, 305, textureX, textureY); // Box 498
        bodyModel[497] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Box 499
        bodyModel[498] = new ModelRendererTurbo(this, 193, 313, textureX, textureY); // Box 500
        bodyModel[499] = new ModelRendererTurbo(this, 473, 313, textureX, textureY); // Box 501

        bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 36, 0, 0F,-0.6F, 0F, 0.1F, -8.1F, 0F, -0.4F, -8F, 0F, 0.5F, -0.5F, 0F, 0F, -0.6F, -18.1F, 0.1F, -8.1F, -18F, -0.4F, -8F, -18F, 0.5F, -0.5F, -18F, 0F); // 03
        bodyModel[0].setRotationPoint(-40F, -14F, 8F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 0, 36, 6, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.6F, 0F, -3.1F, -0.5F, 0F, -3F, 0F, -18F, 0F, 0.1F, -18F, 0F, 0.6F, -18F, -3.1F, -0.5F, -18F, -3F); // 04
        bodyModel[1].setRotationPoint(-40F, -14F, 5F);

        bodyModel[2].addShapeBox(0F, 0F, -6F, 0, 36, 6, 0F,-0.5F, 0F, -3F, 0.6F, 0F, -3.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -18F, -3F, 0.6F, -18F, -3.1F, 0.1F, -18F, 0F, 0F, -18F, 0F); // 07
        bodyModel[2].setRotationPoint(-40F, -14F, -5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 96, 36, 0, 0F,0F, 0F, 0F, -48F, 0F, 0F, -48.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0F, -18F, 0F, -48F, -18F, 0F, -48.1F, -18F, 0.1F, -0.1F, -18F, 0.1F); // 10
        bodyModel[3].setRotationPoint(-24F, -14F, -9F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 0, 36, 2, 0F,0.1F, 0F, -1.4F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0.1F, 0F, 0.4F, 0.1F, -18F, -1.4F, 0F, -18F, -1.5F, 0F, -18F, 0.5F, 0.1F, -18F, 0.4F); // 11
        bodyModel[4].setRotationPoint(-32F, -14F, 6F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 36, 0, 0F,0.1F, 0F, -0.4F, -7.9F, 0F, -0.9F, -8F, 0F, 1F, 0F, 0F, 0.5F, 0.1F, -18F, -0.4F, -7.9F, -18F, -0.9F, -8F, -18F, 1F, 0F, -18F, 0.5F); // 12
        bodyModel[5].setRotationPoint(-32F, -14F, 7F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 36, 2, 0F,0F, 0F, -2F, 0.1F, 0F, -1.9F, 0.1F, 0F, 0.9F, 0F, 0F, 1F, 0F, -18F, -2F, 0.1F, -18F, -1.9F, 0.1F, -18F, 0.9F, 0F, -18F, 1F); // 13
        bodyModel[6].setRotationPoint(-24F, -14F, 6F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 96, 36, 0, 0F,-0.1F, 0F, 0.1F, -48.1F, 0F, 0.1F, -48F, 0F, 0F, 0F, 0F, 0F, -0.1F, -18F, 0.1F, -48.1F, -18F, 0.1F, -48F, -18F, 0F, 0F, -18F, 0F); // 14
        bodyModel[7].setRotationPoint(-24F, -14F, 9F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 0, 36, 2, 0F,0F, 0F, 1F, 0.1F, 0F, 0.9F, 0.1F, 0F, -1.9F, 0F, 0F, -2F, 0F, -18F, 1F, 0.1F, -18F, 0.9F, 0.1F, -18F, -1.9F, 0F, -18F, -2F); // 18
        bodyModel[8].setRotationPoint(-24F, -14F, -8F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 36, 0, 0F,-4.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.4F, 0F, -0.15F, -4.6F, 0F, 0.1F, -4.5F, -18F, 0F, 0.5F, -18F, 0.25F, 0.4F, -18F, -0.15F, -4.6F, -18F, 0.1F); // 22
        bodyModel[9].setRotationPoint(-44F, -14F, -8F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 36, 20, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -10F, 0F, 0F, -10F, 0F, -18F, 0F, 0.1F, -18F, 0F, 0.1F, -18F, -10F, 0F, -18F, -10F); // 23
        bodyModel[10].setRotationPoint(-40F, -14F, -5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 23, 36, 0, 0F,-11.5F, 0F, 0.25F, 0F, 0F, 1F, 0.1F, 0F, -0.9F, -11.4F, 0F, -0.15F, -11.5F, -18F, 0.25F, 0F, -18F, 1F, 0.1F, -18F, -0.9F, -11.4F, -18F, -0.15F); // 25
        bodyModel[11].setRotationPoint(-47F, -14F, -7F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 36, 2, 0F,-0.4F, 0F, -0.85F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.25F, -0.4F, 0F, -0.15F, -0.4F, -18F, -0.85F, 0.5F, -18F, -0.75F, 0.5F, -18F, -0.25F, -0.4F, -18F, -0.15F); // 26
        bodyModel[12].setRotationPoint(-36F, -14F, -9F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 84, 2, 1, 0F,0F, -0.2F, -0.8F, -42F, -0.2F, -0.8F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -42F, -1F, -1F, -42F, -1F, 0.2F, 0F, -1F, 0.2F); // 27
        bodyModel[13].setRotationPoint(-21F, -15F, 8F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 84, 2, 1, 0F,0F, -0.3F, -0.4F, -42F, -0.3F, -0.4F, -42F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.8F, -0.8F, -42F, -0.8F, -0.8F, -42F, -1F, 0F, 0F, -1F, 0F); // 28
        bodyModel[14].setRotationPoint(-21F, -16F, 8F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 84, 2, 1, 0F,0F, -0.7F, -0.9F, -42F, -0.7F, -0.9F, -42F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, -1.4F, -42F, -0.7F, -1.4F, -42F, -0.9F, 0.6F, 0F, -0.9F, 0.6F); // 29
        bodyModel[15].setRotationPoint(-21F, -17F, 7F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 84, 1, 2, 0F,0F, 0.2F, -0.1F, -42F, 0.2F, -0.1F, -42F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.9F, 0F, -42F, -0.9F, 0F, -42F, -0.3F, -1.1F, 0F, -0.3F, -1.1F); // 30
        bodyModel[16].setRotationPoint(-21F, -17F, 7F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 84, 1, 10, 0F,0F, 0.9F, 0F, -42F, 0.9F, 0F, -42F, 0.6F, -4.9F, 0F, 0.6F, -4.9F, 0F, -1.6F, 0F, -42F, -1.6F, 0F, -42F, -1.3F, -4.9F, 0F, -1.3F, -4.9F); // 31
        bodyModel[17].setRotationPoint(-21F, -17F, 0F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 84, 4, 1, 0F,0F, -0.7F, -0.4F, -42F, -0.7F, -0.4F, -42F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -1.9F, -0.7F, -42F, -1.9F, -0.7F, -42F, -1.9F, -0.1F, 0F, -1.9F, -0.1F); // 32
        bodyModel[18].setRotationPoint(-21F, -20F, 4F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 84, 2, 1, 0F,0F, 0F, 0F, -42F, 0F, 0F, -42F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -1F, 0.2F, -42F, -1F, 0.2F, -42F, -1F, -1F, 0F, -1F, -1F); // 33
        bodyModel[19].setRotationPoint(-21F, -15F, -9F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 84, 2, 1, 0F,0F, -0.1F, -0.4F, -42F, -0.1F, -0.4F, -42F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -1F, 0F, -42F, -1F, 0F, -42F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // 34
        bodyModel[20].setRotationPoint(-21F, -16F, -9F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 84, 2, 2, 0F,-0.4F, -0.4F, -0.7F, -42.4F, -0.4F, -0.7F, -42.4F, -0.8F, -0.7F, -0.4F, -0.8F, -0.7F, 0F, -1.1F, -0.3F, -42F, -1.1F, -0.3F, -42F, -0.6F, -1F, 0F, -0.6F, -1F); // 35
        bodyModel[21].setRotationPoint(-21F, -18F, 7F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 84, 1, 10, 0F,0F, 0.6F, -4.9F, -42F, 0.6F, -4.9F, -42F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, -1.3F, -4.9F, -42F, -1.3F, -4.9F, -42F, -1.6F, 0F, 0F, -1.6F, 0F); // 36
        bodyModel[22].setRotationPoint(-21F, -17F, -10F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 84, 1, 4, 0F,0F, 0.2F, -1.9F, -42F, 0.2F, -1.9F, -42F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F, -0.9F, -2F, -42F, -0.9F, -2F, -42F, -1.3F, -0.1F, 0F, -1.3F, -0.1F); // 37
        bodyModel[23].setRotationPoint(-21F, -17F, -9F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, -0.4F, 0F, -9F, -0.1F, 0F, -9F, -0.4F, -4.9F, 0F, -0.6F, -4.9F, 0F, -0.3F, 0F, -9F, -0.6F, 0F, -9F, -0.3F, -4.9F, 0F, -0.1F, -4.9F); // 38
        bodyModel[24].setRotationPoint(-30F, -18F, 0F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,0F, -0.9F, 0F, -3F, -0.4F, 0F, -3F, -0.6F, -4.9F, 0F, -1F, -4.9F, 0F, 0.2F, 0F, -3F, -0.3F, 0F, -3F, -0.1F, -4.9F, 0F, 0.3F, -4.9F); // 39
        bodyModel[25].setRotationPoint(-33F, -18F, 0F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,0F, -0.9F, 0F, -3F, 0.1F, 0F, -3F, 0F, -4.9F, 0F, -1F, -4.9F, 0F, 0.2F, 0F, -3F, -0.8F, 0F, -3F, -0.7F, -4.9F, 0F, 0.3F, -4.9F); // 40
        bodyModel[26].setRotationPoint(-36F, -17F, 0F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,0F, -1.1F, 0F, -3F, 0.1F, 0F, -3F, 0F, -4.9F, 0F, -1.2F, -4.9F, 0F, 0.4F, 0F, -3F, -0.8F, 0F, -3F, -0.7F, -4.9F, 0F, 0.5F, -4.9F); // 41
        bodyModel[27].setRotationPoint(-39F, -16F, 0F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 36, 0F,0F, -0.3F, 0.2F, -3F, -0.3F, 0.05F, -3F, -0.3F, -17.95F, 0F, -0.3F, -17.8F, 0F, -1F, 0.2F, -3F, -1F, 0.2F, -3F, -1F, -17.8F, 0F, -1F, -17.8F); // 42
        bodyModel[28].setRotationPoint(-24F, -15F, -9F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 32, 2, 36, 0F,-0.4F, -0.3F, -0.8F, -16F, -0.3F, 0.2F, -16F, -0.3F, -17.8F, -0.4F, -0.3F, -18.8F, -0.4F, -1F, -0.8F, -16F, -1F, 0.2F, -16F, -1F, -17.8F, -0.4F, -1F, -18.8F); // 43
        bodyModel[29].setRotationPoint(-40F, -15F, -9F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 2, 32, 0F,-0.8F, -0.3F, -3F, -6.6F, -0.3F, 0.2F, -6.6F, -0.3F, -15.8F, -0.8F, -0.3F, -19F, -0.8F, -1F, -3F, -6.6F, -1F, 0.2F, -6.6F, -1F, -15.8F, -0.8F, -1F, -19F); // 44
        bodyModel[30].setRotationPoint(-41F, -15F, -8F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, -0.6F, -4.9F, -9F, -0.4F, -4.9F, -9F, -0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.1F, -4.9F, -9F, -0.3F, -4.9F, -9F, -0.6F, 0F, 0F, -0.3F, 0F); // 45
        bodyModel[31].setRotationPoint(-30F, -18F, -10F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,0F, -1F, -4.9F, -3F, -0.6F, -4.9F, -3F, -0.4F, 0F, 0F, -0.9F, 0F, 0F, 0.3F, -4.9F, -3F, -0.1F, -4.9F, -3F, -0.3F, 0F, 0F, 0.2F, 0F); // 46
        bodyModel[32].setRotationPoint(-33F, -18F, -10F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,0F, -1F, -4.9F, -3F, 0F, -4.9F, -3F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, 0.3F, -4.9F, -3F, -0.7F, -4.9F, -3F, -0.8F, 0F, 0F, 0.2F, 0F); // 47
        bodyModel[33].setRotationPoint(-36F, -17F, -10F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,0F, -1.2F, -4.9F, -3F, 0F, -4.9F, -3F, 0.1F, 0F, 0F, -1.1F, 0F, 0F, 0.5F, -4.9F, -3F, -0.7F, -4.9F, -3F, -0.8F, 0F, 0F, 0.4F, 0F); // 48
        bodyModel[34].setRotationPoint(-39F, -16F, -10F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,-9F, -0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -4.9F, -9F, -0.4F, -4.9F, -9F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, -4.9F, -9F, -0.3F, -4.9F); // 49
        bodyModel[35].setRotationPoint(12F, -18F, 0F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,-3F, -0.4F, 0F, 0F, -0.9F, 0F, 0F, -1F, -4.9F, -3F, -0.6F, -4.9F, -3F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, -4.9F, -3F, -0.1F, -4.9F); // 50
        bodyModel[36].setRotationPoint(27F, -18F, 0F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,-3F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -1F, -4.9F, -3F, 0F, -4.9F, -3F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, -4.9F, -3F, -0.7F, -4.9F); // 51
        bodyModel[37].setRotationPoint(30F, -17F, 0F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,-3F, 0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.2F, -4.9F, -3F, 0F, -4.9F, -3F, -0.8F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, -4.9F, -3F, -0.7F, -4.9F); // 52
        bodyModel[38].setRotationPoint(33F, -16F, 0F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 2, 36, 0F,-3F, -0.3F, 0.05F, 0F, -0.3F, 0.2F, 0F, -0.3F, -17.8F, -3F, -0.3F, -17.95F, -3F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, -17.8F, -3F, -1F, -17.8F); // 53
        bodyModel[39].setRotationPoint(18F, -15F, -9F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 32, 2, 36, 0F,-16F, -0.3F, 0.2F, -0.4F, -0.3F, -0.8F, -0.4F, -0.3F, -18.8F, -16F, -0.3F, -17.8F, -16F, -1F, 0.2F, -0.4F, -1F, -0.8F, -0.4F, -1F, -18.8F, -16F, -1F, -17.8F); // 54
        bodyModel[40].setRotationPoint(8F, -15F, -9F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 2, 32, 0F,-0.6F, -0.3F, 0.2F, -6.8F, -0.3F, -3F, -6.8F, -0.3F, -19F, -0.6F, -0.3F, -15.8F, -0.6F, -1F, 0.2F, -6.8F, -1F, -3F, -6.8F, -1F, -19F, -0.6F, -1F, -15.8F); // 55
        bodyModel[41].setRotationPoint(39F, -15F, -8F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,-9F, -0.4F, -4.9F, 0F, -0.6F, -4.9F, 0F, -0.4F, 0F, -9F, -0.1F, 0F, -9F, -0.3F, -4.9F, 0F, -0.1F, -4.9F, 0F, -0.3F, 0F, -9F, -0.6F, 0F); // 56
        bodyModel[42].setRotationPoint(12F, -18F, -10F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,-3F, -0.6F, -4.9F, 0F, -1F, -4.9F, 0F, -0.9F, 0F, -3F, -0.4F, 0F, -3F, -0.1F, -4.9F, 0F, 0.3F, -4.9F, 0F, 0.2F, 0F, -3F, -0.3F, 0F); // 57
        bodyModel[43].setRotationPoint(27F, -18F, -10F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,-3F, 0F, -4.9F, 0F, -1F, -4.9F, 0F, -0.9F, 0F, -3F, 0.1F, 0F, -3F, -0.7F, -4.9F, 0F, 0.3F, -4.9F, 0F, 0.2F, 0F, -3F, -0.8F, 0F); // 58
        bodyModel[44].setRotationPoint(30F, -17F, -10F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,-3F, 0F, -4.9F, 0F, -1.2F, -4.9F, 0F, -1.1F, 0F, -3F, 0.1F, 0F, -3F, -0.7F, -4.9F, 0F, 0.5F, -4.9F, 0F, 0.4F, 0F, -3F, -0.8F, 0F); // 59
        bodyModel[45].setRotationPoint(33F, -16F, -10F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,-0.2F, 0F, 0F, -4.8F, -0.9F, 0F, -4.8F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, -4.6F, -0.7F, 0F, -4.6F, -0.7F, 0F, -0.2F, -0.7F, 0F); // 60
        bodyModel[46].setRotationPoint(35F, -16F, 3F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 24, 4, 1, 0F,0F, 0.5F, 0F, -12.8F, 0F, 0F, -12.8F, 0F, 0F, 0F, 0.4F, 0F, 0F, -1.7F, 0F, -12.8F, -1.7F, 0F, -12.8F, -1.7F, 0F, 0F, -1.7F, 0F); // 61
        bodyModel[47].setRotationPoint(21F, -17F, 3F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-0.2F, 0F, 0F, -4.8F, -0.9F, 0F, -4.8F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, -1.7F, 0F, -4.8F, -1.7F, 0F, -4.8F, -1.7F, 0F, -0.2F, -1.7F, 0F); // 62
        bodyModel[48].setRotationPoint(32F, -17F, 3F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,-0.2F, 0F, 0F, -4.8F, -0.9F, 0F, -4.8F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, -4.6F, -0.7F, 0F, -4.6F, -0.7F, 0F, -0.2F, -0.7F, 0F); // 63
        bodyModel[49].setRotationPoint(35F, -16F, -4F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 24, 4, 1, 0F,0F, 0.5F, 0F, -12.8F, 0F, 0F, -12.8F, 0F, 0F, 0F, 0.4F, 0F, 0F, -1.7F, 0F, -12.8F, -1.7F, 0F, -12.8F, -1.7F, 0F, 0F, -1.7F, 0F); // 64
        bodyModel[50].setRotationPoint(21F, -17F, -4F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-0.2F, 0F, 0F, -4.8F, -0.9F, 0F, -4.8F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, -1.7F, 0F, -4.8F, -1.7F, 0F, -4.8F, -1.7F, 0F, -0.2F, -1.7F, 0F); // 65
        bodyModel[51].setRotationPoint(32F, -17F, -4F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,-4.8F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -4.8F, -0.9F, 0F, -4.6F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -4.6F, -0.7F, 0F); // 66
        bodyModel[52].setRotationPoint(-43F, -16F, 3F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 24, 4, 1, 0F,-12.8F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, -12.8F, 0F, 0F, -12.8F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -12.8F, -1.7F, 0F); // 67
        bodyModel[53].setRotationPoint(-45F, -17F, 3F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-4.8F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -4.8F, -0.9F, 0F, -4.8F, -1.7F, 0F, -0.2F, -1.7F, 0F, -0.2F, -1.7F, 0F, -4.8F, -1.7F, 0F); // 68
        bodyModel[54].setRotationPoint(-40F, -17F, 3F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,-4.8F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -4.8F, -0.9F, 0F, -4.6F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -4.6F, -0.7F, 0F); // 69
        bodyModel[55].setRotationPoint(-43F, -16F, -4F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 24, 4, 1, 0F,-12.8F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, -12.8F, 0F, 0F, -12.8F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -12.8F, -1.7F, 0F); // 70
        bodyModel[56].setRotationPoint(-45F, -17F, -4F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-4.8F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -4.8F, -0.9F, 0F, -4.8F, -1.7F, 0F, -0.2F, -1.7F, 0F, -0.2F, -1.7F, 0F, -4.8F, -1.7F, 0F); // 71
        bodyModel[57].setRotationPoint(-40F, -17F, -4F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, -2.6F, 0F, -1F, -2.6F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -2F, 0F, -1.7F, -2F); // 76
        bodyModel[58].setRotationPoint(-21F, -17F, 7F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -3F, 0F, -1.7F, -3F); // 77
        bodyModel[59].setRotationPoint(-21F, -17F, 4F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -2F, 0F, -1.7F, -2F); // 78
        bodyModel[60].setRotationPoint(-21F, -17F, -9F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -3F, 0F, -1.7F, -3F); // 79
        bodyModel[61].setRotationPoint(-21F, -17F, -7F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 36, 2, 0F,0.6F, 0F, -0.65F, -0.9F, 0F, -0.55F, -0.9F, 0F, -0.75F, 0.6F, 0F, -0.75F, 0.6F, -18F, -0.65F, -0.9F, -18F, -0.6F, -0.9F, -18F, -0.75F, 0.6F, -18F, -0.75F); // 80
        bodyModel[62].setRotationPoint(30F, -14F, 7F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 36, 2, 0F,-0.9F, 0F, -0.75F, 0.6F, 0F, -0.75F, 0.6F, 0F, -0.65F, -0.9F, 0F, -0.55F, -0.9F, -18F, -0.75F, 0.6F, -18F, -0.75F, 0.6F, -18F, -0.65F, -0.9F, -18F, -0.6F); // 81
        bodyModel[63].setRotationPoint(-31F, -14F, -9F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 84, 1, 4, 0F,0F, 0.6F, -0.1F, -42F, 0.6F, -0.1F, -42F, 0.2F, -1.9F, 0F, 0.2F, -1.9F, 0F, -1.3F, -0.1F, -42F, -1.3F, -0.1F, -42F, -0.9F, -2F, 0F, -0.9F, -2F); // 82
        bodyModel[64].setRotationPoint(-21F, -17F, 5F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 84, 2, 1, 0F,0F, -0.4F, 0F, -42F, -0.4F, 0F, -42F, -0.7F, -0.9F, 0F, -0.7F, -0.9F, 0F, -0.9F, 0.6F, -42F, -0.9F, 0.6F, -42F, -0.7F, -1.4F, 0F, -0.7F, -1.4F); // 83
        bodyModel[65].setRotationPoint(-21F, -17F, -8F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 84, 4, 18, 0F,0F, -0.8F, 0.5F, -42F, -0.8F, 0.5F, -42F, -0.8F, -9.5F, 0F, -0.8F, -9.5F, 0F, -1.6F, 0.5F, -42F, -1.6F, 0.5F, -42F, -1.6F, -9.5F, 0F, -1.6F, -9.5F); // 84
        bodyModel[66].setRotationPoint(-21F, -20F, -4F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 84, 4, 1, 0F,0F, -0.7F, -0.4F, -42F, -0.7F, -0.4F, -42F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, -1.9F, -0.1F, -42F, -1.9F, -0.1F, -42F, -1.9F, -0.7F, 0F, -1.9F, -0.7F); // 85
        bodyModel[67].setRotationPoint(-21F, -20F, -5F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 84, 1, 2, 0F,0F, -0.4F, -1F, -42F, -0.4F, -1F, -42F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, -0.3F, -1.1F, -42F, -0.3F, -1.1F, -42F, -0.9F, 0F, 0F, -0.9F, 0F); // 86
        bodyModel[68].setRotationPoint(-21F, -17F, -9F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 84, 2, 2, 0F,-0.4F, -0.8F, 0.3F, -42.4F, -0.8F, 0.3F, -42.4F, -0.4F, -1.7F, -0.4F, -0.4F, -1.7F, 0F, -0.6F, 0F, -42F, -0.6F, 0F, -42F, -1.1F, -1.3F, 0F, -1.1F, -1.3F); // 87
        bodyModel[69].setRotationPoint(-21F, -18F, -8F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,-0.4F, 0F, 0F, -8.4F, 0F, 0F, -8.4F, 0F, -8F, -0.4F, 0F, -8F, 0F, -1F, 0F, -8F, -1F, 0F, -8F, -1F, -8F, 0F, -1F, -8F); // 88
        bodyModel[70].setRotationPoint(-4F, -20F, -4F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.8F, -5F, 0.3F, -0.7F, -2F, 0.3F, -0.7F, -2F, -1F, 0.8F, -5F, -1F, 0F, 4F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, -1F, 0F, 4F, -1F); // 89
        bodyModel[71].setRotationPoint(3F, -25F, 4F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,2.8F, 1.6F, -9.4F, -0.7F, -3.9F, -1.3F, -0.7F, -3.9F, 0.6F, 2.8F, 1.6F, 8.7F, 2.8F, -2.2F, -9.4F, -0.7F, 3.1F, -1.3F, -0.7F, 3.1F, 0.6F, 2.8F, -2.2F, 8.7F); // 90
        bodyModel[72].setRotationPoint(3F, -27F, -5F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.7F, -2F, 0.3F, 0.8F, -5F, 0.3F, 0.8F, -5F, -1F, -0.7F, -2F, -1F, 0F, 1F, 0.3F, 0F, 4F, 0.3F, 0F, 4F, -1F, 0F, 1F, -1F); // 91
        bodyModel[73].setRotationPoint(-12F, -25F, 4F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.5F, 0.3F, 2.8F, 1.6F, -0.7F, 2.8F, 1.6F, 0F, 0F, -1.5F, -1F, -0.7F, 0.5F, 0.3F, 2.8F, -2.2F, -0.7F, 2.8F, -2.2F, 0F, -0.7F, 0.5F, -1F); // 92
        bodyModel[74].setRotationPoint(-7F, -27F, 4F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.8F, -5F, -1F, -0.7F, -2F, -1F, -0.7F, -2F, 0.3F, 0.8F, -5F, 0.3F, 0F, 4F, -1F, 0F, 1F, -1F, 0F, 1F, 0.3F, 0F, 4F, 0.3F); // 93
        bodyModel[75].setRotationPoint(3F, -25F, -5F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.7F, -2F, -1F, 0.8F, -5F, -1F, 0.8F, -5F, 0.3F, -0.7F, -2F, 0.3F, 0F, 1F, -1F, 0F, 4F, -1F, 0F, 4F, 0.3F, 0F, 1F, 0.3F); // 95
        bodyModel[76].setRotationPoint(-12F, -25F, -5F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.8F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F); // 96
        bodyModel[77].setRotationPoint(-1F, -29F, -5F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.5F, -1F, -0.8F, -0.5F, -1F, -0.8F, 0.4F, -0.7F, 0.2F, 0.4F, -0.7F, 0.2F, 0.4F, 0F, -0.8F, 0.4F, 0F); // 98
        bodyModel[78].setRotationPoint(-1F, -31F, 4F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.8F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F); // 99
        bodyModel[79].setRotationPoint(-1F, -31F, -4F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.4F, -0.7F, 0.2F, -0.4F, -0.7F, 0.2F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, 0.4F, -0.7F, 0.2F, 0.4F, -0.7F, 0.2F, 0.4F, 0F, -0.8F, 0.4F, 0F); // 100
        bodyModel[80].setRotationPoint(-1F, -30F, 4F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, -0.7F, -0.8F, -0.4F, -0.7F, -0.8F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -0.7F, -0.8F, 0.4F, -0.7F); // 101
        bodyModel[81].setRotationPoint(-1F, -30F, -5F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.5F, -1F, 0.2F, -0.5F, -1F, 0.2F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -0.7F, -0.8F, 0.4F, -0.7F); // 102
        bodyModel[82].setRotationPoint(-1F, -31F, -5F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.8F, -0.9F, -0.3F, -1.3F, -0.9F, -0.3F, -1.3F, -0.9F, -0.3F, 0.8F, -0.9F, -0.3F, 0.8F, 0.1F, -0.3F, -1.3F, 0.1F, -0.3F, -1.3F, 0.1F, -0.3F, 0.8F, 0.1F, -0.3F); // 103
        bodyModel[83].setRotationPoint(-11F, -24F, -4F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1.3F, -0.9F, -0.3F, 0.8F, -0.9F, -0.3F, 0.8F, -0.9F, -0.3F, -1.3F, -0.9F, -0.3F, -1.3F, 0.1F, -0.3F, 0.8F, 0.1F, -0.3F, 0.8F, 0.1F, -0.3F, -1.3F, 0.1F, -0.3F); // 104
        bodyModel[84].setRotationPoint(10F, -24F, -4F);

        bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.9F, 0F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0.3F, -0.9F, -2.5F, 0.3F, -0.9F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, -0.9F, 0F, 0.3F); // Box 104
        bodyModel[85].setRotationPoint(23F, 4F, 8F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -0.1F, -0.25F, -0.4F, -0.1F, -0.25F, -0.4F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 104
        bodyModel[86].setRotationPoint(35F, 4F, 8F);

        bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.3F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, -0.3F, -1F, 0F, -1F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, -1F, 0F, -1F, -1F); // Box 124
        bodyModel[87].setRotationPoint(-9F, 7F, 7F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0.5F, 0.5F, -0.5F, -2.5F, 0.5F, -0.5F, -3F, 0F, -1F, 0F, 0F, -1F, 0.5F, -2.5F, -0.5F, -2.5F, -2.5F, -0.5F, -3F, -3F, -1F, 0F, -3F, -1F); // Box 124
        bodyModel[88].setRotationPoint(-12F, 6F, 8F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.3F, 0F, -5F, -0.3F, 0F, -5F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, -1F, 0F, -1F, -1F); // Box 124
        bodyModel[89].setRotationPoint(-14F, 7F, 7F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, -2F, -0.3F, 0F, -2F, -0.3F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, -2F, -1F, 0F, -2F, -1F, -1F, 0F, -1.5F, -1F); // Box 124
        bodyModel[90].setRotationPoint(-16F, 7F, 7F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, -2.5F, 0.5F, 0.5F, -2.5F, 0.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, -2.5F, 0.5F, -2.5F, -2.5F); // Box 124
        bodyModel[91].setRotationPoint(-12F, 6F, 7F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.3F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, -0.3F, -1F, 0F, -1F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, -1F, 0F, -1F, -1F); // Box 124
        bodyModel[92].setRotationPoint(14F, 7F, 7F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0.5F, 0.5F, -0.5F, -2.5F, 0.5F, -0.5F, -3F, 0F, -1F, 0F, 0F, -1F, 0.5F, -2.5F, -0.5F, -2.5F, -2.5F, -0.5F, -3F, -3F, -1F, 0F, -3F, -1F); // Box 124
        bodyModel[93].setRotationPoint(11F, 6F, 8F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.3F, 0F, -5F, -0.3F, 0F, -5F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, -1F, 0F, -1F, -1F); // Box 124
        bodyModel[94].setRotationPoint(9F, 7F, 7F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, -2F, -0.3F, 0F, -2F, -0.3F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, -2F, -1F, 0F, -2F, -1F, -1F, 0F, -1.5F, -1F); // Box 124
        bodyModel[95].setRotationPoint(7F, 7F, 7F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, -2.5F, 0.5F, 0.5F, -2.5F, 0.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, -2.5F, 0.5F, -2.5F, -2.5F); // Box 124
        bodyModel[96].setRotationPoint(11F, 6F, 7F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 28, 28, 0, 0F,0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, 0F, -21F, 0F); // Box 124
        bodyModel[97].setRotationPoint(-15F, 3F, 6F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 28, 28, 0, 0F,0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, 0F, -21F, 0F); // Box 124
        bodyModel[98].setRotationPoint(8F, 3F, 6F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.3F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, -1F, -2F, -1.5F, -1F, -2F, -1.5F, 0F, 0F, -1F, 0F); // Box 124
        bodyModel[99].setRotationPoint(-9F, 7F, -9F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.2F, 0F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 124
        bodyModel[100].setRotationPoint(-22F, 7F, -7F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -0.2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 124
        bodyModel[101].setRotationPoint(-20F, 6F, -7F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 124
        bodyModel[102].setRotationPoint(-18F, 4F, -7F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 124
        bodyModel[103].setRotationPoint(-18F, 7F, -7F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 124
        bodyModel[104].setRotationPoint(-16F, 4F, -7F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, -1F, -3F, 0F, -1F, -2.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, -3F, -1F, -3F, -3F, -1F, -2.5F, -2.5F, -0.5F, 0.5F, -2.5F, -0.5F); // Box 124
        bodyModel[105].setRotationPoint(-12F, 6F, -10F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.3F, -1F, -5F, -0.3F, -1F, -5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, -1F, -5F, -1F, -1F, -5F, -1F, 0F, 0F, -1F, 0F); // Box 124
        bodyModel[106].setRotationPoint(-14F, 7F, -9F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -1F, -2F, -0.3F, -1F, -2F, -0.3F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, -2F, -1F, -1F, -2F, -1F, 0F, 0F, -1.5F, 0F); // Box 124
        bodyModel[107].setRotationPoint(-16F, 7F, -9F);

        bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0.5F, 0.5F, -2.5F, -2.5F, 0.5F, -2.5F, -2.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -2.5F, -2.5F, -2.5F, -2.5F, -2.5F, -2.5F, -2.5F, 0F, 0.5F, -2.5F, 0F); // Box 124
        bodyModel[108].setRotationPoint(-12F, 6F, -11F);

        bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 124
        bodyModel[109].setRotationPoint(1F, 4F, -7F);

        bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F); // Box 124
        bodyModel[110].setRotationPoint(-5F, 4F, -7F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -2F, -4.5F, 0F); // Box 124
        bodyModel[111].setRotationPoint(3F, 4F, -7F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-2F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, 0.8F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 124
        bodyModel[112].setRotationPoint(18F, 7F, -7F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,-2F, 2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, 2F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F); // Box 124
        bodyModel[113].setRotationPoint(16F, 6F, -7F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F,-2F, 0.8F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -2F, 0.8F, 0F, -2F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -2F, -1F, 0F); // Box 124
        bodyModel[114].setRotationPoint(20F, 8F, -7F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 124
        bodyModel[115].setRotationPoint(16F, 4F, -7F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 124
        bodyModel[116].setRotationPoint(16F, 7F, -7F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 124
        bodyModel[117].setRotationPoint(7F, 4F, -7F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.3F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, -1F, -2F, -1.5F, -1F, -2F, -1.5F, 0F, 0F, -1F, 0F); // Box 124
        bodyModel[118].setRotationPoint(14F, 7F, -9F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, -1F, -3F, 0F, -1F, -2.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, -3F, -1F, -3F, -3F, -1F, -2.5F, -2.5F, -0.5F, 0.5F, -2.5F, -0.5F); // Box 124
        bodyModel[119].setRotationPoint(11F, 6F, -10F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.3F, -1F, -5F, -0.3F, -1F, -5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, -1F, -5F, -1F, -1F, -5F, -1F, 0F, 0F, -1F, 0F); // Box 124
        bodyModel[120].setRotationPoint(9F, 7F, -9F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -1F, -2F, -0.3F, -1F, -2F, -0.3F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, -2F, -1F, -1F, -2F, -1F, 0F, 0F, -1.5F, 0F); // Box 124
        bodyModel[121].setRotationPoint(7F, 7F, -9F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0.5F, 0.5F, -2.5F, -2.5F, 0.5F, -2.5F, -2.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -2.5F, -2.5F, -2.5F, -2.5F, -2.5F, -2.5F, -2.5F, 0F, 0.5F, -2.5F, 0F); // Box 124
        bodyModel[122].setRotationPoint(11F, 6F, -11F);

        bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 9, 14, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F); // Box 124
        bodyModel[123].setRotationPoint(-1F, 4F, -7F);

        bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 124
        bodyModel[124].setRotationPoint(-3F, 8F, -7F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 124
        bodyModel[125].setRotationPoint(1F, 8F, -7F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 124
        bodyModel[126].setRotationPoint(5F, 8F, -7F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 124
        bodyModel[127].setRotationPoint(-3F, 4F, -7F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -2F, -4.5F, 0F, -2F, -4.5F, 0F, 0F, -2.5F, 0F); // Box 124
        bodyModel[128].setRotationPoint(-7F, 4F, -7F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 28, 28, 0, 0F,0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, 0F, -21F, 0F); // Box 124
        bodyModel[129].setRotationPoint(-15F, 3F, -6F);

        bodyModel[130].addShapeBox(0F, 0F, 0F, 28, 28, 0, 0F,0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -21F, -21F, 0F, -21F, -21F, 0F, 0F, -21F, 0F); // Box 124
        bodyModel[130].setRotationPoint(8F, 3F, -6F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, -2.5F, 0F, 0.1F, -2.5F, 0F, 0.1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, -0.5F, -1F, -0.1F, -0.5F); // Box 104
        bodyModel[131].setRotationPoint(31F, 4F, -9F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.9F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1F, -0.9F, 0F, -1F); // Box 104
        bodyModel[132].setRotationPoint(23F, 4F, -9F);

        bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-1.2F, 0.1F, -0.7F, 0.5F, 0.1F, -0.7F, 0.8F, 0.1F, -0.3F, -1.5F, 0.1F, -0.3F, -1.2F, -1.7F, -0.7F, 0.5F, -1.7F, -0.7F, 0.8F, -1.7F, -0.3F, -1.5F, -1.7F, -0.3F); // Box 104
        bodyModel[133].setRotationPoint(-44F, 4F, 0F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, -0.3F, -2.4F, 0.5F, -3.5F, -2.4F, 0.5F, -3.6F, 0F, -1.1F, 0F, 0F, -1.1F, -0.3F, -2.4F, -1.1F, -3.5F, -2.4F, -1.1F, -3.6F); // Box 104
        bodyModel[134].setRotationPoint(-32F, 7F, 9F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, -1F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -2F, 0F, -1F, -2F); // Box 104
        bodyModel[135].setRotationPoint(-41F, 4F, -9F);

        bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, -2F, 0.5F, 0F, -2F, 0F, -1F, 0F, -2.5F, -1F, 0F, -3F, -1F, -2F, 0.5F, -1F, -2F); // Box 104
        bodyModel[136].setRotationPoint(-41F, 4F, -7F);

        bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 2, 20, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -10F, -0.5F, 0F, -10F, -0.5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -10F, -0.5F, -1F, -10F); // Box 104
        bodyModel[137].setRotationPoint(-42F, 4F, -5F);

        bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, -1F, 0.3F, -0.5F, -1F, 0.3F, -0.5F, -1F, -0.7F, -0.5F, -1F, -0.7F); // Box 104
        bodyModel[138].setRotationPoint(-43F, 4F, 0F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-1.2F, 0.1F, 0.7F, 0.5F, 0.1F, 0.7F, 0.5F, 0.1F, -1.3F, -1.2F, 0.1F, -1.3F, -1.2F, -1.7F, 0.7F, 0.5F, -1.7F, 0.7F, 0.5F, -1.7F, -1.3F, -1.2F, -1.7F, -1.3F); // Box 104
        bodyModel[139].setRotationPoint(-44F, 4F, 0F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.1F, 0F, -0.75F, -1.4F, 0F, -0.75F, -1.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -1F, -0.9F, -1.4F, -1F, -0.9F, -1.4F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F); // Box 104
        bodyModel[140].setRotationPoint(-30F, 4F, -9F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0.7F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.7F, -8F, -0.5F, 0F, -8F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 104
        bodyModel[141].setRotationPoint(-32F, 4F, 7F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -3F, 0F, 0F, -3F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -3F, 0F, -5F, -3F); // Box 104
        bodyModel[142].setRotationPoint(-24F, 4F, -9F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0.5F, 0.7F, -8F, 0.5F, 0F, -8F, 0.5F, -0.7F, 0F, 0.5F, -1.4F, 0F, -2.5F, 0.7F, -8F, -2.5F, 0F, -8F, -2.5F, -0.7F, 0F, -2.5F, -1.4F); // Box 104
        bodyModel[143].setRotationPoint(-32F, 5F, 7F);

        bodyModel[144].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0.5F, 0.7F, -8F, 0.5F, 0F, -8F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0F, -1.1F, 0.7F, -8F, -1.1F, 0F, -8F, -1.1F, 0.3F, 0F, -1.1F, 0F); // Box 104
        bodyModel[144].setRotationPoint(-32F, 7F, 7F);

        bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,-0.5F, 0F, 0F, -5.6F, 0F, 0F, -5.6F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -5.6F, -1F, 0F, -5.6F, -1F, -1F, -0.5F, -1F, -1F); // Box 104
        bodyModel[145].setRotationPoint(-40F, 4F, -9F);

        bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -2.5F, 0.3F, -0.9F, -2.5F, 0.3F, -0.9F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, 0F, -1F, 0F, 0F, -1F); // Box 104
        bodyModel[146].setRotationPoint(-24F, 4F, -9F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.25F, -0.4F, -0.1F, -0.25F); // Box 104
        bodyModel[147].setRotationPoint(-36F, 4F, -9F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-0.4F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.3F, -0.4F, 0F, -2.3F, -0.4F, -3.1F, 0.25F, -0.5F, -3.1F, 0.25F, -0.5F, -3.1F, -2.3F, -0.4F, -3.1F, -2.3F); // Box 104
        bodyModel[148].setRotationPoint(-36F, 4F, -8F);

        bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -2.5F, 0F, 0.1F, -2.5F, 0F, 0.1F, -0.1F, -0.5F, -1F, -0.1F, -0.5F, -1F, -0.1F, 0F, 0.1F, -0.1F, 0F); // Box 104
        bodyModel[149].setRotationPoint(-32F, 4F, 8F);

        bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, -2.1F, -0.3F, -1F, -2.1F, -0.3F, -1F, -2.1F, -1.5F, 0.1F, -2.1F, -1.5F); // Box 104
        bodyModel[150].setRotationPoint(-32F, 4F, 6F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -3F, 0F, 0F, -3F, 0F, -5F, 0F, -0.9F, -5F, 0F, -0.9F, -5F, -3F, 0F, -5F, -3F); // Box 104
        bodyModel[151].setRotationPoint(-24F, 4F, 6F);

        bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 104
        bodyModel[152].setRotationPoint(-24F, 4F, 8F);

        bodyModel[153].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0.5F, 0.5F, -1.4F, -11F, 0.5F, -0.7F, -11F, 0.5F, 0F, 0.5F, 0.5F, 0.7F, 0.5F, -2.5F, -1.4F, -11F, -2.5F, -0.7F, -11F, -2.5F, 0F, 0.5F, -2.5F, 0.7F); // Box 104
        bodyModel[153].setRotationPoint(-35F, 5F, -8F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0.5F, 0F, -0.75F, -11F, 0F, 0F, -11F, 0F, 0F, 0.5F, 0F, 0.7F, 0.5F, -0.5F, -0.75F, -11F, -0.5F, 0F, -11F, -0.5F, 0F, 0.5F, -0.5F, 0.7F); // Box 104
        bodyModel[154].setRotationPoint(-35F, 4F, -8F);

        bodyModel[155].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,0.5F, 0.5F, 0F, -11F, 0.5F, 0.3F, -11F, 0.5F, -2F, 0.5F, 0.5F, -1.3F, 0.5F, -1.1F, 0F, -11F, -1.1F, 0.3F, -11F, -1.1F, -2F, 0.5F, -1.1F, -1.3F); // Box 104
        bodyModel[155].setRotationPoint(-35F, 7F, -9F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,-2.4F, 0.5F, -1.6F, -2.4F, 0.5F, -1.5F, 0F, 0.5F, -2.3F, 0.5F, 0.5F, -2F, -2.4F, -1.1F, -1.6F, -2.4F, -1.1F, -1.5F, 0F, -1.1F, -2.3F, 0.5F, -1.1F, -2F); // Box 104
        bodyModel[156].setRotationPoint(-35F, 7F, -11F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.2F, 0F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 124
        bodyModel[157].setRotationPoint(-22F, 7F, 6F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -0.2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 124
        bodyModel[158].setRotationPoint(-20F, 6F, 6F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 124
        bodyModel[159].setRotationPoint(-18F, 4F, 6F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 124
        bodyModel[160].setRotationPoint(-16F, 4F, 6F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 124
        bodyModel[161].setRotationPoint(1F, 4F, 6F);

        bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F); // Box 124
        bodyModel[162].setRotationPoint(-5F, 4F, 6F);

        bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -2F, -4.5F, 0F); // Box 124
        bodyModel[163].setRotationPoint(3F, 4F, 6F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-2F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, 0.8F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 124
        bodyModel[164].setRotationPoint(18F, 7F, 6F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,-2F, 2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, 2F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F); // Box 124
        bodyModel[165].setRotationPoint(16F, 6F, 6F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 124
        bodyModel[166].setRotationPoint(16F, 4F, 6F);

        bodyModel[167].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F); // Box 124
        bodyModel[167].setRotationPoint(7F, 4F, 6F);

        bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 124
        bodyModel[168].setRotationPoint(-7F, 8F, -7F);

        bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 124
        bodyModel[169].setRotationPoint(-3F, 8F, 6F);

        bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 124
        bodyModel[170].setRotationPoint(1F, 8F, 6F);

        bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 124
        bodyModel[171].setRotationPoint(-3F, 4F, 6F);

        bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -2F, -4.5F, 0F, -2F, -4.5F, 0F, 0F, -2.5F, 0F); // Box 124
        bodyModel[172].setRotationPoint(-7F, 4F, 6F);

        bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F); // Box 124
        bodyModel[173].setRotationPoint(3F, 4F, -7F);

        bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F); // Box 124
        bodyModel[174].setRotationPoint(3F, 4F, 6F);

        bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F,-0.1F, 0.3F, 0F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, -0.1F, 0.3F, 0F, -0.1F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -0.1F, -1F, 0F); // Box 124
        bodyModel[175].setRotationPoint(-24F, 8F, -7F);

        bodyModel[176].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.5F, -0.5F, -0.9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F); // Box 260
        bodyModel[176].setRotationPoint(-40F, 3F, 5F);

        bodyModel[177].addShapeBox(0F, 0F, 0F, 48, 1, 18, 0F,0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        bodyModel[177].setRotationPoint(-24F, 3F, -9F);

        bodyModel[178].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        bodyModel[178].setRotationPoint(-40F, 3F, -5F);

        bodyModel[179].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 260
        bodyModel[179].setRotationPoint(-32F, 3F, 5F);

        bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,-0.5F, -0.9F, 0F, -0.5F, -0.9F, 0.25F, -0.5F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 260
        bodyModel[180].setRotationPoint(-40F, 3F, -8F);

        bodyModel[181].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,-0.5F, -0.9F, -0.8F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 260
        bodyModel[181].setRotationPoint(-36F, 3F, -8F);

        bodyModel[182].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.9F, -0.5F, -0.5F, -0.9F, -1F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        bodyModel[182].setRotationPoint(32F, 3F, -9F);

        bodyModel[183].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        bodyModel[183].setRotationPoint(24F, 3F, -5F);

        bodyModel[184].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.9F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
        bodyModel[184].setRotationPoint(24F, 3F, -8F);

        bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,-0.5F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F); // Box 260
        bodyModel[185].setRotationPoint(35F, 3F, 5F);

        bodyModel[186].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.8F, 0F, -0.9F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, 0F); // Box 260
        bodyModel[186].setRotationPoint(24F, 3F, 5F);

        bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.4F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.4F, 0.5F); // Box 241
        bodyModel[187].setRotationPoint(-41F, 0F, -1F);

        bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.9F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
        bodyModel[188].setRotationPoint(-41F, 0F, 0F);

        bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.4F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 241
        bodyModel[189].setRotationPoint(-41F, 2F, -1F);

        bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F); // Box 241
        bodyModel[190].setRotationPoint(-41F, 1F, -1F);

        bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
        bodyModel[191].setRotationPoint(-41F, 1F, 0F);

        bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.9F); // Box 259
        bodyModel[192].setRotationPoint(-41F, 0F, -1F);

        bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 260
        bodyModel[193].setRotationPoint(-41F, 2F, 0F);

        bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.9F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -0.6F, -0.5F); // Box 261
        bodyModel[194].setRotationPoint(-41F, 2F, -1F);

        bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.2F, -0.2F, 0.15F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0.15F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.2F, -0.2F); // Box 262
        bodyModel[195].setRotationPoint(-41F, 3F, -6F);

        bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.2F, -0.2F, 0F, 0F, 0F, 0.15F, 0F, 0F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, 0F, 0F, 0.15F, 0F, 0F, -0.8F, -0.2F, -0.2F); // Box 251
        bodyModel[196].setRotationPoint(-41F, 3F, 5F);

        bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.2F, -0.5F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0.4F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, -0.5F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0.4F, -0.8F, -0.2F, 0.1F); // Box 253
        bodyModel[197].setRotationPoint(-41F, -1F, -2F);

        bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.2F, 0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, -0.2F, -0.8F, -0.2F, -0.5F, -0.8F, -0.2F, 0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, -0.2F, -0.8F, -0.2F, -0.5F); // Box 251
        bodyModel[198].setRotationPoint(-41F, -1F, 1F);

        bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.3F, 0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.7F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F, 0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.7F, -0.6F, -0.3F, -0.8F); // Box 255
        bodyModel[199].setRotationPoint(-41F, -4F, 1F);

        bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -1.15F, 1.4F, -0.55F, -1.15F, 1.4F, -0.5F, -0.4F, -2.1F, -0.35F, -0.4F, -2.1F, -0.3F, 0.25F, 1.3F, -0.55F, 0.25F, 1.3F, -0.5F, -0.6F, -1.9F, -0.35F, -0.6F, -1.9F); // Box 255
        bodyModel[200].setRotationPoint(-41F, -3F, 1F);

        bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.1F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.8F, -0.1F, -0.6F, -0.8F, -0.1F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.8F, -0.1F, -0.6F); // Box 255
        bodyModel[201].setRotationPoint(-41F, -4F, 0F);

        bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.3F, -0.8F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, -0.8F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, -0.6F, -0.3F, 0.2F); // Box 258
        bodyModel[202].setRotationPoint(-41F, 1F, -1F);

        bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.6F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0.2F, -0.5F, -0.6F, 0.2F, -0.6F, -0.3F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0.2F, -0.6F, -0.3F, 0.2F); // Box 258
        bodyModel[203].setRotationPoint(-41F, -4F, -1F);

        bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, -0.1F, 0.1F, 0.1F, 0F, 0.2F, 0F, 0F, -0.2F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, 0.1F, 0.1F, 0F, 0.2F, 0F, 0F, -0.2F, -0.8F, -0.1F, -0.3F); // Box 255
        bodyModel[204].setRotationPoint(-41F, -4F, -5F);

        bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.3F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.6F, -0.3F, -0.5F, -0.6F, -0.3F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.6F, -0.3F, -0.5F); // Box 255
        bodyModel[205].setRotationPoint(-41F, -4F, -5F);

        bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.4F, -0.5F, -0.2F, -0.4F, -0.6F, -0.35F, -0.4F, 0.1F, -0.5F, -0.4F, 0F, -0.6F, -0.4F, -0.5F, -0.2F, -0.4F, -0.6F, -0.35F, -0.4F, 0.1F, -0.5F, -0.4F, 0F); // Box 255
        bodyModel[206].setRotationPoint(-41F, -4F, -5F);

        bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.4F, 0F, -0.35F, -0.4F, -0.1F, -0.45F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.5F, -0.4F, 0F, -0.35F, -0.4F, -0.1F, -0.45F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F); // Box 255
        bodyModel[207].setRotationPoint(-41F, -4F, -4F);

        bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.25F, 0.4F, -0.45F, 0.25F, 0.4F, -0.55F, -0.75F, -0.6F, -0.3F, -0.75F, -0.6F, -0.4F, -1.1F, 0.5F, -0.45F, -1.1F, 0.5F, -0.55F, -0.1F, -0.7F, -0.3F, -0.1F, -0.7F); // Box 255
        bodyModel[208].setRotationPoint(-41F, -3F, -3F);

        bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.25F, 0.6F, -0.55F, 0.25F, 0.6F, -0.55F, -0.35F, -0.8F, -0.3F, -0.35F, -0.8F, -0.3F, -1.1F, 0.7F, -0.55F, -1.1F, 0.7F, -0.55F, -0.5F, -0.9F, -0.3F, -0.5F, -0.9F); // Box 255
        bodyModel[209].setRotationPoint(-41F, -2F, -2F);

        bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, 0.8F, -0.55F, -0.35F, 0.8F, -0.55F, -0.55F, -1.1F, -0.3F, -0.55F, -1.1F, -0.3F, -0.5F, 0.9F, -0.55F, -0.5F, 0.9F, -0.55F, -0.3F, -1.1F, -0.3F, -0.3F, -1.1F); // Box 255
        bodyModel[210].setRotationPoint(-41F, -2F, -1F);

        bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.55F, 1.1F, -0.55F, -0.55F, 1.1F, -0.55F, -0.15F, -1.4F, -0.3F, -0.15F, -1.4F, -0.3F, -0.3F, 1.1F, -0.55F, -0.3F, 1.1F, -0.55F, -0.75F, -1.3F, -0.3F, -0.75F, -1.3F); // Box 255
        bodyModel[211].setRotationPoint(-41F, -2F, 0F);

        bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.3F, -0.8F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, -0.8F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, -0.6F, -0.3F, 0.2F); // Box 258
        bodyModel[212].setRotationPoint(-41F, -4F, -2F);

        bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.8F, 0F, -0.3F, -1.2F, 0F, -0.3F, -1F, 0F, -1F, 1F, 0F, -1F, 0.8F, -2F, -0.3F, -1.2F, -2F, -0.3F, -1F, -2F, -1F, 1F, -2F, -1F); // Box 270
        bodyModel[213].setRotationPoint(22F, -11F, -10F);

        bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.3F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.3F, -2F, -0.3F, -0.7F, -2F, -0.3F, -0.5F, -2F, -1F, 0.5F, -2F, -1F); // Box 270
        bodyModel[214].setRotationPoint(-22F, -11F, -10F);

        bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1.2F, 0F, -1.3F, 0.8F, 0F, -1.3F, 1F, -2F, 0F, -1F, -2F, 0F, -1.2F, -2F, -1.3F, 0.8F, -2F, -1.3F); // Box 272
        bodyModel[215].setRotationPoint(22F, -11F, 9F);

        bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, -1.3F, 0.3F, 0F, -1.3F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.7F, -2F, -1.3F, 0.3F, -2F, -1.3F); // Box 273
        bodyModel[216].setRotationPoint(-22F, -11F, 9F);

        bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.5F, 0F, 0.5F, -1F); // Box 274
        bodyModel[217].setRotationPoint(40F, 0F, 0F);

        bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.6F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0.5F, 0F); // Box 275
        bodyModel[218].setRotationPoint(40F, 0F, -1F);

        bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 276
        bodyModel[219].setRotationPoint(40F, 2F, 0F);

        bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
        bodyModel[220].setRotationPoint(40F, 1F, 0F);

        bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -0.5F, 0F); // Box 278
        bodyModel[221].setRotationPoint(40F, 1F, -1F);

        bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.5F, 0F, 0F, -0.6F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
        bodyModel[222].setRotationPoint(40F, 0F, 0F);

        bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.6F, -0.5F, 0F, -1.5F, 0F); // Box 280
        bodyModel[223].setRotationPoint(40F, 2F, -1F);

        bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.6F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 281
        bodyModel[224].setRotationPoint(40F, 2F, 0F);

        bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0.15F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0.15F, 0F, 0F); // Box 282
        bodyModel[225].setRotationPoint(40F, 3F, 5F);

        bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.15F, 0F, 0F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, 0F, 0F, 0.15F, 0F, 0F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 283
        bodyModel[226].setRotationPoint(40F, 3F, -6F);

        bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0.4F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, -0.5F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0.4F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, -0.5F, 0F, 0.1F, -0.2F); // Box 284
        bodyModel[227].setRotationPoint(40F, -1F, 1F);

        bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.2F, -0.8F, -0.2F, -0.5F, -0.8F, -0.2F, 0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, -0.2F, -0.8F, -0.2F, -0.5F, -0.8F, -0.2F, 0.1F, 0F, 0.1F, 0.4F); // Box 285
        bodyModel[228].setRotationPoint(40F, -1F, -2F);

        bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.7F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F, 0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.7F, -0.6F, -0.3F, -0.8F, -0.6F, -0.3F, 0.2F, 0F, -0.2F, 0.3F); // Box 286
        bodyModel[229].setRotationPoint(40F, -4F, -2F);

        bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.4F, -2.1F, -0.35F, -0.4F, -2.1F, -0.3F, -1.15F, 1.4F, -0.55F, -1.15F, 1.4F, -0.5F, -0.6F, -1.9F, -0.35F, -0.6F, -1.9F, -0.3F, 0.25F, 1.3F, -0.55F, 0.25F, 1.3F); // Box 287
        bodyModel[230].setRotationPoint(40F, -3F, -2F);

        bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.8F, -0.1F, -0.6F, -0.8F, -0.1F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.8F, -0.1F, -0.6F, -0.8F, -0.1F, 0.4F, 0F, 0F, 0.5F); // Box 288
        bodyModel[231].setRotationPoint(40F, -4F, -1F);

        bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.3F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, -0.8F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, -0.8F, 0F, -0.2F, -0.7F); // Box 289
        bodyModel[232].setRotationPoint(40F, 1F, 0F);

        bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.6F, 0.1F, -0.35F, -1.4F, 0.1F, -0.35F, -1.4F, -0.9F, -0.5F, -0.6F, -0.9F, -0.4F, -0.3F, 0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.4F, -0.9F, -0.4F, -0.3F, -0.9F); // Box 290
        bodyModel[233].setRotationPoint(40F, -4F, 0F);

        bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.5F, -0.6F, 0.2F, -0.5F, -0.6F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, -0.8F, -0.2F, -0.2F, -0.8F); // Box 291
        bodyModel[234].setRotationPoint(40F, -4F, 0F);

        bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, 0.1F, 0.1F, 0F, 0.2F, 0F, 0F, -0.2F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, 0.1F, 0.1F, 0F, 0.2F); // Box 292
        bodyModel[235].setRotationPoint(40F, -4F, 4F);

        bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.4F, -0.6F, -0.3F, -0.5F, -0.6F, -0.3F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.6F, -0.3F, -0.5F, -0.6F, -0.3F, -0.1F, -0.2F, -0.2F, 0F); // Box 293
        bodyModel[236].setRotationPoint(40F, -4F, 4F);

        bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, 0.1F, -0.5F, -0.4F, 0F, -0.6F, -0.4F, -0.5F, -0.2F, -0.4F, -0.6F, -0.35F, -0.4F, 0.1F, -0.5F, -0.4F, 0F, -0.6F, -0.4F, -0.5F, -0.2F, -0.4F, -0.6F); // Box 294
        bodyModel[237].setRotationPoint(40F, -4F, 4F);

        bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.5F, -0.4F, 0F, -0.35F, -0.4F, -0.1F, -0.45F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.5F, -0.4F, 0F, -0.35F, -0.4F, -0.1F); // Box 295
        bodyModel[238].setRotationPoint(40F, -4F, 3F);

        bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.75F, -0.6F, -0.3F, -0.75F, -0.6F, -0.4F, 0.25F, 0.4F, -0.45F, 0.25F, 0.4F, -0.55F, -0.1F, -0.7F, -0.3F, -0.1F, -0.7F, -0.4F, -1.1F, 0.5F, -0.45F, -1.1F, 0.5F); // Box 296
        bodyModel[239].setRotationPoint(40F, -3F, 2F);

        bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.35F, -0.8F, -0.3F, -0.35F, -0.8F, -0.3F, 0.25F, 0.6F, -0.55F, 0.25F, 0.6F, -0.55F, -0.5F, -0.9F, -0.3F, -0.5F, -0.9F, -0.3F, -1.1F, 0.7F, -0.55F, -1.1F, 0.7F); // Box 297
        bodyModel[240].setRotationPoint(40F, -2F, 1F);

        bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.55F, -1.1F, -0.3F, -0.55F, -1.1F, -0.3F, -0.35F, 0.8F, -0.55F, -0.35F, 0.8F, -0.55F, -0.3F, -1.1F, -0.3F, -0.3F, -1.1F, -0.3F, -0.5F, 0.9F, -0.55F, -0.5F, 0.9F); // Box 298
        bodyModel[241].setRotationPoint(40F, -2F, 0F);

        bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.55F, -0.15F, -1.4F, -0.3F, -0.15F, -1.4F, -0.3F, -0.55F, 1.1F, -0.55F, -0.55F, 1.1F, -0.55F, -0.75F, -1.3F, -0.3F, -0.75F, -1.3F, -0.3F, -0.3F, 1.1F, -0.55F, -0.3F, 1.1F); // Box 299
        bodyModel[242].setRotationPoint(40F, -2F, -1F);

        bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, 0.3F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, -0.8F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, -0.8F, 0F, -0.2F, -0.7F); // Box 300
        bodyModel[243].setRotationPoint(40F, -4F, 1F);

        bodyModel[244].addShapeBox(0F, 0F, 0F, 16, 36, 0, 0F,-8F, 0F, 0.5F, -0.5F, 0F, 0F, -0.6F, 0F, 0.1F, -8.1F, 0F, -0.4F, -8F, -18F, 0.5F, -0.5F, -18F, 0F, -0.6F, -18.1F, 0.1F, -8.1F, -18F, -0.4F); // Box 301
        bodyModel[244].setRotationPoint(24F, -14F, -8F);

        bodyModel[245].addShapeBox(0F, 0F, 0F, 0, 36, 6, 0F,0.6F, 0F, -3.1F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.6F, -18F, -3.1F, -0.5F, -18F, -3F, 0F, -18F, 0F, 0.1F, -18F, 0F); // Box 302
        bodyModel[245].setRotationPoint(40F, -14F, -11F);

        bodyModel[246].addShapeBox(0F, 0F, -6F, 0, 36, 6, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, 0.6F, 0F, -3.1F, 0.1F, -18F, 0F, 0F, -18F, 0F, -0.5F, -18F, -3F, 0.6F, -18F, -3.1F); // Box 303
        bodyModel[246].setRotationPoint(40F, -14F, 11F);

        bodyModel[247].addShapeBox(0F, 0F, 0F, 0, 36, 2, 0F,0F, 0F, 0.5F, 0.1F, 0F, 0.4F, 0.1F, 0F, -1.4F, 0F, 0F, -1.5F, 0F, -18F, 0.5F, 0.1F, -18F, 0.4F, 0.1F, -18F, -1.4F, 0F, -18F, -1.5F); // Box 304
        bodyModel[247].setRotationPoint(32F, -14F, -8F);

        bodyModel[248].addShapeBox(0F, 0F, 0F, 16, 36, 0, 0F,-8F, 0F, 1F, 0F, 0F, 0.5F, 0.1F, 0F, -0.4F, -7.9F, 0F, -0.9F, -8F, -18F, 1F, 0F, -18F, 0.5F, 0.1F, -18F, -0.4F, -7.9F, -18F, -0.9F); // Box 305
        bodyModel[248].setRotationPoint(16F, -14F, -7F);

        bodyModel[249].addShapeBox(0F, 0F, 0F, 0, 36, 2, 0F,0.1F, 0F, 0.9F, 0F, 0F, 1F, 0F, 0F, -2F, 0.1F, 0F, -1.9F, 0.1F, -18F, 0.9F, 0F, -18F, 1F, 0F, -18F, -2F, 0.1F, -18F, -1.9F); // Box 306
        bodyModel[249].setRotationPoint(24F, -14F, -8F);

        bodyModel[250].addShapeBox(0F, 0F, 0F, 0, 36, 2, 0F,0.1F, 0F, -1.9F, 0F, 0F, -2F, 0F, 0F, 1F, 0.1F, 0F, 0.9F, 0.1F, -18F, -1.9F, 0F, -18F, -2F, 0F, -18F, 1F, 0.1F, -18F, 0.9F); // Box 307
        bodyModel[250].setRotationPoint(24F, -14F, 6F);

        bodyModel[251].addShapeBox(0F, 0F, 0F, 8, 36, 0, 0F,0.4F, 0F, -0.15F, -4.6F, 0F, 0.1F, -4.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.4F, -18F, -0.15F, -4.6F, -18F, 0.1F, -4.5F, -18F, 0F, 0.5F, -18F, 0.25F); // Box 308
        bodyModel[251].setRotationPoint(36F, -14F, 8F);

        bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 36, 20, 0F,0.1F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -18F, -10F, 0F, -18F, -10F, 0F, -18F, 0F, 0.1F, -18F, 0F); // Box 309
        bodyModel[252].setRotationPoint(40F, -14F, -15F);

        bodyModel[253].addShapeBox(0F, 0F, 0F, 23, 36, 0, 0F,0.1F, 0F, -0.9F, -11.4F, 0F, -0.15F, -11.5F, 0F, 0.25F, 0F, 0F, 1F, 0.1F, -18F, -0.9F, -11.4F, -18F, -0.15F, -11.5F, -18F, 0.25F, 0F, -18F, 1F); // Box 310
        bodyModel[253].setRotationPoint(24F, -14F, 7F);

        bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 36, 2, 0F,0.5F, 0F, -0.25F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.85F, 0.5F, 0F, -0.75F, 0.5F, -18F, -0.25F, -0.4F, -18F, -0.15F, -0.4F, -18F, -0.85F, 0.5F, -18F, -0.75F); // Box 311
        bodyModel[254].setRotationPoint(36F, -14F, 7F);

        bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -2.4F, -0.4F, 0F, -2.4F, -0.4F, 0F, 1.6F, -0.4F, 0F, 1.6F); // Box 312
        bodyModel[255].setRotationPoint(-39F, -21F, -3F);

        bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.6F, 0F, -0.4F, 0F, -1F, 0F, 0F, -1F, -0.8F, -0.6F, 0F, -0.4F, -0.6F, 0F, -1.4F, 0F, 1F, -0.7F, 0F, 1F, -0.1F, -0.6F, 0F, 0.6F); // Box 312
        bodyModel[256].setRotationPoint(-39F, -21F, -3F);

        bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, -1.7F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, 0.6F, 0F, 0F, 0.9F); // Box 312
        bodyModel[257].setRotationPoint(-37F, -20F, -4F);

        bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 1.6F, -0.4F, 0F, 1.6F, -0.4F, 0F, -2.4F, -0.4F, 0F, -2.4F); // Box 317
        bodyModel[258].setRotationPoint(-39F, -21F, 2F);

        bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.6F, 0F, -0.4F, 0F, -1F, -0.8F, 0F, -1F, 0F, -0.6F, 0F, -0.4F, -0.6F, 0F, 0.6F, 0F, 1F, -0.1F, 0F, 1F, -0.7F, -0.6F, 0F, -1.4F); // Box 318
        bodyModel[259].setRotationPoint(-39F, -21F, 2F);

        bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.2F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0.9F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, -1.4F, 0F, 0F, -1.7F); // Box 319
        bodyModel[260].setRotationPoint(-37F, -20F, 3F);

        bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -2.4F, -0.4F, 0F, -2.4F, -0.4F, 0F, 1.6F, -0.4F, 0F, 1.6F); // Box 312
        bodyModel[261].setRotationPoint(38F, -21F, -3F);

        bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.6F, 0F, -0.4F, 0F, -1F, 0F, 0F, -1F, -0.8F, -0.6F, 0F, -0.4F, -0.6F, 0F, -1.4F, 0F, 1F, -0.7F, 0F, 1F, -0.1F, -0.6F, 0F, 0.6F); // Box 312
        bodyModel[262].setRotationPoint(38F, -21F, -3F);

        bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, -1.7F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, 0.6F, 0F, 0F, 0.9F); // Box 312
        bodyModel[263].setRotationPoint(40F, -20F, -4F);

        bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 1.6F, -0.4F, 0F, 1.6F, -0.4F, 0F, -2.4F, -0.4F, 0F, -2.4F); // Box 317
        bodyModel[264].setRotationPoint(38F, -21F, 2F);

        bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.6F, 0F, -0.4F, 0F, -1F, -0.8F, 0F, -1F, 0F, -0.6F, 0F, -0.4F, -0.6F, 0F, 0.6F, 0F, 1F, -0.1F, 0F, 1F, -0.7F, -0.6F, 0F, -1.4F); // Box 318
        bodyModel[265].setRotationPoint(38F, -21F, 2F);

        bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.2F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0.9F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, -1.4F, 0F, 0F, -1.7F); // Box 319
        bodyModel[266].setRotationPoint(40F, -20F, 3F);

        bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -5F, -1F, 2F, -2.5F, -1F, 2F, -2.5F, 0.3F, 0F, -5F, 0.3F, -0.7F, 4F, -1F, 2.7F, 1.5F, -1F, 2.7F, 1.5F, 0.3F, -0.7F, 4F, 0.3F); // Box 329
        bodyModel[267].setRotationPoint(-12F, -28F, -5F);

        bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.5F, -1F, 2.8F, 1.6F, 0F, 2.8F, 1.6F, -0.7F, 0F, -1.5F, 0.3F, -0.7F, 0.5F, -1F, 2.8F, -2.2F, 0F, 2.8F, -2.2F, -0.7F, -0.7F, 0.5F, 0.3F); // Box 330
        bodyModel[268].setRotationPoint(-7F, -27F, -5F);

        bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -5F, 0.3F, 2F, -2.5F, 0.3F, 2F, -2.5F, -1F, 0F, -5F, -1F, -0.7F, 4F, 0.3F, 2.7F, 1.5F, 0.3F, 2.7F, 1.5F, -1F, -0.7F, 4F, -1F); // 90
        bodyModel[269].setRotationPoint(-12F, -28F, 4F);

        bodyModel[270].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.7F, -3.9F, 0.6F, 2.8F, 1.6F, 8.7F, 2.8F, 1.6F, -9.4F, -0.7F, -3.9F, -1.3F, -0.7F, 3.1F, 0.6F, 2.8F, -2.2F, 8.7F, 2.8F, -2.2F, -9.4F, -0.7F, 3.1F, -1.3F); // 90
        bodyModel[270].setRotationPoint(-12F, -27F, 4F);

        bodyModel[271].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, -0.15F, -6F, 0F, -0.15F, -6F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, 0.35F, -6F, -0.5F, 0.35F, -6F, 0F, -0.85F, 0F, 0F, -0.85F); // Box 337
        bodyModel[271].setRotationPoint(-3F, -22F, -4F);

        bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -1.4F, -0.9F, -0.5F, -0.6F, -0.9F, -0.5F, -0.6F, 0.1F, -0.35F, -1.4F, 0.1F, -0.5F, 0.4F, -0.9F, -0.4F, -0.3F, -0.9F, -0.4F, -0.3F, 0.1F, -0.5F, 0.4F, 0.1F); // Box 258
        bodyModel[272].setRotationPoint(-41F, -4F, -1F);

        bodyModel[273].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.5F, -0.35F, -6F, -0.5F, -0.35F, -6F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.85F, -6F, 0F, -0.85F, -6F, -0.5F, 0.35F, 0F, -0.5F, 0.35F); // Box 341
        bodyModel[273].setRotationPoint(-3F, -22F, 3F);

        bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, -1.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0.6F, -1.3F, 0F, 0.1F, 0.4F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0.1F, 0.4F, 0F); // Box 342
        bodyModel[274].setRotationPoint(-4F, -22F, 3F);

        bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 344
        bodyModel[275].setRotationPoint(-12F, 6F, -6F);

        bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 344
        bodyModel[276].setRotationPoint(11F, 6F, -6F);

        bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -2F, -0.5F, -1F, -2F, -0.5F, -1F, 0F, -1F, -1F, 0F); // Box 104
        bodyModel[277].setRotationPoint(-41F, 4F, 5F);

        bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.5F, 0F, -2F, -3F, 0F, -2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, -2F, -3F, -1F, -2F, -2.5F, -1F, 0F, 0F, -1F, 0F); // Box 104
        bodyModel[278].setRotationPoint(-41F, 4F, 3F);

        bodyModel[279].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,-0.5F, 0F, -1F, -5.6F, 0F, -1F, -5.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -1F, -5.6F, -1F, -1F, -5.6F, -1F, 0F, -0.5F, -1F, 0F); // Box 104
        bodyModel[279].setRotationPoint(-40F, 4F, 7F);

        bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, -2F, -0.5F, -1F, -2F); // Box 104
        bodyModel[280].setRotationPoint(39F, 4F, -9F);

        bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, -3F, 0F, -2F, -2.5F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, -2F, -3F, -1F, -2F); // Box 104
        bodyModel[281].setRotationPoint(37F, 4F, -7F);

        bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 2, 20, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -10F, -2F, 0F, -10F, -2F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -10F, -2F, -1F, -10F); // Box 104
        bodyModel[282].setRotationPoint(38F, 4F, -5F);

        bodyModel[283].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,-5.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -5.6F, 0F, -1F, -5.6F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -1F, -5.6F, -1F, -1F); // Box 104
        bodyModel[283].setRotationPoint(30F, 4F, -9F);

        bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -2F, 0F, -1F, -2F, -1F, -1F, 0F, -0.5F, -1F, 0F); // Box 104
        bodyModel[284].setRotationPoint(39F, 4F, 5F);

        bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-3F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3F, -1F, -2F, 0.5F, -1F, -2F, 0F, -1F, 0F, -2.5F, -1F, 0F); // Box 104
        bodyModel[285].setRotationPoint(37F, 4F, 3F);

        bodyModel[286].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,-5.6F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -5.6F, 0F, 0F, -5.6F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, -5.6F, -1F, 0F); // Box 104
        bodyModel[286].setRotationPoint(30F, 4F, 7F);

        bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, -2.6F, 0F, -1F, -2.6F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -2F, 0F, -1.7F, -2F); // 76
        bodyModel[287].setRotationPoint(20F, -17F, 7F);

        bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -3F, 0F, -1.7F, -3F); // 77
        bodyModel[288].setRotationPoint(20F, -17F, 4F);

        bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -2F, 0F, -1.7F, -2F); // 78
        bodyModel[289].setRotationPoint(20F, -17F, -9F);

        bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, -3F, 0F, -1.7F, -3F); // 79
        bodyModel[290].setRotationPoint(20F, -17F, -7F);

        bodyModel[291].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,2.8F, 1.6F, -0.7F, 0F, -1.5F, 0.3F, 0F, -1.5F, -1F, 2.8F, 1.6F, 0F, 2.8F, -2.2F, -0.7F, -0.7F, 0.5F, 0.3F, -0.7F, 0.5F, -1F, 2.8F, -2.2F, 0F); // 92
        bodyModel[291].setRotationPoint(3F, -27F, 4F);

        bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,2F, -2.5F, -1F, 0F, -5F, -1F, 0F, -5F, 0.3F, 2F, -2.5F, 0.3F, 2.7F, 1.5F, -1F, -0.7F, 4F, -1F, -0.7F, 4F, 0.3F, 2.7F, 1.5F, 0.3F); // Box 329
        bodyModel[292].setRotationPoint(9F, -28F, -5F);

        bodyModel[293].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,2.8F, 1.6F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0.3F, 2.8F, 1.6F, -0.7F, 2.8F, -2.2F, 0F, -0.7F, 0.5F, -1F, -0.7F, 0.5F, 0.3F, 2.8F, -2.2F, -0.7F); // Box 330
        bodyModel[293].setRotationPoint(3F, -27F, -5F);

        bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,2F, -2.5F, 0.3F, 0F, -5F, 0.3F, 0F, -5F, -1F, 2F, -2.5F, -1F, 2.7F, 1.5F, 0.3F, -0.7F, 4F, 0.3F, -0.7F, 4F, -1F, 2.7F, 1.5F, -1F); // 90
        bodyModel[294].setRotationPoint(9F, -28F, 4F);

        bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0.6F, -1.3F, -0.7F, 0.1F, 0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0.1F, 0.4F, -0.7F); // Box 342
        bodyModel[295].setRotationPoint(-4F, -22F, -4F);

        bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.7F, 0.6F, -1.3F, -0.7F, 0.6F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0.1F, 0.4F, -0.7F, 0.1F, 0.4F, 0F, 0F, -0.3F, 0F); // Box 342
        bodyModel[296].setRotationPoint(3F, -22F, 3F);

        bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0.6F, -1.3F, 0F, 0.6F, -1.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, -0.7F, 0F, -0.3F, -0.7F); // Box 342
        bodyModel[297].setRotationPoint(3F, -22F, -4F);

        bodyModel[298].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-2.4F, 0.5F, -3.5F, -2.4F, 0.5F, -3.6F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, -2.4F, -1.1F, -3.5F, -2.4F, -1.1F, -3.6F, 0F, -1.1F, 0F, 0F, -1.1F, -0.3F); // Box 104
        bodyModel[298].setRotationPoint(24F, 7F, -13F);

        bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, -1.4F, 0F, -0.75F, -1.4F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -1F, -0.9F, -1.4F, -1F, -0.9F); // Box 104
        bodyModel[299].setRotationPoint(28F, 4F, 7F);

        bodyModel[300].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.7F, -8F, 0F, 0F, -8F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.7F, -8F, -0.5F, 0F); // Box 104
        bodyModel[300].setRotationPoint(16F, 4F, -8F);

        bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,-0.9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -5F, -3F, 0F, -5F, -3F, 0F, -5F, 0F, -0.9F, -5F, 0F); // Box 104
        bodyModel[301].setRotationPoint(23F, 4F, 3F);

        bodyModel[302].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,-8F, 0.5F, -0.7F, 0F, 0.5F, -1.4F, 0F, 0.5F, 0.7F, -8F, 0.5F, 0F, -8F, -2.5F, -0.7F, 0F, -2.5F, -1.4F, 0F, -2.5F, 0.7F, -8F, -2.5F, 0F); // Box 104
        bodyModel[302].setRotationPoint(16F, 5F, -8F);

        bodyModel[303].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,-8F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0.7F, -8F, 0.5F, 0F, -8F, -1.1F, 0.3F, 0F, -1.1F, 0F, 0F, -1.1F, 0.7F, -8F, -1.1F, 0F); // Box 104
        bodyModel[303].setRotationPoint(16F, 7F, -9F);

        bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-0.5F, 0F, -2.3F, -0.4F, 0F, -2.3F, -0.4F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -3.1F, -2.3F, -0.4F, -3.1F, -2.3F, -0.4F, -3.1F, 0.25F, -0.5F, -3.1F, 0.25F); // Box 104
        bodyModel[304].setRotationPoint(35F, 4F, 4F);

        bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-1F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, -2.1F, -1.5F, 0.1F, -2.1F, -1.5F, 0.1F, -2.1F, -0.3F, -1F, -2.1F, -0.3F); // Box 104
        bodyModel[305].setRotationPoint(31F, 4F, -10F);

        bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,-0.9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -5F, -3F, 0F, -5F, -3F, 0F, -5F, 0F, -0.9F, -5F, 0F); // Box 104
        bodyModel[306].setRotationPoint(23F, 4F, -12F);

        bodyModel[307].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,-11F, 0.5F, 0F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, -1.4F, -11F, 0.5F, -0.7F, -11F, -2.5F, 0F, 0.5F, -2.5F, 0.7F, 0.5F, -2.5F, -1.4F, -11F, -2.5F, -0.7F); // Box 104
        bodyModel[307].setRotationPoint(13F, 5F, 7F);

        bodyModel[308].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,-11F, 0F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F, -0.75F, -11F, 0F, 0F, -11F, -0.5F, 0F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, -0.75F, -11F, -0.5F, 0F); // Box 104
        bodyModel[308].setRotationPoint(13F, 4F, 7F);

        bodyModel[309].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,-11F, 0.5F, -2F, 0.5F, 0.5F, -1.3F, 0.5F, 0.5F, 0F, -11F, 0.5F, 0.3F, -11F, -1.1F, -2F, 0.5F, -1.1F, -1.3F, 0.5F, -1.1F, 0F, -11F, -1.1F, 0.3F); // Box 104
        bodyModel[309].setRotationPoint(13F, 7F, 5F);

        bodyModel[310].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0.5F, -2.3F, 0.5F, 0.5F, -2F, -2.4F, 0.5F, -1.6F, -2.4F, 0.5F, -1.5F, 0F, -1.1F, -2.3F, 0.5F, -1.1F, -2F, -2.4F, -1.1F, -1.6F, -2.4F, -1.1F, -1.5F); // Box 104
        bodyModel[310].setRotationPoint(24F, 7F, 7F);

        bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-1.5F, 0.1F, -0.3F, 0.8F, 0.1F, -0.3F, 0.5F, 0.1F, -0.7F, -1.2F, 0.1F, -0.7F, -1.5F, -1.7F, -0.3F, 0.8F, -1.7F, -0.3F, 0.5F, -1.7F, -0.7F, -1.2F, -1.7F, -0.7F); // Box 104
        bodyModel[311].setRotationPoint(-44F, 4F, -2F);

        bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.5F, 0.1F, -0.7F, -1.2F, 0.1F, -0.7F, -1.5F, 0.1F, -0.3F, 0.8F, 0.1F, -0.3F, 0.5F, -1.7F, -0.7F, -1.2F, -1.7F, -0.7F, -1.5F, -1.7F, -0.3F, 0.8F, -1.7F, -0.3F); // Box 104
        bodyModel[312].setRotationPoint(43F, 4F, 0F);

        bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, -1F, 0.3F, -0.5F, -1F, 0.3F, -0.5F, -1F, -0.7F, -0.5F, -1F, -0.7F); // Box 104
        bodyModel[313].setRotationPoint(41F, 4F, 0F);

        bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.5F, 0.1F, 0.7F, -1.2F, 0.1F, 0.7F, -1.2F, 0.1F, -1.3F, 0.5F, 0.1F, -1.3F, 0.5F, -1.7F, 0.7F, -1.2F, -1.7F, 0.7F, -1.2F, -1.7F, -1.3F, 0.5F, -1.7F, -1.3F); // Box 104
        bodyModel[314].setRotationPoint(43F, 4F, 0F);

        bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.8F, 0.1F, -0.3F, -1.5F, 0.1F, -0.3F, -1.2F, 0.1F, -0.7F, 0.5F, 0.1F, -0.7F, 0.8F, -1.7F, -0.3F, -1.5F, -1.7F, -0.3F, -1.2F, -1.7F, -0.7F, 0.5F, -1.7F, -0.7F); // Box 104
        bodyModel[315].setRotationPoint(43F, 4F, -2F);

        bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.2F, -0.8F, 0.2F, 0.2F, -0.8F, 0.2F, 0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 316
        bodyModel[316].setRotationPoint(-37F, -5F, -5F);

        bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0.4F, -0.8F, -0.1F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.4F, -0.8F, -0.1F, 0.4F, 0F, -0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, -0.1F); // Box 316
        bodyModel[317].setRotationPoint(-39F, -5F, -8F);

        bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.4F, 0.5F, -0.5F, -0.3F, 0.5F, -0.5F, -1.1F, 1F, 0.3F, 0.4F, 1F, 0.3F, -0.4F, -1.2F, -0.5F, -0.3F, -1.2F, -0.5F, -1.1F, -1.7F, 0.3F, 0.4F, -1.7F, 0.3F); // Box 316
        bodyModel[318].setRotationPoint(-36F, -5F, 5F);

        bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 8, 16, 0F,-0.1F, 0.2F, -3F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.1F, 0.2F, -3F, -0.1F, 0F, -3F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.1F, 0F, -3F); // Box 316
        bodyModel[319].setRotationPoint(-40F, -4F, -8F);

        bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
        bodyModel[320].setRotationPoint(-37F, -4F, -5F);

        bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
        bodyModel[321].setRotationPoint(-37F, -4F, 5F);

        bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0.4F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -0.1F); // Box 316
        bodyModel[322].setRotationPoint(-39F, -4F, -8F);

        bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.2F, -0.8F, 0.2F, 0.2F, -0.8F, 0.2F, 0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 316
        bodyModel[323].setRotationPoint(-37F, -5F, 5F);

        bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.5F, -0.5F, -0.4F, -0.1F, -0.1F, -0.4F, -0.5F, -0.5F, -0.4F, -0.1F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.1F); // Box 316
        bodyModel[324].setRotationPoint(-36F, -6F, 5F);

        bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, -1F, -0.4F, -0.6F, -1F, -0.4F); // Box 316
        bodyModel[325].setRotationPoint(-37F, -6F, 7F);

        bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 316
        bodyModel[326].setRotationPoint(-39F, -5F, 2F);

        bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.6F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.4F, -0.6F, -0.3F, -0.4F); // Box 316
        bodyModel[327].setRotationPoint(-37F, -7F, 7F);

        bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, -0.7F, -0.4F, -0.6F, -0.7F, -0.4F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.4F, -0.6F, 0F, -0.4F); // Box 316
        bodyModel[328].setRotationPoint(-37F, -7F, 7F);

        bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.6F, -0.3F, -0.7F, 0.8F, -0.3F, -0.7F, 0.8F, -0.3F, 0F, 0.6F, -0.3F, -0.6F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F); // Box 316
        bodyModel[329].setRotationPoint(-39F, -5F, 2F);

        bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, -0.7F, 0.5F, -0.1F, -0.7F, 0.5F, -0.1F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 316
        bodyModel[330].setRotationPoint(-39F, -5F, -1F);

        bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, -0.6F, 0F, -0.3F, -0.6F); // Box 316
        bodyModel[331].setRotationPoint(-39F, -5F, 0F);

        bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, -0.6F, 0F, -0.3F, -0.6F); // Box 316
        bodyModel[332].setRotationPoint(-39F, -5F, -1F);

        bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 316
        bodyModel[333].setRotationPoint(-36F, -5F, 5F);

        bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.6F, 0.8F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.6F, -0.3F, -0.6F, -0.2F, -0.3F, -0.2F, 0.8F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.6F, -0.3F, -0.2F, -0.2F); // Box 316
        bodyModel[334].setRotationPoint(-36F, -5F, -2F);

        bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.6F, 0.4F, -0.7F, -0.6F, 0.8F, -0.7F, -0.6F, -0.2F, 0.4F, -0.6F, -0.6F, 0.4F, -0.2F, 0.4F, -0.7F, -0.2F, 0.8F, -0.7F, -0.2F, -0.2F, 0.4F, -0.2F, -0.6F); // Box 316
        bodyModel[335].setRotationPoint(-36F, -5F, -2F);

        bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.1F, -0.6F, -0.3F, 0.1F, -0.6F, -0.3F, -0.9F, -0.2F, -0.3F, -0.9F, -0.1F, -0.4F, 0.2F, -0.5F, -0.4F, 0.2F, -0.5F, -0.4F, -0.8F, -0.1F, -0.4F, -0.8F); // Box 316
        bodyModel[336].setRotationPoint(-36F, -5F, -2F);

        bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.7F, 0.4F, -0.3F, -0.7F, 0.5F, -0.2F, 0F, -1.1F, -0.2F, 0F, -1.1F, -0.2F, -0.6F, 0.5F, -0.2F, -0.6F); // Box 316
        bodyModel[337].setRotationPoint(-35F, -5F, -4F);

        bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.7F, 0.4F, -0.3F, -0.7F, 0.5F, -0.2F, 0F, -1.1F, -0.2F, 0F, -1.1F, -0.2F, -0.6F, 0.5F, -0.2F, -0.6F); // Box 316
        bodyModel[338].setRotationPoint(-35F, -5F, -4F);

        bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.35F, -1F, -0.15F, -1.25F, -1F, -0.15F, -1.25F, -1F, -0.75F, 0.35F, -1F, -0.75F, 0.35F, 0.3F, -0.15F, -1.25F, 0.3F, -0.15F, -1.25F, 0.3F, -0.75F, 0.35F, 0.3F, -0.75F); // Box 316
        bodyModel[339].setRotationPoint(-35F, -6F, -4F);

        bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 316
        bodyModel[340].setRotationPoint(-37F, -2F, -7F);

        bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.6F, -0.5F, -0.1F); // Box 316
        bodyModel[341].setRotationPoint(-37F, -1F, -7F);

        bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F); // Box 316
        bodyModel[342].setRotationPoint(-37F, -2F, -6F);

        bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F); // Box 349
        bodyModel[343].setRotationPoint(-37F, -2F, -8F);

        bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F, -0.2F, -0.5F, -1.1F, -0.6F, -0.5F, -1.1F, -0.6F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.5F, -0.6F, 0.1F, -0.5F); // Box 350
        bodyModel[344].setRotationPoint(-37F, -3F, -6F);

        bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.6F, -0.5F, -0.1F, -0.6F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F); // Box 316
        bodyModel[345].setRotationPoint(-37F, -3F, -7F);

        bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, -1.1F, -0.2F, -0.5F, -1.1F, -0.2F, -0.7F, 0.1F, -0.6F, -0.7F, 0.1F, -0.6F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.3F, -0.6F, 0.1F, -0.3F); // Box 352
        bodyModel[346].setRotationPoint(-37F, -3F, -8F);

        bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.3F, -0.6F, 0.1F, -0.3F, -0.6F, -0.5F, -1.1F, -0.2F, -0.5F, -1.1F, -0.2F, -0.7F, 0.1F, -0.6F, -0.7F, 0.1F); // Box 353
        bodyModel[347].setRotationPoint(-37F, -1F, -8F);

        bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.5F, -0.6F, 0.1F, -0.5F, -0.6F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F, -0.2F, -0.5F, -1.1F, -0.6F, -0.5F, -1.1F); // Box 354
        bodyModel[348].setRotationPoint(-37F, -1F, -6F);

        bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.6F, -0.5F, -0.4F, -0.6F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.6F, 0.3F, -0.4F); // Box 355
        bodyModel[349].setRotationPoint(-37F, -2F, -7F);

        bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.8F, -1.1F, -0.3F, -0.8F, -1.1F, -0.3F, -0.9F, 0.2F, -0.6F, -0.9F, 0.2F, -0.6F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.6F, 0.5F, -0.4F); // Box 356
        bodyModel[350].setRotationPoint(-37F, -3F, -7F);

        bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.9F, 0.2F, -0.3F, -0.9F, 0.2F, -0.3F, -0.8F, -1.1F, -0.6F, -0.8F, -1.1F, -0.6F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.6F, 0.5F, -0.4F); // Box 357
        bodyModel[351].setRotationPoint(-37F, -3F, -7F);

        bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
        bodyModel[352].setRotationPoint(-21F, -15F, -9F);

        bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 360
        bodyModel[353].setRotationPoint(-21F, -18F, -4F);

        bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 361
        bodyModel[354].setRotationPoint(20F, -18F, -4F);

        bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
        bodyModel[355].setRotationPoint(20F, -15F, -9F);

        bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
        bodyModel[356].setRotationPoint(-23F, -14F, -9F);

        bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 364
        bodyModel[357].setRotationPoint(-23F, -14F, 4F);

        bodyModel[358].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.3F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.1F, 0F, 0F, -0.1F); // Box 365
        bodyModel[358].setRotationPoint(-18F, -1F, 1F);

        bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
        bodyModel[359].setRotationPoint(22F, -14F, -9F);

        bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.7F, 0.5F, -0.1F, -0.7F, 0.5F, -0.1F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F); // Box 367
        bodyModel[360].setRotationPoint(38F, -5F, -1F);

        bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, -0.6F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 368
        bodyModel[361].setRotationPoint(38F, -5F, -1F);

        bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, -0.6F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 369
        bodyModel[362].setRotationPoint(38F, -5F, 0F);

        bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0.2F, -0.8F, 0F, 0.4F, -0.8F, -0.1F, 0.4F, -0.8F, -0.1F, 0.2F, -0.8F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.2F, 0F, 0F); // Box 370
        bodyModel[363].setRotationPoint(37F, -5F, -8F);

        bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 8, 16, 0F,-0.4F, 0.2F, -0.1F, -0.1F, 0.2F, -3F, -0.1F, 0.2F, -3F, -0.4F, 0.2F, -0.1F, -0.4F, 0F, -0.1F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.4F, 0F, -0.1F); // Box 371
        bodyModel[364].setRotationPoint(39F, -4F, -8F);

        bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,0F, 0F, 0F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0F, 0F, 0F); // Box 372
        bodyModel[365].setRotationPoint(37F, -4F, -8F);

        bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.5F, -0.1F, -0.6F, -0.5F, -0.1F, -0.6F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F); // Box 373
        bodyModel[366].setRotationPoint(36F, -1F, 6F);

        bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.1F, -0.3F, -0.6F, 0.1F, -0.3F, -0.6F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, -0.7F, 0.1F, -0.6F, -0.7F, 0.1F, -0.6F, -0.5F, -1.1F, -0.2F, -0.5F, -1.1F); // Box 374
        bodyModel[367].setRotationPoint(36F, -1F, 7F);

        bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F); // Box 375
        bodyModel[368].setRotationPoint(36F, -2F, 7F);

        bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.7F, 0.1F, -0.6F, -0.7F, 0.1F, -0.6F, -0.5F, -1.1F, -0.2F, -0.5F, -1.1F, -0.2F, 0.1F, -0.3F, -0.6F, 0.1F, -0.3F, -0.6F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F); // Box 376
        bodyModel[369].setRotationPoint(36F, -3F, 7F);

        bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.8F, -1.1F, -0.6F, -0.8F, -1.1F, -0.6F, -0.9F, 0.2F, -0.3F, -0.9F, 0.2F, -0.3F, 0.5F, -0.4F, -0.6F, 0.5F, -0.4F, -0.6F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F); // Box 377
        bodyModel[370].setRotationPoint(36F, -3F, 6F);

        bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.1F, -0.6F, -0.5F, -0.1F, -0.6F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F); // Box 378
        bodyModel[371].setRotationPoint(36F, -3F, 6F);

        bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 379
        bodyModel[372].setRotationPoint(36F, -2F, 6F);

        bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.9F, 0.2F, -0.6F, -0.9F, 0.2F, -0.6F, -0.8F, -1.1F, -0.3F, -0.8F, -1.1F, -0.3F, 0.5F, -0.4F, -0.6F, 0.5F, -0.4F, -0.6F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F); // Box 380
        bodyModel[373].setRotationPoint(36F, -3F, 6F);

        bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.4F, -0.6F, -0.5F, -0.4F, -0.6F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, 0.3F, -0.4F, -0.6F, 0.3F, -0.4F, -0.6F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F); // Box 381
        bodyModel[374].setRotationPoint(36F, -2F, 6F);

        bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.1F, -0.5F, -0.6F, 0.1F, -0.5F, -0.6F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, -0.5F, -1.1F, -0.6F, -0.5F, -1.1F, -0.6F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F); // Box 382
        bodyModel[375].setRotationPoint(36F, -1F, 5F);

        bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F); // Box 383
        bodyModel[376].setRotationPoint(36F, -2F, 5F);

        bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.5F, -1.1F, -0.6F, -0.5F, -1.1F, -0.6F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F, -0.2F, 0.1F, -0.5F, -0.6F, 0.1F, -0.5F, -0.6F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F); // Box 384
        bodyModel[377].setRotationPoint(36F, -3F, 5F);

        bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
        bodyModel[378].setRotationPoint(35F, -4F, 0F);

        bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, 0.2F, -0.8F, 0.2F, 0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 386
        bodyModel[379].setRotationPoint(35F, -5F, 0F);

        bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.2F, -0.3F, -0.7F, 0.4F, -0.3F, -0.7F, 0.4F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, -1.1F, -0.2F, -0.6F, 0.5F, -0.2F, -0.6F, 0.5F, -0.2F, 0F, -1.1F, -0.2F, 0F); // Box 387
        bodyModel[380].setRotationPoint(34F, -5F, 0F);

        bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.25F, -1F, -0.75F, 0.35F, -1F, -0.75F, 0.35F, -1F, -0.15F, -1.25F, -1F, -0.15F, -1.25F, 0.3F, -0.75F, 0.35F, 0.3F, -0.75F, 0.35F, 0.3F, -0.15F, -1.25F, 0.3F, -0.15F); // Box 388
        bodyModel[381].setRotationPoint(34F, -6F, 0F);

        bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.6F, -0.3F, -0.6F, -0.2F, -0.3F, -0.6F, 0.8F, 0F, -0.6F, 0.4F, 0F, -0.2F, -0.6F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, 0.8F, 0F, -0.2F, 0.4F); // Box 389
        bodyModel[382].setRotationPoint(35F, -5F, 2F);

        bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, -0.6F, -0.2F, 0.4F, -0.6F, -0.6F, 0.4F, -0.6F, 0.4F, -0.7F, -0.6F, 0.8F, -0.7F, -0.2F, -0.2F, 0.4F, -0.2F, -0.6F, 0.4F, -0.2F, 0.4F, -0.7F, -0.2F, 0.8F); // Box 390
        bodyModel[383].setRotationPoint(35F, -5F, 2F);

        bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.3F, -0.9F, -0.2F, -0.3F, -0.9F, -0.2F, -0.3F, 0.1F, -0.6F, -0.3F, 0.1F, -0.5F, -0.4F, -0.8F, -0.1F, -0.4F, -0.8F, -0.1F, -0.4F, 0.2F, -0.5F, -0.4F, 0.2F); // Box 391
        bodyModel[384].setRotationPoint(35F, -5F, 2F);

        bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 392
        bodyModel[385].setRotationPoint(37F, -5F, -3F);

        bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.7F, 0.8F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, -0.7F, 0.8F, -0.3F, 0F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 393
        bodyModel[386].setRotationPoint(38F, -5F, -3F);

        bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
        bodyModel[387].setRotationPoint(35F, -4F, -8F);

        bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0.2F, 0.2F, -0.8F, 0.2F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 395
        bodyModel[388].setRotationPoint(35F, -5F, -8F);

        bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 396
        bodyModel[389].setRotationPoint(35F, -5F, -6F);

        bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.5F, -0.5F, -0.4F, -0.1F, -0.1F, -0.4F, -0.5F, -0.5F, -0.4F, -0.1F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.1F); // Box 397
        bodyModel[390].setRotationPoint(35F, -6F, -6F);

        bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.1F, 1F, 0.3F, 0.4F, 1F, 0.3F, -0.4F, 0.5F, -0.5F, -0.3F, 0.5F, -0.5F, -1.1F, -1.7F, 0.3F, 0.4F, -1.7F, 0.3F, -0.4F, -1.2F, -0.5F, -0.3F, -1.2F, -0.5F); // Box 398
        bodyModel[391].setRotationPoint(35F, -5F, -7F);

        bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, -1F, -0.4F, -0.6F, -1F, -0.4F, -0.6F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F); // Box 399
        bodyModel[392].setRotationPoint(36F, -6F, -8F);

        bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.7F, -0.4F, -0.6F, -0.7F, -0.4F, -0.6F, -0.7F, -0.3F, -0.1F, -0.7F, -0.3F, -0.1F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 400
        bodyModel[393].setRotationPoint(36F, -7F, -8F);

        bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.1F, -0.3F, -0.4F, -0.6F, -0.3F, -0.4F, -0.6F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 401
        bodyModel[394].setRotationPoint(36F, -7F, -8F);

        bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 365
        bodyModel[395].setRotationPoint(22F, -14F, 4F);

        bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 403
        bodyModel[396].setRotationPoint(-14F, -6F, 1F);

        bodyModel[397].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.3F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.1F, 0.3F, -0.6F, -0.1F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 0.3F, -0.1F); // Box 404
        bodyModel[397].setRotationPoint(-12F, -1F, 1F);

        bodyModel[398].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.1F, -0.4F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.3F, 0.1F, -0.4F, -0.3F, 0.2F, -0.4F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.2F, 0.2F, -0.4F, -0.2F); // Box 405
        bodyModel[398].setRotationPoint(-12F, -1F, 1F);

        bodyModel[399].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,-0.2F, -0.1F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.3F, -0.2F, -0.1F, -0.3F, -0.1F, -0.7F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.2F, -0.1F, -0.7F, -0.2F); // Box 406
        bodyModel[399].setRotationPoint(-18F, -1F, 1F);

        bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-0.3F, -0.5F, -0.2F, 0.7F, -0.5F, -0.2F, 0.7F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.1F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 407
        bodyModel[400].setRotationPoint(-14F, -6F, 1F);

        bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, 0F, -0.8F, 0.9F, 0F, -0.8F, 0.9F, -0.7F, 0.2F, 0.9F, -0.7F, 0.2F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, -0.7F, 0.2F, -0.7F, -0.7F); // Box 408
        bodyModel[401].setRotationPoint(-13F, -6F, 1F);

        bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, -0.3F, -0.8F, 0.9F, -0.3F, -0.8F, 0.9F, 0.5F, 0.2F, 0.9F, 0.5F, 0.2F, -1.6F, -0.3F, -0.8F, -1.6F, -0.3F, -0.8F, -1.6F, 0.3F, 0.2F, -1.6F, 0.3F); // Box 409
        bodyModel[402].setRotationPoint(-13F, -6F, 1F);

        bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.6F, -0.3F, -0.8F, 0.6F, -0.3F, -0.8F, 0.9F, -0.5F, 0.2F, 0.9F, -0.5F, 0.2F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, -0.7F, 0F, 0.2F, -0.7F, 0F); // Box 410
        bodyModel[403].setRotationPoint(-13F, -6F, 2F);

        bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 411
        bodyModel[404].setRotationPoint(12F, -6F, 1F);

        bodyModel[405].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.3F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.1F, 0F, 0F, -0.1F); // Box 412
        bodyModel[405].setRotationPoint(8F, -1F, 1F);

        bodyModel[406].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,-0.2F, -0.1F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.3F, -0.2F, -0.1F, -0.3F, -0.1F, -0.7F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.2F, -0.1F, -0.7F, -0.2F); // Box 413
        bodyModel[406].setRotationPoint(8F, -1F, 1F);

        bodyModel[407].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.3F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.1F, 0.3F, -0.6F, -0.1F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 0.3F, -0.1F); // Box 414
        bodyModel[407].setRotationPoint(14F, -1F, 1F);

        bodyModel[408].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.1F, -0.4F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.3F, 0.1F, -0.4F, -0.3F, 0.2F, -0.4F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.2F, 0.2F, -0.4F, -0.2F); // Box 415
        bodyModel[408].setRotationPoint(14F, -1F, 1F);

        bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-0.3F, -0.5F, -0.2F, 0.7F, -0.5F, -0.2F, 0.7F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.1F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 416
        bodyModel[409].setRotationPoint(12F, -6F, 1F);

        bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, 0F, -0.8F, 0.9F, 0F, -0.8F, 0.9F, -0.7F, 0.2F, 0.9F, -0.7F, 0.2F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, -0.7F, 0.2F, -0.7F, -0.7F); // Box 417
        bodyModel[410].setRotationPoint(13F, -6F, 1F);

        bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, -0.3F, -0.8F, 0.9F, -0.3F, -0.8F, 0.9F, 0.5F, 0.2F, 0.9F, 0.5F, 0.2F, -1.6F, -0.3F, -0.8F, -1.6F, -0.3F, -0.8F, -1.6F, 0.3F, 0.2F, -1.6F, 0.3F); // Box 418
        bodyModel[411].setRotationPoint(13F, -6F, 1F);

        bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.6F, -0.3F, -0.8F, 0.6F, -0.3F, -0.8F, 0.9F, -0.5F, 0.2F, 0.9F, -0.5F, 0.2F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, -0.7F, 0F, 0.2F, -0.7F, 0F); // Box 419
        bodyModel[412].setRotationPoint(13F, -6F, 2F);

        bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 420
        bodyModel[413].setRotationPoint(-1F, -6F, 1F);

        bodyModel[414].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.3F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.1F, 0F, 0F, -0.1F); // Box 421
        bodyModel[414].setRotationPoint(-5F, -1F, 1F);

        bodyModel[415].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,-0.2F, -0.1F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.3F, -0.2F, -0.1F, -0.3F, -0.1F, -0.7F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.2F, -0.1F, -0.7F, -0.2F); // Box 422
        bodyModel[415].setRotationPoint(-5F, -1F, 1F);

        bodyModel[416].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.3F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.1F, 0.3F, -0.6F, -0.1F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 0.3F, -0.1F); // Box 423
        bodyModel[416].setRotationPoint(1F, -1F, 1F);

        bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.1F, -0.4F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.3F, 0.1F, -0.4F, -0.3F, 0.2F, -0.4F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.7F, -0.2F, 0.2F, -0.4F, -0.2F); // Box 424
        bodyModel[417].setRotationPoint(1F, -1F, 1F);

        bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-0.3F, -0.5F, -0.2F, 0.7F, -0.5F, -0.2F, 0.7F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.1F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 425
        bodyModel[418].setRotationPoint(-1F, -6F, 1F);

        bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, 0F, -0.8F, 0.9F, 0F, -0.8F, 0.9F, -0.7F, 0.2F, 0.9F, -0.7F, 0.2F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, -0.7F, 0.2F, -0.7F, -0.7F); // Box 426
        bodyModel[419].setRotationPoint(0F, -6F, 1F);

        bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, -0.3F, -0.8F, 0.9F, -0.3F, -0.8F, 0.9F, 0.5F, 0.2F, 0.9F, 0.5F, 0.2F, -1.6F, -0.3F, -0.8F, -1.6F, -0.3F, -0.8F, -1.6F, 0.3F, 0.2F, -1.6F, 0.3F); // Box 427
        bodyModel[420].setRotationPoint(0F, -6F, 1F);

        bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.6F, -0.3F, -0.8F, 0.6F, -0.3F, -0.8F, 0.9F, -0.5F, 0.2F, 0.9F, -0.5F, 0.2F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, -0.7F, 0F, 0.2F, -0.7F, 0F); // Box 428
        bodyModel[421].setRotationPoint(0F, -6F, 2F);

        bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,-0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 429
        bodyModel[422].setRotationPoint(-1F, -6F, -9F);

        bodyModel[423].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.3F, -0.1F, 0.3F, -0.6F, -0.1F, 0.3F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, 0F, 0F, 0F, 0F); // Box 430
        bodyModel[423].setRotationPoint(-5F, -1F, -9F);

        bodyModel[424].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.2F, -0.1F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.2F, -0.2F, -0.1F, -0.2F, -0.1F, -0.7F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.1F, -0.1F, -0.7F, -0.1F); // Box 431
        bodyModel[424].setRotationPoint(-5F, -1F, -9F);

        bodyModel[425].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.3F, -0.6F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, 0.3F, -0.6F, 0F, 0.3F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.3F, 0.3F, 0F); // Box 432
        bodyModel[425].setRotationPoint(1F, -1F, -9F);

        bodyModel[426].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.1F, -0.4F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.2F, 0.1F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.1F, 0.2F, -0.4F, -0.1F); // Box 433
        bodyModel[426].setRotationPoint(1F, -1F, -9F);

        bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.3F, -0.5F, -0.3F, 0.7F, -0.5F, -0.3F, 0.7F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.1F, 0F, -0.3F, 0.9F, 0F, -0.3F, 0.9F, 0F, -0.2F, -0.1F, 0F, -0.2F); // Box 434
        bodyModel[427].setRotationPoint(-1F, -6F, -9F);

        bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, -0.7F, -0.8F, 0.9F, -0.7F, -0.8F, 0.9F, 0F, 0.2F, 0.9F, 0F, 0.2F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, -0.7F, 0F, 0.2F, -0.7F, 0F); // Box 435
        bodyModel[428].setRotationPoint(0F, -6F, -6F);

        bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, 0.5F, -0.8F, 0.9F, 0.5F, -0.8F, 0.9F, -0.3F, 0.2F, 0.9F, -0.3F, 0.2F, -1.6F, 0.3F, -0.8F, -1.6F, 0.3F, -0.8F, -1.6F, -0.3F, 0.2F, -1.6F, -0.3F); // Box 436
        bodyModel[429].setRotationPoint(0F, -6F, -6F);

        bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, -0.5F, -0.8F, 0.9F, -0.5F, -0.8F, 0.6F, -0.3F, 0.2F, 0.6F, -0.3F, 0.2F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, -0.7F, 0.2F, -0.7F, -0.7F); // Box 437
        bodyModel[430].setRotationPoint(0F, -6F, -7F);

        bodyModel[431].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.3F, -0.6F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, 0.3F, -0.6F, 0F, 0.3F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.3F, 0.3F, 0F); // Box 438
        bodyModel[431].setRotationPoint(-12F, -1F, -9F);

        bodyModel[432].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.1F, -0.4F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.2F, 0.1F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.1F, 0.2F, -0.4F, -0.1F); // Box 439
        bodyModel[432].setRotationPoint(-12F, -1F, -9F);

        bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,-0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 440
        bodyModel[433].setRotationPoint(-14F, -6F, -9F);

        bodyModel[434].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.3F, -0.1F, 0.3F, -0.6F, -0.1F, 0.3F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, 0F, 0F, 0F, 0F); // Box 441
        bodyModel[434].setRotationPoint(-18F, -1F, -9F);

        bodyModel[435].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.2F, -0.1F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.2F, -0.2F, -0.1F, -0.2F, -0.1F, -0.7F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.1F, -0.1F, -0.7F, -0.1F); // Box 442
        bodyModel[435].setRotationPoint(-18F, -1F, -9F);

        bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.3F, -0.5F, -0.3F, 0.7F, -0.5F, -0.3F, 0.7F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.1F, 0F, -0.3F, 0.9F, 0F, -0.3F, 0.9F, 0F, -0.2F, -0.1F, 0F, -0.2F); // Box 443
        bodyModel[436].setRotationPoint(-14F, -6F, -9F);

        bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, -0.7F, -0.8F, 0.9F, -0.7F, -0.8F, 0.9F, 0F, 0.2F, 0.9F, 0F, 0.2F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, -0.7F, 0F, 0.2F, -0.7F, 0F); // Box 444
        bodyModel[437].setRotationPoint(-13F, -6F, -6F);

        bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, 0.5F, -0.8F, 0.9F, 0.5F, -0.8F, 0.9F, -0.3F, 0.2F, 0.9F, -0.3F, 0.2F, -1.6F, 0.3F, -0.8F, -1.6F, 0.3F, -0.8F, -1.6F, -0.3F, 0.2F, -1.6F, -0.3F); // Box 445
        bodyModel[438].setRotationPoint(-13F, -6F, -6F);

        bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, -0.5F, -0.8F, 0.9F, -0.5F, -0.8F, 0.6F, -0.3F, 0.2F, 0.6F, -0.3F, 0.2F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, -0.7F, 0.2F, -0.7F, -0.7F); // Box 446
        bodyModel[439].setRotationPoint(-13F, -6F, -7F);

        bodyModel[440].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.3F, -0.6F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, 0.3F, -0.6F, 0F, 0.3F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.3F, 0.3F, 0F); // Box 447
        bodyModel[440].setRotationPoint(14F, -1F, -9F);

        bodyModel[441].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.1F, -0.4F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.2F, 0.1F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, -0.1F, -0.7F, -0.2F, -0.1F, -0.7F, -0.1F, 0.2F, -0.4F, -0.1F); // Box 448
        bodyModel[441].setRotationPoint(14F, -1F, -9F);

        bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,-0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 449
        bodyModel[442].setRotationPoint(12F, -6F, -9F);

        bodyModel[443].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.3F, -0.1F, 0.3F, -0.6F, -0.1F, 0.3F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, 0F, 0F, 0F, 0F); // Box 450
        bodyModel[443].setRotationPoint(8F, -1F, -9F);

        bodyModel[444].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.2F, -0.1F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.2F, -0.2F, -0.1F, -0.2F, -0.1F, -0.7F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.1F, -0.1F, -0.7F, -0.1F); // Box 451
        bodyModel[444].setRotationPoint(8F, -1F, -9F);

        bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-0.3F, -0.5F, -0.3F, 0.7F, -0.5F, -0.3F, 0.7F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.1F, 0F, -0.3F, 0.9F, 0F, -0.3F, 0.9F, 0F, -0.2F, -0.1F, 0F, -0.2F); // Box 452
        bodyModel[445].setRotationPoint(12F, -6F, -9F);

        bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, -0.7F, -0.8F, 0.9F, -0.7F, -0.8F, 0.9F, 0F, 0.2F, 0.9F, 0F, 0.2F, -0.7F, -0.7F, -0.8F, -0.7F, -0.7F, -0.8F, -0.7F, 0F, 0.2F, -0.7F, 0F); // Box 453
        bodyModel[446].setRotationPoint(13F, -6F, -6F);

        bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, 0.5F, -0.8F, 0.9F, 0.5F, -0.8F, 0.9F, -0.3F, 0.2F, 0.9F, -0.3F, 0.2F, -1.6F, 0.3F, -0.8F, -1.6F, 0.3F, -0.8F, -1.6F, -0.3F, 0.2F, -1.6F, -0.3F); // Box 454
        bodyModel[447].setRotationPoint(13F, -6F, -6F);

        bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.9F, -0.5F, -0.8F, 0.9F, -0.5F, -0.8F, 0.6F, -0.3F, 0.2F, 0.6F, -0.3F, 0.2F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, -0.7F, 0.2F, -0.7F, -0.7F); // Box 455
        bodyModel[448].setRotationPoint(13F, -6F, -7F);

        bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F); // Box 456
        bodyModel[449].setRotationPoint(-11F, -13F, 4F);

        bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F); // Box 457
        bodyModel[450].setRotationPoint(-8F, -14F, 4F);

        bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F); // Box 458
        bodyModel[451].setRotationPoint(-14F, -14F, 4F);

        bodyModel[452].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 459
        bodyModel[452].setRotationPoint(-14F, -14F, 4F);

        bodyModel[453].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 460
        bodyModel[453].setRotationPoint(-14F, -14F, 5F);

        bodyModel[454].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 461
        bodyModel[454].setRotationPoint(-14F, -14F, 6F);

        bodyModel[455].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 462
        bodyModel[455].setRotationPoint(-14F, -14F, 7F);

        bodyModel[456].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 463
        bodyModel[456].setRotationPoint(-14F, -14F, 8F);

        bodyModel[457].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 464
        bodyModel[457].setRotationPoint(-11F, -14F, 8F);

        bodyModel[458].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 465
        bodyModel[458].setRotationPoint(-11F, -14F, 7F);

        bodyModel[459].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 466
        bodyModel[459].setRotationPoint(-11F, -14F, 6F);

        bodyModel[460].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 467
        bodyModel[460].setRotationPoint(-11F, -14F, 5F);

        bodyModel[461].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 468
        bodyModel[461].setRotationPoint(-11F, -14F, 4F);

        bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0.4F, 0.1F, -0.4F, 0.4F, 0.1F, -0.4F, 0.4F, -0.9F, -0.4F, 0.4F, -0.9F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F); // Box 469
        bodyModel[462].setRotationPoint(-11F, -17F, 5F);

        bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 470
        bodyModel[463].setRotationPoint(6F, -18F, -5F);

        bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0.4F, 0.1F, -0.4F, 0.4F, 0.1F, -0.4F, 0.4F, -0.9F, -0.4F, 0.4F, -0.9F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F); // Box 471
        bodyModel[464].setRotationPoint(-0.5F, -17F, 5F);

        bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F); // Box 472
        bodyModel[465].setRotationPoint(-3.5F, -14F, 4F);

        bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 473
        bodyModel[466].setRotationPoint(-3.5F, -14F, 8F);

        bodyModel[467].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 474
        bodyModel[467].setRotationPoint(-3.5F, -14F, 7F);

        bodyModel[468].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 475
        bodyModel[468].setRotationPoint(-3.5F, -14F, 6F);

        bodyModel[469].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 476
        bodyModel[469].setRotationPoint(-3.5F, -14F, 5F);

        bodyModel[470].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 477
        bodyModel[470].setRotationPoint(-3.5F, -14F, 4F);

        bodyModel[471].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 478
        bodyModel[471].setRotationPoint(-0.5F, -14F, 8F);

        bodyModel[472].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 479
        bodyModel[472].setRotationPoint(-0.5F, -14F, 7F);

        bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 480
        bodyModel[473].setRotationPoint(-0.5F, -14F, 6F);

        bodyModel[474].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 481
        bodyModel[474].setRotationPoint(-0.5F, -14F, 5F);

        bodyModel[475].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 482
        bodyModel[475].setRotationPoint(-0.5F, -14F, 4F);

        bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F); // Box 483
        bodyModel[476].setRotationPoint(2.5F, -14F, 4F);

        bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F); // Box 484
        bodyModel[477].setRotationPoint(10F, -13F, 4F);

        bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0.4F, 0.1F, -0.4F, 0.4F, 0.1F, -0.4F, 0.4F, -0.9F, -0.4F, 0.4F, -0.9F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F); // Box 485
        bodyModel[478].setRotationPoint(10F, -17F, 5F);

        bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F); // Box 486
        bodyModel[479].setRotationPoint(7F, -14F, 4F);

        bodyModel[480].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 487
        bodyModel[480].setRotationPoint(7F, -14F, 8F);

        bodyModel[481].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 488
        bodyModel[481].setRotationPoint(7F, -14F, 7F);

        bodyModel[482].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 489
        bodyModel[482].setRotationPoint(7F, -14F, 6F);

        bodyModel[483].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 490
        bodyModel[483].setRotationPoint(7F, -14F, 5F);

        bodyModel[484].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -0.1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, -0.7F, -0.4F, -0.1F, -0.7F, -0.4F, -0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.7F, -0.4F, -0.6F, -0.7F); // Box 491
        bodyModel[484].setRotationPoint(7F, -14F, 4F);

        bodyModel[485].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 492
        bodyModel[485].setRotationPoint(10F, -14F, 8F);

        bodyModel[486].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 493
        bodyModel[486].setRotationPoint(10F, -14F, 7F);

        bodyModel[487].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 494
        bodyModel[487].setRotationPoint(10F, -14F, 6F);

        bodyModel[488].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 495
        bodyModel[488].setRotationPoint(10F, -14F, 5F);

        bodyModel[489].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.4F, -1.2F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.4F, -1.2F, -0.7F, -0.4F, 0.5F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, -0.7F, -0.4F, 0.5F, -0.7F); // Box 496
        bodyModel[489].setRotationPoint(10F, -14F, 4F);

        bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F); // Box 497
        bodyModel[490].setRotationPoint(13F, -14F, 4F);

        bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F); // Box 470
        bodyModel[491].setRotationPoint(-0.5F, -13F, 4F);

        bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
        bodyModel[492].setRotationPoint(6F, -17F, -5F);

        bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F); // Box 493
        bodyModel[493].setRotationPoint(6F, -17F, -5F);

        bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F); // Box 496
        bodyModel[494].setRotationPoint(6F, -17F, -5F);

        bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F); // Box 497
        bodyModel[495].setRotationPoint(-7F, -17F, -5F);

        bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
        bodyModel[496].setRotationPoint(-7F, -17F, -5F);

        bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F); // Box 499
        bodyModel[497].setRotationPoint(-7F, -17F, -5F);

        bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 500
        bodyModel[498].setRotationPoint(-7F, -18F, -5F);

        bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F); // Box 501
        bodyModel[499].setRotationPoint(-19F, -17F, -5F);
    }

    private void initbodyModel_2()
    {
        bodyModel[500] = new ModelRendererTurbo(this, 481, 313, textureX, textureY); // Box 502
        bodyModel[501] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Box 503
        bodyModel[502] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Box 504
        bodyModel[503] = new ModelRendererTurbo(this, 505, 313, textureX, textureY); // Box 505
        bodyModel[504] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 506
        bodyModel[505] = new ModelRendererTurbo(this, 9, 321, textureX, textureY); // Box 507
        bodyModel[506] = new ModelRendererTurbo(this, 17, 321, textureX, textureY); // Box 508
        bodyModel[507] = new ModelRendererTurbo(this, 25, 321, textureX, textureY); // Box 509
        bodyModel[508] = new ModelRendererTurbo(this, 41, 321, textureX, textureY); // Box 510
        bodyModel[509] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Box 511
        bodyModel[510] = new ModelRendererTurbo(this, 65, 321, textureX, textureY); // Box 512
        bodyModel[511] = new ModelRendererTurbo(this, 73, 321, textureX, textureY); // Box 513
        bodyModel[512] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Box 514
        bodyModel[513] = new ModelRendererTurbo(this, 65, 305, textureX, textureY); // Box 515
        bodyModel[514] = new ModelRendererTurbo(this, 89, 321, textureX, textureY); // Box 516
        bodyModel[515] = new ModelRendererTurbo(this, 97, 321, textureX, textureY); // Box 517
        bodyModel[516] = new ModelRendererTurbo(this, 89, 321, textureX, textureY); // Box 518
        bodyModel[517] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Box 519
        bodyModel[518] = new ModelRendererTurbo(this, 145, 321, textureX, textureY); // Box 520
        bodyModel[519] = new ModelRendererTurbo(this, 153, 321, textureX, textureY); // Box 521
        bodyModel[520] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Box 522
        bodyModel[521] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 523
        bodyModel[522] = new ModelRendererTurbo(this, 161, 321, textureX, textureY); // Box 524

        bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
        bodyModel[500].setRotationPoint(-19F, -17F, -5F);

        bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F); // Box 503
        bodyModel[501].setRotationPoint(-19F, -17F, -5F);

        bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 504
        bodyModel[502].setRotationPoint(-19F, -18F, -5F);

        bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, -1F, -0.1F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F); // Box 505
        bodyModel[503].setRotationPoint(18F, -17F, -5F);

        bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
        bodyModel[504].setRotationPoint(18F, -17F, -5F);

        bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.5F, 0F, 0.2F); // Box 507
        bodyModel[505].setRotationPoint(18F, -17F, -5F);

        bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 508
        bodyModel[506].setRotationPoint(18F, -18F, -5F);

        bodyModel[507].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.2F, 0.3F, 0F, -0.2F, -3.7F, 0F, -0.2F, 3.3F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, 0F, -0.2F, -3.7F, 0F, -0.2F, 3.3F, 0F, -0.2F, -0.7F); // Box 509
        bodyModel[507].setRotationPoint(30F, 6F, 0F);

        bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 510
        bodyModel[508].setRotationPoint(29F, 6F, -7F);

        bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F, -1F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F, -1F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F); // Box 511
        bodyModel[509].setRotationPoint(43F, 6F, 3F);

        bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 512
        bodyModel[510].setRotationPoint(43F, 6F, 4F);

        bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 513
        bodyModel[511].setRotationPoint(38F, 4F, 6F);

        bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 514
        bodyModel[512].setRotationPoint(38F, 4F, -7F);

        bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 515
        bodyModel[513].setRotationPoint(38F, 7F, -6F);

        bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F); // Box 516
        bodyModel[514].setRotationPoint(38F, 4F, 2F);

        bodyModel[515].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 517
        bodyModel[515].setRotationPoint(-39F, 4F, -7F);

        bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 518
        bodyModel[516].setRotationPoint(-30F, 6F, -7F);

        bodyModel[517].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.2F, 3.3F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, 0F, -0.2F, -3.7F, 0F, -0.2F, 3.3F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, 0F, -0.2F, -3.7F); // Box 519
        bodyModel[517].setRotationPoint(-43F, 6F, 0F);

        bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.4F); // Box 520
        bodyModel[518].setRotationPoint(-39F, 4F, -2F);

        bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 521
        bodyModel[519].setRotationPoint(-39F, 4F, 6F);

        bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 522
        bodyModel[520].setRotationPoint(-39F, 7F, -6F);

        bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F, -1F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.6F, -0.1F, -0.2F); // Box 523
        bodyModel[521].setRotationPoint(-44F, 6F, -4F);

        bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F); // Box 524
        bodyModel[522].setRotationPoint(-44F, 6F, -4F);

        this.flipAll();
    }
}
