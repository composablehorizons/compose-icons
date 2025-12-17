package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Layers_clear: ImageVector
    get() {
        if (_Layers_clear != null) return _Layers_clear!!
        
        _Layers_clear = ImageVector.Builder(
            name = "layers_clear",
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
                moveTo(21f, 9f)
                lineToRelative(-9f, -7f)
                lineToRelative(-2.59f, 2.02f)
                lineToRelative(7.87f, 7.87f)
                close()
                moveToRelative(0f, 5.07f)
                lineToRelative(-1.63f, -1.27f)
                lineToRelative(-0.67f, 0.52f)
                lineToRelative(1.43f, 1.43f)
                close()
                moveTo(3.41f, 0.86f)
                lineTo(2f, 2.27f)
                lineToRelative(4.22f, 4.22f)
                lineTo(3f, 9f)
                lineToRelative(9f, 7f)
                lineToRelative(2.1f, -1.63f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(-3.53f, 2.75f)
                lineToRelative(-7.37f, -5.73f)
                lineTo(3f, 14.07f)
                lineToRelative(9f, 7f)
                lineToRelative(4.95f, -3.85f)
                lineTo(20.73f, 21f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.build()
        
        return _Layers_clear!!
    }

private var _Layers_clear: ImageVector? = null

