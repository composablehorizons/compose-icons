package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Shuffle_on: ImageVector
    get() {
        if (_Shuffle_on != null) return _Shuffle_on!!
        
        _Shuffle_on = ImageVector.Builder(
            name = "shuffle_on",
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
                    moveTo(21f, 1f)
                    horizontalLineTo(3f)
                    curveTo(1.9f, 1f, 1f, 1.9f, 1f, 3f)
                    verticalLineToRelative(18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(18f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(3f)
                    curveTo(23f, 1.9f, 22.1f, 1f, 21f, 1f)
                    close()
                    moveTo(4.3f, 4.7f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(4.47f, 4.47f)
                    lineToRelative(-1.42f, 1.4f)
                    lineTo(4.3f, 6.11f)
                    curveTo(3.91f, 5.72f, 3.91f, 5.09f, 4.3f, 4.7f)
                    close()
                    moveTo(19.59f, 19.5f)
                    curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                    horizontalLineTo(15.3f)
                    curveToRelative(-0.45f, 0f, -0.67f, -0.54f, -0.36f, -0.85f)
                    lineToRelative(1.2f, -1.2f)
                    lineToRelative(-3.13f, -3.13f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(3.13f, 3.14f)
                    lineToRelative(1.19f, -1.19f)
                    curveToRelative(0.31f, -0.32f, 0.85f, -0.1f, 0.85f, 0.35f)
                    verticalLineTo(19.5f)
                    close()
                    moveTo(19.59f, 8.29f)
                    curveToRelative(0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.36f)
                    lineToRelative(-1.19f, -1.19f)
                    lineTo(5.7f, 19.29f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineTo(16.13f, 6.04f)
                    lineToRelative(-1.19f, -1.19f)
                    curveTo(14.63f, 4.54f, 14.85f, 4f, 15.3f, 4f)
                    horizontalLineToRelative(3.79f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    verticalLineTo(8.29f)
                    close()
                }
            }
        }.build()
        
        return _Shuffle_on!!
    }

private var _Shuffle_on: ImageVector? = null

