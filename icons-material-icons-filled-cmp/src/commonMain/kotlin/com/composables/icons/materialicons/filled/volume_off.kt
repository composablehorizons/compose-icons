package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Volume_off: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.5f, 12f)
                curveToRelative(0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f)
                verticalLineToRelative(2.21f)
                lineToRelative(2.45f, 2.45f)
                curveToRelative(0.03f, -0.2f, 0.05f, -0.41f, 0.05f, -0.63f)
                close()
                moveToRelative(2.5f, 0f)
                curveToRelative(0f, 0.94f, -0.2f, 1.82f, -0.54f, 2.64f)
                lineToRelative(1.51f, 1.51f)
                curveTo(20.63f, 14.91f, 21f, 13.5f, 21f, 12f)
                curveToRelative(0f, -4.28f, -2.99f, -7.86f, -7f, -8.77f)
                verticalLineToRelative(2.06f)
                curveToRelative(2.89f, 0.86f, 5f, 3.54f, 5f, 6.71f)
                close()
                moveTo(4.27f, 3f)
                lineTo(3f, 4.27f)
                lineTo(7.73f, 9f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                lineToRelative(5f, 5f)
                verticalLineToRelative(-6.73f)
                lineToRelative(4.25f, 4.25f)
                curveToRelative(-0.67f, 0.52f, -1.42f, 0.93f, -2.25f, 1.18f)
                verticalLineToRelative(2.06f)
                curveToRelative(1.38f, -0.31f, 2.63f, -0.95f, 3.69f, -1.81f)
                lineTo(19.73f, 21f)
                lineTo(21f, 19.73f)
                lineToRelative(-9f, -9f)
                lineTo(4.27f, 3f)
                close()
                moveTo(12f, 4f)
                lineTo(9.91f, 6.09f)
                lineTo(12f, 8.18f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Volume_off!!
    }

private var _Volume_off: ImageVector? = null

