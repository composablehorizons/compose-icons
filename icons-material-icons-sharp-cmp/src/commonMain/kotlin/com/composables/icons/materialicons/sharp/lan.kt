package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Lan: ImageVector
    get() {
        if (_Lan != null) return _Lan!!
        
        _Lan = ImageVector.Builder(
            name = "lan",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 22f)
                    lineTo(21f, 22f)
                    lineTo(21f, 15f)
                    lineTo(18f, 15f)
                    lineTo(18f, 11f)
                    lineTo(13f, 11f)
                    lineTo(13f, 9f)
                    lineTo(16f, 9f)
                    lineTo(16f, 2f)
                    lineTo(8f, 2f)
                    lineTo(8f, 9f)
                    lineTo(11f, 9f)
                    lineTo(11f, 11f)
                    lineTo(6f, 11f)
                    lineTo(6f, 15f)
                    lineTo(3f, 15f)
                    lineTo(3f, 22f)
                    lineTo(11f, 22f)
                    lineTo(11f, 15f)
                    lineTo(8f, 15f)
                    lineTo(8f, 13f)
                    lineTo(16f, 13f)
                    lineTo(16f, 15f)
                    lineTo(13f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Lan!!
    }

private var _Lan: ImageVector? = null

