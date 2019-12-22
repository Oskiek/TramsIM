package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class LohnerE1_Gelenk extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public LohnerE1_Gelenk() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[67];

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
        bodyModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 27
        bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 29
        bodyModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 30
        bodyModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 31
        bodyModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 116
        bodyModel[16] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 130
        bodyModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 34
        bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 35
        bodyModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 36
        bodyModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 37
        bodyModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 38
        bodyModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 39
        bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 40
        bodyModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 41
        bodyModel[25] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 42
        bodyModel[26] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 43
        bodyModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 44
        bodyModel[28] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 45
        bodyModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 46
        bodyModel[30] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 47
        bodyModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 48
        bodyModel[32] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 49
        bodyModel[33] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 50
        bodyModel[34] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 51
        bodyModel[35] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 45
        bodyModel[36] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 46
        bodyModel[37] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 47
        bodyModel[38] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 48
        bodyModel[39] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 49
        bodyModel[40] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 50
        bodyModel[41] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 18
        bodyModel[42] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 19
        bodyModel[43] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 20
        bodyModel[44] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 21
        bodyModel[45] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 22
        bodyModel[46] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 23
        bodyModel[47] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 24
        bodyModel[48] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 25
        bodyModel[49] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 26
        bodyModel[50] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 27
        bodyModel[51] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 28
        bodyModel[52] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 29
        bodyModel[53] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 29
        bodyModel[54] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 30
        bodyModel[55] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 31
        bodyModel[56] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 15
        bodyModel[57] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 16
        bodyModel[58] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 17
        bodyModel[59] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 18
        bodyModel[60] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 19
        bodyModel[61] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 20
        bodyModel[62] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 62
        bodyModel[63] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 63
        bodyModel[64] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 64
        bodyModel[65] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 65
        bodyModel[66] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 66

        bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 3F, 1F, -1F, 3F); // Box 13
        bodyModel[0].setRotationPoint(-1.5F, -16F, -5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -2F, -1F, 0F, -2F, -1F, 1F, -3F, 1F, 1F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 16
        bodyModel[1].setRotationPoint(-1.5F, -17F, -7F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,1F, -3F, 1F, 1F, -3F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
        bodyModel[2].setRotationPoint(-1.5F, -17F, 6F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 1F, -1F, 3F, 1F, -1F, 3F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 18
        bodyModel[3].setRotationPoint(-1.5F, -16F, 3F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        bodyModel[4].setRotationPoint(-1.5F, -13F, 6F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 20
        bodyModel[5].setRotationPoint(-1.5F, -13F, -7F);

        bodyModel[6].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 21
        bodyModel[6].setRotationPoint(-1.5F, 1.99F, -6F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 22
        bodyModel[7].setRotationPoint(1.5F, 1.99F, -6F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24
        bodyModel[8].setRotationPoint(1.5F, 1.99F, 0F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 25
        bodyModel[9].setRotationPoint(-4.5F, 1.99F, 0F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 26
        bodyModel[10].setRotationPoint(-4.5F, 1.99F, -6F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 27
        bodyModel[11].setRotationPoint(-1.5F, -5F, 5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        bodyModel[12].setRotationPoint(-1.5F, -5F, -6F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[13].setRotationPoint(-1.5F, -4F, -6F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
        bodyModel[14].setRotationPoint(-1.5F, -4F, 5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[15].setRotationPoint(-1F, -11F, -6F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 130
        bodyModel[16].setRotationPoint(-1.5F, -12F, -5.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
        bodyModel[17].setRotationPoint(-1.5F, -7F, -5.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
        bodyModel[18].setRotationPoint(1.5F, -11F, -6F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
        bodyModel[19].setRotationPoint(-1.5F, -11F, -6F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 37
        bodyModel[20].setRotationPoint(-1.5F, -8F, -6F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 38
        bodyModel[21].setRotationPoint(1F, -8F, -6F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
        bodyModel[22].setRotationPoint(1F, -11F, -6F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 40
        bodyModel[23].setRotationPoint(-3.5F, -4F, -6F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 41
        bodyModel[24].setRotationPoint(1.5F, -4F, -5.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 42
        bodyModel[25].setRotationPoint(-3.5F, -4F, 5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 43
        bodyModel[26].setRotationPoint(1.5F, -4F, 4.5F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 44
        bodyModel[27].setRotationPoint(-1.5F, -7F, 5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
        bodyModel[28].setRotationPoint(-1F, -11F, 4.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 46
        bodyModel[29].setRotationPoint(1.5F, -11F, 4.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
        bodyModel[30].setRotationPoint(-1.5F, -12F, 5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
        bodyModel[31].setRotationPoint(1F, -11F, 5.5F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
        bodyModel[32].setRotationPoint(-1.5F, -11F, 5.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
        bodyModel[33].setRotationPoint(-1.5F, -8F, 5.5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
        bodyModel[34].setRotationPoint(1F, -8F, 5.5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 45
        bodyModel[35].setRotationPoint(-1.5F, -15F, -8F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -2F, -1F, 0F, -2F, -1F, 1F, -3F, 1F, 1F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 46
        bodyModel[36].setRotationPoint(-1.5F, -19F, -8F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, -0.75F, 3F, 0F, -0.75F, 3F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -1F, 3F, 1F, -1F, 3F); // Box 47
        bodyModel[37].setRotationPoint(-1.5F, -18.5F, -6F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.75F, 3F, 0F, -0.75F, 3F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 1F, -1F, 3F, 1F, -1F, 3F, 1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 48
        bodyModel[38].setRotationPoint(-1.5F, -18.5F, 3F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,1F, -3F, 1F, 1F, -3F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        bodyModel[39].setRotationPoint(-1.5F, -19F, 7F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[40].setRotationPoint(-1.5F, -15F, 7F);

        bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 18
        bodyModel[41].setRotationPoint(-1F, 3F, -1F);

        bodyModel[42].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 19
        bodyModel[42].setRotationPoint(-1F, 4.5F, -4F);

        bodyModel[43].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 20
        bodyModel[43].setRotationPoint(-3F, 4.75F, -4.5F);

        bodyModel[44].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 21
        bodyModel[44].setRotationPoint(-8.5F, 3F, -4F);

        bodyModel[45].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 22
        bodyModel[45].setRotationPoint(-3F, 4.75F, 3.5F);

        bodyModel[46].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[46].setRotationPoint(-8.5F, 3F, 4F);

        bodyModel[47].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 24
        bodyModel[47].setRotationPoint(3.5F, 3F, 4F);

        bodyModel[48].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 25
        bodyModel[48].setRotationPoint(3.5F, 3F, -4F);

        bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
        bodyModel[49].setRotationPoint(5.5F, 5F, -6F);

        bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
        bodyModel[50].setRotationPoint(-6.5F, 5F, -6F);

        bodyModel[51].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 28
        bodyModel[51].setRotationPoint(-8F, 6F, 5F);

        bodyModel[52].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 29
        bodyModel[52].setRotationPoint(-8F, 6F, -6F);

        bodyModel[53].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 29
        bodyModel[53].setRotationPoint(-7F, 5F, -1F);

        bodyModel[54].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 30
        bodyModel[54].setRotationPoint(-7.5F, 4F, -1F);

        bodyModel[55].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 31
        bodyModel[55].setRotationPoint(1.5F, 4F, -3F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 15
        bodyModel[56].setRotationPoint(-10F, 6F, 4F);
        bodyModel[56].rotateAngleY = -1.57079633F;

        bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -2F, -16F, 0F, 0F, -16F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, -16F, 0F, 0F, -16F, 0F, 0F, -1F, 0F, 1F); // Box 16
        bodyModel[57].setRotationPoint(-10F, 6F, 6F);
        bodyModel[57].rotateAngleY = -1.57079633F;

        bodyModel[58].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 1F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, -2F); // Box 17
        bodyModel[58].setRotationPoint(9F, 6F, 6F);
        bodyModel[58].rotateAngleY = -1.57079633F;

        bodyModel[59].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 18
        bodyModel[59].setRotationPoint(9F, 6F, 4F);
        bodyModel[59].rotateAngleY = -1.57079633F;

        bodyModel[60].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-16F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, -16F, 0F, 0F); // Box 19
        bodyModel[60].setRotationPoint(-10F, 6F, 12F);
        bodyModel[60].rotateAngleY = -1.57079633F;

        bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-16F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, -16F, 0F, 0F, -16F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, -16F, 0F, 0F); // Box 20
        bodyModel[61].setRotationPoint(9F, 6F, 12F);
        bodyModel[61].rotateAngleY = -1.57079633F;

        bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 19, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 62
        bodyModel[62].setRotationPoint(-4F, -15F, 7F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 19, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 63
        bodyModel[63].setRotationPoint(2F, -15F, 6F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 19, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 64
        bodyModel[64].setRotationPoint(2F, -15F, -6F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 19, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 65
        bodyModel[65].setRotationPoint(-4F, -15F, -7F);

        bodyModel[66].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 66
        bodyModel[66].setRotationPoint(-1F, 4F, -1F);
    }
}