package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.TwitterSquare: ImageVector
    get() {
        if (_TwitterSquare != null) return _TwitterSquare!!
        
        _TwitterSquare = ImageVector.Builder(
            name = "twitter-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-48.9f, 158.8f)
                curveToRelative(0.2f, 2.8f, 0.2f, 5.7f, 0.2f, 8.5f)
                curveToRelative(0f, 86.7f, -66f, 186.6f, -186.6f, 186.6f)
                curveToRelative(-37.2f, 0f, -71.7f, -10.8f, -100.7f, -29.4f)
                curveToRelative(5.3f, 0.6f, 10.4f, 0.8f, 15.8f, 0.8f)
                curveToRelative(30.7f, 0f, 58.9f, -10.4f, 81.4f, -28f)
                curveToRelative(-28.8f, -0.6f, -53f, -19.5f, -61.3f, -45.5f)
                curveToRelative(10.1f, 1.5f, 19.2f, 1.5f, 29.6f, -1.2f)
                curveToRelative(-30f, -6.1f, -52.5f, -32.5f, -52.5f, -64.4f)
                verticalLineToRelative(-0.8f)
                curveToRelative(8.7f, 4.9f, 18.9f, 7.9f, 29.6f, 8.3f)
                arcToRelative(65.447f, 65.447f, 0f, false, true, -29.2f, -54.6f)
                curveToRelative(0f, -12.2f, 3.2f, -23.4f, 8.9f, -33.1f)
                curveToRelative(32.3f, 39.8f, 80.8f, 65.8f, 135.2f, 68.6f)
                curveToRelative(-9.3f, -44.5f, 24f, -80.6f, 64f, -80.6f)
                curveToRelative(18.9f, 0f, 35.9f, 7.9f, 47.9f, 20.7f)
                curveToRelative(14.8f, -2.8f, 29f, -8.3f, 41.6f, -15.8f)
                curveToRelative(-4.9f, 15.2f, -15.2f, 28f, -28.8f, 36.1f)
                curveToRelative(13.2f, -1.4f, 26f, -5.1f, 37.8f, -10.2f)
                curveToRelative(-8.9f, 13.1f, -20.1f, 24.7f, -32.9f, 34f)
                close()
            }
        }.build()
        
        return _TwitterSquare!!
    }

private var _TwitterSquare: ImageVector? = null

