package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bid_landscape: ImageVector
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
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(640f, -550f)
                lineTo(518f, 562f)
                lineTo(360f, 404f)
                lineTo(200f, 564f)
                verticalLineToRelative(114f)
                lineToRelative(160f, -160f)
                lineToRelative(162f, 162f)
                lineToRelative(238f, -270f)
                verticalLineToRelative(-120f)
                close()
            }
        }.build()
        
        return _Bid_landscape!!
    }

private var _Bid_landscape: ImageVector? = null

