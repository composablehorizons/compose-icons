package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Straight: ImageVector
    get() {
        if (_Straight != null) return _Straight!!
        
        _Straight = ImageVector.Builder(
            name = "straight",
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
                    moveTo(11f, 6.83f)
                    lineTo(9.41f, 8.41f)
                    lineTo(8f, 7f)
                    lineTo(12f, 3f)
                    lineTo(16f, 7f)
                    lineTo(14.59f, 8.41f)
                    lineTo(13f, 6.83f)
                    lineTo(13f, 21f)
                    lineTo(11f, 21f)
                    close()
                }
            }
        }.build()
        
        return _Straight!!
    }

private var _Straight: ImageVector? = null

