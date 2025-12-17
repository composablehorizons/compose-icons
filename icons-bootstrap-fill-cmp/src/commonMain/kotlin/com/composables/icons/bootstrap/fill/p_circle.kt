package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PCircle: ImageVector
    get() {
        if (_PCircle != null) return _PCircle!!
        
        _PCircle = ImageVector.Builder(
            name = "p-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(5.5f, 4.002f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.283f)
                verticalLineTo(9.164f)
                horizontalLineToRelative(1.668f)
                curveTo(10.033f, 9.164f, 11f, 8.08f, 11f, 6.586f)
                curveToRelative(0f, -1.482f, -0.955f, -2.584f, -2.538f, -2.584f)
                close()
                moveToRelative(2.77f, 4.072f)
                curveToRelative(0.893f, 0f, 1.419f, -0.545f, 1.419f, -1.488f)
                reflectiveCurveToRelative(-0.526f, -1.482f, -1.42f, -1.482f)
                horizontalLineTo(6.778f)
                verticalLineToRelative(2.97f)
                close()
            }
        }.build()
        
        return _PCircle!!
    }

private var _PCircle: ImageVector? = null

