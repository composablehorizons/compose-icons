package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Layers_clear: ImageVector
    get() {
        if (_Layers_clear != null) return _Layers_clear!!
        
        _Layers_clear = ImageVector.Builder(
            name = "layers_clear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(644f, 512f)
                lineTo(330f, 196f)
                lineToRelative(150f, -116f)
                lineToRelative(360f, 280f)
                lineToRelative(-196f, 152f)
                close()
                moveToRelative(115f, 114f)
                lineToRelative(-58f, -58f)
                lineToRelative(73f, -56f)
                lineToRelative(66f, 50f)
                lineToRelative(-81f, 64f)
                close()
                moveToRelative(33f, 258f)
                lineTo(632f, 724f)
                lineTo(480f, 842f)
                lineTo(120f, 562f)
                lineToRelative(66f, -50f)
                lineToRelative(294f, 228f)
                lineToRelative(94f, -73f)
                lineToRelative(-57f, -56f)
                lineToRelative(-37f, 29f)
                lineToRelative(-360f, -280f)
                lineToRelative(83f, -65f)
                lineTo(55f, 149f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Layers_clear!!
    }

private var _Layers_clear: ImageVector? = null

