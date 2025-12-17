package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ShieldFillExclamation: ImageVector
    get() {
        if (_ShieldFillExclamation != null) return _ShieldFillExclamation!!
        
        _ShieldFillExclamation = ImageVector.Builder(
            name = "shield-fill-exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                curveToRelative(-0.69f, 0f, -1.843f, 0.265f, -2.928f, 0.56f)
                curveToRelative(-1.11f, 0.3f, -2.229f, 0.655f, -2.887f, 0.87f)
                arcToRelative(1.54f, 1.54f, 0f, false, false, -1.044f, 1.262f)
                curveToRelative(-0.596f, 4.477f, 0.787f, 7.795f, 2.465f, 9.99f)
                arcToRelative(11.8f, 11.8f, 0f, false, false, 2.517f, 2.453f)
                curveToRelative(0.386f, 0.273f, 0.744f, 0.482f, 1.048f, 0.625f)
                curveToRelative(0.28f, 0.132f, 0.581f, 0.24f, 0.829f, 0.24f)
                reflectiveCurveToRelative(0.548f, -0.108f, 0.829f, -0.24f)
                arcToRelative(7f, 7f, 0f, false, false, 1.048f, -0.625f)
                arcToRelative(11.8f, 11.8f, 0f, false, false, 2.517f, -2.453f)
                curveToRelative(1.678f, -2.195f, 3.061f, -5.513f, 2.465f, -9.99f)
                arcToRelative(1.54f, 1.54f, 0f, false, false, -1.044f, -1.263f)
                arcToRelative(63f, 63f, 0f, false, false, -2.887f, -0.87f)
                curveTo(9.843f, 0.266f, 8.69f, 0f, 8f, 0f)
                moveToRelative(-0.55f, 8.502f)
                lineTo(7.1f, 4.995f)
                arcToRelative(0.905f, 0.905f, 0f, true, true, 1.8f, 0f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0f, false, true, -1.1f, 0f)
                moveTo(8.002f, 12f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
            }
        }.build()
        
        return _ShieldFillExclamation!!
    }

private var _ShieldFillExclamation: ImageVector? = null

