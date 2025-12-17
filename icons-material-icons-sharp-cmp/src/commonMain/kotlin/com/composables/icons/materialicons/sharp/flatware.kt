package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Flatware: ImageVector
    get() {
        if (_Flatware != null) return _Flatware!!
        
        _Flatware = ImageVector.Builder(
            name = "flatware",
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
                    moveTo(16f, 7.08f)
                    curveToRelative(0f, 1.77f, -0.84f, 3.25f, -2f, 3.82f)
                    verticalLineTo(21f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(10.9f)
                    curveToRelative(-1.16f, -0.57f, -2f, -2.05f, -2f, -3.82f)
                    curveTo(10.01f, 4.83f, 11.35f, 3f, 13f, 3f)
                    curveTo(14.66f, 3f, 16f, 4.83f, 16f, 7.08f)
                    close()
                    moveTo(17f, 3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-8f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    curveTo(21f, 5.24f, 19.76f, 3f, 17f, 3f)
                    close()
                    moveTo(8.28f, 3f)
                    horizontalLineTo(7.56f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(6.72f)
                    verticalLineTo(3f)
                    lineTo(6f, 3f)
                    lineTo(5.28f, 3f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(4.44f)
                    verticalLineTo(3f)
                    lineTo(3.72f, 3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(8f)
                    curveToRelative(0f, 0f, 0.9f, 0f, 2f, 0f)
                    verticalLineToRelative(10f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    curveToRelative(1.1f, 0f, 2f, 0f, 2f, 0f)
                    verticalLineTo(3f)
                    lineTo(8.28f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Flatware!!
    }

private var _Flatware: ImageVector? = null

