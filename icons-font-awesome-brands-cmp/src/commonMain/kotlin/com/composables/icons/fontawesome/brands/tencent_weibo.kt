package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.TencentWeibo: ImageVector
    get() {
        if (_TencentWeibo != null) return _TencentWeibo!!
        
        _TencentWeibo = ImageVector.Builder(
            name = "tencent-weibo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(72.3f, 495.8f)
                curveToRelative(1.4f, 19.9f, -27.6f, 22.2f, -29.7f, 2.9f)
                curveTo(31f, 368.8f, 73.7f, 259.2f, 144f, 185.5f)
                curveToRelative(-15.6f, -34f, 9.2f, -77.1f, 50.6f, -77.1f)
                curveToRelative(30.3f, 0f, 55.1f, 24.6f, 55.1f, 55.1f)
                curveToRelative(0f, 44f, -49.5f, 70.8f, -86.9f, 45.1f)
                curveToRelative(-65.7f, 71.3f, -101.4f, 169.8f, -90.5f, 287.2f)
                close()
                moveTo(192f, 0.1f)
                curveTo(66.1f, 0.1f, -12.3f, 134.3f, 43.7f, 242.4f)
                curveTo(52.4f, 259.8f, 79f, 246.9f, 70f, 229f)
                curveTo(23.7f, 136.4f, 91f, 29.8f, 192f, 29.8f)
                curveToRelative(75.4f, 0f, 136.9f, 61.4f, 136.9f, 136.9f)
                curveToRelative(0f, 90.8f, -86.9f, 153.9f, -167.7f, 133.1f)
                curveToRelative(-19.1f, -4.1f, -25.6f, 24.4f, -6.6f, 29.1f)
                curveToRelative(110.7f, 23.2f, 204f, -60f, 204f, -162.3f)
                curveTo(358.6f, 74.7f, 284f, 0.1f, 192f, 0.1f)
                close()
            }
        }.build()
        
        return _TencentWeibo!!
    }

private var _TencentWeibo: ImageVector? = null

