package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Golf_course: ImageVector
    get() {
        if (_Golf_course != null) return _Golf_course!!
        
        _Golf_course = ImageVector.Builder(
            name = "golf_course",
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
                moveTo(21f, 19.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 19.5f, 21f)
                arcTo(1.5f, 1.5f, 0f, false, true, 18f, 19.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 21f, 19.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 5.92f)
                lineTo(9f, 2f)
                verticalLineToRelative(18f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1.73f)
                curveToRelative(-1.79f, 0.35f, -3f, 0.99f, -3f, 1.73f)
                curveToRelative(0f, 1.1f, 2.69f, 2f, 6f, 2f)
                reflectiveCurveToRelative(6f, -0.9f, 6f, -2f)
                curveToRelative(0f, -0.99f, -2.16f, -1.81f, -5f, -1.97f)
                verticalLineTo(8.98f)
                lineToRelative(6f, -3.06f)
                close()
            }
        }.build()
        
        return _Golf_course!!
    }

private var _Golf_course: ImageVector? = null

