package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`6Circle`: ImageVector
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
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(8.21f, 3.855f)
                curveToRelative(-1.868f, 0f, -3.116f, 1.395f, -3.116f, 4.407f)
                curveToRelative(0f, 1.183f, 0.228f, 2.039f, 0.597f, 2.642f)
                curveToRelative(0.569f, 0.926f, 1.477f, 1.254f, 2.409f, 1.254f)
                curveToRelative(1.629f, 0f, 2.847f, -1.013f, 2.847f, -2.783f)
                curveToRelative(0f, -1.676f, -1.254f, -2.555f, -2.508f, -2.555f)
                curveToRelative(-1.125f, 0f, -1.752f, 0.61f, -1.98f, 1.155f)
                horizontalLineToRelative(-0.082f)
                curveToRelative(-0.012f, -1.946f, 0.727f, -3.036f, 1.805f, -3.036f)
                curveToRelative(0.802f, 0f, 1.213f, 0.457f, 1.312f, 0.815f)
                horizontalLineToRelative(1.29f)
                curveToRelative(-0.06f, -0.908f, -0.962f, -1.899f, -2.573f, -1.899f)
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

