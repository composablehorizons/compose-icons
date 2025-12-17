package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Weixin: ImageVector
    get() {
        if (_Weixin != null) return _Weixin!!
        
        _Weixin = ImageVector.Builder(
            name = "weixin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(385.2f, 167.6f)
                curveToRelative(6.4f, 0f, 12.6f, 0.3f, 18.8f, 1.1f)
                curveTo(387.4f, 90.3f, 303.3f, 32f, 207.7f, 32f)
                curveTo(100.5f, 32f, 13f, 104.8f, 13f, 197.4f)
                curveToRelative(0f, 53.4f, 29.3f, 97.5f, 77.9f, 131.6f)
                lineToRelative(-19.3f, 58.6f)
                lineToRelative(68f, -34.1f)
                curveToRelative(24.4f, 4.8f, 43.8f, 9.7f, 68.2f, 9.7f)
                curveToRelative(6.2f, 0f, 12.1f, -0.3f, 18.3f, -0.8f)
                curveToRelative(-4f, -12.9f, -6.2f, -26.6f, -6.2f, -40.8f)
                curveToRelative(-0.1f, -84.9f, 72.9f, -154f, 165.3f, -154f)
                close()
                moveToRelative(-104.5f, -52.9f)
                curveToRelative(14.5f, 0f, 24.2f, 9.7f, 24.2f, 24.4f)
                curveToRelative(0f, 14.5f, -9.7f, 24.2f, -24.2f, 24.2f)
                curveToRelative(-14.8f, 0f, -29.3f, -9.7f, -29.3f, -24.2f)
                curveToRelative(0.1f, -14.7f, 14.6f, -24.4f, 29.3f, -24.4f)
                close()
                moveToRelative(-136.4f, 48.6f)
                curveToRelative(-14.5f, 0f, -29.3f, -9.7f, -29.3f, -24.2f)
                curveToRelative(0f, -14.8f, 14.8f, -24.4f, 29.3f, -24.4f)
                curveToRelative(14.8f, 0f, 24.4f, 9.7f, 24.4f, 24.4f)
                curveToRelative(0f, 14.6f, -9.6f, 24.2f, -24.4f, 24.2f)
                close()
                moveTo(563f, 319.4f)
                curveToRelative(0f, -77.9f, -77.9f, -141.3f, -165.4f, -141.3f)
                curveToRelative(-92.7f, 0f, -165.4f, 63.4f, -165.4f, 141.3f)
                reflectiveCurveTo(305f, 460.7f, 397.6f, 460.7f)
                curveToRelative(19.3f, 0f, 38.9f, -5.1f, 58.6f, -9.9f)
                lineToRelative(53.4f, 29.3f)
                lineToRelative(-14.8f, -48.6f)
                curveTo(534f, 402.1f, 563f, 363.2f, 563f, 319.4f)
                close()
                moveToRelative(-219.1f, -24.5f)
                curveToRelative(-9.7f, 0f, -19.3f, -9.7f, -19.3f, -19.6f)
                curveToRelative(0f, -9.7f, 9.7f, -19.3f, 19.3f, -19.3f)
                curveToRelative(14.8f, 0f, 24.4f, 9.7f, 24.4f, 19.3f)
                curveToRelative(0f, 10f, -9.7f, 19.6f, -24.4f, 19.6f)
                close()
                moveToRelative(107.1f, 0f)
                curveToRelative(-9.7f, 0f, -19.3f, -9.7f, -19.3f, -19.6f)
                curveToRelative(0f, -9.7f, 9.7f, -19.3f, 19.3f, -19.3f)
                curveToRelative(14.5f, 0f, 24.4f, 9.7f, 24.4f, 19.3f)
                curveToRelative(0.1f, 10f, -9.9f, 19.6f, -24.4f, 19.6f)
                close()
            }
        }.build()
        
        return _Weixin!!
    }

private var _Weixin: ImageVector? = null

