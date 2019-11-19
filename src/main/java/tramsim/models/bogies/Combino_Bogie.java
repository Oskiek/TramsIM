package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Combino_Bogie extends ModelBase //Same as Filename
{
    int textureX = 256;
    int textureY = 64;

    public Combino_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[8];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 20
        bodyModel[1] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 21
        bodyModel[2] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 22
        bodyModel[3] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 23
        bodyModel[4] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 24
        bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
        bodyModel[6] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 26
        bodyModel[7] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 27

        bodyModel[0].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 20
        bodyModel[0].setRotationPoint(-4F, 7F, -7F);

        bodyModel[1].addBox(0F, 0F, 0F, 8, 2, 12, 0F); // Box 21
        bodyModel[1].setRotationPoint(-4F, 8F, -6F);

        bodyModel[2].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 22
        bodyModel[2].setRotationPoint(-5.5F, 7.5F, -6.01F);

        bodyModel[3].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 23
        bodyModel[3].setRotationPoint(-5.5F, 7.5F, 6.01F);

        bodyModel[4].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 24
        bodyModel[4].setRotationPoint(1.5F, 7.5F, -6.01F);

        bodyModel[5].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 25
        bodyModel[5].setRotationPoint(1.5F, 7.5F, 6.01F);

        bodyModel[6].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 26
        bodyModel[6].setRotationPoint(-4F, 9F, -7F);

        bodyModel[7].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 27
        bodyModel[7].setRotationPoint(-4F, 9F, 6F);
    }
}