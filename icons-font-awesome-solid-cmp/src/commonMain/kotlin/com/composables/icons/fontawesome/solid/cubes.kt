package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Cubes: ImageVector
    get() {
        if (_Cubes != null) return _Cubes!!
        
        _Cubes = ImageVector.Builder(
            name = "cubes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(488.6f, 250.2f)
                lineTo(392f, 214f)
                verticalLineTo(105.5f)
                curveToRelative(0f, -15f, -9.3f, -28.4f, -23.4f, -33.7f)
                lineToRelative(-100f, -37.5f)
                curveToRelative(-8.1f, -3.1f, -17.1f, -3.1f, -25.3f, 0f)
                lineToRelative(-100f, 37.5f)
                curveToRelative(-14.1f, 5.3f, -23.4f, 18.7f, -23.4f, 33.7f)
                verticalLineTo(214f)
                lineToRelative(-96.6f, 36.2f)
                curveTo(9.3f, 255.5f, 0f, 268.9f, 0f, 283.9f)
                verticalLineTo(394f)
                curveToRelative(0f, 13.6f, 7.7f, 26.1f, 19.9f, 32.2f)
                lineToRelative(100f, 50f)
                curveToRelative(10.1f, 5.1f, 22.1f, 5.1f, 32.2f, 0f)
                lineToRelative(103.9f, -52f)
                lineToRelative(103.9f, 52f)
                curveToRelative(10.1f, 5.1f, 22.1f, 5.1f, 32.2f, 0f)
                lineToRelative(100f, -50f)
                curveToRelative(12.2f, -6.1f, 19.9f, -18.6f, 19.9f, -32.2f)
                verticalLineTo(283.9f)
                curveToRelative(0f, -15f, -9.3f, -28.4f, -23.4f, -33.7f)
                close()
                moveTo(358f, 214.8f)
                lineToRelative(-85f, 31.9f)
                verticalLineToRelative(-68.2f)
                lineToRelative(85f, -37f)
                verticalLineToRelative(73.3f)
                close()
                moveTo(154f, 104.1f)
                lineToRelative(102f, -38.2f)
                lineToRelative(102f, 38.2f)
                verticalLineToRelative(0.6f)
                lineToRelative(-102f, 41.4f)
                lineToRelative(-102f, -41.4f)
                verticalLineToRelative(-0.6f)
                close()
                moveToRelative(84f, 291.1f)
                lineToRelative(-85f, 42.5f)
                verticalLineToRelative(-79.1f)
                lineToRelative(85f, -38.8f)
                verticalLineToRelative(75.4f)
                close()
                moveToRelative(0f, -112f)
                lineToRelative(-102f, 41.4f)
                lineToRelative(-102f, -41.4f)
                verticalLineToRelative(-0.6f)
                lineToRelative(102f, -38.2f)
                lineToRelative(102f, 38.2f)
                verticalLineToRelative(0.6f)
                close()
                moveToRelative(240f, 112f)
                lineToRelative(-85f, 42.5f)
                verticalLineToRelative(-79.1f)
                lineToRelative(85f, -38.8f)
                verticalLineToRelative(75.4f)
                close()
                moveToRelative(0f, -112f)
                lineToRelative(-102f, 41.4f)
                lineToRelative(-102f, -41.4f)
                verticalLineToRelative(-0.6f)
                lineToRelative(102f, -38.2f)
                lineToRelative(102f, 38.2f)
                verticalLineToRelative(0.6f)
                close()
            }
        }.build()
        
        return _Cubes!!
    }

private var _Cubes: ImageVector? = null

