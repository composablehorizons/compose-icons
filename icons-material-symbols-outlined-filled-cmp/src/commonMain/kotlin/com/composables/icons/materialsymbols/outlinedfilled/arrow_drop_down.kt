package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Arrow_drop_down: ImageVector
    get() {
        if (_Arrow_drop_down != null) return _Arrow_drop_down!!
        
        _Arrow_drop_down = ImageVector.Builder(
            name = "arrow_drop_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                lineTo(280f, 400f)
                horizontalLineToRelative(400f)
                lineTo(480f, 600f)
                close()
            }
        }.build()
        
        return _Arrow_drop_down!!
    }

private var _Arrow_drop_down: ImageVector? = null

