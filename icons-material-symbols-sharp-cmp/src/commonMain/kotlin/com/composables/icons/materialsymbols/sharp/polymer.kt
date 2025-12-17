package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Polymer: ImageVector
    get() {
        if (_Polymer != null) return _Polymer!!
        
        _Polymer = ImageVector.Builder(
            name = "polymer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(198f, 800f)
                lineTo(20f, 480f)
                lineToRelative(180f, -320f)
                horizontalLineToRelative(160f)
                lineTo(180f, 480f)
                lineToRelative(104f, 186f)
                lineToRelative(312f, -506f)
                horizontalLineToRelative(164f)
                lineToRelative(180f, 320f)
                lineToRelative(-180f, 320f)
                horizontalLineTo(600f)
                lineToRelative(180f, -320f)
                lineToRelative(-104f, -184f)
                lineToRelative(-310f, 504f)
                horizontalLineTo(198f)
                close()
            }
        }.build()
        
        return _Polymer!!
    }

private var _Polymer: ImageVector? = null

