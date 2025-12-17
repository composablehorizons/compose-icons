package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Park: ImageVector
    get() {
        if (_Park != null) return _Park!!
        
        _Park = ImageVector.Builder(
            name = "park",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(558f, 880f)
                horizontalLineTo(402f)
                verticalLineToRelative(-160f)
                horizontalLineTo(120f)
                lineToRelative(160f, -240f)
                horizontalLineToRelative(-80f)
                lineToRelative(280f, -400f)
                lineToRelative(280f, 400f)
                horizontalLineToRelative(-80f)
                lineToRelative(160f, 240f)
                horizontalLineTo(558f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Park!!
    }

private var _Park: ImageVector? = null

