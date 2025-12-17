package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Format_textdirection_r_to_l: ImageVector
    get() {
        if (_Format_textdirection_r_to_l != null) return _Format_textdirection_r_to_l!!
        
        _Format_textdirection_r_to_l = ImageVector.Builder(
            name = "format_textdirection_r_to_l",
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
                moveTo(10f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                moveToRelative(8f, -2f)
                horizontalLineToRelative(-8f)
                curveTo(7.79f, 2f, 6f, 3.79f, 6f, 6f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                close()
                moveTo(8f, 14f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Format_textdirection_r_to_l!!
    }

private var _Format_textdirection_r_to_l: ImageVector? = null

