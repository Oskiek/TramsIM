package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ST12_Gelenk extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public ST12_Gelenk() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[80];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
        bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 16
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
        bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18
        bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 19
        bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
        bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 21
        bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 22
        bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 24
        bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 25
        bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 26
        bodyModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 116
        bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 130
        bodyModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 34
        bodyModel[14] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 35
        bodyModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 36
        bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 37
        bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 38
        bodyModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 39
        bodyModel[19] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 44
        bodyModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 45
        bodyModel[21] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 46
        bodyModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 47
        bodyModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 48
        bodyModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 49
        bodyModel[25] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 50
        bodyModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 51
        bodyModel[27] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 46
        bodyModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 47
        bodyModel[29] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 48
        bodyModel[30] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 49
        bodyModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 50
        bodyModel[32] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 18
        bodyModel[33] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 19
        bodyModel[34] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 20
        bodyModel[35] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 21
        bodyModel[36] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 22
        bodyModel[37] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 23
        bodyModel[38] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 24
        bodyModel[39] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 25
        bodyModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
        bodyModel[41] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 27
        bodyModel[42] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 29
        bodyModel[43] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 30
        bodyModel[44] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 31
        bodyModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 64
        bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 65
        bodyModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 66
        bodyModel[48] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 28
        bodyModel[49] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 29
        bodyModel[50] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 16
        bodyModel[51] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 17
        bodyModel[52] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 23
        bodyModel[53] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 24
        bodyModel[54] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 25
        bodyModel[55] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 26
        bodyModel[56] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 68
        bodyModel[57] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 50
        bodyModel[58] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 68
        bodyModel[59] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 71
        bodyModel[60] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 72
        bodyModel[61] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 73
        bodyModel[62] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 74
        bodyModel[63] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 76
        bodyModel[64] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 77
        bodyModel[65] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 78
        bodyModel[66] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 79
        bodyModel[67] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 80
        bodyModel[68] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 81
        bodyModel[69] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 82
        bodyModel[70] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 83
        bodyModel[71] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 84
        bodyModel[72] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 85
        bodyModel[73] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 86
        bodyModel[74] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 87
        bodyModel[75] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 88
        bodyModel[76] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 89
        bodyModel[77] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 90
        bodyModel[78] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 91
        bodyModel[79] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 79

        bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 3.5F, 1F, -1F, 3.5F); // Box 13
        bodyModel[0].setRotationPoint(-1.5F, -18F, -5.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -2F, -1F, 0F, -2F, -1F, 1F, -3F, 1F, 1F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 16
        bodyModel[1].setRotationPoint(-1.5F, -19F, -7.5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,1F, -3F, 1F, 1F, -3F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
        bodyModel[2].setRotationPoint(-1.5F, -19F, 6.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, -1F, 1F, 0F, -1F, 1F, 1F, -1F, 3.5F, 1F, -1F, 3.5F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 18
        bodyModel[3].setRotationPoint(-1.5F, -18F, 3.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        bodyModel[4].setRotationPoint(-1.5F, -14F, 6.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 20
        bodyModel[5].setRotationPoint(-1.5F, -14F, -7.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
        bodyModel[6].setRotationPoint(-1.5F, 1.99F, -5.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 22
        bodyModel[7].setRotationPoint(1.5F, 1.99F, -6.5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24
        bodyModel[8].setRotationPoint(1.5F, 1.99F, 0.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 25
        bodyModel[9].setRotationPoint(-4.5F, 1.99F, 0.5F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 26
        bodyModel[10].setRotationPoint(-4.5F, 1.99F, -6.5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[11].setRotationPoint(-1F, -12F, -6.5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 130
        bodyModel[12].setRotationPoint(-1.5F, -13F, -6F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
        bodyModel[13].setRotationPoint(-1.5F, -8F, -6F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
        bodyModel[14].setRotationPoint(1.5F, -12F, -6.5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
        bodyModel[15].setRotationPoint(-1.5F, -12F, -6.5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 37
        bodyModel[16].setRotationPoint(-1.5F, -9F, -6.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
        bodyModel[17].setRotationPoint(1F, -9F, -6.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
        bodyModel[18].setRotationPoint(1F, -12F, -6.5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 44
        bodyModel[19].setRotationPoint(-1.5F, -8F, 5.5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
        bodyModel[20].setRotationPoint(-1F, -12F, 5F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 46
        bodyModel[21].setRotationPoint(1.5F, -12F, 5F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
        bodyModel[22].setRotationPoint(-1.5F, -13F, 5.5F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
        bodyModel[23].setRotationPoint(1F, -12F, 6F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
        bodyModel[24].setRotationPoint(-1.5F, -12F, 6F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
        bodyModel[25].setRotationPoint(-1.5F, -9F, 6F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
        bodyModel[26].setRotationPoint(1F, -9F, 6F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -2F, -1F, 0F, -2F, -1F, 1F, -3F, 1F, 1F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 46
        bodyModel[27].setRotationPoint(-1.5F, -21F, -9F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, -0.75F, 3.5F, 0F, -0.75F, 3.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, -1F, 3.5F, 1F, -1F, 3.5F); // Box 47
        bodyModel[28].setRotationPoint(-1.5F, -20.5F, -6.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.75F, 3.5F, 0F, -0.75F, 3.5F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 1F, -1F, 3.5F, 1F, -1F, 3.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0.5F); // Box 48
        bodyModel[29].setRotationPoint(-1.5F, -20.5F, 3.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,1F, -3F, 1F, 1F, -3F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        bodyModel[30].setRotationPoint(-1.5F, -21F, 8F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[31].setRotationPoint(-1.5F, -6F, 8.5F);

        bodyModel[32].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 18
        bodyModel[32].setRotationPoint(-1F, 3F, -1F);

        bodyModel[33].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 19
        bodyModel[33].setRotationPoint(-1F, 4.5F, -5F);

        bodyModel[34].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 20
        bodyModel[34].setRotationPoint(-3F, 4.75F, -5.5F);

        bodyModel[35].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 21
        bodyModel[35].setRotationPoint(-8.5F, 3F, -5F);

        bodyModel[36].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 22
        bodyModel[36].setRotationPoint(-3F, 4.75F, 4.5F);

        bodyModel[37].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[37].setRotationPoint(-8.5F, 3F, 5F);

        bodyModel[38].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 24
        bodyModel[38].setRotationPoint(3.5F, 3F, 5F);

        bodyModel[39].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 25
        bodyModel[39].setRotationPoint(3.5F, 3F, -5F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
        bodyModel[40].setRotationPoint(5.5F, 5F, -6F);

        bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
        bodyModel[41].setRotationPoint(-6.5F, 5F, -6F);

        bodyModel[42].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 29
        bodyModel[42].setRotationPoint(-7F, 5F, -1F);

        bodyModel[43].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 30
        bodyModel[43].setRotationPoint(-7.5F, 4F, -1F);

        bodyModel[44].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 31
        bodyModel[44].setRotationPoint(1.5F, 4F, -3F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 10, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 64
        bodyModel[45].setRotationPoint(1.5F, -17F, -7F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 11, 0, 0F,0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 65
        bodyModel[46].setRotationPoint(1.5F, -6F, -7.5F);

        bodyModel[47].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 66
        bodyModel[47].setRotationPoint(-1F, 4F, -1F);

        bodyModel[48].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 28
        bodyModel[48].setRotationPoint(-3F, 6F, -7F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 29
        bodyModel[49].setRotationPoint(-9F, 6F, -8F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -2F, -17F, 0F, 0F, -17F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, -17F, 0F, 0F, -17F, 0F, 0F, -1F, 0F, 1F); // Box 16
        bodyModel[50].setRotationPoint(-10F, 6F, -8F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 1F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, -2F); // Box 17
        bodyModel[51].setRotationPoint(-10F, 6F, 7F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, -1F, -17F, 0F, 0F, -16F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, -1F, -17F, 0F, 0F, -16F, 0F, -1F, -1F, 0F, 1F); // Box 23
        bodyModel[52].setRotationPoint(8F, 6F, 6F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
        bodyModel[53].setRotationPoint(9F, 6F, 1F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        bodyModel[54].setRotationPoint(-10F, 6F, 1F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, -1F, -16F, 0F, -3F, -17F, 0F, 2F, -1F, 0F, 1F, -1F, 0F, -1F, -16F, 0F, -3F, -17F, 0F, 2F, -1F, 0F, 1F); // Box 26
        bodyModel[55].setRotationPoint(8F, 6F, -9F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 68
        bodyModel[56].setRotationPoint(-1.5F, -17F, 8F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 50
        bodyModel[57].setRotationPoint(-1.5F, -6F, -9.5F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 68
        bodyModel[58].setRotationPoint(-1.5F, -17F, -9F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 71
        bodyModel[59].setRotationPoint(6F, 6F, -9F);

        bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 72
        bodyModel[60].setRotationPoint(-7F, 4.5F, -7F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 73
        bodyModel[61].setRotationPoint(-9F, 6F, 7F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 74
        bodyModel[62].setRotationPoint(6F, 6F, 8F);

        bodyModel[63].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 76
        bodyModel[63].setRotationPoint(-7F, 4.5F, 6F);

        bodyModel[64].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 77
        bodyModel[64].setRotationPoint(5F, 4.5F, 6F);

        bodyModel[65].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 78
        bodyModel[65].setRotationPoint(5F, 4.5F, -7F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        bodyModel[66].setRotationPoint(-0.5F, 4F, -8F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        bodyModel[67].setRotationPoint(-0.5F, 4F, 7F);

        bodyModel[68].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 81
        bodyModel[68].setRotationPoint(-3F, 6F, 6F);

        bodyModel[69].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
        bodyModel[69].setRotationPoint(4F, 6F, 8F);

        bodyModel[70].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 83
        bodyModel[70].setRotationPoint(-6F, 6F, 8F);

        bodyModel[71].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 84
        bodyModel[71].setRotationPoint(-6F, 6F, -9F);

        bodyModel[72].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 85
        bodyModel[72].setRotationPoint(4F, 6F, -9F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 11, 0, 0F,0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 86
        bodyModel[73].setRotationPoint(-3.5F, -6F, -7.5F);

        bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 87
        bodyModel[74].setRotationPoint(-3.5F, -17F, -7F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 10, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F); // Box 88
        bodyModel[75].setRotationPoint(1.5F, -17F, 7F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 11, 0, 0F,0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 89
        bodyModel[76].setRotationPoint(1.5F, -6F, 7.5F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 11, 0, 0F,0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 90
        bodyModel[77].setRotationPoint(-3.5F, -6F, 7.5F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 10, 0, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F); // Box 91
        bodyModel[78].setRotationPoint(-3.5F, -17F, 7F);

        bodyModel[79].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 79
        bodyModel[79].setRotationPoint(-1F, 4.5F, -3F);
    }
}