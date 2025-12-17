package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Vpn_key: ImageVector
    get() {
        if (_Vpn_key != null) return _Vpn_key!!
        
        _Vpn_key = ImageVector.Builder(
            name = "vpn_key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 720f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(66f, 0f, 121f, 33f)
                reflectiveQuadToRelative(87f, 87f)
                horizontalLineToRelative(432f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-120f)
                horizontalLineTo(488f)
                quadToRelative(-32f, 54f, -87f, 87f)
                reflectiveQuadToRelative(-121f, 33f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(66f, 0f, 106f, -40.5f)
                reflectiveQuadToRelative(48f, -79.5f)
                horizontalLineToRelative(246f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(434f)
                quadToRelative(-8f, -39f, -48f, -79.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 560f)
                close()
                moveToRelative(0f, -80f)
                close()
            }
        }.build()
        
        return _Vpn_key!!
    }

private var _Vpn_key: ImageVector? = null

