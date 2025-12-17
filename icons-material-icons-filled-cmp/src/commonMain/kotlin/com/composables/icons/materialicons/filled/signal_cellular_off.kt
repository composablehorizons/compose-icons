package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Signal_cellular_off: ImageVector
    get() {
        if (_Signal_cellular_off != null) return _Signal_cellular_off!!
        
        _Signal_cellular_off = ImageVector.Builder(
            name = "signal_cellular_off",
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
                moveTo(21f, 1f)
                lineToRelative(-8.59f, 8.59f)
                lineTo(21f, 18.18f)
                verticalLineTo(1f)
                close()
                moveTo(4.77f, 4.5f)
                lineTo(3.5f, 5.77f)
                lineToRelative(6.36f, 6.36f)
                lineTo(1f, 21f)
                horizontalLineToRelative(17.73f)
                lineToRelative(2f, 2f)
                lineTo(22f, 21.73f)
                lineTo(4.77f, 4.5f)
                close()
            }
        }.build()
        
        return _Signal_cellular_off!!
    }

private var _Signal_cellular_off: ImageVector? = null

