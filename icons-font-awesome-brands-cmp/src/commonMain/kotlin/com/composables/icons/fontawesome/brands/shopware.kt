package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Shopware: ImageVector
    get() {
        if (_Shopware != null) return _Shopware!!
        
        _Shopware = ImageVector.Builder(
            name = "shopware",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(403.5f, 455.41f)
                arcTo(246.17f, 246.17f, 0f, false, true, 256f, 504f)
                curveTo(118.81f, 504f, 8f, 393f, 8f, 256f)
                curveTo(8f, 118.81f, 119f, 8f, 256f, 8f)
                arcToRelative(247.39f, 247.39f, 0f, false, true, 165.7f, 63.5f)
                arcToRelative(3.57f, 3.57f, 0f, false, true, -2.86f, 6.18f)
                arcTo(418.62f, 418.62f, 0f, false, false, 362.13f, 74f)
                curveToRelative(-129.36f, 0f, -222.4f, 53.47f, -222.4f, 155.35f)
                curveToRelative(0f, 109f, 92.13f, 145.88f, 176.83f, 178.73f)
                curveToRelative(33.64f, 13f, 65.4f, 25.36f, 87f, 41.59f)
                arcToRelative(3.58f, 3.58f, 0f, false, true, 0f, 5.72f)
                close()
                moveTo(503f, 233.09f)
                arcToRelative(3.64f, 3.64f, 0f, false, false, -1.27f, -2.44f)
                curveToRelative(-51.76f, -43f, -93.62f, -60.48f, -144.48f, -60.48f)
                curveToRelative(-84.13f, 0f, -80.25f, 52.17f, -80.25f, 53.63f)
                curveToRelative(0f, 42.6f, 52.06f, 62f, 112.34f, 84.49f)
                curveToRelative(31.07f, 11.59f, 63.19f, 23.57f, 92.68f, 39.93f)
                arcToRelative(3.57f, 3.57f, 0f, false, false, 5f, -1.82f)
                arcTo(249f, 249f, 0f, false, false, 503f, 233.09f)
                close()
            }
        }.build()
        
        return _Shopware!!
    }

private var _Shopware: ImageVector? = null

