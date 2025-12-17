package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_textdirection_l_to_r: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 10f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                curveTo(6.79f, 2f, 5f, 3.79f, 5f, 6f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveToRelative(12f, 8f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                lineToRelative(4f, -4f)
                close()
            }
        }.build()
        
        return _Format_textdirection_l_to_r!!
    }

private var _Format_textdirection_l_to_r: ImageVector? = null

