package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SplitVertical: ImageVector
    get() {
        if (_SplitVertical != null) return _SplitVertical!!
        
        _SplitVertical = ImageVector.Builder(
            name = "split-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.999999f, 3.5f)
                lineTo(1f, 12.5f)
                curveTo(1f, 13.878f, 2.122f, 15f, 3.5f, 15f)
                lineTo(12.5f, 15f)
                curveTo(13.878f, 15f, 15f, 13.878f, 15f, 12.5f)
                lineTo(15f, 3.5f)
                curveTo(15f, 2.122f, 13.878f, 0.999999f, 12.5f, 0.999999f)
                lineTo(3.5f, 1f)
                curveTo(2.122f, 1f, 0.999999f, 2.122f, 0.999999f, 3.5f)
                close()
                moveTo(12.5f, 14f)
                lineTo(3.5f, 14f)
                curveTo(2.673f, 14f, 2f, 13.327f, 2f, 12.5f)
                lineTo(2f, 8.5f)
                lineTo(14f, 8.5f)
                lineTo(14f, 12.5f)
                curveTo(14f, 13.327f, 13.327f, 14f, 12.5f, 14f)
                close()
                moveTo(12.5f, 2f)
                curveTo(13.327f, 2f, 14f, 2.673f, 14f, 3.5f)
                lineTo(14f, 7.5f)
                lineTo(2f, 7.5f)
                lineTo(2f, 3.5f)
                curveTo(2f, 2.673f, 2.673f, 2f, 3.5f, 2f)
                lineTo(12.5f, 2f)
                close()
            }
        }.build()
        
        return _SplitVertical!!
    }

private var _SplitVertical: ImageVector? = null

