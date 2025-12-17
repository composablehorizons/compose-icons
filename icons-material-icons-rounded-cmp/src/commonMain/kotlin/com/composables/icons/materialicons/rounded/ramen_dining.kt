package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Ramen_dining: ImageVector
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
                    moveTo(22f, 2.84f)
                    lineTo(22f, 2.84f)
                    curveToRelative(0f, -0.45f, -0.39f, -0.79f, -0.83f, -0.75f)
                    lineTo(4.89f, 3.9f)
                    curveTo(4.38f, 3.95f, 4f, 4.38f, 4f, 4.89f)
                    verticalLineTo(12f)
                    horizontalLineTo(3.08f)
                    curveToRelative(-0.6f, 0f, -1.08f, 0.53f, -1f, 1.13f)
                    curveTo(2.52f, 16.33f, 4.83f, 19f, 8f, 20.25f)
                    verticalLineTo(21f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(6f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-0.75f)
                    curveToRelative(3.17f, -1.25f, 5.48f, -3.92f, 5.92f, -7.12f)
                    curveToRelative(0.08f, -0.6f, -0.4f, -1.13f, -1f, -1.13f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(10.75f)
                    curveTo(21.66f, 8f, 22f, 7.66f, 22f, 7.25f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(4.78f)
                    lineToRelative(10.83f, -1.19f)
                    curveTo(21.71f, 3.54f, 22f, 3.22f, 22f, 2.84f)
                    close()
                    moveTo(6.5f, 5.22f)
                    verticalLineTo(6.5f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(5.34f)
                    lineTo(6.5f, 5.22f)
                    close()
                    moveTo(5.5f, 8f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(8f)
                    close()
                    moveTo(9f, 12f)
                    horizontalLineTo(8f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(12f)
                    close()
                    moveTo(9f, 6.5f)
                    horizontalLineTo(8f)
                    verticalLineTo(5.06f)
                    lineToRelative(1f, -0.11f)
                    verticalLineTo(6.5f)
                    close()
                }
            }
        }.build()
        
        return _Ramen_dining!!
    }

private var _Ramen_dining: ImageVector? = null

