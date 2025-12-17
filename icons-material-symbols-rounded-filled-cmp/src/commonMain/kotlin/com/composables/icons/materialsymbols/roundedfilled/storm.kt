package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Storm: ImageVector
    get() {
        if (_Storm != null) return _Storm!!
        
        _Storm = ImageVector.Builder(
            name = "storm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(768f, 880f)
                quadToRelative(-15f, 0f, -23.5f, -13f)
                reflectiveQuadToRelative(-3.5f, -29f)
                quadToRelative(17f, -53f, 23f, -107f)
                reflectiveQuadToRelative(2f, -109f)
                quadToRelative(-39f, 83f, -116.5f, 130.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(-84f, 0f, -152f, -39.5f)
                reflectiveQuadTo(212f, 655f)
                quadToRelative(-48f, -66f, -74f, -151.5f)
                reflectiveQuadTo(112f, 326f)
                quadToRelative(0f, -52f, 5.5f, -102.5f)
                reflectiveQuadTo(137f, 123f)
                quadToRelative(5f, -19f, 20f, -31f)
                reflectiveQuadToRelative(35f, -12f)
                quadToRelative(15f, 0f, 23.5f, 13f)
                reflectiveQuadToRelative(3.5f, 29f)
                quadToRelative(-16f, 53f, -22.5f, 107f)
                reflectiveQuadTo(194f, 338f)
                quadToRelative(39f, -83f, 116.5f, -130.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(84f, 0f, 152f, 39.5f)
                reflectiveQuadTo(748f, 305f)
                quadToRelative(48f, 66f, 74f, 151.5f)
                reflectiveQuadTo(848f, 634f)
                quadToRelative(0f, 52f, -5.5f, 102.5f)
                reflectiveQuadTo(823f, 837f)
                quadToRelative(-5f, 19f, -20f, 31f)
                reflectiveQuadToRelative(-35f, 12f)
                close()
                moveTo(480f, 640f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Storm!!
    }

private var _Storm: ImageVector? = null

