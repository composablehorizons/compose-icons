package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Rocket: ImageVector
    get() {
        if (_Rocket != null) return _Rocket!!
        
        _Rocket = ImageVector.Builder(
            name = "rocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.175f, 1.991f)
                curveToRelative(0.81f, 1.312f, 1.583f, 3.43f, 1.778f, 6.819f)
                lineToRelative(1.5f, 1.83f)
                arcTo(2.5f, 2.5f, 0f, false, true, 14f, 12.202f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.9f, 0.3f)
                lineToRelative(-1.125f, -1.5f)
                curveToRelative(-0.166f, -0.222f, -0.42f, -0.4f, -0.752f, -0.57f)
                curveToRelative(-0.214f, -0.108f, -0.414f, -0.192f, -0.627f, -0.282f)
                lineToRelative(-0.196f, -0.083f)
                curveTo(9.7f, 13.793f, 8.85f, 14f, 8f, 14f)
                reflectiveCurveToRelative(-1.7f, -0.207f, -2.4f, -0.635f)
                quadToRelative(-0.101f, 0.044f, -0.198f, 0.084f)
                curveToRelative(-0.211f, 0.089f, -0.411f, 0.173f, -0.625f, 0.281f)
                curveToRelative(-0.332f, 0.17f, -0.586f, 0.348f, -0.752f, 0.57f)
                lineTo(2.9f, 15.8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.9f, -0.3f)
                verticalLineToRelative(-3.298f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0.548f, -1.562f)
                lineToRelative(0.004f, -0.005f)
                lineTo(4.049f, 8.81f)
                curveToRelative(0.197f, -3.323f, 0.969f, -5.434f, 1.774f, -6.756f)
                curveToRelative(0.466f, -0.767f, 0.94f, -1.262f, 1.31f, -1.57f)
                arcToRelative(3.7f, 3.7f, 0f, false, true, 0.601f, -0.41f)
                arcTo(0.55f, 0.55f, 0f, false, true, 8f, 0f)
                curveToRelative(0.101f, 0f, 0.17f, 0.027f, 0.25f, 0.064f)
                quadToRelative(0.056f, 0.025f, 0.145f, 0.075f)
                curveToRelative(0.118f, 0.066f, 0.277f, 0.167f, 0.463f, 0.315f)
                curveToRelative(0.373f, 0.297f, 0.85f, 0.779f, 1.317f, 1.537f)
                moveTo(9.5f, 6f)
                curveToRelative(0f, -1.105f, -0.672f, -2f, -1.5f, -2f)
                reflectiveCurveToRelative(-1.5f, 0.895f, -1.5f, 2f)
                reflectiveCurveTo(7.172f, 8f, 8f, 8f)
                reflectiveCurveToRelative(1.5f, -0.895f, 1.5f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 14.5f)
                curveToRelative(0.5f, 0f, 0.999f, -0.046f, 1.479f, -0.139f)
                lineTo(8.4f, 15.8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.8f, 0f)
                lineToRelative(-1.079f, -1.439f)
                curveToRelative(0.48f, 0.093f, 0.98f, 0.139f, 1.479f, 0.139f)
            }
        }.build()
        
        return _Rocket!!
    }

private var _Rocket: ImageVector? = null

