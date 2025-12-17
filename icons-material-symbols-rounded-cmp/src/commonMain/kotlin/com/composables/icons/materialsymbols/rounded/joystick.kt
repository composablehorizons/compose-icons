package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Joystick: ImageVector
    get() {
        if (_Joystick != null) return _Joystick!!
        
        _Joystick = ImageVector.Builder(
            name = "joystick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(272f, 520f)
                lineToRelative(208f, 120f)
                lineToRelative(208f, -120f)
                lineToRelative(-168f, -97f)
                verticalLineToRelative(137f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-137f)
                lineToRelative(-168f, 97f)
                close()
                moveToRelative(168f, -189f)
                verticalLineToRelative(-17f)
                quadToRelative(-44f, -13f, -72f, -49.5f)
                reflectiveQuadTo(340f, 180f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 48f, -28f, 84.5f)
                reflectiveQuadTo(520f, 314f)
                verticalLineToRelative(17f)
                lineToRelative(280f, 161f)
                quadToRelative(19f, 11f, 29.5f, 29.5f)
                reflectiveQuadTo(840f, 562f)
                verticalLineToRelative(76f)
                quadToRelative(0f, 22f, -10.5f, 40.5f)
                reflectiveQuadTo(800f, 708f)
                lineTo(520f, 869f)
                quadToRelative(-19f, 11f, -40f, 11f)
                reflectiveQuadToRelative(-40f, -11f)
                lineTo(160f, 708f)
                quadToRelative(-19f, -11f, -29.5f, -29.5f)
                reflectiveQuadTo(120f, 638f)
                verticalLineToRelative(-76f)
                quadToRelative(0f, -22f, 10.5f, -40.5f)
                reflectiveQuadTo(160f, 492f)
                lineToRelative(280f, -161f)
                close()
                moveToRelative(0f, 378f)
                lineTo(200f, 571f)
                verticalLineToRelative(67f)
                lineToRelative(280f, 162f)
                lineToRelative(280f, -162f)
                verticalLineToRelative(-67f)
                lineTo(520f, 709f)
                quadToRelative(-19f, 11f, -40f, 11f)
                reflectiveQuadToRelative(-40f, -11f)
                close()
                moveToRelative(40f, -469f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 180f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 180f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveToRelative(0f, 560f)
                close()
            }
        }.build()
        
        return _Joystick!!
    }

private var _Joystick: ImageVector? = null

