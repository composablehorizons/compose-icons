package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChessKnight: ImageVector
    get() {
        if (_ChessKnight != null) return _ChessKnight!!
        
        _ChessKnight = ImageVector.Builder(
            name = "chess-knight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.959f, 1.99f)
                lineToRelative(-0.147f, 0.028f)
                lineToRelative(-0.115f, 0.029f)
                arcToRelative(1f, 1f, 0f, false, false, -0.646f, 1.27f)
                lineToRelative(0.749f, 2.245f)
                lineToRelative(-2.815f, 1.735f)
                arcToRelative(2f, 2f, 0f, false, false, -0.655f, 2.751f)
                lineToRelative(0.089f, 0.133f)
                arcToRelative(2f, 2f, 0f, false, false, 1.614f, 0.819f)
                lineToRelative(1.563f, -0.001f)
                lineToRelative(-1.614f, 4.674f)
                arcToRelative(1f, 1f, 0f, false, false, 0.945f, 1.327f)
                horizontalLineToRelative(7.961f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -0.978f)
                lineToRelative(0.112f, -5f)
                curveToRelative(0f, -3.827f, -1.555f, -6.878f, -4.67f, -7.966f)
                lineToRelative(-2.399f, -0.83f)
                lineToRelative(-0.375f, -0.121f)
                lineToRelative(-0.258f, -0.074f)
                lineToRelative(-0.135f, -0.031f)
                lineToRelative(-0.101f, -0.013f)
                lineToRelative(-0.055f, -0.001f)
                lineToRelative(-0.048f, 0.003f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 18f)
                horizontalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 1.987f, -1.768f)
                lineToRelative(0.011f, -0.174f)
                arcToRelative(1f, 1f, 0f, false, false, -0.998f, -1.058f)
                close()
            }
        }.build()
        
        return _ChessKnight!!
    }

private var _ChessKnight: ImageVector? = null

