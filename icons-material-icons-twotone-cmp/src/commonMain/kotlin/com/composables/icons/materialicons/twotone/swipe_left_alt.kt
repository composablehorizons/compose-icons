package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Swipe_left_alt: ImageVector
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
                    moveTo(18f, 12f)
                    arcTo(3f, 3f, 0f, false, true, 15f, 15f)
                    arcTo(3f, 3f, 0f, false, true, 12f, 12f)
                    arcTo(3f, 3f, 0f, false, true, 18f, 12f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(10.1f, 13f)
                    curveToRelative(0.46f, 2.28f, 2.48f, 4f, 4.9f, 4f)
                    curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                    reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                    curveToRelative(-2.42f, 0f, -4.44f, 1.72f, -4.9f, 4f)
                    horizontalLineTo(5.83f)
                    lineToRelative(1.59f, -1.59f)
                    lineTo(6f, 8f)
                    lineToRelative(-4f, 4f)
                    lineToRelative(4f, 4f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(5.83f, 13f)
                    horizontalLineTo(10.1f)
                    close()
                    moveTo(15f, 15f)
                    curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                    reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                    reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                    reflectiveCurveTo(16.66f, 15f, 15f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_left_alt!!
    }

private var _Swipe_left_alt: ImageVector? = null

