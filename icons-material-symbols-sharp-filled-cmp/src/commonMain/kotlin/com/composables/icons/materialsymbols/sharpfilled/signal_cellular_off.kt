package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Signal_cellular_off: ImageVector
    get() {
        if (_Signal_cellular_off != null) return _Signal_cellular_off!!
        
        _Signal_cellular_off = ImageVector.Builder(
            name = "signal_cellular_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(831f, 944f)
                lineToRelative(-64f, -64f)
                horizontalLineTo(80f)
                lineToRelative(344f, -344f)
                lineTo(96f, 209f)
                lineToRelative(56f, -57f)
                lineTo(888f, 888f)
                lineToRelative(-57f, 56f)
                close()
                moveToRelative(49f, -176f)
                lineTo(536f, 424f)
                lineToRelative(344f, -344f)
                verticalLineToRelative(688f)
                close()
            }
        }.build()
        
        return _Signal_cellular_off!!
    }

private var _Signal_cellular_off: ImageVector? = null

