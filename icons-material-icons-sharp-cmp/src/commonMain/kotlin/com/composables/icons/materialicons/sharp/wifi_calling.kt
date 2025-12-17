package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wifi_calling: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.21f, 17.37f)
                        curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                        lineToRelative(2.53f, -2.53f)
                        lineTo(8.54f, 3f)
                        horizontalLineTo(3.03f)
                        curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21f, 20.97f)
                        verticalLineToRelative(-5.51f)
                        lineToRelative(-5.27f, -0.61f)
                        lineTo(13.21f, 17.37f)
                        close()
                    }
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
                }
            }
        }.build()
        
        return _Wifi_calling!!
    }

private var _Wifi_calling: ImageVector? = null

