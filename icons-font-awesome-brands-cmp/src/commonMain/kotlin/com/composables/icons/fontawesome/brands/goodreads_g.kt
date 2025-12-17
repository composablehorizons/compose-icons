package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GoodreadsG: ImageVector
    get() {
        if (_GoodreadsG != null) return _GoodreadsG!!
        
        _GoodreadsG = ImageVector.Builder(
            name = "goodreads-g",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(42.6f, 403.3f)
                horizontalLineToRelative(2.8f)
                curveToRelative(12.7f, 0f, 25.5f, 0f, 38.2f, 0.1f)
                curveToRelative(1.6f, 0f, 3.1f, -0.4f, 3.6f, 2.1f)
                curveToRelative(7.1f, 34.9f, 30f, 54.6f, 62.9f, 63.9f)
                curveToRelative(26.9f, 7.6f, 54.1f, 7.8f, 81.3f, 1.8f)
                curveToRelative(33.8f, -7.4f, 56f, -28.3f, 68f, -60.4f)
                curveToRelative(8f, -21.5f, 10.7f, -43.8f, 11f, -66.5f)
                curveToRelative(0.1f, -5.8f, 0.3f, -47f, -0.2f, -52.8f)
                lineToRelative(-0.9f, -0.3f)
                curveToRelative(-0.8f, 1.5f, -1.7f, 2.9f, -2.5f, 4.4f)
                curveToRelative(-22.1f, 43.1f, -61.3f, 67.4f, -105.4f, 69.1f)
                curveToRelative(-103f, 4f, -169.4f, -57f, -172f, -176.2f)
                curveToRelative(-0.5f, -23.7f, 1.8f, -46.9f, 8.3f, -69.7f)
                curveTo(58.3f, 47.7f, 112.3f, 0.6f, 191.6f, 0f)
                curveToRelative(61.3f, -0.4f, 101.5f, 38.7f, 116.2f, 70.3f)
                curveToRelative(0.5f, 1.1f, 1.3f, 2.3f, 2.4f, 1.9f)
                verticalLineTo(10.6f)
                horizontalLineToRelative(44.3f)
                curveToRelative(0f, 280.3f, 0.1f, 332.2f, 0.1f, 332.2f)
                curveToRelative(-0.1f, 78.5f, -26.7f, 143.7f, -103f, 162.2f)
                curveToRelative(-69.5f, 16.9f, -159f, 4.8f, -196f, -57.2f)
                curveToRelative(-8f, -13.5f, -11.8f, -28.3f, -13f, -44.5f)
                close()
                moveTo(188.9f, 36.5f)
                curveToRelative(-52.5f, -0.5f, -108.5f, 40.7f, -115f, 133.8f)
                curveToRelative(-4.1f, 59f, 14.8f, 122.2f, 71.5f, 148.6f)
                curveToRelative(27.6f, 12.9f, 74.3f, 15f, 108.3f, -8.7f)
                curveToRelative(47.6f, -33.2f, 62.7f, -97f, 54.8f, -154f)
                curveToRelative(-9.7f, -71.1f, -47.8f, -120f, -119.6f, -119.7f)
                close()
            }
        }.build()
        
        return _GoodreadsG!!
    }

private var _GoodreadsG: ImageVector? = null

