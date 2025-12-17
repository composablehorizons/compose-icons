package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Swipe_right_alt: ImageVector
    get() {
        if (_Swipe_right_alt != null) return _Swipe_right_alt!!
        
        _Swipe_right_alt = ImageVector.Builder(
            name = "swipe_right_alt",
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
                    moveTo(12f, 12f)
                    arcTo(3f, 3f, 0f, false, true, 9f, 15f)
                    arcTo(3f, 3f, 0f, false, true, 6f, 12f)
                    arcTo(3f, 3f, 0f, false, true, 12f, 12f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13.9f, 11f)
                    curveTo(13.44f, 8.72f, 11.42f, 7f, 9f, 7f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                    curveToRelative(2.42f, 0f, 4.44f, -1.72f, 4.9f, -4f)
                    horizontalLineToRelative(4.27f)
                    lineToRelative(-1.59f, 1.59f)
                    lineTo(18f, 16f)
                    lineToRelative(4f, -4f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(18.17f, 11f)
                    horizontalLineTo(13.9f)
                    close()
                    moveTo(9f, 9f)
                    curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                    reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                    reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                    reflectiveCurveTo(7.34f, 9f, 9f, 9f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_right_alt!!
    }

private var _Swipe_right_alt: ImageVector? = null

