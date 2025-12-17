package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fiber_dvr: ImageVector
    get() {
        if (_Fiber_dvr != null) return _Fiber_dvr!!
        
        _Fiber_dvr = ImageVector.Builder(
            name = "fiber_dvr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 10.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(13f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveToRelative(-1.11f, 0f, -2f, 0.89f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                close()
                moveTo(8f, 13.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(6.1f, -3.58f)
                lineToRelative(-1.27f, 4.36f)
                curveToRelative(-0.12f, 0.43f, -0.52f, 0.72f, -0.96f, 0.72f)
                reflectiveCurveToRelative(-0.84f, -0.29f, -0.96f, -0.72f)
                lineTo(9.64f, 9.92f)
                curveToRelative(-0.14f, -0.46f, 0.21f, -0.92f, 0.69f, -0.92f)
                curveToRelative(0.32f, 0f, 0.6f, 0.21f, 0.69f, 0.52f)
                lineToRelative(0.85f, 2.91f)
                lineToRelative(0.85f, -2.91f)
                curveToRelative(0.09f, -0.31f, 0.37f, -0.52f, 0.69f, -0.52f)
                curveToRelative(0.48f, 0f, 0.83f, 0.46f, 0.69f, 0.92f)
                close()
                moveTo(21f, 11.5f)
                curveToRelative(0f, 0.6f, -0.4f, 1.15f, -0.9f, 1.4f)
                lineToRelative(0.63f, 1.48f)
                curveToRelative(0.19f, 0.45f, -0.14f, 0.96f, -0.63f, 0.96f)
                curveToRelative(-0.28f, 0f, -0.53f, -0.16f, -0.63f, -0.42f)
                lineTo(18.65f, 13f)
                horizontalLineTo(17.5f)
                verticalLineToRelative(1.31f)
                curveToRelative(0f, 0.38f, -0.31f, 0.69f, -0.69f, 0.69f)
                horizontalLineToRelative(-0.12f)
                curveToRelative(-0.38f, 0f, -0.69f, -0.31f, -0.69f, -0.69f)
                verticalLineTo(9.64f)
                curveToRelative(0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f)
                horizontalLineToRelative(2.86f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Fiber_dvr!!
    }

private var _Fiber_dvr: ImageVector? = null

