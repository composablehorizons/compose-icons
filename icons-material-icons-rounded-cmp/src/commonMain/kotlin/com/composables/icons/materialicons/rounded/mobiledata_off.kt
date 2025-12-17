package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mobiledata_off: ImageVector
    get() {
        if (_Mobiledata_off != null) return _Mobiledata_off!!
        
        _Mobiledata_off = ImageVector.Builder(
            name = "mobiledata_off",
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
                        moveTo(16f, 7f)
                        horizontalLineToRelative(1.79f)
                        curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                        lineToRelative(-2.79f, -2.79f)
                        curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                        lineToRelative(-2.79f, 2.79f)
                        curveTo(11.54f, 6.46f, 11.76f, 7f, 12.21f, 7f)
                        horizontalLineTo(14f)
                        verticalLineToRelative(4.17f)
                        lineToRelative(2f, 2f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.1f, 3.51f)
                        lineTo(2.1f, 3.51f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(5.9f, 5.9f)
                        verticalLineToRelative(6.18f)
                        lineToRelative(-1.79f, 0f)
                        curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                        lineToRelative(2.79f, 2.78f)
                        curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0f)
                        lineToRelative(2.79f, -2.79f)
                        curveToRelative(0.32f, -0.32f, 0.09f, -0.85f, -0.35f, -0.85f)
                        lineToRelative(-1.79f, 0f)
                        verticalLineToRelative(-4.18f)
                        lineToRelative(9.07f, 9.07f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(3.51f, 3.51f)
                        curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mobiledata_off!!
    }

private var _Mobiledata_off: ImageVector? = null

