package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.YoutubeSquare: ImageVector
    get() {
        if (_YoutubeSquare != null) return _YoutubeSquare!!
        
        _YoutubeSquare = ImageVector.Builder(
            name = "youtube-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(186.8f, 202.1f)
                lineToRelative(95.2f, 54.1f)
                lineToRelative(-95.2f, 54.1f)
                verticalLineTo(202.1f)
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
                moveToRelative(-42f, 176.3f)
                reflectiveCurveToRelative(0f, -59.6f, -7.6f, -88.2f)
                curveToRelative(-4.2f, -15.8f, -16.5f, -28.2f, -32.2f, -32.4f)
                curveTo(337.9f, 128f, 224f, 128f, 224f, 128f)
                reflectiveCurveToRelative(-113.9f, 0f, -142.2f, 7.7f)
                curveToRelative(-15.7f, 4.2f, -28f, 16.6f, -32.2f, 32.4f)
                curveToRelative(-7.6f, 28.5f, -7.6f, 88.2f, -7.6f, 88.2f)
                reflectiveCurveToRelative(0f, 59.6f, 7.6f, 88.2f)
                curveToRelative(4.2f, 15.8f, 16.5f, 27.7f, 32.2f, 31.9f)
                curveTo(110.1f, 384f, 224f, 384f, 224f, 384f)
                reflectiveCurveToRelative(113.9f, 0f, 142.2f, -7.7f)
                curveToRelative(15.7f, -4.2f, 28f, -16.1f, 32.2f, -31.9f)
                curveToRelative(7.6f, -28.5f, 7.6f, -88.1f, 7.6f, -88.1f)
                close()
            }
        }.build()
        
        return _YoutubeSquare!!
    }

private var _YoutubeSquare: ImageVector? = null

