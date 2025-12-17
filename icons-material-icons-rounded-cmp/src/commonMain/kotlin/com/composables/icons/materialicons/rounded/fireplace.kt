package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fireplace: ImageVector
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
                    moveTo(20f, 2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                    close()
                    moveTo(20f, 19f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-1.15f)
                    curveToRelative(0.71f, -0.85f, 1.15f, -1.89f, 1.15f, -3f)
                    curveToRelative(0f, -1.89f, -1.09f, -2.84f, -1.85f, -3.36f)
                    curveToRelative(-1.86f, -1.27f, -2.23f, -2.78f, -2.25f, -3.72f)
                    curveToRelative(-0.01f, -0.4f, -0.43f, -0.63f, -0.77f, -0.43f)
                    curveToRelative(-5.8f, 3.43f, -5.15f, 7f, -5.13f, 7.51f)
                    curveToRelative(0.03f, 0.96f, 0.49f, 2.07f, 1.24f, 3f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(14f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(19f)
                    close()
                    moveTo(13.2f, 13.74f)
                    curveToRelative(-0.08f, -0.46f, -0.07f, -0.85f, 0.08f, -1.28f)
                    curveToRelative(0.54f, 1.21f, 2.15f, 1.64f, 1.98f, 3.18f)
                    curveToRelative(-0.19f, 1.69f, -2.11f, 2.37f, -3.39f, 1.32f)
                    curveToRelative(0.76f, -0.24f, 1.4f, -1.04f, 1.53f, -1.63f)
                    curveTo(13.52f, 14.78f, 13.29f, 14.29f, 13.2f, 13.74f)
                    close()
                }
            }
        }.build()
        
        return _Fireplace!!
    }

private var _Fireplace: ImageVector? = null

