package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Signal_cellular_no_sim: ImageVector
    get() {
        if (_Signal_cellular_no_sim != null) return _Signal_cellular_no_sim!!
        
        _Signal_cellular_no_sim = ImageVector.Builder(
            name = "signal_cellular_no_sim",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                horizontalLineToRelative(-9f)
                lineTo(7.95f, 5.06f)
                lineTo(19f, 16.11f)
                close()
                moveToRelative(-15.21f, 0.74f)
                lineTo(2.38f, 5.15f)
                lineTo(5f, 7.77f)
                verticalLineTo(21f)
                horizontalLineToRelative(13.23f)
                lineToRelative(1.62f, 1.62f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.build()
        
        return _Signal_cellular_no_sim!!
    }

private var _Signal_cellular_no_sim: ImageVector? = null

