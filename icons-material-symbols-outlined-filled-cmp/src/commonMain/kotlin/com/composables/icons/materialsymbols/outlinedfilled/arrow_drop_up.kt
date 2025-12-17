package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Arrow_drop_up: ImageVector
    get() {
        if (_Arrow_drop_up != null) return _Arrow_drop_up!!
        
        _Arrow_drop_up = ImageVector.Builder(
            name = "arrow_drop_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 560f)
                lineToRelative(200f, -200f)
                lineToRelative(200f, 200f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Arrow_drop_up!!
    }

private var _Arrow_drop_up: ImageVector? = null

