package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Coins: ImageVector
    get() {
        if (_Coins != null) return _Coins!!
        
        _Coins = ImageVector.Builder(
            name = "coins",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 405.3f)
                verticalLineTo(448f)
                curveToRelative(0f, 35.3f, 86f, 64f, 192f, 64f)
                reflectiveCurveToRelative(192f, -28.7f, 192f, -64f)
                verticalLineToRelative(-42.7f)
                curveTo(342.7f, 434.4f, 267.2f, 448f, 192f, 448f)
                reflectiveCurveTo(41.3f, 434.4f, 0f, 405.3f)
                close()
                moveTo(320f, 128f)
                curveToRelative(106f, 0f, 192f, -28.7f, 192f, -64f)
                reflectiveCurveTo(426f, 0f, 320f, 0f)
                reflectiveCurveTo(128f, 28.7f, 128f, 64f)
                reflectiveCurveToRelative(86f, 64f, 192f, 64f)
                close()
                moveTo(0f, 300.4f)
                verticalLineTo(352f)
                curveToRelative(0f, 35.3f, 86f, 64f, 192f, 64f)
                reflectiveCurveToRelative(192f, -28.7f, 192f, -64f)
                verticalLineToRelative(-51.6f)
                curveToRelative(-41.3f, 34f, -116.9f, 51.6f, -192f, 51.6f)
                reflectiveCurveTo(41.3f, 334.4f, 0f, 300.4f)
                close()
                moveToRelative(416f, 11f)
                curveToRelative(57.3f, -11.1f, 96f, -31.7f, 96f, -55.4f)
                verticalLineToRelative(-42.7f)
                curveToRelative(-23.2f, 16.4f, -57.3f, 27.6f, -96f, 34.5f)
                verticalLineToRelative(63.6f)
                close()
                moveTo(192f, 160f)
                curveTo(86f, 160f, 0f, 195.8f, 0f, 240f)
                reflectiveCurveToRelative(86f, 80f, 192f, 80f)
                reflectiveCurveToRelative(192f, -35.8f, 192f, -80f)
                reflectiveCurveToRelative(-86f, -80f, -192f, -80f)
                close()
                moveToRelative(219.3f, 56.3f)
                curveToRelative(60f, -10.8f, 100.7f, -32f, 100.7f, -56.3f)
                verticalLineToRelative(-42.7f)
                curveToRelative(-35.5f, 25.1f, -96.5f, 38.6f, -160.7f, 41.8f)
                curveToRelative(29.5f, 14.3f, 51.2f, 33.5f, 60f, 57.2f)
                close()
            }
        }.build()
        
        return _Coins!!
    }

private var _Coins: ImageVector? = null

