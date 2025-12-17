package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BadgeCc: ImageVector
    get() {
        if (_BadgeCc != null) return _BadgeCc!!
        
        _BadgeCc = ImageVector.Builder(
            name = "badge-cc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(3.027f, 4.002f)
                curveToRelative(-0.83f, 0f, -1.319f, 0.642f, -1.319f, 1.753f)
                verticalLineToRelative(0.743f)
                curveToRelative(0f, 1.107f, 0.48f, 1.727f, 1.319f, 1.727f)
                curveToRelative(0.69f, 0f, 1.138f, -0.435f, 1.186f, -1.05f)
                horizontalLineTo(7.36f)
                verticalLineToRelative(0.114f)
                curveToRelative(-0.057f, 1.147f, -1.028f, 1.938f, -2.342f, 1.938f)
                curveToRelative(-1.613f, 0f, -2.518f, -1.028f, -2.518f, -2.729f)
                verticalLineToRelative(-0.747f)
                curveTo(2.5f, 6.051f, 3.414f, 5f, 5.018f, 5f)
                curveToRelative(1.318f, 0f, 2.29f, 0.813f, 2.342f, 2f)
                verticalLineToRelative(0.11f)
                horizontalLineTo(6.213f)
                curveToRelative(-0.048f, -0.638f, -0.505f, -1.108f, -1.186f, -1.108f)
                moveToRelative(6.14f, 0f)
                curveToRelative(-0.831f, 0f, -1.319f, 0.642f, -1.319f, 1.753f)
                verticalLineToRelative(0.743f)
                curveToRelative(0f, 1.107f, 0.48f, 1.727f, 1.318f, 1.727f)
                curveToRelative(0.69f, 0f, 1.139f, -0.435f, 1.187f, -1.05f)
                horizontalLineTo(13.5f)
                verticalLineToRelative(0.114f)
                curveToRelative(-0.057f, 1.147f, -1.028f, 1.938f, -2.342f, 1.938f)
                curveToRelative(-1.613f, 0f, -2.518f, -1.028f, -2.518f, -2.729f)
                verticalLineToRelative(-0.747f)
                curveToRelative(0f, -1.7f, 0.914f, -2.751f, 2.518f, -2.751f)
                curveToRelative(1.318f, 0f, 2.29f, 0.813f, 2.342f, 2f)
                verticalLineToRelative(0.11f)
                horizontalLineToRelative(-1.147f)
                curveToRelative(-0.048f, -0.638f, -0.505f, -1.108f, -1.187f, -1.108f)
                close()
            }
        }.build()
        
        return _BadgeCc!!
    }

private var _BadgeCc: ImageVector? = null

