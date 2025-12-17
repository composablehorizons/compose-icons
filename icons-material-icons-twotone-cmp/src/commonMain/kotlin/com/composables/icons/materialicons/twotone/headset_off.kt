package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Headset_off: ImageVector
    get() {
        if (_Headset_off != null) return _Headset_off!!
        
        _Headset_off = ImageVector.Builder(
            name = "headset_off",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(5f, 14f)
                    horizontalLineTo(7f)
                    verticalLineTo(18f)
                    horizontalLineTo(5f)
                    verticalLineTo(14f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16.83f, 14f)
                    lineTo(19f, 16.17f)
                    lineTo(19f, 14f)
                    close()
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 4f)
                        curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(0.17f)
                        lineTo(16.83f, 14f)
                        horizontalLineTo(19f)
                        verticalLineToRelative(2.17f)
                        lineToRelative(2f, 2f)
                        verticalLineTo(11f)
                        curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                        curveTo(9.98f, 2f, 8.12f, 2.67f, 6.62f, 3.8f)
                        lineToRelative(1.43f, 1.43f)
                        curveTo(9.17f, 4.45f, 10.53f, 4f, 12f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.1f, 2.1f)
                        lineTo(0.69f, 3.51f)
                        lineToRelative(3.33f, 3.33f)
                        curveTo(3.37f, 8.09f, 3f, 9.5f, 3f, 11f)
                        verticalLineToRelative(7f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-8f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.94f, 0.19f, -1.83f, 0.52f, -2.65f)
                        lineTo(15f, 17.83f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(2.17f)
                        lineToRelative(1f, 1f)
                        horizontalLineTo(12f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(7f)
                        curveToRelative(0.34f, 0f, 0.65f, -0.09f, 0.93f, -0.24f)
                        lineToRelative(0.55f, 0.55f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.1f, 2.1f)
                        close()
                        moveTo(7f, 14f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-4f)
                        horizontalLineTo(7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Headset_off!!
    }

private var _Headset_off: ImageVector? = null

