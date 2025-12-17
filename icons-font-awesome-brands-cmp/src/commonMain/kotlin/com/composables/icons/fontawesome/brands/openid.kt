package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Openid: ImageVector
    get() {
        if (_Openid != null) return _Openid!!
        
        _Openid = ImageVector.Builder(
            name = "openid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(271.5f, 432f)
                lineToRelative(-68f, 32f)
                curveTo(88.5f, 453.7f, 0f, 392.5f, 0f, 318.2f)
                curveToRelative(0f, -71.5f, 82.5f, -131f, 191.7f, -144.3f)
                verticalLineToRelative(43f)
                curveToRelative(-71.5f, 12.5f, -124f, 53f, -124f, 101.3f)
                curveToRelative(0f, 51f, 58.5f, 93.3f, 135.7f, 103f)
                verticalLineToRelative(-340f)
                lineToRelative(68f, -33.2f)
                verticalLineToRelative(384f)
                close()
                moveTo(448f, 291f)
                lineToRelative(-131.3f, -28.5f)
                lineToRelative(36.8f, -20.7f)
                curveToRelative(-19.5f, -11.5f, -43.5f, -20f, -70f, -24.8f)
                verticalLineToRelative(-43f)
                curveToRelative(46.2f, 5.5f, 87.7f, 19.5f, 120.3f, 39.3f)
                lineToRelative(35f, -19.8f)
                lineTo(448f, 291f)
                close()
            }
        }.build()
        
        return _Openid!!
    }

private var _Openid: ImageVector? = null

