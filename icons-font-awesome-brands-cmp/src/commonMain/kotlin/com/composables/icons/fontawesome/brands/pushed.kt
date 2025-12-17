package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Pushed: ImageVector
    get() {
        if (_Pushed != null) return _Pushed!!
        
        _Pushed = ImageVector.Builder(
            name = "pushed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 432f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(407f, 111.9f)
                lineToRelative(-98.5f, -9f)
                lineToRelative(14f, -33.4f)
                curveToRelative(10.4f, -23.5f, -10.8f, -40.4f, -28.7f, -37f)
                lineTo(22.5f, 76.9f)
                curveToRelative(-15.1f, 2.7f, -26f, 18.3f, -21.4f, 36.6f)
                lineToRelative(105.1f, 348.3f)
                curveToRelative(6.5f, 21.3f, 36.7f, 24.2f, 47.7f, 7f)
                lineToRelative(35.3f, -80.8f)
                lineToRelative(235.2f, -231.3f)
                curveToRelative(16.4f, -16.8f, 4.3f, -42.9f, -17.4f, -44.8f)
                close()
                moveTo(297.6f, 53.6f)
                curveToRelative(5.1f, -0.7f, 7.5f, 2.5f, 5.2f, 7.4f)
                lineTo(286f, 100.9f)
                lineTo(108.6f, 84.6f)
                lineToRelative(189f, -31f)
                close()
                moveTo(22.7f, 107.9f)
                curveToRelative(-3.1f, -5.1f, 1f, -10f, 6.1f, -9.1f)
                lineToRelative(248.7f, 22.7f)
                lineToRelative(-96.9f, 230.7f)
                lineTo(22.7f, 107.9f)
                close()
                moveTo(136f, 456.4f)
                curveToRelative(-2.6f, 4f, -7.9f, 3.1f, -9.4f, -1.2f)
                lineTo(43.5f, 179.7f)
                lineToRelative(127.7f, 197.6f)
                curveToRelative(-7f, 15f, -35.2f, 79.1f, -35.2f, 79.1f)
                close()
                moveToRelative(272.8f, -314.5f)
                lineTo(210.1f, 337.3f)
                lineToRelative(89.7f, -213.7f)
                lineToRelative(106.4f, 9.7f)
                curveToRelative(4f, 1.1f, 5.7f, 5.3f, 2.6f, 8.6f)
                close()
            }
        }.build()
        
        return _Pushed!!
    }

private var _Pushed: ImageVector? = null

