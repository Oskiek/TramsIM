package metroim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class FGV3700_Bogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public FGV3700_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[49];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 4
        bodyModel[5] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 5
        bodyModel[6] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 13
        bodyModel[7] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 14
        bodyModel[8] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 15
        bodyModel[9] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 16
        bodyModel[10] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 25
        bodyModel[11] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 27
        bodyModel[12] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 28
        bodyModel[13] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 31
        bodyModel[14] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 35
        bodyModel[15] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 37
        bodyModel[16] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 38
        bodyModel[17] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 39
        bodyModel[18] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 40
        bodyModel[19] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 38
        bodyModel[20] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 39
        bodyModel[21] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 40
        bodyModel[22] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 41
        bodyModel[23] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 42
        bodyModel[24] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 43
        bodyModel[25] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 44
        bodyModel[26] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 45
        bodyModel[27] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 46
        bodyModel[28] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 47
        bodyModel[29] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 48
        bodyModel[30] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 49
        bodyModel[31] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 50
        bodyModel[32] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 51
        bodyModel[33] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 52
        bodyModel[34] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 53
        bodyModel[35] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 54
        bodyModel[36] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 55
        bodyModel[37] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 56
        bodyModel[38] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 57
        bodyModel[39] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 58
        bodyModel[40] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 59
        bodyModel[41] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 60
        bodyModel[42] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 61
        bodyModel[43] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 62
        bodyModel[44] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 63
        bodyModel[45] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 45
        bodyModel[46] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 46
        bodyModel[47] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 47
        bodyModel[48] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 48

        bodyModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        bodyModel[0].setRotationPoint(3.25F, 5F, 4F);

        bodyModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
        bodyModel[1].setRotationPoint(-7.25F, 5F, 4F);

        bodyModel[2].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 2
        bodyModel[2].setRotationPoint(3.25F, 5F, -4F);

        bodyModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 3
        bodyModel[3].setRotationPoint(-7.25F, 5F, -4F);

        bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 4
        bodyModel[4].setRotationPoint(5.25F, 7F, -6F);

        bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 5
        bodyModel[5].setRotationPoint(-5.25F, 7F, -6F);

        bodyModel[6].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 13
        bodyModel[6].setRotationPoint(4F, 4.5F, 5F);

        bodyModel[7].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 14
        bodyModel[7].setRotationPoint(-7F, 4.5F, 5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 15
        bodyModel[8].setRotationPoint(-3F, 4.5F, 5F);

        bodyModel[9].addBox(0F, -1F, 0F, 3, 3, 1, 0F); // Box 16
        bodyModel[9].setRotationPoint(-1F, 6.5F, 5F);

        bodyModel[10].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 25
        bodyModel[10].setRotationPoint(-6.75F, 8F, 5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[11].setRotationPoint(-4F, 7F, 5F);

        bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 28
        bodyModel[12].setRotationPoint(3.75F, 8F, 5F);

        bodyModel[13].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 31
        bodyModel[13].setRotationPoint(-0.5F, 4.5F, 4.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 35
        bodyModel[14].setRotationPoint(-1F, 2.5F, -7F);

        bodyModel[15].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 37
        bodyModel[15].setRotationPoint(-1F, 5F, 0F);

        bodyModel[16].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 38
        bodyModel[16].setRotationPoint(-3F, 5F, -3F);

        bodyModel[17].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 39
        bodyModel[17].setRotationPoint(4F, 6F, 1F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        bodyModel[18].setRotationPoint(-6F, 6F, -2F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 38
        bodyModel[19].setRotationPoint(2F, 4.5F, 5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        bodyModel[20].setRotationPoint(-6.5F, 7F, 5F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        bodyModel[21].setRotationPoint(4F, 7F, 5F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
        bodyModel[22].setRotationPoint(6.5F, 7F, 5F);

        bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 42
        bodyModel[23].setRotationPoint(-6.75F, 8F, -6F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[24].setRotationPoint(-6.5F, 7F, -6F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
        bodyModel[25].setRotationPoint(-4F, 7F, -6F);

        bodyModel[26].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 45
        bodyModel[26].setRotationPoint(-7F, 4.5F, -6F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 46
        bodyModel[27].setRotationPoint(-3F, 4.5F, -6F);

        bodyModel[28].addBox(0F, -1F, 0F, 3, 3, 1, 0F); // Box 47
        bodyModel[28].setRotationPoint(-1F, 6.5F, -6F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 48
        bodyModel[29].setRotationPoint(2F, 4.5F, -6F);

        bodyModel[30].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 49
        bodyModel[30].setRotationPoint(4F, 4.5F, -6F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[31].setRotationPoint(6.5F, 7F, -6F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[32].setRotationPoint(4F, 7F, -6F);

        bodyModel[33].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 52
        bodyModel[33].setRotationPoint(3.75F, 8F, -6F);

        bodyModel[34].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 53
        bodyModel[34].setRotationPoint(-0.5F, 4.5F, -6.5F);

        bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 54
        bodyModel[35].setRotationPoint(-1.5F, 8.5F, 4F);

        bodyModel[36].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 55
        bodyModel[36].setRotationPoint(-1.5F, 8.5F, -5F);

        bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 56
        bodyModel[37].setRotationPoint(-1F, 7.5F, -5F);

        bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 57
        bodyModel[38].setRotationPoint(1F, 7.5F, -5F);

        bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 58
        bodyModel[39].setRotationPoint(2F, 3.5F, 6.5F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 59
        bodyModel[40].setRotationPoint(-2F, 3.5F, -7.5F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 60
        bodyModel[41].setRotationPoint(-1F, 5.5F, 6.5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 61
        bodyModel[42].setRotationPoint(-1F, 5.5F, -7.5F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        bodyModel[43].setRotationPoint(2F, 5.75F, -7F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 63
        bodyModel[44].setRotationPoint(-2F, 5.75F, 6F);

        bodyModel[45].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 45
        bodyModel[45].setRotationPoint(2F, 2.5F, 6.5F);

        bodyModel[46].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 46
        bodyModel[46].setRotationPoint(-0.5F, 3.5F, 4.5F);

        bodyModel[47].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 47
        bodyModel[47].setRotationPoint(-2F, 2.5F, -7.5F);

        bodyModel[48].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 48
        bodyModel[48].setRotationPoint(-0.5F, 3.5F, -6.5F);
    }
}