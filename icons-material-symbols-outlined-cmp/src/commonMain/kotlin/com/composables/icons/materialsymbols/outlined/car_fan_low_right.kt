package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Car_fan_low_right: ImageVector
    get() {
        if (_Car_fan_low_right != null) return _Car_fan_low_right!!
        
        _Car_fan_low_right = ImageVector.Builder(
            name = "car_fan_low_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 240f)
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
                lineToRelative(138f, -240f)
                quadToRelative(11f, -19f, 29.5f, -29.5f)
                reflectiveQuadTo(368f, 560f)
                horizontalLineToRelative(92f)
                lineToRelative(58f, -201f)
                quadToRelative(10f, -35f, 37f, -57f)
                reflectiveQuadToRelative(61f, -22f)
                quadToRelative(48f, 0f, 78.5f, 36.5f)
                reflectiveQuadTo(716f, 401f)
                lineToRelative(-43f, 215f)
                quadToRelative(-5f, 28f, -27.5f, 46f)
                reflectiveQuadTo(594f, 680f)
                horizontalLineTo(345f)
                lineTo(229f, 880f)
                close()
                moveToRelative(51f, -440f)
                lineTo(120f, 280f)
                lineToRelative(56f, -57f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-167f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(167f)
                lineToRelative(64f, -63f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(737f, 880f)
                horizontalLineTo(358f)
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
                lineToRelative(-96f, 373f)
                quadToRelative(-8f, 26f, -29f, 42.5f)
                reflectiveQuadTo(737f, 880f)
                close()
            }
        }.build()
        
        return _Car_fan_low_right!!
    }

private var _Car_fan_low_right: ImageVector? = null

