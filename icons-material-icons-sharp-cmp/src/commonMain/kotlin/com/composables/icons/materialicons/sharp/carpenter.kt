package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Carpenter: ImageVector
    get() {
        if (_Carpenter != null) return _Carpenter!!
        
        _Carpenter = ImageVector.Builder(
            name = "carpenter",
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
                moveTo(7f, 1.5f)
                lineTo(3.11f, 5.39f)
                lineToRelative(8.13f, 11.67f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(7.07f, -7.07f)
                lineTo(7f, 1.5f)
                close()
                moveTo(12.66f, 18.47f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.24f, 4.24f)
                lineTo(12.66f, 18.47f)
                close()
            }
        }.build()
        
        return _Carpenter!!
    }

private var _Carpenter: ImageVector? = null

