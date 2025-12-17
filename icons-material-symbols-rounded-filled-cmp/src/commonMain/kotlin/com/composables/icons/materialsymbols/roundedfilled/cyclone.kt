package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cyclone: ImageVector
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
                moveToRelative(0f, 240f)
                quadToRelative(-114f, 0f, -203.5f, -13.5f)
                reflectiveQuadTo(125f, 758f)
                quadToRelative(-20f, -5f, -32.5f, -19.5f)
                reflectiveQuadTo(80f, 704f)
                quadToRelative(0f, -16f, 13.5f, -25.5f)
                reflectiveQuadTo(123f, 674f)
                quadToRelative(42f, 11f, 74.5f, 17.5f)
                lineTo(250f, 702f)
                quadToRelative(-42f, -43f, -66f, -100f)
                reflectiveQuadToRelative(-24f, -122f)
                quadToRelative(0f, -114f, 13.5f, -203.5f)
                reflectiveQuadTo(202f, 125f)
                quadToRelative(5f, -20f, 19.5f, -32.5f)
                reflectiveQuadTo(256f, 80f)
                quadToRelative(16f, 0f, 25.5f, 13.5f)
                reflectiveQuadTo(286f, 123f)
                quadToRelative(-12f, 42f, -18.5f, 74.5f)
                reflectiveQuadTo(258f, 250f)
                quadToRelative(43f, -42f, 100f, -66f)
                reflectiveQuadToRelative(122f, -24f)
                quadToRelative(114f, 0f, 203.5f, 13.5f)
                reflectiveQuadTo(835f, 202f)
                quadToRelative(20f, 5f, 32.5f, 19.5f)
                reflectiveQuadTo(880f, 256f)
                quadToRelative(0f, 16f, -13.5f, 25.5f)
                reflectiveQuadTo(837f, 286f)
                quadToRelative(-42f, -12f, -74.5f, -18.5f)
                reflectiveQuadTo(710f, 258f)
                quadToRelative(42f, 43f, 66f, 100f)
                reflectiveQuadToRelative(24f, 122f)
                quadToRelative(0f, 114f, -13.5f, 203.5f)
                reflectiveQuadTo(758f, 835f)
                quadToRelative(-5f, 20f, -19.5f, 32.5f)
                reflectiveQuadTo(704f, 880f)
                quadToRelative(-16f, 0f, -25.5f, -13.5f)
                reflectiveQuadTo(674f, 837f)
                quadToRelative(11f, -42f, 17.5f, -74.5f)
                lineTo(702f, 710f)
                quadToRelative(-43f, 42f, -100f, 66f)
                reflectiveQuadToRelative(-122f, 24f)
                close()
                moveToRelative(0f, -80f)
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

