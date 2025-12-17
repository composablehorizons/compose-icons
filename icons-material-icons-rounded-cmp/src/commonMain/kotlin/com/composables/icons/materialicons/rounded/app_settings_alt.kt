package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.App_settings_alt: ImageVector
    get() {
        if (_App_settings_alt != null) return _App_settings_alt!!
        
        _App_settings_alt = ImageVector.Builder(
            name = "app_settings_alt",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 18f)
                    horizontalLineTo(7f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    lineTo(7f, 1.01f)
                    curveTo(5.9f, 1.01f, 5f, 1.9f, 5f, 3f)
                    verticalLineToRelative(18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(10f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(18f)
                    close()
                    moveTo(21f, 12f)
                    curveToRelative(0f, -0.13f, -0.02f, -0.26f, -0.04f, -0.39f)
                    lineToRelative(0.64f, -0.48f)
                    curveToRelative(0.2f, -0.15f, 0.26f, -0.44f, 0.13f, -0.66f)
                    lineToRelative(-0.57f, -0.96f)
                    curveToRelative(-0.13f, -0.21f, -0.39f, -0.3f, -0.62f, -0.2f)
                    lineToRelative(-0.72f, 0.3f)
                    curveToRelative(-0.2f, -0.15f, -0.42f, -0.29f, -0.65f, -0.39f)
                    lineToRelative(-0.1f, -0.77f)
                    curveToRelative(-0.03f, -0.25f, -0.24f, -0.43f, -0.49f, -0.44f)
                    lineToRelative(-1.12f, -0.02f)
                    curveToRelative(-0.26f, 0f, -0.47f, 0.18f, -0.5f, 0.44f)
                    lineToRelative(-0.1f, 0.79f)
                    curveToRelative(-0.24f, 0.1f, -0.45f, 0.23f, -0.65f, 0.39f)
                    lineToRelative(-0.72f, -0.3f)
                    curveToRelative(-0.23f, -0.1f, -0.5f, -0.01f, -0.62f, 0.2f)
                    lineToRelative(-0.57f, 0.96f)
                    curveToRelative(-0.13f, 0.22f, -0.08f, 0.5f, 0.13f, 0.66f)
                    lineToRelative(0.64f, 0.48f)
                    curveTo(15.02f, 11.74f, 15f, 11.87f, 15f, 12f)
                    curveToRelative(0f, 0.13f, 0.02f, 0.25f, 0.04f, 0.37f)
                    lineToRelative(-0.64f, 0.49f)
                    curveToRelative(-0.2f, 0.15f, -0.26f, 0.43f, -0.13f, 0.65f)
                    lineToRelative(0.56f, 0.97f)
                    curveToRelative(0.13f, 0.22f, 0.39f, 0.31f, 0.63f, 0.21f)
                    lineToRelative(0.73f, -0.31f)
                    curveToRelative(0.2f, 0.16f, 0.42f, 0.3f, 0.67f, 0.4f)
                    lineToRelative(0.1f, 0.77f)
                    curveToRelative(0.03f, 0.25f, 0.24f, 0.44f, 0.5f, 0.44f)
                    horizontalLineToRelative(1.12f)
                    curveToRelative(0.25f, 0f, 0.46f, -0.19f, 0.5f, -0.44f)
                    lineToRelative(0.1f, -0.77f)
                    curveToRelative(0.24f, -0.1f, 0.46f, -0.24f, 0.67f, -0.4f)
                    lineToRelative(0.73f, 0.31f)
                    curveToRelative(0.23f, 0.1f, 0.5f, 0.01f, 0.63f, -0.21f)
                    lineToRelative(0.56f, -0.97f)
                    curveToRelative(0.13f, -0.22f, 0.07f, -0.5f, -0.13f, -0.65f)
                    lineToRelative(-0.64f, -0.49f)
                    curveTo(20.98f, 12.25f, 21f, 12.13f, 21f, 12f)
                    close()
                    moveTo(18f, 13.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(18.83f, 13.5f, 18f, 13.5f)
                    close()
                }
            }
        }.build()
        
        return _App_settings_alt!!
    }

private var _App_settings_alt: ImageVector? = null

