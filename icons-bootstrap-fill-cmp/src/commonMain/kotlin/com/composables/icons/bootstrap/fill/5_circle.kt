package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`5Circle`: ImageVector
    get() {
        if (_5Circle != null) return _5Circle!!
        
        _5Circle = ImageVector.Builder(
            name = "5-circle",
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
                moveToRelative(-8.006f, 4.158f)
                curveToRelative(1.74f, 0f, 2.924f, -1.119f, 2.924f, -2.806f)
                curveToRelative(0f, -1.641f, -1.178f, -2.584f, -2.56f, -2.584f)
                curveToRelative(-0.897f, 0f, -1.442f, 0.421f, -1.612f, 0.68f)
                horizontalLineToRelative(-0.064f)
                lineToRelative(0.193f, -2.344f)
                horizontalLineToRelative(3.621f)
                verticalLineTo(4.002f)
                horizontalLineTo(5.791f)
                lineTo(5.445f, 8.63f)
                horizontalLineToRelative(1.149f)
                curveToRelative(0.193f, -0.358f, 0.668f, -0.809f, 1.435f, -0.809f)
                curveToRelative(0.85f, 0f, 1.582f, 0.604f, 1.582f, 1.57f)
                curveToRelative(0f, 1.085f, -0.779f, 1.682f, -1.57f, 1.682f)
                curveToRelative(-0.697f, 0f, -1.389f, -0.31f, -1.53f, -1.031f)
                horizontalLineTo(5.276f)
                curveToRelative(0.065f, 1.213f, 1.149f, 2.115f, 2.72f, 2.115f)
                close()
            }
        }.build()
        
        return _5Circle!!
    }

private var _5Circle: ImageVector? = null

