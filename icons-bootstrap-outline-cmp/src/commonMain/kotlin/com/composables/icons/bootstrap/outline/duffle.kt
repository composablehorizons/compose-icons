package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Duffle: ImageVector
    get() {
        if (_Duffle != null) return _Duffle!!
        
        _Duffle = ImageVector.Builder(
            name = "duffle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5.75f)
                curveToRelative(1.388f, 0f, 2.673f, 0.193f, 3.609f, 0.385f)
                arcToRelative(18f, 18f, 0f, false, true, 1.43f, 0.354f)
                lineToRelative(0.112f, 0.034f)
                lineToRelative(0.002f, 0.001f)
                horizontalLineToRelative(0.001f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.308f, 0.952f)
                lineToRelative(-0.004f, -0.002f)
                lineToRelative(-0.018f, -0.005f)
                arcToRelative(17f, 17f, 0f, false, false, -1.417f, -0.354f)
                arcTo(17.3f, 17.3f, 0f, false, false, 8f, 6.75f)
                arcToRelative(17.3f, 17.3f, 0f, false, false, -3.408f, 0.365f)
                arcToRelative(17f, 17f, 0f, false, false, -1.416f, 0.354f)
                lineToRelative(-0.018f, 0.005f)
                lineToRelative(-0.003f, 0.001f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.308f, -0.95f)
                arcTo(17.3f, 17.3f, 0f, false, true, 8f, 5.75f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.229f, 2.722f)
                curveToRelative(-0.126f, 0.461f, -0.19f, 0.945f, -0.222f, 1.375f)
                curveToRelative(-1.401f, 0.194f, -2.65f, 0.531f, -3.525f, 1.012f)
                curveTo(-0.644f, 6.278f, 0.036f, 11.204f, 0.393f, 13.127f)
                arcToRelative(0.954f, 0.954f, 0f, false, false, 0.95f, 0.772f)
                horizontalLineToRelative(13.314f)
                arcToRelative(0.954f, 0.954f, 0f, false, false, 0.95f, -0.772f)
                curveToRelative(0.357f, -1.923f, 1.037f, -6.85f, -1.09f, -8.018f)
                curveToRelative(-0.873f, -0.48f, -2.123f, -0.818f, -3.524f, -1.012f)
                arcToRelative(7.4f, 7.4f, 0f, false, false, -0.222f, -1.375f)
                curveToRelative(-0.162f, -0.593f, -0.445f, -1.228f, -0.971f, -1.622f)
                curveToRelative(-1.115f, -0.836f, -2.485f, -0.836f, -3.6f, 0f)
                curveToRelative(-0.526f, 0.394f, -0.81f, 1.03f, -0.971f, 1.622f)
                moveTo(9.2f, 1.9f)
                curveToRelative(0.26f, 0.195f, 0.466f, 0.57f, 0.606f, 1.085f)
                curveToRelative(0.088f, 0.322f, 0.142f, 0.667f, 0.173f, 0.998f)
                arcToRelative(23.3f, 23.3f, 0f, false, false, -3.958f, 0f)
                arcToRelative(6f, 6f, 0f, false, true, 0.173f, -0.998f)
                curveToRelative(0.14f, -0.515f, 0.346f, -0.89f, 0.606f, -1.085f)
                curveToRelative(0.76f, -0.57f, 1.64f, -0.57f, 2.4f, 0f)
                moveTo(8f, 4.9f)
                curveToRelative(2.475f, 0f, 4.793f, 0.402f, 6.036f, 1.085f)
                curveToRelative(0.238f, 0.13f, 0.472f, 0.406f, 0.655f, 0.93f)
                curveToRelative(0.183f, 0.522f, 0.28f, 1.195f, 0.303f, 1.952f)
                curveToRelative(0.047f, 1.486f, -0.189f, 3.088f, -0.362f, 4.032f)
                horizontalLineTo(1.368f)
                curveToRelative(-0.173f, -0.944f, -0.409f, -2.545f, -0.362f, -4.032f)
                curveToRelative(0.024f, -0.757f, 0.12f, -1.43f, 0.303f, -1.952f)
                curveToRelative(0.183f, -0.524f, 0.417f, -0.8f, 0.655f, -0.93f)
                curveTo(3.207f, 5.302f, 5.525f, 4.9f, 8f, 4.9f)
            }
        }.build()
        
        return _Duffle!!
    }

private var _Duffle: ImageVector? = null

