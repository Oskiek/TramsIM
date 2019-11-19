package tramsim.models.blocks.platforms.edges;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelEdgeYellowLined extends ModelBase {
    int textureX = 64;
    int textureY = 64;

    public ModelEdgeYellowLined() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[5];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 8, 8, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 14, 21, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 15, 26, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 15, 30, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 15, 34, textureX, textureY); // Box 4

        bodyModel[0].addBox(0F, 0F, 0F, 16, 3, 8, 0F); // Box 0
        bodyModel[0].setRotationPoint(-8F, 16F, -8F);

        bodyModel[1].addBox(0F, 0F, 0F, 16, 1, 2, 0F); // Box 1
        bodyModel[1].setRotationPoint(-8F, 15F, -2F);

        bodyModel[2].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 2
        bodyModel[2].setRotationPoint(-8F, 15F, -4F);

        bodyModel[3].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 3
        bodyModel[3].setRotationPoint(-8F, 15F, -6F);

        bodyModel[4].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 4
        bodyModel[4].setRotationPoint(-8F, 15F, -8F);
    }
}