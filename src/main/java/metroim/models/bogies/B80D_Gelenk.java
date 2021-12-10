package metroim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class B80D_Gelenk extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public B80D_Gelenk() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[71];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 64, 20, textureX, textureY); // Box 55
        bodyModel[1] = new ModelRendererTurbo(this, 63, 41, textureX, textureY); // Box 56
        bodyModel[2] = new ModelRendererTurbo(this, 76, 41, textureX, textureY); // Box 58
        bodyModel[3] = new ModelRendererTurbo(this, 75, 20, textureX, textureY); // Box 59
        bodyModel[4] = new ModelRendererTurbo(this, 4, 21, textureX, textureY); // Box 68
        bodyModel[5] = new ModelRendererTurbo(this, 91, 4, textureX, textureY); // Box 21
        bodyModel[6] = new ModelRendererTurbo(this, 148, 19, textureX, textureY); // Box 26
        bodyModel[7] = new ModelRendererTurbo(this, 129, 19, textureX, textureY); // Box 67
        bodyModel[8] = new ModelRendererTurbo(this, 148, 11, textureX, textureY); // Box 68
        bodyModel[9] = new ModelRendererTurbo(this, 129, 11, textureX, textureY); // Box 69
        bodyModel[10] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 70
        bodyModel[11] = new ModelRendererTurbo(this, 11, 22, textureX, textureY); // Box 71
        bodyModel[12] = new ModelRendererTurbo(this, 75, 4, textureX, textureY); // Box 72
        bodyModel[13] = new ModelRendererTurbo(this, 11, 22, textureX, textureY); // Box 73
        bodyModel[14] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 74
        bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[16] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        bodyModel[17] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
        bodyModel[18] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
        bodyModel[19] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
        bodyModel[20] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 7
        bodyModel[21] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 8
        bodyModel[22] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
        bodyModel[23] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 15
        bodyModel[24] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 16
        bodyModel[25] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 17
        bodyModel[26] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 18
        bodyModel[27] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 19
        bodyModel[28] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 20
        bodyModel[29] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 21
        bodyModel[30] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 22
        bodyModel[31] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 23
        bodyModel[32] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 24
        bodyModel[33] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 25
        bodyModel[34] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 27
        bodyModel[35] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 28
        bodyModel[36] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 29
        bodyModel[37] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 30
        bodyModel[38] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 31
        bodyModel[39] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 32
        bodyModel[40] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 33
        bodyModel[41] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 34
        bodyModel[42] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 35
        bodyModel[43] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 36
        bodyModel[44] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 38
        bodyModel[45] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 39
        bodyModel[46] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 40
        bodyModel[47] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 41
        bodyModel[48] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 42
        bodyModel[49] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 43
        bodyModel[50] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 44
        bodyModel[51] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 45
        bodyModel[52] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 46
        bodyModel[53] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 47
        bodyModel[54] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 48
        bodyModel[55] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 49
        bodyModel[56] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 50
        bodyModel[57] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 51
        bodyModel[58] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 52
        bodyModel[59] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 53
        bodyModel[60] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 53
        bodyModel[61] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 54
        bodyModel[62] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 55
        bodyModel[63] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 56
        bodyModel[64] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 57
        bodyModel[65] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 58
        bodyModel[66] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 59
        bodyModel[67] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 60
        bodyModel[68] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 61
        bodyModel[69] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 62
        bodyModel[70] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 123

        bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F,1F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, 0.25F, 1F, 1F, 0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 55
        bodyModel[0].setRotationPoint(-1.5F, -17F, -10.12F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 56
        bodyModel[1].setRotationPoint(-1.5F, 2F, -10.87F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 1F, 0F, -0.25F); // Box 58
        bodyModel[2].setRotationPoint(-1.5F, 2F, 8.13F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F,1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.25F, 1F, 0F, 0.25F); // Box 59
        bodyModel[3].setRotationPoint(-1.5F, -17F, 8.88F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 1.4F, 1F, 0F, 1.4F); // Box 68
        bodyModel[4].setRotationPoint(-1.5F, -19F, -9.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 21
        bodyModel[5].setRotationPoint(-2F, 1.99F, -7F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F); // Box 26
        bodyModel[6].setRotationPoint(-6F, 1.99F, -6.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F); // Box 67
        bodyModel[7].setRotationPoint(-6F, 1.99F, 0.5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, -1.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 68
        bodyModel[8].setRotationPoint(3F, 1.99F, -6.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 69
        bodyModel[9].setRotationPoint(3F, 1.99F, 0.5F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,1F, 2F, 0F, 1F, 2F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 70
        bodyModel[10].setRotationPoint(-2F, -12.9F, -7.5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 15, 1, 0F,1.5F, 2F, 0F, 1.5F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 71
        bodyModel[11].setRotationPoint(-2F, -12.9F, 6.5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 1F, 1.5F, 0F, 1F); // Box 72
        bodyModel[12].setRotationPoint(-2F, -16.99F, -4F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,1.5F, 0.1F, 2.5F, 1.5F, 0.1F, 2.5F, 1F, 1F, -3.5F, 1F, 1F, -3.5F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F); // Box 73
        bodyModel[13].setRotationPoint(-2F, -15.9F, 6.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,1F, 1F, -3.5F, 1F, 1F, -3.5F, 1.5F, 0.1F, 2.5F, 1.5F, 0.1F, 2.5F, 1F, -1F, 0F, 1F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F); // Box 74
        bodyModel[14].setRotationPoint(-2F, -15.9F, -7.5F);

        bodyModel[15].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 0
        bodyModel[15].setRotationPoint(-9F, 4F, -5F);

        bodyModel[16].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
        bodyModel[16].setRotationPoint(3.85F, 4F, -5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 2
        bodyModel[17].setRotationPoint(-7F, 6F, -5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0.6F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, 0.6F, 0F, -0.6F, -0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, -0.2F, 0F); // Box 5
        bodyModel[18].setRotationPoint(-8.6F, 6F, -7F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, 0.6F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, 0.6F, 0F); // Box 6
        bodyModel[19].setRotationPoint(-6.4F, 5.6F, -7F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 7
        bodyModel[20].setRotationPoint(-9.2F, 5.4F, -7F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 8
        bodyModel[21].setRotationPoint(-5.8F, 5.4F, -7F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
        bodyModel[22].setRotationPoint(-8.5F, 8F, -7F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 15
        bodyModel[23].setRotationPoint(7.05F, 5.4F, -7F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
        bodyModel[24].setRotationPoint(4.35F, 8F, -7F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, 0.6F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, 0.6F, 0F); // Box 17
        bodyModel[25].setRotationPoint(6.45F, 5.6F, -7F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F); // Box 18
        bodyModel[26].setRotationPoint(5.85F, 6F, -6.7F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 19
        bodyModel[27].setRotationPoint(5.85F, 6F, -5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0.6F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, 0.6F, 0F, -0.6F, -0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, -0.2F, 0F); // Box 20
        bodyModel[28].setRotationPoint(4.25F, 6F, -7F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 21
        bodyModel[29].setRotationPoint(3.65F, 5.4F, -7F);

        bodyModel[30].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 22
        bodyModel[30].setRotationPoint(3.85F, 4F, 5F);

        bodyModel[31].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[31].setRotationPoint(-9F, 4F, 5F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 24
        bodyModel[32].setRotationPoint(-5.8F, 5.4F, 5.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, 0.6F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, 0.6F, 0F); // Box 25
        bodyModel[33].setRotationPoint(-6.4F, 5.6F, 5.5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0.6F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, 0.6F, 0F, -0.6F, -0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, -0.2F, 0F); // Box 27
        bodyModel[34].setRotationPoint(-8.6F, 6F, 5.5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 28
        bodyModel[35].setRotationPoint(-9.2F, 5.4F, 5.5F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
        bodyModel[36].setRotationPoint(-8.5F, 8F, 5.5F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 2.1F, 0F, 0.4F, 2.1F, 0F, 0.4F, 2.1F, 0F, -0.6F, 2.1F, 0F, -0.6F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 30
        bodyModel[37].setRotationPoint(-5.2F, 6.5F, 6F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 2.1F, 0F, 0.4F, 1.7F, 0F, 0.4F, 1.7F, 0F, 0.4F, 2.1F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, -0.2F, 0F); // Box 31
        bodyModel[38].setRotationPoint(-3.4F, 6.5F, 6F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.6F, 2.1F, 0F, 0.4F, 2.1F, 0F, 0.4F, 2.1F, 0F, -0.6F, 2.1F, 0F, -0.6F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 32
        bodyModel[39].setRotationPoint(-2.6F, 6.9F, 6F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 1.7F, 0F, 0.4F, 2.1F, 0F, 0.4F, 2.1F, 0F, 0.4F, 1.7F, 0F, 0.4F, 0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.2F, 0F); // Box 33
        bodyModel[40].setRotationPoint(2.2F, 6.5F, 6F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 2.1F, 0F, 0.45F, 2.1F, 0F, 0.45F, 2.1F, 0F, -0.6F, 2.1F, 0F, -0.6F, -0.2F, 0F, 0.45F, -0.2F, 0F, 0.45F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 34
        bodyModel[41].setRotationPoint(3F, 6.5F, 6F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 35
        bodyModel[42].setRotationPoint(3.65F, 5.4F, 5.5F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
        bodyModel[43].setRotationPoint(4.35F, 8F, 5.5F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 0.6F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, 0.6F, 0F, -0.6F, -0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, -0.2F, 0F); // Box 38
        bodyModel[44].setRotationPoint(4.25F, 6F, 5.5F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, 0.6F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, 0F, -0.6F, 0.6F, 0F); // Box 39
        bodyModel[45].setRotationPoint(6.45F, 5.6F, 5.5F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 40
        bodyModel[46].setRotationPoint(7.05F, 5.4F, 5.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 1, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 41
        bodyModel[47].setRotationPoint(-9.5F, 7.5F, -4.5F);

        bodyModel[48].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 42
        bodyModel[48].setRotationPoint(-9.5F, 4.5F, -5.5F);

        bodyModel[49].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 43
        bodyModel[49].setRotationPoint(-9.5F, 4.5F, 4.5F);

        bodyModel[50].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 44
        bodyModel[50].setRotationPoint(-8F, 5F, -3F);

        bodyModel[51].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 45
        bodyModel[51].setRotationPoint(5F, 5F, -3F);

        bodyModel[52].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 46
        bodyModel[52].setRotationPoint(-2F, 5F, -2F);

        bodyModel[53].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 47
        bodyModel[53].setRotationPoint(-2.5F, 6.7F, -5F);

        bodyModel[54].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 48
        bodyModel[54].setRotationPoint(-2.5F, 6.7F, 4F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 49
        bodyModel[55].setRotationPoint(1F, 5.5F, -4F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 50
        bodyModel[56].setRotationPoint(-2F, 5.5F, -4F);

        bodyModel[57].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 51
        bodyModel[57].setRotationPoint(9.5F, 4.5F, -5.5F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 1, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 52
        bodyModel[58].setRotationPoint(9.5F, 7.5F, -4.5F);

        bodyModel[59].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 53
        bodyModel[59].setRotationPoint(9.5F, 4.5F, 4.5F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 53
        bodyModel[60].setRotationPoint(-6F, 3.5F, -2F);

        bodyModel[61].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 54
        bodyModel[61].setRotationPoint(-6F, 5F, -2F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.6F, 2.1F, 0F, 0.4F, 2.1F, 0F, 0.4F, 2.1F, 0F, -0.6F, 2.1F, 0F, -0.6F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 55
        bodyModel[62].setRotationPoint(-2.6F, 6.9F, -7F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 1.7F, 0F, 0.4F, 2.1F, 0F, 0.4F, 2.1F, 0F, 0.4F, 1.7F, 0F, 0.4F, 0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.2F, 0F); // Box 56
        bodyModel[63].setRotationPoint(2.2F, 6.5F, -7F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 2.1F, 0F, 0.45F, 2.1F, 0F, 0.45F, 2.1F, 0F, -0.6F, 2.1F, 0F, -0.6F, -0.2F, 0F, 0.45F, -0.2F, 0F, 0.45F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 57
        bodyModel[64].setRotationPoint(3F, 6.5F, -7F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, 2.1F, 0F, 0.4F, 2.1F, 0F, 0.4F, 2.1F, 0F, -0.6F, 2.1F, 0F, -0.6F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 58
        bodyModel[65].setRotationPoint(-5.2F, 6.5F, -7F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, 2.1F, 0F, 0.4F, 1.7F, 0F, 0.4F, 1.7F, 0F, 0.4F, 2.1F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, -0.2F, 0F); // Box 59
        bodyModel[66].setRotationPoint(-3.4F, 6.5F, -7F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F); // Box 60
        bodyModel[67].setRotationPoint(-7F, 6F, -6.7F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F); // Box 61
        bodyModel[68].setRotationPoint(5.85F, 6F, 5.7F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F); // Box 62
        bodyModel[69].setRotationPoint(-7F, 6F, 5.7F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 123
        bodyModel[70].setRotationPoint(-6F, 2.5F, -2F);
    }
}