package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Settings_bluetooth: ImageVector
    get() {
        if (_Settings_bluetooth != null) return _Settings_bluetooth!!
        
        _Settings_bluetooth = ImageVector.Builder(
            name = "settings_bluetooth",
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
                        moveTo(13f, 23f)
                        arcTo(1f, 1f, 0f, false, true, 12f, 24f)
                        arcTo(1f, 1f, 0f, false, true, 11f, 23f)
                        arcTo(1f, 1f, 0f, false, true, 13f, 23f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 23f)
                        arcTo(1f, 1f, 0f, false, true, 8f, 24f)
                        arcTo(1f, 1f, 0f, false, true, 7f, 23f)
                        arcTo(1f, 1f, 0f, false, true, 9f, 23f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 23f)
                        arcTo(1f, 1f, 0f, false, true, 16f, 24f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 23f)
                        arcTo(1f, 1f, 0f, false, true, 17f, 23f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.41f, 10f)
                        lineTo(17f, 6.42f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.42f)
                        lineToRelative(-4.79f, -4.79f)
                        curveTo(12.07f, 0.07f, 11.89f, 0f, 11.71f, 0f)
                        curveTo(11.32f, 0f, 11f, 0.32f, 11f, 0.71f)
                        verticalLineToRelative(6.88f)
                        lineTo(7.11f, 3.71f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineTo(10.59f, 10f)
                        lineToRelative(-4.89f, 4.89f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineTo(11f, 12.41f)
                        verticalLineToRelative(6.88f)
                        curveToRelative(0f, 0.39f, 0.32f, 0.71f, 0.71f, 0.71f)
                        curveToRelative(0.19f, 0f, 0.37f, -0.07f, 0.5f, -0.21f)
                        lineTo(17f, 15f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.42f)
                        lineTo(13.41f, 10f)
                        close()
                        moveTo(13f, 3.83f)
                        lineToRelative(1.88f, 1.88f)
                        lineTo(13f, 7.59f)
                        verticalLineTo(3.83f)
                        close()
                        moveTo(13f, 16.17f)
                        verticalLineToRelative(-3.76f)
                        lineToRelative(1.88f, 1.88f)
                        lineTo(13f, 16.17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Settings_bluetooth!!
    }

private var _Settings_bluetooth: ImageVector? = null

