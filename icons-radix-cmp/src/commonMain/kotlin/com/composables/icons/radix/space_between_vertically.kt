package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.SpaceBetweenVertically: ImageVector
    get() {
        if (_SpaceBetweenVertically != null) return _SpaceBetweenVertically!!
        
        _SpaceBetweenVertically = ImageVector.Builder(
            name = "space-between-vertically",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.4999f, 14f)
                curveTo(13.776f, 14f, 13.9999f, 14.2239f, 13.9999f, 14.5f)
                curveTo(13.9999f, 14.7761f, 13.776f, 15f, 13.4999f, 15f)
                horizontalLineTo(1.49988f)
                curveTo(1.22373f, 15f, 0.999877f, 14.7761f, 0.999877f, 14.5f)
                curveTo(0.999877f, 14.2239f, 1.22373f, 14f, 1.49988f, 14f)
                horizontalLineTo(5.99987f)
                verticalLineTo(10f)
                curveTo(5.99987f, 9.44776f, 6.44764f, 9.00007f, 6.99987f, 9.00001f)
                horizontalLineTo(7.99987f)
                curveTo(8.55215f, 9.00001f, 8.99987f, 9.44772f, 8.99987f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(13.4999f)
                close()
                moveTo(13.4999f, 1.52588E-5f)
                curveTo(13.776f, 1.5452E-5f, 13.9999f, 0.223873f, 13.9999f, 0.500015f)
                curveTo(13.9999f, 0.776157f, 13.776f, 1.00001f, 13.4999f, 1.00001f)
                horizontalLineTo(8.99987f)
                verticalLineTo(5.00001f)
                curveTo(8.99987f, 5.55229f, 8.55215f, 6.00001f, 7.99987f, 6.00001f)
                horizontalLineTo(6.99987f)
                curveTo(6.44764f, 5.99994f, 5.99987f, 5.55225f, 5.99987f, 5.00001f)
                verticalLineTo(1.00001f)
                horizontalLineTo(1.49988f)
                curveTo(1.22373f, 1.00001f, 0.999877f, 0.776157f, 0.999877f, 0.500015f)
                curveTo(0.999877f, 0.223873f, 1.22373f, 1.52688E-5f, 1.49988f, 1.52588E-5f)
                horizontalLineTo(13.4999f)
                close()
            }
        }.build()
        
        return _SpaceBetweenVertically!!
    }

private var _SpaceBetweenVertically: ImageVector? = null

