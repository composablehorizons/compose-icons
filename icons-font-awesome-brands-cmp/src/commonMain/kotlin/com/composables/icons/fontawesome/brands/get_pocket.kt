package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GetPocket: ImageVector
    get() {
        if (_GetPocket != null) return _GetPocket!!
        
        _GetPocket = ImageVector.Builder(
            name = "get-pocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(407.6f, 64f)
                horizontalLineToRelative(-367f)
                curveTo(18.5f, 64f, 0f, 82.5f, 0f, 104.6f)
                verticalLineToRelative(135.2f)
                curveTo(0f, 364.5f, 99.7f, 464f, 224.2f, 464f)
                curveToRelative(124f, 0f, 223.8f, -99.5f, 223.8f, -224.2f)
                verticalLineTo(104.6f)
                curveToRelative(0f, -22.4f, -17.7f, -40.6f, -40.4f, -40.6f)
                close()
                moveToRelative(-162f, 268.5f)
                curveToRelative(-12.4f, 11.8f, -31.4f, 11.1f, -42.4f, 0f)
                curveTo(89.5f, 223.6f, 88.3f, 227.4f, 88.3f, 209.3f)
                curveToRelative(0f, -16.9f, 13.8f, -30.7f, 30.7f, -30.7f)
                curveToRelative(17f, 0f, 16.1f, 3.8f, 105.2f, 89.3f)
                curveToRelative(90.6f, -86.9f, 88.6f, -89.3f, 105.5f, -89.3f)
                curveToRelative(16.9f, 0f, 30.7f, 13.8f, 30.7f, 30.7f)
                curveToRelative(0f, 17.8f, -2.9f, 15.7f, -114.8f, 123.2f)
                close()
            }
        }.build()
        
        return _GetPocket!!
    }

private var _GetPocket: ImageVector? = null

