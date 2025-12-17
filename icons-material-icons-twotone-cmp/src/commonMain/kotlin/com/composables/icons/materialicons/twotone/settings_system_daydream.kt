package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Settings_system_daydream: ImageVector
    get() {
        if (_Settings_system_daydream != null) return _Settings_system_daydream!!
        
        _Settings_system_daydream = ImageVector.Builder(
            name = "settings_system_daydream",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 15f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.87f)
                lineToRelative(-0.17f, -0.86f)
                curveTo(14.29f, 9.92f, 13.23f, 9f, 12f, 9f)
                curveToRelative(-0.96f, 0f, -1.84f, 0.57f, -2.26f, 1.45f)
                lineToRelative(-0.27f, 0.57f)
                horizontalLineToRelative(-0.73f)
                curveTo(7.74f, 11.15f, 7f, 11.99f, 7f, 13f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 17f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.66f, -1.16f, -3.05f, -2.74f, -3.41f)
                curveTo(15.66f, 8.28f, 13.95f, 7f, 12f, 7f)
                curveToRelative(-1.53f, 0f, -2.96f, 0.8f, -3.78f, 2.08f)
                curveTo(6.36f, 9.44f, 5f, 11.07f, 5f, 13f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                close()
                moveToRelative(-0.26f, -5.98f)
                horizontalLineToRelative(0.74f)
                lineToRelative(0.27f, -0.57f)
                curveTo(10.16f, 9.57f, 11.04f, 9f, 12f, 9f)
                curveToRelative(1.23f, 0f, 2.29f, 0.92f, 2.46f, 2.14f)
                lineToRelative(0.17f, 0.86f)
                horizontalLineToRelative(0.87f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(9f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.01f, 0.74f, -1.85f, 1.74f, -1.98f)
                close()
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16.01f)
                horizontalLineTo(3f)
                verticalLineTo(4.99f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14.02f)
                close()
            }
        }.build()
        
        return _Settings_system_daydream!!
    }

private var _Settings_system_daydream: ImageVector? = null

