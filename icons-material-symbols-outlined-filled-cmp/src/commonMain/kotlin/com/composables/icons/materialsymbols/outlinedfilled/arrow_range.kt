package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Arrow_range: ImageVector
    get() {
        if (_Arrow_range != null) return _Arrow_range!!
        
        _Arrow_range = ImageVector.Builder(
            name = "arrow_range",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                lineTo(80f, 480f)
                lineToRelative(200f, -200f)
                lineToRelative(56f, 56f)
                lineToRelative(-103f, 104f)
                horizontalLineToRelative(494f)
                lineTo(624f, 336f)
                lineToRelative(56f, -56f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                lineToRelative(-56f, -56f)
                lineToRelative(103f, -104f)
                horizontalLineTo(233f)
                lineToRelative(103f, 104f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Arrow_range!!
    }

private var _Arrow_range: ImageVector? = null

