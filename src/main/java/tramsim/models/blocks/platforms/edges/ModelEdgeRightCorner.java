package tramsim.models.blocks.platforms.edges;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelEdgeRightCorner extends ModelBase {
    int textureX = 64;
    int textureY = 64;

    public ModelEdgeRightCorner() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[8];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 43, 52, textureX, textureY); // Box 1
        bodyModel[1] = new ModelRendererTurbo(this, 32, 48, textureX, textureY); // Box 2
        bodyModel[2] = new ModelRendererTurbo(this, 22, 44, textureX, textureY); // Box 3
        bodyModel[3] = new ModelRendererTurbo(this, 13, 40, textureX, textureY); // Box 4
        bodyModel[4] = new ModelRendererTurbo(this, 5, 36, textureX, textureY); // Box 5
        bodyModel[5] = new ModelRendererTurbo(this, 53, 40, textureX, textureY); // Box 6
        bodyModel[6] = new ModelRendererTurbo(this, 47, 36, textureX, textureY); // Box 7
        bodyModel[7] = new ModelRendererTurbo(this, 42, 32, textureX, textureY); // Box 8

        bodyModel[0].addBox(0F, 0F, 0F, 2, 4, 8, 0F); // Box 1
        bodyModel[0].setRotationPoint(6F, 16F, -8F);

        bodyModel[1].addBox(0F, 0F, 0F, 2, 4, 7, 0F); // Box 2
        bodyModel[1].setRotationPoint(4F, 16F, -8F);

        bodyModel[2].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 3
        bodyModel[2].setRotationPoint(2F, 16F, -8F);

        bodyModel[3].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Box 4
        bodyModel[3].setRotationPoint(0F, 16F, -8F);

        bodyModel[4].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 5
        bodyModel[4].setRotationPoint(-2F, 16F, -8F);

        bodyModel[5].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 6
        bodyModel[5].setRotationPoint(-4F, 16F, -8F);

        bodyModel[6].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 7
        bodyModel[6].setRotationPoint(-6F, 16F, -8F);

        bodyModel[7].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 8
        bodyModel[7].setRotationPoint(-8F, 16F, -8F);
    }
}