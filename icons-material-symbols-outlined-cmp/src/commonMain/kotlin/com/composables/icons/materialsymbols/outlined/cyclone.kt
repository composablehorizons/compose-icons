package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Cyclone: ImageVector
    get() {
        if (_Cyclone != null) return _Cyclone!!
        
        _Cyclone = ImageVector.Builder(
            name = "cyclone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
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
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveTo(661f, 880f)
                quadToRelative(18f, -56f, 27f, -100f)
                reflectiveQuadToRelative(14f, -70f)
                quadToRelative(-43f, 42f, -100f, 66f)
                reflectiveQuadToRelative(-122f, 24f)
                quadToRelative(-136f, 0f, -238.5f, -18.5f)
                reflectiveQuadTo(80f, 746f)
                verticalLineToRelative(-85f)
                quadToRelative(56f, 18f, 100f, 27f)
                reflectiveQuadToRelative(70f, 14f)
                quadToRelative(-42f, -43f, -66f, -100f)
                reflectiveQuadToRelative(-24f, -122f)
                quadToRelative(0f, -137f, 18.5f, -239f)
                reflectiveQuadTo(214f, 80f)
                horizontalLineToRelative(85f)
                quadToRelative(-18f, 56f, -27.5f, 100f)
                reflectiveQuadTo(258f, 250f)
                quadToRelative(43f, -42f, 100f, -66f)
                reflectiveQuadToRelative(122f, -24f)
                quadToRelative(137f, 0f, 239f, 18.5f)
                reflectiveQuadTo(880f, 214f)
                verticalLineToRelative(85f)
                quadToRelative(-56f, -18f, -100f, -27.5f)
                reflectiveQuadTo(710f, 258f)
                quadToRelative(42f, 43f, 66f, 100f)
                reflectiveQuadToRelative(24f, 122f)
                quadToRelative(0f, 137f, -18.5f, 239f)
                reflectiveQuadTo(746f, 880f)
                horizontalLineToRelative(-85f)
                close()
                moveTo(480f, 720f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
            }
        }.build()
        
        return _Cyclone!!
    }

private var _Cyclone: ImageVector? = null

