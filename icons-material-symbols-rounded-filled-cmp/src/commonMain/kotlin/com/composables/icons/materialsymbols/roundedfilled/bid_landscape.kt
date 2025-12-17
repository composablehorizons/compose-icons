package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bid_landscape: ImageVector
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
                moveToRelative(560f, -550f)
                lineTo(518f, 562f)
                lineTo(388f, 432f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                lineTo(200f, 564f)
                verticalLineToRelative(114f)
                lineToRelative(160f, -160f)
                lineToRelative(132f, 132f)
                quadToRelative(12f, 12f, 29.5f, 11.5f)
                reflectiveQuadTo(550f, 648f)
                lineToRelative(210f, -238f)
                verticalLineToRelative(-120f)
                close()
            }
        }.build()
        
        return _Bid_landscape!!
    }

private var _Bid_landscape: ImageVector? = null

