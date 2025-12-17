package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Format_textdirection_l_to_r: ImageVector
    get() {
        if (_Format_textdirection_l_to_r != null) return _Format_textdirection_l_to_r!!
        
        _Format_textdirection_l_to_r = ImageVector.Builder(
            name = "format_textdirection_l_to_r",
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
                moveTo(9f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(9.17f)
                curveTo(7.08f, 2f, 5.22f, 3.53f, 5.02f, 5.61f)
                curveTo(4.79f, 7.99f, 6.66f, 10f, 9f, 10f)
                close()
                moveToRelative(11.65f, 7.65f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.32f, -0.32f, -0.86f, -0.1f, -0.86f, 0.35f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1.79f)
                curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.7f)
                close()
            }
        }.build()
        
        return _Format_textdirection_l_to_r!!
    }

private var _Format_textdirection_l_to_r: ImageVector? = null

