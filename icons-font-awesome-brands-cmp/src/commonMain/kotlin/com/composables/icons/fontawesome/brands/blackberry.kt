package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Blackberry: ImageVector
    get() {
        if (_Blackberry != null) return _Blackberry!!
        
        _Blackberry = ImageVector.Builder(
            name = "blackberry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(166f, 116.9f)
                curveToRelative(0f, 23.4f, -16.4f, 49.1f, -72.5f, 49.1f)
                horizontalLineTo(23.4f)
                lineToRelative(21f, -88.8f)
                horizontalLineToRelative(67.8f)
                curveToRelative(42.1f, 0f, 53.8f, 23.3f, 53.8f, 39.7f)
                close()
                moveToRelative(126.2f, -39.7f)
                horizontalLineToRelative(-67.8f)
                lineTo(205.7f, 166f)
                horizontalLineToRelative(70.1f)
                curveToRelative(53.8f, 0f, 70.1f, -25.7f, 70.1f, -49.1f)
                curveToRelative(0.1f, -16.4f, -11.6f, -39.7f, -53.7f, -39.7f)
                close()
                moveTo(88.8f, 208.1f)
                horizontalLineTo(21f)
                lineTo(0f, 296.9f)
                horizontalLineToRelative(70.1f)
                curveToRelative(56.1f, 0f, 72.5f, -23.4f, 72.5f, -49.1f)
                curveToRelative(0f, -16.3f, -11.7f, -39.7f, -53.8f, -39.7f)
                close()
                moveToRelative(180.1f, 0f)
                horizontalLineToRelative(-67.8f)
                lineToRelative(-18.7f, 88.8f)
                horizontalLineToRelative(70.1f)
                curveToRelative(53.8f, 0f, 70.1f, -23.4f, 70.1f, -49.1f)
                curveToRelative(0f, -16.3f, -11.7f, -39.7f, -53.7f, -39.7f)
                close()
                moveToRelative(189.3f, -53.8f)
                horizontalLineToRelative(-67.8f)
                lineToRelative(-18.7f, 88.8f)
                horizontalLineToRelative(70.1f)
                curveToRelative(53.8f, 0f, 70.1f, -23.4f, 70.1f, -49.1f)
                curveToRelative(0.1f, -16.3f, -11.6f, -39.7f, -53.7f, -39.7f)
                close()
                moveToRelative(-28f, 137.9f)
                horizontalLineToRelative(-67.8f)
                lineTo(343.7f, 381f)
                horizontalLineToRelative(70.1f)
                curveToRelative(56.1f, 0f, 70.1f, -23.4f, 70.1f, -49.1f)
                curveToRelative(0f, -16.3f, -11.6f, -39.7f, -53.7f, -39.7f)
                close()
                moveTo(240.8f, 346f)
                horizontalLineTo(173f)
                lineToRelative(-18.7f, 88.8f)
                horizontalLineToRelative(70.1f)
                curveToRelative(56.1f, 0f, 70.1f, -25.7f, 70.1f, -49.1f)
                curveToRelative(0.1f, -16.3f, -11.6f, -39.7f, -53.7f, -39.7f)
                close()
            }
        }.build()
        
        return _Blackberry!!
    }

private var _Blackberry: ImageVector? = null

