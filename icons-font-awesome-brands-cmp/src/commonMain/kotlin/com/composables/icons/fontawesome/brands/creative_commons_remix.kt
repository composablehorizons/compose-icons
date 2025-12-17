package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CreativeCommonsRemix: ImageVector
    get() {
        if (_CreativeCommonsRemix != null) return _CreativeCommonsRemix!!
        
        _CreativeCommonsRemix = ImageVector.Builder(
            name = "creative-commons-remix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(247.6f, 8f)
                curveTo(389.4f, 8f, 496f, 118.1f, 496f, 256f)
                curveToRelative(0f, 147.1f, -118.5f, 248f, -248.4f, 248f)
                curveTo(113.6f, 504f, 0f, 394.5f, 0f, 256f)
                curveTo(0f, 123.1f, 104.7f, 8f, 247.6f, 8f)
                close()
                moveToRelative(0.8f, 44.7f)
                curveTo(130.2f, 52.7f, 44.7f, 150.6f, 44.7f, 256f)
                curveToRelative(0f, 109.8f, 91.2f, 202.8f, 203.7f, 202.8f)
                curveToRelative(103.2f, 0f, 202.8f, -81.1f, 202.8f, -202.8f)
                curveToRelative(0.1f, -113.8f, -90.2f, -203.3f, -202.8f, -203.3f)
                close()
                moveToRelative(161.7f, 207.7f)
                lineToRelative(4.9f, 2.2f)
                verticalLineToRelative(70f)
                curveToRelative(-7.2f, 3.6f, -63.4f, 27.5f, -67.3f, 28.8f)
                curveToRelative(-6.5f, -1.8f, -113.7f, -46.8f, -137.3f, -56.2f)
                lineToRelative(-64.2f, 26.6f)
                lineToRelative(-63.3f, -27.5f)
                verticalLineToRelative(-63.8f)
                lineToRelative(59.3f, -24.8f)
                curveToRelative(-0.7f, -0.7f, -0.4f, 5f, -0.4f, -70.4f)
                lineToRelative(67.3f, -29.7f)
                lineTo(361f, 178.5f)
                verticalLineToRelative(61.6f)
                lineToRelative(49.1f, 20.3f)
                close()
                moveToRelative(-70.4f, 81.5f)
                verticalLineToRelative(-43.8f)
                horizontalLineToRelative(-0.4f)
                verticalLineToRelative(-1.8f)
                lineToRelative(-113.8f, -46.5f)
                verticalLineTo(295f)
                lineToRelative(113.8f, 46.9f)
                verticalLineToRelative(-0.4f)
                lineToRelative(0.4f, 0.4f)
                close()
                moveToRelative(7.5f, -57.6f)
                lineToRelative(39.9f, -16.4f)
                lineToRelative(-36.8f, -15.5f)
                lineToRelative(-39f, 16.4f)
                lineToRelative(35.9f, 15.5f)
                close()
                moveToRelative(52.3f, 38.1f)
                verticalLineToRelative(-43f)
                lineTo(355.2f, 298f)
                verticalLineToRelative(43.4f)
                lineToRelative(44.3f, -19f)
                close()
            }
        }.build()
        
        return _CreativeCommonsRemix!!
    }

private var _CreativeCommonsRemix: ImageVector? = null

