package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GreaterThan: ImageVector
    get() {
        if (_GreaterThan != null) return _GreaterThan!!
        
        _GreaterThan = ImageVector.Builder(
            name = "greater-than",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(365.52f, 209.85f)
                lineTo(59.22f, 67.01f)
                curveToRelative(-16.06f, -7.49f, -35.15f, -0.54f, -42.64f, 15.52f)
                lineTo(3.01f, 111.61f)
                curveToRelative(-7.49f, 16.06f, -0.54f, 35.15f, 15.52f, 42.64f)
                lineTo(236.96f, 256.1f)
                lineTo(18.49f, 357.99f)
                curveTo(2.47f, 365.46f, -4.46f, 384.5f, 3.01f, 400.52f)
                lineToRelative(13.52f, 29f)
                curveTo(24f, 445.54f, 43.04f, 452.47f, 59.06f, 445f)
                lineToRelative(306.47f, -142.91f)
                arcToRelative(32.003f, 32.003f, 0f, false, false, 18.48f, -29f)
                verticalLineToRelative(-34.23f)
                curveToRelative(-0.01f, -12.45f, -7.21f, -23.76f, -18.49f, -29.01f)
                close()
            }
        }.build()
        
        return _GreaterThan!!
    }

private var _GreaterThan: ImageVector? = null

