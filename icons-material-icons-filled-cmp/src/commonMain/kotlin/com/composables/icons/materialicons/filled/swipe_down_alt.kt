package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Swipe_down_alt: ImageVector
    get() {
        if (_Swipe_down_alt != null) return _Swipe_down_alt!!
        
        _Swipe_down_alt = ImageVector.Builder(
            name = "swipe_down_alt",
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
                    moveTo(13f, 13.9f)
                    curveToRelative(2.28f, -0.46f, 4f, -2.48f, 4f, -4.9f)
                    curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                    reflectiveCurveTo(7f, 6.24f, 7f, 9f)
                    curveToRelative(0f, 2.42f, 1.72f, 4.44f, 4f, 4.9f)
                    verticalLineToRelative(4.27f)
                    lineToRelative(-1.59f, -1.59f)
                    lineTo(8f, 18f)
                    lineToRelative(4f, 4f)
                    lineToRelative(4f, -4f)
                    lineToRelative(-1.41f, -1.41f)
                    lineTo(13f, 18.17f)
                    verticalLineTo(13.9f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_down_alt!!
    }

private var _Swipe_down_alt: ImageVector? = null

