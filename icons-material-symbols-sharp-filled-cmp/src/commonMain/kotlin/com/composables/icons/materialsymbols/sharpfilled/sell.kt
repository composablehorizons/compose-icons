package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sell: ImageVector
    get() {
        if (_Sell != null) return _Sell!!
        
        _Sell = ImageVector.Builder(
            name = "sell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(513f, 913f)
                lineTo(80f, 480f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(400f)
                lineToRelative(432f, 434f)
                lineTo(513f, 913f)
                close()
                moveTo(260f, 320f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 200f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 260f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 320f)
                close()
            }
        }.build()
        
        return _Sell!!
    }

private var _Sell: ImageVector? = null

