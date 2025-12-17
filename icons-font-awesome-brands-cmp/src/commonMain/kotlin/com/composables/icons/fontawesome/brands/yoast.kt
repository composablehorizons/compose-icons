package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Yoast: ImageVector
    get() {
        if (_Yoast != null) return _Yoast!!
        
        _Yoast = ImageVector.Builder(
            name = "yoast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(91.3f, 76f)
                horizontalLineToRelative(186f)
                lineToRelative(-7f, 18.9f)
                horizontalLineToRelative(-179f)
                curveToRelative(-39.7f, 0f, -71.9f, 31.6f, -71.9f, 70.3f)
                verticalLineToRelative(205.4f)
                curveToRelative(0f, 35.4f, 24.9f, 70.3f, 84f, 70.3f)
                verticalLineTo(460f)
                horizontalLineTo(91.3f)
                curveTo(41.2f, 460f, 0f, 419.8f, 0f, 370.5f)
                verticalLineTo(165.2f)
                curveTo(0f, 115.9f, 40.7f, 76f, 91.3f, 76f)
                close()
                moveToRelative(229.1f, -56f)
                horizontalLineToRelative(66.5f)
                curveTo(243.1f, 398.1f, 241.2f, 418.9f, 202.2f, 459.3f)
                curveToRelative(-20.8f, 21.6f, -49.3f, 31.7f, -78.3f, 32.7f)
                verticalLineToRelative(-51.1f)
                curveToRelative(49.2f, -7.7f, 64.6f, -49.9f, 64.6f, -75.3f)
                curveToRelative(0f, -20.1f, 0.6f, -12.6f, -82.1f, -223.2f)
                horizontalLineToRelative(61.4f)
                lineTo(218.2f, 299f)
                lineTo(320.4f, 20f)
                close()
                moveTo(448f, 161.5f)
                verticalLineTo(460f)
                horizontalLineTo(234f)
                curveToRelative(6.6f, -9.6f, 10.7f, -16.3f, 12.1f, -19.4f)
                horizontalLineToRelative(182.5f)
                verticalLineTo(161.5f)
                curveToRelative(0f, -32.5f, -17.1f, -51.9f, -48.2f, -62.9f)
                lineToRelative(6.7f, -17.6f)
                curveToRelative(41.7f, 13.6f, 60.9f, 43.1f, 60.9f, 80.5f)
                close()
            }
        }.build()
        
        return _Yoast!!
    }

private var _Yoast: ImageVector? = null

