package spanish_pack.models.bogies;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class LocoBogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public LocoBogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[45];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
        bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
        bodyModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 27
        bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 28
        bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 35
        bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 39
        bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 42
        bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 45
        bodyModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 46
        bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 47
        bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 49
        bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 50
        bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 51
        bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 52
        bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 55
        bodyModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 56
        bodyModel[17] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 57
        bodyModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 41
        bodyModel[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 45
        bodyModel[20] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 45
        bodyModel[21] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 46
        bodyModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 44
        bodyModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 43
        bodyModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 44
        bodyModel[25] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 45
        bodyModel[26] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 46
        bodyModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 47
        bodyModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 48
        bodyModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 49
        bodyModel[30] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 50
        bodyModel[31] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 51
        bodyModel[32] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 52
        bodyModel[33] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 53
        bodyModel[34] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 54
        bodyModel[35] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 55
        bodyModel[36] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 56
        bodyModel[37] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 57
        bodyModel[38] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 59
        bodyModel[39] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 60
        bodyModel[40] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 61
        bodyModel[41] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 62
        bodyModel[42] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 63
        bodyModel[43] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 64
        bodyModel[44] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 65

        bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
        bodyModel[0].setRotationPoint(6.25F, 7F, -6F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
        bodyModel[1].setRotationPoint(-6.25F, 7F, -6F);

        bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 25
        bodyModel[2].setRotationPoint(-7.75F, 8F, 6F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[3].setRotationPoint(-4.75F, 7F, 6F);

        bodyModel[4].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 28
        bodyModel[4].setRotationPoint(4.75F, 8F, 6F);

        bodyModel[5].addBox(0F, 0F, 0F, 5, 1, 18, 0F); // Box 35
        bodyModel[5].setRotationPoint(-2F, 3.5F, -9F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        bodyModel[6].setRotationPoint(-7.75F, 7F, 6F);

        bodyModel[7].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 42
        bodyModel[7].setRotationPoint(-7.75F, 8F, -7F);

        bodyModel[8].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 45
        bodyModel[8].setRotationPoint(-9F, 4.5F, -7F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F); // Box 46
        bodyModel[9].setRotationPoint(-2F, 4.5F, -7F);

        bodyModel[10].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        bodyModel[10].setRotationPoint(-1F, 6.5F, -7F);

        bodyModel[11].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 49
        bodyModel[11].setRotationPoint(4F, 4.5F, -7F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[12].setRotationPoint(7.75F, 7F, -7F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[13].setRotationPoint(4.75F, 7F, -7F);

        bodyModel[14].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 52
        bodyModel[14].setRotationPoint(4.75F, 8F, -7F);

        bodyModel[15].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 55
        bodyModel[15].setRotationPoint(-2F, 8.5F, -9F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
        bodyModel[16].setRotationPoint(-1F, 7.5F, -5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
        bodyModel[17].setRotationPoint(1F, 7.5F, -5F);

        bodyModel[18].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 41
        bodyModel[18].setRotationPoint(-1.75F, 4.5F, -9F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F); // Box 45
        bodyModel[19].setRotationPoint(2F, 4.5F, -7F);

        bodyModel[20].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
        bodyModel[20].setRotationPoint(4F, 6.5F, 3F);

        bodyModel[21].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 46
        bodyModel[21].setRotationPoint(-4F, 6.5F, -2F);

        bodyModel[22].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 44
        bodyModel[22].setRotationPoint(6.75F, 7.5F, -5F);

        bodyModel[23].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 43
        bodyModel[23].setRotationPoint(-5.75F, 7.5F, -5F);

        bodyModel[24].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 44
        bodyModel[24].setRotationPoint(-5.75F, 7.5F, 5F);

        bodyModel[25].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 45
        bodyModel[25].setRotationPoint(6.75F, 7.5F, 5F);

        bodyModel[26].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 46
        bodyModel[26].setRotationPoint(0.75F, 4.5F, -9F);

        bodyModel[27].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 47
        bodyModel[27].setRotationPoint(-9F, 4.5F, 6F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F); // Box 48
        bodyModel[28].setRotationPoint(-2F, 4.5F, 6F);

        bodyModel[29].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 49
        bodyModel[29].setRotationPoint(4F, 4.5F, 6F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F); // Box 50
        bodyModel[30].setRotationPoint(2F, 4.5F, 6F);

        bodyModel[31].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[31].setRotationPoint(-1F, 6.5F, 6F);

        bodyModel[32].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 52
        bodyModel[32].setRotationPoint(0.75F, 4.5F, 7F);

        bodyModel[33].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 53
        bodyModel[33].setRotationPoint(-1.75F, 4.5F, 7F);

        bodyModel[34].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 54
        bodyModel[34].setRotationPoint(-2F, 8.5F, 6F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
        bodyModel[35].setRotationPoint(-7.75F, 7F, -7F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
        bodyModel[36].setRotationPoint(-4.75F, 7F, -7F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        bodyModel[37].setRotationPoint(7.75F, 7F, 6F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
        bodyModel[38].setRotationPoint(4.75F, 7F, 6F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 60
        bodyModel[39].setRotationPoint(6.25F, 7F, 6F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 61
        bodyModel[40].setRotationPoint(6.25F, 7F, -7F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 62
        bodyModel[41].setRotationPoint(-6.25F, 7F, -7F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 63
        bodyModel[42].setRotationPoint(-6.25F, 7F, 6F);

        bodyModel[43].addShapeBox(0F, -1F, 0F, 5, 4, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 64
        bodyModel[43].setRotationPoint(-5F, 6.5F, 3F);

        bodyModel[44].addShapeBox(0F, -1F, 0F, 5, 4, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 65
        bodyModel[44].setRotationPoint(3F, 6.5F, -2F);
    }
}