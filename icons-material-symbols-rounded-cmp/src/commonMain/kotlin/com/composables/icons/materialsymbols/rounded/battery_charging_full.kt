package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_charging_full: ImageVector
    get() {
        if (_Battery_charging_full != null) return _Battery_charging_full!!
        
        _Battery_charging_full = ImageVector.Builder(
            name = "battery_charging_full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 760f)
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
                moveToRelative(-300f, 40f)
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
        
        return _Battery_charging_full!!
    }

private var _Battery_charging_full: ImageVector? = null

