package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Wifi_calling: ImageVector
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
                        moveTo(20f, 15.51f)
                        curveToRelative(-1.24f, 0f, -2.45f, -0.2f, -3.57f, -0.57f)
                        curveToRelative(-0.35f, -0.12f, -0.75f, -0.03f, -1.02f, 0.24f)
                        lineToRelative(-2.2f, 2.2f)
                        curveToRelative(-2.83f, -1.45f, -5.15f, -3.76f, -6.59f, -6.59f)
                        lineToRelative(2.2f, -2.2f)
                        curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f)
                        curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(4f)
                        curveTo(3.45f, 3f, 3f, 3.45f, 3f, 4f)
                        curveToRelative(0f, 9.39f, 7.61f, 17f, 17f, 17f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3.49f)
                        curveTo(21f, 15.96f, 20.55f, 15.51f, 20f, 15.51f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wifi_calling!!
    }

private var _Wifi_calling: ImageVector? = null

