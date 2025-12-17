package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Arrow_forward_ios: ImageVector
    get() {
        if (_Arrow_forward_ios != null) return _Arrow_forward_ios!!
        
        _Arrow_forward_ios = ImageVector.Builder(
            name = "arrow_forward_ios",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(6.23f, 20.23f)
                    lineTo(8f, 22f)
                    lineTo(18f, 12f)
                    lineTo(8f, 2f)
                    lineTo(6.23f, 3.77f)
                    lineTo(14.46f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Arrow_forward_ios!!
    }

private var _Arrow_forward_ios: ImageVector? = null

