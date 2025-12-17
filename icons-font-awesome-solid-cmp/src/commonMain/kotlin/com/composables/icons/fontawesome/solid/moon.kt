package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Moon: ImageVector
    get() {
        if (_Moon != null) return _Moon!!
        
        _Moon = ImageVector.Builder(
            name = "moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(283.211f, 512f)
                curveToRelative(78.962f, 0f, 151.079f, -35.925f, 198.857f, -94.792f)
                curveToRelative(7.068f, -8.708f, -0.639f, -21.43f, -11.562f, -19.35f)
                curveToRelative(-124.203f, 23.654f, -238.262f, -71.576f, -238.262f, -196.954f)
                curveToRelative(0f, -72.222f, 38.662f, -138.635f, 101.498f, -174.394f)
                curveToRelative(9.686f, -5.512f, 7.25f, -20.197f, -3.756f, -22.23f)
                arcTo(258.156f, 258.156f, 0f, false, false, 283.211f, 0f)
                curveToRelative(-141.309f, 0f, -256f, 114.511f, -256f, 256f)
                curveToRelative(0f, 141.309f, 114.511f, 256f, 256f, 256f)
                close()
            }
        }.build()
        
        return _Moon!!
    }

private var _Moon: ImageVector? = null

