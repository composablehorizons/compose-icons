package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Not_listed_location: ImageVector
    get() {
        if (_Not_listed_location != null) return _Not_listed_location!!
        
        _Not_listed_location = ImageVector.Builder(
            name = "not_listed_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                quadToRelative(17f, 0f, 29.5f, -12.5f)
                reflectiveQuadTo(522f, 598f)
                quadToRelative(0f, -17f, -12.5f, -29.5f)
                reflectiveQuadTo(480f, 556f)
                quadToRelative(-17f, 0f, -29.5f, 12.5f)
                reflectiveQuadTo(438f, 598f)
                quadToRelative(0f, 17f, 12.5f, 29.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(114f, -298f)
                quadToRelative(0f, -47f, -31f, -74.5f)
                reflectiveQuadTo(485f, 240f)
                quadToRelative(-46f, 0f, -77.5f, 21f)
                reflectiveQuadTo(376f, 309f)
                quadToRelative(0f, 10f, 4f, 16.5f)
                reflectiveQuadToRelative(12f, 9.5f)
                quadToRelative(11f, 4f, 21.5f, -0.5f)
                reflectiveQuadTo(434f, 319f)
                quadToRelative(9f, -11f, 21f, -16f)
                reflectiveQuadToRelative(26f, -5f)
                quadToRelative(23f, 0f, 38f, 12.5f)
                reflectiveQuadToRelative(15f, 31.5f)
                quadToRelative(0f, 18f, -8.5f, 29f)
                reflectiveQuadTo(497f, 399f)
                quadToRelative(-25f, 21f, -35f, 43f)
                reflectiveQuadToRelative(-10f, 40f)
                quadToRelative(0f, 16f, 7.5f, 25f)
                reflectiveQuadToRelative(21.5f, 9f)
                quadToRelative(13f, 0f, 21f, -8f)
                reflectiveQuadToRelative(10f, -23f)
                quadToRelative(2f, -15f, 13.5f, -29.5f)
                reflectiveQuadTo(550f, 428f)
                quadToRelative(23f, -23f, 33.5f, -44.5f)
                reflectiveQuadTo(594f, 342f)
                close()
                moveTo(480f, 853f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -15f)
                quadToRelative(-65f, -60f, -115f, -117f)
                reflectiveQuadToRelative(-83.5f, -110.5f)
                quadToRelative(-33.5f, -53.5f, -51f, -103f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, 45f, -17.5f, 94.5f)
                reflectiveQuadToRelative(-51f, 103f)
                quadTo(698f, 659f, 648f, 716f)
                reflectiveQuadTo(533f, 833f)
                quadToRelative(-11f, 10f, -25f, 15f)
                reflectiveQuadToRelative(-28f, 5f)
                close()
            }
        }.build()
        
        return _Not_listed_location!!
    }

private var _Not_listed_location: ImageVector? = null

