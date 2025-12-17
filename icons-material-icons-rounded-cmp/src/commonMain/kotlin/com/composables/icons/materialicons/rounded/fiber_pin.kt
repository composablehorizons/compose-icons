package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fiber_pin: ImageVector
    get() {
        if (_Fiber_pin != null) return _Fiber_pin!!
        
        _Fiber_pin = ImageVector.Builder(
            name = "fiber_pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.11f, 0f, -1.99f, 0.89f, -1.99f, 2f)
                lineTo(2f, 18f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                close()
                moveTo(9f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.25f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveTo(4f, 14.66f, 4f, 14.25f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(3.5f, 2.75f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                close()
                moveToRelative(7.5f, -0.04f)
                curveToRelative(0f, 0.44f, -0.35f, 0.79f, -0.79f, 0.79f)
                curveToRelative(-0.25f, 0f, -0.49f, -0.12f, -0.64f, -0.33f)
                lineToRelative(-2.31f, -3.17f)
                verticalLineToRelative(2.88f)
                curveToRelative(0f, 0.34f, -0.28f, 0.62f, -0.62f, 0.62f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.35f, 0f, -0.63f, -0.28f, -0.63f, -0.62f)
                verticalLineTo(9.83f)
                curveToRelative(0f, -0.46f, 0.37f, -0.83f, 0.83f, -0.83f)
                curveToRelative(0.27f, 0f, 0.52f, 0.13f, 0.67f, 0.35f)
                lineToRelative(2.25f, 3.15f)
                verticalLineTo(9.62f)
                curveToRelative(0f, -0.34f, 0.28f, -0.62f, 0.62f, -0.62f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.34f, 0f, 0.62f, 0.28f, 0.62f, 0.62f)
                verticalLineToRelative(4.59f)
                close()
                moveTo(5.5f, 10.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Fiber_pin!!
    }

private var _Fiber_pin: ImageVector? = null

