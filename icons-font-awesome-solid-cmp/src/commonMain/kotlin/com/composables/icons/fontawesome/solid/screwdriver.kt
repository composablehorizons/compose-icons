package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Screwdriver: ImageVector
    get() {
        if (_Screwdriver != null) return _Screwdriver!!
        
        _Screwdriver = ImageVector.Builder(
            name = "screwdriver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 0f)
                lineTo(320f, 96f)
                verticalLineToRelative(62.06f)
                lineToRelative(-83.03f, 83.03f)
                curveToRelative(6.79f, 4.25f, 13.27f, 9.06f, 19.07f, 14.87f)
                curveToRelative(5.8f, 5.8f, 10.62f, 12.28f, 14.87f, 19.07f)
                lineTo(353.94f, 192f)
                horizontalLineTo(416f)
                lineToRelative(96f, -128f)
                lineToRelative(-64f, -64f)
                close()
                moveTo(128f, 278.59f)
                lineTo(10.92f, 395.67f)
                curveToRelative(-14.55f, 14.55f, -14.55f, 38.15f, 0f, 52.71f)
                lineToRelative(52.7f, 52.7f)
                curveToRelative(14.56f, 14.56f, 38.15f, 14.56f, 52.71f, 0f)
                lineTo(233.41f, 384f)
                curveToRelative(29.11f, -29.11f, 29.11f, -76.3f, 0f, -105.41f)
                reflectiveCurveToRelative(-76.3f, -29.11f, -105.41f, 0f)
                close()
            }
        }.build()
        
        return _Screwdriver!!
    }

private var _Screwdriver: ImageVector? = null

