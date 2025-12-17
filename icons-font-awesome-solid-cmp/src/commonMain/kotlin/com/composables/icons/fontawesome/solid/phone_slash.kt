package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PhoneSlash: ImageVector
    get() {
        if (_PhoneSlash != null) return _PhoneSlash!!
        
        _PhoneSlash = ImageVector.Builder(
            name = "phone-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(268.2f, 381.4f)
                lineToRelative(-49.6f, -60.6f)
                curveToRelative(-6.8f, -8.3f, -18.2f, -11.1f, -28f, -6.9f)
                lineToRelative(-112f, 48f)
                curveToRelative(-10.7f, 4.6f, -16.5f, 16.1f, -13.9f, 27.5f)
                lineToRelative(24f, 104f)
                curveToRelative(2.5f, 10.8f, 12.1f, 18.6f, 23.4f, 18.6f)
                curveToRelative(100.7f, 0f, 193.7f, -32.4f, 269.7f, -86.9f)
                lineToRelative(-80f, -61.8f)
                curveToRelative(-10.9f, 6.5f, -22.1f, 12.7f, -33.6f, 18.1f)
                close()
                moveToRelative(365.6f, 76.7f)
                lineTo(475.1f, 335.5f)
                curveTo(537.9f, 256.4f, 576f, 156.9f, 576f, 48f)
                curveToRelative(0f, -11.2f, -7.7f, -20.9f, -18.6f, -23.4f)
                lineToRelative(-104f, -24f)
                curveToRelative(-11.3f, -2.6f, -22.9f, 3.3f, -27.5f, 13.9f)
                lineToRelative(-48f, 112f)
                curveToRelative(-4.2f, 9.8f, -1.4f, 21.3f, 6.9f, 28f)
                lineToRelative(60.6f, 49.6f)
                curveToRelative(-12.2f, 26.1f, -27.9f, 50.3f, -46f, 72.8f)
                lineTo(45.5f, 3.4f)
                curveTo(38.5f, -2f, 28.5f, -0.8f, 23f, 6.2f)
                lineTo(3.4f, 31.4f)
                curveToRelative(-5.4f, 7f, -4.2f, 17f, 2.8f, 22.4f)
                lineToRelative(588.4f, 454.7f)
                curveToRelative(7f, 5.4f, 17f, 4.2f, 22.5f, -2.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.4f, -6.8f, 4.1f, -16.9f, -2.9f, -22.3f)
                close()
            }
        }.build()
        
        return _PhoneSlash!!
    }

private var _PhoneSlash: ImageVector? = null

