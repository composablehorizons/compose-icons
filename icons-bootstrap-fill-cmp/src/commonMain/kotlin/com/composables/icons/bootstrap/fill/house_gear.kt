package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.HouseGear: ImageVector
    get() {
        if (_HouseGear != null) return _HouseGear!!
        
        _HouseGear = ImageVector.Builder(
            name = "house-gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.293f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineTo(11f, 3.793f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.293f)
                lineToRelative(2.354f, 2.353f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8f, 2.207f)
                lineTo(1.354f, 8.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.07f, 9.047f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.742f, 0.26f)
                lineToRelative(-0.02f, 0.021f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.261f, 1.742f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 2.86f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.12f, 1.07f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 13.5f)
                verticalLineTo(9.293f)
                lineToRelative(6f, -6f)
                lineToRelative(4.724f, 4.724f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.654f, 1.03f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.158f, 9.608f)
                lineToRelative(-0.043f, -0.148f)
                curveToRelative(-0.181f, -0.613f, -1.049f, -0.613f, -1.23f, 0f)
                lineToRelative(-0.043f, 0.148f)
                arcToRelative(0.64f, 0.64f, 0f, false, true, -0.921f, 0.382f)
                lineToRelative(-0.136f, -0.074f)
                curveToRelative(-0.561f, -0.306f, -1.175f, 0.308f, -0.87f, 0.869f)
                lineToRelative(0.075f, 0.136f)
                arcToRelative(0.64f, 0.64f, 0f, false, true, -0.382f, 0.92f)
                lineToRelative(-0.148f, 0.045f)
                curveToRelative(-0.613f, 0.18f, -0.613f, 1.048f, 0f, 1.229f)
                lineToRelative(0.148f, 0.043f)
                arcToRelative(0.64f, 0.64f, 0f, false, true, 0.382f, 0.921f)
                lineToRelative(-0.074f, 0.136f)
                curveToRelative(-0.306f, 0.561f, 0.308f, 1.175f, 0.869f, 0.87f)
                lineToRelative(0.136f, -0.075f)
                arcToRelative(0.64f, 0.64f, 0f, false, true, 0.92f, 0.382f)
                lineToRelative(0.045f, 0.149f)
                curveToRelative(0.18f, 0.612f, 1.048f, 0.612f, 1.229f, 0f)
                lineToRelative(0.043f, -0.15f)
                arcToRelative(0.64f, 0.64f, 0f, false, true, 0.921f, -0.38f)
                lineToRelative(0.136f, 0.074f)
                curveToRelative(0.561f, 0.305f, 1.175f, -0.309f, 0.87f, -0.87f)
                lineToRelative(-0.075f, -0.136f)
                arcToRelative(0.64f, 0.64f, 0f, false, true, 0.382f, -0.92f)
                lineToRelative(0.149f, -0.044f)
                curveToRelative(0.612f, -0.181f, 0.612f, -1.049f, 0f, -1.23f)
                lineToRelative(-0.15f, -0.043f)
                arcToRelative(0.64f, 0.64f, 0f, false, true, -0.38f, -0.921f)
                lineToRelative(0.074f, -0.136f)
                curveToRelative(0.305f, -0.561f, -0.309f, -1.175f, -0.87f, -0.87f)
                lineToRelative(-0.136f, 0.075f)
                arcToRelative(0.64f, 0.64f, 0f, false, true, -0.92f, -0.382f)
                close()
                moveTo(12.5f, 14f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
            }
        }.build()
        
        return _HouseGear!!
    }

private var _HouseGear: ImageVector? = null

