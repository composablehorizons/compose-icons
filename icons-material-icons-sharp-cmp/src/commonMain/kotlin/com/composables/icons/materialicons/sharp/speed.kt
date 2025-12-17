package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Speed: ImageVector
    get() {
        if (_Speed != null) return _Speed!!
        
        _Speed = ImageVector.Builder(
            name = "speed",
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
                moveTo(20.39f, 8.56f)
                lineToRelative(-1.24f, 1.86f)
                arcToRelative(8f, 8f, 0f, false, true, -0.22f, 7.58f)
                horizontalLineTo(5.07f)
                arcTo(8f, 8f, 0f, false, true, 15.58f, 6.85f)
                lineToRelative(1.86f, -1.24f)
                arcTo(10f, 10f, 0f, false, false, 4f, 20f)
                horizontalLineToRelative(16f)
                arcToRelative(10f, 10f, 0f, false, false, 0.38f, -11.44f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.59f, 15.41f)
                arcToRelative(2f, 2f, 0f, false, false, 2.83f, 0f)
                lineToRelative(5.66f, -8.49f)
                lineToRelative(-8.49f, 5.66f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 2.83f)
                close()
            }
        }.build()
        
        return _Speed!!
    }

private var _Speed: ImageVector? = null

