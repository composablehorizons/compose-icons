package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ShieldSlash: ImageVector
    get() {
        if (_ShieldSlash != null) return _ShieldSlash!!
        
        _ShieldSlash = ImageVector.Builder(
            name = "shield-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.093f, 3.093f)
                curveToRelative(-0.465f, 4.275f, 0.885f, 7.46f, 2.513f, 9.589f)
                arcToRelative(11.8f, 11.8f, 0f, false, false, 2.517f, 2.453f)
                curveToRelative(0.386f, 0.273f, 0.744f, 0.482f, 1.048f, 0.625f)
                curveToRelative(0.28f, 0.132f, 0.581f, 0.24f, 0.829f, 0.24f)
                reflectiveCurveToRelative(0.548f, -0.108f, 0.829f, -0.24f)
                arcToRelative(7f, 7f, 0f, false, false, 1.048f, -0.625f)
                arcToRelative(11.3f, 11.3f, 0f, false, false, 1.733f, -1.525f)
                lineToRelative(-0.745f, -0.745f)
                arcToRelative(10.3f, 10.3f, 0f, false, true, -1.578f, 1.392f)
                curveToRelative(-0.346f, 0.244f, -0.652f, 0.42f, -0.893f, 0.533f)
                quadToRelative(-0.18f, 0.085f, -0.293f, 0.118f)
                arcToRelative(1f, 1f, 0f, false, true, -0.101f, 0.025f)
                arcToRelative(1f, 1f, 0f, false, true, -0.1f, -0.025f)
                arcToRelative(2f, 2f, 0f, false, true, -0.294f, -0.118f)
                arcToRelative(6f, 6f, 0f, false, true, -0.893f, -0.533f)
                arcToRelative(10.7f, 10.7f, 0f, false, true, -2.287f, -2.233f)
                curveTo(3.053f, 10.228f, 1.879f, 7.594f, 2.06f, 4.06f)
                close()
                moveTo(3.98f, 1.98f)
                lineToRelative(-0.852f, -0.852f)
                arcTo(59f, 59f, 0f, false, true, 5.072f, 0.559f)
                curveTo(6.157f, 0.266f, 7.31f, 0f, 8f, 0f)
                reflectiveCurveToRelative(1.843f, 0.265f, 2.928f, 0.56f)
                curveToRelative(1.11f, 0.3f, 2.229f, 0.655f, 2.887f, 0.87f)
                arcToRelative(1.54f, 1.54f, 0f, false, true, 1.044f, 1.262f)
                curveToRelative(0.483f, 3.626f, -0.332f, 6.491f, -1.551f, 8.616f)
                lineToRelative(-0.77f, -0.77f)
                curveToRelative(1.042f, -1.915f, 1.72f, -4.469f, 1.29f, -7.702f)
                arcToRelative(0.48f, 0.48f, 0f, false, false, -0.33f, -0.39f)
                curveToRelative(-0.65f, -0.213f, -1.75f, -0.56f, -2.836f, -0.855f)
                curveTo(9.552f, 1.29f, 8.531f, 1.067f, 8f, 1.067f)
                curveToRelative(-0.53f, 0f, -1.552f, 0.223f, -2.662f, 0.524f)
                arcToRelative(50f, 50f, 0f, false, false, -1.357f, 0.39f)
                close()
                moveToRelative(9.666f, 12.374f)
                lineToRelative(-13f, -13f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(13f, 13f)
                close()
            }
        }.build()
        
        return _ShieldSlash!!
    }

private var _ShieldSlash: ImageVector? = null

