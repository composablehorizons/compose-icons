package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ExchangeAlt: ImageVector
    get() {
        if (_ExchangeAlt != null) return _ExchangeAlt!!
        
        _ExchangeAlt = ImageVector.Builder(
            name = "exchange-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 168f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(360f)
                verticalLineTo(80f)
                curveToRelative(0f, -21.367f, 25.899f, -32.042f, 40.971f, -16.971f)
                lineToRelative(80f, 80f)
                curveToRelative(9.372f, 9.373f, 9.372f, 24.569f, 0f, 33.941f)
                lineToRelative(-80f, 80f)
                curveTo(409.956f, 271.982f, 384f, 261.456f, 384f, 240f)
                verticalLineToRelative(-48f)
                horizontalLineTo(24f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                close()
                moveToRelative(488f, 152f)
                horizontalLineTo(128f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -21.314f, -25.862f, -32.08f, -40.971f, -16.971f)
                lineToRelative(-80f, 80f)
                curveToRelative(-9.372f, 9.373f, -9.372f, 24.569f, 0f, 33.941f)
                lineToRelative(80f, 80f)
                curveTo(102.057f, 463.997f, 128f, 453.437f, 128f, 432f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(360f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _ExchangeAlt!!
    }

private var _ExchangeAlt: ImageVector? = null

