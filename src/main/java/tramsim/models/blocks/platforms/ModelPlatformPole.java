package tramsim.models.blocks.platforms;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelPlatformPole extends ModelBase {
    int textureX = 64;
    int textureY = 64;

    public ModelPlatformPole() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[2];

        initbodyModel_1();

    }
        private void initbodyModel_1()
        {
            bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
            bodyModel[1] = new ModelRendererTurbo(this, 28, 22, textureX, textureY); // Box 0

            bodyModel[0].addBox(0F, 0F, 0F, 16, 4, 16, 0F); // Box 0
            bodyModel[0].setRotationPoint(-8F, 16F, -8F);

            bodyModel[1].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 0
            bodyModel[1].setRotationPoint(-1F, 5F, -1F);
        }
    }