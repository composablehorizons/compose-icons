package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Severe_cold: ImageVector
    get() {
        if (_Severe_cold != null) return _Severe_cold!!
        
        _Severe_cold = ImageVector.Builder(
            name = "severe_cold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 400f)
                close()
                moveTo(400f, 736f)
                lineToRelative(-77f, 77f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(268f, 812f)
                quadToRelative(-12f, -11f, -12f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(132f, -132f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(-64f)
                lineTo(203f, 693f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(148f, 692f)
                quadToRelative(-12f, -11f, -12f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(76f, -76f)
                horizontalLineTo(119f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(80f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 480f)
                horizontalLineToRelative(104f)
                lineToRelative(-77f, -76f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                lineToRelative(132f, 132f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-64f)
                lineTo(267f, 284f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                lineToRelative(76f, 76f)
                verticalLineToRelative(-104f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 200f)
                verticalLineToRelative(104f)
                lineToRelative(76f, -76f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(11f, 12f, 11f, 28.5f)
                reflectiveQuadTo(612f, 284f)
                lineTo(480f, 416f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 560f)
                horizontalLineTo(656f)
                lineToRelative(76f, 77f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(732f, 692f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(676f, 692f)
                lineTo(544f, 560f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(64f)
                lineToRelative(132f, 133f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(612f, 812f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(556f, 812f)
                lineToRelative(-76f, -76f)
                verticalLineToRelative(105f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(440f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 840f)
                verticalLineToRelative(-104f)
                close()
                moveToRelative(400f, -456f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 240f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 120f)
                verticalLineToRelative(121f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(800f, 280f)
                close()
            }
        }.build()
        
        return _Severe_cold!!
    }

private var _Severe_cold: ImageVector? = null

