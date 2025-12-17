package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Close: ImageVector
    get() {
        if (_Close != null) return _Close!!
        
        _Close = ImageVector.Builder(
            name = "close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 760f)
                lineToRelative(-56f, -56f)
                lineToRelative(224f, -224f)
                lineToRelative(-224f, -224f)
                lineToRelative(56f, -56f)
                lineToRelative(224f, 224f)
                lineToRelative(224f, -224f)
                lineToRelative(56f, 56f)
                lineToRelative(-224f, 224f)
                lineToRelative(224f, 224f)
                lineToRelative(-56f, 56f)
                lineToRelative(-224f, -224f)
                lineToRelative(-224f, 224f)
                close()
            }
        }.build()
        
        return _Close!!
    }

private var _Close: ImageVector? = null

