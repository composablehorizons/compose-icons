package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Emoji_emotions: ImageVector
    get() {
        if (_Emoji_emotions != null) return _Emoji_emotions!!
        
        _Emoji_emotions = ImageVector.Builder(
            name = "emoji_emotions",
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
                group {
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11.99f, 2f)
                    curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.47f, 10f, 9.99f, 10f)
                    curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                    curveTo(22f, 6.48f, 17.52f, 2f, 11.99f, 2f)
                    close()
                    moveTo(8.5f, 8f)
                    curveTo(9.33f, 8f, 10f, 8.67f, 10f, 9.5f)
                    reflectiveCurveTo(9.33f, 11f, 8.5f, 11f)
                    reflectiveCurveTo(7f, 10.33f, 7f, 9.5f)
                    reflectiveCurveTo(7.67f, 8f, 8.5f, 8f)
                    close()
                    moveTo(16.71f, 14.72f)
                    curveTo(15.8f, 16.67f, 14.04f, 18f, 12f, 18f)
                    reflectiveCurveToRelative(-3.8f, -1.33f, -4.71f, -3.28f)
                    curveTo(7.13f, 14.39f, 7.37f, 14f, 7.74f, 14f)
                    horizontalLineToRelative(8.52f)
                    curveTo(16.63f, 14f, 16.87f, 14.39f, 16.71f, 14.72f)
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
        
        return _Emoji_emotions!!
    }

private var _Emoji_emotions: ImageVector? = null

