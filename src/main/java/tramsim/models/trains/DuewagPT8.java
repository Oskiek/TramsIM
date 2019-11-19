
package tramsim.models.trains; //Path where the model is located


import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import org.lwjgl.opengl.GL11;

public class DuewagPT8 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 256;
	public DuewagPT8() //Same as Filename
	{

		bodyModel = new ModelRendererTurbo[163];

		initbodyModel_1();

	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 39
		bodyModel[25] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 42
		bodyModel[26] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 43
		bodyModel[27] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 44
		bodyModel[28] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 47
		bodyModel[29] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 49
		bodyModel[30] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 50
		bodyModel[31] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 51
		bodyModel[32] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 54
		bodyModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 55
		bodyModel[34] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 56
		bodyModel[35] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 57
		bodyModel[36] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 58
		bodyModel[37] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 59
		bodyModel[38] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 60
		bodyModel[39] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 61
		bodyModel[40] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 63
		bodyModel[41] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 64
		bodyModel[42] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 65
		bodyModel[43] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 66
		bodyModel[44] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 67
		bodyModel[45] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 68
		bodyModel[46] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 69
		bodyModel[47] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 70
		bodyModel[48] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 71
		bodyModel[49] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 72
		bodyModel[50] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 74
		bodyModel[52] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 75
		bodyModel[53] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 76
		bodyModel[54] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 78
		bodyModel[55] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 79
		bodyModel[56] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 80
		bodyModel[57] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 81
		bodyModel[58] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 86
		bodyModel[59] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 87
		bodyModel[60] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 88
		bodyModel[61] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 91
		bodyModel[62] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 92
		bodyModel[63] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 93
		bodyModel[64] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 94
		bodyModel[65] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 95
		bodyModel[66] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 96
		bodyModel[67] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 97
		bodyModel[68] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 98
		bodyModel[69] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 99
		bodyModel[70] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 100
		bodyModel[71] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 101
		bodyModel[72] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 102
		bodyModel[73] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 103
		bodyModel[74] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 88
		bodyModel[83] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 89
		bodyModel[84] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 90
		bodyModel[85] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 91
		bodyModel[86] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 92
		bodyModel[87] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 93
		bodyModel[88] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 94
		bodyModel[89] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 95
		bodyModel[90] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 96
		bodyModel[91] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 97
		bodyModel[92] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 98
		bodyModel[93] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 99
		bodyModel[94] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 100
		bodyModel[95] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 101
		bodyModel[96] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 102
		bodyModel[97] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 103
		bodyModel[98] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 104
		bodyModel[99] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 105
		bodyModel[100] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 109
		bodyModel[102] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 110
		bodyModel[103] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 111
		bodyModel[104] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 112
		bodyModel[105] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 113
		bodyModel[106] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 114
		bodyModel[107] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 116
		bodyModel[108] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 117
		bodyModel[109] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 118
		bodyModel[110] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 119
		bodyModel[111] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 120
		bodyModel[112] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 121
		bodyModel[113] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 122
		bodyModel[114] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 123
		bodyModel[115] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 124
		bodyModel[116] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Door_L1_S1
		bodyModel[117] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Door_L1_S2
		bodyModel[118] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Door_R1_S1
		bodyModel[119] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Door_R1_S2
		bodyModel[120] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Door_R1_W1
		bodyModel[121] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Door_R1_W2
		bodyModel[122] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Door_L1_W1
		bodyModel[123] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Door_L1_W2
		bodyModel[124] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Door_L23_S1
		bodyModel[125] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Door_L23_S2
		bodyModel[126] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Door_R23_S1
		bodyModel[127] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Door_R23_S2
		bodyModel[128] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Door_R2_W1
		bodyModel[129] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Door_R2_W2
		bodyModel[130] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Door_L2_W1
		bodyModel[131] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Door_L2_W2
		bodyModel[132] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Door_R3_W1
		bodyModel[133] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Door_R3_W2
		bodyModel[134] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Door_L3_W2
		bodyModel[135] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Door_L3_W1
		bodyModel[136] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 142
		bodyModel[137] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 143
		bodyModel[138] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 144
		bodyModel[139] = new ModelRendererTurbo(this, 8, 86, textureX, textureY); // Box 145
		bodyModel[140] = new ModelRendererTurbo(this, 8, 86, textureX, textureY); // Box 146
		bodyModel[141] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 147
		bodyModel[142] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 148
		bodyModel[143] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 149
		bodyModel[144] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 150
		bodyModel[145] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Box 151
		bodyModel[146] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Box 152
		bodyModel[147] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Box 153
		bodyModel[148] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Box 154
		bodyModel[149] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Box 155
		bodyModel[150] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Box 156
		bodyModel[151] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Box 157
		bodyModel[152] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Box 158
		bodyModel[153] = new ModelRendererTurbo(this, 11, 99, textureX, textureY); // Box 159
		bodyModel[154] = new ModelRendererTurbo(this, 16, 99, textureX, textureY); // Box 160
		bodyModel[155] = new ModelRendererTurbo(this, 16, 99, textureX, textureY); // Box 161
		bodyModel[156] = new ModelRendererTurbo(this, 11, 99, textureX, textureY); // Box 162
		bodyModel[157] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 163
		bodyModel[158] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 163
		bodyModel[159] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 164
		bodyModel[160] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 165
		bodyModel[161] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 166
		bodyModel[162] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 167

		bodyModel[0].addBox(0F, 0F, 0F, 33, 3, 18, 0F); // Box 0
		bodyModel[0].setRotationPoint(-20F, 2F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 9, 3, 18, 0F); // Box 1
		bodyModel[1].setRotationPoint(24F, 2F, -9F);

		bodyModel[2].addBox(0F, 0F, 0F, 11, 4, 12, 0F); // Box 2
		bodyModel[2].setRotationPoint(13F, 2F, -6F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 4, 12, 0F); // Box 3
		bodyModel[3].setRotationPoint(-25F, 2F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 4
		bodyModel[4].setRotationPoint(-33F, 2F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 33, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-20F, -4F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 33, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-20F, -4F, 8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 58, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-26F, -17F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 3, 16, 0F,0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 9
		bodyModel[8].setRotationPoint(-33F, -17F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 10
		bodyModel[9].setRotationPoint(-34F, -8F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-34F, -14F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 6, 3, 0F,0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-33F, -4F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 14
		bodyModel[12].setRotationPoint(-33F, -4F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-34F, -8F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-34F, -14F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0.58F, 0F, 0F, -0.28F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.58F, 0F, 0.5F, -0.28F, 0F, 0.5F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-33F, -8F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, -0.28F, 0F, 0F, 0.58F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.28F, 0F, 0.5F, 0.58F, 0F, 0.5F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-33F, -8F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.58F, 0F, 0F, -0.28F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.58F, 0F, 0F, -0.28F, -1F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(-33F, -14F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.28F, 0F, 0F, 0.58F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.28F, 0F, 0F, 0.58F, -1F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-33F, -14F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-20F, -14F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 24
		bodyModel[20].setRotationPoint(-18F, -14F, 9F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 29
		bodyModel[21].setRotationPoint(-26F, 2F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[22].setRotationPoint(-26F, -13F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[23].setRotationPoint(-26F, -13F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[24].setRotationPoint(24F, -4F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 42
		bodyModel[25].setRotationPoint(31F, -14F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 43
		bodyModel[26].setRotationPoint(24F, -14F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[27].setRotationPoint(24F, -4F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F); // Box 47
		bodyModel[28].setRotationPoint(-31F, -14F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -3F, 0.5F, 0F, 3F, 0.5F, 0F); // Box 49
		bodyModel[29].setRotationPoint(-31.8F, -14F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0.28F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0.28F, 1F, 0F, -0.28F, -1F, 0F, 0F); // Box 50
		bodyModel[30].setRotationPoint(-33F, -13F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, -0.5F, 0.28F, 0F, -0.5F, 0.28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.28F, 0F, 0F, 0.28F, 0F, 0F, 0F); // Box 51
		bodyModel[31].setRotationPoint(-33F, -4F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0.5F, 0F, -3F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 54
		bodyModel[32].setRotationPoint(-31.8F, -14F, 0F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 55
		bodyModel[33].setRotationPoint(-30F, -1F, -3.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,-0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 56
		bodyModel[34].setRotationPoint(-26F, -13F, 1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[35].setRotationPoint(-26F, -13F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[36].setRotationPoint(-27F, -5F, -3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,1F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 59
		bodyModel[37].setRotationPoint(-34F, -4F, 1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 1F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 60
		bodyModel[38].setRotationPoint(-34F, -4F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0.5F, 0.35F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 61
		bodyModel[39].setRotationPoint(-34F, -16F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.5F, 0.35F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 63
		bodyModel[40].setRotationPoint(-34F, -16F, -6F);

		bodyModel[41].addShapeBox(0F, -1F, 0F, 13, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 64
		bodyModel[41].setRotationPoint(12F, 7F, -8F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 65
		bodyModel[42].setRotationPoint(-20F, 5F, -8F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 66
		bodyModel[43].setRotationPoint(12F, 5F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0F); // Box 67
		bodyModel[44].setRotationPoint(-31F, -14F, 7.5F);

		bodyModel[45].addShapeBox(0F, -1F, 0F, 7, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 68
		bodyModel[45].setRotationPoint(-26F, 7F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 0F); // Box 69
		bodyModel[46].setRotationPoint(-33F, 3F, -8F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 70
		bodyModel[47].setRotationPoint(24F, 5F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, -1F); // Box 71
		bodyModel[48].setRotationPoint(-33F, 3F, 6F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 72
		bodyModel[49].setRotationPoint(-26F, 5F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 58, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[50].setRotationPoint(-26F, -17F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 60, 1, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[51].setRotationPoint(-26F, -18F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 60, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[52].setRotationPoint(-26F, -18F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 60, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[53].setRotationPoint(-26F, -18F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 78
		bodyModel[54].setRotationPoint(-33F, -18F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 79
		bodyModel[55].setRotationPoint(-33F, -18F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -1.5F, -2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 80
		bodyModel[56].setRotationPoint(-33F, -18F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 81
		bodyModel[57].setRotationPoint(-9F, -14F, 8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 86
		bodyModel[58].setRotationPoint(-20F, -14F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 87
		bodyModel[59].setRotationPoint(-18F, -14F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88
		bodyModel[60].setRotationPoint(-9F, -14F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 91
		bodyModel[61].setRotationPoint(2F, -14F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 92
		bodyModel[62].setRotationPoint(11F, -14F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 93
		bodyModel[63].setRotationPoint(24F, -14F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 94
		bodyModel[64].setRotationPoint(31F, -14F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 95
		bodyModel[65].setRotationPoint(26F, -14F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 96
		bodyModel[66].setRotationPoint(26F, -14F, 9F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 97
		bodyModel[67].setRotationPoint(32F, -17F, 8F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 98
		bodyModel[68].setRotationPoint(32F, -17F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[69].setRotationPoint(32F, -16F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 18, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[70].setRotationPoint(32F, -16F, 5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Box 101
		bodyModel[71].setRotationPoint(32F, -17F, -5F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 102
		bodyModel[72].setRotationPoint(33F, 2F, -9F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 103
		bodyModel[73].setRotationPoint(33F, 2F, 8F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 80
		bodyModel[74].setRotationPoint(-19F, -2F, 4F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 81
		bodyModel[75].setRotationPoint(-19F, -2F, -8F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 82
		bodyModel[76].setRotationPoint(-20F, -5F, 4F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 83
		bodyModel[77].setRotationPoint(-20F, -5F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[78].setRotationPoint(-14F, -3.8F, -8F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 85
		bodyModel[79].setRotationPoint(-12F, -2F, -8F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 86
		bodyModel[80].setRotationPoint(-9F, -5F, -8F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 87
		bodyModel[81].setRotationPoint(-8F, -2F, -8F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 88
		bodyModel[82].setRotationPoint(-2F, -2F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[83].setRotationPoint(-4F, -3.8F, -8F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 90
		bodyModel[84].setRotationPoint(1F, -5F, -8F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 91
		bodyModel[85].setRotationPoint(2F, -2F, -8F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 92
		bodyModel[86].setRotationPoint(12F, -5F, -8F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 4, 8, 0F); // Box 93
		bodyModel[87].setRotationPoint(9F, -2F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[88].setRotationPoint(6F, -3.8F, -8F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 95
		bodyModel[89].setRotationPoint(-12F, -2F, 4F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 96
		bodyModel[90].setRotationPoint(-9F, -5F, 4F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 97
		bodyModel[91].setRotationPoint(-8F, -2F, 4F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 98
		bodyModel[92].setRotationPoint(1F, -5F, 4F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 99
		bodyModel[93].setRotationPoint(12F, -5F, 4F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 100
		bodyModel[94].setRotationPoint(31F, -5F, 4F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 101
		bodyModel[95].setRotationPoint(31F, -5F, -8F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 102
		bodyModel[96].setRotationPoint(-2F, -2F, 4F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 103
		bodyModel[97].setRotationPoint(2F, -2F, 4F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 104
		bodyModel[98].setRotationPoint(9F, -2F, 4F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 105
		bodyModel[99].setRotationPoint(28F, -2F, 4F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 106
		bodyModel[100].setRotationPoint(28F, -2F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[101].setRotationPoint(1F, -16F, 4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[102].setRotationPoint(-9F, -16F, 4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[103].setRotationPoint(-20F, -16F, 4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[104].setRotationPoint(12F, -16F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[105].setRotationPoint(12F, -16F, 4F);

		bodyModel[106].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 114
		bodyModel[106].setRotationPoint(-19F, -14F, 4F);

		bodyModel[107].addBox(0F, 0F, 0F, 45, 1, 2, 0F); // Box 116
		bodyModel[107].setRotationPoint(-17F, -16F, -1F);

		bodyModel[108].addBox(0F, 0F, 0F, 10, 1, 2, 0F); // Box 117
		bodyModel[108].setRotationPoint(-36F, 4F, -1F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Box 118
		bodyModel[109].setRotationPoint(-38F, 3F, -2F);

		bodyModel[110].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 119
		bodyModel[110].setRotationPoint(-8F, -14F, 4F);

		bodyModel[111].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 120
		bodyModel[111].setRotationPoint(2F, -14F, 4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[112].setRotationPoint(1F, -16F, -3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[113].setRotationPoint(-9F, -16F, -3F);

		bodyModel[114].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 123
		bodyModel[114].setRotationPoint(2F, -14F, -3F);

		bodyModel[115].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 124
		bodyModel[115].setRotationPoint(-8F, -14F, -3F);

		bodyModel[116].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Door_L1_S1
		bodyModel[116].setRotationPoint(-25F, 2F, -9F);

		bodyModel[117].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Door_L1_S2
		bodyModel[117].setRotationPoint(-25F, 3F, -9F);

		bodyModel[118].addBox(0F, 0F, -3F, 5, 1, 3, 0F); // Door_R1_S1
		bodyModel[118].setRotationPoint(-25F, 2F, 9F);

		bodyModel[119].addBox(0F, 0F, 0F, 5, 2, 0, 0F); // Door_R1_S2
		bodyModel[119].setRotationPoint(-25F, 3F, 9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Door_R1_W1
		bodyModel[120].setRotationPoint(-25F, -13F, 8.5F);

		bodyModel[121].addShapeBox(0F, 0F, -0.5F, 3, 15, 1, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Door_R1_W2
		bodyModel[121].setRotationPoint(-22.5F, -13F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, -1F, 3, 15, 1, 0F,0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Door_L1_W1
		bodyModel[122].setRotationPoint(-25F, -13F, -8.5F);

		bodyModel[123].addShapeBox(0F, 0F, -0.5F, 3, 15, 1, 0F,0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Door_L1_W2
		bodyModel[123].setRotationPoint(-22.5F, -13F, -9F);

		bodyModel[124].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Door_L23_S1
		bodyModel[124].setRotationPoint(13F, 2F, -9F);

		bodyModel[125].addBox(0F, 0F, 0F, 11, 2, 0, 0F); // Door_L23_S2
		bodyModel[125].setRotationPoint(13F, 3F, -9F);

		bodyModel[126].addBox(0F, 0F, -3F, 11, 1, 3, 0F); // Door_R23_S1
		bodyModel[126].setRotationPoint(13F, 2F, 9F);

		bodyModel[127].addBox(0F, 0F, 0F, 11, 2, 0, 0F); // Door_R23_S2
		bodyModel[127].setRotationPoint(13F, 3F, 9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Door_R2_W1
		bodyModel[128].setRotationPoint(13F, -13F, 8.5F);

		bodyModel[129].addShapeBox(0F, 0F, -0.5F, 3, 15, 1, 0F,0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Door_R2_W2
		bodyModel[129].setRotationPoint(15.75F, -13F, 9F);

		bodyModel[130].addShapeBox(0F, 0F, -1F, 3, 15, 1, 0F,0F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Door_L2_W1
		bodyModel[130].setRotationPoint(13F, -13F, -8.5F);

		bodyModel[131].addShapeBox(0F, 0F, -0.5F, 3, 15, 1, 0F,0F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Door_L2_W2
		bodyModel[131].setRotationPoint(15.75F, -13F, -9F);

		bodyModel[132].addShapeBox(-2.75F, 0F, 0F, 3, 15, 1, 0F,0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Door_R3_W1
		bodyModel[132].setRotationPoint(24F, -13F, 8.5F);

		bodyModel[133].addShapeBox(-2.75F, 0F, -0.5F, 3, 15, 1, 0F,0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Door_R3_W2
		bodyModel[133].setRotationPoint(21.25F, -13F, 9F);

		bodyModel[134].addShapeBox(-2.75F, 0F, -0.5F, 3, 15, 1, 0F,0F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Door_L3_W2
		bodyModel[134].setRotationPoint(21.25F, -13F, -9F);

		bodyModel[135].addShapeBox(-2.75F, 0F, -1F, 3, 15, 1, 0F,0F, 1F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Door_L3_W1
		bodyModel[135].setRotationPoint(24F, -13F, -8.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 142
		bodyModel[136].setRotationPoint(-4F, -3.8F, 7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 143
		bodyModel[137].setRotationPoint(-14F, -3.8F, 7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 144
		bodyModel[138].setRotationPoint(6F, -3.8F, 7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[139].setRotationPoint(-35F, -3.7F, 2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F); // Box 146
		bodyModel[140].setRotationPoint(-35F, -3.7F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[141].setRotationPoint(18F, -16F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[142].setRotationPoint(18F, -16F, 4F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 149
		bodyModel[143].setRotationPoint(18F, -16F, 4F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 150
		bodyModel[144].setRotationPoint(18F, -16F, 4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 151
		bodyModel[145].setRotationPoint(-35F, 0.5F, 4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[146].setRotationPoint(-35F, -0.5F, 4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[147].setRotationPoint(-35F, 0.5F, 3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[148].setRotationPoint(-35F, -0.5F, 3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[149].setRotationPoint(-35F, -0.5F, -5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[150].setRotationPoint(-35F, 0.5F, -5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 157
		bodyModel[151].setRotationPoint(-35F, 0.5F, -4F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[152].setRotationPoint(-35F, -0.5F, -4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 159
		bodyModel[153].setRotationPoint(-35.5F, -0.2F, 1.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 160
		bodyModel[154].setRotationPoint(-35.5F, 0.8F, 1.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 161
		bodyModel[155].setRotationPoint(-35.5F, 0.8F, -3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 162
		bodyModel[156].setRotationPoint(-35.5F, -0.2F, -3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 163
		bodyModel[157].setRotationPoint(-8F, -14F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 163
		bodyModel[158].setRotationPoint(-8F, -14F, 9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 164
		bodyModel[159].setRotationPoint(2F, -14F, 9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 165
		bodyModel[160].setRotationPoint(1F, -14F, 8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 166
		bodyModel[161].setRotationPoint(11F, -14F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 167
		bodyModel[162].setRotationPoint(1F, -14F, -9F);
		this.flipAll();
	}
}