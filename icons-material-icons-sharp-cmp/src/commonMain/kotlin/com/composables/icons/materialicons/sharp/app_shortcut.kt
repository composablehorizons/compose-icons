package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.App_shortcut: ImageVector
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
                        moveTo(17f, 18f)
                        lineTo(7f, 18f)
                        lineTo(7f, 6f)
                        lineTo(17f, 6f)
                        lineTo(17f, 7f)
                        lineTo(19f, 7f)
                        lineTo(19f, 1f)
                        lineTo(5f, 1f)
                        lineTo(5f, 1f)
                        lineTo(5f, 23f)
                        lineTo(19f, 23f)
                        lineTo(19f, 17f)
                        lineTo(17f, 17f)
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

