package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wifi_protected_setup: ImageVector
    get() {
        if (_Wifi_protected_setup != null) return _Wifi_protected_setup!!
        
        _Wifi_protected_setup = ImageVector.Builder(
            name = "wifi_protected_setup",
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
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16.7f, 5.3f)
                            lineToRelative(1.44f, -1.44f)
                            curveToRelative(0.32f, -0.32f, 0.09f, -0.85f, -0.35f, -0.85f)
                            horizontalLineTo(11.5f)
                            curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                            verticalLineTo(9.8f)
                            curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                            lineToRelative(1.45f, -1.45f)
                            curveToRelative(1.97f, 1.46f, 3.25f, 3.78f, 3.25f, 6.42f)
                            curveToRelative(0f, 0.66f, -0.08f, 1.31f, -0.24f, 1.92f)
                            curveToRelative(-0.12f, 0.5f, 0.48f, 0.86f, 0.84f, 0.49f)
                            curveToRelative(1.48f, -1.53f, 2.4f, -3.61f, 2.4f, -5.91f)
                            curveTo(19.55f, 9.11f, 18.44f, 6.86f, 16.7f, 5.3f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12.15f, 13.86f)
                            lineTo(10.7f, 15.3f)
                            curveToRelative(-1.97f, -1.46f, -3.25f, -3.78f, -3.25f, -6.42f)
                            curveToRelative(0f, -0.66f, 0.08f, -1.31f, 0.24f, -1.92f)
                            curveToRelative(0.12f, -0.5f, -0.48f, -0.86f, -0.84f, -0.49f)
                            curveToRelative(-1.48f, 1.53f, -2.4f, 3.61f, -2.4f, 5.91f)
                            curveToRelative(0f, 2.52f, 1.1f, 4.77f, 2.84f, 6.33f)
                            lineToRelative(-1.44f, 1.44f)
                            curveToRelative(-0.32f, 0.32f, -0.09f, 0.85f, 0.35f, 0.85f)
                            horizontalLineToRelative(6.29f)
                            curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                            verticalLineToRelative(-6.29f)
                            curveTo(13f, 13.77f, 12.46f, 13.54f, 12.15f, 13.86f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Wifi_protected_setup!!
    }

private var _Wifi_protected_setup: ImageVector? = null

