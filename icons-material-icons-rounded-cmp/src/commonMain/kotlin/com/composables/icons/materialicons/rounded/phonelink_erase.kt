package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Phonelink_erase: ImageVector
    get() {
        if (_Phonelink_erase != null) return _Phonelink_erase!!
        
        _Phonelink_erase = ImageVector.Builder(
            name = "phonelink_erase",
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
                moveTo(12.5f, 7.7f)
                curveToRelative(-0.28f, -0.28f, -0.72f, -0.28f, -1f, 0f)
                lineTo(8f, 11.2f)
                lineTo(4.5f, 7.7f)
                curveToRelative(-0.28f, -0.28f, -0.72f, -0.28f, -1f, 0f)
                reflectiveCurveToRelative(-0.28f, 0.72f, 0f, 1f)
                lineTo(7f, 12.2f)
                lineToRelative(-3.5f, 3.5f)
                curveToRelative(-0.28f, 0.28f, -0.28f, 0.72f, 0f, 1f)
                reflectiveCurveToRelative(0.72f, 0.28f, 1f, 0f)
                lineTo(8f, 13.2f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.28f, 0.28f, 0.72f, 0.28f, 1f, 0f)
                reflectiveCurveToRelative(0.28f, -0.72f, 0f, -1f)
                lineTo(9f, 12.2f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(0.28f, -0.28f, 0.28f, -0.72f, 0f, -1f)
                close()
                moveTo(19f, 1f)
                horizontalLineTo(9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(16f)
                horizontalLineTo(9f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.build()
        
        return _Phonelink_erase!!
    }

private var _Phonelink_erase: ImageVector? = null

