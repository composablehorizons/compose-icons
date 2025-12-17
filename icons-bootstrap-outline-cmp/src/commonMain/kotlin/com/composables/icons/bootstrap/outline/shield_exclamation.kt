package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ShieldExclamation: ImageVector
    get() {
        if (_ShieldExclamation != null) return _ShieldExclamation!!
        
        _ShieldExclamation = ImageVector.Builder(
            name = "shield-exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.338f, 1.59f)
                arcToRelative(61f, 61f, 0f, false, false, -2.837f, 0.856f)
                arcToRelative(0.48f, 0.48f, 0f, false, false, -0.328f, 0.39f)
                curveToRelative(-0.554f, 4.157f, 0.726f, 7.19f, 2.253f, 9.188f)
                arcToRelative(10.7f, 10.7f, 0f, false, false, 2.287f, 2.233f)
                curveToRelative(0.346f, 0.244f, 0.652f, 0.42f, 0.893f, 0.533f)
                quadToRelative(0.18f, 0.085f, 0.293f, 0.118f)
                arcToRelative(1f, 1f, 0f, false, false, 0.101f, 0.025f)
                arcToRelative(1f, 1f, 0f, false, false, 0.1f, -0.025f)
                quadToRelative(0.114f, -0.034f, 0.294f, -0.118f)
                curveToRelative(0.24f, -0.113f, 0.547f, -0.29f, 0.893f, -0.533f)
                arcToRelative(10.7f, 10.7f, 0f, false, false, 2.287f, -2.233f)
                curveToRelative(1.527f, -1.997f, 2.807f, -5.031f, 2.253f, -9.188f)
                arcToRelative(0.48f, 0.48f, 0f, false, false, -0.328f, -0.39f)
                curveToRelative(-0.651f, -0.213f, -1.75f, -0.56f, -2.837f, -0.855f)
                curveTo(9.552f, 1.29f, 8.531f, 1.067f, 8f, 1.067f)
                curveToRelative(-0.53f, 0f, -1.552f, 0.223f, -2.662f, 0.524f)
                close()
                moveTo(5.072f, 0.56f)
                curveTo(6.157f, 0.265f, 7.31f, 0f, 8f, 0f)
                reflectiveCurveToRelative(1.843f, 0.265f, 2.928f, 0.56f)
                curveToRelative(1.11f, 0.3f, 2.229f, 0.655f, 2.887f, 0.87f)
                arcToRelative(1.54f, 1.54f, 0f, false, true, 1.044f, 1.262f)
                curveToRelative(0.596f, 4.477f, -0.787f, 7.795f, -2.465f, 9.99f)
                arcToRelative(11.8f, 11.8f, 0f, false, true, -2.517f, 2.453f)
                arcToRelative(7f, 7f, 0f, false, true, -1.048f, 0.625f)
                curveToRelative(-0.28f, 0.132f, -0.581f, 0.24f, -0.829f, 0.24f)
                reflectiveCurveToRelative(-0.548f, -0.108f, -0.829f, -0.24f)
                arcToRelative(7f, 7f, 0f, false, true, -1.048f, -0.625f)
                arcToRelative(11.8f, 11.8f, 0f, false, true, -2.517f, -2.453f)
                curveTo(1.928f, 10.487f, 0.545f, 7.169f, 1.141f, 2.692f)
                arcTo(1.54f, 1.54f, 0f, false, true, 2.185f, 1.43f)
                arcTo(63f, 63f, 0f, false, true, 5.072f, 0.56f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.001f, 11f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                moveTo(7.1f, 4.995f)
                arcToRelative(0.905f, 0.905f, 0f, true, true, 1.8f, 0f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.553f, 0.553f, 0f, false, true, -1.1f, 0f)
                close()
            }
        }.build()
        
        return _ShieldExclamation!!
    }

private var _ShieldExclamation: ImageVector? = null

