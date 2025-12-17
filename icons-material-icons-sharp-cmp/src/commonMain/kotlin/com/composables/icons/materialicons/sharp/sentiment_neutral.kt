package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sentiment_neutral: ImageVector
    get() {
        if (_Sentiment_neutral != null) return _Sentiment_neutral!!
        
        _Sentiment_neutral = ImageVector.Builder(
            name = "sentiment_neutral",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11.99f, 2f)
                    curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                    reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                    curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                    reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                    close()
                    moveTo(7f, 9.5f)
                    curveTo(7f, 8.67f, 7.67f, 8f, 8.5f, 8f)
                    reflectiveCurveTo(10f, 8.67f, 10f, 9.5f)
                    reflectiveCurveTo(9.33f, 11f, 8.5f, 11f)
                    reflectiveCurveTo(7f, 10.33f, 7f, 9.5f)
                    close()
                    moveTo(15f, 15.5f)
                    horizontalLineTo(9f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(15.5f)
                    close()
                    moveTo(15.5f, 11f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveTo(14.67f, 8f, 15.5f, 8f)
                    reflectiveCurveTo(17f, 8.67f, 17f, 9.5f)
                    reflectiveCurveTo(16.33f, 11f, 15.5f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Sentiment_neutral!!
    }

private var _Sentiment_neutral: ImageVector? = null

