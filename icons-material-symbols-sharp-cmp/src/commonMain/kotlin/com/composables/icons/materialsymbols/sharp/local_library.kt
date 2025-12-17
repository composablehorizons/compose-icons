package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Local_library: ImageVector
    get() {
        if (_Local_library != null) return _Local_library!!
        
        _Local_library = ImageVector.Builder(
            name = "local_library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 900f)
                quadToRelative(-72f, -68f, -165f, -104f)
                reflectiveQuadToRelative(-195f, -36f)
                verticalLineToRelative(-440f)
                quadToRelative(101f, 0f, 194f, 36.5f)
                reflectiveQuadTo(480f, 462f)
                quadToRelative(73f, -69f, 166f, -105.5f)
                reflectiveQuadTo(840f, 320f)
                verticalLineToRelative(440f)
                quadToRelative(-103f, 0f, -195.5f, 36f)
                reflectiveQuadTo(480f, 900f)
                close()
                moveToRelative(0f, -104f)
                quadToRelative(63f, -47f, 134f, -75f)
                reflectiveQuadToRelative(146f, -37f)
                verticalLineToRelative(-276f)
                quadToRelative(-73f, 13f, -143.5f, 52.5f)
                reflectiveQuadTo(480f, 566f)
                quadToRelative(-66f, -66f, -136.5f, -105.5f)
                reflectiveQuadTo(200f, 408f)
                verticalLineToRelative(276f)
                quadToRelative(75f, 9f, 146f, 37f)
                reflectiveQuadToRelative(134f, 75f)
                close()
                moveToRelative(0f, -436f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 200f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 280f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 366f)
                close()
            }
        }.build()
        
        return _Local_library!!
    }

private var _Local_library: ImageVector? = null

