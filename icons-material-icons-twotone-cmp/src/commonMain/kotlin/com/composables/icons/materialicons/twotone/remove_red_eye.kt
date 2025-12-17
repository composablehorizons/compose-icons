package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Remove_red_eye: ImageVector
    get() {
        if (_Remove_red_eye != null) return _Remove_red_eye!!
        
        _Remove_red_eye = ImageVector.Builder(
            name = "remove_red_eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6.5f)
                curveToRelative(-3.79f, 0f, -7.17f, 2.13f, -8.82f, 5.5f)
                curveToRelative(1.65f, 3.37f, 5.02f, 5.5f, 8.82f, 5.5f)
                reflectiveCurveToRelative(7.17f, -2.13f, 8.82f, -5.5f)
                curveTo(19.17f, 8.63f, 15.79f, 6.5f, 12f, 6.5f)
                close()
                moveToRelative(0f, 10f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveTo(9.52f, 7.5f, 12f, 7.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 4.5f)
                curveTo(7f, 4.5f, 2.73f, 7.61f, 1f, 12f)
                curveToRelative(1.73f, 4.39f, 6f, 7.5f, 11f, 7.5f)
                reflectiveCurveToRelative(9.27f, -3.11f, 11f, -7.5f)
                curveToRelative(-1.73f, -4.39f, -6f, -7.5f, -11f, -7.5f)
                close()
                moveToRelative(0f, 13f)
                curveToRelative(-3.79f, 0f, -7.17f, -2.13f, -8.82f, -5.5f)
                curveTo(4.83f, 8.63f, 8.21f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(7.17f, 2.13f, 8.82f, 5.5f)
                curveToRelative(-1.65f, 3.37f, -5.03f, 5.5f, -8.82f, 5.5f)
                close()
                moveToRelative(0f, -10f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveToRelative(0f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.build()
        
        return _Remove_red_eye!!
    }

private var _Remove_red_eye: ImageVector? = null

