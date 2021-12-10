package dev.luchonetvv.pointsofinterest.viewmodel

import dev.luchonetvv.pointsofinterest.repository.PlaceRepository

interface ViewModelFactory<T> {
    fun create(): T
}

class MapsViewModelFactory(private val placeRepository: PlaceRepository) : ViewModelFactory<MapViewModel> {
    override fun create(): MapViewModel {
        return MapViewModel(placeRepository)
    }

}
