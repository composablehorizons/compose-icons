package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Checkroom: ImageVector
    get() {
        if (_Checkroom != null) return _Checkroom!!
        
        _Checkroom = ImageVector.Builder(
            name = "checkroom",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21.6f, 18.2f)
                    lineTo(13f, 11.75f)
                    verticalLineToRelative(-0.91f)
                    curveToRelative(1.65f, -0.49f, 2.8f, -2.17f, 2.43f, -4.05f)
                    curveToRelative(-0.26f, -1.31f, -1.3f, -2.4f, -2.61f, -2.7f)
                    curveToRelative(-1.76f, -0.4f, -3.37f, 0.53f, -4.02f, 1.98f)
                    curveTo(8.5f, 6.74f, 8.98f, 7.5f, 9.71f, 7.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.39f, 0f, 0.75f, -0.22f, 0.9f, -0.57f)
                    curveTo(10.84f, 6.38f, 11.37f, 6f, 12f, 6f)
                    curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                    curveToRelative(0f, 0.84f, -0.69f, 1.52f, -1.53f, 1.5f)
                    curveTo(11.43f, 8.99f, 11f, 9.45f, 11f, 9.99f)
                    lineToRelative(0f, 1.76f)
                    lineTo(2.4f, 18.2f)
                    curveTo(1.63f, 18.78f, 2.04f, 20f, 3f, 20f)
                    horizontalLineToRelative(9f)
                    horizontalLineToRelative(9f)
                    curveTo(21.96f, 20f, 22.37f, 18.78f, 21.6f, 18.2f)
                    close()
                    moveTo(6f, 18f)
                    lineToRelative(6f, -4.5f)
                    lineToRelative(6f, 4.5f)
                    horizontalLineTo(6f)
                    close()
                }
            }
        }.build()
        
        return _Checkroom!!
    }

private var _Checkroom: ImageVector? = null

