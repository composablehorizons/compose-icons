package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BadgeSd: ImageVector
    get() {
        if (_BadgeSd != null) return _BadgeSd!!
        
        _BadgeSd = ImageVector.Builder(
            name = "badge-sd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.338f, 5.968f)
                horizontalLineToRelative(-0.844f)
                verticalLineToRelative(4.06f)
                horizontalLineToRelative(0.844f)
                curveToRelative(1.116f, 0f, 1.622f, -0.667f, 1.622f, -2.02f)
                curveToRelative(0f, -1.354f, -0.51f, -2.04f, -1.622f, -2.04f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(5.077f, 7.114f)
                curveToRelative(1.521f, 0f, 2.378f, -0.764f, 2.378f, -1.88f)
                curveToRelative(0f, -1.007f, -0.642f, -1.473f, -1.613f, -1.692f)
                lineToRelative(-0.932f, -0.216f)
                curveToRelative(-0.527f, -0.114f, -0.821f, -0.351f, -0.821f, -0.712f)
                curveToRelative(0f, -0.466f, 0.39f, -0.804f, 1.046f, -0.804f)
                curveToRelative(0.637f, 0f, 1.028f, 0.33f, 1.103f, 0.76f)
                horizontalLineToRelative(1.125f)
                curveToRelative(-0.058f, -0.923f, -0.849f, -1.692f, -2.22f, -1.692f)
                curveToRelative(-1.322f, 0f, -2.24f, 0.717f, -2.24f, 1.815f)
                curveToRelative(0f, 0.91f, 0.588f, 1.446f, 1.52f, 1.657f)
                lineToRelative(0.927f, 0.215f)
                curveToRelative(0.624f, 0.145f, 0.923f, 0.36f, 0.923f, 0.778f)
                curveToRelative(0f, 0.492f, -0.391f, 0.83f, -1.13f, 0.83f)
                curveToRelative(-0.707f, 0f, -1.155f, -0.342f, -1.234f, -0.808f)
                horizontalLineTo(2.762f)
                curveToRelative(0.052f, 0.95f, 0.79f, 1.75f, 2.315f, 1.75f)
                close()
                moveTo(8.307f, 11f)
                horizontalLineToRelative(2.19f)
                curveToRelative(1.81f, 0f, 2.684f, -1.107f, 2.684f, -3.015f)
                curveToRelative(0f, -1.894f, -0.861f, -2.984f, -2.685f, -2.984f)
                horizontalLineTo(8.308f)
                close()
            }
        }.build()
        
        return _BadgeSd!!
    }

private var _BadgeSd: ImageVector? = null

