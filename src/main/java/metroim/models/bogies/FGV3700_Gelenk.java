package metroim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class FGV3700_Gelenk extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public FGV3700_Gelenk() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[61];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 46
        bodyModel[1] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 47
        bodyModel[2] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 48
        bodyModel[3] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 49
        bodyModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 50
        bodyModel[5] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 51
        bodyModel[6] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 52
        bodyModel[7] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 53
        bodyModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 54
        bodyModel[9] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 55
        bodyModel[10] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 56
        bodyModel[11] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 57
        bodyModel[12] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 58
        bodyModel[13] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 59
        bodyModel[14] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 60
        bodyModel[15] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 61
        bodyModel[16] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 62
        bodyModel[17] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 63
        bodyModel[18] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        bodyModel[20] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
        bodyModel[21] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13
        bodyModel[22] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 14
        bodyModel[23] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 16
        bodyModel[24] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 25
        bodyModel[25] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 27
        bodyModel[26] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 28
        bodyModel[27] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 35
        bodyModel[28] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 39
        bodyModel[29] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 40
        bodyModel[30] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 41
        bodyModel[31] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 42
        bodyModel[32] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 43
        bodyModel[33] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 44
        bodyModel[34] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 45
        bodyModel[35] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 46
        bodyModel[36] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 47
        bodyModel[37] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 49
        bodyModel[38] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 50
        bodyModel[39] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 51
        bodyModel[40] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 52
        bodyModel[41] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 54
        bodyModel[42] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 55
        bodyModel[43] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 56
        bodyModel[44] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 57
        bodyModel[45] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 58
        bodyModel[46] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 59
        bodyModel[47] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 60
        bodyModel[48] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 61
        bodyModel[49] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 62
        bodyModel[50] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 63
        bodyModel[51] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 41
        bodyModel[52] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 42
        bodyModel[53] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 43
        bodyModel[54] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 44
        bodyModel[55] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 45
        bodyModel[56] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 45
        bodyModel[57] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 46
        bodyModel[58] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 43
        bodyModel[59] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 44
        bodyModel[60] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 45

        bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 46
        bodyModel[0].setRotationPoint(-2F, 3.5F, -8.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 47
        bodyModel[1].setRotationPoint(-4F, 3.5F, -8F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 48
        bodyModel[2].setRotationPoint(3F, 3.5F, -8F);

        bodyModel[3].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 49
        bodyModel[3].setRotationPoint(-2F, -3.5F, 8.4F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[4].setRotationPoint(-2F, -14.5F, 8.4F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[5].setRotationPoint(-2F, -14.5F, -9.4F);

        bodyModel[6].addBox(0F, 0F, 0F, 5, 7, 1, 0F); // Box 52
        bodyModel[6].setRotationPoint(-2F, -3.5F, -9.4F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 53
        bodyModel[7].setRotationPoint(-2F, -16.5F, -6F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 54
        bodyModel[8].setRotationPoint(3F, -3.5F, -9.3F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 55
        bodyModel[9].setRotationPoint(-4F, -3.5F, -8.3F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F,0F, 2F, -1.5F, 0F, 2F, -0.5F, 0F, 2F, 0.5F, 0F, 2F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 56
        bodyModel[10].setRotationPoint(-4F, -14.5F, -9.3F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F,0F, 2F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 57
        bodyModel[11].setRotationPoint(3F, -14.5F, -7.8F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F,0F, 2F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F); // Box 58
        bodyModel[12].setRotationPoint(3F, -14.5F, 6.8F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F,0F, 2F, 1.5F, 0F, 2F, 0.5F, 0F, 2F, -0.5F, 0F, 2F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 59
        bodyModel[13].setRotationPoint(-4F, -14.5F, 8.3F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 60
        bodyModel[14].setRotationPoint(-4F, -3.5F, 7.3F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 61
        bodyModel[15].setRotationPoint(3F, -3.5F, 8.3F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 62
        bodyModel[16].setRotationPoint(3F, -16.5F, -6.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 63
        bodyModel[17].setRotationPoint(-4F, -16.5F, -6.5F);

        bodyModel[18].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 1
        bodyModel[18].setRotationPoint(-5.75F, 7.5F, 5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
        bodyModel[19].setRotationPoint(6.25F, 7F, -6F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
        bodyModel[20].setRotationPoint(-6.25F, 7F, -6F);

        bodyModel[21].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 13
        bodyModel[21].setRotationPoint(5F, 4.5F, 6F);

        bodyModel[22].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 14
        bodyModel[22].setRotationPoint(-8F, 4.5F, 6F);

        bodyModel[23].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bodyModel[23].setRotationPoint(-1F, 6.5F, 6F);

        bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 25
        bodyModel[24].setRotationPoint(-7.75F, 8F, 6F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[25].setRotationPoint(-5F, 7F, 6F);

        bodyModel[26].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 28
        bodyModel[26].setRotationPoint(4.75F, 8F, 6F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 35
        bodyModel[27].setRotationPoint(-1F, 4.5F, -7F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        bodyModel[28].setRotationPoint(-7.5F, 7F, 6F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        bodyModel[29].setRotationPoint(5F, 7F, 6F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
        bodyModel[30].setRotationPoint(7.5F, 7F, 6F);

        bodyModel[31].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 42
        bodyModel[31].setRotationPoint(-7.75F, 8F, -7F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[32].setRotationPoint(-7.5F, 7F, -7F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
        bodyModel[33].setRotationPoint(-5F, 7F, -7F);

        bodyModel[34].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 45
        bodyModel[34].setRotationPoint(-8F, 4.5F, -7F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F); // Box 46
        bodyModel[35].setRotationPoint(-3F, 4.5F, -7F);

        bodyModel[36].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        bodyModel[36].setRotationPoint(-1F, 6.5F, -7F);

        bodyModel[37].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 49
        bodyModel[37].setRotationPoint(5F, 4.5F, -7F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[38].setRotationPoint(7.5F, 7F, -7F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[39].setRotationPoint(5F, 7F, -7F);

        bodyModel[40].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 52
        bodyModel[40].setRotationPoint(4.75F, 8F, -7F);

        bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 54
        bodyModel[41].setRotationPoint(-1.5F, 8.5F, 6F);

        bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 55
        bodyModel[42].setRotationPoint(-1.5F, 8.5F, -7F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
        bodyModel[43].setRotationPoint(-1F, 7.5F, -5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
        bodyModel[44].setRotationPoint(1F, 7.5F, -5F);

        bodyModel[45].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 58
        bodyModel[45].setRotationPoint(2F, 4.5F, 7.5F);

        bodyModel[46].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 59
        bodyModel[46].setRotationPoint(-2F, 4.5F, -8.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 60
        bodyModel[47].setRotationPoint(-1F, 6.5F, 7.5F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 61
        bodyModel[48].setRotationPoint(-1F, 6.5F, -8.5F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        bodyModel[49].setRotationPoint(2F, 6.75F, -8F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 63
        bodyModel[50].setRotationPoint(-2F, 6.75F, 7F);

        bodyModel[51].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 41
        bodyModel[51].setRotationPoint(-0.5F, 5.5F, -7F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F); // Box 42
        bodyModel[52].setRotationPoint(-3F, 4.5F, 6F);

        bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 43
        bodyModel[53].setRotationPoint(-0.5F, 5.5F, 5F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F); // Box 44
        bodyModel[54].setRotationPoint(2F, 4.5F, 6F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F); // Box 45
        bodyModel[55].setRotationPoint(2F, 4.5F, -7F);

        bodyModel[56].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
        bodyModel[56].setRotationPoint(4F, 6.5F, 3F);

        bodyModel[57].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 46
        bodyModel[57].setRotationPoint(-4F, 6.5F, -2F);

        bodyModel[58].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 43
        bodyModel[58].setRotationPoint(-5.75F, 7.5F, -5F);

        bodyModel[59].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 44
        bodyModel[59].setRotationPoint(6.75F, 7.5F, -5F);

        bodyModel[60].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 45
        bodyModel[60].setRotationPoint(6.75F, 7.5F, 5F);
    }
}