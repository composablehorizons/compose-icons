package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Merge: ImageVector
    get() {
        if (_Merge != null) return _Merge!!
        
        _Merge = ImageVector.Builder(
            name = "merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(240f, -241f)
                verticalLineToRelative(-270f)
                lineToRelative(-64f, 63f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -63f)
                verticalLineToRelative(270f)
                lineToRelative(240f, 241f)
                lineToRelative(-56f, 56f)
                lineToRelative(-224f, -224f)
                lineToRelative(-224f, 224f)
                close()
            }
        }.build()
        
        return _Merge!!
    }

private var _Merge: ImageVector? = null

