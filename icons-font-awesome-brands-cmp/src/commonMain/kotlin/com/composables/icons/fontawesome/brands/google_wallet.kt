package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GoogleWallet: ImageVector
    get() {
        if (_GoogleWallet != null) return _GoogleWallet!!
        
        _GoogleWallet = ImageVector.Builder(
            name = "google-wallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(156.8f, 126.8f)
                curveToRelative(37.6f, 60.6f, 64.2f, 113.1f, 84.3f, 162.5f)
                curveToRelative(-8.3f, 33.8f, -18.8f, 66.5f, -31.3f, 98.3f)
                curveToRelative(-13.2f, -52.3f, -26.5f, -101.3f, -56f, -148.5f)
                curveToRelative(6.5f, -36.4f, 2.3f, -73.6f, 3f, -112.3f)
                close()
                moveTo(109.3f, 200f)
                horizontalLineTo(16.1f)
                curveToRelative(-6.5f, 0f, -10.5f, 7.5f, -6.5f, 12.7f)
                curveTo(51.8f, 267f, 81.3f, 330.5f, 101.3f, 400f)
                horizontalLineToRelative(103.5f)
                curveToRelative(-16.2f, -69.7f, -38.7f, -133.7f, -82.5f, -193.5f)
                curveToRelative(-3f, -4f, -8f, -6.5f, -13f, -6.5f)
                close()
                moveToRelative(47.8f, -88f)
                curveToRelative(68.5f, 108f, 130f, 234.5f, 138.2f, 368f)
                horizontalLineTo(409f)
                curveToRelative(-12f, -138f, -68.4f, -265f, -143.2f, -368f)
                horizontalLineTo(157.1f)
                close()
                moveToRelative(251.8f, -68.5f)
                curveToRelative(-1.8f, -6.8f, -8.2f, -11.5f, -15.2f, -11.5f)
                horizontalLineToRelative(-88.3f)
                curveToRelative(-5.3f, 0f, -9f, 5f, -7.8f, 10.3f)
                curveToRelative(13.2f, 46.5f, 22.3f, 95.5f, 26.5f, 146f)
                curveToRelative(48.2f, 86.2f, 79.7f, 178.3f, 90.6f, 270.8f)
                curveToRelative(15.8f, -60.5f, 25.3f, -133.5f, 25.3f, -203f)
                curveToRelative(0f, -73.6f, -12.1f, -145.1f, -31.1f, -212.6f)
                close()
            }
        }.build()
        
        return _GoogleWallet!!
    }

private var _GoogleWallet: ImageVector? = null

