package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cardiology: ImageVector
    get() {
        if (_Cardiology != null) return _Cardiology!!
        
        _Cardiology = ImageVector.Builder(
            name = "cardiology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(428f, 509f)
                lineToRelative(-34f, -51f)
                quadToRelative(-5f, -8f, -14f, -13f)
                reflectiveQuadToRelative(-19f, -5f)
                horizontalLineTo(124f)
                quadToRelative(-11f, 0f, -20f, -6.5f)
                reflectiveQuadTo(91f, 416f)
                quadToRelative(-6f, -19f, -8.5f, -37.5f)
                reflectiveQuadTo(80f, 340f)
                quadToRelative(0f, -94f, 63f, -157f)
                reflectiveQuadToRelative(157f, -63f)
                quadToRelative(52f, 0f, 99f, 22f)
                reflectiveQuadToRelative(81f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(94f, 0f, 157f, 63f)
                reflectiveQuadToRelative(63f, 157f)
                quadToRelative(0f, 20f, -2.5f, 38.5f)
                reflectiveQuadTo(869f, 416f)
                quadToRelative(-3f, 11f, -12.5f, 17.5f)
                reflectiveQuadTo(836f, 440f)
                horizontalLineTo(623f)
                lineToRelative(-69f, -102f)
                quadToRelative(-6f, -9f, -15.5f, -13.5f)
                reflectiveQuadTo(518f, 320f)
                quadToRelative(-13f, 0f, -22.5f, 7.5f)
                reflectiveQuadTo(482f, 347f)
                lineToRelative(-54f, 162f)
                close()
                moveToRelative(52f, 318f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -16f)
                quadToRelative(-94f, -84f, -159f, -147.5f)
                reflectiveQuadTo(163f, 544f)
                quadToRelative(-6f, -8f, -1.5f, -16f)
                reflectiveQuadToRelative(13.5f, -8f)
                horizontalLineToRelative(162f)
                lineToRelative(69f, 102f)
                quadToRelative(6f, 9f, 15.5f, 13.5f)
                reflectiveQuadTo(442f, 640f)
                quadToRelative(13f, 0f, 22.5f, -7.5f)
                reflectiveQuadTo(478f, 613f)
                lineToRelative(54f, -163f)
                lineToRelative(35f, 52f)
                quadToRelative(5f, 8f, 14f, 13f)
                reflectiveQuadToRelative(19f, 5f)
                horizontalLineToRelative(185f)
                quadToRelative(9f, 0f, 13.5f, 8f)
                reflectiveQuadToRelative(-1.5f, 16f)
                quadToRelative(-40f, 51f, -105f, 114.5f)
                reflectiveQuadTo(533f, 806f)
                quadToRelative(-11f, 11f, -25f, 16f)
                reflectiveQuadToRelative(-28f, 5f)
                close()
            }
        }.build()
        
        return _Cardiology!!
    }

private var _Cardiology: ImageVector? = null

