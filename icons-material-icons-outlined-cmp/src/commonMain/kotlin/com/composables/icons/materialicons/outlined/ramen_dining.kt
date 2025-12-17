package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Ramen_dining: ImageVector
    get() {
        if (_Ramen_dining != null) return _Ramen_dining!!
        
        _Ramen_dining = ImageVector.Builder(
            name = "ramen_dining",
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
                    moveTo(19.66f, 14f)
                    curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f)
                    lineTo(14f, 18.89f)
                    verticalLineTo(20f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-1.11f)
                    lineToRelative(-1.27f, -0.5f)
                    curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f)
                    horizontalLineTo(19.66f)
                    moveTo(22f, 2f)
                    lineTo(4f, 3.99f)
                    verticalLineTo(12f)
                    horizontalLineTo(2f)
                    curveToRelative(0f, 3.69f, 2.47f, 6.86f, 6f, 8.25f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-1.75f)
                    curveToRelative(3.53f, -1.39f, 6f, -4.56f, 6f, -8.25f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(8f)
                    horizontalLineTo(22f)
                    verticalLineTo(6.5f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(4.78f)
                    lineTo(22f, 3.51f)
                    verticalLineTo(2f)
                    lineTo(22f, 2f)
                    close()
                    moveTo(8f, 6.5f)
                    verticalLineTo(5.06f)
                    lineToRelative(1f, -0.11f)
                    verticalLineTo(6.5f)
                    horizontalLineTo(8f)
                    lineTo(8f, 6.5f)
                    close()
                    moveTo(5.5f, 6.5f)
                    verticalLineTo(5.34f)
                    lineToRelative(1f, -0.11f)
                    verticalLineTo(6.5f)
                    horizontalLineTo(5.5f)
                    lineTo(5.5f, 6.5f)
                    close()
                    moveTo(8f, 12f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(8f)
                    lineTo(8f, 12f)
                    close()
                    moveTo(5.5f, 12f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(5.5f)
                    lineTo(5.5f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Ramen_dining!!
    }

private var _Ramen_dining: ImageVector? = null

