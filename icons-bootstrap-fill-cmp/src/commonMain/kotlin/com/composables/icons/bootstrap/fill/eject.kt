package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Eject: ImageVector
    get() {
        if (_Eject != null) return _Eject!!
        
        _Eject = ImageVector.Builder(
            name = "eject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.27f, 1.047f)
                arcToRelative(1f, 1f, 0f, false, true, 1.46f, 0f)
                lineToRelative(6.345f, 6.77f)
                curveToRelative(0.6f, 0.638f, 0.146f, 1.683f, -0.73f, 1.683f)
                horizontalLineTo(1.656f)
                curveTo(0.78f, 9.5f, 0.326f, 8.455f, 0.926f, 7.816f)
                close()
                moveTo(0.5f, 11.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(13f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-13f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
        }.build()
        
        return _Eject!!
    }

private var _Eject: ImageVector? = null

