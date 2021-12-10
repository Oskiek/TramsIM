package spanish_pack.models.blocks;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Catenary_double_C extends ModelBase //Same as Filename
{
    int textureX = 256;
    int textureY = 128;

    public Catenary_double_C() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[35];

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
        bodyModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 12
        bodyModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 13
        bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 14
        bodyModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 15
        bodyModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 16
        bodyModel[12] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 18
        bodyModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 19
        bodyModel[14] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
        bodyModel[15] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 21
        bodyModel[16] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Box 22
        bodyModel[17] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 32
        bodyModel[18] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 39
        bodyModel[19] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 40
        bodyModel[20] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 41
        bodyModel[21] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 42
        bodyModel[22] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 45
        bodyModel[23] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 47
        bodyModel[24] = new ModelRendererTurbo(this, 42, 1, textureX, textureY); // Box 48
        bodyModel[25] = new ModelRendererTurbo(this, 42, 1, textureX, textureY); // Box 49
        bodyModel[26] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 51
        bodyModel[27] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 53
        bodyModel[28] = new ModelRendererTurbo(this, 42, 1, textureX, textureY); // Box 43
        bodyModel[29] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 44
        bodyModel[30] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 45
        bodyModel[31] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 46
        bodyModel[32] = new ModelRendererTurbo(this, 16, 18, textureX, textureY); // Box 47
        bodyModel[33] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 48
        bodyModel[34] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 35

        bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 47, 1, 0F,0F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
        bodyModel[0].setRotationPoint(-1F, -38F, -2F);

        bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 2
        bodyModel[1].setRotationPoint(-1F, 3F, -1F);

        bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 3
        bodyModel[2].setRotationPoint(-1F, -3F, -1F);

        bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 4
        bodyModel[3].setRotationPoint(-1F, -9F, -1F);

        bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 5
        bodyModel[4].setRotationPoint(-1F, -15F, -1F);

        bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 6
        bodyModel[5].setRotationPoint(-1F, -21F, -1F);

        bodyModel[6].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 7
        bodyModel[6].setRotationPoint(-1F, -57F, -1F);

        bodyModel[7].addBox(0F, -1F, 0F, 1, 1, 7, 0F); // Box 12
        bodyModel[7].setRotationPoint(-0.5F, -31F, -52F);

        bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 13
        bodyModel[8].setRotationPoint(-1F, -41.5F, -52F);

        bodyModel[9].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 14
        bodyModel[9].setRotationPoint(-0.5F, -41F, -49F);

        bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 15
        bodyModel[10].setRotationPoint(-0.5F, -41F, -53F);

        bodyModel[11].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 16
        bodyModel[11].setRotationPoint(-2F, 8F, -4F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 47, 1, 0F,0F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
        bodyModel[12].setRotationPoint(-1F, -38F, 1F);

        bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 19
        bodyModel[13].setRotationPoint(-1F, -27F, -1F);

        bodyModel[14].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 20
        bodyModel[14].setRotationPoint(-1F, -33F, -1F);

        bodyModel[15].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 21
        bodyModel[15].setRotationPoint(-1F, -39F, -1F);

        bodyModel[16].addBox(0F, 0F, 0F, 2, 1, 58, 0F); // Box 22
        bodyModel[16].setRotationPoint(-1F, -38F, -60F);

        bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 32
        bodyModel[17].setRotationPoint(-1F, -45F, -1F);

        bodyModel[18].addBox(0F, -1F, 0F, 1, 1, 7, 0F); // Box 39
        bodyModel[18].setRotationPoint(-0.5F, -31F, -18F);

        bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 40
        bodyModel[19].setRotationPoint(-0.5F, -41F, -17F);

        bodyModel[20].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 41
        bodyModel[20].setRotationPoint(-1F, -41.5F, -20F);

        bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 42
        bodyModel[21].setRotationPoint(-0.5F, -41F, -21F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 13.2F, 45F, -0.8F, 13.2F, 45F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 45F, -0.8F, -14F, 45F); // Box 45
        bodyModel[22].setRotationPoint(-1.8F, -41.3F, -59F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 13.2F, 45F, -0.8F, 13.2F, 45F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 45F, -0.8F, -14F, 45F); // Box 47
        bodyModel[23].setRotationPoint(0F, -41.3F, -59F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        bodyModel[24].setRotationPoint(-1F, -39F, -60F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        bodyModel[25].setRotationPoint(-1F, -39F, -35F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 13.2F, 20F, -0.8F, 13.2F, 20F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 20F, -0.8F, -14F, 20F); // Box 51
        bodyModel[26].setRotationPoint(-1.8F, -39.5F, -34F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 13.2F, 20F, -0.8F, 13.2F, 20F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 20F, -0.8F, -14F, 20F); // Box 53
        bodyModel[27].setRotationPoint(0F, -39.5F, -34F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[28].setRotationPoint(-1F, -40.5F, -60F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 44
        bodyModel[29].setRotationPoint(-0.5F, -38F, -22F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 45
        bodyModel[30].setRotationPoint(-0.5F, -38F, -56F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -5F, -0.8F, 0F, -5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -5F, -0.8F, -0.8F, -5F); // Box 46
        bodyModel[31].setRotationPoint(-1F, -31F, -51.5F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -5F, -0.8F, 0F, -5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -5F, -0.8F, -0.8F, -5F); // Box 47
        bodyModel[32].setRotationPoint(-1F, -31F, -17.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 3F, 2F, 0F, 3F, 2F, 0F, 4F, -6F, 0F, 4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 48
        bodyModel[33].setRotationPoint(-0.5F, -33F, -45F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 3F, 2F, 0F, 3F, 2F, 0F, 4F, -6F, 0F, 4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 35
        bodyModel[34].setRotationPoint(-0.5F, -33F, -11F);
    }
}