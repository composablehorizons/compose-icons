package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wind_power: ImageVector
    get() {
        if (_Wind_power != null) return _Wind_power!!
        
        _Wind_power = ImageVector.Builder(
            name = "wind_power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-208f)
                quadToRelative(-12f, -5f, -22.5f, -11.5f)
                reflectiveQuadTo(438f, 606f)
                lineToRelative(-116f, 74f)
                lineToRelative(-282f, -80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(392f)
                quadToRelative(10f, -11f, 22f, -19f)
                reflectiveQuadToRelative(26f, -13f)
                verticalLineToRelative(-172f)
                lineToRelative(213f, -199f)
                lineToRelative(136f, 85f)
                lineToRelative(-205f, 339f)
                quadToRelative(7f, 12f, 10.5f, 26f)
                reflectiveQuadToRelative(4.5f, 29f)
                lineToRelative(141f, 34f)
                lineToRelative(142f, 254f)
                lineTo(809f, 917f)
                lineTo(560f, 669f)
                verticalLineToRelative(171f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
                moveTo(160f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(400f, 71f)
                verticalLineToRelative(137f)
                quadToRelative(1f, 0f, 1.5f, 0.5f)
                reflectiveQuadToRelative(1.5f, 0.5f)
                lineToRelative(158f, -262f)
                lineToRelative(-18f, -10f)
                lineToRelative(-143f, 134f)
                close()
                moveTo(40f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(480f, 200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 560f)
                close()
                moveToRelative(-211f, 34f)
                lineToRelative(93f, -56f)
                quadToRelative(-1f, -5f, -1f, -9f)
                verticalLineToRelative(-9f)
                horizontalLineTo(120f)
                verticalLineToRelative(20f)
                lineToRelative(189f, 54f)
                close()
                moveToRelative(419f, 25f)
                lineToRelative(-114f, -26f)
                quadToRelative(-2f, 2f, -4f, 5f)
                reflectiveQuadToRelative(-4f, 5f)
                lineToRelative(203f, 202f)
                lineToRelative(15f, -15f)
                lineToRelative(-96f, -171f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, -320f)
                close()
                moveToRelative(43f, -111f)
                close()
                moveTo(401f, 520f)
                close()
                moveToRelative(205f, 83f)
                close()
            }
        }.build()
        
        return _Wind_power!!
    }

private var _Wind_power: ImageVector? = null

