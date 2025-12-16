package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) return _StopCircle!!
        
        _StopCircle = ImageVector.Builder(
            name = "stop-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 5f)
                curveTo(5.44772f, 5f, 5f, 5.44772f, 5f, 6f)
                verticalLineTo(10f)
                curveTo(5f, 10.5523f, 5.44772f, 11f, 6f, 11f)
                horizontalLineTo(10f)
                curveTo(10.5523f, 11f, 11f, 10.5523f, 11f, 10f)
                verticalLineTo(6f)
                curveTo(11f, 5.44772f, 10.5523f, 5f, 10f, 5f)
                horizontalLineTo(6f)
                close()
                moveTo(1f, 8f)
                curveTo(1f, 4.13401f, 4.13401f, 1f, 8f, 1f)
                curveTo(11.866f, 1f, 15f, 4.13401f, 15f, 8f)
                curveTo(15f, 11.866f, 11.866f, 15f, 8f, 15f)
                curveTo(4.13401f, 15f, 1f, 11.866f, 1f, 8f)
                close()
                moveTo(8f, 2f)
                curveTo(4.68629f, 2f, 2f, 4.68629f, 2f, 8f)
                curveTo(2f, 11.3137f, 4.68629f, 14f, 8f, 14f)
                curveTo(11.3137f, 14f, 14f, 11.3137f, 14f, 8f)
                curveTo(14f, 4.68629f, 11.3137f, 2f, 8f, 2f)
                close()
            }
        }.build()
        
        return _StopCircle!!
    }

private var _StopCircle: ImageVector? = null

