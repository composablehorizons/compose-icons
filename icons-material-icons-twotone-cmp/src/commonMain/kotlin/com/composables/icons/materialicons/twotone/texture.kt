package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Texture: ImageVector
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
                moveTo(11.88f, 3f)
                lineTo(3f, 11.88f)
                verticalLineToRelative(2.83f)
                lineTo(14.71f, 3f)
                close()
                moveTo(3f, 5f)
                verticalLineToRelative(2f)
                lineToRelative(4f, -4f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveToRelative(16.51f, -1.92f)
                lineTo(3.08f, 19.51f)
                curveToRelative(0.09f, 0.34f, 0.27f, 0.65f, 0.51f, 0.9f)
                curveToRelative(0.25f, 0.24f, 0.56f, 0.42f, 0.9f, 0.51f)
                lineTo(20.93f, 4.49f)
                curveToRelative(-0.19f, -0.69f, -0.73f, -1.23f, -1.42f, -1.41f)
                close()
                moveTo(21f, 9.29f)
                lineTo(9.29f, 21f)
                horizontalLineToRelative(2.83f)
                lineTo(21f, 12.12f)
                close()
                moveToRelative(-0.59f, 11.12f)
                curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f)
                verticalLineToRelative(-2f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1.05f, -0.22f, 1.41f, -0.59f)
                close()
            }
        }.build()
        
        return _Texture!!
    }

private var _Texture: ImageVector? = null

