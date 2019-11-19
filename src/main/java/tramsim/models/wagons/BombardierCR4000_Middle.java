
package tramsim.models.wagons; //Path where the model is located

import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BombardierCR4000_Middle extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public BombardierCR4000_Middle() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 103
		bodyModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 104
		bodyModel[12] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 104
		bodyModel[13] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 20

		bodyModel[0].addBox(0F, 0F, 0F, 16, 1, 18, 0F); // Box 1
		bodyModel[0].setRotationPoint(0F, 5F, 1F);

		bodyModel[1].addBox(0F, 0F, 0F, 16, 2, 18, 0F); // Box 3
		bodyModel[1].setRotationPoint(0F, -14F, 1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 19, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(0F, -13F, 0F);

		bodyModel[3].addBox(0F, 0F, 0F, 16, 5, 18, 0F); // Box 5
		bodyModel[3].setRotationPoint(0F, 6F, 1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 19, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(0F, -13F, 19F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 17, 6, 0F); // Box 7
		bodyModel[5].setRotationPoint(0F, -12F, 1F);

		bodyModel[6].addBox(0F, 0F, 0F, 4, 17, 6, 0F); // Box 8
		bodyModel[6].setRotationPoint(12F, -12F, 1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 103
		bodyModel[7].setRotationPoint(4F, 2F, 6F);
		bodyModel[7].rotateAngleY = -1.57079633F;

		bodyModel[8].addBox(0F, 0F, 0F, 4, 17, 6, 0F); // Box 9
		bodyModel[8].setRotationPoint(0F, -12F, 13F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 17, 6, 0F); // Box 10
		bodyModel[9].setRotationPoint(12F, -12F, 13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[10].setRotationPoint(4F, 2F, 18F);
		bodyModel[10].rotateAngleY = -1.57079633F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[11].setRotationPoint(4F, -2F, 2.5F);
		bodyModel[11].rotateAngleY = -1.57079633F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[12].setRotationPoint(12F, -2F, 17.5F);
		bodyModel[12].rotateAngleY = 1.57079633F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0.25F, 0F, 4F, 0.25F, 0F, 4F, 0.25F, 0F, 4F, 0.25F, 0F); // Box 13
		bodyModel[13].setRotationPoint(4F, 7F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0.25F, 0F, 4F, 0.25F, 0F, 4F, 0.25F, 0F, 4F, 0.25F, 0F); // Box 15
		bodyModel[14].setRotationPoint(4F, 7F, 19F);

		bodyModel[15].addBox(0F, 0F, 0F, 16, 2, 1, 0F); // Box 16
		bodyModel[15].setRotationPoint(0F, 9.25F, 19F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(0F, 6F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 18
		bodyModel[17].setRotationPoint(12F, 6F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 19
		bodyModel[18].setRotationPoint(12F, 6F, 19F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(0F, 6F, 19F);

		this.flipAll();
	}
}