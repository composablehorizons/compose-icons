package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Flashlight_off: ImageVector
    get() {
        if (_Flashlight_off != null) return _Flashlight_off!!
        
        _Flashlight_off = ImageVector.Builder(
            name = "flashlight_off",
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
                        moveTo(18f, 5f)
                        lineTo(18f, 2f)
                        lineTo(6f, 2f)
                        lineTo(6f, 3.17f)
                        lineTo(7.83f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 11f)
                        lineTo(18f, 8f)
                        lineTo(18f, 7f)
                        lineTo(9.83f, 7f)
                        lineTo(16f, 13.17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineTo(8f, 10.83f)
                        verticalLineTo(22f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-3.17f)
                        lineToRelative(3.78f, 3.78f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flashlight_off!!
    }

private var _Flashlight_off: ImageVector? = null

