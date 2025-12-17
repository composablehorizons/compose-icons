package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TruckFront: ImageVector
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
                moveTo(5f, 11f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(-6f, -1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                close()
                moveTo(4f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3.9f)
                curveToRelative(0f, 0.625f, 0.562f, 1.092f, 1.17f, 0.994f)
                curveTo(5.075f, 7.747f, 6.792f, 7.5f, 8f, 7.5f)
                reflectiveCurveToRelative(2.925f, 0.247f, 3.83f, 0.394f)
                arcTo(1.008f, 1.008f, 0f, false, false, 13f, 6.9f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3.9f)
                quadToRelative(0f, 0.002f, 0f, 0f)
                lineToRelative(-0.002f, 0.004f)
                lineToRelative(-0.005f, 0.002f)
                horizontalLineToRelative(-0.004f)
                curveTo(11.088f, 6.761f, 9.299f, 6.5f, 8f, 6.5f)
                reflectiveCurveToRelative(-3.088f, 0.26f, -3.99f, 0.406f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(-0.005f, -0.002f)
                lineTo(4f, 6.9f)
                quadToRelative(0f, 0.002f, 0f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 3.5f, 0f)
                horizontalLineToRelative(9f)
                arcTo(2.5f, 2.5f, 0f, false, true, 15f, 2.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.818f, -0.393f, 1.544f, -1f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1f, -2f)
                close()
                moveTo(3.5f, 1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 2.5f)
                verticalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 13f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 1f)
                close()
            }
        }.build()
        
        return _TruckFront!!
    }

private var _TruckFront: ImageVector? = null

