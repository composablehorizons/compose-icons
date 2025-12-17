package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Arrow_right: ImageVector
    get() {
        if (_Arrow_right != null) return _Arrow_right!!
        
        _Arrow_right = ImageVector.Builder(
            name = "arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 680f)
                verticalLineToRelative(-400f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Arrow_right!!
    }

private var _Arrow_right: ImageVector? = null

