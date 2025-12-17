package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Asymmetrik: ImageVector
    get() {
        if (_Asymmetrik != null) return _Asymmetrik!!
        
        _Asymmetrik = ImageVector.Builder(
            name = "asymmetrik",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(517.5f, 309.2f)
                curveToRelative(38.8f, -40f, 58.1f, -80f, 58.5f, -116.1f)
                curveToRelative(0.8f, -65.5f, -59.4f, -118.2f, -169.4f, -135f)
                curveTo(277.9f, 38.4f, 118.1f, 73.6f, 0f, 140.5f)
                curveTo(52f, 114f, 110.6f, 92.3f, 170.7f, 82.3f)
                curveToRelative(74.5f, -20.5f, 153f, -25.4f, 221.3f, -14.8f)
                curveTo(544.5f, 91.3f, 588.8f, 195f, 490.8f, 299.2f)
                curveToRelative(-10.2f, 10.8f, -22f, 21.1f, -35f, 30.6f)
                lineTo(304.9f, 103.4f)
                lineTo(114.7f, 388.9f)
                curveToRelative(-65.6f, -29.4f, -76.5f, -90.2f, -19.1f, -151.2f)
                curveToRelative(20.8f, -22.2f, 48.3f, -41.9f, 79.5f, -58.1f)
                curveToRelative(20f, -12.2f, 39.7f, -22.6f, 62f, -30.7f)
                curveToRelative(-65.1f, 20.3f, -122.7f, 52.9f, -161.6f, 92.9f)
                curveToRelative(-27.7f, 28.6f, -41.4f, 57.1f, -41.7f, 82.9f)
                curveToRelative(-0.5f, 35.1f, 23.4f, 65.1f, 68.4f, 83f)
                lineToRelative(-34.5f, 51.7f)
                horizontalLineToRelative(101.6f)
                lineToRelative(22f, -34.4f)
                curveToRelative(22.2f, 1f, 45.3f, 0f, 68.6f, -2.7f)
                lineToRelative(-22.8f, 37.1f)
                horizontalLineToRelative(135.5f)
                lineTo(340f, 406.3f)
                curveToRelative(18.6f, -5.3f, 36.9f, -11.5f, 54.5f, -18.7f)
                lineToRelative(45.9f, 71.8f)
                horizontalLineTo(542f)
                lineTo(468.6f, 349f)
                curveToRelative(18.5f, -12.1f, 35f, -25.5f, 48.9f, -39.8f)
                close()
                moveToRelative(-187.6f, 80.5f)
                lineToRelative(-25f, -40.6f)
                lineToRelative(-32.7f, 53.3f)
                curveToRelative(-23.4f, 3.5f, -46.7f, 5.1f, -69.2f, 4.4f)
                lineToRelative(101.9f, -159.3f)
                lineToRelative(78.7f, 123f)
                curveToRelative(-17.2f, 7.4f, -35.3f, 13.9f, -53.7f, 19.2f)
                close()
            }
        }.build()
        
        return _Asymmetrik!!
    }

private var _Asymmetrik: ImageVector? = null

