package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Vpn_key_off: ImageVector
    get() {
        if (_Vpn_key_off != null) return _Vpn_key_off!!
        
        _Vpn_key_off = ImageVector.Builder(
            name = "vpn_key_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineTo(486f, 600f)
                quadToRelative(-32f, 54f, -85.5f, 87f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -66f, 32f, -121f)
                reflectiveQuadToRelative(86f, -87f)
                lineToRelative(-75f, -75f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveToRelative(-83f, -309f)
                lineToRelative(-47f, -47f)
                horizontalLineToRelative(47f)
                verticalLineToRelative(47f)
                close()
                moveToRelative(138f, 136f)
                lineToRelative(-58f, -56f)
                verticalLineToRelative(-127f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(553f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(367f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(47f)
                quadToRelative(0f, 18f, -6.5f, 32f)
                reflectiveQuadTo(818f, 703f)
                close()
                moveToRelative(-538f, -63f)
                quadToRelative(65f, 0f, 99.5f, -35f)
                reflectiveQuadToRelative(49.5f, -63f)
                lineTo(219f, 332f)
                quadToRelative(-44f, 18f, -71.5f, 57.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 560f)
                close()
                moveToRelative(309f, -84f)
                close()
                moveToRelative(-314f, 10f)
                close()
            }
        }.build()
        
        return _Vpn_key_off!!
    }

private var _Vpn_key_off: ImageVector? = null

