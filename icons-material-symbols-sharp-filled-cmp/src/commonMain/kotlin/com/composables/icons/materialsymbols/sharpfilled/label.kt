package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Label: ImageVector
    get() {
        if (_Label != null) return _Label!!
        
        _Label = ImageVector.Builder(
            name = "label",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 480f)
                lineTo(642f, 760f)
                horizontalLineTo(120f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(522f)
                lineToRelative(198f, 280f)
                close()
            }
        }.build()
        
        return _Label!!
    }

private var _Label: ImageVector? = null

