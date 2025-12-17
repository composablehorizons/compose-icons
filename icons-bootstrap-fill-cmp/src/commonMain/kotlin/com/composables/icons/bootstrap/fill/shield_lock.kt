package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ShieldLock: ImageVector
    get() {
        if (_ShieldLock != null) return _ShieldLock!!
        
        _ShieldLock = ImageVector.Builder(
            name = "shield-lock",
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
                moveToRelative(0f, 5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.5f, 2.915f)
                lineToRelative(0.385f, 1.99f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.491f, 0.595f)
                horizontalLineToRelative(-0.788f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.49f, -0.595f)
                lineToRelative(0.384f, -1.99f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8f, 5f)
            }
        }.build()
        
        return _ShieldLock!!
    }

private var _ShieldLock: ImageVector? = null

