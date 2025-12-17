package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Erlang: ImageVector
    get() {
        if (_Erlang != null) return _Erlang!!
        
        _Erlang = ImageVector.Builder(
            name = "erlang",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(87.2f, 53.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(405f)
                horizontalLineToRelative(100.4f)
                curveToRelative(-49.7f, -52.6f, -78.8f, -125.3f, -78.7f, -212.1f)
                curveToRelative(-0.1f, -76.7f, 24f, -142.7f, 65.5f, -192.9f)
                close()
                moveToRelative(238.2f, 9.7f)
                curveToRelative(-45.9f, 0.1f, -85.1f, 33.5f, -89.2f, 83.2f)
                horizontalLineToRelative(169.9f)
                curveToRelative(-1.1f, -49.7f, -34.5f, -83.1f, -80.7f, -83.2f)
                close()
                moveToRelative(230.7f, -9.6f)
                horizontalLineToRelative(0.3f)
                lineToRelative(-0.1f, -0.1f)
                close()
                moveToRelative(0.3f, 0f)
                curveToRelative(31.4f, 42.7f, 48.7f, 97.5f, 46.2f, 162.7f)
                curveToRelative(0.5f, 6f, 0.5f, 11.7f, 0f, 24.1f)
                horizontalLineTo(230.2f)
                curveToRelative(-0.2f, 109.7f, 38.9f, 194.9f, 138.6f, 195.3f)
                curveToRelative(68.5f, -0.3f, 118f, -51f, 151.9f, -106.1f)
                lineToRelative(96.4f, 48.2f)
                curveToRelative(-17.4f, 30.9f, -36.5f, 57.8f, -57.9f, 80.8f)
                horizontalLineTo(640f)
                verticalLineToRelative(-405f)
                close()
            }
        }.build()
        
        return _Erlang!!
    }

private var _Erlang: ImageVector? = null

