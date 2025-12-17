package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ExternalLinkSquareAlt: ImageVector
    get() {
        if (_ExternalLinkSquareAlt != null) return _ExternalLinkSquareAlt!!
        
        _ExternalLinkSquareAlt = ImageVector.Builder(
            name = "external-link-square-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                close()
                moveToRelative(-88f, 16f)
                horizontalLineTo(248.029f)
                curveToRelative(-21.313f, 0f, -32.08f, 25.861f, -16.971f, 40.971f)
                lineToRelative(31.984f, 31.987f)
                lineTo(67.515f, 364.485f)
                curveToRelative(-4.686f, 4.686f, -4.686f, 12.284f, 0f, 16.971f)
                lineToRelative(31.029f, 31.029f)
                curveToRelative(4.687f, 4.686f, 12.285f, 4.686f, 16.971f, 0f)
                lineToRelative(195.526f, -195.526f)
                lineToRelative(31.988f, 31.991f)
                curveTo(358.058f, 263.977f, 384f, 253.425f, 384f, 231.979f)
                verticalLineTo(120f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _ExternalLinkSquareAlt!!
    }

private var _ExternalLinkSquareAlt: ImageVector? = null

