package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.RedditSquare: ImageVector
    get() {
        if (_RedditSquare != null) return _RedditSquare!!
        
        _RedditSquare = ImageVector.Builder(
            name = "reddit-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(283.2f, 345.5f)
                curveToRelative(2.7f, 2.7f, 2.7f, 6.8f, 0f, 9.2f)
                curveToRelative(-24.5f, 24.5f, -93.8f, 24.6f, -118.4f, 0f)
                curveToRelative(-2.7f, -2.4f, -2.7f, -6.5f, 0f, -9.2f)
                curveToRelative(2.4f, -2.4f, 6.5f, -2.4f, 8.9f, 0f)
                curveToRelative(18.7f, 19.2f, 81f, 19.6f, 100.5f, 0f)
                curveToRelative(2.4f, -2.3f, 6.6f, -2.3f, 9f, 0f)
                close()
                moveToRelative(-91.3f, -53.8f)
                curveToRelative(0f, -14.9f, -11.9f, -26.8f, -26.5f, -26.8f)
                curveToRelative(-14.9f, 0f, -26.8f, 11.9f, -26.8f, 26.8f)
                curveToRelative(0f, 14.6f, 11.9f, 26.5f, 26.8f, 26.5f)
                curveToRelative(14.6f, 0f, 26.5f, -11.9f, 26.5f, -26.5f)
                close()
                moveToRelative(90.7f, -26.8f)
                curveToRelative(-14.6f, 0f, -26.5f, 11.9f, -26.5f, 26.8f)
                curveToRelative(0f, 14.6f, 11.9f, 26.5f, 26.5f, 26.5f)
                curveToRelative(14.9f, 0f, 26.8f, -11.9f, 26.8f, -26.5f)
                curveToRelative(0f, -14.9f, -11.9f, -26.8f, -26.8f, -26.8f)
                close()
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveToRelative(-99.7f, 140.6f)
                curveToRelative(-10.1f, 0f, -19f, 4.2f, -25.6f, 10.7f)
                curveToRelative(-24.1f, -16.7f, -56.5f, -27.4f, -92.5f, -28.6f)
                lineToRelative(18.7f, -84.2f)
                lineToRelative(59.5f, 13.4f)
                curveToRelative(0f, 14.6f, 11.9f, 26.5f, 26.5f, 26.5f)
                curveToRelative(14.9f, 0f, 26.8f, -12.2f, 26.8f, -26.8f)
                curveToRelative(0f, -14.6f, -11.9f, -26.8f, -26.8f, -26.8f)
                curveToRelative(-10.4f, 0f, -19.3f, 6.2f, -23.8f, 14.9f)
                lineToRelative(-65.7f, -14.6f)
                curveToRelative(-3.3f, -0.9f, -6.5f, 1.5f, -7.4f, 4.8f)
                lineToRelative(-20.5f, 92.8f)
                curveToRelative(-35.7f, 1.5f, -67.8f, 12.2f, -91.9f, 28.9f)
                curveToRelative(-6.5f, -6.8f, -15.8f, -11f, -25.9f, -11f)
                curveToRelative(-37.5f, 0f, -49.8f, 50.4f, -15.5f, 67.5f)
                curveToRelative(-1.2f, 5.4f, -1.8f, 11f, -1.8f, 16.7f)
                curveToRelative(0f, 56.5f, 63.7f, 102.3f, 141.9f, 102.3f)
                curveToRelative(78.5f, 0f, 142.2f, -45.8f, 142.2f, -102.3f)
                curveToRelative(0f, -5.7f, -0.6f, -11.6f, -2.1f, -17f)
                curveToRelative(33.6f, -17.2f, 21.2f, -67.2f, -16.1f, -67.2f)
                close()
            }
        }.build()
        
        return _RedditSquare!!
    }

private var _RedditSquare: ImageVector? = null

