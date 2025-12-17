package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Restart_alt: ImageVector
    get() {
        if (_Restart_alt != null) return _Restart_alt!!
        
        _Restart_alt = ImageVector.Builder(
            name = "restart_alt",
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
                        moveTo(6f, 13f)
                        curveToRelative(0f, -1.65f, 0.67f, -3.15f, 1.76f, -4.24f)
                        lineTo(6.34f, 7.34f)
                        curveTo(4.9f, 8.79f, 4f, 10.79f, 4f, 13f)
                        curveToRelative(0f, 4.08f, 3.05f, 7.44f, 7f, 7.93f)
                        verticalLineToRelative(-2.02f)
                        curveTo(8.17f, 18.43f, 6f, 15.97f, 6f, 13f)
                        close()
                        moveTo(20f, 13f)
                        curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                        curveToRelative(-0.06f, 0f, -0.12f, 0.01f, -0.18f, 0.01f)
                        lineToRelative(1.09f, -1.09f)
                        lineTo(11.5f, 2.5f)
                        lineTo(8f, 6f)
                        lineToRelative(3.5f, 3.5f)
                        lineToRelative(1.41f, -1.41f)
                        lineToRelative(-1.08f, -1.08f)
                        curveTo(11.89f, 7.01f, 11.95f, 7f, 12f, 7f)
                        curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                        curveToRelative(0f, 2.97f, -2.17f, 5.43f, -5f, 5.91f)
                        verticalLineToRelative(2.02f)
                        curveTo(16.95f, 20.44f, 20f, 17.08f, 20f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Restart_alt!!
    }

private var _Restart_alt: ImageVector? = null

