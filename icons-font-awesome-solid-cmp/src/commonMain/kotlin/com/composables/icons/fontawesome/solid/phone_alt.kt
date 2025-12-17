package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PhoneAlt: ImageVector
    get() {
        if (_PhoneAlt != null) return _PhoneAlt!!
        
        _PhoneAlt = ImageVector.Builder(
            name = "phone-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(497.39f, 361.8f)
                lineToRelative(-112f, -48f)
                arcToRelative(24f, 24f, 0f, false, false, -28f, 6.9f)
                lineToRelative(-49.6f, 60.6f)
                arcTo(370.66f, 370.66f, 0f, false, true, 130.6f, 204.11f)
                lineToRelative(60.6f, -49.6f)
                arcToRelative(23.94f, 23.94f, 0f, false, false, 6.9f, -28f)
                lineToRelative(-48f, -112f)
                arcTo(24.16f, 24.16f, 0f, false, false, 122.6f, 0.61f)
                lineToRelative(-104f, 24f)
                arcTo(24f, 24f, 0f, false, false, 0f, 48f)
                curveToRelative(0f, 256.5f, 207.9f, 464f, 464f, 464f)
                arcToRelative(24f, 24f, 0f, false, false, 23.4f, -18.6f)
                lineToRelative(24f, -104f)
                arcToRelative(24.29f, 24.29f, 0f, false, false, -14.01f, -27.6f)
                close()
            }
        }.build()
        
        return _PhoneAlt!!
    }

private var _PhoneAlt: ImageVector? = null

