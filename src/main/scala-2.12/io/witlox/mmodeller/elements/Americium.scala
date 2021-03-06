package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ}
import io.witlox.mmodeller.utils.units.Length.{pm, m}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Americium extends ChemicalElementBase(95, 243.0) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Am"
  def category = Category.Actinoids
  def col = 7
  def row = 2
  def block = 'f'
  def appearance = "silvery white sometimes yellow"
  def electronConfiguration = "[Rn] 5f7 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 25, 8, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "no data"
  def casNumber = "7440-35-9"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(6, 5, 4, 3))
  override def electronNegativity = Some(1.3)
  override def ionizationEnergies = Some(Map("1st" -> 578 * (kJ/mol)))
  override def atomicRadius = Some(pm(175))
  override def thermalConductivity = Some(List((10 * (W/m*K), Some(K(300)), None)))

  override def density = Some(List((12 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(1449), None))
  override def boilingPoint = Some((K(2880), None))
  override def heatOfFusion = Some((14.39 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 62.7 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
