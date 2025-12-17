package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_backup_restore: ImageVector
    get() {
        if (_Settings_backup_restore != null) return _Settings_backup_restore!!
        
        _Settings_backup_restore = ImageVector.Builder(
            name = "settings_backup_restore",
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
                    moveTo(11.77f, 3f)
                    curveToRelative(-2.65f, 0.07f, -5f, 1.28f, -6.6f, 3.16f)
                    lineTo(3.85f, 4.85f)
                    curveTo(3.54f, 4.54f, 3f, 4.76f, 3f, 5.21f)
                    verticalLineTo(9.5f)
                    curveTo(3f, 9.78f, 3.22f, 10f, 3.5f, 10f)
                    horizontalLineToRelative(4.29f)
                    curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                    lineTo(6.59f, 7.59f)
                    curveTo(7.88f, 6.02f, 9.82f, 5f, 12f, 5f)
                    curveToRelative(4.32f, 0f, 7.74f, 3.94f, 6.86f, 8.41f)
                    curveToRelative(-0.54f, 2.77f, -2.81f, 4.98f, -5.58f, 5.47f)
                    curveToRelative(-3.8f, 0.68f, -7.18f, -1.74f, -8.05f, -5.16f)
                    curveTo(5.11f, 13.3f, 4.71f, 13f, 4.27f, 13f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.65f, 0f, -1.14f, 0.61f, -0.98f, 1.23f)
                    curveTo(4.28f, 18.12f, 7.8f, 21f, 12f, 21f)
                    curveToRelative(5.06f, 0f, 9.14f, -4.17f, 9f, -9.26f)
                    curveTo(20.86f, 6.86f, 16.65f, 2.88f, 11.77f, 3f)
                    close()
                    moveTo(14f, 12f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveTo(14f, 13.1f, 14f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Settings_backup_restore!!
    }

private var _Settings_backup_restore: ImageVector? = null

