package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class NullBogiePlaceHolder extends ModelBase //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public NullBogiePlaceHolder() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[1];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

        bodyModel[0].addBox(0F, 0F, 0F, 0, 0, 0, 0F); // Box 0
        bodyModel[0].setRotationPoint(-1F, -1F, -1F);
    }
}