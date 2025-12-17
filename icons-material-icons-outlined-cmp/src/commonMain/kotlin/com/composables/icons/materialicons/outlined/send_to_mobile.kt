package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Send_to_mobile: ImageVector
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
                        moveTo(18f, 8f)
                        lineToRelative(4f, 4f)
                        lineToRelative(-4f, 4f)
                        lineToRelative(-1.41f, -1.41f)
                        lineTo(18.17f, 13f)
                        horizontalLineTo(13f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(5.17f)
                        lineToRelative(-1.59f, -1.59f)
                        lineTo(18f, 8f)
                        close()
                        moveTo(7f, 1.01f)
                        lineTo(17f, 1f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(6f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineTo(7f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(3f)
                        curveTo(5f, 1.9f, 5.9f, 1.01f, 7f, 1.01f)
                        close()
                        moveTo(7f, 21f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(-1f)
                        horizontalLineTo(7f)
                        verticalLineTo(21f)
                        close()
                        moveTo(7f, 4f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(3f)
                        horizontalLineTo(7f)
                        verticalLineTo(4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Send_to_mobile!!
    }

private var _Send_to_mobile: ImageVector? = null

