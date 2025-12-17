package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Puzzle: ImageVector
    get() {
        if (_Puzzle != null) return _Puzzle!!
        
        _Puzzle = ImageVector.Builder(
            name = "puzzle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.112f, 3.645f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.605f, 2f)
                horizontalLineTo(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.382f)
                curveToRelative(0f, 0.696f, -0.497f, 1.182f, -0.872f, 1.469f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.115f, 0.118f)
                lineToRelative(-0.012f, 0.025f)
                lineTo(6.5f, 4.5f)
                verticalLineToRelative(0.003f)
                lineToRelative(0.003f, 0.01f)
                quadToRelative(0.005f, 0.015f, 0.036f, 0.053f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.27f, 0.194f)
                curveTo(7.09f, 4.9f, 7.51f, 5f, 8f, 5f)
                curveToRelative(0.492f, 0f, 0.912f, -0.1f, 1.19f, -0.24f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.271f, -0.194f)
                arcToRelative(0.2f, 0.2f, 0f, false, false, 0.036f, -0.054f)
                lineToRelative(0.003f, -0.01f)
                verticalLineToRelative(-0.008f)
                lineToRelative(-0.012f, -0.025f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.115f, -0.118f)
                curveToRelative(-0.375f, -0.287f, -0.872f, -0.773f, -0.872f, -1.469f)
                verticalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 2f)
                horizontalLineToRelative(2.395f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.493f, 1.645f)
                lineTo(12.645f, 6.5f)
                horizontalLineToRelative(0.237f)
                curveToRelative(0.195f, 0f, 0.42f, -0.147f, 0.675f, -0.48f)
                curveToRelative(0.21f, -0.274f, 0.528f, -0.52f, 0.943f, -0.52f)
                curveToRelative(0.568f, 0f, 0.947f, 0.447f, 1.154f, 0.862f)
                curveTo(15.877f, 6.807f, 16f, 7.387f, 16f, 8f)
                reflectiveCurveToRelative(-0.123f, 1.193f, -0.346f, 1.638f)
                curveToRelative(-0.207f, 0.415f, -0.586f, 0.862f, -1.154f, 0.862f)
                curveToRelative(-0.415f, 0f, -0.733f, -0.246f, -0.943f, -0.52f)
                curveToRelative(-0.255f, -0.333f, -0.48f, -0.48f, -0.675f, -0.48f)
                horizontalLineToRelative(-0.237f)
                lineToRelative(0.243f, 2.855f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11.395f, 14f)
                horizontalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-0.382f)
                curveToRelative(0f, -0.696f, 0.497f, -1.182f, 0.872f, -1.469f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.115f, -0.118f)
                lineToRelative(0.012f, -0.025f)
                lineToRelative(0.001f, -0.006f)
                verticalLineToRelative(-0.003f)
                lineToRelative(-0.003f, -0.01f)
                arcToRelative(0.2f, 0.2f, 0f, false, false, -0.036f, -0.053f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, -0.27f, -0.194f)
                curveTo(8.91f, 11.1f, 8.49f, 11f, 8f, 11f)
                reflectiveCurveToRelative(-0.912f, 0.1f, -1.19f, 0.24f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, -0.271f, 0.194f)
                arcToRelative(0.2f, 0.2f, 0f, false, false, -0.036f, 0.054f)
                lineToRelative(-0.003f, 0.01f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.001f, 0.006f)
                lineToRelative(0.012f, 0.025f)
                curveToRelative(0.016f, 0.027f, 0.05f, 0.068f, 0.115f, 0.118f)
                curveToRelative(0.375f, 0.287f, 0.872f, 0.773f, 0.872f, 1.469f)
                verticalLineToRelative(0.382f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(4.605f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.493f, -1.645f)
                lineTo(3.356f, 9.5f)
                horizontalLineToRelative(-0.238f)
                curveToRelative(-0.195f, 0f, -0.42f, 0.147f, -0.675f, 0.48f)
                curveToRelative(-0.21f, 0.274f, -0.528f, 0.52f, -0.943f, 0.52f)
                curveToRelative(-0.568f, 0f, -0.947f, -0.447f, -1.154f, -0.862f)
                curveTo(0.123f, 9.193f, 0f, 8.613f, 0f, 8f)
                reflectiveCurveToRelative(0.123f, -1.193f, 0.346f, -1.638f)
                curveTo(0.553f, 5.947f, 0.932f, 5.5f, 1.5f, 5.5f)
                curveToRelative(0.415f, 0f, 0.733f, 0.246f, 0.943f, 0.52f)
                curveToRelative(0.255f, 0.333f, 0.48f, 0.48f, 0.675f, 0.48f)
                horizontalLineToRelative(0.238f)
                close()
            }
        }.build()
        
        return _Puzzle!!
    }

private var _Puzzle: ImageVector? = null

