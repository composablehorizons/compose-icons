package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sound_detection_loud_sound: ImageVector
    get() {
        if (_Sound_detection_loud_sound != null) return _Sound_detection_loud_sound!!
        
        _Sound_detection_loud_sound = ImageVector.Builder(
            name = "sound_detection_loud_sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(482f, 705f)
                lineTo(369f, 818f)
                quadToRelative(-23f, 23f, -56.5f, 23f)
                reflectiveQuadTo(256f, 818f)
                lineTo(143f, 705f)
                quadToRelative(-23f, -23f, -23f, -57f)
                reflectiveQuadToRelative(23f, -57f)
                lineToRelative(112f, -112f)
                verticalLineToRelative(-131f)
                quadToRelative(0f, -27f, 24.5f, -37f)
                reflectiveQuadToRelative(43.5f, 9f)
                lineToRelative(318f, 317f)
                quadToRelative(19f, 19f, 8.5f, 43.5f)
                reflectiveQuadTo(612f, 705f)
                horizontalLineTo(482f)
                close()
                moveToRelative(196f, -424f)
                quadToRelative(-59f, -59f, -138.5f, -76f)
                reflectiveQuadTo(384f, 216f)
                quadToRelative(-15f, 5f, -30.5f, -0.5f)
                reflectiveQuadTo(333f, 195f)
                quadToRelative(-6f, -17f, 1f, -32.5f)
                reflectiveQuadToRelative(24f, -21.5f)
                quadToRelative(97f, -36f, 199f, -14.5f)
                reflectiveQuadTo(735f, 224f)
                quadToRelative(76f, 76f, 97.5f, 179.5f)
                reflectiveQuadTo(817f, 605f)
                quadToRelative(-6f, 16f, -22f, 22.5f)
                reflectiveQuadToRelative(-32f, -0.5f)
                quadToRelative(-15f, -6f, -20.5f, -21f)
                reflectiveQuadToRelative(0.5f, -31f)
                quadToRelative(28f, -76f, 11f, -155.5f)
                reflectiveQuadTo(678f, 281f)
                close()
                moveToRelative(-56f, 57f)
                quadToRelative(22f, 22f, 34.5f, 49.5f)
                reflectiveQuadTo(674f, 446f)
                quadToRelative(2f, 16f, -9f, 27f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-16f, 0f, -27.5f, -11f)
                reflectiveQuadTo(594f, 446f)
                quadToRelative(-4f, -14f, -10.5f, -27f)
                reflectiveQuadTo(566f, 395f)
                quadToRelative(-11f, -11f, -25f, -18.5f)
                reflectiveQuadTo(512f, 365f)
                quadToRelative(-16f, -4f, -27.5f, -15f)
                reflectiveQuadTo(471f, 322f)
                quadToRelative(-2f, -16f, 8.5f, -28f)
                reflectiveQuadToRelative(25.5f, -10f)
                quadToRelative(33f, 4f, 63.5f, 17.5f)
                reflectiveQuadTo(622f, 338f)
                close()
            }
        }.build()
        
        return _Sound_detection_loud_sound!!
    }

private var _Sound_detection_loud_sound: ImageVector? = null

