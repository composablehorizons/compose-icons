package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sign_language: ImageVector
    get() {
        if (_Sign_language != null) return _Sign_language!!
        
        _Sign_language = ImageVector.Builder(
            name = "sign_language",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12.49f, 13f)
                    lineToRelative(-1.39f, -2.7f)
                    lineTo(12.49f, 9f)
                    lineTo(19f, 15.2f)
                    verticalLineTo(24f)
                    horizontalLineTo(4.5f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(10f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(3.5f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(12.49f)
                    close()
                    moveTo(11.78f, 7.12f)
                    curveToRelative(-0.84f, 0.4f, -1.17f, 0.62f, -1.63f, 1.19f)
                    lineTo(6.76f, 4.74f)
                    lineToRelative(1.45f, -1.38f)
                    lineTo(11.78f, 7.12f)
                    close()
                    moveTo(9.64f, 9.21f)
                    curveTo(9.41f, 9.76f, 9.35f, 10.45f, 9.44f, 11f)
                    horizontalLineTo(8.58f)
                    lineTo(5.62f, 7.89f)
                    lineToRelative(1.45f, -1.38f)
                    lineTo(9.64f, 9.21f)
                    close()
                    moveTo(21.98f, 12.34f)
                    lineTo(22f, 3.35f)
                    lineToRelative(-1.9f, -0.1f)
                    lineToRelative(-1f, 2.86f)
                    lineTo(13.3f, 0f)
                    lineToRelative(-1.45f, 1.38f)
                    lineToRelative(4.09f, 4.3f)
                    lineToRelative(-0.73f, 0.69f)
                    lineTo(9.74f, 0.64f)
                    lineTo(8.3f, 2f)
                    lineToRelative(3.36f, 3.53f)
                    lineToRelative(1.06f, 1.11f)
                    lineToRelative(2.65f, 2.33f)
                    lineToRelative(5.08f, 4.83f)
                    lineTo(21.98f, 12.34f)
                    close()
                }
            }
        }.build()
        
        return _Sign_language!!
    }

private var _Sign_language: ImageVector? = null

