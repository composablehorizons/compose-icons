package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Wifi_protected_setup: ImageVector
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
            }
            group {
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16.71f, 5.29f)
                            lineTo(19f, 3f)
                            horizontalLineToRelative(-8f)
                            verticalLineToRelative(8f)
                            lineToRelative(2.3f, -2.3f)
                            curveToRelative(1.97f, 1.46f, 3.25f, 3.78f, 3.25f, 6.42f)
                            curveToRelative(0f, 1.31f, -0.32f, 2.54f, -0.88f, 3.63f)
                            curveToRelative(2.33f, -1.52f, 3.88f, -4.14f, 3.88f, -7.13f)
                            curveTo(19.55f, 9.1f, 18.44f, 6.85f, 16.71f, 5.29f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(7.46f, 8.88f)
                            curveToRelative(0f, -1.31f, 0.32f, -2.54f, 0.88f, -3.63f)
                            curveTo(6f, 6.77f, 4.46f, 9.39f, 4.46f, 12.38f)
                            curveToRelative(0f, 2.52f, 1.1f, 4.77f, 2.84f, 6.33f)
                            lineTo(5f, 21f)
                            horizontalLineToRelative(8f)
                            verticalLineToRelative(-8f)
                            lineToRelative(-2.3f, 2.3f)
                            curveTo(8.74f, 13.84f, 7.46f, 11.52f, 7.46f, 8.88f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Wifi_protected_setup!!
    }

private var _Wifi_protected_setup: ImageVector? = null

