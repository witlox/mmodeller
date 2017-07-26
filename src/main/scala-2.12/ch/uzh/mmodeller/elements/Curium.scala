package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.kJ
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Temperature.K

object Curium extends Atomic(96, 247.0) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Cm"
  def category = Category.Actinoids
  def col = 8
  def row = 2
  def block = 'f'
  def appearance = "silvery"
  def electronConfiguration = "[Rn] 5f7 6d1 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 25, 9, 2)
  def crystalStructure = "hexagonal close-packed"
  def magneticOrdering = "no data"
  def casNumber = "7440-51-9"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.3)
  override def ionizationEnergies = Some(Map("1st" -> 581* (kJ/mol)))

  override def density = Some(List((13.51 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(1613), None))
  override def boilingPoint = Some((K(3383), None))
  override def heatOfFusion = Some((15 * (kJ/mol), None, None))
}
