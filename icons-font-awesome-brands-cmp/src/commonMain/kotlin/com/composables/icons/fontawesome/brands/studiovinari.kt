package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Studiovinari: ImageVector
    get() {
        if (_Studiovinari != null) return _Studiovinari!!
        
        _Studiovinari = ImageVector.Builder(
            name = "studiovinari",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480.3f, 187.7f)
                lineToRelative(4.2f, 28f)
                verticalLineToRelative(28f)
                lineToRelative(-25.1f, 44.1f)
                lineToRelative(-39.8f, 78.4f)
                lineToRelative(-56.1f, 67.5f)
                lineToRelative(-79.1f, 37.8f)
                lineToRelative(-17.7f, 24.5f)
                lineToRelative(-7.7f, 12f)
                lineToRelative(-9.6f, 4f)
                reflectiveCurveToRelative(17.3f, -63.6f, 19.4f, -63.6f)
                curveToRelative(2.1f, 0f, 20.3f, 0.7f, 20.3f, 0.7f)
                lineToRelative(66.7f, -38.6f)
                lineToRelative(-92.5f, 26.1f)
                lineToRelative(-55.9f, 36.8f)
                lineToRelative(-22.8f, 28f)
                lineToRelative(-6.6f, 1.4f)
                lineToRelative(20.8f, -73.6f)
                lineToRelative(6.9f, -5.5f)
                lineToRelative(20.7f, 12.9f)
                lineToRelative(88.3f, -45.2f)
                lineToRelative(56.8f, -51.5f)
                lineToRelative(14.8f, -68.4f)
                lineToRelative(-125.4f, 23.3f)
                lineToRelative(15.2f, -18.2f)
                lineToRelative(-173.4f, -53.3f)
                lineToRelative(81.9f, -10.5f)
                lineToRelative(-166f, -122.9f)
                lineTo(133.5f, 108f)
                lineTo(32.2f, 0f)
                lineToRelative(252.9f, 126.6f)
                lineToRelative(-31.5f, -38f)
                lineTo(378f, 163f)
                lineTo(234.7f, 64f)
                lineToRelative(18.7f, 38.4f)
                lineToRelative(-49.6f, -18.1f)
                lineTo(158.3f, 0f)
                lineToRelative(194.6f, 122f)
                lineTo(310f, 66.2f)
                lineToRelative(108f, 96.4f)
                lineToRelative(12f, -8.9f)
                lineToRelative(-21f, -16.4f)
                lineToRelative(4.2f, -37.8f)
                lineTo(451f, 89.1f)
                lineToRelative(29.2f, 24.7f)
                lineToRelative(11.5f, 4.2f)
                lineToRelative(-7f, 6.2f)
                lineToRelative(8.5f, 12f)
                lineToRelative(-13.1f, 7.4f)
                lineToRelative(-10.3f, 20.2f)
                lineToRelative(10.5f, 23.9f)
                close()
            }
        }.build()
        
        return _Studiovinari!!
    }

private var _Studiovinari: ImageVector? = null

