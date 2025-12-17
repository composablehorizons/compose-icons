package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Symptoms: ImageVector
    get() {
        if (_Symptoms != null) return _Symptoms!!
        
        _Symptoms = ImageVector.Builder(
            name = "symptoms",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 880f)
                quadToRelative(-67f, 0f, -113.5f, -47f)
                reflectiveQuadTo(599f, 719f)
                quadToRelative(0f, -33f, 14f, -63f)
                reflectiveQuadToRelative(38f, -53f)
                lineToRelative(109f, -103f)
                lineToRelative(108f, 103f)
                quadToRelative(24f, 23f, 37.5f, 52.5f)
                reflectiveQuadTo(920f, 718f)
                quadToRelative(0f, 68f, -47f, 115f)
                reflectiveQuadTo(760f, 880f)
                close()
                moveTo(480f, 568f)
                quadToRelative(-45f, 0f, -76.5f, -31.5f)
                reflectiveQuadTo(372f, 460f)
                quadToRelative(0f, -45f, 31.5f, -76.5f)
                reflectiveQuadTo(480f, 352f)
                quadToRelative(45f, 0f, 76.5f, 31.5f)
                reflectiveQuadTo(588f, 460f)
                quadToRelative(0f, 45f, -31.5f, 76.5f)
                reflectiveQuadTo(480f, 568f)
                close()
                moveToRelative(0f, 192f)
                quadToRelative(-146f, 0f, -266f, -81.5f)
                reflectiveQuadTo(40f, 460f)
                quadToRelative(54f, -137f, 174f, -218.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(146f, 0f, 266f, 81.5f)
                reflectiveQuadTo(920f, 460f)
                quadToRelative(-6f, 15f, -12.5f, 29f)
                reflectiveQuadTo(893f, 516f)
                lineTo(762f, 391f)
                lineToRelative(-104f, 96f)
                quadToRelative(1f, -7f, 1.5f, -13.5f)
                reflectiveQuadToRelative(0.5f, -13.5f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 460f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(15f, 0f, 29f, -2f)
                reflectiveQuadToRelative(28f, -7f)
                quadToRelative(-12f, 30f, -16f, 62.5f)
                reflectiveQuadToRelative(2f, 65.5f)
                quadToRelative(-11f, 1f, -21.5f, 1f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Symptoms!!
    }

private var _Symptoms: ImageVector? = null

