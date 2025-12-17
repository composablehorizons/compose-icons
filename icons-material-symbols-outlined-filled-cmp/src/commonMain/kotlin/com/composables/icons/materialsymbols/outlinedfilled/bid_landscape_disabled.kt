package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Bid_landscape_disabled: ImageVector
    get() {
        if (_Bid_landscape_disabled != null) return _Bid_landscape_disabled!!
        
        _Bid_landscape_disabled = ImageVector.Builder(
            name = "bid_landscape_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(832f, 944f)
                lineTo(728f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-528f)
                lineTo(16f, 128f)
                lineToRelative(57f, -57f)
                lineTo(889f, 887f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(8f, -220f)
                lineTo(650f, 534f)
                lineToRelative(110f, -124f)
                verticalLineToRelative(-120f)
                lineTo(593f, 477f)
                lineTo(236f, 120f)
                horizontalLineToRelative(524f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(524f)
                close()
                moveToRelative(-640f, -46f)
                lineToRelative(160f, -160f)
                lineToRelative(162f, 162f)
                lineToRelative(22f, -24f)
                lineToRelative(-218f, -218f)
                lineToRelative(-126f, 126f)
                verticalLineToRelative(114f)
                close()
            }
        }.build()
        
        return _Bid_landscape_disabled!!
    }

private var _Bid_landscape_disabled: ImageVector? = null

