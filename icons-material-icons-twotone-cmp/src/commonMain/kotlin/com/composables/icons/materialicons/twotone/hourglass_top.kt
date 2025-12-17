package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Hourglass_top: ImageVector
    get() {
        if (_Hourglass_top != null) return _Hourglass_top!!
        
        _Hourglass_top = ImageVector.Builder(
            name = "hourglass_top",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 7.5f)
                        lineTo(12f, 11.5f)
                        lineTo(16f, 7.5f)
                        lineTo(16f, 4f)
                        lineTo(8f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 7.5f)
                        lineTo(12f, 11.5f)
                        lineTo(16f, 7.5f)
                        lineTo(16f, 4f)
                        lineTo(8f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 2f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(6f)
                        lineToRelative(4f, 4f)
                        lineToRelative(-3.99f, 4.01f)
                        lineTo(6f, 22f)
                        horizontalLineToRelative(12f)
                        lineToRelative(-0.01f, -5.99f)
                        lineTo(14f, 12f)
                        lineToRelative(4f, -3.99f)
                        verticalLineTo(2f)
                        close()
                        moveTo(16f, 16.5f)
                        verticalLineTo(20f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-3.5f)
                        lineToRelative(4f, -4f)
                        lineTo(16f, 16.5f)
                        close()
                        moveTo(16f, 7.5f)
                        lineToRelative(-4f, 4f)
                        lineToRelative(-4f, -4f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(7.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hourglass_top!!
    }

private var _Hourglass_top: ImageVector? = null

