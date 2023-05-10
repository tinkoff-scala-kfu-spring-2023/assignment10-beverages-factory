sealed trait ProductionEvent {
  def factoryName: String
}
object ProductionEvent {
  // Напиток произведен
  case class BeverageProduced(factoryName: String) extends ProductionEvent
  // На заводе произошла одна техническая ошибка
  case class BeverageTechnicalError(factoryName: String) extends ProductionEvent
  // Производится починка оборудования
  case class BeverageProductionRepair(factoryName: String, repairTime: Long)
      extends ProductionEvent
  // Починка завершена
  case class BeverageProductionRepaired(factoryName: String)
      extends ProductionEvent
  // Работник Баханов выпил напитки
  case class BeverageProductionNeglect(factoryName: String)
      extends ProductionEvent
  // Достигнут лимит по времени производства напитков на одной из фабрик
  case class BeverageProductionTimeout(factoryName: String)
      extends ProductionEvent
}
