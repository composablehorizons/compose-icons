package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.West: ImageVector
    get() {
        if (_West != null) return _West!!
        
        _West = ImageVector.Builder(
            name = "west",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 760f)
                lineTo(80f, 480f)
                lineToRelative(280f, -280f)
                lineToRelative(56f, 56f)
                lineToRelative(-183f, 184f)
                horizontalLineToRelative(647f)
                verticalLineToRelative(80f)
                horizontalLineTo(233f)
                lineToRelative(184f, 184f)
                lineToRelative(-57f, 56f)
                close()
            }
        }.build()
        
        return _West!!
    }

private var _West: ImageVector? = null

