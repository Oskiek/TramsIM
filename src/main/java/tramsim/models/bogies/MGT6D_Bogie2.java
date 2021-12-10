package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class MGT6D_Bogie2 extends ModelBase //Same as Filename
{
    int textureX = 256;
    int textureY = 32;

    public MGT6D_Bogie2() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[16];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
        bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
        bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
        bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
        bodyModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10
        bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 11
        bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 12
        bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
        bodyModel[12] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 14
        bodyModel[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 15
        bodyModel[14] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 16
        bodyModel[15] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 17

        bodyModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        bodyModel[0].setRotationPoint(-2.5F, 4F, -5F);

        bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1
        bodyModel[1].setRotationPoint(-0.5F, 6F, -6F);

        bodyModel[2].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 2
        bodyModel[2].setRotationPoint(-1.5F, 7F, -4F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 3
        bodyModel[3].setRotationPoint(-1.5F, 7F, -7F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        bodyModel[4].setRotationPoint(-1.5F, 7F, 6F);

        bodyModel[5].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 6
        bodyModel[5].setRotationPoint(-1.5F, 7F, 3F);

        bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 7
        bodyModel[6].setRotationPoint(-0.5F, 6F, 4F);

        bodyModel[7].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 8
        bodyModel[7].setRotationPoint(-2.5F, 4F, 5F);

        bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 10
        bodyModel[8].setRotationPoint(-1.5F, 5F, -4F);

        bodyModel[9].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 11
        bodyModel[9].setRotationPoint(-1.5F, 5F, -7F);

        bodyModel[10].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 12
        bodyModel[10].setRotationPoint(-1.5F, 5F, 3F);

        bodyModel[11].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 13
        bodyModel[11].setRotationPoint(-1.5F, 5F, 6F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        bodyModel[12].setRotationPoint(-4.5F, 7F, 6F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 15
        bodyModel[13].setRotationPoint(-4.5F, 7F, -7F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 16
        bodyModel[14].setRotationPoint(-5.5F, 7F, -5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 17
        bodyModel[15].setRotationPoint(3.5F, 7F, -5F);
    }
}