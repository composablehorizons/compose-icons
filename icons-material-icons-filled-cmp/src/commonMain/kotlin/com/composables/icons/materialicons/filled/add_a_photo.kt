package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Add_a_photo: ImageVector
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
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
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
                horizontalLineTo(3f)
                close()
                moveTo(6f, 10f)
                verticalLineTo(7f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(7f)
                lineToRelative(1.83f, 2f)
                horizontalLineTo(21f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                close()
                moveTo(13f, 19f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveTo(10.24f, 19f, 13f, 19f)
                close()
                moveTo(9.8f, 14f)
                curveToRelative(0f, 1.77f, 1.43f, 3.2f, 3.2f, 3.2f)
                reflectiveCurveToRelative(3.2f, -1.43f, 3.2f, -3.2f)
                reflectiveCurveToRelative(-1.43f, -3.2f, -3.2f, -3.2f)
                reflectiveCurveTo(9.8f, 12.23f, 9.8f, 14f)
                close()
            }
        }.build()
        
        return _Add_a_photo!!
    }

private var _Add_a_photo: ImageVector? = null

