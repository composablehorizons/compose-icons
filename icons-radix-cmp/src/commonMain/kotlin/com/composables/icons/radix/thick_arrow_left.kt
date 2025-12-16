package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ThickArrowLeft: ImageVector
    get() {
        if (_ThickArrowLeft != null) return _ThickArrowLeft!!
        
        _ThickArrowLeft = ImageVector.Builder(
            name = "thick-arrow-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 7.49996f)
                curveTo(1f, 7.6614f, 1.07764f, 7.81333f, 1.20898f, 7.90719f)
                lineTo(8.20898f, 12.9072f)
                curveTo(8.36136f, 13.016f, 8.562f, 13.0299f, 8.72852f, 12.9443f)
                curveTo(8.89505f, 12.8586f, 9f, 12.6873f, 9f, 12.5f)
                lineTo(9f, 9.99996f)
                lineTo(11.5f, 9.99996f)
                curveTo(11.7761f, 9.99996f, 12f, 9.7761f, 12f, 9.49996f)
                lineTo(12f, 5.49996f)
                curveTo(12f, 5.22382f, 11.7761f, 4.99996f, 11.5f, 4.99996f)
                lineTo(9f, 4.99996f)
                lineTo(9f, 2.49996f)
                curveTo(9f, 2.31267f, 8.89505f, 2.14133f, 8.72852f, 2.05562f)
                curveTo(8.562f, 1.96999f, 8.36136f, 1.9839f, 8.20898f, 2.09273f)
                lineTo(1.20898f, 7.09273f)
                lineTo(1.12109f, 7.17379f)
                curveTo(1.04384f, 7.26354f, 1f, 7.37895f, 1f, 7.49996f)
                close()
                moveTo(8f, 3.47262f)
                lineTo(8f, 5.49996f)
                curveTo(8f, 5.7761f, 8.22386f, 5.99996f, 8.5f, 5.99996f)
                lineTo(11f, 5.99996f)
                lineTo(11f, 8.99996f)
                lineTo(8.5f, 8.99996f)
                curveTo(8.22386f, 8.99996f, 8f, 9.22382f, 8f, 9.49996f)
                lineTo(8f, 11.5273f)
                lineTo(2.36035f, 7.49996f)
                lineTo(8f, 3.47262f)
                close()
            }
        }.build()
        
        return _ThickArrowLeft!!
    }

private var _ThickArrowLeft: ImageVector? = null

