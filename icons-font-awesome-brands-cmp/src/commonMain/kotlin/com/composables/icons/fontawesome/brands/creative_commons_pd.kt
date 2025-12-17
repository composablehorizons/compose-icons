package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CreativeCommonsPd: ImageVector
    get() {
        if (_CreativeCommonsPd != null) return _CreativeCommonsPd!!
        
        _CreativeCommonsPd = ImageVector.Builder(
            name = "creative-commons-pd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119.1f, 0f, 256f)
                curveToRelative(0f, 137f, 111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                curveTo(496f, 119.1f, 385f, 8f, 248f, 8f)
                close()
                moveToRelative(0f, 449.5f)
                curveToRelative(-139.2f, 0f, -235.8f, -138f, -190.2f, -267.9f)
                lineToRelative(78.8f, 35.1f)
                curveToRelative(-2.1f, 10.5f, -3.3f, 21.5f, -3.3f, 32.9f)
                curveToRelative(0f, 99f, 73.9f, 126.9f, 120.4f, 126.9f)
                curveToRelative(22.9f, 0f, 53.5f, -6.7f, 79.4f, -29.5f)
                lineTo(297f, 311.1f)
                curveToRelative(-5.5f, 6.3f, -17.6f, 16.7f, -36.3f, 16.7f)
                curveToRelative(-37.8f, 0f, -53.7f, -39.9f, -53.9f, -71.9f)
                curveToRelative(230.4f, 102.6f, 216.5f, 96.5f, 217.9f, 96.8f)
                curveToRelative(-34.3f, 62.4f, -100.6f, 104.8f, -176.7f, 104.8f)
                close()
                moveToRelative(194.2f, -150f)
                lineToRelative(-224f, -100f)
                curveToRelative(18.8f, -34f, 54.9f, -30.7f, 74.7f, -11f)
                lineToRelative(40.4f, -41.6f)
                curveToRelative(-27.1f, -23.3f, -58f, -27.5f, -78.1f, -27.5f)
                curveToRelative(-47.4f, 0f, -80.9f, 20.5f, -100.7f, 51.6f)
                lineToRelative(-74.9f, -33.4f)
                curveToRelative(36.1f, -54.9f, 98.1f, -91.2f, 168.5f, -91.2f)
                curveToRelative(111.1f, 0f, 201.5f, 90.4f, 201.5f, 201.5f)
                curveToRelative(0f, 18f, -2.4f, 35.4f, -6.8f, 52f)
                curveToRelative(-0.3f, -0.1f, -0.4f, -0.2f, -0.6f, -0.4f)
                close()
            }
        }.build()
        
        return _CreativeCommonsPd!!
    }

private var _CreativeCommonsPd: ImageVector? = null

