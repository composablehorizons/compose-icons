package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Storm: ImageVector
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
                moveTo(726f, 880f)
                quadToRelative(25f, -62f, 35f, -127f)
                reflectiveQuadToRelative(5f, -131f)
                quadToRelative(-39f, 83f, -116.5f, 130.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(-84f, 0f, -152f, -39.5f)
                reflectiveQuadTo(212f, 655f)
                quadToRelative(-48f, -66f, -74f, -151.5f)
                reflectiveQuadTo(112f, 326f)
                quadToRelative(0f, -63f, 8.5f, -124.5f)
                reflectiveQuadTo(150f, 80f)
                horizontalLineToRelative(84f)
                quadToRelative(-24f, 62f, -34.5f, 127f)
                reflectiveQuadTo(194f, 338f)
                quadToRelative(39f, -83f, 116.5f, -130.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(84f, 0f, 152f, 39.5f)
                reflectiveQuadTo(748f, 305f)
                quadToRelative(48f, 66f, 74f, 151.5f)
                reflectiveQuadTo(848f, 634f)
                quadToRelative(0f, 63f, -8.5f, 124.5f)
                reflectiveQuadTo(810f, 880f)
                horizontalLineToRelative(-84f)
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

