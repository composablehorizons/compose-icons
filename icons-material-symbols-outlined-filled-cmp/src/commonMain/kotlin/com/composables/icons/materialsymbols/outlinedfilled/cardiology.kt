package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cardiology: ImageVector
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
                horizontalLineTo(99f)
                quadToRelative(-11f, -26f, -15f, -50f)
                reflectiveQuadToRelative(-4f, -50f)
                quadToRelative(0f, -94f, 63f, -157f)
                reflectiveQuadToRelative(157f, -63f)
                quadToRelative(52f, 0f, 99f, 22f)
                reflectiveQuadToRelative(81f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(94f, 0f, 157f, 63f)
                reflectiveQuadToRelative(63f, 157f)
                quadToRelative(0f, 26f, -4f, 50f)
                reflectiveQuadToRelative(-15f, 50f)
                horizontalLineTo(623f)
                lineToRelative(-69f, -102f)
                quadToRelative(-6f, -9f, -15.5f, -13.5f)
                reflectiveQuadTo(518f, 320f)
                quadToRelative(-13f, 0f, -22.5f, 7.5f)
                reflectiveQuadTo(482f, 347f)
                lineToRelative(-54f, 162f)
                close()
                moveToRelative(52f, 345f)
                lineToRelative(-58f, -52f)
                quadToRelative(-105f, -94f, -172f, -161f)
                reflectiveQuadTo(145f, 520f)
                horizontalLineToRelative(192f)
                lineToRelative(69f, 102f)
                quadToRelative(6f, 9f, 15.5f, 13.5f)
                reflectiveQuadTo(442f, 640f)
                quadToRelative(13f, 0f, 22.5f, -7.5f)
                reflectiveQuadTo(478f, 613f)
                lineToRelative(54f, -163f)
                lineToRelative(35f, 52f)
                quadToRelative(5f, 8f, 14f, 13f)
                reflectiveQuadToRelative(19f, 5f)
                horizontalLineToRelative(215f)
                quadToRelative(-38f, 54f, -105f, 121f)
                reflectiveQuadTo(538f, 802f)
                lineToRelative(-58f, 52f)
                close()
            }
        }.build()
        
        return _Cardiology!!
    }

private var _Cardiology: ImageVector? = null

