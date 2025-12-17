package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Envira: ImageVector
    get() {
        if (_Envira != null) return _Envira!!
        
        _Envira = ImageVector.Builder(
            name = "envira",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                curveToRelative(477.6f, 0f, 366.6f, 317.3f, 367.1f, 366.3f)
                lineTo(448f, 480f)
                horizontalLineToRelative(-26f)
                lineToRelative(-70.4f, -71.2f)
                curveToRelative(-39f, 4.2f, -124.4f, 34.5f, -214.4f, -37f)
                curveTo(47f, 300.3f, 52f, 214.7f, 0f, 32f)
                close()
                moveToRelative(79.7f, 46f)
                curveToRelative(-49.7f, -23.5f, -5.2f, 9.2f, -5.2f, 9.2f)
                curveToRelative(45.2f, 31.2f, 66f, 73.7f, 90.2f, 119.9f)
                curveToRelative(31.5f, 60.2f, 79f, 139.7f, 144.2f, 167.7f)
                curveToRelative(65f, 28f, 34.2f, 12.5f, 6f, -8.5f)
                curveToRelative(-28.2f, -21.2f, -68.2f, -87f, -91f, -130.2f)
                curveToRelative(-31.7f, -60f, -61f, -118.6f, -144.2f, -158.1f)
                close()
            }
        }.build()
        
        return _Envira!!
    }

private var _Envira: ImageVector? = null

