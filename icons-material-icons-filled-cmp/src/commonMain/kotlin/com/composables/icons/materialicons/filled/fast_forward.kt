package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Fast_forward: ImageVector
    get() {
        if (_Fast_forward != null) return _Fast_forward!!
        
        _Fast_forward = ImageVector.Builder(
            name = "fast_forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 18f)
                lineToRelative(8.5f, -6f)
                lineTo(4f, 6f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(9f, -12f)
                verticalLineToRelative(12f)
                lineToRelative(8.5f, -6f)
                lineTo(13f, 6f)
                close()
            }
        }.build()
        
        return _Fast_forward!!
    }

private var _Fast_forward: ImageVector? = null

