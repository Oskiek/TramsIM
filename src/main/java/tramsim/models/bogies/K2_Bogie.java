package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class K2_Bogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public K2_Bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[62];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 213
        bodyModel[1] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 214
        bodyModel[2] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 215
        bodyModel[3] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 216
        bodyModel[4] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 217
        bodyModel[5] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 218
        bodyModel[6] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 6
        bodyModel[7] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 7
        bodyModel[8] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 8
        bodyModel[9] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 9
        bodyModel[10] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 10
        bodyModel[11] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 12
        bodyModel[12] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 13
        bodyModel[13] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 14
        bodyModel[14] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 15
        bodyModel[15] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 16
        bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
        bodyModel[17] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box1
        bodyModel[18] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box2
        bodyModel[19] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box3
        bodyModel[20] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box4
        bodyModel[21] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box5
        bodyModel[22] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box6
        bodyModel[23] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box7
        bodyModel[24] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box8
        bodyModel[25] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box9
        bodyModel[26] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box10
        bodyModel[27] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box11
        bodyModel[28] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box12
        bodyModel[29] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box13
        bodyModel[30] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box14
        bodyModel[31] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box15
        bodyModel[32] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box16
        bodyModel[33] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box17
        bodyModel[34] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box18
        bodyModel[35] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box19
        bodyModel[36] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box20
        bodyModel[37] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box21
        bodyModel[38] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box22
        bodyModel[39] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box23
        bodyModel[40] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box24
        bodyModel[41] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box25
        bodyModel[42] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box26
        bodyModel[43] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box27
        bodyModel[44] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box28
        bodyModel[45] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box29
        bodyModel[46] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box30
        bodyModel[47] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box31
        bodyModel[48] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box32
        bodyModel[49] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box33
        bodyModel[50] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box34
        bodyModel[51] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box35
        bodyModel[52] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box36
        bodyModel[53] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box37
        bodyModel[54] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box38
        bodyModel[55] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box39
        bodyModel[56] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 57
        bodyModel[57] = new ModelRendererTurbo(this, 213, 9, textureX, textureY); // Box 59
        bodyModel[58] = new ModelRendererTurbo(this, 204, 9, textureX, textureY); // Box 60
        bodyModel[59] = new ModelRendererTurbo(this, 161, 16, textureX, textureY); // Box 59
        bodyModel[60] = new ModelRendererTurbo(this, 138, 16, textureX, textureY); // Box 60
        bodyModel[61] = new ModelRendererTurbo(this, 2, 15, textureX, textureY); // Box 61

        bodyModel[0].addBox(0F, 0F, 0F, 3, 17, 3, 0F); // Box 213
        bodyModel[0].setRotationPoint(3F, -15F, -9F);

        bodyModel[1].addBox(0F, 0F, 0F, 3, 17, 3, 0F); // Box 214
        bodyModel[1].setRotationPoint(3F, -15F, 6F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
        bodyModel[2].setRotationPoint(3F, -16F, 7F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
        bodyModel[3].setRotationPoint(3F, -16F, -9F);

        bodyModel[4].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 217
        bodyModel[4].setRotationPoint(3F, -16F, -7F);

        bodyModel[5].addBox(0F, 0F, 0F, 9, 1, 18, 0F); // Box 218
        bodyModel[5].setRotationPoint(-3F, 2F, -9F);

        bodyModel[6].addBox(0F, 0F, 0F, 3, 17, 3, 0F); // Box 6
        bodyModel[6].setRotationPoint(-3F, -15F, -9F);

        bodyModel[7].addBox(0F, 0F, 0F, 3, 17, 3, 0F); // Box 7
        bodyModel[7].setRotationPoint(-3F, -15F, 6F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        bodyModel[8].setRotationPoint(-3F, -16F, 7F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        bodyModel[9].setRotationPoint(-3F, -16F, -9F);

        bodyModel[10].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 10
        bodyModel[10].setRotationPoint(-3F, -16F, -7F);

        bodyModel[11].addBox(0F, 0F, 0F, 3, 16, 3, 0F); // Box 12
        bodyModel[11].setRotationPoint(0F, -14F, -10F);

        bodyModel[12].addBox(0F, 0F, 0F, 3, 16, 3, 0F); // Box 13
        bodyModel[12].setRotationPoint(0F, -14F, 7F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        bodyModel[13].setRotationPoint(0F, -16F, 7F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        bodyModel[14].setRotationPoint(0F, -16F, -10F);

        bodyModel[15].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 16
        bodyModel[15].setRotationPoint(0F, -17F, -7F);

        bodyModel[16].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Import Box0
        bodyModel[16].setRotationPoint(-8F, 4F, 4F);

        bodyModel[17].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Import Box1
        bodyModel[17].setRotationPoint(4F, 4F, 4F);

        bodyModel[18].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Import Box2
        bodyModel[18].setRotationPoint(-8F, 4F, -4F);

        bodyModel[19].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Import Box3
        bodyModel[19].setRotationPoint(4F, 4F, -4F);

        bodyModel[20].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Box4
        bodyModel[20].setRotationPoint(-6F, 6F, 4F);

        bodyModel[21].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Box5
        bodyModel[21].setRotationPoint(6F, 6F, 4F);

        bodyModel[22].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Box6
        bodyModel[22].setRotationPoint(6F, 6F, -5F);

        bodyModel[23].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Import Box7
        bodyModel[23].setRotationPoint(-6F, 6F, -5F);

        bodyModel[24].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import Box8
        bodyModel[24].setRotationPoint(-3F, 8F, 4F);

        bodyModel[25].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import Box9
        bodyModel[25].setRotationPoint(-3F, 8F, -5F);

        bodyModel[26].addBox(0F, 0F, 0F, 7, 3, 4, 0F); // Import Box10
        bodyModel[26].setRotationPoint(-2F, 6F, -2F);

        bodyModel[27].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Import Box11
        bodyModel[27].setRotationPoint(0F, 4F, -5F);

        bodyModel[28].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Import Box12
        bodyModel[28].setRotationPoint(0F, 4F, 2F);

        bodyModel[29].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box13
        bodyModel[29].setRotationPoint(1F, 4.2F, 5F);
        bodyModel[29].rotateAngleX = 0.2443461F;

        bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box14
        bodyModel[30].setRotationPoint(0F, 4F, 5F);

        bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box15
        bodyModel[31].setRotationPoint(2F, 4F, 5F);

        bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box16
        bodyModel[32].setRotationPoint(0F, 8F, 5F);

        bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box17
        bodyModel[33].setRotationPoint(0F, 8F, 6F);

        bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box18
        bodyModel[34].setRotationPoint(2F, 8F, 6F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Import Box19
        bodyModel[35].setRotationPoint(3F, 4F, 4F);
        bodyModel[35].rotateAngleZ = -0.2268928F;

        bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box20
        bodyModel[36].setRotationPoint(7F, 5F, 4F);

        bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box21
        bodyModel[37].setRotationPoint(2F, 4F, -6F);

        bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box22
        bodyModel[38].setRotationPoint(0F, 4F, -6F);

        bodyModel[39].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box23
        bodyModel[39].setRotationPoint(0F, 8F, -6F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box24
        bodyModel[40].setRotationPoint(0F, 8F, -7F);

        bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box25
        bodyModel[41].setRotationPoint(2F, 8F, -7F);

        bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box26
        bodyModel[42].setRotationPoint(-5F, 5F, -5F);

        bodyModel[43].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box27
        bodyModel[43].setRotationPoint(1F, 4F, -6F);
        bodyModel[43].rotateAngleX = -0.2443461F;

        bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F); // Import Box28
        bodyModel[44].setRotationPoint(0F, 5F, -5F);
        bodyModel[44].rotateAngleZ = 3.36848546F;

        bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Box29
        bodyModel[45].setRotationPoint(-5F, 7F, -4F);

        bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Import Box30
        bodyModel[46].setRotationPoint(7F, 7F, -4F);

        bodyModel[47].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Import Box31
        bodyModel[47].setRotationPoint(0F, 3F, -2F);

        bodyModel[48].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Import Box32
        bodyModel[48].setRotationPoint(-6F, 6F, -1F);

        bodyModel[49].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Import Box33
        bodyModel[49].setRotationPoint(6F, 6F, -2F);

        bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box34
        bodyModel[50].setRotationPoint(-3F, 7F, 0F);

        bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box35
        bodyModel[51].setRotationPoint(5F, 7F, -1F);

        bodyModel[52].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Import Box36
        bodyModel[52].setRotationPoint(0F, 8F, -5F);

        bodyModel[53].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Import Box37
        bodyModel[53].setRotationPoint(0F, 8F, 2F);

        bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box38
        bodyModel[54].setRotationPoint(1.5F, 6F, 2F);
        bodyModel[54].rotateAngleY = 0.78539816F;

        bodyModel[55].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box39
        bodyModel[55].setRotationPoint(1.5F, 6F, -5F);
        bodyModel[55].rotateAngleY = 0.78539816F;

        bodyModel[56].addBox(0F, 0F, 0F, 12, 0, 12, 0F); // Box 57
        bodyModel[56].setRotationPoint(-4.5F, 1.95F, -6F);

        bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 59
        bodyModel[57].setRotationPoint(0F, 2F, 9F);

        bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 60
        bodyModel[58].setRotationPoint(0F, 2F, -10F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
        bodyModel[59].setRotationPoint(0F, -17F, -9F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
        bodyModel[60].setRotationPoint(0F, -17F, 7F);

        bodyModel[61].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 61
        bodyModel[61].setRotationPoint(1F, -15F, -0.5F);
    }
}