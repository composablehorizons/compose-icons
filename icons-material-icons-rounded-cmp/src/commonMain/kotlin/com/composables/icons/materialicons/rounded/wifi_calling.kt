package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wifi_calling: ImageVector
    get() {
        if (_Wifi_calling != null) return _Wifi_calling!!
        
        _Wifi_calling = ImageVector.Builder(
            name = "wifi_calling",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 4.95f)
                        curveTo(21.79f, 4.78f, 19.67f, 3f, 16.5f, 3f)
                        curveToRelative(-3.18f, 0f, -5.29f, 1.78f, -5.5f, 1.95f)
                        lineTo(16.5f, 12f)
                        lineTo(22f, 4.95f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.2f, 15.28f)
                        lineToRelative(-2.54f, -0.29f)
                        curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f)
                        lineToRelative(-1.84f, 1.84f)
                        curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                        lineToRelative(1.85f, -1.85f)
                        curveToRelative(0.43f, -0.43f, 0.64f, -1.04f, 0.57f, -1.64f)
                        lineTo(8.72f, 4.8f)
                        curveTo(8.6f, 3.79f, 7.75f, 3.03f, 6.73f, 3.03f)
                        horizontalLineTo(5f)
                        curveToRelative(-1.13f, 0f, -2.07f, 0.94f, -2f, 2.07f)
                        curveTo(3.53f, 13.64f, 10.36f, 20.47f, 18.9f, 21f)
                        curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2f)
                        verticalLineToRelative(-1.73f)
                        curveTo(20.97f, 16.25f, 20.21f, 15.4f, 19.2f, 15.28f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wifi_calling!!
    }

private var _Wifi_calling: ImageVector? = null

