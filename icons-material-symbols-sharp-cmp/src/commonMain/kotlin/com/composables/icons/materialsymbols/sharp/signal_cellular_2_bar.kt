package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Signal_cellular_2_bar: ImageVector
    get() {
        if (_Signal_cellular_2_bar != null) return _Signal_cellular_2_bar!!
        
        _Signal_cellular_2_bar = ImageVector.Builder(
            name = "signal_cellular_2_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                lineToRelative(800f, -800f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-526f)
                lineTo(520f, 554f)
                verticalLineToRelative(246f)
                close()
            }
        }.build()
        
        return _Signal_cellular_2_bar!!
    }

private var _Signal_cellular_2_bar: ImageVector? = null

