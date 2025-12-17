package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Shift: ImageVector
    get() {
        if (_Shift != null) return _Shift!!
        
        _Shift = ImageVector.Builder(
            name = "shift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.27f, 2.047f)
                arcToRelative(1f, 1f, 0f, false, true, 1.46f, 0f)
                lineToRelative(6.345f, 6.77f)
                curveToRelative(0.6f, 0.638f, 0.146f, 1.683f, -0.73f, 1.683f)
                horizontalLineTo(11.5f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineTo(1.654f)
                curveTo(0.78f, 10.5f, 0.326f, 9.455f, 0.924f, 8.816f)
                close()
            }
        }.build()
        
        return _Shift!!
    }

private var _Shift: ImageVector? = null

