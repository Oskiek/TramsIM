package tramsim.models.blocks.platforms.edges;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelEdgeBritish extends ModelBase {
    int textureX = 64;
    int textureY = 64;

    public ModelEdgeBritish() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[9];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 8, 8, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 14, 21, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 15, 34, textureX, textureY); // Box 4
        bodyModel[3] = new ModelRendererTurbo(this, 14, 28, textureX, textureY); // Box 5
        bodyModel[4] = new ModelRendererTurbo(this, 12, 28, textureX, textureY); // Box 6
        bodyModel[5] = new ModelRendererTurbo(this, 26, 28, textureX, textureY); // Box 7
        bodyModel[6] = new ModelRendererTurbo(this, 33, 28, textureX, textureY); // Box 8
        bodyModel[7] = new ModelRendererTurbo(this, 36, 28, textureX, textureY); // Box 9
        bodyModel[8] = new ModelRendererTurbo(this, 48, 28, textureX, textureY); // Box 10

        bodyModel[0].addBox(0F, 0F, 0F, 16, 5, 8, 0F); // Box 0
        bodyModel[0].setRotationPoint(-8F, 15F, -8F);

        bodyModel[1].addBox(0F, 0F, 0F, 16, 1, 2, 0F); // Box 1
        bodyModel[1].setRotationPoint(-8F, 14F, -2F);

        bodyModel[2].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 4
        bodyModel[2].setRotationPoint(-8F, 14F, -8F);

        bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 5
        bodyModel[3].setRotationPoint(-6F, 14F, -6F);

        bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 6
        bodyModel[4].setRotationPoint(-7F, 14F, -5F);

        bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 7
        bodyModel[5].setRotationPoint(-2F, 14F, -5F);

        bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 8
        bodyModel[6].setRotationPoint(1F, 14F, -5F);

        bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 9
        bodyModel[7].setRotationPoint(2F, 14F, -6F);

        bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 10
        bodyModel[8].setRotationPoint(6F, 14F, -5F);
    }
}