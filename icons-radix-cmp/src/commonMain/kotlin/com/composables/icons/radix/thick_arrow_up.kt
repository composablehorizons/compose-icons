package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ThickArrowUp: ImageVector
    get() {
        if (_ThickArrowUp != null) return _ThickArrowUp!!
        
        _ThickArrowUp = ImageVector.Builder(
            name = "thick-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49996f, 1f)
                curveTo(7.6614f, 1f, 7.81333f, 1.07764f, 7.90719f, 1.20898f)
                lineTo(12.9072f, 8.20898f)
                curveTo(13.016f, 8.36136f, 13.0299f, 8.562f, 12.9443f, 8.72852f)
                curveTo(12.8586f, 8.89505f, 12.6873f, 9f, 12.5f, 9f)
                horizontalLineTo(9.99996f)
                verticalLineTo(11.5f)
                curveTo(9.99996f, 11.7761f, 9.7761f, 12f, 9.49996f, 12f)
                horizontalLineTo(5.49996f)
                curveTo(5.22382f, 12f, 4.99996f, 11.7761f, 4.99996f, 11.5f)
                verticalLineTo(9f)
                horizontalLineTo(2.49996f)
                curveTo(2.31267f, 9f, 2.14133f, 8.89505f, 2.05563f, 8.72852f)
                curveTo(1.96999f, 8.562f, 1.9839f, 8.36136f, 2.09273f, 8.20898f)
                lineTo(7.09273f, 1.20898f)
                lineTo(7.17379f, 1.12109f)
                curveTo(7.26354f, 1.04384f, 7.37895f, 1f, 7.49996f, 1f)
                close()
                moveTo(3.47262f, 8f)
                horizontalLineTo(5.49996f)
                curveTo(5.7761f, 8f, 5.99996f, 8.22386f, 5.99996f, 8.5f)
                verticalLineTo(11f)
                horizontalLineTo(8.99996f)
                verticalLineTo(8.5f)
                curveTo(8.99996f, 8.22386f, 9.22382f, 8f, 9.49996f, 8f)
                horizontalLineTo(11.5273f)
                lineTo(7.49996f, 2.36035f)
                lineTo(3.47262f, 8f)
                close()
            }
        }.build()
        
        return _ThickArrowUp!!
    }

private var _ThickArrowUp: ImageVector? = null

