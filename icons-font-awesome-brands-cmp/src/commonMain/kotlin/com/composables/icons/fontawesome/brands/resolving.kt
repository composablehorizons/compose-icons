package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Resolving: ImageVector
    get() {
        if (_Resolving != null) return _Resolving!!
        
        _Resolving = ImageVector.Builder(
            name = "resolving",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(281.2f, 278.2f)
                curveToRelative(46f, -13.3f, 49.6f, -23.5f, 44f, -43.4f)
                lineTo(314f, 195.5f)
                curveToRelative(-6.1f, -20.9f, -18.4f, -28.1f, -71.1f, -12.8f)
                lineTo(54.7f, 236.8f)
                lineToRelative(28.6f, 98.6f)
                lineToRelative(197.9f, -57.2f)
                close()
                moveTo(248.5f, 8f)
                curveTo(131.4f, 8f, 33.2f, 88.7f, 7.2f, 197.5f)
                lineToRelative(221.9f, -63.9f)
                curveToRelative(34.8f, -10.2f, 54.2f, -11.7f, 79.3f, -8.2f)
                curveToRelative(36.3f, 6.1f, 52.7f, 25f, 61.4f, 55.2f)
                lineToRelative(10.7f, 37.8f)
                curveToRelative(8.2f, 28.1f, 1f, 50.6f, -23.5f, 73.6f)
                curveToRelative(-19.4f, 17.4f, -31.2f, 24.5f, -61.4f, 33.2f)
                lineTo(203f, 351.8f)
                lineToRelative(220.4f, 27.1f)
                lineToRelative(9.7f, 34.2f)
                lineToRelative(-48.1f, 13.3f)
                lineToRelative(-286.8f, -37.3f)
                lineToRelative(23f, 80.2f)
                curveToRelative(36.8f, 22f, 80.3f, 34.7f, 126.3f, 34.7f)
                curveToRelative(137f, 0f, 248.5f, -111.4f, 248.5f, -248.3f)
                curveTo(497f, 119.4f, 385.5f, 8f, 248.5f, 8f)
                close()
                moveTo(38.3f, 388.6f)
                lineTo(0f, 256.8f)
                curveToRelative(0f, 48.5f, 14.3f, 93.4f, 38.3f, 131.8f)
                close()
            }
        }.build()
        
        return _Resolving!!
    }

private var _Resolving: ImageVector? = null

