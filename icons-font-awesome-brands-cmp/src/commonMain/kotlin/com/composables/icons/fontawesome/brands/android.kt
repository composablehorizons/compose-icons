package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Android: ImageVector
    get() {
        if (_Android != null) return _Android!!
        
        _Android = ImageVector.Builder(
            name = "android",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420.55f, 301.93f)
                arcToRelative(24f, 24f, 0f, true, true, 24f, -24f)
                arcToRelative(24f, 24f, 0f, false, true, -24f, 24f)
                moveToRelative(-265.1f, 0f)
                arcToRelative(24f, 24f, 0f, true, true, 24f, -24f)
                arcToRelative(24f, 24f, 0f, false, true, -24f, 24f)
                moveToRelative(273.7f, -144.48f)
                lineToRelative(47.94f, -83f)
                arcToRelative(10f, 10f, 0f, true, false, -17.27f, -10f)
                horizontalLineToRelative(0f)
                lineToRelative(-48.54f, 84.07f)
                arcToRelative(301.25f, 301.25f, 0f, false, false, -246.56f, 0f)
                lineTo(116.18f, 64.45f)
                arcToRelative(10f, 10f, 0f, true, false, -17.27f, 10f)
                horizontalLineToRelative(0f)
                lineToRelative(47.94f, 83f)
                curveTo(64.53f, 202.22f, 8.24f, 285.55f, 0f, 384f)
                horizontalLineTo(576f)
                curveToRelative(-8.24f, -98.45f, -64.54f, -181.78f, -146.85f, -226.55f)
            }
        }.build()
        
        return _Android!!
    }

private var _Android: ImageVector? = null

