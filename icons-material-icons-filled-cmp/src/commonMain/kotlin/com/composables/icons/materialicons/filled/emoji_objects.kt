package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Emoji_objects: ImageVector
    get() {
        if (_Emoji_objects != null) return _Emoji_objects!!
        
        _Emoji_objects = ImageVector.Builder(
            name = "emoji_objects",
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
                group {
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 3f)
                    curveToRelative(-0.46f, 0f, -0.93f, 0.04f, -1.4f, 0.14f)
                    curveTo(7.84f, 3.67f, 5.64f, 5.9f, 5.12f, 8.66f)
                    curveToRelative(-0.48f, 2.61f, 0.48f, 5.01f, 2.22f, 6.56f)
                    curveTo(7.77f, 15.6f, 8f, 16.13f, 8f, 16.69f)
                    verticalLineTo(19f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(0.28f)
                    curveToRelative(0.35f, 0.6f, 0.98f, 1f, 1.72f, 1f)
                    reflectiveCurveToRelative(1.38f, -0.4f, 1.72f, -1f)
                    horizontalLineTo(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-2.31f)
                    curveToRelative(0f, -0.55f, 0.22f, -1.09f, 0.64f, -1.46f)
                    curveTo(18.09f, 13.95f, 19f, 12.08f, 19f, 10f)
                    curveTo(19f, 6.13f, 15.87f, 3f, 12f, 3f)
                    close()
                    moveTo(14f, 19f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(19f)
                    close()
                    moveTo(14f, 17f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(17f)
                    close()
                    moveTo(12.5f, 11.41f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-2.59f)
                    lineTo(9.67f, 9.59f)
                    lineToRelative(0.71f, -0.71f)
                    lineTo(12f, 10.5f)
                    lineToRelative(1.62f, -1.62f)
                    lineToRelative(0.71f, 0.71f)
                    lineTo(12.5f, 11.41f)
                    close()
                }
            }
        }.build()
        
        return _Emoji_objects!!
    }

private var _Emoji_objects: ImageVector? = null

