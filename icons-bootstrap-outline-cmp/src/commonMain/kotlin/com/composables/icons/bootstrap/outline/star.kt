package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Star: ImageVector
    get() {
        if (_Star != null) return _Star!!
        
        _Star = ImageVector.Builder(
            name = "star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.866f, 14.85f)
                curveToRelative(-0.078f, 0.444f, 0.36f, 0.791f, 0.746f, 0.593f)
                lineToRelative(4.39f, -2.256f)
                lineToRelative(4.389f, 2.256f)
                curveToRelative(0.386f, 0.198f, 0.824f, -0.149f, 0.746f, -0.592f)
                lineToRelative(-0.83f, -4.73f)
                lineToRelative(3.522f, -3.356f)
                curveToRelative(0.33f, -0.314f, 0.16f, -0.888f, -0.282f, -0.95f)
                lineToRelative(-4.898f, -0.696f)
                lineTo(8.465f, 0.792f)
                arcToRelative(0.513f, 0.513f, 0f, false, false, -0.927f, 0f)
                lineTo(5.354f, 5.12f)
                lineToRelative(-4.898f, 0.696f)
                curveToRelative(-0.441f, 0.062f, -0.612f, 0.636f, -0.283f, 0.95f)
                lineToRelative(3.523f, 3.356f)
                lineToRelative(-0.83f, 4.73f)
                close()
                moveToRelative(4.905f, -2.767f)
                lineToRelative(-3.686f, 1.894f)
                lineToRelative(0.694f, -3.957f)
                arcToRelative(0.56f, 0.56f, 0f, false, false, -0.163f, -0.505f)
                lineTo(1.71f, 6.745f)
                lineToRelative(4.052f, -0.576f)
                arcToRelative(0.53f, 0.53f, 0f, false, false, 0.393f, -0.288f)
                lineTo(8f, 2.223f)
                lineToRelative(1.847f, 3.658f)
                arcToRelative(0.53f, 0.53f, 0f, false, false, 0.393f, 0.288f)
                lineToRelative(4.052f, 0.575f)
                lineToRelative(-2.906f, 2.77f)
                arcToRelative(0.56f, 0.56f, 0f, false, false, -0.163f, 0.506f)
                lineToRelative(0.694f, 3.957f)
                lineToRelative(-3.686f, -1.894f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.461f, 0f)
                close()
            }
        }.build()
        
        return _Star!!
    }

private var _Star: ImageVector? = null

