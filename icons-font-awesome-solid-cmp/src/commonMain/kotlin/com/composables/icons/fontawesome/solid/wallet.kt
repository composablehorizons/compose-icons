package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Wallet: ImageVector
    get() {
        if (_Wallet != null) return _Wallet!!
        
        _Wallet = ImageVector.Builder(
            name = "wallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(461.2f, 128f)
                horizontalLineTo(80f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(384f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineTo(64f)
                curveTo(28.65f, 32f, 0f, 60.65f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(397.2f)
                curveToRelative(28.02f, 0f, 50.8f, -21.53f, 50.8f, -48f)
                verticalLineTo(176f)
                curveToRelative(0f, -26.47f, -22.78f, -48f, -50.8f, -48f)
                close()
                moveTo(416f, 336f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _Wallet!!
    }

private var _Wallet: ImageVector? = null

