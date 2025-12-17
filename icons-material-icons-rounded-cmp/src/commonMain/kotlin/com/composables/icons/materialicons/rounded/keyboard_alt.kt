package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Keyboard_alt: ImageVector
    get() {
        if (_Keyboard_alt != null) return _Keyboard_alt!!
        
        _Keyboard_alt = ImageVector.Builder(
            name = "keyboard_alt",
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
                        moveTo(21f, 4f)
                        horizontalLineTo(3f)
                        curveTo(1.9f, 4f, 1f, 4.9f, 1f, 6f)
                        verticalLineToRelative(13f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(18f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(23f, 4.9f, 22.1f, 4f, 21f, 4f)
                        close()
                        moveTo(7f, 12f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(7f)
                        close()
                        moveTo(5f, 10f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        close()
                        moveTo(11f, 12f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(11f)
                        close()
                        moveTo(9f, 10f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(9f)
                        close()
                        moveTo(16f, 16.5f)
                        lineTo(16f, 16.5f)
                        curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                        horizontalLineToRelative(-7f)
                        curveTo(8.22f, 17f, 8f, 16.78f, 8f, 16.5f)
                        lineToRelative(0f, 0f)
                        curveTo(8f, 16.22f, 8.22f, 16f, 8.5f, 16f)
                        horizontalLineToRelative(7f)
                        curveTo(15.78f, 16f, 16f, 16.22f, 16f, 16.5f)
                        close()
                        moveTo(15f, 12f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(15f)
                        close()
                        moveTo(13f, 10f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(13f)
                        close()
                        moveTo(17f, 14f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(17f)
                        close()
                        moveTo(19f, 10f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Keyboard_alt!!
    }

private var _Keyboard_alt: ImageVector? = null

