package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_remote: ImageVector
    get() {
        if (_Settings_remote != null) return _Settings_remote!!
        
        _Settings_remote = ImageVector.Builder(
            name = "settings_remote",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 9f)
                        horizontalLineTo(9f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(10f)
                        curveTo(16f, 9.45f, 15.55f, 9f, 15f, 9f)
                        close()
                        moveTo(12f, 14.25f)
                        curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                        reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                        reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                        reflectiveCurveTo(12.69f, 14.25f, 12f, 14.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.82f, 6.82f)
                        lineTo(7.82f, 6.82f)
                        curveToRelative(0.35f, 0.35f, 0.9f, 0.38f, 1.3f, 0.1f)
                        curveTo(9.93f, 6.34f, 10.93f, 6f, 12f, 6f)
                        curveToRelative(1.07f, 0f, 2.07f, 0.34f, 2.88f, 0.91f)
                        curveToRelative(0.4f, 0.28f, 0.95f, 0.26f, 1.3f, -0.09f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.43f, -0.43f, 0.39f, -1.15f, -0.09f, -1.5f)
                        curveTo(14.94f, 4.49f, 13.53f, 4f, 12f, 4f)
                        curveToRelative(-1.53f, 0f, -2.94f, 0.49f, -4.09f, 1.32f)
                        curveTo(7.42f, 5.67f, 7.39f, 6.39f, 7.82f, 6.82f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 0f)
                        curveTo(9.36f, 0f, 6.94f, 0.93f, 5.05f, 2.47f)
                        curveToRelative(-0.46f, 0.38f, -0.5f, 1.07f, -0.08f, 1.49f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.36f, 0.36f, 0.93f, 0.39f, 1.32f, 0.07f)
                        curveTo(7.84f, 2.77f, 9.83f, 2f, 12f, 2f)
                        curveToRelative(2.17f, 0f, 4.16f, 0.77f, 5.7f, 2.04f)
                        curveToRelative(0.39f, 0.32f, 0.96f, 0.29f, 1.32f, -0.07f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.42f, -0.42f, 0.38f, -1.11f, -0.08f, -1.49f)
                        curveTo(17.06f, 0.93f, 14.64f, 0f, 12f, 0f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Settings_remote!!
    }

private var _Settings_remote: ImageVector? = null

