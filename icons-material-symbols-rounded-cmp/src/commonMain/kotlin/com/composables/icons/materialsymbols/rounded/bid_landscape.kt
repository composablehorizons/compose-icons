package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bid_landscape: ImageVector
    get() {
        if (_Bid_landscape != null) return _Bid_landscape!!
        
        _Bid_landscape = ImageVector.Builder(
            name = "bid_landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -162f)
                verticalLineToRelative(82f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-350f)
                lineTo(550f, 648f)
                quadToRelative(-11f, 13f, -28.5f, 13.5f)
                reflectiveQuadTo(492f, 650f)
                lineTo(360f, 518f)
                lineTo(200f, 678f)
                close()
                moveToRelative(0f, -114f)
                lineToRelative(132f, -132f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(130f, 130f)
                lineToRelative(242f, -272f)
                verticalLineToRelative(-90f)
                horizontalLineTo(200f)
                verticalLineToRelative(364f)
                close()
                moveToRelative(0f, -154f)
                verticalLineToRelative(-120f)
                verticalLineToRelative(272f)
                verticalLineToRelative(-158f)
                verticalLineToRelative(274f)
                verticalLineToRelative(-160f)
                verticalLineToRelative(162f)
                verticalLineToRelative(-270f)
                close()
                moveToRelative(0f, 154f)
                verticalLineToRelative(-364f)
                verticalLineToRelative(362f)
                verticalLineToRelative(-158f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 114f)
                verticalLineToRelative(-160f)
                verticalLineToRelative(162f)
                verticalLineToRelative(-270f)
                verticalLineToRelative(350f)
                verticalLineToRelative(-82f)
                close()
            }
        }.build()
        
        return _Bid_landscape!!
    }

private var _Bid_landscape: ImageVector? = null

