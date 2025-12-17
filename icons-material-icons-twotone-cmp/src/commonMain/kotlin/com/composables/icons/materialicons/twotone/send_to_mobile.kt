package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Send_to_mobile: ImageVector
    get() {
        if (_Send_to_mobile != null) return _Send_to_mobile!!
        
        _Send_to_mobile = ImageVector.Builder(
            name = "send_to_mobile",
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
                        moveTo(7f, 3f)
                        horizontalLineTo(17f)
                        verticalLineTo(4f)
                        horizontalLineTo(7f)
                        verticalLineTo(3f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(7f, 20f)
                            horizontalLineTo(17f)
                            verticalLineTo(21f)
                            horizontalLineTo(7f)
                            verticalLineTo(20f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(22f, 12f)
                            lineToRelative(-4f, -4f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(-5f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(3f)
                            lineTo(22f, 12f)
                            close()
                            moveTo(17f, 18f)
                            horizontalLineTo(7f)
                            verticalLineTo(6f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(1f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(3f)
                            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                            lineTo(7f, 1.01f)
                            curveTo(5.9f, 1.01f, 5f, 1.9f, 5f, 3f)
                            verticalLineToRelative(18f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(10f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineToRelative(-4f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(18f)
                            close()
                            moveTo(7f, 3f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(1f)
                            horizontalLineTo(7f)
                            verticalLineTo(3f)
                            close()
                            moveTo(17f, 21f)
                            horizontalLineTo(7f)
                            verticalLineToRelative(-1f)
                            horizontalLineToRelative(10f)
                            verticalLineTo(21f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Send_to_mobile!!
    }

private var _Send_to_mobile: ImageVector? = null

