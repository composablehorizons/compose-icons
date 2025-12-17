package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Swipe_up_alt: ImageVector
    get() {
        if (_Swipe_up_alt != null) return _Swipe_up_alt!!
        
        _Swipe_up_alt = ImageVector.Builder(
            name = "swipe_up_alt",
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
                    moveTo(15f, 15f)
                    arcTo(3f, 3f, 0f, false, true, 12f, 18f)
                    arcTo(3f, 3f, 0f, false, true, 9f, 15f)
                    arcTo(3f, 3f, 0f, false, true, 15f, 15f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 5.83f)
                    lineToRelative(1.59f, 1.59f)
                    lineTo(16f, 6f)
                    lineToRelative(-4f, -4f)
                    lineTo(8f, 6f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(11f, 5.83f)
                    verticalLineToRelative(4.27f)
                    curveToRelative(-2.28f, 0.46f, -4f, 2.48f, -4f, 4.9f)
                    curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                    reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                    curveToRelative(0f, -2.42f, -1.72f, -4.44f, -4f, -4.9f)
                    verticalLineTo(5.83f)
                    close()
                    moveTo(12f, 18f)
                    curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                    reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                    reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                    reflectiveCurveTo(13.66f, 18f, 12f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_up_alt!!
    }

private var _Swipe_up_alt: ImageVector? = null

