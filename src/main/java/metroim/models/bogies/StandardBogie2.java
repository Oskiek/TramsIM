package metroim.models.bogies;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class StandardBogie2 extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public StandardBogie2() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[73];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
        bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13
        bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 14
        bodyModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 35
        bodyModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 42
        bodyModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 44
        bodyModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 45
        bodyModel[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 46
        bodyModel[10] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 47
        bodyModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 49
        bodyModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 54
        bodyModel[13] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 55
        bodyModel[14] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 56
        bodyModel[15] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 57
        bodyModel[16] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 60
        bodyModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 62
        bodyModel[18] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 41
        bodyModel[19] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 43
        bodyModel[20] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 45
        bodyModel[21] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 46
        bodyModel[22] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 43
        bodyModel[23] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 44
        bodyModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 45
        bodyModel[25] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 43
        bodyModel[26] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 44
        bodyModel[27] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 48
        bodyModel[28] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 49
        bodyModel[29] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 50
        bodyModel[30] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 51
        bodyModel[31] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 52
        bodyModel[32] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 53
        bodyModel[33] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 54
        bodyModel[34] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 55
        bodyModel[35] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 56
        bodyModel[36] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 57
        bodyModel[37] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 58
        bodyModel[38] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 59
        bodyModel[39] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 60
        bodyModel[40] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 61
        bodyModel[41] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 62
        bodyModel[42] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 63
        bodyModel[43] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 64
        bodyModel[44] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 65
        bodyModel[45] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 66
        bodyModel[46] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 67
        bodyModel[47] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 68
        bodyModel[48] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 69
        bodyModel[49] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 70
        bodyModel[50] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 71
        bodyModel[51] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 72
        bodyModel[52] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 73
        bodyModel[53] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 74
        bodyModel[54] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 75
        bodyModel[55] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 76
        bodyModel[56] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 77
        bodyModel[57] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 78
        bodyModel[58] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 79
        bodyModel[59] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 80
        bodyModel[60] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 81
        bodyModel[61] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 82
        bodyModel[62] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 83
        bodyModel[63] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 84
        bodyModel[64] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 85
        bodyModel[65] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 86
        bodyModel[66] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 69
        bodyModel[67] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 70
        bodyModel[68] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 71
        bodyModel[69] = new ModelRendererTurbo(this, 13, 15, textureX, textureY); // Box 72
        bodyModel[70] = new ModelRendererTurbo(this, 3, 14, textureX, textureY); // Box 74
        bodyModel[71] = new ModelRendererTurbo(this, 13, 19, textureX, textureY); // Box 75
        bodyModel[72] = new ModelRendererTurbo(this, 3, 14, textureX, textureY); // Box 76

        bodyModel[0].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 1
        bodyModel[0].setRotationPoint(-5.75F, 7.5F, 5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 4
        bodyModel[1].setRotationPoint(6.25F, 7F, -6F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 5
        bodyModel[2].setRotationPoint(-6.25F, 7F, -6F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        bodyModel[3].setRotationPoint(5F, 4.5F, 6F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        bodyModel[4].setRotationPoint(-8F, 4.5F, 6F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 35
        bodyModel[5].setRotationPoint(-1F, 4.5F, -7F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
        bodyModel[6].setRotationPoint(-7.75F, 8F, -7F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
        bodyModel[7].setRotationPoint(-4.75F, 6.25F, -7F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
        bodyModel[8].setRotationPoint(-8F, 4.5F, -7F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 46
        bodyModel[9].setRotationPoint(-3F, 4.5F, -7F);

        bodyModel[10].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 47
        bodyModel[10].setRotationPoint(-1F, 6.5F, -7F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
        bodyModel[11].setRotationPoint(5F, 4.5F, -7F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 54
        bodyModel[12].setRotationPoint(-1.5F, 8.5F, 4.5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 55
        bodyModel[13].setRotationPoint(-1.5F, 8.5F, -5.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
        bodyModel[14].setRotationPoint(-1F, 7.5F, -5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 57
        bodyModel[15].setRotationPoint(1F, 7.5F, -5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 60
        bodyModel[16].setRotationPoint(4F, 5F, 7.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        bodyModel[17].setRotationPoint(1.5F, 7.5F, -8F);

        bodyModel[18].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 41
        bodyModel[18].setRotationPoint(-0.5F, 5.5F, -8.25F);

        bodyModel[19].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 43
        bodyModel[19].setRotationPoint(-0.5F, 5.5F, 6.25F);

        bodyModel[20].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 45
        bodyModel[20].setRotationPoint(4F, 6.5F, 3F);

        bodyModel[21].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 46
        bodyModel[21].setRotationPoint(-4F, 6.5F, -2F);

        bodyModel[22].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 43
        bodyModel[22].setRotationPoint(-5.75F, 7.5F, -5F);

        bodyModel[23].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 44
        bodyModel[23].setRotationPoint(6.75F, 7.5F, -5F);

        bodyModel[24].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 45
        bodyModel[24].setRotationPoint(6.75F, 7.5F, 5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 43
        bodyModel[25].setRotationPoint(-2F, 4.5F, -8.5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
        bodyModel[26].setRotationPoint(-0.5F, 6.5F, -8F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 48
        bodyModel[27].setRotationPoint(4F, 5F, 8.5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 49
        bodyModel[28].setRotationPoint(4F, 5F, 6.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[29].setRotationPoint(2F, 4.5F, -7F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 51
        bodyModel[30].setRotationPoint(-4.75F, 7.25F, -7F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 52
        bodyModel[31].setRotationPoint(-7.75F, 7.25F, -7F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
        bodyModel[32].setRotationPoint(-7.75F, 6.25F, -7F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F); // Box 54
        bodyModel[33].setRotationPoint(-7.75F, 8.5F, -7F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
        bodyModel[34].setRotationPoint(4.75F, 8F, -7F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F); // Box 56
        bodyModel[35].setRotationPoint(4.75F, 8.5F, -7F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 57
        bodyModel[36].setRotationPoint(7.75F, 7.25F, -7F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
        bodyModel[37].setRotationPoint(7.75F, 6.25F, -7F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
        bodyModel[38].setRotationPoint(4.75F, 6.25F, -7F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 60
        bodyModel[39].setRotationPoint(4.75F, 7.25F, -7F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 61
        bodyModel[40].setRotationPoint(6.25F, 7F, -6.99F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 62
        bodyModel[41].setRotationPoint(-6.25F, 7F, -6.99F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F); // Box 63
        bodyModel[42].setRotationPoint(-2F, 6.5F, -8.5F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 64
        bodyModel[43].setRotationPoint(-0.5F, 7.75F, -8.5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 65
        bodyModel[44].setRotationPoint(-5F, 5F, -7.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 66
        bodyModel[45].setRotationPoint(-5F, 5F, -8.5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 67
        bodyModel[46].setRotationPoint(-5F, 5F, -9.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F); // Box 68
        bodyModel[47].setRotationPoint(1.5F, 6.5F, 7.5F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 69
        bodyModel[48].setRotationPoint(0.5F, 7.75F, 7F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 70
        bodyModel[49].setRotationPoint(-1.5F, 7.5F, 7F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 71
        bodyModel[50].setRotationPoint(-0.5F, 6.5F, 7F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 72
        bodyModel[51].setRotationPoint(2F, 4.5F, 7.5F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 73
        bodyModel[52].setRotationPoint(4.75F, 8F, 6F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F); // Box 74
        bodyModel[53].setRotationPoint(4.75F, 8.5F, 6F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
        bodyModel[54].setRotationPoint(6.25F, 7F, 5.99F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 76
        bodyModel[55].setRotationPoint(7.75F, 7.25F, 6F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
        bodyModel[56].setRotationPoint(7.75F, 6.25F, 6F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        bodyModel[57].setRotationPoint(4.75F, 6.25F, 6F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 79
        bodyModel[58].setRotationPoint(4.75F, 7.25F, 6F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F); // Box 80
        bodyModel[59].setRotationPoint(-7.75F, 8.5F, 6F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 81
        bodyModel[60].setRotationPoint(-7.75F, 8F, 6F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 82
        bodyModel[61].setRotationPoint(-7.75F, 7.25F, 6F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        bodyModel[62].setRotationPoint(-7.75F, 6.25F, 6F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
        bodyModel[63].setRotationPoint(-4.75F, 6.25F, 6F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 85
        bodyModel[64].setRotationPoint(-4.75F, 7.25F, 6F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 86
        bodyModel[65].setRotationPoint(-6.25F, 7F, 5.99F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 69
        bodyModel[66].setRotationPoint(-3F, 4.5F, 6F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 70
        bodyModel[67].setRotationPoint(2F, 4.5F, 6F);

        bodyModel[68].addShapeBox(0F, -1F, 0F, 3, 3, 1, 0F,2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 71
        bodyModel[68].setRotationPoint(-1F, 6.5F, 6F);

        bodyModel[69].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 72
        bodyModel[69].setRotationPoint(2F, 5F, 8F);

        bodyModel[70].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 74
        bodyModel[70].setRotationPoint(-8.5F, 4F, 6.01F);

        bodyModel[71].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 75
        bodyModel[71].setRotationPoint(-5F, 5F, -8F);

        bodyModel[72].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 76
        bodyModel[72].setRotationPoint(4F, 4F, -7.01F);
    }
}