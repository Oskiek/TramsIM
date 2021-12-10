
package metroim.models.trains; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class munich_A extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public munich_A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[122];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{

		bodyModel[0] = new ModelRendererTurbo(this, 133, 104, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 356, 136, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 93, 145, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 7, 189, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 93, 134, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 385, 124, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 80, 134, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 80, 145, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 62, 145, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 62, 134, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 49, 134, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 98, 124, textureX, textureY); // Box 26
		bodyModel[13] = new ModelRendererTurbo(this, 111, 124, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 98, 113, textureX, textureY); // Box 28
		bodyModel[15] = new ModelRendererTurbo(this, 111, 113, textureX, textureY); // Box 29
		bodyModel[16] = new ModelRendererTurbo(this, 36, 124, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 49, 124, textureX, textureY); // Box 35
		bodyModel[18] = new ModelRendererTurbo(this, 36, 113, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 35, 176, textureX, textureY); // Box 43
		bodyModel[21] = new ModelRendererTurbo(this, 111, 134, textureX, textureY); // Box 44
		bodyModel[22] = new ModelRendererTurbo(this, 111, 145, textureX, textureY); // Box 45
		bodyModel[23] = new ModelRendererTurbo(this, 18, 124, textureX, textureY); // Box 46
		bodyModel[24] = new ModelRendererTurbo(this, 18, 113, textureX, textureY); // Box 47
		bodyModel[25] = new ModelRendererTurbo(this, 466, 110, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 466, 143, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 173, 204, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 173, 214, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 100, 204, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 100, 214, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 131, 198, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 131, 206, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 173, 224, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 131, 214, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 100, 224, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 131, 174, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 173, 174, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 100, 174, textureX, textureY); // Box 59
		bodyModel[40] = new ModelRendererTurbo(this, 192, 224, textureX, textureY); // Box 63
		bodyModel[41] = new ModelRendererTurbo(this, 152, 214, textureX, textureY); // Box 64
		bodyModel[42] = new ModelRendererTurbo(this, 115, 224, textureX, textureY); // Box 65
		bodyModel[43] = new ModelRendererTurbo(this, 192, 214, textureX, textureY); // Box 66
		bodyModel[44] = new ModelRendererTurbo(this, 152, 206, textureX, textureY); // Box 67
		bodyModel[45] = new ModelRendererTurbo(this, 115, 214, textureX, textureY); // Box 68
		bodyModel[46] = new ModelRendererTurbo(this, 192, 204, textureX, textureY); // Box 69
		bodyModel[47] = new ModelRendererTurbo(this, 152, 198, textureX, textureY); // Box 70
		bodyModel[48] = new ModelRendererTurbo(this, 115, 204, textureX, textureY); // Box 71
		bodyModel[49] = new ModelRendererTurbo(this, 192, 174, textureX, textureY); // Box 78
		bodyModel[50] = new ModelRendererTurbo(this, 152, 174, textureX, textureY); // Box 79
		bodyModel[51] = new ModelRendererTurbo(this, 115, 174, textureX, textureY); // Box 80
		bodyModel[52] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 103
		bodyModel[53] = new ModelRendererTurbo(this, 61, 156, textureX, textureY); // Box 104
		bodyModel[54] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 105
		bodyModel[55] = new ModelRendererTurbo(this, 9, 156, textureX, textureY); // Box 106
		bodyModel[56] = new ModelRendererTurbo(this, 466, 110, textureX, textureY); // Box 107
		bodyModel[57] = new ModelRendererTurbo(this, 464, 116, textureX, textureY); // Box 108
		bodyModel[58] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 109
		bodyModel[59] = new ModelRendererTurbo(this, 469, 89, textureX, textureY); // Box 101
		bodyModel[60] = new ModelRendererTurbo(this, 321, 163, textureX, textureY); // Box 101
		bodyModel[61] = new ModelRendererTurbo(this, 344, 137, textureX, textureY); // Box 103
		bodyModel[62] = new ModelRendererTurbo(this, 335, 170, textureX, textureY); // Box 106
		bodyModel[63] = new ModelRendererTurbo(this, 341, 170, textureX, textureY); // Box 107
		bodyModel[64] = new ModelRendererTurbo(this, 321, 176, textureX, textureY); // Box 109
		bodyModel[65] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 110
		bodyModel[66] = new ModelRendererTurbo(this, 67, 161, textureX, textureY); // Box 111
		bodyModel[67] = new ModelRendererTurbo(this, 410, 133, textureX, textureY); // Box 112
		bodyModel[68] = new ModelRendererTurbo(this, 418, 133, textureX, textureY); // Box 113
		bodyModel[69] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 114
		bodyModel[70] = new ModelRendererTurbo(this, 57, 72, textureX, textureY); // Box 173
		bodyModel[71] = new ModelRendererTurbo(this, 57, 72, textureX, textureY); // Box 174
		bodyModel[72] = new ModelRendererTurbo(this, 24, 53, textureX, textureY); // Box 119
		bodyModel[73] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 169
		bodyModel[74] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 170
		bodyModel[75] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 171
		bodyModel[76] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 172
		bodyModel[77] = new ModelRendererTurbo(this, 89, 14, textureX, textureY); // Box 125
		bodyModel[78] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 126
		bodyModel[79] = new ModelRendererTurbo(this, 121, 14, textureX, textureY); // Box 127
		bodyModel[80] = new ModelRendererTurbo(this, 199, 14, textureX, textureY); // Box 129
		bodyModel[81] = new ModelRendererTurbo(this, 211, 37, textureX, textureY); // Box 130
		bodyModel[82] = new ModelRendererTurbo(this, 186, 37, textureX, textureY); // Box 131
		bodyModel[83] = new ModelRendererTurbo(this, 147, 37, textureX, textureY); // Box 132
		bodyModel[84] = new ModelRendererTurbo(this, 89, 37, textureX, textureY); // Box 134
		bodyModel[85] = new ModelRendererTurbo(this, 89, 3, textureX, textureY); // Box 135
		bodyModel[86] = new ModelRendererTurbo(this, 94, 3, textureX, textureY); // Box 136
		bodyModel[87] = new ModelRendererTurbo(this, 119, 3, textureX, textureY); // Box 137
		bodyModel[88] = new ModelRendererTurbo(this, 197, 3, textureX, textureY); // Box 139
		bodyModel[89] = new ModelRendererTurbo(this, 91, 45, textureX, textureY); // Box 141
		bodyModel[90] = new ModelRendererTurbo(this, 149, 45, textureX, textureY); // Box 142
		bodyModel[91] = new ModelRendererTurbo(this, 188, 45, textureX, textureY); // Box 143
		bodyModel[92] = new ModelRendererTurbo(this, 213, 45, textureX, textureY); // Box 144
		bodyModel[93] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 108
		bodyModel[94] = new ModelRendererTurbo(this, 327, 163, textureX, textureY); // Box 108
		bodyModel[95] = new ModelRendererTurbo(this, 99, 146, textureX, textureY); // Box 108
		bodyModel[96] = new ModelRendererTurbo(this, 99, 146, textureX, textureY); // Box 108
		bodyModel[97] = new ModelRendererTurbo(this, 212, 168, textureX, textureY); // Box 110
		bodyModel[98] = new ModelRendererTurbo(this, 271, 183, textureX, textureY); // TS_Light_L_Small
		bodyModel[99] = new ModelRendererTurbo(this, 271, 183, textureX, textureY); // Box 345
		bodyModel[100] = new ModelRendererTurbo(this, 280, 183, textureX, textureY); // Box 357
		bodyModel[101] = new ModelRendererTurbo(this, 280, 183, textureX, textureY); // Box 223
		bodyModel[102] = new ModelRendererTurbo(this, 281, 183, textureX, textureY); // Box 231
		bodyModel[103] = new ModelRendererTurbo(this, 281, 188, textureX, textureY); // Box 121
		bodyModel[104] = new ModelRendererTurbo(this, 280, 183, textureX, textureY); // Box 122
		bodyModel[105] = new ModelRendererTurbo(this, 271, 183, textureX, textureY); // Box 123
		bodyModel[106] = new ModelRendererTurbo(this, 271, 183, textureX, textureY); // Box 124
		bodyModel[107] = new ModelRendererTurbo(this, 280, 183, textureX, textureY); // Box 125
		bodyModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 116
		bodyModel[109] = new ModelRendererTurbo(this, 15, 0, textureX, textureY); // Box 117
		bodyModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 118
		bodyModel[111] = new ModelRendererTurbo(this, 15, 0, textureX, textureY); // Box 119
		bodyModel[112] = new ModelRendererTurbo(this, 115, 234, textureX, textureY); // Box 120
		bodyModel[113] = new ModelRendererTurbo(this, 152, 222, textureX, textureY); // Box 121
		bodyModel[114] = new ModelRendererTurbo(this, 192, 234, textureX, textureY); // Box 122
		bodyModel[115] = new ModelRendererTurbo(this, 115, 234, textureX, textureY); // Box 123
		bodyModel[116] = new ModelRendererTurbo(this, 152, 222, textureX, textureY); // Box 124
		bodyModel[117] = new ModelRendererTurbo(this, 192, 234, textureX, textureY); // Box 125
		bodyModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 132
		bodyModel[119] = new ModelRendererTurbo(this, 15, 0, textureX, textureY); // Box 133
		bodyModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 134
		bodyModel[121] = new ModelRendererTurbo(this, 15, 0, textureX, textureY); // Box 135

		bodyModel[0].addShapeBox(0F, 0F, 0F, 67, 3, 22, 0F,-2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-32F, 2F, -11.25F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 6, 22, 0F,0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.2F, 1.5F, -0.5F); // Box 2
		bodyModel[1].setRotationPoint(-31F, -5.5F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(-12F, -4F, 10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 22, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[3].setRotationPoint(34F, -4F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 11
		bodyModel[4].setRotationPoint(-12F, -15.5F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 9, 21, 0F,-0.35F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, 0.2F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0.2F, 1F, -0.5F); // Box 15
		bodyModel[5].setRotationPoint(-31F, -15.5F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 16
		bodyModel[6].setRotationPoint(-7F, -15.5F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[7].setRotationPoint(-7F, -4F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[8].setRotationPoint(21F, -4F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[9].setRotationPoint(16F, -4F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 20
		bodyModel[10].setRotationPoint(16F, -15.5F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 21
		bodyModel[11].setRotationPoint(21F, -15.5F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[12].setRotationPoint(16F, -4F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[13].setRotationPoint(21F, -4F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 28
		bodyModel[14].setRotationPoint(16F, -15.5F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 29
		bodyModel[15].setRotationPoint(21F, -15.5F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[16].setRotationPoint(-12F, -4F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 35
		bodyModel[17].setRotationPoint(-7F, -4F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 36
		bodyModel[18].setRotationPoint(-12F, -15.5F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 37
		bodyModel[19].setRotationPoint(-7F, -15.5F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 9, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 43
		bodyModel[20].setRotationPoint(34F, -15.5F, -10.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 44
		bodyModel[21].setRotationPoint(-28F, -15.5F, 10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[22].setRotationPoint(-28F, -4F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[23].setRotationPoint(-28F, -4F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 47
		bodyModel[24].setRotationPoint(-28F, -15.5F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 39
		bodyModel[25].setRotationPoint(-22F, -16F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[26].setRotationPoint(-22F, -4F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 6, 20, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[27].setRotationPoint(-30F, -4F, -10F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 42
		bodyModel[28].setRotationPoint(13F, -1F, 4F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 43
		bodyModel[29].setRotationPoint(-2F, -1F, 4F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 44
		bodyModel[30].setRotationPoint(15F, -6F, 4F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 45
		bodyModel[31].setRotationPoint(-2F, -6F, 4F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 46
		bodyModel[32].setRotationPoint(12F, -2F, 4F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 47
		bodyModel[33].setRotationPoint(-2F, -2F, 4F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 48
		bodyModel[34].setRotationPoint(26F, -1F, 4F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 49
		bodyModel[35].setRotationPoint(26F, -2F, 4F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 50
		bodyModel[36].setRotationPoint(26F, -6F, 4F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 57
		bodyModel[37].setRotationPoint(-16F, -2F, 4F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 58
		bodyModel[38].setRotationPoint(-15F, -1F, 4F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 59
		bodyModel[39].setRotationPoint(-13F, -6F, 4F);

		bodyModel[40].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 63
		bodyModel[40].setRotationPoint(26F, -1F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 64
		bodyModel[41].setRotationPoint(26F, -2F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 65
		bodyModel[42].setRotationPoint(26F, -6F, -10F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 66
		bodyModel[43].setRotationPoint(-2F, -1F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 67
		bodyModel[44].setRotationPoint(-2F, -2F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 68
		bodyModel[45].setRotationPoint(-2F, -6F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 69
		bodyModel[46].setRotationPoint(13F, -1F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 70
		bodyModel[47].setRotationPoint(12F, -2F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 71
		bodyModel[48].setRotationPoint(15F, -6F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 78
		bodyModel[49].setRotationPoint(-15F, -1F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 79
		bodyModel[50].setRotationPoint(-16F, -2F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 80
		bodyModel[51].setRotationPoint(-13F, -6F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 62, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[52].setRotationPoint(-28F, -17.5F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 21, 0F,-0.45F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.45F, 0.5F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.35F, 0F, 0F); // Box 104
		bodyModel[53].setRotationPoint(-31F, -17.5F, -10.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 62, 2, 1, 0F,0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[54].setRotationPoint(-28F, -17.5F, 10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 21, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 106
		bodyModel[55].setRotationPoint(34F, -17.5F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 107
		bodyModel[56].setRotationPoint(33F, 2.5F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 108
		bodyModel[57].setRotationPoint(-32.7F, 2.5F, -1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 65, 1, 20, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 109
		bodyModel[58].setRotationPoint(-30F, -19F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 101
		bodyModel[59].setRotationPoint(-22F, -18F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.35F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0.5F, 0.2F, 1F, -1F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0.2F, 1F, 0.5F); // Box 101
		bodyModel[60].setRotationPoint(-31F, -15.5F, -11.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 2, 15, 0F,-0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[61].setRotationPoint(-30.71F, -17.5F, -7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 106
		bodyModel[62].setRotationPoint(34F, -15.5F, -11.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 107
		bodyModel[63].setRotationPoint(34F, -15.5F, 10.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 109
		bodyModel[64].setRotationPoint(-22F, -14F, -10.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 110
		bodyModel[65].setRotationPoint(-29F, -17.5F, 10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 111
		bodyModel[66].setRotationPoint(-29F, -17.5F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 112
		bodyModel[67].setRotationPoint(-31F, -15.5F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 113
		bodyModel[68].setRotationPoint(-31F, -15.5F, 10F);

		bodyModel[69].addBox(0F, 0F, 0F, 23, 3, 8, 0F); // Box 114
		bodyModel[69].setRotationPoint(-10F, 5F, -8F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 173
		bodyModel[70].setRotationPoint(-23F, 5F, -1F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 174
		bodyModel[71].setRotationPoint(24F, 5F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[72].setRotationPoint(-30F, 2F, -6F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 169
		bodyModel[73].setRotationPoint(-31F, -3F, 8.7F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 170
		bodyModel[74].setRotationPoint(-31F, -3F, 7.15F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 171
		bodyModel[75].setRotationPoint(-31F, -3F, -8.15F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 172
		bodyModel[76].setRotationPoint(-31F, -3F, -9.7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[77].setRotationPoint(-30F, -4F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[78].setRotationPoint(-23F, -4F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[79].setRotationPoint(-2F, -4F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[80].setRotationPoint(26F, -4F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[81].setRotationPoint(-30F, -4F, 10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[82].setRotationPoint(-23F, -4F, 10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[83].setRotationPoint(-2F, -4F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[84].setRotationPoint(26F, -4F, 10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 135
		bodyModel[85].setRotationPoint(-29F, -15.5F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 136
		bodyModel[86].setRotationPoint(-23F, -15.5F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 137
		bodyModel[87].setRotationPoint(-2F, -15.5F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 8, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 139
		bodyModel[88].setRotationPoint(26F, -15.5F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 141
		bodyModel[89].setRotationPoint(26F, -15.5F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 142
		bodyModel[90].setRotationPoint(-2F, -15.5F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 143
		bodyModel[91].setRotationPoint(-23F, -15.5F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 144
		bodyModel[92].setRotationPoint(-29F, -15.5F, 10F);

		bodyModel[93].addBox(0F, 0F, 0F, 23, 3, 8, 0F); // Box 108
		bodyModel[93].setRotationPoint(-10F, 5F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.35F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.35F, 0F, -1F, 0.2F, 1F, 0.5F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.2F, 1F, -1F); // Box 108
		bodyModel[94].setRotationPoint(-31F, -15.5F, 10.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 108
		bodyModel[95].setRotationPoint(-31F, 2F, 4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[96].setRotationPoint(-31F, 2F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,-0.7F, -1.25F, -1F, 0F, -1F, -1.1F, 0F, -1F, -1.1F, -0.7F, -1.25F, -1F, -0.45F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.5F); // Box 110
		bodyModel[97].setRotationPoint(-31F, -20F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // TS_Light_L_Small
		bodyModel[98].setRotationPoint(-31.4F, -3F, 5.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, 0F); // Box 345
		bodyModel[99].setRotationPoint(-31.4F, -1F, 5.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.55F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.55F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F); // Box 357
		bodyModel[100].setRotationPoint(-31.4F, -2.75F, 8.25F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.55F, -0.25F); // Box 223
		bodyModel[101].setRotationPoint(-31.4F, -2.75F, 5.25F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.45F, 0F, 0F, -3.45F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, -3.45F, 0F, -2.25F, -3.45F); // Box 231
		bodyModel[102].setRotationPoint(-31.3F, -2F, 5.95F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.45F, 0F, 0F, -3.45F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, -3.45F, 0F, -2.25F, -3.45F); // Box 121
		bodyModel[103].setRotationPoint(-31.3F, -2F, -8.55F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.55F, -0.25F); // Box 122
		bodyModel[104].setRotationPoint(-31.4F, -2.75F, -9.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, 0F); // Box 123
		bodyModel[105].setRotationPoint(-31.4F, -1F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[106].setRotationPoint(-31.4F, -3F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.55F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.55F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F); // Box 125
		bodyModel[107].setRotationPoint(-31.4F, -2.75F, -6.25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 116
		bodyModel[108].setRotationPoint(-2.5F, -18F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 117
		bodyModel[109].setRotationPoint(-2.5F, -18F, 4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 118
		bodyModel[110].setRotationPoint(15F, -18F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 119
		bodyModel[111].setRotationPoint(15F, -18F, 4F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 120
		bodyModel[112].setRotationPoint(6.5F, -6F, -10F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 121
		bodyModel[113].setRotationPoint(5F, -2F, -10F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 122
		bodyModel[114].setRotationPoint(5.5F, -1F, -10F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 123
		bodyModel[115].setRotationPoint(6.5F, -6F, 4F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 124
		bodyModel[116].setRotationPoint(5F, -2F, 4F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 125
		bodyModel[117].setRotationPoint(5.5F, -1F, 4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 132
		bodyModel[118].setRotationPoint(25.5F, -18F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 133
		bodyModel[119].setRotationPoint(25.5F, -18F, 4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 134
		bodyModel[120].setRotationPoint(-13.5F, -18F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 135
		bodyModel[121].setRotationPoint(-13.5F, -18F, 4F);
		this.flipAll();
	}
}