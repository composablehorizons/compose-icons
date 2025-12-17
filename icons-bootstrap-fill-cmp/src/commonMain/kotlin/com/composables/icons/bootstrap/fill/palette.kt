package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Palette: ImageVector
    get() {
        if (_Palette != null) return _Palette!!
        
        _Palette = ImageVector.Builder(
            name = "palette",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.433f, 10.07f)
                curveTo(14.133f, 10.585f, 16f, 11.15f, 16f, 8f)
                arcToRelative(8f, 8f, 0f, true, false, -8f, 8f)
                curveToRelative(1.996f, 0f, 1.826f, -1.504f, 1.649f, -3.08f)
                curveToRelative(-0.124f, -1.101f, -0.252f, -2.237f, 0.351f, -2.92f)
                curveToRelative(0.465f, -0.527f, 1.42f, -0.237f, 2.433f, 0.07f)
                moveTo(8f, 5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                moveToRelative(4.5f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                moveTo(5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                moveToRelative(0.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
            }
        }.build()
        
        return _Palette!!
    }

private var _Palette: ImageVector? = null

