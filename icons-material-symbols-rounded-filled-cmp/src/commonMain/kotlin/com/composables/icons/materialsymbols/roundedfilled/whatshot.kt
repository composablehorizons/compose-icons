package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Whatshot: ImageVector
    get() {
        if (_Whatshot != null) return _Whatshot!!
        
        _Whatshot = ImageVector.Builder(
            name = "whatshot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-100f, 0f, -183.5f, -44f)
                reflectiveQuadTo(158f, 718f)
                lineToRelative(164f, -164f)
                lineToRelative(92f, 77f)
                quadToRelative(12f, 10f, 27.5f, 9f)
                reflectiveQuadToRelative(26.5f, -12f)
                lineToRelative(172f, -172f)
                verticalLineToRelative(64f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 520f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 320f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 400f)
                horizontalLineToRelative(64f)
                lineTo(438f, 546f)
                lineToRelative(-92f, -77f)
                quadToRelative(-12f, -10f, -27.5f, -9f)
                reflectiveQuadTo(292f, 472f)
                lineTo(116f, 648f)
                quadToRelative(-17f, -38f, -26.5f, -80.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Whatshot!!
    }

private var _Whatshot: ImageVector? = null

