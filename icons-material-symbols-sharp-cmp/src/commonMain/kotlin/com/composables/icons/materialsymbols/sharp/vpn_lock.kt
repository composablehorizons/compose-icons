package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Vpn_lock: ImageVector
    get() {
        if (_Vpn_lock != null) return _Vpn_lock!!
        
        _Vpn_lock = ImageVector.Builder(
            name = "vpn_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-82f, 0f, -155f, -31.5f)
                reflectiveQuadToRelative(-127.5f, -86f)
                quadTo(143f, 708f, 111.5f, 635f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -155.5f)
                reflectiveQuadToRelative(86f, -127f)
                quadTo(252f, 143f, 325f, 111.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(32f, 0f, 61.5f, 4.5f)
                reflectiveQuadTo(600f, 98f)
                verticalLineToRelative(182f)
                horizontalLineTo(440f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                lineToRelative(76f, 56f)
                quadToRelative(39f, -44f, 61.5f, -98.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -11f, -1f, -20f)
                reflectiveQuadToRelative(-3f, -20f)
                horizontalLineToRelative(82f)
                quadToRelative(2f, 11f, 2f, 20f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 82f, -31.5f, 155f)
                reflectiveQuadToRelative(-86f, 127.5f)
                quadToRelative(-54.5f, 54.5f, -127f, 86f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-40f, -82f)
                verticalLineToRelative(-78f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-40f)
                lineTo(168f, 408f)
                quadToRelative(-3f, 18f, -5.5f, 36f)
                reflectiveQuadToRelative(-2.5f, 36f)
                quadToRelative(0f, 124f, 80.5f, 213.5f)
                reflectiveQuadTo(440f, 798f)
                close()
                moveToRelative(240f, -438f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(800f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(800f, 80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Vpn_lock!!
    }

private var _Vpn_lock: ImageVector? = null

