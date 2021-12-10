package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class SD_100_articulation extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public SD_100_articulation() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[49];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
        bodyModel[1] = new ModelRendererTurbo(this, 16, 1, textureX, textureY); // Box 59
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 68
        bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 21
        bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 26
        bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 67
        bodyModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 68
        bodyModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 69
        bodyModel[8] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 70
        bodyModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 71
        bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 72
        bodyModel[11] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 73
        bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 74
        bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 53
        bodyModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 123
        bodyModel[15] = new ModelRendererTurbo(this, 285, 0, textureX, textureY); // Box 71
        bodyModel[16] = new ModelRendererTurbo(this, 295, 0, textureX, textureY); // Box 72
        bodyModel[17] = new ModelRendererTurbo(this, 306, 0, textureX, textureY); // Box 73
        bodyModel[18] = new ModelRendererTurbo(this, 314, 0, textureX, textureY); // Box 74
        bodyModel[19] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
        bodyModel[20] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 20
        bodyModel[21] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 21
        bodyModel[22] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 22
        bodyModel[23] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 26
        bodyModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 27
        bodyModel[25] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 30
        bodyModel[26] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 31
        bodyModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 28
        bodyModel[28] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 25
        bodyModel[29] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 72
        bodyModel[30] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 76
        bodyModel[31] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 77
        bodyModel[32] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 78
        bodyModel[33] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 79
        bodyModel[34] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 80
        bodyModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 81
        bodyModel[36] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 83
        bodyModel[37] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 84
        bodyModel[38] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 79
        bodyModel[39] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 107
        bodyModel[40] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 108
        bodyModel[41] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 109
        bodyModel[42] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 110
        bodyModel[43] = new ModelRendererTurbo(this, 203, 21, textureX, textureY); // Box 321
        bodyModel[44] = new ModelRendererTurbo(this, 203, 21, textureX, textureY); // Box 322
        bodyModel[45] = new ModelRendererTurbo(this, 203, 21, textureX, textureY); // Box 323
        bodyModel[46] = new ModelRendererTurbo(this, 203, 21, textureX, textureY); // Box 324
        bodyModel[47] = new ModelRendererTurbo(this, 203, 21, textureX, textureY); // Box 325
        bodyModel[48] = new ModelRendererTurbo(this, 203, 21, textureX, textureY); // Box 326

        bodyModel[0].addBox(0F, 0F, 0F, 5, 23, 1, 0F); // Box 55
        bodyModel[0].setRotationPoint(-2.5F, -17F, -10.12F);

        bodyModel[1].addBox(0F, 0F, 0F, 5, 23, 1, 0F); // Box 59
        bodyModel[1].setRotationPoint(-2.5F, -17F, 8.88F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 18, 0F,1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 1.4F, 1F, 0F, 1.4F); // Box 68
        bodyModel[2].setRotationPoint(-1.5F, -19F, -9.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 2F); // Box 21
        bodyModel[3].setRotationPoint(-2F, 1.99F, -7.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F); // Box 26
        bodyModel[4].setRotationPoint(-6F, 1.99F, -6.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F); // Box 67
        bodyModel[5].setRotationPoint(-6F, 1.99F, 0.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 1.5F, 0F, 0F, -1.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 68
        bodyModel[6].setRotationPoint(3F, 1.99F, -6.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F); // Box 69
        bodyModel[7].setRotationPoint(3F, 1.99F, 0.5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 70
        bodyModel[8].setRotationPoint(-2F, -12.9F, -8.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,1.5F, 2F, 0F, 1.5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
        bodyModel[9].setRotationPoint(-2F, -12.9F, 7.5F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 1.5F, 0F, 1F); // Box 72
        bodyModel[10].setRotationPoint(-2F, -16.99F, -5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,1.5F, 0.1F, 2.5F, 1.5F, 0.1F, 2.5F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
        bodyModel[11].setRotationPoint(-2F, -15.9F, 7.5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 1F, -3.5F, 0F, 1F, -3.5F, 1.5F, 0.1F, 2.5F, 1.5F, 0.1F, 2.5F, 0F, -1F, 0F, 0F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F); // Box 74
        bodyModel[12].setRotationPoint(-2F, -15.9F, -8.5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 53
        bodyModel[13].setRotationPoint(-6F, 3.5F, -2F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 123
        bodyModel[14].setRotationPoint(-6F, 2.5F, -2F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F); // Box 71
        bodyModel[15].setRotationPoint(-4.5F, -17F, -10.12F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F); // Box 72
        bodyModel[16].setRotationPoint(3.5F, -17F, -8.12F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, -2F, 0F, 0F, 0F); // Box 73
        bodyModel[17].setRotationPoint(2.5F, -17F, 8.88F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 2F, 0F, 0F, 0F); // Box 74
        bodyModel[18].setRotationPoint(-5.5F, -17F, 6.88F);

        bodyModel[19].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 19
        bodyModel[19].setRotationPoint(-1F, 5.5F, -5F);

        bodyModel[20].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 20
        bodyModel[20].setRotationPoint(-3F, 5.75F, -5.5F);

        bodyModel[21].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 21
        bodyModel[21].setRotationPoint(-6F, 6.5F, -5F);

        bodyModel[22].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 22
        bodyModel[22].setRotationPoint(-3F, 5.75F, 4.5F);

        bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 26
        bodyModel[23].setRotationPoint(5.5F, 6F, -6F);

        bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 27
        bodyModel[24].setRotationPoint(-6.5F, 6F, -6F);

        bodyModel[25].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 30
        bodyModel[25].setRotationPoint(-7.5F, 5F, -1F);

        bodyModel[26].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 31
        bodyModel[26].setRotationPoint(1.5F, 5F, -3F);

        bodyModel[27].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 28
        bodyModel[27].setRotationPoint(-3F, 7F, -7F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 7F, 0F, 0F, 8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 8F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 25
        bodyModel[28].setRotationPoint(-10F, 7F, -1F);

        bodyModel[29].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 72
        bodyModel[29].setRotationPoint(-7F, 5.5F, -8F);

        bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 76
        bodyModel[30].setRotationPoint(-7F, 5.5F, 6F);

        bodyModel[31].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 77
        bodyModel[31].setRotationPoint(5F, 5.5F, 6F);

        bodyModel[32].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 78
        bodyModel[32].setRotationPoint(5F, 5.5F, -8F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        bodyModel[33].setRotationPoint(-0.5F, 5F, -8F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
        bodyModel[34].setRotationPoint(-0.5F, 5F, 7F);

        bodyModel[35].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 81
        bodyModel[35].setRotationPoint(-3F, 7F, 6F);

        bodyModel[36].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 83
        bodyModel[36].setRotationPoint(-9F, 7F, 8F);

        bodyModel[37].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Box 84
        bodyModel[37].setRotationPoint(-9F, 7F, -9F);

        bodyModel[38].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 79
        bodyModel[38].setRotationPoint(-1F, 5.5F, -3F);

        bodyModel[39].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 107
        bodyModel[39].setRotationPoint(6F, 6.5F, -5F);

        bodyModel[40].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 108
        bodyModel[40].setRotationPoint(6F, 6.5F, 5F);

        bodyModel[41].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 109
        bodyModel[41].setRotationPoint(-6F, 6.5F, 5F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 8F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 110
        bodyModel[42].setRotationPoint(9F, 7F, -1F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 321
        bodyModel[43].setRotationPoint(-0.5F, -4F, -7.5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 322
        bodyModel[44].setRotationPoint(-0.25F, -12F, -7.85F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 323
        bodyModel[45].setRotationPoint(-0.5F, -14F, -7.5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 324
        bodyModel[46].setRotationPoint(-0.5F, -4F, 6.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 1F, -0.6F, -0.6F, 1F, -0.6F, -0.6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 325
        bodyModel[47].setRotationPoint(-0.25F, -12F, 6.15F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
        bodyModel[48].setRotationPoint(-0.5F, -14F, 6.5F);
    }
}