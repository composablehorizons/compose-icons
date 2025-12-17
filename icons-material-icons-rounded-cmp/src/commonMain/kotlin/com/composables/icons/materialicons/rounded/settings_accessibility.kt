package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_accessibility: ImageVector
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
                    moveTo(20.74f, 4.96f)
                    curveToRelative(-0.13f, -0.53f, -0.67f, -0.85f, -1.2f, -0.73f)
                    curveTo(17.16f, 4.77f, 14.49f, 5f, 12f, 5f)
                    reflectiveCurveTo(6.84f, 4.77f, 4.46f, 4.24f)
                    curveToRelative(-0.54f, -0.12f, -1.07f, 0.19f, -1.2f, 0.73f)
                    lineTo(3.24f, 5.02f)
                    curveTo(3.11f, 5.56f, 3.43f, 6.12f, 3.97f, 6.24f)
                    curveTo(5.59f, 6.61f, 7.34f, 6.86f, 9f, 7f)
                    verticalLineToRelative(11f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(5f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(7f)
                    curveToRelative(1.66f, -0.14f, 3.41f, -0.39f, 5.03f, -0.76f)
                    curveToRelative(0.54f, -0.12f, 0.86f, -0.68f, 0.73f, -1.22f)
                    lineTo(20.74f, 4.96f)
                    close()
                    moveTo(12f, 4f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    reflectiveCurveTo(10.9f, 4f, 12f, 4f)
                    close()
                    moveTo(8f, 24f)
                    lineTo(8f, 24f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(7f, 23.55f, 7.45f, 24f, 8f, 24f)
                    close()
                    moveTo(12f, 24f)
                    lineTo(12f, 24f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(11f, 23.55f, 11.45f, 24f, 12f, 24f)
                    close()
                    moveTo(16f, 24f)
                    lineTo(16f, 24f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(15f, 23.55f, 15.45f, 24f, 16f, 24f)
                    close()
                }
            }
        }.build()
        
        return _Settings_accessibility!!
    }

private var _Settings_accessibility: ImageVector? = null

