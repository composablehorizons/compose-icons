package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Signal_cellular_0_bar: ImageVector
    get() {
        if (_Signal_cellular_0_bar != null) return _Signal_cellular_0_bar!!
        
        _Signal_cellular_0_bar = ImageVector.Builder(
            name = "signal_cellular_0_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 6.83f)
                verticalLineTo(20f)
                horizontalLineTo(6.83f)
                lineTo(20f, 6.83f)
                moveTo(22f, 2f)
                lineTo(2f, 22f)
                horizontalLineToRelative(20f)
                verticalLineTo(2f)
                lineTo(22f, 2f)
                close()
            }
        }.build()
        
        return _Signal_cellular_0_bar!!
    }

private var _Signal_cellular_0_bar: ImageVector? = null

