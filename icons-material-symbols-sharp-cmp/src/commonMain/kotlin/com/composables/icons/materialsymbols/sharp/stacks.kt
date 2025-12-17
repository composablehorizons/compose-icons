package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stacks: ImageVector
    get() {
        if (_Stacks != null) return _Stacks!!
        
        _Stacks = ImageVector.Builder(
            name = "stacks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 560f)
                lineTo(40f, 320f)
                lineToRelative(440f, -240f)
                lineToRelative(440f, 240f)
                lineToRelative(-440f, 240f)
                close()
                moveToRelative(0f, 160f)
                lineTo(63f, 493f)
                lineToRelative(84f, -46f)
                lineToRelative(333f, 182f)
                lineToRelative(333f, -182f)
                lineToRelative(84f, 46f)
                lineToRelative(-417f, 227f)
                close()
                moveToRelative(0f, 160f)
                lineTo(63f, 653f)
                lineToRelative(84f, -46f)
                lineToRelative(333f, 182f)
                lineToRelative(333f, -182f)
                lineToRelative(84f, 46f)
                lineTo(480f, 880f)
                close()
                moveToRelative(0f, -411f)
                lineToRelative(273f, -149f)
                lineToRelative(-273f, -149f)
                lineToRelative(-273f, 149f)
                lineToRelative(273f, 149f)
                close()
                moveToRelative(0f, -149f)
                close()
            }
        }.build()
        
        return _Stacks!!
    }

private var _Stacks: ImageVector? = null

