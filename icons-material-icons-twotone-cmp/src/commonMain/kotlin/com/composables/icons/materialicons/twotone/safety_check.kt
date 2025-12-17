package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Safety_check: ImageVector
    get() {
        if (_Safety_check != null) return _Safety_check!!
        
        _Safety_check = ImageVector.Builder(
            name = "safety_check",
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
                    moveTo(12f, 4.14f)
                    lineTo(6f, 6.39f)
                    verticalLineToRelative(4.7f)
                    curveToRelative(0f, 4f, 2.55f, 7.7f, 6f, 8.83f)
                    curveToRelative(3.45f, -1.13f, 6f, -4.82f, 6f, -8.83f)
                    verticalLineToRelative(-4.7f)
                    lineTo(12f, 4.14f)
                    close()
                    moveTo(12f, 17f)
                    curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                    reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                    reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                    reflectiveCurveTo(14.76f, 17f, 12f, 17f)
                    close()
                    moveTo(13.65f, 14.35f)
                    lineToRelative(-2.15f, -2.15f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2.79f)
                    lineToRelative(1.85f, 1.85f)
                    lineTo(13.65f, 14.35f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    lineTo(4f, 5f)
                    verticalLineToRelative(6.09f)
                    curveToRelative(0f, 5.05f, 3.41f, 9.76f, 8f, 10.91f)
                    curveToRelative(4.59f, -1.15f, 8f, -5.86f, 8f, -10.91f)
                    verticalLineTo(5f)
                    lineTo(12f, 2f)
                    close()
                    moveTo(18f, 11.09f)
                    curveToRelative(0f, 4f, -2.55f, 7.7f, -6f, 8.83f)
                    curveToRelative(-3.45f, -1.13f, -6f, -4.82f, -6f, -8.83f)
                    verticalLineToRelative(-4.7f)
                    lineToRelative(6f, -2.25f)
                    lineToRelative(6f, 2.25f)
                    verticalLineTo(11.09f)
                    close()
                    moveTo(12f, 7f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                    reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                    reflectiveCurveTo(14.76f, 7f, 12f, 7f)
                    close()
                    moveTo(13.65f, 14.35f)
                    lineToRelative(-2.15f, -2.15f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2.79f)
                    lineToRelative(1.85f, 1.85f)
                    lineTo(13.65f, 14.35f)
                    close()
                }
            }
        }.build()
        
        return _Safety_check!!
    }

private var _Safety_check: ImageVector? = null

