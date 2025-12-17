package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Price_check: ImageVector
    get() {
        if (_Price_check != null) return _Price_check!!
        
        _Price_check = ImageVector.Builder(
            name = "price_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 599f)
                verticalLineToRelative(-40f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(240f)
                horizontalLineTo(340f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(298f, 240f)
                lineTo(388f, 669f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 114f)
                lineToRelative(226f, -226f)
                lineToRelative(56f, 56f)
                lineToRelative(-282f, 282f)
                close()
            }
        }.build()
        
        return _Price_check!!
    }

private var _Price_check: ImageVector? = null

