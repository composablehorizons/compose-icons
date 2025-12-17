package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Mastodon: ImageVector
    get() {
        if (_Mastodon != null) return _Mastodon!!
        
        _Mastodon = ImageVector.Builder(
            name = "mastodon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(433f, 179.11f)
                curveToRelative(0f, -97.2f, -63.71f, -125.7f, -63.71f, -125.7f)
                curveToRelative(-62.52f, -28.7f, -228.56f, -28.4f, -290.48f, 0f)
                curveToRelative(0f, 0f, -63.72f, 28.5f, -63.72f, 125.7f)
                curveToRelative(0f, 115.7f, -6.6f, 259.4f, 105.63f, 289.1f)
                curveToRelative(40.51f, 10.7f, 75.32f, 13f, 103.33f, 11.4f)
                curveToRelative(50.81f, -2.8f, 79.32f, -18.1f, 79.32f, -18.1f)
                lineToRelative(-1.7f, -36.9f)
                reflectiveCurveToRelative(-36.31f, 11.4f, -77.12f, 10.1f)
                curveToRelative(-40.41f, -1.4f, -83f, -4.4f, -89.63f, -54f)
                arcToRelative(102.54f, 102.54f, 0f, false, true, -0.9f, -13.9f)
                curveToRelative(85.63f, 20.9f, 158.65f, 9.1f, 178.75f, 6.7f)
                curveToRelative(56.12f, -6.7f, 105f, -41.3f, 111.23f, -72.9f)
                curveToRelative(9.8f, -49.8f, 9f, -121.5f, 9f, -121.5f)
                close()
                moveToRelative(-75.12f, 125.2f)
                horizontalLineToRelative(-46.63f)
                verticalLineToRelative(-114.2f)
                curveToRelative(0f, -49.7f, -64f, -51.6f, -64f, 6.9f)
                verticalLineToRelative(62.5f)
                horizontalLineToRelative(-46.33f)
                verticalLineTo(197f)
                curveToRelative(0f, -58.5f, -64f, -56.6f, -64f, -6.9f)
                verticalLineToRelative(114.2f)
                horizontalLineTo(90.19f)
                curveToRelative(0f, -122.1f, -5.2f, -147.9f, 18.41f, -175f)
                curveToRelative(25.9f, -28.9f, 79.82f, -30.8f, 103.83f, 6.1f)
                lineToRelative(11.6f, 19.5f)
                lineToRelative(11.6f, -19.5f)
                curveToRelative(24.11f, -37.1f, 78.12f, -34.8f, 103.83f, -6.1f)
                curveToRelative(23.71f, 27.3f, 18.4f, 53f, 18.4f, 175f)
                close()
            }
        }.build()
        
        return _Mastodon!!
    }

private var _Mastodon: ImageVector? = null

