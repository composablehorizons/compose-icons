package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_charging_30: ImageVector
    get() {
        if (_Battery_charging_30 != null) return _Battery_charging_30!!
        
        _Battery_charging_30 = ImageVector.Builder(
            name = "battery_charging_30",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
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
                verticalLineToRelative(400f)
                horizontalLineToRelative(46f)
                quadToRelative(18f, 0f, 29f, 14f)
                reflectiveQuadToRelative(7f, 32f)
                quadToRelative(-2f, 8f, -2f, 17f)
                verticalLineToRelative(17f)
                quadToRelative(0f, 30f, 7f, 58f)
                reflectiveQuadToRelative(21f, 54f)
                quadToRelative(8f, 17f, 0f, 32.5f)
                reflectiveQuadTo(443f, 880f)
                horizontalLineTo(320f)
                close()
                moveToRelative(340f, -120f)
                horizontalLineToRelative(-62f)
                quadToRelative(-12f, 0f, -17.5f, -10.5f)
                reflectiveQuadTo(582f, 729f)
                lineToRelative(100f, -143f)
                quadToRelative(5f, -6f, 11.5f, -4f)
                reflectiveQuadToRelative(6.5f, 10f)
                verticalLineToRelative(88f)
                horizontalLineToRelative(62f)
                quadToRelative(12f, 0f, 17.5f, 10.5f)
                reflectiveQuadTo(778f, 711f)
                lineTo(678f, 854f)
                quadToRelative(-5f, 6f, -11.5f, 4f)
                reflectiveQuadToRelative(-6.5f, -10f)
                verticalLineToRelative(-88f)
                close()
            }
        }.build()
        
        return _Battery_charging_30!!
    }

private var _Battery_charging_30: ImageVector? = null

