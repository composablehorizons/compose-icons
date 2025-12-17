package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Spade: ImageVector
    get() {
        if (_Spade != null) return _Spade!!
        
        _Spade = ImageVector.Builder(
            name = "spade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.327f, 2.26f)
                arcToRelative(1395.065f, 1395.065f, 0f, false, false, -4.923f, 4.504f)
                curveToRelative(-0.626f, 0.6f, -1.212f, 1.21f, -1.774f, 1.843f)
                arcToRelative(6.528f, 6.528f, 0f, false, false, -0.314f, 8.245f)
                lineToRelative(0.14f, 0.177f)
                curveToRelative(1.012f, 1.205f, 2.561f, 1.755f, 4.055f, 1.574f)
                lineToRelative(0.246f, -0.037f)
                lineToRelative(-0.706f, 2.118f)
                arcToRelative(1f, 1f, 0f, false, false, 0.949f, 1.316f)
                horizontalLineToRelative(6f)
                lineToRelative(0.118f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.83f, -1.31f)
                lineToRelative(-0.688f, -2.065f)
                lineToRelative(0.104f, 0.02f)
                curveToRelative(1.589f, 0.25f, 3.262f, -0.387f, 4.32f, -1.785f)
                arcToRelative(6.527f, 6.527f, 0f, false, false, -0.311f, -8.243f)
                arcToRelative(31.787f, 31.787f, 0f, false, false, -1.76f, -1.83f)
                lineToRelative(-4.938f, -4.518f)
                arcToRelative(1f, 1f, 0f, false, false, -1.348f, -0.001f)
                close()
            }
        }.build()
        
        return _Spade!!
    }

private var _Spade: ImageVector? = null

