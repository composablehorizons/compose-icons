package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_cellular_connected_no_internet_4_bar: ImageVector
    get() {
        if (_Signal_cellular_connected_no_internet_4_bar != null) return _Signal_cellular_connected_no_internet_4_bar!!
        
        _Signal_cellular_connected_no_internet_4_bar = ImageVector.Builder(
            name = "signal_cellular_connected_no_internet_4_bar",
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
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21f, 18f)
                            lineTo(21f, 18f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-6f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            lineToRelative(0f, 0f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(6f)
                            curveTo(20f, 17.55f, 20.45f, 18f, 21f, 18f)
                            close()
                            moveTo(21f, 22f)
                            lineTo(21f, 22f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(0f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineToRelative(0f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(0f)
                            curveTo(20f, 21.55f, 20.45f, 22f, 21f, 22f)
                            close()
                            moveTo(4.41f, 22f)
                            horizontalLineTo(18f)
                            verticalLineTo(11f)
                            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                            horizontalLineToRelative(1f)
                            verticalLineTo(4.41f)
                            curveToRelative(0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                            lineTo(3.71f, 20.29f)
                            curveTo(3.08f, 20.92f, 3.52f, 22f, 4.41f, 22f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Signal_cellular_connected_no_internet_4_bar!!
    }

private var _Signal_cellular_connected_no_internet_4_bar: ImageVector? = null

