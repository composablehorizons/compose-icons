package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandWindows: ImageVector
    get() {
        if (_BrandWindows != null) return _BrandWindows!!
        
        _BrandWindows = ImageVector.Builder(
            name = "brand-windows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 13f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.57f, -1.248f, 2.832f, -2.715f, 2.923f)
                lineToRelative(-0.113f, 0.003f)
                lineToRelative(-0.042f, 0.018f)
                arcToRelative(1f, 1f, 0f, false, true, -0.336f, 0.056f)
                lineToRelative(-0.118f, -0.008f)
                lineToRelative(-4.676f, -0.585f)
                verticalLineToRelative(-7.407f)
                close()
                moveToRelative(-10f, 0f)
                verticalLineToRelative(7.157f)
                lineToRelative(-5.3f, -0.662f)
                curveToRelative(-1.514f, -0.151f, -2.7f, -1.383f, -2.7f, -2.895f)
                verticalLineToRelative(-3.6f)
                close()
                moveToRelative(0f, -9.158f)
                verticalLineToRelative(7.158f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3.6f)
                curveToRelative(0f, -1.454f, 1.096f, -2.648f, 2.505f, -2.87f)
                close()
                moveToRelative(10f, 2.058f)
                verticalLineToRelative(5.1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-7.409f)
                lineToRelative(4.717f, -0.589f)
                curveToRelative(1.759f, -0.145f, 3.283f, 1.189f, 3.283f, 2.898f)
            }
        }.build()
        
        return _BrandWindows!!
    }

private var _BrandWindows: ImageVector? = null

