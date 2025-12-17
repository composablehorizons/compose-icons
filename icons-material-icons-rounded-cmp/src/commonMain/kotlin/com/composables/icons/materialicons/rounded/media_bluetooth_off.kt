package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Media_bluetooth_off: ImageVector
    get() {
        if (_Media_bluetooth_off != null) return _Media_bluetooth_off!!
        
        _Media_bluetooth_off = ImageVector.Builder(
            name = "media_bluetooth_off",
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
                        moveTo(9f, 6.17f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(1.17f)
                        lineTo(9f, 6.17f)
                        close()
                        moveTo(19.42f, 15f)
                        lineToRelative(2.18f, 2.17f)
                        curveToRelative(0.22f, 0.22f, 0.22f, 0.58f, 0f, 0.8f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.22f, 0.22f, -0.58f, 0.22f, -0.8f, 0f)
                        lineToRelative(-5.98f, -5.98f)
                        curveToRelative(-0.22f, -0.22f, -0.22f, -0.58f, 0f, -0.8f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.22f, -0.22f, 0.58f, -0.22f, 0.8f, 0f)
                        lineToRelative(2.35f, 2.35f)
                        verticalLineTo(9.61f)
                        curveToRelative(0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f)
                        lineToRelative(2.82f, 2.82f)
                        curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                        lineTo(19.42f, 15f)
                        close()
                        moveTo(19.17f, 13.55f)
                        lineToRelative(1.13f, -1.13f)
                        lineToRelative(-1.13f, -1.13f)
                        verticalLineTo(13.55f)
                        close()
                        moveTo(20.49f, 20.49f)
                        curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                        lineToRelative(-3.28f, -3.28f)
                        lineToRelative(-0.16f, 0.16f)
                        curveToRelative(-0.23f, 0.23f, -0.62f, 0.23f, -0.85f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.23f, -0.23f, -0.23f, -0.62f, 0f, -0.85f)
                        lineToRelative(0.16f, -0.16f)
                        lineTo(11f, 13.83f)
                        lineToRelative(0f, 3.02f)
                        curveToRelative(0f, 2.07f, -1.68f, 4.01f, -3.74f, 4.14f)
                        curveTo(4.94f, 21.13f, 3f, 19.29f, 3f, 17f)
                        curveToRelative(0f, -2.21f, 1.79f, -4f, 4.01f, -4f)
                        curveToRelative(0.73f, 0f, 1.41f, 0.21f, 2f, 0.55f)
                        verticalLineToRelative(-1.72f)
                        lineTo(2.1f, 4.92f)
                        curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                        lineTo(20.49f, 20.49f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Media_bluetooth_off!!
    }

private var _Media_bluetooth_off: ImageVector? = null

