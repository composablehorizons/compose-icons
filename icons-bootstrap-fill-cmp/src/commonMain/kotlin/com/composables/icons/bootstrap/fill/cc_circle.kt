package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CcCircle: ImageVector
    get() {
        if (_CcCircle != null) return _CcCircle!!
        
        _CcCircle = ImageVector.Builder(
            name = "cc-circle",
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
                moveTo(5.408f, 5.89f)
                curveToRelative(0.681f, 0f, 1.138f, 0.47f, 1.187f, 1.107f)
                horizontalLineToRelative(1.147f)
                verticalLineToRelative(-0.11f)
                curveToRelative(-0.053f, -1.187f, -1.024f, -2f, -2.343f, -2f)
                curveToRelative(-1.604f, 0f, -2.518f, 1.05f, -2.518f, 2.751f)
                verticalLineToRelative(0.747f)
                curveToRelative(0f, 1.7f, 0.906f, 2.73f, 2.518f, 2.73f)
                curveToRelative(1.314f, 0f, 2.285f, -0.792f, 2.343f, -1.939f)
                verticalLineToRelative(-0.114f)
                horizontalLineTo(6.595f)
                curveToRelative(-0.049f, 0.615f, -0.497f, 1.05f, -1.187f, 1.05f)
                curveToRelative(-0.84f, 0f, -1.318f, -0.62f, -1.318f, -1.727f)
                verticalLineToRelative(-0.742f)
                curveToRelative(0f, -1.112f, 0.488f, -1.754f, 1.318f, -1.754f)
                close()
                moveToRelative(5.404f, 0f)
                curveToRelative(0.68f, 0f, 1.138f, 0.47f, 1.186f, 1.107f)
                horizontalLineToRelative(1.147f)
                verticalLineToRelative(-0.11f)
                curveToRelative(-0.053f, -1.187f, -1.024f, -2f, -2.342f, -2f)
                curveToRelative(-1.604f, 0f, -2.518f, 1.05f, -2.518f, 2.751f)
                verticalLineToRelative(0.747f)
                curveToRelative(0f, 1.7f, 0.905f, 2.73f, 2.518f, 2.73f)
                curveToRelative(1.314f, 0f, 2.285f, -0.792f, 2.342f, -1.939f)
                verticalLineToRelative(-0.114f)
                horizontalLineToRelative(-1.147f)
                curveToRelative(-0.048f, 0.615f, -0.496f, 1.05f, -1.186f, 1.05f)
                curveToRelative(-0.84f, 0f, -1.319f, -0.62f, -1.319f, -1.727f)
                verticalLineToRelative(-0.742f)
                curveToRelative(0f, -1.112f, 0.488f, -1.754f, 1.319f, -1.754f)
                close()
            }
        }.build()
        
        return _CcCircle!!
    }

private var _CcCircle: ImageVector? = null

