package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Gps: ImageVector
    get() {
        if (_Gps != null) return _Gps!!
        
        _Gps = ImageVector.Builder(
            name = "gps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                moveToRelative(-0.086f, 5.066f)
                curveToRelative(0.372f, -0.837f, -0.483f, -1.692f, -1.32f, -1.32f)
                lineToRelative(-9f, 4f)
                lineToRelative(-0.108f, 0.055f)
                curveToRelative(-0.75f, 0.44f, -0.611f, 1.609f, 0.271f, 1.83f)
                lineToRelative(3.418f, 0.853f)
                lineToRelative(0.855f, 3.419f)
                curveToRelative(0.23f, 0.922f, 1.498f, 1.032f, 1.884f, 0.163f)
                close()
            }
        }.build()
        
        return _Gps!!
    }

private var _Gps: ImageVector? = null

