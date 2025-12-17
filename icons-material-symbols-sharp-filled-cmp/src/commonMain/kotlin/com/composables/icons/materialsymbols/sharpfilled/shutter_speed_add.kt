package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shutter_speed_add: ImageVector
    get() {
        if (_Shutter_speed_add != null) return _Shutter_speed_add!!
        
        _Shutter_speed_add = ImageVector.Builder(
            name = "shutter_speed_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 920f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(360f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadTo(225f, 774f)
                quadToRelative(-49f, -49f, -77f, -114.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -74f, 28.5f, -139.5f)
                reflectiveQuadTo(226f, 266f)
                quadToRelative(49f, -49f, 114.5f, -77.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(63f, 0f, 120f, 21f)
                reflectiveQuadToRelative(104f, 59f)
                lineToRelative(58f, -58f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 58f)
                quadToRelative(38f, 49f, 59f, 109.5f)
                reflectiveQuadTo(840f, 533f)
                quadToRelative(-14f, -5f, -35.5f, -9f)
                reflectiveQuadToRelative(-44.5f, -4f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(11f, 0f, 21f, -0.5f)
                reflectiveQuadToRelative(21f, -2.5f)
                quadToRelative(3f, 20f, 9.5f, 39.5f)
                reflectiveQuadTo(548f, 874f)
                quadToRelative(-17f, 3f, -34f, 4.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(40f, -123f)
                quadToRelative(1f, -45f, 16.5f, -84f)
                reflectiveQuadToRelative(42.5f, -70f)
                quadToRelative(27f, -31f, 63f, -51.5f)
                reflectiveQuadToRelative(78f, -28.5f)
                quadToRelative(0f, -11f, -1f, -21.5f)
                reflectiveQuadToRelative(-3f, -21.5f)
                horizontalLineTo(597f)
                lineTo(436f, 756f)
                quadToRelative(18f, 4f, 44f, 3.5f)
                reflectiveQuadToRelative(40f, -2.5f)
                close()
                moveToRelative(-40f, -317f)
                horizontalLineToRelative(226f)
                quadToRelative(-18f, -51f, -56f, -89.5f)
                reflectiveQuadTo(564f, 295f)
                lineToRelative(-84f, 145f)
                close()
                moveToRelative(-69f, 40f)
                lineToRelative(113f, -196f)
                quadToRelative(-51f, -10f, -102.5f, 3f)
                reflectiveQuadTo(327f, 335f)
                lineToRelative(84f, 145f)
                close()
                moveToRelative(-167f, 80f)
                horizontalLineToRelative(167f)
                lineTo(298f, 364f)
                quadToRelative(-35f, 39f, -49f, 90.5f)
                reflectiveQuadTo(244f, 560f)
                close()
                moveToRelative(152f, 185f)
                lineToRelative(84f, -145f)
                horizontalLineTo(254f)
                quadToRelative(17f, 50f, 55.5f, 89f)
                reflectiveQuadToRelative(86.5f, 56f)
                close()
            }
        }.build()
        
        return _Shutter_speed_add!!
    }

private var _Shutter_speed_add: ImageVector? = null

