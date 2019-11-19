package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class MGT6D_Bogie extends ModelBase //Same as Filename
{
    int textureX = 256;
    int textureY = 32;

    public MGT6D_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[14];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
        bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
        bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
        bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
        bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
        bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10
        bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 11
        bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 12
        bodyModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
        bodyModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14

        bodyModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        bodyModel[0].setRotationPoint(0F, 4F, -6F);

        bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 1
        bodyModel[1].setRotationPoint(2F, 6F, -7F);

        bodyModel[2].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 2
        bodyModel[2].setRotationPoint(1F, 7F, -5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 3
        bodyModel[3].setRotationPoint(1F, 7F, -8F);

        bodyModel[4].addBox(0F, 0F, 0F, 2, 1, 10, 0F); // Box 4
        bodyModel[4].setRotationPoint(6F, 7F, -7F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        bodyModel[5].setRotationPoint(1F, 7F, 3F);

        bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 6
        bodyModel[6].setRotationPoint(1F, 7F, 0F);

        bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 7
        bodyModel[7].setRotationPoint(2F, 6F, 1F);

        bodyModel[8].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 8
        bodyModel[8].setRotationPoint(0F, 4F, 2F);

        bodyModel[9].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 10
        bodyModel[9].setRotationPoint(1F, 5F, -5F);

        bodyModel[10].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 11
        bodyModel[10].setRotationPoint(1F, 5F, -8F);

        bodyModel[11].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 12
        bodyModel[11].setRotationPoint(1F, 5F, 0F);

        bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 13
        bodyModel[12].setRotationPoint(1F, 5F, 3F);

        bodyModel[13].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 14
        bodyModel[13].setRotationPoint(6F, 6F, -3F);
    }
}