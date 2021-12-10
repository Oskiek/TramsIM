package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BNLRV_Bogie extends ModelBase //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public BNLRV_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[17];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
        bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 19
        bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
        bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, " wheel "); // Box 23
        bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 26
        bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 27
        bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 29
        bodyModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 16
        bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 17
        bodyModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 18
        bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
        bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 16
        bodyModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
        bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
        bodyModel[14] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, " wheel "); // Box 17
        bodyModel[15] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, " wheel "); // Box 18
        bodyModel[16] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, " wheel "); // Box 19

        bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 18
        bodyModel[0].setRotationPoint(0F, 3F, -1F);

        bodyModel[1].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 19
        bodyModel[1].setRotationPoint(0F, 4F, -3F);

        bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 22
        bodyModel[2].setRotationPoint(-2F, 4.5F, 3F);

        bodyModel[3].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[3].setRotationPoint(-5.5F, 5.5F, 4F);

        bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 26
        bodyModel[4].setRotationPoint(7F, 5F, -5F);

        bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 27
        bodyModel[5].setRotationPoint(-6F, 5F, -5F);

        bodyModel[6].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 29
        bodyModel[6].setRotationPoint(-6F, 5F, -1F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bodyModel[7].setRotationPoint(-3F, 6.5F, 3F);

        bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 17
        bodyModel[8].setRotationPoint(3F, 4.5F, -4F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
        bodyModel[9].setRotationPoint(-3F, 6.5F, -4F);

        bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 15
        bodyModel[10].setRotationPoint(3F, 4.5F, 3F);

        bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 16
        bodyModel[11].setRotationPoint(-2F, 4.5F, -4F);

        bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 19
        bodyModel[12].setRotationPoint(-2F, 3.5F, -4F);

        bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 20
        bodyModel[13].setRotationPoint(3F, 3.5F, -4F);

        bodyModel[14].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 17
        bodyModel[14].setRotationPoint(7.5F, 5.5F, 4F);

        bodyModel[15].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 18
        bodyModel[15].setRotationPoint(-5.5F, 5.5F, -4F);

        bodyModel[16].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 19
        bodyModel[16].setRotationPoint(7.5F, 5.5F, -4F);
    }
}