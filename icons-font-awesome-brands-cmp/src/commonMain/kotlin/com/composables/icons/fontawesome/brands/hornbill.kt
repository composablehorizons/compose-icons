package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Hornbill: ImageVector
    get() {
        if (_Hornbill != null) return _Hornbill!!
        
        _Hornbill = ImageVector.Builder(
            name = "hornbill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(76.38f, 370.3f)
                arcToRelative(37.8f, 37.8f, 0f, true, true, -32.07f, -32.42f)
                curveToRelative(-78.28f, -111.35f, 52f, -190.53f, 52f, -190.53f)
                curveToRelative(-5.86f, 43f, -8.24f, 91.16f, -8.24f, 91.16f)
                curveToRelative(-67.31f, 41.49f, 0.93f, 64.06f, 39.81f, 72.87f)
                arcToRelative(140.38f, 140.38f, 0f, false, false, 131.66f, 91.94f)
                curveToRelative(1.92f, 0f, 3.77f, -0.21f, 5.67f, -0.28f)
                lineToRelative(0.11f, 18.86f)
                curveToRelative(-99.22f, 1.39f, -158.7f, -29.14f, -188.94f, -51.6f)
                close()
                moveToRelative(108f, -327.7f)
                arcTo(37.57f, 37.57f, 0f, false, false, 181f, 21.45f)
                arcToRelative(37.95f, 37.95f, 0f, true, false, -31.17f, 54.22f)
                curveToRelative(-22.55f, 29.91f, -53.83f, 89.57f, -52.42f, 190f)
                lineToRelative(21.84f, -0.15f)
                curveToRelative(0f, -0.9f, -0.14f, -1.77f, -0.14f, -2.68f)
                arcTo(140.42f, 140.42f, 0f, false, true, 207f, 132.71f)
                curveToRelative(8f, -37.71f, 30.7f, -114.3f, 73.8f, -44.29f)
                curveToRelative(0f, 0f, 48.14f, 2.38f, 91.18f, 8.24f)
                curveToRelative(0f, 0f, -77.84f, -128f, -187.59f, -54.06f)
                close()
                moveToRelative(304.19f, 134.17f)
                arcToRelative(37.94f, 37.94f, 0f, true, false, -53.84f, -28.7f)
                curveTo(403f, 126.13f, 344.89f, 99f, 251.28f, 100.33f)
                lineToRelative(0.14f, 22.5f)
                curveToRelative(2.7f, -0.15f, 5.39f, -0.41f, 8.14f, -0.41f)
                arcToRelative(140.37f, 140.37f, 0f, false, true, 130.49f, 88.76f)
                curveToRelative(39.1f, 9f, 105.06f, 31.58f, 38.46f, 72.54f)
                curveToRelative(0f, 0f, -2.34f, 48.13f, -8.21f, 91.16f)
                curveToRelative(0f, 0f, 133.45f, -81.16f, 49f, -194.61f)
                arcToRelative(37.45f, 37.45f, 0f, false, false, 19.31f, -3.5f)
                close()
                moveTo(374.06f, 436.24f)
                curveToRelative(21.43f, -32.46f, 46.42f, -89.69f, 45.14f, -179.66f)
                lineToRelative(-19.52f, 0.14f)
                curveToRelative(0.08f, 2.06f, 0.3f, 4.07f, 0.3f, 6.15f)
                arcToRelative(140.34f, 140.34f, 0f, false, true, -91.39f, 131.45f)
                curveToRelative(-8.85f, 38.95f, -31.44f, 106.66f, -72.77f, 39.49f)
                curveToRelative(0f, 0f, -48.12f, -2.34f, -91.19f, -8.22f)
                curveToRelative(0f, 0f, 79.92f, 131.34f, 191.9f, 51f)
                arcToRelative(37.5f, 37.5f, 0f, false, false, 3.64f, 14f)
                arcToRelative(37.93f, 37.93f, 0f, true, false, 33.89f, -54.29f)
                close()
            }
        }.build()
        
        return _Hornbill!!
    }

private var _Hornbill: ImageVector? = null

