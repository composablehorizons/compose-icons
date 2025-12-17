package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.KickstarterK: ImageVector
    get() {
        if (_KickstarterK != null) return _KickstarterK!!
        
        _KickstarterK = ImageVector.Builder(
            name = "kickstarter-k",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(147.3f, 114.4f)
                curveToRelative(0f, -56.2f, -32.5f, -82.4f, -73.4f, -82.4f)
                curveTo(26.2f, 32f, 0f, 68.2f, 0f, 113.4f)
                verticalLineToRelative(283f)
                curveToRelative(0f, 47.3f, 25.3f, 83.4f, 74.9f, 83.4f)
                curveToRelative(39.8f, 0f, 72.4f, -25.6f, 72.4f, -83.4f)
                verticalLineToRelative(-76.5f)
                lineToRelative(112.1f, 138.3f)
                curveToRelative(22.7f, 27.2f, 72.1f, 30.7f, 103.2f, 0f)
                curveToRelative(27f, -27.6f, 27.3f, -67.4f, 7.4f, -92.2f)
                lineToRelative(-90.8f, -114.8f)
                lineToRelative(74.9f, -107.4f)
                curveToRelative(17.4f, -24.7f, 17.5f, -63.1f, -10.4f, -89.8f)
                curveToRelative(-30.3f, -29f, -82.4f, -31.6f, -113.6f, 12.8f)
                lineTo(147.3f, 185f)
                verticalLineToRelative(-70.6f)
                close()
            }
        }.build()
        
        return _KickstarterK!!
    }

private var _KickstarterK: ImageVector? = null

