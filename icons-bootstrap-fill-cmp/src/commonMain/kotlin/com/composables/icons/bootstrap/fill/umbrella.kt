package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) return _Umbrella!!
        
        _Umbrella = ImageVector.Builder(
            name = "umbrella",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.514f)
                curveTo(12.625f, 1.238f, 16f, 4.22f, 16f, 8f)
                curveToRelative(0f, 0f, 0f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-0.149f, 0f, -0.352f, -0.145f, -0.352f, -0.145f)
                lineToRelative(-0.004f, -0.004f)
                lineToRelative(-0.025f, -0.023f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.555f, -0.394f)
                arcTo(3.17f, 3.17f, 0f, false, false, 13f, 7.5f)
                curveToRelative(-0.638f, 0f, -1.178f, 0.213f, -1.564f, 0.434f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.555f, 0.394f)
                lineToRelative(-0.025f, 0.023f)
                lineToRelative(-0.003f, 0.003f)
                reflectiveCurveToRelative(-0.204f, 0.146f, -0.353f, 0.146f)
                reflectiveCurveToRelative(-0.352f, -0.145f, -0.352f, -0.145f)
                lineToRelative(-0.004f, -0.004f)
                lineToRelative(-0.025f, -0.023f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.555f, -0.394f)
                arcToRelative(3.3f, 3.3f, 0f, false, false, -1.064f, -0.39f)
                verticalLineTo(13.5f)
                horizontalLineTo(8f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.039f)
                lineToRelative(-0.005f, 0.083f)
                arcToRelative(3f, 3f, 0f, false, true, -0.298f, 1.102f)
                arcToRelative(2.26f, 2.26f, 0f, false, true, -0.763f, 0.88f)
                curveTo(7.06f, 15.851f, 6.587f, 16f, 6f, 16f)
                reflectiveCurveToRelative(-1.061f, -0.148f, -1.434f, -0.396f)
                arcToRelative(2.26f, 2.26f, 0f, false, true, -0.763f, -0.88f)
                arcToRelative(3f, 3f, 0f, false, true, -0.302f, -1.185f)
                verticalLineToRelative(-0.025f)
                lineToRelative(-0.001f, -0.009f)
                verticalLineToRelative(-0.003f)
                reflectiveCurveToRelative(0f, -0.002f, 0.5f, -0.002f)
                horizontalLineToRelative(-0.5f)
                verticalLineTo(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(0.506f)
                lineToRelative(0.003f, 0.044f)
                arcToRelative(2f, 2f, 0f, false, false, 0.195f, 0.726f)
                curveToRelative(0.095f, 0.191f, 0.23f, 0.367f, 0.423f, 0.495f)
                curveToRelative(0.19f, 0.127f, 0.466f, 0.229f, 0.879f, 0.229f)
                reflectiveCurveToRelative(0.689f, -0.102f, 0.879f, -0.229f)
                curveToRelative(0.193f, -0.128f, 0.328f, -0.304f, 0.424f, -0.495f)
                arcToRelative(2f, 2f, 0f, false, false, 0.197f, -0.77f)
                verticalLineTo(7.544f)
                arcToRelative(3.3f, 3.3f, 0f, false, false, -1.064f, 0.39f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.58f, 0.417f)
                lineToRelative(-0.004f, 0.004f)
                reflectiveCurveTo(5.65f, 8.5f, 5.5f, 8.5f)
                reflectiveCurveToRelative(-0.352f, -0.145f, -0.352f, -0.145f)
                lineToRelative(-0.004f, -0.004f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.58f, -0.417f)
                arcTo(3.17f, 3.17f, 0f, false, false, 3f, 7.5f)
                curveToRelative(-0.638f, 0f, -1.177f, 0.213f, -1.564f, 0.434f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.58f, 0.417f)
                lineToRelative(-0.004f, 0.004f)
                reflectiveCurveTo(0.65f, 8.5f, 0.5f, 8.5f)
                curveTo(0f, 8.5f, 0f, 8f, 0f, 8f)
                curveToRelative(0f, -3.78f, 3.375f, -6.762f, 7.5f, -6.986f)
                verticalLineTo(0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 0f)
            }
        }.build()
        
        return _Umbrella!!
    }

private var _Umbrella: ImageVector? = null

