package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Local_bar: ImageVector
    get() {
        if (_Local_bar != null) return _Local_bar!!
        
        _Local_bar = ImageVector.Builder(
            name = "local_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                lineTo(120f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                lineTo(520f, 560f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(58f, -560f)
                horizontalLineToRelative(364f)
                lineToRelative(72f, -80f)
                horizontalLineTo(226f)
                lineToRelative(72f, 80f)
                close()
            }
        }.build()
        
        return _Local_bar!!
    }

private var _Local_bar: ImageVector? = null

