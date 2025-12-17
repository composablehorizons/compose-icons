package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandSpotify: ImageVector
    get() {
        if (_BrandSpotify != null) return _BrandSpotify!!
        
        _BrandSpotify = ImageVector.Builder(
            name = "brand-spotify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                moveToRelative(-2.168f, 11.605f)
                curveToRelative(-1.285f, -1.927f, -4.354f, -2.132f, -6.387f, -0.777f)
                arcToRelative(1f, 1f, 0f, false, false, 1.11f, 1.664f)
                curveToRelative(1.195f, -0.797f, 3.014f, -0.675f, 3.613f, 0.223f)
                arcToRelative(1f, 1f, 0f, true, false, 1.664f, -1.11f)
                moveToRelative(1.268f, -3.245f)
                curveToRelative(-2.469f, -1.852f, -5.895f, -2.187f, -8.608f, -0.589f)
                arcToRelative(1f, 1f, 0f, false, false, 1.016f, 1.724f)
                curveToRelative(1.986f, -1.171f, 4.544f, -0.92f, 6.392f, 0.465f)
                arcToRelative(1f, 1f, 0f, false, false, 1.2f, -1.6f)
                moveToRelative(1.43f, -3.048f)
                curveToRelative(-3.677f, -2.298f, -7.766f, -2.152f, -10.977f, -0.546f)
                arcToRelative(1f, 1f, 0f, false, false, 0.894f, 1.788f)
                curveToRelative(2.635f, -1.317f, 5.997f, -1.437f, 9.023f, 0.454f)
                arcToRelative(1f, 1f, 0f, true, false, 1.06f, -1.696f)
            }
        }.build()
        
        return _BrandSpotify!!
    }

private var _BrandSpotify: ImageVector? = null

