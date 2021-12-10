package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class LohnerE1_Bogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public LohnerE1_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[22];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 18
        bodyModel[1] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 19
        bodyModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 20
        bodyModel[3] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 22
        bodyModel[4] = new ModelRendererTurbo(this, 129, 9, textureX, textureY, " wheel "); // Box 23
        bodyModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 26
        bodyModel[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 27
        bodyModel[7] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 28
        bodyModel[8] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 29
        bodyModel[9] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 29
        bodyModel[10] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 30
        bodyModel[11] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 31
        bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 16
        bodyModel[13] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 17
        bodyModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 66
        bodyModel[15] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 23
        bodyModel[16] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 24
        bodyModel[17] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 25
        bodyModel[18] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 26
        bodyModel[19] = new ModelRendererTurbo(this, 129, 9, textureX, textureY, " wheel "); // Box 22
        bodyModel[20] = new ModelRendererTurbo(this, 129, 9, textureX, textureY, " wheel "); // Box 23
        bodyModel[21] = new ModelRendererTurbo(this, 129, 9, textureX, textureY, " wheel "); // Box 24

        bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 18
        bodyModel[0].setRotationPoint(-1F, 3F, -1F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
        bodyModel[1].setRotationPoint(-1F, 4.5F, -4F);

        bodyModel[2].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 20
        bodyModel[2].setRotationPoint(-3F, 4.75F, -5.5F);

        bodyModel[3].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 22
        bodyModel[3].setRotationPoint(-3F, 4.75F, 4.5F);

        bodyModel[4].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[4].setRotationPoint(-6F, 5.5F, 5F);

        bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
        bodyModel[5].setRotationPoint(5.5F, 5F, -6F);

        bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
        bodyModel[6].setRotationPoint(-6.5F, 5F, -6F);

        bodyModel[7].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 28
        bodyModel[7].setRotationPoint(-8F, 6F, 6F);

        bodyModel[8].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 29
        bodyModel[8].setRotationPoint(-8F, 6F, -7F);

        bodyModel[9].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 29
        bodyModel[9].setRotationPoint(-7F, 5F, -1F);

        bodyModel[10].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 30
        bodyModel[10].setRotationPoint(-7.5F, 4F, -1F);

        bodyModel[11].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 31
        bodyModel[11].setRotationPoint(1.5F, 4F, -3F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -2F, -16F, 0F, 0F, -16F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, -16F, 0F, 0F, -16F, 0F, 0F, -1F, 0F, 1F); // Box 16
        bodyModel[12].setRotationPoint(-10F, 6F, -7F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 1F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, -2F); // Box 17
        bodyModel[13].setRotationPoint(-10F, 6F, 6F);

        bodyModel[14].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 66
        bodyModel[14].setRotationPoint(-1F, 4F, -1F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -1F, -17F, 0F, 0F, -16F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -17F, 0F, 0F, -16F, 0F, -1F, 0F, 0F, 1F); // Box 23
        bodyModel[15].setRotationPoint(8F, 6F, 5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 24
        bodyModel[16].setRotationPoint(9F, 6F, 3F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 25
        bodyModel[17].setRotationPoint(-10F, 6F, 3F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -1F, -16F, 0F, -3F, -17F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, -16F, 0F, -3F, -17F, 0F, 2F, 0F, 0F, 1F); // Box 26
        bodyModel[18].setRotationPoint(8F, 6F, -8F);

        bodyModel[19].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 22
        bodyModel[19].setRotationPoint(6F, 5.5F, 5F);

        bodyModel[20].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[20].setRotationPoint(-6F, 5.5F, -5F);

        bodyModel[21].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 24
        bodyModel[21].setRotationPoint(6F, 5.5F, -5F);
    }
}