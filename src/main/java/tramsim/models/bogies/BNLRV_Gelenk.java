package tramsim.models.bogies;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BNLRV_Gelenk extends ModelBase //Same as Filename
{
    int textureX = 256;
    int textureY = 256;

    public BNLRV_Gelenk() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[38];

        initbodyModel_1();

    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
        bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 19
        bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
        bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
        bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 23
        bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 24
        bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 25
        bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 26
        bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 27
        bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 29
        bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 16
        bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 17
        bodyModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 18
        bodyModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
        bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 16
        bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
        bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
        bodyModel[17] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 19
        bodyModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 20
        bodyModel[19] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 21
        bodyModel[20] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 22
        bodyModel[21] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 23
        bodyModel[22] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 24
        bodyModel[23] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 25
        bodyModel[24] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 26
        bodyModel[25] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 27
        bodyModel[26] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 28
        bodyModel[27] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 29
        bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 30
        bodyModel[29] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 31
        bodyModel[30] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 32
        bodyModel[31] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 33
        bodyModel[32] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 34
        bodyModel[33] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 35
        bodyModel[34] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 36
        bodyModel[35] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 37
        bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 36
        bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37

        bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 18
        bodyModel[0].setRotationPoint(0F, 3F, -1F);

        bodyModel[1].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 19
        bodyModel[1].setRotationPoint(0F, 4F, -3F);

        bodyModel[2].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 21
        bodyModel[2].setRotationPoint(-8F, 3F, -4F);

        bodyModel[3].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 22
        bodyModel[3].setRotationPoint(-2F, 4.5F, 3F);

        bodyModel[4].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
        bodyModel[4].setRotationPoint(-8F, 3F, 4F);

        bodyModel[5].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 24
        bodyModel[5].setRotationPoint(5F, 3F, 4F);

        bodyModel[6].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 25
        bodyModel[6].setRotationPoint(5F, 3F, -4F);

        bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 26
        bodyModel[7].setRotationPoint(7F, 5F, -5F);

        bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 27
        bodyModel[8].setRotationPoint(-6F, 5F, -5F);

        bodyModel[9].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 29
        bodyModel[9].setRotationPoint(-6F, 5F, -1F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bodyModel[10].setRotationPoint(-3F, 6.5F, 3F);

        bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 17
        bodyModel[11].setRotationPoint(3F, 4.5F, -4F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
        bodyModel[12].setRotationPoint(-3F, 6.5F, -4F);

        bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 15
        bodyModel[13].setRotationPoint(3F, 4.5F, 3F);

        bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 16
        bodyModel[14].setRotationPoint(-2F, 4.5F, -4F);

        bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 19
        bodyModel[15].setRotationPoint(-2F, 3.5F, -4F);

        bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 20
        bodyModel[16].setRotationPoint(3F, 3.5F, -4F);

        bodyModel[17].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 19
        bodyModel[17].setRotationPoint(-3F, 0F, -7F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
        bodyModel[18].setRotationPoint(-1F, -20F, 6.5F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 25, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 21
        bodyModel[19].setRotationPoint(-2F, -23F, -9F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
        bodyModel[20].setRotationPoint(-1F, -20F, -7.5F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
        bodyModel[21].setRotationPoint(-1F, -20F, 6.5F);

        bodyModel[22].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Box 24
        bodyModel[22].setRotationPoint(-1F, -21F, -5.5F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 25
        bodyModel[23].setRotationPoint(-3F, -20F, 6.5F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
        bodyModel[24].setRotationPoint(-3F, -20F, -7.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
        bodyModel[25].setRotationPoint(3F, -20F, -7.5F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 28
        bodyModel[26].setRotationPoint(3F, -20F, 6.5F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, -2F, -1F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
        bodyModel[27].setRotationPoint(3F, -20F, -7.5F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, -1F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 30
        bodyModel[28].setRotationPoint(3F, -20F, 6.5F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, -1F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 31
        bodyModel[29].setRotationPoint(-3F, -20F, 6.5F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
        bodyModel[30].setRotationPoint(-3F, -20F, -7.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
        bodyModel[31].setRotationPoint(-3F, -21F, -5.5F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
        bodyModel[32].setRotationPoint(3F, -21F, -5.5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 20, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
        bodyModel[33].setRotationPoint(-1F, -20F, -7.5F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 25, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 36
        bodyModel[34].setRotationPoint(-2F, -23F, 8F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 37
        bodyModel[35].setRotationPoint(-2F, -22F, -9F);

        bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 36
        bodyModel[36].setRotationPoint(0F, 1F, -1F);

        bodyModel[37].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 37
        bodyModel[37].setRotationPoint(0F, 2F, -1F);
    }
}