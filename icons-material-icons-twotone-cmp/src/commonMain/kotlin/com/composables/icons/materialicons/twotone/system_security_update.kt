package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.System_security_update: ImageVector
    get() {
        if (_System_security_update != null) return _System_security_update!!
        
        _System_security_update = ImageVector.Builder(
            name = "system_security_update",
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
                        moveTo(7f, 3f)
                        horizontalLineTo(17f)
                        verticalLineTo(4f)
                        horizontalLineTo(7f)
                        verticalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 1.01f)
                        lineTo(7f, 1f)
                        curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                        verticalLineToRelative(18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(3f)
                        curveTo(19f, 1.9f, 18.1f, 1.01f, 17f, 1.01f)
                        close()
                        moveTo(17f, 21f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(21f)
                        close()
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(18f)
                        close()
                        moveTo(17f, 4f)
                        horizontalLineTo(7f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(4f)
                        close()
                        moveTo(16f, 12f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(8f)
                        lineToRelative(4f, 4f)
                        lineTo(16f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _System_security_update!!
    }

private var _System_security_update: ImageVector? = null

