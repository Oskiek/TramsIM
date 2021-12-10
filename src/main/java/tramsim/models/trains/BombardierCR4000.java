
package tramsim.models.trains; //Path where the model is located


import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import org.lwjgl.opengl.GL11;

public class BombardierCR4000 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public BombardierCR4000() //Same as Filename
	{


		bodyModel = new ModelRendererTurbo[173];
		
		initbodyModel_1();


	}

	private void initbodyModel_1()
	{
		GL11.glPushMatrix();
		GL11.glRotatef(180,0,1,0);
		GL11.glPopMatrix();

		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 64
		bodyModel[59] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 65
		bodyModel[60] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 66
		bodyModel[61] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 67
		bodyModel[62] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 68
		bodyModel[63] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 69
		bodyModel[64] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 70
		bodyModel[65] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 71
		bodyModel[66] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 75
		bodyModel[70] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 76
		bodyModel[71] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 78
		bodyModel[72] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 79
		bodyModel[73] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 75
		bodyModel[74] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 76
		bodyModel[75] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 77
		bodyModel[76] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 78
		bodyModel[77] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 79
		bodyModel[78] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 80
		bodyModel[79] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 81
		bodyModel[80] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 83
		bodyModel[81] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 84
		bodyModel[82] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 85
		bodyModel[83] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 86
		bodyModel[84] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 88
		bodyModel[86] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 89
		bodyModel[87] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 91
		bodyModel[88] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 92
		bodyModel[89] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 93
		bodyModel[90] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 94
		bodyModel[91] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 95
		bodyModel[92] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 96
		bodyModel[93] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 97
		bodyModel[94] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 98
		bodyModel[95] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 98
		bodyModel[96] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 99
		bodyModel[97] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 100
		bodyModel[98] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 101
		bodyModel[99] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 102
		bodyModel[100] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 103
		bodyModel[101] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 104
		bodyModel[102] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 106
		bodyModel[103] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 107
		bodyModel[104] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 108
		bodyModel[105] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 109
		bodyModel[106] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 110
		bodyModel[107] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 111
		bodyModel[108] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 112
		bodyModel[109] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 113
		bodyModel[110] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 114
		bodyModel[111] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 115
		bodyModel[112] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 116
		bodyModel[113] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 117
		bodyModel[114] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 118
		bodyModel[115] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 119
		bodyModel[116] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 120
		bodyModel[117] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 121
		bodyModel[118] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 122
		bodyModel[119] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 123
		bodyModel[120] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 124
		bodyModel[121] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 125
		bodyModel[122] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 126
		bodyModel[123] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 127
		bodyModel[124] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 128
		bodyModel[125] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 129
		bodyModel[126] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 130
		bodyModel[127] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 131
		bodyModel[128] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 132
		bodyModel[129] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 133
		bodyModel[130] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 134
		bodyModel[131] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 135
		bodyModel[132] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 136
		bodyModel[133] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 137
		bodyModel[134] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 138
		bodyModel[135] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 139
		bodyModel[136] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 140
		bodyModel[137] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 142
		bodyModel[138] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 143
		bodyModel[139] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 144
		bodyModel[140] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 145
		bodyModel[141] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 146
		bodyModel[142] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 147
		bodyModel[143] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 149
		bodyModel[144] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 151
		bodyModel[145] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 152
		bodyModel[146] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 153
		bodyModel[147] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 154
		bodyModel[148] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 155
		bodyModel[149] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 156
		bodyModel[150] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 157
		bodyModel[151] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 158
		bodyModel[152] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 159
		bodyModel[153] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 160
		bodyModel[154] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 161
		bodyModel[155] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 163
		bodyModel[156] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 164
		bodyModel[157] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 161
		bodyModel[158] = new ModelRendererTurbo(this, 185, 95, textureX, textureY); // Box 162
		bodyModel[159] = new ModelRendererTurbo(this, 200, 95, textureX, textureY); // Box 163
		bodyModel[160] = new ModelRendererTurbo(this, 185, 95, textureX, textureY); // Box 164
		bodyModel[161] = new ModelRendererTurbo(this, 200, 95, textureX, textureY); // Box 165
		bodyModel[162] = new ModelRendererTurbo(this, 161, 66, textureX, textureY); // Box 166
		bodyModel[163] = new ModelRendererTurbo(this, 481, 107, textureX, textureY); // Box 168
		bodyModel[164] = new ModelRendererTurbo(this, 481, 107, textureX, textureY); // Box 169
		bodyModel[165] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 170
		bodyModel[166] = new ModelRendererTurbo(this, 281, 104, textureX, textureY); // Box 171
		bodyModel[167] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 171
		bodyModel[168] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 172
		bodyModel[169] = new ModelRendererTurbo(this, 511, 255, textureX, textureY); // Lamp1
		bodyModel[170] = new ModelRendererTurbo(this, 511, 255, textureX, textureY); // Lamp2
		bodyModel[171] = new ModelRendererTurbo(this, 511, 255, textureX, textureY); // SmallLamp1
		bodyModel[172] = new ModelRendererTurbo(this, 511, 255, textureX, textureY); // SmallLamp2

		bodyModel[0].addBox(0F, 0F, 0F, 96, 3, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-55F, 10F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 96, 2, 20, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-55F, -14F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(41F, 10F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F, 0F, 0F, -1F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(41F, -14F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 96, 5, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-55F, -12F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 17, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 5
		bodyModel[5].setRotationPoint(-41F, -7F, -10.2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 17, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 6
		bodyModel[6].setRotationPoint(-41F, -7F, 9.2F);

		bodyModel[7].addBox(0F, 0F, 0F, 96, 5, 1, 0F); // Box 7
		bodyModel[7].setRotationPoint(-55F, -12F, 9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 13, 17, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 8
		bodyModel[8].setRotationPoint(-1F, -7F, -10.2F);

		bodyModel[9].addBox(0F, 0F, 0F, 27, 6, 1, 0F); // Box 9
		bodyModel[9].setRotationPoint(-28F, 4F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Box 10
		bodyModel[10].setRotationPoint(-28F, -7F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 7, 10, 1, 0F); // Box 11
		bodyModel[11].setRotationPoint(-18F, -6F, -10F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 12
		bodyModel[12].setRotationPoint(-28F, -6F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 13
		bodyModel[13].setRotationPoint(-3F, -6F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 29, 8, 1, 0F); // Box 14
		bodyModel[14].setRotationPoint(12F, 2F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 15
		bodyModel[15].setRotationPoint(25F, -6F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 16
		bodyModel[16].setRotationPoint(12F, -6F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 29, 1, 1, 0F); // Box 17
		bodyModel[17].setRotationPoint(12F, -7F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 18
		bodyModel[18].setRotationPoint(39F, -6F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 14, 6, 1, 0F); // Box 19
		bodyModel[19].setRotationPoint(-55F, 4F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 20
		bodyModel[20].setRotationPoint(-55F, -7F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 21
		bodyModel[21].setRotationPoint(-43F, -6F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 8, 10, 0, 0F); // Box 22
		bodyModel[22].setRotationPoint(-26F, -6F, -9.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 8, 10, 0, 0F); // Box 23
		bodyModel[23].setRotationPoint(-51F, -6F, -9.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 8, 10, 0, 0F); // Box 24
		bodyModel[24].setRotationPoint(-11F, -6F, -9.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 25
		bodyModel[25].setRotationPoint(14F, -6F, -9.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 26
		bodyModel[26].setRotationPoint(28F, -6F, -9.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 27
		bodyModel[27].setRotationPoint(-55F, -6F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, 0F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(41F, 2F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 8, 14, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 29
		bodyModel[29].setRotationPoint(53F, 2F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(41F, 2F, 9F);

		bodyModel[31].addBox(0F, 0F, 0F, 29, 8, 1, 0F); // Box 31
		bodyModel[31].setRotationPoint(12F, 2F, 9F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 32
		bodyModel[32].setRotationPoint(39F, -6F, 9F);

		bodyModel[33].addBox(0F, 0F, 0F, 29, 1, 1, 0F); // Box 33
		bodyModel[33].setRotationPoint(12F, -7F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[34].setRotationPoint(48F, -12F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(41F, -12F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(50F, -10F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(52F, -6F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F); // Box 39
		bodyModel[38].setRotationPoint(48F, -12F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -3F, 0F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(41F, -12F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F); // Box 41
		bodyModel[40].setRotationPoint(50F, -10F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F); // Box 42
		bodyModel[41].setRotationPoint(52F, -6F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(41F, -6F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 1F, 0F, 3F, 0F, 0F, 0F); // Box 46
		bodyModel[43].setRotationPoint(41F, -10F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, 2F, 0F, -3F, 0F, 0F, 0F); // Box 47
		bodyModel[44].setRotationPoint(41F, -10F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.45F, 0F, 0F, 0F); // Box 48
		bodyModel[45].setRotationPoint(41F, -6F, 9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.45F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.25F); // Box 50
		bodyModel[46].setRotationPoint(51F, -6F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -0.65F, 0F, 0F, -0.9F, 0F, 0F, 1.1F, 0F, 0F, 0.8F, 0F, 0F, -0.35F, 0F, 0F, -0.6F, 0F, 0F, 0.75F, 0F, 0F, 0.5F); // Box 51
		bodyModel[47].setRotationPoint(47F, -6F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0.8F, 0F, 0F, 1.1F, 0F, 0F, -0.9F, 0F, 0F, -0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.6F, 0F, 0F, -0.35F); // Box 52
		bodyModel[48].setRotationPoint(47F, -6F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 54
		bodyModel[49].setRotationPoint(47.5F, -12F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 0, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 55
		bodyModel[50].setRotationPoint(49.5F, -10F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 8, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 56
		bodyModel[51].setRotationPoint(51.5F, -6F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F); // Box 57
		bodyModel[52].setRotationPoint(43F, -6F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, -0.25F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0.45F); // Box 59
		bodyModel[53].setRotationPoint(51F, -6F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F, 0F, 0F, 0.5F, -1F, 0F, 1.5F, -1F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, 0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F); // Box 60
		bodyModel[54].setRotationPoint(48F, -6F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F); // Box 61
		bodyModel[55].setRotationPoint(43F, -6F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 17, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 62
		bodyModel[56].setRotationPoint(-1F, -7F, 9.2F);

		bodyModel[57].addBox(0F, 0F, 0F, 14, 6, 1, 0F); // Box 63
		bodyModel[57].setRotationPoint(-55F, 4F, 9F);

		bodyModel[58].addBox(0F, 0F, 0F, 7, 10, 1, 0F); // Box 64
		bodyModel[58].setRotationPoint(-18F, -6F, 9F);

		bodyModel[59].addBox(0F, 0F, 0F, 8, 10, 0, 0F); // Box 65
		bodyModel[59].setRotationPoint(-11F, -6F, 9.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 66
		bodyModel[60].setRotationPoint(-3F, -6F, 9F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 67
		bodyModel[61].setRotationPoint(-28F, -6F, 9F);

		bodyModel[62].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Box 68
		bodyModel[62].setRotationPoint(-28F, -7F, 9F);

		bodyModel[63].addBox(0F, 0F, 0F, 8, 10, 0, 0F); // Box 69
		bodyModel[63].setRotationPoint(-26F, -6F, 9.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 27, 6, 1, 0F); // Box 70
		bodyModel[64].setRotationPoint(-28F, 4F, 9F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 71
		bodyModel[65].setRotationPoint(-55F, -6F, 9F);

		bodyModel[66].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 72
		bodyModel[66].setRotationPoint(-55F, -7F, 9F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 73
		bodyModel[67].setRotationPoint(-43F, -6F, 9F);

		bodyModel[68].addBox(0F, 0F, 0F, 8, 10, 0, 0F); // Box 74
		bodyModel[68].setRotationPoint(-51F, -6F, 9.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 75
		bodyModel[69].setRotationPoint(12F, -6F, 9F);

		bodyModel[70].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 76
		bodyModel[70].setRotationPoint(14F, -6F, 9.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 78
		bodyModel[71].setRotationPoint(28F, -6F, 9.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 79
		bodyModel[72].setRotationPoint(25F, -6F, 9F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Box 75
		bodyModel[73].setRotationPoint(40F, -7F, 3F);

		bodyModel[74].addBox(0F, 0F, 0F, 29, 2, 18, 0F); // Box 76
		bodyModel[74].setRotationPoint(12F, 8F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Box 77
		bodyModel[75].setRotationPoint(41F, -7F, -3F);
		bodyModel[75].rotateAngleY = -3.14159265F;

		bodyModel[76].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 78
		bodyModel[76].setRotationPoint(40F, -12F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 79
		bodyModel[77].setRotationPoint(39.75F, -10F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[78].setRotationPoint(33.5F, 4F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 81
		bodyModel[79].setRotationPoint(33F, 0F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 83
		bodyModel[80].setRotationPoint(33.5F, 4F, 2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[81].setRotationPoint(33F, 0F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[82].setRotationPoint(32F, 0F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 86
		bodyModel[83].setRotationPoint(28.5F, 4F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 87
		bodyModel[84].setRotationPoint(28.5F, 4F, 2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[85].setRotationPoint(32F, 0F, 2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 89
		bodyModel[86].setRotationPoint(21.5F, 4F, 2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 91
		bodyModel[87].setRotationPoint(21F, 0F, 2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[88].setRotationPoint(21.5F, 4F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 93
		bodyModel[89].setRotationPoint(21F, 0F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[90].setRotationPoint(16.5F, 4F, 2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[91].setRotationPoint(20F, 0F, 2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[92].setRotationPoint(20F, 0F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 97
		bodyModel[93].setRotationPoint(16.5F, 4F, -9F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 7, 6, 0F); // Box 98
		bodyModel[94].setRotationPoint(12F, 1F, 3F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 7, 6, 0F); // Box 98
		bodyModel[95].setRotationPoint(12F, 1F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 99
		bodyModel[96].setRotationPoint(12.25F, -12F, -4.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 100
		bodyModel[97].setRotationPoint(12.25F, -12F, 3.25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[98].setRotationPoint(12F, 1F, 2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[99].setRotationPoint(12F, 1F, -3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 103
		bodyModel[100].setRotationPoint(-6.5F, 7F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[101].setRotationPoint(-3F, 3F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 106
		bodyModel[102].setRotationPoint(-2F, 3F, -3.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 107
		bodyModel[103].setRotationPoint(-2F, 3.5F, -2.75F);
		bodyModel[103].rotateAngleY = -1.57079633F;
		bodyModel[103].rotateAngleZ = 1.57079633F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 108
		bodyModel[104].setRotationPoint(-1F, 3.5F, 4.75F);
		bodyModel[104].rotateAngleY = 2.18166156F;
		bodyModel[104].rotateAngleZ = 1.57079633F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 109
		bodyModel[105].setRotationPoint(-2F, 3F, 2.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 110
		bodyModel[106].setRotationPoint(-28.5F, 3F, -3.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 111
		bodyModel[107].setRotationPoint(-28.5F, 3.5F, -2.75F);
		bodyModel[107].rotateAngleY = -1.57079633F;
		bodyModel[107].rotateAngleZ = 1.57079633F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 112
		bodyModel[108].setRotationPoint(-28.5F, 3F, 2.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 113
		bodyModel[109].setRotationPoint(-27.5F, 3.5F, 2.75F);
		bodyModel[109].rotateAngleY = 1.57079633F;
		bodyModel[109].rotateAngleZ = 1.57079633F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[110].setRotationPoint(-14.5F, 7F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 115
		bodyModel[111].setRotationPoint(-15F, 3F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[112].setRotationPoint(-16F, 3F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		bodyModel[113].setRotationPoint(-19.5F, 7F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 118
		bodyModel[114].setRotationPoint(-27.5F, 7F, -8.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 119
		bodyModel[115].setRotationPoint(-27.5F, 3F, -9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[116].setRotationPoint(-26.5F, 7F, 2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
		bodyModel[117].setRotationPoint(-27F, 3F, 2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 122
		bodyModel[118].setRotationPoint(-42.5F, 3F, 2.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 123
		bodyModel[119].setRotationPoint(-42.5F, 3F, -3.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 124
		bodyModel[120].setRotationPoint(-42.5F, 3.5F, -2.75F);
		bodyModel[120].rotateAngleY = -1.57079633F;
		bodyModel[120].rotateAngleZ = 1.57079633F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 125
		bodyModel[121].setRotationPoint(-41.5F, 3.5F, 2.75F);
		bodyModel[121].rotateAngleY = 1.57079633F;
		bodyModel[121].rotateAngleZ = 1.57079633F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 126
		bodyModel[122].setRotationPoint(-47F, 7F, 2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[123].setRotationPoint(-43.5F, 3F, 2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[124].setRotationPoint(-47F, 7F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[125].setRotationPoint(-43.5F, 3F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[126].setRotationPoint(-54F, 7F, 2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		bodyModel[127].setRotationPoint(-54F, 7F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 132
		bodyModel[128].setRotationPoint(-54.5F, 3F, 2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 133
		bodyModel[129].setRotationPoint(-54.5F, 3F, -9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[130].setRotationPoint(-5F, -1F, 8F);
		bodyModel[130].rotateAngleY = -0.95993109F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 135
		bodyModel[131].setRotationPoint(-1F, 8.5F, 3.25F);
		bodyModel[131].rotateAngleY = 1.57079633F;
		bodyModel[131].rotateAngleZ = 1.57079633F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 136
		bodyModel[132].setRotationPoint(-27.5F, 8.5F, 3.25F);
		bodyModel[132].rotateAngleY = 1.57079633F;
		bodyModel[132].rotateAngleZ = 1.57079633F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 137
		bodyModel[133].setRotationPoint(-41.5F, 8.5F, 3.25F);
		bodyModel[133].rotateAngleY = 1.57079633F;
		bodyModel[133].rotateAngleZ = 1.57079633F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 138
		bodyModel[134].setRotationPoint(-42.5F, 8.5F, -3.25F);
		bodyModel[134].rotateAngleY = -1.57079633F;
		bodyModel[134].rotateAngleZ = 1.57079633F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 139
		bodyModel[135].setRotationPoint(-28.5F, 8.5F, -3.25F);
		bodyModel[135].rotateAngleY = -1.57079633F;
		bodyModel[135].rotateAngleZ = 1.57079633F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 140
		bodyModel[136].setRotationPoint(-2F, 8.5F, -3.25F);
		bodyModel[136].rotateAngleY = -1.57079633F;
		bodyModel[136].rotateAngleZ = 1.57079633F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 142
		bodyModel[137].setRotationPoint(-1F, 3.5F, 2.75F);
		bodyModel[137].rotateAngleY = 1.57079633F;
		bodyModel[137].rotateAngleZ = 1.57079633F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 143
		bodyModel[138].setRotationPoint(-4F, 1.5F, 9F);
		bodyModel[138].rotateAngleY = -3.14159265F;
		bodyModel[138].rotateAngleZ = 1.57079633F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 144
		bodyModel[139].setRotationPoint(-5F, 1F, 8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 145
		bodyModel[140].setRotationPoint(-13F, 1F, 8.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 146
		bodyModel[141].setRotationPoint(-18F, 1F, 8.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 95, 2, 4, 0F); // Box 147
		bodyModel[142].setRotationPoint(-55F, -12F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 95, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 149
		bodyModel[143].setRotationPoint(-55F, -10F, -9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 95, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[144].setRotationPoint(-55F, -10F, 5F);

		bodyModel[145].addBox(0F, 0F, 0F, 95, 2, 4, 0F); // Box 152
		bodyModel[145].setRotationPoint(-55F, -12F, 5F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 153
		bodyModel[146].setRotationPoint(41F, 2F, -9F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 8, 6, 0F); // Box 154
		bodyModel[147].setRotationPoint(41F, 2F, 3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.25F); // Box 155
		bodyModel[148].setRotationPoint(42F, 3F, 4.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 156
		bodyModel[149].setRotationPoint(44.5F, 5F, -1.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 157
		bodyModel[150].setRotationPoint(44F, -1F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 158
		bodyModel[151].setRotationPoint(44.5F, 2.5F, -2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[152].setRotationPoint(42F, 4F, -8.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[153].setRotationPoint(42F, 4F, -6.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[154].setRotationPoint(42F, 4F, -4.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 163
		bodyModel[155].setRotationPoint(49F, 3F, -6.75F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 4, 12, 0F); // Box 164
		bodyModel[156].setRotationPoint(46.5F, -12F, -6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 8, 0, 0F, 0F, 0F, -0.5F, -1F, 0F, -1.5F, -1F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, 0.875F, 0F, 0F, -0.125F); // Box 161
		bodyModel[157].setRotationPoint(48F, -6F, -8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[158].setRotationPoint(40F, -10F, -7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[159].setRotationPoint(40F, -10F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[160].setRotationPoint(40F, -10F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[161].setRotationPoint(40F, -10F, 7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 166
		bodyModel[162].setRotationPoint(54F, 6.5F, -3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F); // Box 168
		bodyModel[163].setRotationPoint(50F, 3F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F, 0F, -1F, 0.75F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F); // Box 169
		bodyModel[164].setRotationPoint(50F, 2F, -6F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 170
		bodyModel[165].setRotationPoint(44.5F, 2.5F, 2.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
		bodyModel[166].setRotationPoint(45F, 6F, -1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 13, 1, 20, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 171
		bodyModel[167].setRotationPoint(41F, 11F, -10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 13, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 172
		bodyModel[168].setRotationPoint(41F, 12F, -10F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Lamp1
		bodyModel[169].setRotationPoint(53.25F, 5.1F, -3.38F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Lamp2
		bodyModel[170].setRotationPoint(53.25F, 5.1F, 2.38F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SmallLamp1
		bodyModel[171].setRotationPoint(53.25F, 5.25F, -4.25F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SmallLamp2
		bodyModel[172].setRotationPoint(53.25F, 5.25F, 3.25F);
		this.flipAll();
	}
}