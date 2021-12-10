package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class SD_100_Bogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public SD_100_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[25];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
        bodyModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 20
        bodyModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 21
        bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 22
        bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 26
        bodyModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 27
        bodyModel[6] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 30
        bodyModel[7] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 31
        bodyModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 28
        bodyModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 25
        bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 72
        bodyModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 76
        bodyModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 77
        bodyModel[13] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 78
        bodyModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 79
        bodyModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 80
        bodyModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 81
        bodyModel[17] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 83
        bodyModel[18] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 84
        bodyModel[19] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 79
        bodyModel[20] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 107
        bodyModel[21] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 108
        bodyModel[22] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 109
        bodyModel[23] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 110
        bodyModel[24] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 53

        bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 19
        bodyModel[0].setRotationPoint(-1F, 5.5F, -5F);

        bodyModel[1].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 20
        bodyModel[1].setRotationPoint(-3F, 5.75F, -5.5F);

        bodyModel[2].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 21
        bodyModel[2].setRotationPoint(-6F, 6.5F, -5F);

        bodyModel[3].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 22
        bodyModel[3].setRotationPoint(-3F, 5.75F, 4.5F);

        bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
        bodyModel[4].setRotationPoint(5.5F, 6F, -6F);

        bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
        bodyModel[5].setRotationPoint(-6.5F, 6F, -6F);

        bodyModel[6].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 30
        bodyModel[6].setRotationPoint(-7.5F, 5F, -1F);

        bodyModel[7].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 31
        bodyModel[7].setRotationPoint(1.5F, 5F, -3F);

        bodyModel[8].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 28
        bodyModel[8].setRotationPoint(-3F, 7F, -7F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 7F, 0F, 0F, 8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 8F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 25
        bodyModel[9].setRotationPoint(-10F, 7F, -1F);

        bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 72
        bodyModel[10].setRotationPoint(-7F, 5.5F, -8F);

        bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 76
        bodyModel[11].setRotationPoint(-7F, 5.5F, 6F);

        bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 77
        bodyModel[12].setRotationPoint(5F, 5.5F, 6F);

        bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 78
        bodyModel[13].setRotationPoint(5F, 5.5F, -8F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        bodyModel[14].setRotationPoint(-0.5F, 5F, -8F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        bodyModel[15].setRotationPoint(-0.5F, 5F, 7F);

        bodyModel[16].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 81
        bodyModel[16].setRotationPoint(-3F, 7F, 6F);

        bodyModel[17].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 83
        bodyModel[17].setRotationPoint(-9F, 7F, 8F);

        bodyModel[18].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 84
        bodyModel[18].setRotationPoint(-9F, 7F, -9F);

        bodyModel[19].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 79
        bodyModel[19].setRotationPoint(-1F, 5.5F, -3F);

        bodyModel[20].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 107
        bodyModel[20].setRotationPoint(6F, 6.5F, -5F);

        bodyModel[21].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 108
        bodyModel[21].setRotationPoint(6F, 6.5F, 5F);

        bodyModel[22].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 109
        bodyModel[22].setRotationPoint(-6F, 6.5F, 5F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 8F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 110
        bodyModel[23].setRotationPoint(9F, 7F, -1F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 53
        bodyModel[24].setRotationPoint(-6F, 3.5F, -2F);
    }
}