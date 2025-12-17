package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.IceCream: ImageVector
    get() {
        if (_IceCream != null) return _IceCream!!
        
        _IceCream = ImageVector.Builder(
            name = "ice-cream",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 160f)
                horizontalLineToRelative(-0.94f)
                arcToRelative(144f, 144f, 0f, true, false, -286.12f, 0f)
                horizontalLineTo(80f)
                arcToRelative(48f, 48f, 0f, false, false, 0f, 96f)
                horizontalLineToRelative(288f)
                arcToRelative(48f, 48f, 0f, false, false, 0f, -96f)
                close()
                moveTo(195.38f, 493.69f)
                arcToRelative(31.52f, 31.52f, 0f, false, false, 57.24f, 0f)
                lineTo(352f, 288f)
                horizontalLineTo(96f)
                close()
            }
        }.build()
        
        return _IceCream!!
    }

private var _IceCream: ImageVector? = null

