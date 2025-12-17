package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Blind: ImageVector
    get() {
        if (_Blind != null) return _Blind!!
        
        _Blind = ImageVector.Builder(
            name = "blind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380.15f, 510.837f)
                arcToRelative(8f, 8f, 0f, false, true, -10.989f, -2.687f)
                lineToRelative(-125.33f, -206.427f)
                arcToRelative(31.923f, 31.923f, 0f, false, false, 12.958f, -9.485f)
                lineToRelative(126.048f, 207.608f)
                arcToRelative(8f, 8f, 0f, false, true, -2.687f, 10.991f)
                close()
                moveTo(142.803f, 314.338f)
                lineToRelative(-32.54f, 89.485f)
                lineToRelative(36.12f, 88.285f)
                curveToRelative(6.693f, 16.36f, 25.377f, 24.192f, 41.733f, 17.501f)
                curveToRelative(16.357f, -6.692f, 24.193f, -25.376f, 17.501f, -41.734f)
                lineToRelative(-62.814f, -153.537f)
                close()
                moveTo(96f, 88f)
                curveToRelative(24.301f, 0f, 44f, -19.699f, 44f, -44f)
                reflectiveCurveTo(120.301f, 0f, 96f, 0f)
                reflectiveCurveTo(52f, 19.699f, 52f, 44f)
                reflectiveCurveToRelative(19.699f, 44f, 44f, 44f)
                close()
                moveToRelative(154.837f, 169.128f)
                lineToRelative(-120f, -152f)
                curveToRelative(-4.733f, -5.995f, -11.75f, -9.108f, -18.837f, -9.112f)
                verticalLineTo(96f)
                horizontalLineTo(80f)
                verticalLineToRelative(0.026f)
                curveToRelative(-7.146f, 0.003f, -14.217f, 3.161f, -18.944f, 9.24f)
                lineTo(0f, 183.766f)
                verticalLineToRelative(95.694f)
                curveToRelative(0f, 13.455f, 11.011f, 24.791f, 24.464f, 24.536f)
                curveTo(37.505f, 303.748f, 48f, 293.1f, 48f, 280f)
                verticalLineToRelative(-79.766f)
                lineToRelative(16f, -20.571f)
                verticalLineToRelative(140.698f)
                lineTo(9.927f, 469.055f)
                curveToRelative(-6.04f, 16.609f, 2.528f, 34.969f, 19.138f, 41.009f)
                curveToRelative(16.602f, 6.039f, 34.968f, -2.524f, 41.009f, -19.138f)
                lineTo(136f, 309.638f)
                verticalLineTo(202.441f)
                lineToRelative(-31.406f, -39.816f)
                arcToRelative(4f, 4f, 0f, true, true, 6.269f, -4.971f)
                lineToRelative(102.3f, 129.217f)
                curveToRelative(9.145f, 11.584f, 24.368f, 11.339f, 33.708f, 3.965f)
                curveToRelative(10.41f, -8.216f, 12.159f, -23.334f, 3.966f, -33.708f)
                close()
            }
        }.build()
        
        return _Blind!!
    }

private var _Blind: ImageVector? = null

