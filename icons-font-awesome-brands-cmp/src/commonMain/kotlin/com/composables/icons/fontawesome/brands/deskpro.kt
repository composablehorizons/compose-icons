package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Deskpro: ImageVector
    get() {
        if (_Deskpro != null) return _Deskpro!!
        
        _Deskpro = ImageVector.Builder(
            name = "deskpro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 480f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(205.9f, 512f)
                lineToRelative(31.1f, -38.4f)
                curveToRelative(12.3f, -0.2f, 25.6f, -1.4f, 36.5f, -6.6f)
                curveToRelative(38.9f, -18.6f, 38.4f, -61.9f, 38.3f, -63.8f)
                curveToRelative(-0.1f, -5f, -0.8f, -4.4f, -28.9f, -37.4f)
                horizontalLineTo(362f)
                curveToRelative(-0.2f, 50.1f, -7.3f, 68.5f, -10.2f, 75.7f)
                curveToRelative(-9.4f, 23.7f, -43.9f, 62.8f, -95.2f, 69.4f)
                curveToRelative(-8.7f, 1.1f, -32.8f, 1.2f, -50.7f, 1.1f)
                close()
                moveToRelative(200.4f, -167.7f)
                curveToRelative(38.6f, 0f, 58.5f, -13.6f, 73.7f, -30.9f)
                lineToRelative(-175.5f, -0.3f)
                lineToRelative(-17.4f, 31.3f)
                lineToRelative(119.2f, -0.1f)
                close()
                moveToRelative(-43.6f, -223.9f)
                verticalLineToRelative(168.3f)
                horizontalLineToRelative(-73.5f)
                lineToRelative(-32.7f, 55.5f)
                horizontalLineTo(250f)
                curveToRelative(-52.3f, 0f, -58.1f, -56.5f, -58.3f, -58.9f)
                curveToRelative(-1.2f, -13.2f, -21.3f, -11.6f, -20.1f, 1.8f)
                curveToRelative(1.4f, 15.8f, 8.8f, 40f, 26.4f, 57.1f)
                horizontalLineToRelative(-91f)
                curveToRelative(-25.5f, 0f, -110.8f, -26.8f, -107f, -114f)
                verticalLineTo(16.9f)
                curveTo(0f, 0.9f, 9.7f, 0.3f, 15f, 0.1f)
                horizontalLineToRelative(82f)
                curveToRelative(0.2f, 0f, 0.3f, 0.1f, 0.5f, 0.1f)
                curveToRelative(4.3f, -0.4f, 50.1f, -2.1f, 50.1f, 43.7f)
                curveToRelative(0f, 13.3f, 20.2f, 13.4f, 20.2f, 0f)
                curveToRelative(0f, -18.2f, -5.5f, -32.8f, -15.8f, -43.7f)
                horizontalLineToRelative(84.2f)
                curveToRelative(108.7f, -0.4f, 126.5f, 79.4f, 126.5f, 120.2f)
                close()
                moveToRelative(-132.5f, 56f)
                lineToRelative(64f, 29.3f)
                curveToRelative(13.3f, -45.5f, -42.2f, -71.7f, -64f, -29.3f)
                close()
            }
        }.build()
        
        return _Deskpro!!
    }

private var _Deskpro: ImageVector? = null

