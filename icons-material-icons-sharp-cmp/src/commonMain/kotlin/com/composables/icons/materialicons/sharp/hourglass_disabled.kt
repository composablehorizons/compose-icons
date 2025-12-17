package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Hourglass_disabled: ImageVector
    get() {
        if (_Hourglass_disabled != null) return _Hourglass_disabled!!
        
        _Hourglass_disabled = ImageVector.Builder(
            name = "hourglass_disabled",
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
                        moveTo(8f, 4f)
                        lineTo(16f, 4f)
                        lineTo(16f, 7.5f)
                        lineTo(13.16f, 10.34f)
                        lineTo(14.41f, 11.59f)
                        lineTo(18f, 8.01f)
                        lineTo(17.99f, 8f)
                        lineTo(18f, 8f)
                        lineTo(18f, 2f)
                        lineTo(6f, 2f)
                        lineTo(6f, 3.17f)
                        lineTo(8f, 5.17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.1f, 2.1f)
                        lineTo(0.69f, 3.51f)
                        lineToRelative(8.9f, 8.9f)
                        lineTo(6f, 16f)
                        lineToRelative(0.01f, 0.01f)
                        horizontalLineTo(6f)
                        verticalLineTo(22f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(-1.17f)
                        lineToRelative(2.49f, 2.49f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.1f, 2.1f)
                        close()
                        moveTo(16f, 20f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-3.5f)
                        lineToRelative(2.84f, -2.84f)
                        lineTo(16f, 18.83f)
                        verticalLineTo(20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hourglass_disabled!!
    }

private var _Hourglass_disabled: ImageVector? = null

