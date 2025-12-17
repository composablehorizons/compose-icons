package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Pin_end: ImageVector
    get() {
        if (_Pin_end != null) return _Pin_end!!
        
        _Pin_end = ImageVector.Builder(
            name = "pin_end",
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
                moveTo(20f, 12f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(10f)
                lineToRelative(0f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineTo(20f)
                close()
                moveTo(19f, 14f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveTo(20.66f, 14f, 19f, 14f)
                close()
                moveTo(14.66f, 8f)
                horizontalLineTo(9f)
                verticalLineToRelative(5.66f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.24f)
                lineToRelative(2.95f, 2.95f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12.41f, 10f)
                horizontalLineToRelative(2.24f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        
        return _Pin_end!!
    }

private var _Pin_end: ImageVector? = null

