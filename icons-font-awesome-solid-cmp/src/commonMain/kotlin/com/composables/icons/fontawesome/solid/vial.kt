package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Vial: ImageVector
    get() {
        if (_Vial != null) return _Vial!!
        
        _Vial = ImageVector.Builder(
            name = "vial",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 480f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(477.7f, 186.1f)
                lineTo(309.5f, 18.3f)
                curveToRelative(-3.1f, -3.1f, -8.2f, -3.1f, -11.3f, 0f)
                lineToRelative(-34f, 33.9f)
                curveToRelative(-3.1f, 3.1f, -3.1f, 8.2f, 0f, 11.3f)
                lineToRelative(11.2f, 11.1f)
                lineTo(33f, 316.5f)
                curveToRelative(-38.8f, 38.7f, -45.1f, 102f, -9.4f, 143.5f)
                curveToRelative(20.6f, 24f, 49.5f, 36f, 78.4f, 35.9f)
                curveToRelative(26.4f, 0f, 52.8f, -10f, 72.9f, -30.1f)
                lineToRelative(246.3f, -245.7f)
                lineToRelative(11.2f, 11.1f)
                curveToRelative(3.1f, 3.1f, 8.2f, 3.1f, 11.3f, 0f)
                lineToRelative(34f, -33.9f)
                curveToRelative(3.1f, -3f, 3.1f, -8.1f, 0f, -11.2f)
                close()
                moveTo(318f, 256f)
                horizontalLineTo(161f)
                lineToRelative(148f, -147.7f)
                lineToRelative(78.5f, 78.3f)
                lineTo(318f, 256f)
                close()
            }
        }.build()
        
        return _Vial!!
    }

private var _Vial: ImageVector? = null

