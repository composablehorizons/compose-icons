package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Texture: ImageVector
    get() {
        if (_Texture != null) return _Texture!!
        
        _Texture = ImageVector.Builder(
            name = "texture",
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
                moveTo(19.66f, 3f)
                lineTo(3.07f, 19.59f)
                verticalLineTo(21f)
                horizontalLineToRelative(1.41f)
                lineTo(21.07f, 4.42f)
                verticalLineTo(3f)
                close()
                moveToRelative(-7.71f, 0f)
                lineToRelative(-8.88f, 8.88f)
                verticalLineToRelative(2.83f)
                lineTo(14.78f, 3f)
                close()
                moveTo(3.07f, 3f)
                verticalLineToRelative(4f)
                lineToRelative(4f, -4f)
                close()
                moveToRelative(18f, 18f)
                verticalLineToRelative(-4f)
                lineToRelative(-4f, 4f)
                close()
                moveToRelative(-8.88f, 0f)
                lineToRelative(8.88f, -8.88f)
                verticalLineTo(9.29f)
                lineTo(9.36f, 21f)
                close()
            }
        }.build()
        
        return _Texture!!
    }

private var _Texture: ImageVector? = null

