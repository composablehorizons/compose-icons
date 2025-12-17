package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Layers: ImageVector
    get() {
        if (_Layers != null) return _Layers!!
        
        _Layers = ImageVector.Builder(
            name = "layers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.765f, 1.559f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.47f, 0f)
                lineToRelative(7.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.882f)
                lineToRelative(-7.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.47f, 0f)
                lineToRelative(-7.5f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.882f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.125f, 8.567f)
                lineToRelative(-1.86f, 0.992f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.882f)
                lineToRelative(7.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.47f, 0f)
                lineToRelative(7.5f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.882f)
                lineToRelative(-1.86f, -0.992f)
                lineToRelative(-5.17f, 2.756f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.41f, 0f)
                close()
            }
        }.build()
        
        return _Layers!!
    }

private var _Layers: ImageVector? = null

