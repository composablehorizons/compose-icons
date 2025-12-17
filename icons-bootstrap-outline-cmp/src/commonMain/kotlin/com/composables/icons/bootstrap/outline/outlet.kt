package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Outlet: ImageVector
    get() {
        if (_Outlet != null) return _Outlet!!
        
        _Outlet = ImageVector.Builder(
            name = "outlet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.34f, 2.994f)
                curveToRelative(0.275f, -0.338f, 0.68f, -0.494f, 1.074f, -0.494f)
                horizontalLineToRelative(7.172f)
                curveToRelative(0.393f, 0f, 0.798f, 0.156f, 1.074f, 0.494f)
                curveToRelative(0.578f, 0.708f, 1.84f, 2.534f, 1.84f, 5.006f)
                reflectiveCurveToRelative(-1.262f, 4.297f, -1.84f, 5.006f)
                curveToRelative(-0.276f, 0.338f, -0.68f, 0.494f, -1.074f, 0.494f)
                horizontalLineTo(4.414f)
                curveToRelative(-0.394f, 0f, -0.799f, -0.156f, -1.074f, -0.494f)
                curveTo(2.762f, 12.297f, 1.5f, 10.472f, 1.5f, 8f)
                reflectiveCurveToRelative(1.262f, -4.297f, 1.84f, -5.006f)
                moveToRelative(1.074f, 0.506f)
                arcToRelative(0.38f, 0.38f, 0f, false, false, -0.299f, 0.126f)
                curveTo(3.599f, 4.259f, 2.5f, 5.863f, 2.5f, 8f)
                reflectiveCurveToRelative(1.099f, 3.74f, 1.615f, 4.374f)
                curveToRelative(0.06f, 0.073f, 0.163f, 0.126f, 0.3f, 0.126f)
                horizontalLineToRelative(7.17f)
                curveToRelative(0.137f, 0f, 0.24f, -0.053f, 0.3f, -0.126f)
                curveToRelative(0.516f, -0.633f, 1.615f, -2.237f, 1.615f, -4.374f)
                reflectiveCurveToRelative(-1.099f, -3.74f, -1.615f, -4.374f)
                arcToRelative(0.38f, 0.38f, 0f, false, false, -0.3f, -0.126f)
                horizontalLineToRelative(-7.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(4f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(7f, 10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
            }
        }.build()
        
        return _Outlet!!
    }

private var _Outlet: ImageVector? = null

