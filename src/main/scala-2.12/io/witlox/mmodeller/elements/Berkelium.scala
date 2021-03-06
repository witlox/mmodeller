package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Energy.{W, kJ}
import io.witlox.mmodeller.utils.units.Length.m
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Temperature.K
import io.witlox.mmodeller.utils.units.Volume.cm3

object Berkelium extends ChemicalElementBase(97, 247.0) with Positional with MagneticOrdering  {
  def symbol = "Bk"
  def category = Category.Actinoids
  def col = 9
  def row = 2
  def block = 'f'
  def appearance = "silvery"
  def electronConfiguration = "[Rn] 5f9 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 27, 8, 2)
  def crystalStructure = "hexagonal close-packed"
  def magneticOrdering = "no data"
  def casNumber = "7440-40-6"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 4))
  override def electronNegativity = Some(1.3)
  override def ionizationEnergies = Some(Map("1st" -> 601 * (kJ/mol)))
  override def thermalConductivity = Some(List((10 * (W/m*K), Some(K(300)), None)))
  override def density = Some(List((14.78 * (g/cm3), None, None, Some("alpha"), Some(MaterialState.Solid)), (13.25 * (g/cm3), None, None, Some("beta"), Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(1259), None))
}
