package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Registered: ImageVector
    get() {
        if (_Registered != null) return _Registered!!
        
        _Registered = ImageVector.Builder(
            name = "registered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(285.363f, 207.475f)
                curveToRelative(0f, 18.6f, -9.831f, 28.431f, -28.431f, 28.431f)
                horizontalLineToRelative(-29.876f)
                verticalLineToRelative(-56.14f)
                horizontalLineToRelative(23.378f)
                curveToRelative(28.668f, 0f, 34.929f, 8.773f, 34.929f, 27.709f)
                close()
                moveTo(504f, 256f)
                curveToRelative(0f, 136.967f, -111.033f, 248f, -248f, 248f)
                reflectiveCurveTo(8f, 392.967f, 8f, 256f)
                reflectiveCurveTo(119.033f, 8f, 256f, 8f)
                reflectiveCurveToRelative(248f, 111.033f, 248f, 248f)
                close()
                moveTo(363.411f, 360.414f)
                curveToRelative(-46.729f, -84.825f, -43.299f, -78.636f, -44.702f, -80.98f)
                curveToRelative(23.432f, -15.172f, 37.945f, -42.979f, 37.945f, -74.486f)
                curveToRelative(0f, -54.244f, -31.5f, -89.252f, -105.498f, -89.252f)
                horizontalLineToRelative(-70.667f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineTo(372f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(22.567f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineToRelative(-71.663f)
                horizontalLineToRelative(25.556f)
                lineToRelative(44.129f, 82.937f)
                arcToRelative(24.001f, 24.001f, 0f, false, false, 21.188f, 12.727f)
                horizontalLineToRelative(24.464f)
                curveToRelative(18.261f, -0.001f, 29.829f, -19.591f, 21.018f, -35.587f)
                close()
            }
        }.build()
        
        return _Registered!!
    }

private var _Registered: ImageVector? = null

