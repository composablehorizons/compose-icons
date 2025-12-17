package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PSquare: ImageVector
    get() {
        if (_PSquare != null) return _PSquare!!
        
        _PSquare = ImageVector.Builder(
            name = "p-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.27f, 8.074f)
                curveToRelative(0.893f, 0f, 1.419f, -0.545f, 1.419f, -1.488f)
                reflectiveCurveToRelative(-0.526f, -1.482f, -1.42f, -1.482f)
                horizontalLineTo(6.778f)
                verticalLineToRelative(2.97f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(3.5f, 4.002f)
                horizontalLineToRelative(2.962f)
                curveTo(10.045f, 4.002f, 11f, 5.104f, 11f, 6.586f)
                curveToRelative(0f, 1.494f, -0.967f, 2.578f, -2.55f, 2.578f)
                horizontalLineTo(6.784f)
                verticalLineTo(12f)
                horizontalLineTo(5.5f)
                close()
            }
        }.build()
        
        return _PSquare!!
    }

private var _PSquare: ImageVector? = null

