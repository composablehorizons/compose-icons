package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Dinner_dining: ImageVector
    get() {
        if (_Dinner_dining != null) return _Dinner_dining!!
        
        _Dinner_dining = ImageVector.Builder(
            name = "dinner_dining",
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
                    moveTo(2f, 19f)
                    horizontalLineToRelative(20f)
                    lineToRelative(-2f, 2f)
                    horizontalLineTo(4f)
                    lineTo(2f, 19f)
                    close()
                    moveTo(5f, 6f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(5f)
                    verticalLineTo(6f)
                    close()
                    moveTo(5f, 4f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(5f)
                    verticalLineTo(4f)
                    close()
                    moveTo(9f, 4f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(7f)
                    verticalLineTo(4f)
                    horizontalLineTo(9f)
                    close()
                    moveTo(9f, 7f)
                    horizontalLineTo(7f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(6f, 15.23f)
                    curveToRelative(-0.36f, 0.11f, -0.69f, 0.28f, -1f, 0.47f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(15.23f)
                    close()
                    moveTo(4f, 16.52f)
                    curveTo(3.62f, 16.96f, 3.32f, 17.45f, 3.16f, 18f)
                    horizontalLineToRelative(16.82f)
                    curveToRelative(0.01f, -0.16f, 0.03f, -0.33f, 0.03f, -0.5f)
                    curveToRelative(0f, -3.04f, -2.46f, -5.5f, -5.5f, -5.5f)
                    curveToRelative(-2.29f, 0f, -4.25f, 1.4f, -5.08f, 3.4f)
                    curveTo(8.84f, 15.15f, 8.19f, 15f, 7.5f, 15f)
                    curveToRelative(-0.17f, 0f, -0.33f, 0.02f, -0.5f, 0.04f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(2f)
                    curveToRelative(1.03f, 0.06f, 1.9f, -0.96f, 2f, -2f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(5f)
                    horizontalLineTo(11f)
                    curveToRelative(-0.1f, -1.05f, -0.97f, -1.97f, -2f, -2f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(16.52f)
                    close()
                }
            }
        }.build()
        
        return _Dinner_dining!!
    }

private var _Dinner_dining: ImageVector? = null

