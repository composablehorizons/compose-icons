package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CodesandboxLogo: ImageVector
    get() {
        if (_CodesandboxLogo != null) return _CodesandboxLogo!!
        
        _CodesandboxLogo = ImageVector.Builder(
            name = "codesandbox-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.71144f, 0.796908f)
                curveTo(7.57742f, 0.734364f, 7.42258f, 0.734364f, 7.28856f, 0.796908f)
                lineTo(1.28856f, 3.59691f)
                curveTo(1.11252f, 3.67906f, 1f, 3.85574f, 1f, 4.05f)
                verticalLineTo(10.95f)
                curveTo(1f, 11.1443f, 1.11252f, 11.3209f, 1.28856f, 11.4031f)
                lineTo(7.28856f, 14.2031f)
                curveTo(7.42258f, 14.2656f, 7.57742f, 14.2656f, 7.71144f, 14.2031f)
                lineTo(13.7114f, 11.4031f)
                curveTo(13.8875f, 11.3209f, 14f, 11.1443f, 14f, 10.95f)
                verticalLineTo(4.05f)
                curveTo(14f, 3.85574f, 13.8875f, 3.67906f, 13.7114f, 3.59691f)
                lineTo(7.71144f, 0.796908f)
                close()
                moveTo(7.5f, 3.15674f)
                lineTo(5.9804f, 2.51091f)
                lineTo(7.5f, 1.80176f)
                lineTo(9.0196f, 2.51091f)
                lineTo(7.5f, 3.15674f)
                close()
                moveTo(7.69557f, 4.16019f)
                lineTo(10.2382f, 3.07958f)
                lineTo(12.2719f, 4.02866f)
                lineTo(7.5f, 6.05672f)
                lineTo(2.72809f, 4.02866f)
                lineTo(4.76182f, 3.07958f)
                lineTo(7.30443f, 4.16019f)
                curveTo(7.4294f, 4.2133f, 7.5706f, 4.2133f, 7.69557f, 4.16019f)
                close()
                moveTo(8f, 6.93078f)
                lineTo(13f, 4.80578f)
                verticalLineTo(7.92967f)
                lineTo(11.0821f, 8.8119f)
                curveTo(10.7273f, 8.9751f, 10.5f, 9.32988f, 10.5f, 9.72039f)
                verticalLineTo(11.7982f)
                lineTo(8f, 12.9649f)
                verticalLineTo(6.93078f)
                close()
                moveTo(11.5f, 11.3316f)
                lineTo(13f, 10.6316f)
                verticalLineTo(9.03039f)
                lineTo(11.5f, 9.72039f)
                verticalLineTo(11.3316f)
                close()
                moveTo(7f, 6.93078f)
                verticalLineTo(12.9649f)
                lineTo(4.50232f, 11.7993f)
                verticalLineTo(9.72036f)
                curveTo(4.50232f, 9.32985f, 4.275f, 8.97507f, 3.92022f, 8.81187f)
                lineTo(2f, 7.92857f)
                verticalLineTo(4.80578f)
                lineTo(7f, 6.93078f)
                close()
                moveTo(2f, 10.6316f)
                lineTo(3.50232f, 11.3327f)
                lineTo(3.50232f, 9.72036f)
                lineTo(2f, 9.0293f)
                verticalLineTo(10.6316f)
                close()
            }
        }.build()
        
        return _CodesandboxLogo!!
    }

private var _CodesandboxLogo: ImageVector? = null

