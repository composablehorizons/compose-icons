package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Stars_2: ImageVector
    get() {
        if (_Stars_2 != null) return _Stars_2!!
        
        _Stars_2 = ImageVector.Builder(
            name = "stars_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(233f, 840f)
                lineToRelative(65f, -281f)
                lineTo(80f, 370f)
                lineToRelative(288f, -25f)
                lineToRelative(112f, -265f)
                lineToRelative(112f, 265f)
                lineToRelative(288f, 25f)
                lineToRelative(-218f, 189f)
                lineToRelative(65f, 281f)
                lineToRelative(-247f, -149f)
                lineToRelative(-247f, 149f)
                close()
                moveToRelative(457f, -560f)
                lineToRelative(21f, -89f)
                lineToRelative(-71f, -59f)
                lineToRelative(94f, -8f)
                lineToRelative(36f, -84f)
                lineToRelative(36f, 84f)
                lineToRelative(94f, 8f)
                lineToRelative(-71f, 59f)
                lineToRelative(21f, 89f)
                lineToRelative(-80f, -47f)
                lineToRelative(-80f, 47f)
                close()
            }
        }.build()
        
        return _Stars_2!!
    }

private var _Stars_2: ImageVector? = null

