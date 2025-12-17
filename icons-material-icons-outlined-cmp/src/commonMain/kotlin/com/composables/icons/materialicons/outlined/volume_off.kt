package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Volume_off: ImageVector
    get() {
        if (_Volume_off != null) return _Volume_off!!
        
        _Volume_off = ImageVector.Builder(
            name = "volume_off",
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
                moveTo(4.34f, 2.93f)
                lineTo(2.93f, 4.34f)
                lineTo(7.29f, 8.7f)
                lineTo(7f, 9f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                lineToRelative(5f, 5f)
                verticalLineToRelative(-6.59f)
                lineToRelative(4.18f, 4.18f)
                curveToRelative(-0.65f, 0.49f, -1.38f, 0.88f, -2.18f, 1.11f)
                verticalLineToRelative(2.06f)
                curveToRelative(1.34f, -0.3f, 2.57f, -0.92f, 3.61f, -1.75f)
                lineToRelative(2.05f, 2.05f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.34f, 2.93f)
                close()
                moveTo(10f, 15.17f)
                lineTo(7.83f, 13f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.83f)
                lineToRelative(0.88f, -0.88f)
                lineTo(10f, 11.41f)
                verticalLineToRelative(3.76f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 0.82f, -0.15f, 1.61f, -0.41f, 2.34f)
                lineToRelative(1.53f, 1.53f)
                curveToRelative(0.56f, -1.17f, 0.88f, -2.48f, 0.88f, -3.87f)
                curveToRelative(0f, -4.28f, -2.99f, -7.86f, -7f, -8.77f)
                verticalLineToRelative(2.06f)
                curveToRelative(2.89f, 0.86f, 5f, 3.54f, 5f, 6.71f)
                close()
                moveToRelative(-7f, -8f)
                lineToRelative(-1.88f, 1.88f)
                lineTo(12f, 7.76f)
                close()
                moveToRelative(4.5f, 8f)
                curveToRelative(0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f)
                verticalLineToRelative(1.79f)
                lineToRelative(2.48f, 2.48f)
                curveToRelative(0.01f, -0.08f, 0.02f, -0.16f, 0.02f, -0.24f)
                close()
            }
        }.build()
        
        return _Volume_off!!
    }

private var _Volume_off: ImageVector? = null

