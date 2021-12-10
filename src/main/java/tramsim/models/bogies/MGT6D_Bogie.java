package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class MGT6D_Bogie extends ModelBase //Same as Filename
{
    int textureX = 256;
    int textureY = 32;

    public MGT6D_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[20];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
        bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
        bodyModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 11
        bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
        bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 16
        bodyModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 16
        bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 17
        bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 19
        bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
        bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
        bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 23
        bodyModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 24
        bodyModel[14] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 25
        bodyModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 26
        bodyModel[16] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 28
        bodyModel[17] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 29
        bodyModel[18] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 30
        bodyModel[19] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 31

        bodyModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        bodyModel[0].setRotationPoint(3F, 4F, -5F);

        bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1
        bodyModel[1].setRotationPoint(5F, 6F, -6F);

        bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 7
        bodyModel[2].setRotationPoint(5F, 6F, 4F);

        bodyModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 8
        bodyModel[3].setRotationPoint(3F, 4F, 5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 11
        bodyModel[4].setRotationPoint(4F, 5F, -6.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 13
        bodyModel[5].setRotationPoint(4F, 5F, 5.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,1F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 16
        bodyModel[6].setRotationPoint(-6F, 6F, -5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 16
        bodyModel[7].setRotationPoint(-7F, 5F, 5.5F);

        bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 17
        bodyModel[8].setRotationPoint(-6F, 6F, 4F);

        bodyModel[9].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 19
        bodyModel[9].setRotationPoint(-8F, 4F, 5F);

        bodyModel[10].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 20
        bodyModel[10].setRotationPoint(-2.5F, 8F, 4F);

        bodyModel[11].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 21
        bodyModel[11].setRotationPoint(-2.5F, 8F, -5F);

        bodyModel[12].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[12].setRotationPoint(-8F, 4F, -5F);

        bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 24
        bodyModel[13].setRotationPoint(-6F, 6F, -6F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 25
        bodyModel[14].setRotationPoint(-7F, 5F, -6.5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[15].setRotationPoint(-3F, 7F, -4F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,1F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 28
        bodyModel[16].setRotationPoint(4F, 7.5F, -5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        bodyModel[17].setRotationPoint(-3F, 7F, 3F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,1F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 30
        bodyModel[18].setRotationPoint(-6F, 7.5F, -5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,1F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 31
        bodyModel[19].setRotationPoint(4F, 6F, -5F);
    }
}