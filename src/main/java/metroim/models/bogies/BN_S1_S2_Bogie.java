package metroim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BN_S1_S2_Bogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public BN_S1_S2_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[38];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
        bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 9
        bodyModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 19
        bodyModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 22
        bodyModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
        bodyModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 44
        bodyModel[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 45
        bodyModel[10] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 46
        bodyModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 47
        bodyModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 49
        bodyModel[13] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 53
        bodyModel[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 54
        bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 69
        bodyModel[16] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 70
        bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 71
        bodyModel[18] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 72
        bodyModel[19] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 73
        bodyModel[20] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 74
        bodyModel[21] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 75
        bodyModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 76
        bodyModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 77
        bodyModel[24] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 78
        bodyModel[25] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 79
        bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 89
        bodyModel[27] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 90
        bodyModel[28] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 101
        bodyModel[29] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 102
        bodyModel[30] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 111
        bodyModel[31] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 112
        bodyModel[32] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 46
        bodyModel[33] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 47
        bodyModel[34] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 48
        bodyModel[35] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 49
        bodyModel[36] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 50
        bodyModel[37] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 51

        bodyModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        bodyModel[0].setRotationPoint(-9F, 4F, -5F);

        bodyModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
        bodyModel[1].setRotationPoint(3.85F, 4F, -5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
        bodyModel[2].setRotationPoint(-7F, 6F, -5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 8
        bodyModel[3].setRotationPoint(-4.3F, 5.5F, -5.62F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
        bodyModel[4].setRotationPoint(-7F, 5.5F, -6.12F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
        bodyModel[5].setRotationPoint(5.85F, 6F, -5F);

        bodyModel[6].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 22
        bodyModel[6].setRotationPoint(3.85F, 4F, 5F);

        bodyModel[7].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[7].setRotationPoint(-9F, 4F, 5F);

        bodyModel[8].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 44
        bodyModel[8].setRotationPoint(-8F, 5F, -3F);

        bodyModel[9].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 45
        bodyModel[9].setRotationPoint(5F, 5F, -3F);

        bodyModel[10].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 46
        bodyModel[10].setRotationPoint(-2F, 5F, -2F);

        bodyModel[11].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 47
        bodyModel[11].setRotationPoint(-3.5F, 7.7F, -5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 49
        bodyModel[12].setRotationPoint(-1.5F, 6.5F, -4F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 53
        bodyModel[13].setRotationPoint(-6F, 3.5F, -2F);

        bodyModel[14].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 54
        bodyModel[14].setRotationPoint(-6F, 5F, -2F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 69
        bodyModel[15].setRotationPoint(2.3F, 5.5F, -5.62F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 70
        bodyModel[16].setRotationPoint(3F, 5.5F, -6.12F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
        bodyModel[17].setRotationPoint(0.5F, 2.5F, -5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
        bodyModel[18].setRotationPoint(-1.5F, 2.5F, -5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
        bodyModel[19].setRotationPoint(-1.5F, 2.5F, 4F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[20].setRotationPoint(0.5F, 2.5F, 4F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 75
        bodyModel[21].setRotationPoint(3F, 5.5F, 4.76F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 76
        bodyModel[22].setRotationPoint(2.3F, 5.5F, 4.26F);

        bodyModel[23].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 77
        bodyModel[23].setRotationPoint(-3.5F, 7.7F, 4.18F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 78
        bodyModel[24].setRotationPoint(-4.3F, 5.5F, 4.26F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
        bodyModel[25].setRotationPoint(-7F, 5.5F, 4.76F);

        bodyModel[26].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 89
        bodyModel[26].setRotationPoint(-3F, 5.5F, -5.62F);

        bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 90
        bodyModel[27].setRotationPoint(-3F, 6F, -6.12F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 101
        bodyModel[28].setRotationPoint(-0.5F, 6.5F, -5.62F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 102
        bodyModel[29].setRotationPoint(-0.25F, 2.5F, -5.62F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[30].setRotationPoint(-2F, 5.5F, -5.62F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 112
        bodyModel[31].setRotationPoint(-4F, 5.5F, -5.62F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 46
        bodyModel[32].setRotationPoint(-0.25F, 2.5F, 4.98F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        bodyModel[33].setRotationPoint(-0.5F, 6.5F, 4.98F);

        bodyModel[34].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 48
        bodyModel[34].setRotationPoint(2F, 5.5F, 4.88F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 49
        bodyModel[35].setRotationPoint(3F, 5.5F, 4.88F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 50
        bodyModel[36].setRotationPoint(1F, 5.5F, 4.88F);

        bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 51
        bodyModel[37].setRotationPoint(2F, 6F, 5.38F);
    }
}