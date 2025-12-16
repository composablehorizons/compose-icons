package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ThickArrowRight: ImageVector
    get() {
        if (_ThickArrowRight != null) return _ThickArrowRight!!
        
        _ThickArrowRight = ImageVector.Builder(
            name = "thick-arrow-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 7.49996f)
                curveTo(14f, 7.6614f, 13.9224f, 7.81333f, 13.791f, 7.90719f)
                lineTo(6.79102f, 12.9072f)
                curveTo(6.63864f, 13.016f, 6.438f, 13.0299f, 6.27148f, 12.9443f)
                curveTo(6.10495f, 12.8586f, 6f, 12.6873f, 6f, 12.5f)
                lineTo(6f, 9.99996f)
                lineTo(3.5f, 9.99996f)
                curveTo(3.22386f, 9.99996f, 3f, 9.7761f, 3f, 9.49996f)
                lineTo(3f, 5.49996f)
                curveTo(3f, 5.22382f, 3.22386f, 4.99996f, 3.5f, 4.99996f)
                lineTo(6f, 4.99996f)
                lineTo(6f, 2.49996f)
                curveTo(6f, 2.31267f, 6.10495f, 2.14133f, 6.27148f, 2.05562f)
                curveTo(6.438f, 1.96999f, 6.63864f, 1.9839f, 6.79102f, 2.09273f)
                lineTo(13.791f, 7.09273f)
                lineTo(13.8789f, 7.17379f)
                curveTo(13.9562f, 7.26354f, 14f, 7.37895f, 14f, 7.49996f)
                close()
                moveTo(7f, 3.47262f)
                lineTo(7f, 5.49996f)
                curveTo(7f, 5.7761f, 6.77614f, 5.99996f, 6.5f, 5.99996f)
                lineTo(4f, 5.99996f)
                lineTo(4f, 8.99996f)
                lineTo(6.5f, 8.99996f)
                curveTo(6.77614f, 8.99996f, 7f, 9.22382f, 7f, 9.49996f)
                lineTo(7f, 11.5273f)
                lineTo(12.6396f, 7.49996f)
                lineTo(7f, 3.47262f)
                close()
            }
        }.build()
        
        return _ThickArrowRight!!
    }

private var _ThickArrowRight: ImageVector? = null

