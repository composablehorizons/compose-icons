package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Sourceforge: ImageVector
    get() {
        if (_Sourceforge != null) return _Sourceforge!!
        
        _Sourceforge = ImageVector.Builder(
            name = "sourceforge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.13f, 8.43f)
                curveToRelative(0f, -2.604f, -0.929f, -3.79f, -1.42f, -4.24f)
                arcToRelative(0.14f, 0.14f, 0f, false, false, -0.232f, 0.123f)
                curveToRelative(0.095f, 1.472f, -1.762f, 1.84f, -1.762f, 4.144f)
                verticalLineToRelative(0.013f)
                curveToRelative(0f, 1.404f, 1.065f, 2.55f, 2.376f, 2.55f)
                reflectiveCurveToRelative(2.377f, -1.146f, 2.377f, -2.55f)
                verticalLineToRelative(-0.013f)
                curveToRelative(0f, -0.655f, -0.246f, -1.282f, -0.492f, -1.745f)
                curveToRelative(-0.055f, -0.096f, -0.191f, -0.055f, -0.178f, 0.027f)
                curveToRelative(0.451f, 1.99f, -0.669f, 3.217f, -0.669f, 1.69f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.303f, 13.923f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.164f, -0.068f)
                lineTo(0.061f, 7.789f)
                curveToRelative(-0.081f, -0.082f, -0.081f, -0.232f, 0f, -0.327f)
                lineToRelative(6.42f, -6.407f)
                arcTo(0.3f, 0.3f, 0f, false, true, 6.63f, 1f)
                horizontalLineToRelative(1.844f)
                curveToRelative(0.109f, 0f, 0.177f, 0.068f, 0.204f, 0.136f)
                arcToRelative(0.22f, 0.22f, 0f, false, true, -0.054f, 0.246f)
                lineTo(2.602f, 7.407f)
                arcToRelative(0.304f, 0.304f, 0f, false, false, 0f, 0.436f)
                lineToRelative(4.766f, 4.771f)
                curveToRelative(0.082f, 0.082f, 0.082f, 0.232f, 0f, 0.328f)
                lineToRelative(-0.915f, 0.927f)
                arcToRelative(0.3f, 0.3f, 0f, false, true, -0.15f, 0.054f)
                moveToRelative(1.216f, 1.063f)
                arcToRelative(0.22f, 0.22f, 0f, false, true, -0.15f, -0.382f)
                lineToRelative(6.036f, -6.025f)
                arcToRelative(0.32f, 0.32f, 0f, false, false, 0.096f, -0.218f)
                arcToRelative(0.27f, 0.27f, 0f, false, false, -0.096f, -0.218f)
                lineToRelative(-4.78f, -4.771f)
                curveToRelative(-0.082f, -0.082f, -0.082f, -0.232f, 0f, -0.327f)
                lineToRelative(0.929f, -0.927f)
                arcToRelative(0.23f, 0.23f, 0f, false, true, 0.163f, -0.068f)
                curveToRelative(0.069f, 0f, 0.11f, 0.04f, 0.15f, 0.081f)
                lineToRelative(6.065f, 6.067f)
                curveToRelative(0.04f, 0.04f, 0.068f, 0.095f, 0.068f, 0.163f)
                arcToRelative(0.23f, 0.23f, 0f, false, true, -0.068f, 0.164f)
                lineToRelative(-6.42f, 6.407f)
                arcTo(0.23f, 0.23f, 0f, false, true, 9.35f, 15f)
                horizontalLineTo(7.52f)
                close()
            }
        }.build()
        
        return _Sourceforge!!
    }

private var _Sourceforge: ImageVector? = null

