package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BusFront: ImageVector
    get() {
        if (_BusFront != null) return _BusFront!!
        
        _BusFront = ImageVector.Builder(
            name = "bus-front",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                verticalLineToRelative(3.5f)
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
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                verticalLineTo(2.64f)
                curveTo(1f, 1.452f, 1.845f, 0.408f, 3.064f, 0.268f)
                arcTo(44f, 44f, 0f, false, true, 8f, 0f)
                curveToRelative(2.1f, 0f, 3.792f, 0.136f, 4.936f, 0.268f)
                curveTo(14.155f, 0.408f, 15f, 1.452f, 15f, 2.64f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
                moveTo(3.552f, 3.22f)
                arcTo(43f, 43f, 0f, false, true, 8f, 3f)
                curveToRelative(1.837f, 0f, 3.353f, 0.107f, 4.448f, 0.22f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.104f, -0.994f)
                arcTo(44f, 44f, 0f, false, false, 8f, 2f)
                curveToRelative(-1.876f, 0f, -3.426f, 0.109f, -4.552f, 0.226f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.104f, 0.994f)
                moveTo(8f, 4f)
                curveToRelative(-1.876f, 0f, -3.426f, 0.109f, -4.552f, 0.226f)
                arcTo(0.5f, 0.5f, 0f, false, false, 3f, 4.723f)
                verticalLineToRelative(3.554f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.448f, 0.497f)
                curveTo(4.574f, 8.891f, 6.124f, 9f, 8f, 9f)
                reflectiveCurveToRelative(3.426f, -0.109f, 4.552f, -0.226f)
                arcTo(0.5f, 0.5f, 0f, false, false, 13f, 8.277f)
                verticalLineTo(4.723f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.448f, -0.497f)
                arcTo(44f, 44f, 0f, false, false, 8f, 4f)
                moveToRelative(-3f, 7f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                moveToRelative(-7f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
            }
        }.build()
        
        return _BusFront!!
    }

private var _BusFront: ImageVector? = null

