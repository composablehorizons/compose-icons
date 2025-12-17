package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LocationArrow: ImageVector
    get() {
        if (_LocationArrow != null) return _LocationArrow!!
        
        _LocationArrow = ImageVector.Builder(
            name = "location-arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(444.52f, 3.52f)
                lineTo(28.74f, 195.42f)
                curveToRelative(-47.97f, 22.39f, -31.98f, 92.75f, 19.19f, 92.75f)
                horizontalLineToRelative(175.91f)
                verticalLineToRelative(175.91f)
                curveToRelative(0f, 51.17f, 70.36f, 67.17f, 92.75f, 19.19f)
                lineToRelative(191.9f, -415.78f)
                curveToRelative(15.99f, -38.39f, -25.59f, -79.97f, -63.97f, -63.97f)
                close()
            }
        }.build()
        
        return _LocationArrow!!
    }

private var _LocationArrow: ImageVector? = null

