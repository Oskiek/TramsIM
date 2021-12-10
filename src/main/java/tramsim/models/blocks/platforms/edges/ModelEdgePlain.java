package tramsim.models.blocks.platforms.edges;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelEdgePlain extends ModelBase {
    int textureX = 64;
    int textureY = 64;

    public ModelEdgePlain() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[1];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 8, 8, textureX, textureY); // Box 0

        bodyModel[0].addBox(0F, 0F, 0F, 16, 4, 8, 0F); // Box 0
        bodyModel[0].setRotationPoint(-8F, 16F, -8F);
    }
}