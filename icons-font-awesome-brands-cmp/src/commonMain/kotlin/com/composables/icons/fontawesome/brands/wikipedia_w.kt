package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.WikipediaW: ImageVector
    get() {
        if (_WikipediaW != null) return _WikipediaW!!
        
        _WikipediaW = ImageVector.Builder(
            name = "wikipedia-w",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 51.2f)
                lineToRelative(-0.3f, 12.2f)
                curveToRelative(-28.1f, 0.8f, -45f, 15.8f, -55.8f, 40.3f)
                curveToRelative(-25f, 57.8f, -103.3f, 240f, -155.3f, 358.6f)
                horizontalLineTo(415f)
                lineToRelative(-81.9f, -193.1f)
                curveToRelative(-32.5f, 63.6f, -68.3f, 130f, -99.2f, 193.1f)
                curveToRelative(-0.3f, 0.3f, -15f, 0f, -15f, -0.3f)
                curveTo(172f, 352.3f, 122.8f, 243.4f, 75.8f, 133.4f)
                curveTo(64.4f, 106.7f, 26.4f, 63.4f, 0.2f, 63.7f)
                curveToRelative(0f, -3.1f, -0.3f, -10f, -0.3f, -14.2f)
                horizontalLineToRelative(161.9f)
                verticalLineToRelative(13.9f)
                curveToRelative(-19.2f, 1.1f, -52.8f, 13.3f, -43.3f, 34.2f)
                curveToRelative(21.9f, 49.7f, 103.6f, 240.3f, 125.6f, 288.6f)
                curveToRelative(15f, -29.7f, 57.8f, -109.2f, 75.3f, -142.8f)
                curveToRelative(-13.9f, -28.3f, -58.6f, -133.9f, -72.8f, -160f)
                curveToRelative(-9.7f, -17.8f, -36.1f, -19.4f, -55.8f, -19.7f)
                verticalLineTo(49.8f)
                lineToRelative(142.5f, 0.3f)
                verticalLineToRelative(13.1f)
                curveToRelative(-19.4f, 0.6f, -38.1f, 7.8f, -29.4f, 26.1f)
                curveToRelative(18.9f, 40f, 30.6f, 68.1f, 48.1f, 104.7f)
                curveToRelative(5.6f, -10.8f, 34.7f, -69.4f, 48.1f, -100.8f)
                curveToRelative(8.9f, -20.6f, -3.9f, -28.6f, -38.6f, -29.4f)
                curveToRelative(0.3f, -3.6f, 0f, -10.3f, 0.3f, -13.6f)
                curveToRelative(44.4f, -0.3f, 111.1f, -0.3f, 123.1f, -0.6f)
                verticalLineToRelative(13.6f)
                curveToRelative(-22.5f, 0.8f, -45.8f, 12.8f, -58.1f, 31.7f)
                lineToRelative(-59.2f, 122.8f)
                curveToRelative(6.4f, 16.1f, 63.3f, 142.8f, 69.2f, 156.7f)
                lineTo(559.2f, 91.8f)
                curveToRelative(-8.6f, -23.1f, -36.4f, -28.1f, -47.2f, -28.3f)
                verticalLineTo(49.6f)
                lineToRelative(127.8f, 1.1f)
                lineToRelative(0.2f, 0.5f)
                close()
            }
        }.build()
        
        return _WikipediaW!!
    }

private var _WikipediaW: ImageVector? = null

