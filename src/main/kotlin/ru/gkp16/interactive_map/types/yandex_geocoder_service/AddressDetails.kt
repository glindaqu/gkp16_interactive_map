package ru.gkp16.interactive_map.types.yandex_geocoder_service

import com.google.gson.annotations.SerializedName


data class AddressDetails(
    @SerializedName("Country") var Country: Country? = Country()
)