/*******************************************************************************
 * Copyright 2020 Stefan Holm
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package ch.wsl.fps.hepromo4python;

import ch.wsl.fps.hepromo.api.SimpleFaellenVorruecken2018;
import ch.wsl.fps.hepromo.api.SimpleForwarderEnergieholz2018;
import ch.wsl.fps.hepromo.api.SimpleForwarderRundholz2018;
import ch.wsl.fps.hepromo.api.SimpleHacker2018;
import ch.wsl.fps.hepromo.api.SimpleHackschnitzeltransport2018;
import ch.wsl.fps.hepromo.api.SimpleHelikopter2003;
import ch.wsl.fps.hepromo.api.SimpleKombiseilgeraet2018;
import ch.wsl.fps.hepromo.api.SimpleKonventionellerSeilkran1999;
import ch.wsl.fps.hepromo.api.SimpleMobilseilkran1999;
import ch.wsl.fps.hepromo.api.SimpleMotormanuell2014;
import ch.wsl.fps.hepromo.api.SimpleRadharvester2014;
import ch.wsl.fps.hepromo.api.SimpleSchlepper2014;
import ch.wsl.fps.hepromo.api.en.SimpleChipper2018;
import ch.wsl.fps.hepromo.api.en.SimpleFellingPreskidding2018;
import ch.wsl.fps.hepromo.api.en.SimpleForwarderEnergyWood2018;
import ch.wsl.fps.hepromo.api.en.SimpleForwarderRoundwood2018;
import ch.wsl.fps.hepromo.api.en.SimpleHarvester2014;
import ch.wsl.fps.hepromo.api.en.SimpleHelicopter2003;
import ch.wsl.fps.hepromo.api.en.SimpleLongDistanceCableYarder1999;
import ch.wsl.fps.hepromo.api.en.SimpleMotorManualFellingAndProcessing2014;
import ch.wsl.fps.hepromo.api.en.SimpleSkidder2014;
import ch.wsl.fps.hepromo.api.en.SimpleTowerYarder1999;
import ch.wsl.fps.hepromo.api.en.SimpleTowerYarderWithMountedProcessor2018;
import ch.wsl.fps.hepromo.api.en.SimpleWoodchipsTransport2018;

import py4j.GatewayServer;

/**
 * 
 * @author Stefan Holm
 *
 */
public class HeProMoEntryPoint {

	public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new HeProMoEntryPoint());
        gatewayServer.start();
        System.out.println("Gateway Server Started");
	}
	
	
	public SimpleMotormanuell2014 getSimpleMotormanuell2014() {
		return new SimpleMotormanuell2014();
	}
	
	public SimpleMotorManualFellingAndProcessing2014 getSimpleMotorManualFellingAndProcessing2014() {
		return new SimpleMotorManualFellingAndProcessing2014();
	}
	
	
	public SimpleRadharvester2014 getSimpleRadharvester2014() {
		return new SimpleRadharvester2014();
	}
	
	public SimpleHarvester2014 getSimpleHarvester2014() {
		return new SimpleHarvester2014();
	}
	
	
	public SimpleSchlepper2014 getSimpleSchlepper2014() {
		return new SimpleSchlepper2014();
	}
	
	public SimpleSkidder2014 getSimpleSkidder2014() {
		return new SimpleSkidder2014();
	}
	
	
	public SimpleMobilseilkran1999 getSimpleMobilseilkran1999() {
		return new SimpleMobilseilkran1999();
	}
	
	public SimpleTowerYarder1999 getSimpleTowerYarder1999() {
		return new SimpleTowerYarder1999();
	}
	
	
	public SimpleKonventionellerSeilkran1999 getSimpleKonventionellerSeilkran1999() {
		return new SimpleKonventionellerSeilkran1999();
	}
	
	public SimpleLongDistanceCableYarder1999 getSimpleLongDistanceCableYarder1999() {
		return new SimpleLongDistanceCableYarder1999();
	}
	
	
	public SimpleHelikopter2003 getSimpleHelikopter2003() {
		return new SimpleHelikopter2003();
	}
	
	public SimpleHelicopter2003 getSimpleHelicopter2003() {
		return new SimpleHelicopter2003();
	}
	
	
	public SimpleForwarderRundholz2018 getSimpleForwarderRundholz2018() {
		return new SimpleForwarderRundholz2018();
	}
	
	public SimpleForwarderRoundwood2018 getSimpleForwarderRoundwood2018() {
		return new SimpleForwarderRoundwood2018();
	}

	
	public SimpleForwarderEnergieholz2018 getSimpleForwarderEnergieholz2018() {
		return new SimpleForwarderEnergieholz2018();
	}
	
	public SimpleForwarderEnergyWood2018 getSimpleForwarderEnergyWood2018() {
		return new SimpleForwarderEnergyWood2018();
	}
	
	
	public SimpleKombiseilgeraet2018 getSimpleKombiseilgeraet2018() {
		return new SimpleKombiseilgeraet2018();
	}
	
	public SimpleTowerYarderWithMountedProcessor2018 getSimpleTowerYarderWithMountedProcessor2018() {
		return new SimpleTowerYarderWithMountedProcessor2018();
	}
	
	
	public SimpleHacker2018 getSimpleHacker2018() {
		return new SimpleHacker2018();
	}
	
	public SimpleChipper2018 getSimpleChipper2018() {
		return new SimpleChipper2018();
	}
	
	
	public SimpleHackschnitzeltransport2018 getSimpleHackschnitzeltransport2018() {
		return new SimpleHackschnitzeltransport2018();
	}
	
	public SimpleWoodchipsTransport2018 getSimpleWoodchipsTransport2018() {
		return new SimpleWoodchipsTransport2018();
	}

	
	public SimpleFaellenVorruecken2018 getSimpleFaellenVorruecken2018() {
		return new SimpleFaellenVorruecken2018();
	}
	
	public SimpleFellingPreskidding2018 getSimpleFellingPreskidding2018() {
		return new SimpleFellingPreskidding2018();
	}
}
