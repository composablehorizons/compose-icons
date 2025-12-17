package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sports_gymnastics: ImageVector
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
                    moveTo(1f, 9f)
                    horizontalLineToRelative(6f)
                    lineToRelative(7f, -5f)
                    lineToRelative(1.31f, 1.52f)
                    lineTo(11.14f, 8.5f)
                    horizontalLineTo(14f)
                    lineTo(21.8f, 4f)
                    lineTo(23f, 5.4f)
                    lineTo(14.5f, 12f)
                    lineTo(14f, 22f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(-0.5f, -10f)
                    lineTo(8f, 11f)
                    horizontalLineTo(1f)
                    verticalLineTo(9f)
                    close()
                }
            }
        }.build()
        
        return _Sports_gymnastics!!
    }

private var _Sports_gymnastics: ImageVector? = null

