package dev.luchonetvv.pointsofinterest.viewmodel

import androidx.lifecycle.ViewModel
import dev.luchonetvv.pointsofinterest.repository.PlaceRepository

class MapViewModel(private val placeRepository: PlaceRepository) : ViewModel() {
    init {
        placeRepository.getAll("12.194723960638175,-86.10009838460228", "scarleth")
    }
}
