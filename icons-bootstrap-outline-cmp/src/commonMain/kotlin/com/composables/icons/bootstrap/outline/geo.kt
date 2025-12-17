package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Geo: ImageVector
    get() {
        if (_Geo != null) return _Geo!!
        
        _Geo = ImageVector.Builder(
            name = "geo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
                moveTo(4f, 4f)
                arcToRelative(4f, 4f, 0f, true, true, 4.5f, 3.969f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(7.97f)
                arcTo(4f, 4f, 0f, false, true, 4f, 3.999f)
                close()
                moveToRelative(2.493f, 8.574f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.411f, 0.575f)
                curveToRelative(-0.712f, 0.118f, -1.28f, 0.295f, -1.655f, 0.493f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, -0.37f, 0.265f)
                arcToRelative(0.3f, 0.3f, 0f, false, false, -0.057f, 0.09f)
                verticalLineTo(14f)
                lineToRelative(0.002f, 0.008f)
                lineToRelative(0.016f, 0.033f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, 0.145f, 0.15f)
                curveToRelative(0.165f, 0.13f, 0.435f, 0.27f, 0.813f, 0.395f)
                curveToRelative(0.751f, 0.25f, 1.82f, 0.414f, 3.024f, 0.414f)
                reflectiveCurveToRelative(2.273f, -0.163f, 3.024f, -0.414f)
                curveToRelative(0.378f, -0.126f, 0.648f, -0.265f, 0.813f, -0.395f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, 0.146f, -0.15f)
                lineToRelative(0.015f, -0.033f)
                lineTo(12f, 14f)
                verticalLineToRelative(-0.004f)
                arcToRelative(0.3f, 0.3f, 0f, false, false, -0.057f, -0.09f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, -0.37f, -0.264f)
                curveToRelative(-0.376f, -0.198f, -0.943f, -0.375f, -1.655f, -0.493f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.164f, -0.986f)
                curveToRelative(0.77f, 0.127f, 1.452f, 0.328f, 1.957f, 0.594f)
                curveTo(12.5f, 13f, 13f, 13.4f, 13f, 14f)
                curveToRelative(0f, 0.426f, -0.26f, 0.752f, -0.544f, 0.977f)
                curveToRelative(-0.29f, 0.228f, -0.68f, 0.413f, -1.116f, 0.558f)
                curveToRelative(-0.878f, 0.293f, -2.059f, 0.465f, -3.34f, 0.465f)
                reflectiveCurveToRelative(-2.462f, -0.172f, -3.34f, -0.465f)
                curveToRelative(-0.436f, -0.145f, -0.826f, -0.33f, -1.116f, -0.558f)
                curveTo(3.26f, 14.752f, 3f, 14.426f, 3f, 14f)
                curveToRelative(0f, -0.599f, 0.5f, -1f, 0.961f, -1.243f)
                curveToRelative(0.505f, -0.266f, 1.187f, -0.467f, 1.957f, -0.594f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.575f, 0.411f)
            }
        }.build()
        
        return _Geo!!
    }

private var _Geo: ImageVector? = null

