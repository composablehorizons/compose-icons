package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Car_gear: ImageVector
    get() {
        if (_Car_gear != null) return _Car_gear!!
        
        _Car_gear = ImageVector.Builder(
            name = "car_gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-360f)
                lineToRelative(98f, -280f)
                horizontalLineToRelative(265f)
                quadToRelative(-2f, 10f, -2.5f, 19.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(0f, 11f, 0.5f, 20.5f)
                reflectiveQuadTo(483f, 280f)
                horizontalLineTo(274f)
                lineToRelative(-42f, 120f)
                horizontalLineToRelative(309f)
                quadToRelative(33f, 37f, 79f, 58.5f)
                reflectiveQuadTo(720f, 480f)
                horizontalLineTo(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-204f)
                quadToRelative(22f, -4f, 42f, -11f)
                reflectiveQuadToRelative(38f, -18f)
                verticalLineToRelative(393f)
                horizontalLineTo(720f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(573f, -440f)
                lineToRelative(-11f, -47f)
                quadToRelative(-11f, -4f, -21.5f, -10f)
                reflectiveQuadTo(641f, 329f)
                lineToRelative(-46f, 15f)
                lineToRelative(-27f, -46f)
                lineToRelative(35f, -34f)
                quadToRelative(-2f, -12f, -2f, -24f)
                reflectiveQuadToRelative(2f, -24f)
                lineToRelative(-35f, -32f)
                lineToRelative(27f, -46f)
                lineToRelative(45f, 13f)
                quadToRelative(9f, -8f, 19.5f, -14f)
                reflectiveQuadToRelative(22.5f, -10f)
                lineToRelative(11f, -47f)
                horizontalLineToRelative(53f)
                lineToRelative(12f, 46f)
                quadToRelative(12f, 5f, 22.5f, 11f)
                reflectiveQuadToRelative(19.5f, 14f)
                lineToRelative(45f, -13f)
                lineToRelative(27f, 46f)
                lineToRelative(-34f, 32f)
                quadToRelative(2f, 12f, 2.5f, 24.5f)
                reflectiveQuadTo(838f, 265f)
                lineToRelative(34f, 32f)
                lineToRelative(-26f, 46f)
                lineToRelative(-46f, -14f)
                quadToRelative(-9f, 8f, -20f, 14f)
                reflectiveQuadToRelative(-22f, 10f)
                lineToRelative(-12f, 47f)
                horizontalLineToRelative(-53f)
                close()
                moveToRelative(27f, -100f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(780f, 240f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(720f, 180f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(660f, 240f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(720f, 300f)
                close()
                moveTo(200f, 480f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                close()
                moveToRelative(100f, 160f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(360f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 640f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(600f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(660f, 640f)
                close()
            }
        }.build()
        
        return _Car_gear!!
    }

private var _Car_gear: ImageVector? = null

