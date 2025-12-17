package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Docker: ImageVector
    get() {
        if (_Docker != null) return _Docker!!
        
        _Docker = ImageVector.Builder(
            name = "docker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(349.9f, 236.3f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(-59.4f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(59.4f)
                close()
                moveToRelative(0f, -204.3f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(60.7f)
                horizontalLineToRelative(66.1f)
                verticalLineTo(32f)
                close()
                moveToRelative(78.2f, 144.8f)
                horizontalLineTo(362f)
                verticalLineToRelative(59.4f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-59.4f)
                close()
                moveToRelative(-156.3f, -72.1f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(60.1f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-60.1f)
                close()
                moveToRelative(78.1f, 0f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(60.1f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-60.1f)
                close()
                moveToRelative(276.8f, 100f)
                curveToRelative(-14.4f, -9.7f, -47.6f, -13.2f, -73.1f, -8.4f)
                curveToRelative(-3.3f, -24f, -16.7f, -44.9f, -41.1f, -63.7f)
                lineToRelative(-14f, -9.3f)
                lineToRelative(-9.3f, 14f)
                curveToRelative(-18.4f, 27.8f, -23.4f, 73.6f, -3.7f, 103.8f)
                curveToRelative(-8.7f, 4.7f, -25.8f, 11.1f, -48.4f, 10.7f)
                horizontalLineTo(2.4f)
                curveToRelative(-8.7f, 50.8f, 5.8f, 116.8f, 44f, 162.1f)
                curveToRelative(37.1f, 43.9f, 92.7f, 66.2f, 165.4f, 66.2f)
                curveToRelative(157.4f, 0f, 273.9f, -72.5f, 328.4f, -204.2f)
                curveToRelative(21.4f, 0.4f, 67.6f, 0.1f, 91.3f, -45.2f)
                curveToRelative(1.5f, -2.5f, 6.6f, -13.2f, 8.5f, -17.1f)
                lineToRelative(-13.3f, -8.9f)
                close()
                moveToRelative(-511.1f, -27.9f)
                horizontalLineToRelative(-66f)
                verticalLineToRelative(59.4f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-59.4f)
                close()
                moveToRelative(78.1f, 0f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(59.4f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-59.4f)
                close()
                moveToRelative(78.1f, 0f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(59.4f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-59.4f)
                close()
                moveToRelative(-78.1f, -72.1f)
                horizontalLineToRelative(-66.1f)
                verticalLineToRelative(60.1f)
                horizontalLineToRelative(66.1f)
                verticalLineToRelative(-60.1f)
                close()
            }
        }.build()
        
        return _Docker!!
    }

private var _Docker: ImageVector? = null

