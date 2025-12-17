package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_wifi_connected_no_internet_4: ImageVector
    get() {
        if (_Signal_wifi_connected_no_internet_4 != null) return _Signal_wifi_connected_no_internet_4!!
        
        _Signal_wifi_connected_no_internet_4 = ImageVector.Builder(
            name = "signal_wifi_connected_no_internet_4",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(23.21f, 8.24f)
                        curveTo(20.22f, 5.6f, 16.3f, 4f, 12f, 4f)
                        curveTo(7.7f, 4f, 3.78f, 5.6f, 0.79f, 8.24f)
                        curveTo(0.35f, 8.63f, 0.32f, 9.3f, 0.73f, 9.71f)
                        lineToRelative(10.56f, 10.58f)
                        curveToRelative(0.19f, 0.19f, 0.45f, 0.29f, 0.7f, 0.29f)
                        verticalLineTo(14f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(6.99f)
                        lineToRelative(2.29f, -2.29f)
                        curveTo(23.68f, 9.3f, 23.65f, 8.63f, 23.21f, 8.24f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.3f, 14.71f)
                        lineTo(20.3f, 14.71f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-1.39f, 1.38f)
                        lineToRelative(-1.39f, -1.38f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(1.39f, 1.39f)
                        lineToRelative(-1.39f, 1.39f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(1.39f, -1.38f)
                        lineToRelative(1.39f, 1.38f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-1.38f, -1.39f)
                        lineToRelative(1.38f, -1.39f)
                        curveTo(20.69f, 15.73f, 20.69f, 15.1f, 20.3f, 14.71f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_wifi_connected_no_internet_4!!
    }

private var _Signal_wifi_connected_no_internet_4: ImageVector? = null

