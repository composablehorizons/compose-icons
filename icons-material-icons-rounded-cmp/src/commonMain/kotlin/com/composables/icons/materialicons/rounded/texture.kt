package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Texture: ImageVector
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
                moveTo(19.58f, 3.08f)
                lineTo(3.15f, 19.51f)
                curveToRelative(0.09f, 0.34f, 0.27f, 0.65f, 0.51f, 0.9f)
                curveToRelative(0.25f, 0.24f, 0.56f, 0.42f, 0.9f, 0.51f)
                lineTo(21f, 4.49f)
                curveToRelative(-0.19f, -0.69f, -0.73f, -1.23f, -1.42f, -1.41f)
                close()
                moveTo(11.95f, 3f)
                lineToRelative(-8.88f, 8.88f)
                verticalLineToRelative(2.83f)
                lineTo(14.78f, 3f)
                horizontalLineToRelative(-2.83f)
                close()
                moveTo(5.07f, 3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(14f, 18f)
                curveToRelative(0.55f, 0f, 1.05f, -0.22f, 1.41f, -0.59f)
                curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f)
                verticalLineToRelative(-2f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(-9.71f, 0f)
                horizontalLineToRelative(2.83f)
                lineToRelative(8.88f, -8.88f)
                verticalLineTo(9.29f)
                lineTo(9.36f, 21f)
                close()
            }
        }.build()
        
        return _Texture!!
    }

private var _Texture: ImageVector? = null

