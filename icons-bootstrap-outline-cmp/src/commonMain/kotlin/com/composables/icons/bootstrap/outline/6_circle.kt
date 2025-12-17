package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.`6Circle`: ImageVector
    get() {
        if (_6Circle != null) return _6Circle!!
        
        _6Circle = ImageVector.Builder(
            name = "6-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
                moveToRelative(15f, 0f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(8.21f, 3.855f)
                curveToRelative(1.612f, 0f, 2.515f, 0.99f, 2.573f, 1.899f)
                horizontalLineTo(9.494f)
                curveToRelative(-0.1f, -0.358f, -0.51f, -0.815f, -1.312f, -0.815f)
                curveToRelative(-1.078f, 0f, -1.817f, 1.09f, -1.805f, 3.036f)
                horizontalLineToRelative(0.082f)
                curveToRelative(0.229f, -0.545f, 0.855f, -1.155f, 1.98f, -1.155f)
                curveToRelative(1.254f, 0f, 2.508f, 0.88f, 2.508f, 2.555f)
                curveToRelative(0f, 1.77f, -1.218f, 2.783f, -2.847f, 2.783f)
                curveToRelative(-0.932f, 0f, -1.84f, -0.328f, -2.409f, -1.254f)
                curveToRelative(-0.369f, -0.603f, -0.597f, -1.459f, -0.597f, -2.642f)
                curveToRelative(0f, -3.012f, 1.248f, -4.407f, 3.117f, -4.407f)
                close()
                moveToRelative(-0.099f, 4.008f)
                curveToRelative(-0.92f, 0f, -1.564f, 0.65f, -1.564f, 1.576f)
                curveToRelative(0f, 1.032f, 0.703f, 1.635f, 1.558f, 1.635f)
                curveToRelative(0.868f, 0f, 1.553f, -0.533f, 1.553f, -1.629f)
                curveToRelative(0f, -1.06f, -0.744f, -1.582f, -1.547f, -1.582f)
            }
        }.build()
        
        return _6Circle!!
    }

private var _6Circle: ImageVector? = null

