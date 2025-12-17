package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_unknown: ImageVector
    get() {
        if (_Battery_unknown != null) return _Battery_unknown!!
        
        _Battery_unknown = ImageVector.Builder(
            name = "battery_unknown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 606f)
                quadToRelative(-12f, 0f, -21.5f, 5.5f)
                reflectiveQuadTo(642f, 626f)
                quadToRelative(-6f, 8f, -15f, 11f)
                reflectiveQuadToRelative(-17f, -1f)
                quadToRelative(-9f, -4f, -13.5f, -13f)
                reflectiveQuadToRelative(0.5f, -17f)
                quadToRelative(13f, -21f, 35f, -33.5f)
                reflectiveQuadToRelative(48f, -12.5f)
                quadToRelative(37f, 0f, 64.5f, 24f)
                reflectiveQuadToRelative(27.5f, 60f)
                quadToRelative(0f, 11f, -3f, 20.5f)
                reflectiveQuadToRelative(-9f, 17.5f)
                quadToRelative(-11f, 16f, -26f, 28.5f)
                reflectiveQuadTo(710f, 740f)
                quadToRelative(0f, 1f, -5f, 14f)
                quadToRelative(-2f, 10f, -8.5f, 17f)
                reflectiveQuadToRelative(-16.5f, 7f)
                quadToRelative(-11f, 0f, -18f, -7.5f)
                reflectiveQuadToRelative(-6f, -17.5f)
                quadToRelative(1f, -8f, 2.5f, -14.5f)
                reflectiveQuadTo(664f, 725f)
                quadToRelative(10f, -17f, 25.5f, -29f)
                reflectiveQuadToRelative(26.5f, -28f)
                quadToRelative(3f, -4f, 7f, -23f)
                quadToRelative(0f, -17f, -13f, -28f)
                reflectiveQuadToRelative(-30f, -11f)
                close()
                moveToRelative(0f, 274f)
                quadToRelative(-14f, 0f, -24f, -9.5f)
                reflectiveQuadTo(646f, 847f)
                quadToRelative(0f, -14f, 10f, -24f)
                reflectiveQuadToRelative(24f, -10f)
                quadToRelative(14f, 0f, 23.5f, 10f)
                reflectiveQuadToRelative(9.5f, 24f)
                quadToRelative(0f, 14f, -9.5f, 23.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(-320f, -80f)
                close()
                moveToRelative(-40f, 80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 440f)
                verticalLineToRelative(-200f)
                horizontalLineTo(360f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(101f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(501f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(461f, 880f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Battery_unknown!!
    }

private var _Battery_unknown: ImageVector? = null

