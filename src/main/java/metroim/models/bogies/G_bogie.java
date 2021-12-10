package metroim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class G_bogie extends ModelBase //Same as Filename
{
    int textureX = 512;
    int textureY = 64;

    public G_bogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[40];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
        bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
        bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
        bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
        bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
        bodyModel[8] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 14
        bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 15
        bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 16
        bodyModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 17
        bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 18
        bodyModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 19
        bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 20
        bodyModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 21
        bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 22
        bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 23
        bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
        bodyModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 25
        bodyModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 26
        bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 27
        bodyModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 28
        bodyModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 29
        bodyModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 30
        bodyModel[25] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 31
        bodyModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 32
        bodyModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 34
        bodyModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 35
        bodyModel[29] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 36
        bodyModel[30] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 37
        bodyModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 38
        bodyModel[32] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 39
        bodyModel[33] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 40
        bodyModel[34] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 41
        bodyModel[35] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 44
        bodyModel[36] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 45
        bodyModel[37] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 46
        bodyModel[38] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 47
        bodyModel[39] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 41

        bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
        bodyModel[0].setRotationPoint(-3.5F, 1F, -6.5F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 1
        bodyModel[1].setRotationPoint(-6.5F, 3.5F, -5.5F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        bodyModel[2].setRotationPoint(-8.5F, 0F, -7.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        bodyModel[3].setRotationPoint(2.5F, 0F, -7.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
        bodyModel[4].setRotationPoint(2.5F, 0F, 4.5F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
        bodyModel[5].setRotationPoint(-8.5F, 0F, 4.5F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 8
        bodyModel[6].setRotationPoint(-4.5F, 2F, 5.5F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 10
        bodyModel[7].setRotationPoint(-8.5F, 5F, 5.5F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 14
        bodyModel[8].setRotationPoint(-7F, 3F, 5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 15
        bodyModel[9].setRotationPoint(-8.5F, 2F, 5.5F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
        bodyModel[10].setRotationPoint(-4.5F, 3F, 5.5F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 17
        bodyModel[11].setRotationPoint(-8.5F, 3F, 5.5F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 18
        bodyModel[12].setRotationPoint(2.5F, 5F, 5.5F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 19
        bodyModel[13].setRotationPoint(2.5F, 2F, 5.5F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 20
        bodyModel[14].setRotationPoint(4F, 3F, 5F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 21
        bodyModel[15].setRotationPoint(6.5F, 3F, 5.5F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 22
        bodyModel[16].setRotationPoint(2.5F, 3F, 5.5F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 23
        bodyModel[17].setRotationPoint(6.5F, 2F, 5.5F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 24
        bodyModel[18].setRotationPoint(-8.5F, 2F, -7.5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 25
        bodyModel[19].setRotationPoint(-4.5F, 2F, -7.5F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 26
        bodyModel[20].setRotationPoint(-7F, 3F, -8F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 27
        bodyModel[21].setRotationPoint(-8.5F, 5F, -7.5F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[22].setRotationPoint(-8.5F, 3F, -7.5F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 29
        bodyModel[23].setRotationPoint(-4.5F, 3F, -7.5F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[24].setRotationPoint(2.5F, 2F, -7.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
        bodyModel[25].setRotationPoint(6.5F, 2F, -7.5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 32
        bodyModel[26].setRotationPoint(6.5F, 3F, -7.5F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 34
        bodyModel[27].setRotationPoint(2.5F, 3F, -7.5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 35
        bodyModel[28].setRotationPoint(4F, 3F, -8F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 36
        bodyModel[29].setRotationPoint(2.5F, 5F, -7.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 37
        bodyModel[30].setRotationPoint(4.5F, 3.5F, -5.5F);

        bodyModel[31].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 38
        bodyModel[31].setRotationPoint(-8.5F, 1.5F, -5.5F);

        bodyModel[32].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 39
        bodyModel[32].setRotationPoint(-8.5F, 1.5F, 4.5F);

        bodyModel[33].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 40
        bodyModel[33].setRotationPoint(2.5F, 1.5F, 4.5F);

        bodyModel[34].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 41
        bodyModel[34].setRotationPoint(2.5F, 1.5F, -5.5F);

        bodyModel[35].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 44
        bodyModel[35].setRotationPoint(-2.5F, 3F, -0.5F);

        bodyModel[36].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 45
        bodyModel[36].setRotationPoint(-4.5F, 3F, -3.5F);

        bodyModel[37].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 46
        bodyModel[37].setRotationPoint(3.5F, 2.5F, 0.5F);

        bodyModel[38].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 47
        bodyModel[38].setRotationPoint(-7.5F, 2.5F, -2.5F);

        bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 41
        bodyModel[39].setRotationPoint(-1.5F, -1F, -1.5F);
    }
}