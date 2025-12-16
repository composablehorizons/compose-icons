package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.235f, 2.076f)
                curveTo(5.38271f, 1.98368f, 5.56781f, 1.97489f, 5.72361f, 2.05279f)
                lineTo(10.4728f, 4.42738f)
                lineTo(14.235f, 2.076f)
                curveTo(14.3891f, 1.97967f, 14.5834f, 1.97457f, 14.7424f, 2.06268f)
                curveTo(14.9014f, 2.15079f, 15f, 2.31824f, 15f, 2.5f)
                verticalLineTo(11f)
                curveTo(15f, 11.1724f, 14.9112f, 11.3326f, 14.765f, 11.424f)
                lineTo(10.765f, 13.924f)
                curveTo(10.6173f, 14.0163f, 10.4322f, 14.0251f, 10.2764f, 13.9472f)
                lineTo(5.52721f, 11.5726f)
                lineTo(1.765f, 13.924f)
                curveTo(1.61087f, 14.0203f, 1.41659f, 14.0254f, 1.25762f, 13.9373f)
                curveTo(1.09864f, 13.8492f, 1f, 13.6818f, 1f, 13.5f)
                verticalLineTo(5f)
                curveTo(1f, 4.82761f, 1.08881f, 4.66737f, 1.235f, 4.576f)
                lineTo(5.235f, 2.076f)
                close()
                moveTo(6f, 10.691f)
                lineTo(10f, 12.691f)
                verticalLineTo(5.30902f)
                lineTo(6f, 3.30902f)
                verticalLineTo(10.691f)
                close()
                moveTo(5f, 3.40212f)
                lineTo(2f, 5.27712f)
                verticalLineTo(12.5979f)
                lineTo(5f, 10.7229f)
                verticalLineTo(3.40212f)
                close()
                moveTo(11f, 5.27712f)
                verticalLineTo(12.5979f)
                lineTo(14f, 10.7229f)
                verticalLineTo(3.40212f)
                lineTo(11f, 5.27712f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

