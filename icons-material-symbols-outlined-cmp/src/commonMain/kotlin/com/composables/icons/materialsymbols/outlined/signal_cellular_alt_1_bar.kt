package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Signal_cellular_alt_1_bar: ImageVector
    get() {
        if (_Signal_cellular_alt_1_bar != null) return _Signal_cellular_alt_1_bar!!
        
        _Signal_cellular_alt_1_bar = ImageVector.Builder(
            name = "signal_cellular_alt_1_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Signal_cellular_alt_1_bar!!
    }

private var _Signal_cellular_alt_1_bar: ImageVector? = null

