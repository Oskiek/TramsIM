package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ST12_Bogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public ST12_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[36];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 18
        bodyModel[1] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 19
        bodyModel[2] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 20
        bodyModel[3] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 21
        bodyModel[4] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 22
        bodyModel[5] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 23
        bodyModel[6] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 24
        bodyModel[7] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 25
        bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
        bodyModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 27
        bodyModel[10] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 29
        bodyModel[11] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 30
        bodyModel[12] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 31
        bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 66
        bodyModel[14] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 28
        bodyModel[15] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 29
        bodyModel[16] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 16
        bodyModel[17] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 17
        bodyModel[18] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 23
        bodyModel[19] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 24
        bodyModel[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 25
        bodyModel[21] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 26
        bodyModel[22] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 71
        bodyModel[23] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 72
        bodyModel[24] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 73
        bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 74
        bodyModel[26] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 76
        bodyModel[27] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 77
        bodyModel[28] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 78
        bodyModel[29] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 79
        bodyModel[30] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 80
        bodyModel[31] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 81
        bodyModel[32] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 82
        bodyModel[33] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 83
        bodyModel[34] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 84
        bodyModel[35] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 85

        bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 18
        bodyModel[0].setRotationPoint(-1F, 3F, -1F);

        bodyModel[1].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 19
        bodyModel[1].setRotationPoint(-1F, 4.5F, -4F);

        bodyModel[2].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 20
        bodyModel[2].setRotationPoint(-3F, 4.75F, -4.5F);

        bodyModel[3].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 21
        bodyModel[3].setRotationPoint(-8.5F, 3F, -4F);

        bodyModel[4].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 22
        bodyModel[4].setRotationPoint(-3F, 4.75F, 3.5F);

        bodyModel[5].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[5].setRotationPoint(-8.5F, 3F, 4F);

        bodyModel[6].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 24
        bodyModel[6].setRotationPoint(3.5F, 3F, 4F);

        bodyModel[7].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 25
        bodyModel[7].setRotationPoint(3.5F, 3F, -4F);

        bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
        bodyModel[8].setRotationPoint(5.5F, 5F, -6F);

        bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
        bodyModel[9].setRotationPoint(-6.5F, 5F, -6F);

        bodyModel[10].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 29
        bodyModel[10].setRotationPoint(-7F, 5F, -1F);

        bodyModel[11].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 30
        bodyModel[11].setRotationPoint(-7.5F, 4F, -1F);

        bodyModel[12].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 31
        bodyModel[12].setRotationPoint(1.5F, 4F, -3F);

        bodyModel[13].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 66
        bodyModel[13].setRotationPoint(-1F, 4F, -1F);

        bodyModel[14].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 28
        bodyModel[14].setRotationPoint(-3F, 6F, -7F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 29
        bodyModel[15].setRotationPoint(-9F, 6F, -8F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -2F, -17F, 0F, 0F, -17F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, -17F, 0F, 0F, -17F, 0F, 0F, -1F, 0F, 1F); // Box 16
        bodyModel[16].setRotationPoint(-10F, 6F, -8F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, 1F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, -2F); // Box 17
        bodyModel[17].setRotationPoint(-10F, 6F, 7F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, -1F, -17F, 0F, 0F, -16F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, -1F, -17F, 0F, 0F, -16F, 0F, -1F, -1F, 0F, 1F); // Box 23
        bodyModel[18].setRotationPoint(8F, 6F, 6F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
        bodyModel[19].setRotationPoint(9F, 6F, 1F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
        bodyModel[20].setRotationPoint(-10F, 6F, 1F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,-1F, 0F, -1F, -16F, 0F, -3F, -17F, 0F, 2F, -1F, 0F, 1F, -1F, 0F, -1F, -16F, 0F, -3F, -17F, 0F, 2F, -1F, 0F, 1F); // Box 26
        bodyModel[21].setRotationPoint(8F, 6F, -9F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 71
        bodyModel[22].setRotationPoint(6F, 6F, -9F);

        bodyModel[23].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 72
        bodyModel[23].setRotationPoint(-7F, 4.5F, -7F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 73
        bodyModel[24].setRotationPoint(-9F, 6F, 7F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 74
        bodyModel[25].setRotationPoint(6F, 6F, 8F);

        bodyModel[26].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 76
        bodyModel[26].setRotationPoint(-7F, 4.5F, 6F);

        bodyModel[27].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 77
        bodyModel[27].setRotationPoint(5F, 4.5F, 6F);

        bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 78
        bodyModel[28].setRotationPoint(5F, 4.5F, -7F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        bodyModel[29].setRotationPoint(-0.5F, 4F, -8F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        bodyModel[30].setRotationPoint(-0.5F, 4F, 7F);

        bodyModel[31].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 81
        bodyModel[31].setRotationPoint(-3F, 6F, 6F);

        bodyModel[32].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 82
        bodyModel[32].setRotationPoint(4F, 6F, 8F);

        bodyModel[33].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 83
        bodyModel[33].setRotationPoint(-6F, 6F, 8F);

        bodyModel[34].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 84
        bodyModel[34].setRotationPoint(-6F, 6F, -9F);

        bodyModel[35].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 85
        bodyModel[35].setRotationPoint(4F, 6F, -9F);
    }
}