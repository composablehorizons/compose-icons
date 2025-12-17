package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dining: ImageVector
    get() {
        if (_Dining != null) return _Dining!!
        
        _Dining = ImageVector.Builder(
            name = "dining",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(20f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(2f)
                    close()
                    moveTo(11f, 10.3f)
                    curveToRelative(0f, 0.93f, -0.64f, 1.71f, -1.5f, 1.93f)
                    verticalLineTo(19f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-6.77f)
                    curveToRelative(-0.86f, -0.22f, -1.5f, -1f, -1.5f, -1.93f)
                    verticalLineTo(6f)
                    horizontalLineTo(7f)
                    horizontalLineToRelative(0.5f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(0.75f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(0.5f)
                    horizontalLineToRelative(0.5f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(10f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(0.5f)
                    horizontalLineTo(11f)
                    verticalLineTo(10.3f)
                    close()
                    moveTo(15.58f, 12.59f)
                    lineToRelative(-0.08f, 0.03f)
                    verticalLineTo(19f)
                    horizontalLineTo(14f)
                    verticalLineToRelative(-6.38f)
                    lineToRelative(-0.08f, -0.04f)
                    curveToRelative(-0.97f, -0.47f, -1.67f, -1.7f, -1.67f, -3.18f)
                    curveToRelative(0f, -1.88f, 1.13f, -3.4f, 2.5f, -3.4f)
                    curveToRelative(1.38f, 0f, 2.5f, 1.53f, 2.5f, 3.41f)
                    curveTo(17.25f, 10.89f, 16.55f, 12.12f, 15.58f, 12.59f)
                    close()
                }
            }
        }.build()
        
        return _Dining!!
    }

private var _Dining: ImageVector? = null

