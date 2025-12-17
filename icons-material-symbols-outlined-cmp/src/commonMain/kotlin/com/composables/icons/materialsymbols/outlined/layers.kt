package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Layers: ImageVector
    get() {
        if (_Layers != null) return _Layers!!
        
        _Layers = ImageVector.Builder(
            name = "layers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 842f)
                lineTo(120f, 562f)
                lineToRelative(66f, -50f)
                lineToRelative(294f, 228f)
                lineToRelative(294f, -228f)
                lineToRelative(66f, 50f)
                lineToRelative(-360f, 280f)
                close()
                moveToRelative(0f, -202f)
                lineTo(120f, 360f)
                lineToRelative(360f, -280f)
                lineToRelative(360f, 280f)
                lineToRelative(-360f, 280f)
                close()
                moveToRelative(0f, -280f)
                close()
                moveToRelative(0f, 178f)
                lineToRelative(230f, -178f)
                lineToRelative(-230f, -178f)
                lineToRelative(-230f, 178f)
                lineToRelative(230f, 178f)
                close()
            }
        }.build()
        
        return _Layers!!
    }

private var _Layers: ImageVector? = null

