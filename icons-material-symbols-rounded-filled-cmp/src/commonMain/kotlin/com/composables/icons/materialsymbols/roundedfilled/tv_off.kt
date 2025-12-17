package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tv_off: ImageVector
    get() {
        if (_Tv_off != null) return _Tv_off!!
        
        _Tv_off = ImageVector.Builder(
            name = "tv_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 200f)
                verticalLineToRelative(469f)
                quadToRelative(0f, 14f, -7f, 23f)
                reflectiveQuadToRelative(-18f, 14f)
                quadToRelative(-11f, 5f, -22f, 3.5f)
                reflectiveQuadTo(812f, 698f)
                lineTo(302f, 188f)
                quadToRelative(-10f, -10f, -11.5f, -21f)
                reflectiveQuadToRelative(3.5f, -22f)
                quadToRelative(5f, -11f, 14f, -18f)
                reflectiveQuadToRelative(23f, -7f)
                horizontalLineToRelative(469f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                close()
                moveToRelative(-753f, -73f)
                verticalLineToRelative(112f)
                lineToRelative(-71f, -71f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(648f, 760f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -37f, 23.5f, -55f)
                lineToRelative(23.5f, -18f)
                close()
            }
        }.build()
        
        return _Tv_off!!
    }

private var _Tv_off: ImageVector? = null

