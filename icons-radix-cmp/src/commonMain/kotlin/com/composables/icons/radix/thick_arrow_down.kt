package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ThickArrowDown: ImageVector
    get() {
        if (_ThickArrowDown != null) return _ThickArrowDown!!
        
        _ThickArrowDown = ImageVector.Builder(
            name = "thick-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.60055f, 3.00977f)
                curveTo(9.82851f, 3.05629f, 9.99996f, 3.25829f, 9.99996f, 3.5f)
                verticalLineTo(6f)
                horizontalLineTo(12.5f)
                curveTo(12.6873f, 6f, 12.8586f, 6.10495f, 12.9443f, 6.27148f)
                curveTo(13.0299f, 6.438f, 13.016f, 6.63864f, 12.9072f, 6.79102f)
                lineTo(7.90719f, 13.791f)
                curveTo(7.81333f, 13.9224f, 7.6614f, 14f, 7.49996f, 14f)
                curveTo(7.33852f, 14f, 7.18659f, 13.9224f, 7.09273f, 13.791f)
                lineTo(2.09273f, 6.79102f)
                curveTo(1.9839f, 6.63864f, 1.96999f, 6.438f, 2.05563f, 6.27148f)
                curveTo(2.14133f, 6.10495f, 2.31267f, 6f, 2.49996f, 6f)
                horizontalLineTo(4.99996f)
                verticalLineTo(3.5f)
                lineTo(5.00973f, 3.39941f)
                curveTo(5.05625f, 3.17145f, 5.25825f, 3f, 5.49996f, 3f)
                horizontalLineTo(9.49996f)
                lineTo(9.60055f, 3.00977f)
                close()
                moveTo(5.99996f, 6.5f)
                curveTo(5.99996f, 6.77614f, 5.7761f, 7f, 5.49996f, 7f)
                horizontalLineTo(3.47262f)
                lineTo(7.49996f, 12.6387f)
                lineTo(11.5273f, 7f)
                horizontalLineTo(9.49996f)
                curveTo(9.22382f, 7f, 8.99996f, 6.77614f, 8.99996f, 6.5f)
                verticalLineTo(4f)
                horizontalLineTo(5.99996f)
                verticalLineTo(6.5f)
                close()
            }
        }.build()
        
        return _ThickArrowDown!!
    }

private var _ThickArrowDown: ImageVector? = null

