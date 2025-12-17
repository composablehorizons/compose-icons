package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Phonelink_lock: ImageVector
    get() {
        if (_Phonelink_lock != null) return _Phonelink_lock!!
        
        _Phonelink_lock = ImageVector.Builder(
            name = "phonelink_lock",
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
                moveTo(19f, 1f)
                horizontalLineTo(9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(16f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-8.2f, 10f)
                verticalLineTo(9.5f)
                curveTo(10.8f, 8.1f, 9.4f, 7f, 8f, 7f)
                reflectiveCurveTo(5.2f, 8.1f, 5.2f, 9.5f)
                verticalLineTo(11f)
                curveToRelative(-0.6f, 0f, -1.2f, 0.6f, -1.2f, 1.2f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.7f, 0.6f, 1.3f, 1.2f, 1.3f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.7f, 0f, 1.3f, -0.6f, 1.3f, -1.2f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.7f, -0.6f, -1.3f, -1.2f, -1.3f)
                close()
                moveToRelative(-1.3f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(9.5f)
                curveToRelative(0f, -0.8f, 0.7f, -1.3f, 1.5f, -1.3f)
                reflectiveCurveToRelative(1.5f, 0.5f, 1.5f, 1.3f)
                verticalLineTo(11f)
                close()
            }
        }.build()
        
        return _Phonelink_lock!!
    }

private var _Phonelink_lock: ImageVector? = null

