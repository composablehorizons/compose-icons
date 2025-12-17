package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Smart_display: ImageVector
    get() {
        if (_Smart_display != null) return _Smart_display!!
        
        _Smart_display = ImageVector.Builder(
            name = "smart_display",
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
                        moveTo(4f, 18.01f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(5.99f)
                        horizontalLineTo(4f)
                        verticalLineTo(18.01f)
                        close()
                        moveTo(9.5f, 7.5f)
                        lineToRelative(7f, 4.5f)
                        lineToRelative(-7f, 4.5f)
                        verticalLineTo(7.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.5f, 7.5f)
                        lineTo(9.5f, 16.5f)
                        lineTo(16.5f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 4f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                        close()
                        moveTo(20f, 18.01f)
                        horizontalLineTo(4f)
                        verticalLineTo(5.99f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(18.01f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Smart_display!!
    }

private var _Smart_display: ImageVector? = null

