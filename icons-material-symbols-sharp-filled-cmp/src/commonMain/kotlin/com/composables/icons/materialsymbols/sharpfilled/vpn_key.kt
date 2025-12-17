package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Vpn_key: ImageVector
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
                quadToRelative(81f, 0f, 141.5f, 45.5f)
                reflectiveQuadTo(506f, 400f)
                horizontalLineToRelative(414f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineTo(680f)
                verticalLineToRelative(-160f)
                horizontalLineTo(506f)
                quadToRelative(-24f, 69f, -84.5f, 114.5f)
                reflectiveQuadTo(280f, 720f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 560f)
                close()
            }
        }.build()
        
        return _Vpn_key!!
    }

private var _Vpn_key: ImageVector? = null

