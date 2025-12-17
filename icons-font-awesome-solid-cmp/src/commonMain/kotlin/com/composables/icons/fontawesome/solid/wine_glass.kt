package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.WineGlass: ImageVector
    get() {
        if (_WineGlass != null) return _WineGlass!!
        
        _WineGlass = ImageVector.Builder(
            name = "wine-glass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 288f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 464f)
                horizontalLineToRelative(-40f)
                verticalLineTo(346.81f)
                curveToRelative(68.47f, -15.89f, 118.05f, -79.91f, 111.4f, -154.16f)
                lineToRelative(-15.95f, -178.1f)
                curveTo(270.71f, 6.31f, 263.9f, 0f, 255.74f, 0f)
                horizontalLineTo(32.26f)
                curveToRelative(-8.15f, 0f, -14.97f, 6.31f, -15.7f, 14.55f)
                lineTo(0.6f, 192.66f)
                curveTo(-6.05f, 266.91f, 43.53f, 330.93f, 112f, 346.82f)
                verticalLineTo(464f)
                horizontalLineTo(72f)
                curveToRelative(-22.09f, 0f, -40f, 17.91f, -40f, 40f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                horizontalLineToRelative(208f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                curveToRelative(0f, -22.09f, -17.91f, -40f, -40f, -40f)
                close()
            }
        }.build()
        
        return _WineGlass!!
    }

private var _WineGlass: ImageVector? = null

