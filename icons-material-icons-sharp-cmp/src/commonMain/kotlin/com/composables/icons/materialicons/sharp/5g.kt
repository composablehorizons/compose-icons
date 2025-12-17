package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`5g`: ImageVector
    get() {
        if (_5g != null) return _5g!!
        
        _5g = ImageVector.Builder(
            name = "5g",
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
                        moveTo(17f, 13f)
                        lineTo(19f, 13f)
                        lineTo(19f, 15f)
                        lineTo(14f, 15f)
                        lineTo(14f, 9f)
                        lineTo(21f, 9f)
                        lineTo(21f, 7f)
                        lineTo(12f, 7f)
                        lineTo(12f, 17f)
                        lineTo(21f, 17f)
                        lineTo(21f, 11f)
                        lineTo(17f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 13f)
                        lineTo(8f, 13f)
                        lineTo(8f, 15f)
                        lineTo(3f, 15f)
                        lineTo(3f, 17f)
                        lineTo(10f, 17f)
                        lineTo(10f, 11f)
                        lineTo(5f, 11f)
                        lineTo(5f, 9f)
                        lineTo(10f, 9f)
                        lineTo(10f, 7f)
                        lineTo(3f, 7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _5g!!
    }

private var _5g: ImageVector? = null

