package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Fireplace: ImageVector
    get() {
        if (_Fireplace != null) return _Fireplace!!
        
        _Fireplace = ImageVector.Builder(
            name = "fireplace",
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
                    moveTo(2f, 2f)
                    verticalLineToRelative(20f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(2f)
                    horizontalLineTo(2f)
                    close()
                    moveTo(13.2f, 13.74f)
                    curveToRelative(-0.08f, -0.46f, -0.07f, -0.85f, 0.08f, -1.28f)
                    curveToRelative(0.54f, 1.21f, 2.15f, 1.64f, 1.98f, 3.18f)
                    curveToRelative(-0.19f, 1.69f, -2.11f, 2.37f, -3.39f, 1.32f)
                    curveToRelative(0.76f, -0.24f, 1.4f, -1.04f, 1.53f, -1.63f)
                    curveTo(13.52f, 14.78f, 13.29f, 14.29f, 13.2f, 13.74f)
                    close()
                    moveTo(20f, 20f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2.02f)
                    curveToRelative(0.63f, -0.84f, 1.02f, -1.87f, 1.02f, -3f)
                    curveToRelative(0f, -1.89f, -1.09f, -2.85f, -1.85f, -3.37f)
                    curveTo(12.2f, 9.61f, 13f, 7f, 13f, 7f)
                    curveToRelative(-6.73f, 3.57f, -6.02f, 7.47f, -6f, 8f)
                    curveToRelative(0.03f, 0.96f, 0.49f, 2.07f, 1.23f, 3f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Fireplace!!
    }

private var _Fireplace: ImageVector? = null

