package tramsim.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Combino_Gelenk extends ModelBase //Same as Filename
{
    int textureX = 256;
    int textureY = 64;

    public Combino_Gelenk() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[28];

        initbodyModel_1();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
        bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
        bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 55
        bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 140
        bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 141
        bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 144
        bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 146
        bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 147
        bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 148
        bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 149
        bodyModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 50
        bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 52
        bodyModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 55
        bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 140
        bodyModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 141
        bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 144
        bodyModel[16] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 146
        bodyModel[17] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 147
        bodyModel[18] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 148
        bodyModel[19] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 149
        bodyModel[20] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 20
        bodyModel[21] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 21
        bodyModel[22] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 22
        bodyModel[23] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 23
        bodyModel[24] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 24
        bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
        bodyModel[26] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 26
        bodyModel[27] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 27

        bodyModel[0].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 50
        bodyModel[0].setRotationPoint(0F, -11F, 8F);

        bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 18, 0F); // Box 52
        bodyModel[1].setRotationPoint(0F, -14F, -9F);

        bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 55
        bodyModel[2].setRotationPoint(0F, 6F, -9F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        bodyModel[3].setRotationPoint(0F, -2F, 6F);

        bodyModel[4].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 141
        bodyModel[4].setRotationPoint(0F, 1F, 6F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
        bodyModel[5].setRotationPoint(0F, -12F, 7F);

        bodyModel[6].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 146
        bodyModel[6].setRotationPoint(0F, 1F, -9F);

        bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        bodyModel[7].setRotationPoint(0F, -2F, -9F);

        bodyModel[8].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 148
        bodyModel[8].setRotationPoint(0F, -11F, -9F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
        bodyModel[9].setRotationPoint(0F, -12F, -9F);

        bodyModel[10].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 50
        bodyModel[10].setRotationPoint(-4F, -11F, 8F);

        bodyModel[11].addBox(0F, 0F, 0F, 4, 2, 18, 0F); // Box 52
        bodyModel[11].setRotationPoint(-4F, -14F, -9F);

        bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 55
        bodyModel[12].setRotationPoint(-4F, 6F, -9F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        bodyModel[13].setRotationPoint(-4F, -2F, 6F);

        bodyModel[14].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 141
        bodyModel[14].setRotationPoint(-4F, 1F, 6F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
        bodyModel[15].setRotationPoint(-4F, -12F, 7F);

        bodyModel[16].addBox(0F, 0F, 0F, 4, 5, 3, 0F); // Box 146
        bodyModel[16].setRotationPoint(-4F, 1F, -9F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
        bodyModel[17].setRotationPoint(-4F, -2F, -9F);

        bodyModel[18].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 148
        bodyModel[18].setRotationPoint(-4F, -11F, -9F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
        bodyModel[19].setRotationPoint(-4F, -12F, -9F);

        bodyModel[20].addBox(0F, 0F, 0F, 8, 1, 14, 0F); // Box 20
        bodyModel[20].setRotationPoint(-4F, 7F, -7F);

        bodyModel[21].addBox(0F, 0F, 0F, 8, 2, 12, 0F); // Box 21
        bodyModel[21].setRotationPoint(-4F, 8F, -6F);

        bodyModel[22].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 22
        bodyModel[22].setRotationPoint(-5.5F, 7.5F, -6.01F);

        bodyModel[23].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 23
        bodyModel[23].setRotationPoint(-5.5F, 7.5F, 6.01F);

        bodyModel[24].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 24
        bodyModel[24].setRotationPoint(1.5F, 7.5F, -6.01F);

        bodyModel[25].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 25
        bodyModel[25].setRotationPoint(1.5F, 7.5F, 6.01F);

        bodyModel[26].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 26
        bodyModel[26].setRotationPoint(-4F, 9F, -7F);

        bodyModel[27].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 27
        bodyModel[27].setRotationPoint(-4F, 9F, 6F);
    }
}