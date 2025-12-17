package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Add_a_photo: ImageVector
    get() {
        if (_Add_a_photo != null) return _Add_a_photo!!
        
        _Add_a_photo = ImageVector.Builder(
            name = "add_a_photo",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 4f)
                verticalLineTo(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(3f, 6f)
                verticalLineTo(7f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(7f)
                lineToRelative(1.83f, 2f)
                horizontalLineTo(23f)
                verticalLineToRelative(16f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(7f, 9f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveToRelative(-3f, -5f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                close()
            }
        }.build()
        
        return _Add_a_photo!!
    }

private var _Add_a_photo: ImageVector? = null

