package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class M8S_Bogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public M8S_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[52];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 7
        bodyModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
        bodyModel[5] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 9
        bodyModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 15
        bodyModel[7] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 16
        bodyModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 19
        bodyModel[9] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 21
        bodyModel[10] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 22
        bodyModel[11] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 23
        bodyModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 24
        bodyModel[13] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 26
        bodyModel[14] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 28
        bodyModel[15] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 29
        bodyModel[16] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 32
        bodyModel[17] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 35
        bodyModel[18] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 36
        bodyModel[19] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 40
        bodyModel[20] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 41
        bodyModel[21] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 42
        bodyModel[22] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 43
        bodyModel[23] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 44
        bodyModel[24] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 45
        bodyModel[25] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 46
        bodyModel[26] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 47
        bodyModel[27] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 48
        bodyModel[28] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 49
        bodyModel[29] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 50
        bodyModel[30] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 51
        bodyModel[31] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 52
        bodyModel[32] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 53
        bodyModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 53
        bodyModel[34] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 89
        bodyModel[35] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 90
        bodyModel[36] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 91
        bodyModel[37] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 92
        bodyModel[38] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 93
        bodyModel[39] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 94
        bodyModel[40] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 101
        bodyModel[41] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 102
        bodyModel[42] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 103
        bodyModel[43] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 104
        bodyModel[44] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 105
        bodyModel[45] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 106
        bodyModel[46] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 107
        bodyModel[47] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 108
        bodyModel[48] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 109
        bodyModel[49] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 110
        bodyModel[50] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 111
        bodyModel[51] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 112

        bodyModel[0].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        bodyModel[0].setRotationPoint(-8F, 5F, -5F);

        bodyModel[1].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
        bodyModel[1].setRotationPoint(2.85F, 5F, -5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
        bodyModel[2].setRotationPoint(-6F, 7F, -5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 7
        bodyModel[3].setRotationPoint(-8.2F, 6.15F, -6.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 8
        bodyModel[4].setRotationPoint(-4.8F, 6.15F, -6.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
        bodyModel[5].setRotationPoint(-7.5F, 8.75F, -6.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 15
        bodyModel[6].setRotationPoint(6.05F, 6.15F, -6.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
        bodyModel[7].setRotationPoint(3.35F, 8.75F, -6.5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
        bodyModel[8].setRotationPoint(4.85F, 7F, -5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 21
        bodyModel[9].setRotationPoint(2.65F, 6.15F, -6.5F);

        bodyModel[10].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 22
        bodyModel[10].setRotationPoint(2.85F, 5F, 5F);

        bodyModel[11].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[11].setRotationPoint(-8F, 5F, 5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 24
        bodyModel[12].setRotationPoint(-4.8F, 6.15F, 5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 26
        bodyModel[13].setRotationPoint(-6.5F, 6.5F, 4.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 28
        bodyModel[14].setRotationPoint(-8.2F, 6.15F, 5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
        bodyModel[15].setRotationPoint(-7.5F, 8.75F, 5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 32
        bodyModel[16].setRotationPoint(-4.2F, 8.25F, 5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 35
        bodyModel[17].setRotationPoint(2.65F, 6.15F, 5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
        bodyModel[18].setRotationPoint(3.35F, 8.75F, 5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 40
        bodyModel[19].setRotationPoint(6.05F, 6.15F, 5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 1, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 41
        bodyModel[20].setRotationPoint(-8.5F, 8.5F, -4.5F);

        bodyModel[21].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 42
        bodyModel[21].setRotationPoint(-8.5F, 5.5F, -5.5F);

        bodyModel[22].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 43
        bodyModel[22].setRotationPoint(-8.5F, 5.5F, 4.5F);

        bodyModel[23].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 44
        bodyModel[23].setRotationPoint(-7F, 6F, -3F);

        bodyModel[24].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 45
        bodyModel[24].setRotationPoint(4F, 6F, -3F);

        bodyModel[25].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 46
        bodyModel[25].setRotationPoint(-4F, 6F, -2F);

        bodyModel[26].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 47
        bodyModel[26].setRotationPoint(-2.5F, 6.5F, -5F);

        bodyModel[27].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 48
        bodyModel[27].setRotationPoint(-2.5F, 6.5F, 4F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 49
        bodyModel[28].setRotationPoint(1F, 6F, -4F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 50
        bodyModel[29].setRotationPoint(-2F, 6F, -4F);

        bodyModel[30].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 51
        bodyModel[30].setRotationPoint(8.5F, 5.5F, -5.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 1, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 52
        bodyModel[31].setRotationPoint(8.5F, 8.5F, -4.5F);

        bodyModel[32].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 53
        bodyModel[32].setRotationPoint(8.5F, 5.5F, 4.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 53
        bodyModel[33].setRotationPoint(-6F, 4.5F, -2F);

        bodyModel[34].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 89
        bodyModel[34].setRotationPoint(-2.5F, 6.5F, 6F);

        bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 90
        bodyModel[35].setRotationPoint(-2.5F, 7F, 7F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 91
        bodyModel[36].setRotationPoint(4.35F, 6.5F, 4.5F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 92
        bodyModel[37].setRotationPoint(4.35F, 6.5F, -6F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 93
        bodyModel[38].setRotationPoint(-6.5F, 6.5F, -6F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.6F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 94
        bodyModel[39].setRotationPoint(-4.2F, 8.25F, -6F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
        bodyModel[40].setRotationPoint(1.3F, 7.5F, 6F);

        bodyModel[41].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 102
        bodyModel[41].setRotationPoint(1.3F, 4.5F, 7F);

        bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 103
        bodyModel[42].setRotationPoint(1.3F, 8F, 6.8F);
        bodyModel[42].rotateAngleX = 0.78539816F;

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 104
        bodyModel[43].setRotationPoint(-2.7F, 7.5F, -7F);

        bodyModel[44].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 105
        bodyModel[44].setRotationPoint(-2.7F, 4.5F, -8F);

        bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 106
        bodyModel[45].setRotationPoint(-2.7F, 8F, -8.2F);
        bodyModel[45].rotateAngleX = 0.78539816F;

        bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 107
        bodyModel[46].setRotationPoint(1.5F, 6.5F, -7F);

        bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 108
        bodyModel[47].setRotationPoint(1.5F, 7F, -8F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 109
        bodyModel[48].setRotationPoint(0.5F, 6.5F, -7F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[49].setRotationPoint(2.5F, 6.5F, -7F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[50].setRotationPoint(-1.5F, 6.5F, 6F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 112
        bodyModel[51].setRotationPoint(-3.5F, 6.5F, 6F);
    }
}