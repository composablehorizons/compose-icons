package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Swipe_left_alt: ImageVector
    get() {
        if (_Swipe_left_alt != null) return _Swipe_left_alt!!
        
        _Swipe_left_alt = ImageVector.Builder(
            name = "swipe_left_alt",
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
                    moveTo(10.1f, 13f)
                    curveToRelative(0.46f, 2.28f, 2.48f, 4f, 4.9f, 4f)
                    curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                    reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                    curveToRelative(-2.42f, 0f, -4.44f, 1.72f, -4.9f, 4f)
                    horizontalLineTo(5.83f)
                    lineToRelative(0.88f, -0.88f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(-2.59f, 2.59f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(2.59f, 2.59f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(5.83f, 13f)
                    horizontalLineTo(10.1f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_left_alt!!
    }

private var _Swipe_left_alt: ImageVector? = null

