package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sports_gymnastics: ImageVector
    get() {
        if (_Sports_gymnastics != null) return _Sports_gymnastics!!
        
        _Sports_gymnastics = ImageVector.Builder(
            name = "sports_gymnastics",
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
                    moveTo(4f, 6f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    reflectiveCurveTo(7.1f, 8f, 6f, 8f)
                    reflectiveCurveTo(4f, 7.1f, 4f, 6f)
                    close()
                    moveTo(13f, 22f)
                    curveToRelative(-0.56f, 0f, -1.02f, -0.44f, -1.05f, -1f)
                    lineToRelative(-0.45f, -9f)
                    lineTo(8f, 11f)
                    horizontalLineTo(2f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(5f)
                    lineToRelative(6.26f, -4.47f)
                    curveToRelative(0.42f, -0.3f, 1f, -0.23f, 1.34f, 0.16f)
                    curveToRelative(0.38f, 0.45f, 0.3f, 1.12f, -0.18f, 1.46f)
                    lineTo(11.14f, 8.5f)
                    horizontalLineTo(14f)
                    lineToRelative(7.09f, -4.09f)
                    curveToRelative(0.41f, -0.24f, 0.93f, -0.15f, 1.24f, 0.21f)
                    curveToRelative(0.36f, 0.43f, 0.3f, 1.07f, -0.14f, 1.41f)
                    lineTo(14.5f, 12f)
                    lineToRelative(-0.45f, 9f)
                    curveTo(14.02f, 21.56f, 13.56f, 22f, 13f, 22f)
                    close()
                }
            }
        }.build()
        
        return _Sports_gymnastics!!
    }

private var _Sports_gymnastics: ImageVector? = null

