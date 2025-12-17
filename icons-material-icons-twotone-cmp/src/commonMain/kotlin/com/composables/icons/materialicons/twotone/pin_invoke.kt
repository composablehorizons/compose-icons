package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Pin_invoke: ImageVector
    get() {
        if (_Pin_invoke != null) return _Pin_invoke!!
        
        _Pin_invoke = ImageVector.Builder(
            name = "pin_invoke",
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
                moveTo(22f, 12f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(10f)
                lineToRelative(0f, 2f)
                horizontalLineTo(4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-6f)
                horizontalLineTo(22f)
                close()
                moveTo(22f, 7f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                curveTo(20.66f, 10f, 22f, 8.66f, 22f, 7f)
                close()
                moveTo(11.47f, 12.12f)
                lineToRelative(-2.83f, 2.83f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.83f, -2.83f)
                lineTo(15f, 15.66f)
                verticalLineTo(10f)
                horizontalLineTo(9.34f)
                lineTo(11.47f, 12.12f)
                close()
            }
        }.build()
        
        return _Pin_invoke!!
    }

private var _Pin_invoke: ImageVector? = null

