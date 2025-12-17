package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.App_shortcut: ImageVector
    get() {
        if (_App_shortcut != null) return _App_shortcut!!
        
        _App_shortcut = ImageVector.Builder(
            name = "app_shortcut",
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
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(3f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.38f, 9.62f)
                        lineTo(21f, 11f)
                        lineTo(21.62f, 9.62f)
                        lineTo(23f, 9f)
                        lineTo(21.62f, 8.38f)
                        lineTo(21f, 7f)
                        lineTo(20.38f, 8.38f)
                        lineTo(19f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 8f)
                        lineTo(14.75f, 10.75f)
                        lineTo(12f, 12f)
                        lineTo(14.75f, 13.25f)
                        lineTo(16f, 16f)
                        lineTo(17.25f, 13.25f)
                        lineTo(20f, 12f)
                        lineTo(17.25f, 10.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 13f)
                        lineTo(20.38f, 14.38f)
                        lineTo(19f, 15f)
                        lineTo(20.38f, 15.62f)
                        lineTo(21f, 17f)
                        lineTo(21.62f, 15.62f)
                        lineTo(23f, 15f)
                        lineTo(21.62f, 14.38f)
                        close()
                    }
                }
            }
        }.build()
        
        return _App_shortcut!!
    }

private var _App_shortcut: ImageVector? = null

