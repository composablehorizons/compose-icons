package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.TruckFront: ImageVector
    get() {
        if (_TruckFront != null) return _TruckFront!!
        
        _TruckFront = ImageVector.Builder(
            name = "truck-front",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, false, false, 1f, 2.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.818f, 0.393f, 1.544f, 1f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0.607f, -0.456f, 1f, -1.182f, 1f, -2f)
                verticalLineToRelative(-9f)
                arcTo(2.5f, 2.5f, 0f, false, false, 12.5f, 0f)
                close()
                moveTo(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(3.9f)
                curveToRelative(0f, 0.625f, -0.562f, 1.092f, -1.17f, 0.994f)
                curveTo(10.925f, 7.747f, 9.208f, 7.5f, 8f, 7.5f)
                reflectiveCurveToRelative(-2.925f, 0.247f, -3.83f, 0.394f)
                arcTo(1.008f, 1.008f, 0f, false, true, 3f, 6.9f)
                close()
                moveToRelative(1f, 9f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                moveToRelative(-5f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
            }
        }.build()
        
        return _TruckFront!!
    }

private var _TruckFront: ImageVector? = null

