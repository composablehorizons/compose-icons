package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sign_language: ImageVector
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
                    lineToRelative(-0.93f, -1.86f)
                    curveToRelative(-0.37f, -0.74f, -0.07f, -1.64f, 0.67f, -2.01f)
                    lineTo(12.49f, 9f)
                    lineToRelative(5.73f, 5.46f)
                    curveToRelative(0.5f, 0.47f, 0.78f, 1.13f, 0.78f, 1.81f)
                    verticalLineToRelative(5.23f)
                    curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                    horizontalLineToRelative(-11f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineTo(10f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(3f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(4.5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineTo(12.49f)
                    close()
                    moveTo(11.78f, 7.12f)
                    curveToRelative(-0.84f, 0.4f, -1.17f, 0.62f, -1.63f, 1.19f)
                    lineToRelative(-2.7f, -2.85f)
                    curveToRelative(-0.38f, -0.4f, -0.36f, -1.03f, 0.04f, -1.41f)
                    curveToRelative(0.4f, -0.38f, 1.03f, -0.36f, 1.41f, 0.04f)
                    lineTo(11.78f, 7.12f)
                    close()
                    moveTo(9.64f, 9.21f)
                    curveTo(9.41f, 9.76f, 9.35f, 10.45f, 9.44f, 11f)
                    horizontalLineTo(8.58f)
                    lineTo(6.31f, 8.61f)
                    curveTo(5.93f, 8.21f, 5.94f, 7.58f, 6.35f, 7.2f)
                    curveToRelative(0.4f, -0.38f, 1.03f, -0.36f, 1.41f, 0.04f)
                    lineTo(9.64f, 9.21f)
                    close()
                    moveTo(20.33f, 13.91f)
                    lineToRelative(0.88f, -0.83f)
                    curveToRelative(0.5f, -0.47f, 0.79f, -1.13f, 0.79f, -1.82f)
                    verticalLineTo(3.35f)
                    lineToRelative(-0.27f, -0.1f)
                    curveToRelative(-0.78f, -0.28f, -1.64f, 0.12f, -1.92f, 0.9f)
                    lineTo(19.1f, 6.11f)
                    lineToRelative(-5.5f, -5.8f)
                    curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.04f)
                    curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.04f, 1.41f)
                    lineToRelative(3.79f, 3.99f)
                    lineToRelative(-0.73f, 0.69f)
                    lineToRelative(-4.82f, -5.08f)
                    curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.04f)
                    curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.04f, 1.41f)
                    lineToRelative(3.78f, 3.98f)
                    lineTo(15.38f, 9f)
                    lineToRelative(3.61f, 3.43f)
                    lineToRelative(0.61f, 0.58f)
                    curveTo(19.89f, 13.28f, 20.13f, 13.58f, 20.33f, 13.91f)
                    close()
                }
            }
        }.build()
        
        return _Sign_language!!
    }

private var _Sign_language: ImageVector? = null

