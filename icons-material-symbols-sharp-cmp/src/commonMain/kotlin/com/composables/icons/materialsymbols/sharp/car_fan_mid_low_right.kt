package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Car_fan_mid_low_right: ImageVector
    get() {
        if (_Car_fan_mid_low_right != null) return _Car_fan_mid_low_right!!
        
        _Car_fan_mid_low_right = ImageVector.Builder(
            name = "car_fan_mid_low_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 320f)
                lineToRelative(-42f, -42f)
                lineToRelative(47f, -48f)
                horizontalLineTo(240f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(125f)
                lineToRelative(-47f, -48f)
                lineToRelative(42f, -42f)
                lineToRelative(120f, 120f)
                lineToRelative(-120f, 120f)
                close()
                moveTo(200f, 560f)
                lineTo(80f, 440f)
                lineToRelative(42f, -42f)
                lineToRelative(48f, 47f)
                verticalLineToRelative(-125f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(125f)
                lineToRelative(48f, -47f)
                lineToRelative(42f, 42f)
                lineToRelative(-120f, 120f)
                close()
                moveToRelative(440f, -320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 240f)
                close()
                moveTo(229f, 880f)
                lineToRelative(-69f, -40f)
                lineToRelative(161f, -280f)
                horizontalLineToRelative(139f)
                lineToRelative(58f, -201f)
                quadToRelative(10f, -35f, 37f, -57f)
                reflectiveQuadToRelative(61f, -22f)
                quadToRelative(48f, 0f, 78.5f, 36.5f)
                reflectiveQuadTo(716f, 401f)
                lineToRelative(-56f, 279f)
                horizontalLineTo(345f)
                lineTo(229f, 880f)
                close()
                moveToRelative(129f, 0f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(439f, 760f)
                horizontalLineToRelative(204f)
                quadToRelative(18f, 0f, 37f, 6.5f)
                reflectiveQuadToRelative(39f, 20.5f)
                verticalLineToRelative(-44f)
                quadToRelative(0f, -63f, 16.5f, -129.5f)
                reflectiveQuadTo(785f, 476f)
                lineToRelative(20f, -42f)
                quadToRelative(12f, -26f, 8f, -52.5f)
                reflectiveQuadTo(790f, 336f)
                quadToRelative(-8f, -8f, -12f, -18f)
                reflectiveQuadToRelative(-4f, -21f)
                quadToRelative(0f, -23f, 17f, -40f)
                reflectiveQuadToRelative(40f, -17f)
                quadToRelative(20f, 0f, 36.5f, 10.5f)
                reflectiveQuadTo(893f, 279f)
                quadToRelative(13f, 26f, 19.5f, 53f)
                reflectiveQuadToRelative(6.5f, 54f)
                quadToRelative(0f, 14f, -2f, 29.5f)
                reflectiveQuadToRelative(-7f, 32.5f)
                lineTo(799f, 880f)
                horizontalLineTo(358f)
                close()
            }
        }.build()
        
        return _Car_fan_mid_low_right!!
    }

private var _Car_fan_mid_low_right: ImageVector? = null

