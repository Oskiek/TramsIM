package spanish_pack.models.blocks;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Catenary_single_A extends ModelBase //Same as Filename
{
    int textureX = 256;
    int textureY = 128;

    public Catenary_single_A() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[19];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
        bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
        bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
        bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
        bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
        bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
        bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
        bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 9
        bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 10
        bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
        bodyModel[11] = new ModelRendererTurbo(this, 21, 23, textureX, textureY); // Box 12
        bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 13
        bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 14
        bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 15
        bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 16
        bodyModel[16] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 15
        bodyModel[17] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 18
        bodyModel[18] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 19

        bodyModel[0].addBox(0F, 0F, 0F, 2, 50, 1, 0F); // Box 1
        bodyModel[0].setRotationPoint(-1F, -41F, -2F);

        bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 2
        bodyModel[1].setRotationPoint(-1F, 1F, -1F);

        bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 3
        bodyModel[2].setRotationPoint(-1F, -5F, -1F);

        bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 4
        bodyModel[3].setRotationPoint(-1F, -11F, -1F);

        bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 5
        bodyModel[4].setRotationPoint(-1F, -17F, -1F);

        bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 6
        bodyModel[5].setRotationPoint(-1F, -23F, -1F);

        bodyModel[6].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 7
        bodyModel[6].setRotationPoint(-1F, -41F, -1F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 1F, 0F, -9F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 1F, 0F, 9F, 1F); // Box 8
        bodyModel[7].setRotationPoint(-0.5F, -38F, -16F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 9
        bodyModel[8].setRotationPoint(-0.5F, -39F, -25F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -3.5F, -1F, 0F, -3.5F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[9].setRotationPoint(-0.5F, -39F, -29F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, 3.5F, -4F, 0F, 3.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 11
        bodyModel[10].setRotationPoint(-0.5F, -32F, -29F);

        bodyModel[11].addBox(0F, -1F, 0F, 1, 1, 7, 0F); // Box 12
        bodyModel[11].setRotationPoint(-0.5F, -31F, -28F);

        bodyModel[12].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 13
        bodyModel[12].setRotationPoint(-1F, -41.5F, -22F);

        bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 14
        bodyModel[13].setRotationPoint(-0.5F, -41F, -19F);

        bodyModel[14].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 15
        bodyModel[14].setRotationPoint(-0.5F, -41F, -23F);

        bodyModel[15].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 16
        bodyModel[15].setRotationPoint(-2F, 8F, -4F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 4F, -0.8F, -0.8F, 4F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -0.8F, 0F, 4F); // Box 15
        bodyModel[16].setRotationPoint(-1F, -38.5F, -18F);

        bodyModel[17].addBox(0F, 0F, 0F, 2, 50, 1, 0F); // Box 18
        bodyModel[17].setRotationPoint(-1F, -41F, 1F);

        bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 19
        bodyModel[18].setRotationPoint(-1F, -29F, -1F);
    }
}