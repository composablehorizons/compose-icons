package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Settings_accessibility: ImageVector
    get() {
        if (_Settings_accessibility != null) return _Settings_accessibility!!
        
        _Settings_accessibility = ImageVector.Builder(
            name = "settings_accessibility",
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
                    moveTo(20.5f, 4f)
                    curveToRelative(-2.61f, 0.7f, -5.67f, 1f, -8.5f, 1f)
                    reflectiveCurveTo(6.11f, 4.7f, 3.5f, 4f)
                    lineTo(3f, 6f)
                    curveToRelative(1.86f, 0.5f, 4f, 0.83f, 6f, 1f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    curveToRelative(2f, -0.17f, 4.14f, -0.5f, 6f, -1f)
                    lineTo(20.5f, 4f)
                    close()
                    moveTo(12f, 4f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    reflectiveCurveTo(10.9f, 4f, 12f, 4f)
                    close()
                    moveTo(7f, 24f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(7f)
                    verticalLineTo(24f)
                    close()
                    moveTo(11f, 24f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(24f)
                    close()
                    moveTo(15f, 24f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(24f)
                    close()
                }
            }
        }.build()
        
        return _Settings_accessibility!!
    }

private var _Settings_accessibility: ImageVector? = null

