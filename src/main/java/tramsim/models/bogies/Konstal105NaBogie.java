//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.04.2018 - 11:41:04
// Last changed on: 22.04.2018 - 11:41:04

package tramsim.models.bogies; //Path where the model is located

import ebf.tim.models.StaticModelAnimator;
import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.entity.Entity;

public class Konstal105NaBogie extends RollingStockModel //Same as Filename
{
    public Konstal105NaBogie() //Same as Filename
    {
		super(); textureX = 128; textureY = 32;
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 21, 15, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-7, 3, -6).setRotationAngle(0, 0, -0).setName("Box 10")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f)
				.setRotationPoint(-3, 4, -6).setRotationAngle(0, 0, -0).setName("Box 12")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.5f, 0.2f, 0, 0.5f, 0.2f, 0, 0.5f, -0.2f, 0, 0.5f, -0.2f, 0, -0.5f, 0.2f, 0, -0.5f, 0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f)
				.setRotationPoint(-2, 2, -6).setRotationAngle(0, 0, -0).setName("Box 13")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.2f, 0.5f, -0.3f, -0.5f, 0.5f, 0.4f, 0.2f, 0.5f, -0.7f, -0.5f, 0.5f, 0, 0.2f, -0.5f, -0.3f, -0.5f, -0.5f, 0.4f, 0.2f, -0.5f, -0.7f, -0.5f, -0.5f, 0)
				.setRotationPoint(-2, 2, -6).setRotationAngle(0, 0, -0).setName("Box 15")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
				.setRotationPoint(-3, 5, -6).setRotationAngle(0, 0, -0).setName("Box 16")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 13, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.8f, 0, 0.3f, 0.2f, 0, 0.3f, 0.2f, 0, -0.9f, -0.8f, 0, -0.9f, -0.8f, 0, 0.3f, 0.2f, 0, 0.3f, 0.2f, 0, -0.9f, -0.8f, 0, -0.9f)
				.setRotationPoint(-1, 0, -6).setRotationAngle(0, 0, -0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.2f, 0.1f, 0, 0.2f, 0.1f, 0, 0.2f, -0.2f, 0, 0.2f, -0.2f, 0, -0.7f, 0.1f, 0, -0.7f, 0.1f, 0, -0.7f, -0.2f, 0, -0.7f, -0.2f)
				.setRotationPoint(1, 2, -6).setRotationAngle(0, 0, -0).setName("Box 18")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-7, 2, -6).setRotationAngle(0, 0, -0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
				.setRotationPoint(-7, 4, -6).setRotationAngle(0, 0, -0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
				.setRotationPoint(4, 4, -6).setRotationAngle(0, 0, -0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(4, 2, -6).setRotationAngle(0, 0, -0).setName("Box 22")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 18, textureX, textureY).addBox(0, 0, 0, 1, 1, 10)
				.setRotationPoint(-6, 3, -5).setRotationAngle(0, 0, -0).setName("Box 23")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 18, textureX, textureY).addBox(0, 0, 0, 1, 1, 10)
				.setRotationPoint(5, 3, -5).setRotationAngle(0, 0, -0).setName("Box 24")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-7, 2, -4).setRotationAngle(0, 0, -0).setName("Box 25")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
				.setRotationPoint(-7, 4, -4).setRotationAngle(0, 0, -0).setName("Box 26")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-7, 3, -4).setRotationAngle(0, 0, -0).setName("Box 27")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 13, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-4, 3, -3).setRotationAngle(0, 0, -0).setName("Box 28")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(1, 2, -4).setRotationAngle(0, 0, -0).setName("Box 29")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(1, 4, -4).setRotationAngle(0, 0, -0).setName("Box 30")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(1, 3, -4).setRotationAngle(0, 0, -0).setName("Box 31")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 15, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-1, 3, 2).setRotationAngle(0, 0, -0).setName("Box 32")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-5, 4, 1).setRotationAngle(0, 0, -0).setName("Box 33")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-5, 3, 1).setRotationAngle(0, 0, -0).setName("Box 34")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-5, 2, 1).setRotationAngle(0, 0, -0).setName("Box 35")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
				.setRotationPoint(4, 4, 1).setRotationAngle(0, 0, -0).setName("Box 36")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(4, 3, 1).setRotationAngle(0, 0, -0).setName("Box 37")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(4, 2, 1).setRotationAngle(0, 0, -0).setName("Box 38")
		);
		group0.add(new ModelRendererTurbo(group0, 21, 13, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f)
				.setRotationPoint(-7, 3, 5).setRotationAngle(0, 0, -0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
				.setRotationPoint(-7, 4, 5).setRotationAngle(0, 0, -0).setName("Box 40")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-7, 2, 5).setRotationAngle(0, 0, -0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 13, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.2f, 0.5f, -0.7f, -0.5f, 0.5f, 0, 0.2f, 0.5f, -0.3f, -0.5f, 0.5f, 0.4f, 0.2f, -0.5f, -0.7f, -0.5f, -0.5f, 0, 0.2f, -0.5f, -0.3f, -0.5f, -0.5f, 0.4f)
				.setRotationPoint(1, 2, 5).setRotationAngle(0, 0, -0).setName("Box 42")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 13, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.5f, -0.2f, 0, 0.5f, -0.2f, 0, 0.5f, 0.2f, 0, 0.5f, 0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, 0.2f, 0, -0.5f, 0.2f)
				.setRotationPoint(1, 2, 5).setRotationAngle(0, 0, -0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 13, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.2f, 0, -0.9f, -0.8f, 0, -0.9f, -0.8f, 0, 0.3f, 0.2f, 0, 0.3f, 0.2f, 0, -0.9f, -0.8f, 0, -0.9f, -0.8f, 0, 0.3f, 0.2f, 0, 0.3f)
				.setRotationPoint(0, 0, 5).setRotationAngle(0, 0, -0).setName("Box 44")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.2f, -0.2f, 0, 0.2f, -0.2f, 0, 0.2f, 0.1f, 0, 0.2f, 0.1f, 0, -0.7f, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0.1f, 0, -0.7f, 0.1f)
				.setRotationPoint(-3, 2, 5).setRotationAngle(0, 0, -0).setName("Box 45")
		);
		group0.add(new ModelRendererTurbo(group0, 75, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0)
				.setRotationPoint(-3, 5, 5).setRotationAngle(0, 0, -0).setName("Box 46")
		);
		group0.add(new ModelRendererTurbo(group0, 75, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f)
				.setRotationPoint(-3, 4, 5).setRotationAngle(0, 0, -0).setName("Box 47")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
				.setRotationPoint(4, 4, 5).setRotationAngle(0, 0, -0).setName("Box 48")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(4, 2, 5).setRotationAngle(0, 0, -0).setName("Box 49")
		);
		group0.add(new ModelRendererTurbo(group0, 71, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, 0.5f, 0, -0.7f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f)
				.setRotationPoint(0, 0, -6).setRotationAngle(0, 0, -0).setName("Box 50")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, 0.5f, 0, -0.7f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f)
				.setRotationPoint(3, 0, -6).setRotationAngle(0, 0, -0).setName("Box 52")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, 0.5f, 0, -0.7f, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f)
				.setRotationPoint(-3, 0, -6).setRotationAngle(0, 0, -0).setName("Box 53")
		);
		group0.add(new ModelRendererTurbo(group0, 85, 8, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(3, 1, -6).setRotationAngle(0, 0, -0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 8, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(0, 1, -6).setRotationAngle(0, 0, -0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 8, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(-3, 1, -6).setRotationAngle(0, 0, -0).setName("Box 56")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f)
				.setRotationPoint(-3, 1, 5).setRotationAngle(0, 0, -0).setName("Box 57")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f)
				.setRotationPoint(0, 1, 5).setRotationAngle(0, 0, -0).setName("Box 58")
		);
		group0.add(new ModelRendererTurbo(group0, 85, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0.5f, 0, -0.5f)
				.setRotationPoint(3, 1, 5).setRotationAngle(0, 0, -0).setName("Box 59")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 0, textureX, textureY)
				.addShapeBox(-2, -2, 0, 16, 16, 0, 0, 0, 0, 0, -12, 0, 0, -12, 0, 0, 0, 0, 0, 0, -12, 0, -12, -12, 0, -12, -12, 0, 0, -12, 0)
				.setRotationPoint(5.5f, 3.5f, 6.01f).setRotationAngle(0, 0, 0).setName(" wheel ")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 0, textureX, textureY)
				.addShapeBox(-2, -2, 0, 16, 16, 0, 0, 0, 0, 0, -12, 0, 0, -12, 0, 0, 0, 0, 0, 0, -12, 0, -12, -12, 0, -12, -12, 0, 0, -12, 0)
				.setRotationPoint(5.5f, 3.5f, -6.01f).setRotationAngle(0, 0, 0).setName(" wheel ")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 0, textureX, textureY)
				.addShapeBox(-2, -2, 0, 16, 16, 0, 0, 0, 0, 0, -12, 0, 0, -12, 0, 0, 0, 0, 0, 0, -12, 0, -12, -12, 0, -12, -12, 0, 0, -12, 0)
				.setRotationPoint(-5.5f, 3.5f, 6.01f).setRotationAngle(0, 0, 0).setName(" wheel ")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 0, textureX, textureY)
				.addShapeBox(-2, -2, 0, 16, 16, 0, 0, 0, 0, 0, -12, 0, 0, -12, 0, 0, 0, 0, 0, 0, -12, 0, -12, -12, 0, -12, -12, 0, 0, -12, 0)
				.setRotationPoint(-5.5f, 3.5f, -6.01f).setRotationAngle(0, 0, 0).setName(" wheel ")
		);
		this.groups.add(group0);
		//
	}
}