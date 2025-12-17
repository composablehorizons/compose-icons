package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Arrow_top_right: ImageVector
    get() {
        if (_Arrow_top_right != null) return _Arrow_top_right!!
        
        _Arrow_top_right = ImageVector.Builder(
            name = "arrow_top_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(447f)
                lineTo(503f, 177f)
                lineToRelative(57f, -57f)
                lineToRelative(240f, 240f)
                lineToRelative(-241f, 241f)
                lineToRelative(-56f, -57f)
                lineToRelative(144f, -144f)
                horizontalLineTo(280f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Arrow_top_right!!
    }

private var _Arrow_top_right: ImageVector? = null

