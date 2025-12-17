package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Remote: ImageVector
    get() {
        if (_Remote != null) return _Remote!!
        
        _Remote = ImageVector.Builder(
            name = "remote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.85401f, 9.64598f)
                curveTo(8.04901f, 9.84098f, 8.04901f, 10.158f, 7.85401f, 10.353f)
                lineTo(3.85401f, 14.353f)
                curveTo(3.75601f, 14.451f, 3.62801f, 14.499f, 3.50001f, 14.499f)
                curveTo(3.37201f, 14.499f, 3.24401f, 14.45f, 3.14601f, 14.353f)
                curveTo(2.95101f, 14.158f, 2.95101f, 13.841f, 3.14601f, 13.646f)
                lineTo(6.79201f, 9.99998f)
                lineTo(3.14601f, 6.35398f)
                curveTo(2.95101f, 6.15898f, 2.95101f, 5.84198f, 3.14601f, 5.64698f)
                curveTo(3.34101f, 5.45198f, 3.65801f, 5.45198f, 3.85301f, 5.64698f)
                lineTo(7.85301f, 9.64698f)
                lineTo(7.85401f, 9.64598f)
                close()
                moveTo(9.20701f, 5.99998f)
                lineTo(12.853f, 2.35398f)
                curveTo(13.048f, 2.15898f, 13.048f, 1.84198f, 12.853f, 1.64698f)
                curveTo(12.658f, 1.45198f, 12.341f, 1.45198f, 12.146f, 1.64698f)
                lineTo(8.14601f, 5.64698f)
                curveTo(7.95101f, 5.84198f, 7.95101f, 6.15898f, 8.14601f, 6.35398f)
                lineTo(12.146f, 10.354f)
                curveTo(12.244f, 10.452f, 12.372f, 10.5f, 12.5f, 10.5f)
                curveTo(12.628f, 10.5f, 12.756f, 10.451f, 12.854f, 10.354f)
                curveTo(13.049f, 10.159f, 13.049f, 9.84198f, 12.854f, 9.64698f)
                lineTo(9.20801f, 6.00098f)
                lineTo(9.20701f, 5.99998f)
                close()
            }
        }.build()
        
        return _Remote!!
    }

private var _Remote: ImageVector? = null

