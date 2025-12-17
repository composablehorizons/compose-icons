package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_statusbar_not_connected: ImageVector
    get() {
        if (_Signal_wifi_statusbar_not_connected != null) return _Signal_wifi_statusbar_not_connected!!
        
        _Signal_wifi_statusbar_not_connected = ImageVector.Builder(
            name = "signal_wifi_statusbar_not_connected",
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
                group {
                    group {
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(18.52f, 15.16f)
                                curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f)
                                curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f)
                                curveToRelative(-0.88f, 0f, -1.32f, 0.67f, -1.5f, 1.23f)
                                lineToRelative(-1.37f, -0.57f)
                                curveToRelative(0.37f, -1.12f, 1.38f, -2.08f, 2.86f, -2.08f)
                                curveToRelative(1.23f, 0f, 2.08f, 0.56f, 2.51f, 1.26f)
                                curveToRelative(0.37f, 0.6f, 0.58f, 1.73f, 0.01f, 2.57f)
                                curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f)
                                curveToRelative(-0.13f, 0.24f, -0.18f, 0.4f, -0.18f, 1.18f)
                                horizontalLineToRelative(-1.52f)
                                curveTo(18.26f, 16.41f, 18.19f, 15.74f, 18.52f, 15.16f)
                                close()
                                moveTo(17.95f, 18.95f)
                                curveToRelative(0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f)
                                curveToRelative(0.59f, 0f, 1.04f, 0.45f, 1.04f, 1.04f)
                                curveToRelative(0f, 0.58f, -0.44f, 1.05f, -1.04f, 1.05f)
                                curveTo(18.42f, 20f, 17.95f, 19.53f, 17.95f, 18.95f)
                                close()
                            }
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 13f)
                        curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                        curveToRelative(1.63f, 0f, 3.07f, 0.79f, 3.98f, 2f)
                        lineTo(24f, 8.98f)
                        curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                        curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                        lineTo(12f, 21f)
                        lineToRelative(4.01f, -4.02f)
                        curveTo(14.8f, 16.07f, 14f, 14.63f, 14f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_wifi_statusbar_not_connected!!
    }

private var _Signal_wifi_statusbar_not_connected: ImageVector? = null

