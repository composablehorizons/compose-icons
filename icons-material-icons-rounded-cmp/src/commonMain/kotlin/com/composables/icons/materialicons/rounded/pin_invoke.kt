package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pin_invoke: ImageVector
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
                moveTo(9.34f, 15.66f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.27f, 1.27f)
                curveTo(14.46f, 15.12f, 15f, 14.9f, 15f, 14.45f)
                verticalLineTo(10.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.95f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(1.27f, 1.27f)
                lineToRelative(-2.12f, 2.12f)
                curveTo(8.95f, 14.63f, 8.95f, 15.27f, 9.34f, 15.66f)
                close()
            }
        }.build()
        
        return _Pin_invoke!!
    }

private var _Pin_invoke: ImageVector? = null

