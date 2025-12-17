package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Car_fan_mid_right: ImageVector
    get() {
        if (_Car_fan_mid_right != null) return _Car_fan_mid_right!!
        
        _Car_fan_mid_right = ImageVector.Builder(
            name = "car_fan_mid_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(252f, 412f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(35f, -35f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(127f)
                lineToRelative(-35f, -35f)
                quadToRelative(-11f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(252f, 148f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(104f, 104f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(308f, 412f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveToRelative(388f, -172f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 240f)
                close()
                moveTo(195f, 860f)
                quadToRelative(-14f, -8f, -18.5f, -24f)
                reflectiveQuadToRelative(3.5f, -30f)
                lineToRelative(118f, -206f)
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
                lineToRelative(-96f, 165f)
                quadToRelative(-8f, 14f, -24f, 18.5f)
                reflectiveQuadToRelative(-30f, -3.5f)
                close()
                moveToRelative(223f, 20f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(358f, 820f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(418f, 760f)
                horizontalLineToRelative(225f)
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
                horizontalLineTo(418f)
                close()
            }
        }.build()
        
        return _Car_fan_mid_right!!
    }

private var _Car_fan_mid_right: ImageVector? = null

