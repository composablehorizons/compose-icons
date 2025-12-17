package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Rocket: ImageVector
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
                moveTo(8f, 8f)
                curveToRelative(0.828f, 0f, 1.5f, -0.895f, 1.5f, -2f)
                reflectiveCurveTo(8.828f, 4f, 8f, 4f)
                reflectiveCurveToRelative(-1.5f, 0.895f, -1.5f, 2f)
                reflectiveCurveTo(7.172f, 8f, 8f, 8f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.953f, 8.81f)
                curveToRelative(-0.195f, -3.388f, -0.968f, -5.507f, -1.777f, -6.819f)
                curveTo(9.707f, 1.233f, 9.23f, 0.751f, 8.857f, 0.454f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.463f, -0.315f)
                arcTo(2f, 2f, 0f, false, false, 8.25f, 0.064f)
                arcTo(0.55f, 0.55f, 0f, false, false, 8f, 0f)
                arcToRelative(0.55f, 0.55f, 0f, false, false, -0.266f, 0.073f)
                arcToRelative(2f, 2f, 0f, false, false, -0.142f, 0.08f)
                arcToRelative(4f, 4f, 0f, false, false, -0.459f, 0.33f)
                curveToRelative(-0.37f, 0.308f, -0.844f, 0.803f, -1.31f, 1.57f)
                curveToRelative(-0.805f, 1.322f, -1.577f, 3.433f, -1.774f, 6.756f)
                lineToRelative(-1.497f, 1.826f)
                lineToRelative(-0.004f, 0.005f)
                arcTo(2.5f, 2.5f, 0f, false, false, 2f, 12.202f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.9f, 0.3f)
                lineToRelative(1.125f, -1.5f)
                curveToRelative(0.166f, -0.222f, 0.42f, -0.4f, 0.752f, -0.57f)
                curveToRelative(0.214f, -0.108f, 0.414f, -0.192f, 0.625f, -0.281f)
                lineToRelative(0.198f, -0.084f)
                curveToRelative(0.7f, 0.428f, 1.55f, 0.635f, 2.4f, 0.635f)
                reflectiveCurveToRelative(1.7f, -0.207f, 2.4f, -0.635f)
                quadToRelative(0.1f, 0.044f, 0.196f, 0.083f)
                curveToRelative(0.213f, 0.09f, 0.413f, 0.174f, 0.627f, 0.282f)
                curveToRelative(0.332f, 0.17f, 0.586f, 0.348f, 0.752f, 0.57f)
                lineToRelative(1.125f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.9f, -0.3f)
                verticalLineToRelative(-3.298f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.548f, -1.562f)
                close()
                moveTo(12f, 10.445f)
                verticalLineToRelative(0.055f)
                curveToRelative(0f, 0.866f, -0.284f, 1.585f, -0.75f, 2.14f)
                curveToRelative(0.146f, 0.064f, 0.292f, 0.13f, 0.425f, 0.199f)
                curveToRelative(0.39f, 0.197f, 0.8f, 0.46f, 1.1f, 0.86f)
                lineTo(13f, 14f)
                verticalLineToRelative(-1.798f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.327f, -0.935f)
                close()
                moveTo(4.75f, 12.64f)
                curveTo(4.284f, 12.085f, 4f, 11.366f, 4f, 10.5f)
                verticalLineToRelative(-0.054f)
                lineToRelative(-0.673f, 0.82f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.327f, 0.936f)
                verticalLineTo(14f)
                lineToRelative(0.225f, -0.3f)
                curveToRelative(0.3f, -0.4f, 0.71f, -0.664f, 1.1f, -0.861f)
                curveToRelative(0.133f, -0.068f, 0.279f, -0.135f, 0.425f, -0.199f)
                moveTo(8.009f, 1.073f)
                quadToRelative(0.096f, 0.06f, 0.226f, 0.163f)
                curveToRelative(0.284f, 0.226f, 0.683f, 0.621f, 1.09f, 1.28f)
                curveTo(10.137f, 3.836f, 11f, 6.237f, 11f, 10.5f)
                curveToRelative(0f, 0.858f, -0.374f, 1.48f, -0.943f, 1.893f)
                curveTo(9.517f, 12.786f, 8.781f, 13f, 8f, 13f)
                reflectiveCurveToRelative(-1.517f, -0.214f, -2.057f, -0.607f)
                curveTo(5.373f, 11.979f, 5f, 11.358f, 5f, 10.5f)
                curveToRelative(0f, -4.182f, 0.86f, -6.586f, 1.677f, -7.928f)
                curveToRelative(0.409f, -0.67f, 0.81f, -1.082f, 1.096f, -1.32f)
                quadToRelative(0.136f, -0.113f, 0.236f, -0.18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.479f, 14.361f)
                curveToRelative(-0.48f, 0.093f, -0.98f, 0.139f, -1.479f, 0.139f)
                reflectiveCurveToRelative(-0.999f, -0.046f, -1.479f, -0.139f)
                lineTo(7.6f, 15.8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.8f, 0f)
                close()
            }
        }.build()
        
        return _Rocket!!
    }

private var _Rocket: ImageVector? = null

