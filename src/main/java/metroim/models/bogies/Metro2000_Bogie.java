package metroim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Metro2000_Bogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public Metro2000_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[55];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
        bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13
        bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 14
        bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 16
        bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 28
        bodyModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 35
        bodyModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 39
        bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 41
        bodyModel[10] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 45
        bodyModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 46
        bodyModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 47
        bodyModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 49
        bodyModel[14] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 56
        bodyModel[15] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 57
        bodyModel[16] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 58
        bodyModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 59
        bodyModel[18] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 60
        bodyModel[19] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 61
        bodyModel[20] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 62
        bodyModel[21] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 63
        bodyModel[22] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 41
        bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 42
        bodyModel[24] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 43
        bodyModel[25] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 44
        bodyModel[26] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 45
        bodyModel[27] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 45
        bodyModel[28] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 46
        bodyModel[29] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 43
        bodyModel[30] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 44
        bodyModel[31] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 45
        bodyModel[32] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 46
        bodyModel[33] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 47
        bodyModel[34] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 48
        bodyModel[35] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 49
        bodyModel[36] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 50
        bodyModel[37] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 51
        bodyModel[38] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 52
        bodyModel[39] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 53
        bodyModel[40] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 54
        bodyModel[41] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 55
        bodyModel[42] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 56
        bodyModel[43] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 57
        bodyModel[44] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 58
        bodyModel[45] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 59
        bodyModel[46] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 58
        bodyModel[47] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 59
        bodyModel[48] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 60
        bodyModel[49] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 61
        bodyModel[50] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 62
        bodyModel[51] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 63
        bodyModel[52] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 64
        bodyModel[53] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 65
        bodyModel[54] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 66

        bodyModel[0].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 1
        bodyModel[0].setRotationPoint(-5.75F, 7.5F, 5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
        bodyModel[1].setRotationPoint(6.25F, 7F, -6F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
        bodyModel[2].setRotationPoint(-6.25F, 7F, -6F);

        bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 13
        bodyModel[3].setRotationPoint(5F, 4.5F, 6F);

        bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 14
        bodyModel[4].setRotationPoint(-8F, 4.5F, 6F);

        bodyModel[5].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bodyModel[5].setRotationPoint(-1F, 6F, 6F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 28
        bodyModel[6].setRotationPoint(5.75F, 7F, 6.2F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 35
        bodyModel[7].setRotationPoint(-1F, 4F, -7F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        bodyModel[8].setRotationPoint(-7.5F, 7F, 6F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
        bodyModel[9].setRotationPoint(7.5F, 7F, 6F);

        bodyModel[10].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 45
        bodyModel[10].setRotationPoint(-8F, 4.5F, -7F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 46
        bodyModel[11].setRotationPoint(-3F, 4.5F, -7F);

        bodyModel[12].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        bodyModel[12].setRotationPoint(-1F, 6F, -7F);

        bodyModel[13].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 49
        bodyModel[13].setRotationPoint(5F, 4.5F, -7F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
        bodyModel[14].setRotationPoint(-1F, 6.5F, -5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
        bodyModel[15].setRotationPoint(1F, 6.5F, -5F);

        bodyModel[16].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 58
        bodyModel[16].setRotationPoint(2F, 4F, 7.5F);

        bodyModel[17].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 59
        bodyModel[17].setRotationPoint(-2F, 4F, -8.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F); // Box 60
        bodyModel[18].setRotationPoint(-1F, 6F, 7.5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F); // Box 61
        bodyModel[19].setRotationPoint(-1F, 6F, -8.5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        bodyModel[20].setRotationPoint(2F, 6.25F, -8F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 63
        bodyModel[21].setRotationPoint(-2F, 6.25F, 7F);

        bodyModel[22].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 41
        bodyModel[22].setRotationPoint(-0.5F, 5F, -7F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F); // Box 42
        bodyModel[23].setRotationPoint(-3F, 4.5F, 6F);

        bodyModel[24].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 43
        bodyModel[24].setRotationPoint(-0.5F, 5F, 5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 44
        bodyModel[25].setRotationPoint(2F, 4.5F, 6F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 0F); // Box 45
        bodyModel[26].setRotationPoint(2F, 4.5F, -7F);

        bodyModel[27].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
        bodyModel[27].setRotationPoint(4F, 6.5F, 3F);

        bodyModel[28].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 46
        bodyModel[28].setRotationPoint(-4F, 6.5F, -2F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
        bodyModel[29].setRotationPoint(-9F, 4.5F, 4.5F);

        bodyModel[30].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 44
        bodyModel[30].setRotationPoint(-5F, 6.5F, 2F);

        bodyModel[31].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
        bodyModel[31].setRotationPoint(5F, 6.5F, -2F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F); // Box 46
        bodyModel[32].setRotationPoint(-9F, 7.5F, 4.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F); // Box 47
        bodyModel[33].setRotationPoint(-9F, 7.5F, -5.5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        bodyModel[34].setRotationPoint(-9F, 4.5F, -5.5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 49
        bodyModel[35].setRotationPoint(9F, 7.5F, -5.5F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[36].setRotationPoint(9F, 4.5F, -5.5F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 51
        bodyModel[37].setRotationPoint(9F, 7.5F, 4.5F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        bodyModel[38].setRotationPoint(9F, 4.5F, 4.5F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
        bodyModel[39].setRotationPoint(-8F, 4.5F, 5F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 54
        bodyModel[40].setRotationPoint(-8F, 4.5F, -6F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 55
        bodyModel[41].setRotationPoint(8F, 4.5F, -6F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
        bodyModel[42].setRotationPoint(8F, 4.5F, 5F);

        bodyModel[43].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 57
        bodyModel[43].setRotationPoint(-5.75F, 7.5F, -5F);

        bodyModel[44].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 58
        bodyModel[44].setRotationPoint(6.75F, 7.5F, -5F);

        bodyModel[45].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 59
        bodyModel[45].setRotationPoint(6.75F, 7.5F, 5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 58
        bodyModel[46].setRotationPoint(3.75F, 7F, 6F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 59
        bodyModel[47].setRotationPoint(-6.75F, 7F, 6.2F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 60
        bodyModel[48].setRotationPoint(-4.75F, 7F, 6F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 61
        bodyModel[49].setRotationPoint(5.75F, 7F, -7.2F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 62
        bodyModel[50].setRotationPoint(3.75F, 7F, -7F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[51].setRotationPoint(-4.75F, 7F, -7F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 64
        bodyModel[52].setRotationPoint(-6.75F, 7F, -7.2F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
        bodyModel[53].setRotationPoint(7.5F, 7F, -7F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
        bodyModel[54].setRotationPoint(-7.5F, 7F, -7F);
    }
}