package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Cake: ImageVector
    get() {
        if (_Cake != null) return _Cake!!
        
        _Cake = ImageVector.Builder(
            name = "cake",
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
                moveTo(12f, 6f)
                curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.38f, -0.1f, -0.73f, -0.29f, -1.03f)
                lineTo(12f, 0f)
                lineToRelative(-1.71f, 2.97f)
                curveToRelative(-0.19f, 0.3f, -0.29f, 0.65f, -0.29f, 1.03f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(6f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveToRelative(1f, 11f)
                horizontalLineTo(5f)
                verticalLineToRelative(-3f)
                curveToRelative(0.9f, -0.01f, 1.76f, -0.37f, 2.4f, -1.01f)
                lineToRelative(1.09f, -1.07f)
                lineToRelative(1.07f, 1.07f)
                curveToRelative(1.31f, 1.31f, 3.59f, 1.3f, 4.89f, 0f)
                lineToRelative(1.08f, -1.07f)
                lineToRelative(1.07f, 1.07f)
                curveToRelative(0.64f, 0.64f, 1.5f, 1f, 2.4f, 1.01f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(0f, -4.5f)
                curveToRelative(-0.51f, -0.01f, -0.99f, -0.2f, -1.35f, -0.57f)
                lineToRelative(-2.13f, -2.13f)
                lineToRelative(-2.14f, 2.13f)
                curveToRelative(-0.74f, 0.74f, -2.03f, 0.74f, -2.77f, 0f)
                lineTo(8.48f, 12.8f)
                lineToRelative(-2.14f, 2.13f)
                curveToRelative(-0.35f, 0.36f, -0.83f, 0.56f, -1.34f, 0.57f)
                verticalLineTo(12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.5f)
                close()
            }
        }.build()
        
        return _Cake!!
    }

private var _Cake: ImageVector? = null

