package spanish_pack.models.bogies;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class StandardBogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public StandardBogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[43];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, " wheel "); // Box 1
        bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
        bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13
        bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 14
        bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 16
        bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 25
        bodyModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 27
        bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 28
        bodyModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 35
        bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 39
        bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 40
        bodyModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 41
        bodyModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 42
        bodyModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 43
        bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 44
        bodyModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 45
        bodyModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 46
        bodyModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 47
        bodyModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 49
        bodyModel[20] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 50
        bodyModel[21] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 51
        bodyModel[22] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 52
        bodyModel[23] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 54
        bodyModel[24] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 55
        bodyModel[25] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 56
        bodyModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 57
        bodyModel[27] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 58
        bodyModel[28] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 59
        bodyModel[29] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 60
        bodyModel[30] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 61
        bodyModel[31] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 62
        bodyModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 63
        bodyModel[33] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 41
        bodyModel[34] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 42
        bodyModel[35] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 43
        bodyModel[36] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 44
        bodyModel[37] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 45
        bodyModel[38] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 45
        bodyModel[39] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 46
        bodyModel[40] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, " wheel "); // Box 43
        bodyModel[41] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, " wheel "); // Box 44
        bodyModel[42] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, " wheel "); // Box 45

        bodyModel[0].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 1
        bodyModel[0].setRotationPoint(-5.75F, 7.5F, 5F).rotateAngleY = -3.14159265F;;

        bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
        bodyModel[1].setRotationPoint(6.25F, 7F, -6F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
        bodyModel[2].setRotationPoint(-6.25F, 7F, -6F);

        bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 13
        bodyModel[3].setRotationPoint(5F, 4.5F, 6F);

        bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 14
        bodyModel[4].setRotationPoint(-8F, 4.5F, 6F);

        bodyModel[5].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bodyModel[5].setRotationPoint(-1F, 6.5F, 6F);

        bodyModel[6].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 25
        bodyModel[6].setRotationPoint(-7.75F, 8F, 6F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[7].setRotationPoint(-5F, 7F, 6F);

        bodyModel[8].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 28
        bodyModel[8].setRotationPoint(4.75F, 8F, 6F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 35
        bodyModel[9].setRotationPoint(-1F, 4.5F, -7F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        bodyModel[10].setRotationPoint(-7.5F, 7F, 6F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
        bodyModel[11].setRotationPoint(5F, 7F, 6F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
        bodyModel[12].setRotationPoint(7.5F, 7F, 6F);

        bodyModel[13].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 42
        bodyModel[13].setRotationPoint(-7.75F, 8F, -7F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[14].setRotationPoint(-7.5F, 7F, -7F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
        bodyModel[15].setRotationPoint(-5F, 7F, -7F);

        bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 45
        bodyModel[16].setRotationPoint(-8F, 4.5F, -7F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F); // Box 46
        bodyModel[17].setRotationPoint(-3F, 4.5F, -7F);

        bodyModel[18].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        bodyModel[18].setRotationPoint(-1F, 6.5F, -7F);

        bodyModel[19].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 49
        bodyModel[19].setRotationPoint(5F, 4.5F, -7F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[20].setRotationPoint(7.5F, 7F, -7F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[21].setRotationPoint(5F, 7F, -7F);

        bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 52
        bodyModel[22].setRotationPoint(4.75F, 8F, -7F);

        bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 54
        bodyModel[23].setRotationPoint(-1.5F, 8.5F, 6F);

        bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 55
        bodyModel[24].setRotationPoint(-1.5F, 8.5F, -7F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
        bodyModel[25].setRotationPoint(-1F, 7.5F, -5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
        bodyModel[26].setRotationPoint(1F, 7.5F, -5F);

        bodyModel[27].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 58
        bodyModel[27].setRotationPoint(2F, 4.5F, 7.5F);

        bodyModel[28].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 59
        bodyModel[28].setRotationPoint(-2F, 4.5F, -8.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 60
        bodyModel[29].setRotationPoint(-1F, 6.5F, 7.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 61
        bodyModel[30].setRotationPoint(-1F, 6.5F, -8.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        bodyModel[31].setRotationPoint(2F, 6.75F, -8F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 63
        bodyModel[32].setRotationPoint(-2F, 6.75F, 7F);

        bodyModel[33].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 41
        bodyModel[33].setRotationPoint(-0.5F, 5.5F, -7F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F); // Box 42
        bodyModel[34].setRotationPoint(-3F, 4.5F, 6F);

        bodyModel[35].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 43
        bodyModel[35].setRotationPoint(-0.5F, 5.5F, 5F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F); // Box 44
        bodyModel[36].setRotationPoint(2F, 4.5F, 6F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F); // Box 45
        bodyModel[37].setRotationPoint(2F, 4.5F, -7F);

        bodyModel[38].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
        bodyModel[38].setRotationPoint(4F, 6.5F, 3F);

        bodyModel[39].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 46
        bodyModel[39].setRotationPoint(-4F, 6.5F, -2F);

        bodyModel[40].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 43
        bodyModel[40].setRotationPoint(-5.75F, 7.5F, -5F).rotateAngleY = -3.14159265F;;

        bodyModel[41].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 44
        bodyModel[41].setRotationPoint(6.75F, 7.5F, -5F).rotateAngleY = -3.14159265F;;

        bodyModel[42].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 45
        bodyModel[42].setRotationPoint(6.75F, 7.5F, 5F).rotateAngleY = -3.14159265F;;
    }
}