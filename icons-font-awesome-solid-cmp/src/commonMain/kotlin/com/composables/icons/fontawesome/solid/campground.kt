package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Campground: ImageVector
    get() {
        if (_Campground != null) return _Campground!!
        
        _Campground = ImageVector.Builder(
            name = "campground",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(624f, 448f)
                horizontalLineToRelative(-24.68f)
                lineTo(359.54f, 117.75f)
                lineToRelative(53.41f, -73.55f)
                curveToRelative(5.19f, -7.15f, 3.61f, -17.16f, -3.54f, -22.35f)
                lineToRelative(-25.9f, -18.79f)
                curveToRelative(-7.15f, -5.19f, -17.15f, -3.61f, -22.35f, 3.55f)
                lineTo(320f, 63.3f)
                lineTo(278.83f, 6.6f)
                curveToRelative(-5.19f, -7.15f, -15.2f, -8.74f, -22.35f, -3.55f)
                lineToRelative(-25.88f, 18.8f)
                curveToRelative(-7.15f, 5.19f, -8.74f, 15.2f, -3.54f, 22.35f)
                lineToRelative(53.41f, 73.55f)
                lineTo(40.68f, 448f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(608f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveTo(320f, 288f)
                lineToRelative(116.36f, 160f)
                horizontalLineTo(203.64f)
                lineTo(320f, 288f)
                close()
            }
        }.build()
        
        return _Campground!!
    }

private var _Campground: ImageVector? = null

