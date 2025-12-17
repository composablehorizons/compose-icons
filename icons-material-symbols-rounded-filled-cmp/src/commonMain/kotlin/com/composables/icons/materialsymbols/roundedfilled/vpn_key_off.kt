package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Vpn_key_off: ImageVector
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
                moveToRelative(50f, -176f)
                lineTo(513f, 400f)
                horizontalLineToRelative(327f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 560f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19.57f, -8f, 34.78f)
                quadTo(824f, 690f, 813f, 700f)
                close()
                moveTo(280f, 560f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(360f, 480f)
                verticalLineToRelative(-7f)
                lineToRelative(-73f, -73f)
                horizontalLineToRelative(-7f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 560f)
                close()
            }
        }.build()
        
        return _Vpn_key_off!!
    }

private var _Vpn_key_off: ImageVector? = null

