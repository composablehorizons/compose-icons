package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Phone: ImageVector
    get() {
        if (_Phone != null) return _Phone!!
        
        _Phone = ImageVector.Builder(
            name = "phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(493.4f, 24.6f)
                lineToRelative(-104f, -24f)
                curveToRelative(-11.3f, -2.6f, -22.9f, 3.3f, -27.5f, 13.9f)
                lineToRelative(-48f, 112f)
                curveToRelative(-4.2f, 9.8f, -1.4f, 21.3f, 6.9f, 28f)
                lineToRelative(60.6f, 49.6f)
                curveToRelative(-36f, 76.7f, -98.9f, 140.5f, -177.2f, 177.2f)
                lineToRelative(-49.6f, -60.6f)
                curveToRelative(-6.8f, -8.3f, -18.2f, -11.1f, -28f, -6.9f)
                lineToRelative(-112f, 48f)
                curveTo(3.9f, 366.5f, -2f, 378.1f, 0.6f, 389.4f)
                lineToRelative(24f, 104f)
                curveTo(27.1f, 504.2f, 36.7f, 512f, 48f, 512f)
                curveToRelative(256.1f, 0f, 464f, -207.5f, 464f, -464f)
                curveToRelative(0f, -11.2f, -7.7f, -20.9f, -18.6f, -23.4f)
                close()
            }
        }.build()
        
        return _Phone!!
    }

private var _Phone: ImageVector? = null

