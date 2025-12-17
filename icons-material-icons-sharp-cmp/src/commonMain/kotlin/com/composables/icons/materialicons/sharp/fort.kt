package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Fort: ImageVector
    get() {
        if (_Fort != null) return _Fort!!
        
        _Fort = ImageVector.Builder(
            name = "fort",
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
                        moveTo(21f, 3f)
                        lineTo(21f, 5f)
                        lineTo(19f, 5f)
                        lineTo(19f, 3f)
                        lineTo(17f, 3f)
                        lineTo(17f, 5f)
                        lineTo(15f, 5f)
                        lineTo(15f, 3f)
                        lineTo(13f, 3f)
                        lineTo(13f, 7f)
                        lineTo(15f, 9f)
                        lineTo(15f, 10f)
                        lineTo(9f, 10f)
                        lineTo(9f, 9f)
                        lineTo(11f, 7f)
                        lineTo(11f, 3f)
                        lineTo(9f, 3f)
                        lineTo(9f, 5f)
                        lineTo(7f, 5f)
                        lineTo(7f, 3f)
                        lineTo(5f, 3f)
                        lineTo(5f, 5f)
                        lineTo(3f, 5f)
                        lineTo(3f, 3f)
                        lineTo(1f, 3f)
                        lineTo(1f, 7f)
                        lineTo(3f, 9f)
                        lineTo(3f, 15f)
                        lineTo(1f, 17f)
                        lineTo(1f, 21f)
                        lineTo(10f, 21f)
                        lineTo(10f, 16f)
                        lineTo(14f, 16f)
                        lineTo(14f, 21f)
                        lineTo(23f, 21f)
                        lineTo(23f, 17f)
                        lineTo(21f, 15f)
                        lineTo(21f, 9f)
                        lineTo(23f, 7f)
                        lineTo(23f, 3f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Fort!!
    }

private var _Fort: ImageVector? = null

