package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Vpn_key_off: ImageVector
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
                moveTo(791f, 905f)
                lineTo(486f, 600f)
                quadToRelative(-32f, 54f, -85.5f, 87f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -66f, 32f, -121f)
                reflectiveQuadToRelative(86f, -87f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
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
                moveToRelative(553f, 160f)
                lineTo(513f, 400f)
                horizontalLineToRelative(407f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.build()
        
        return _Vpn_key_off!!
    }

private var _Vpn_key_off: ImageVector? = null

