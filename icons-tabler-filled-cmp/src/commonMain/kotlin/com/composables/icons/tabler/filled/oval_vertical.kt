package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.OvalVertical: ImageVector
    get() {
        if (_OvalVertical != null) return _OvalVertical!!
        
        _OvalVertical = ImageVector.Builder(
            name = "oval-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 5f)
                curveToRelative(-5.457f, 0f, -10f, 3.028f, -10f, 7f)
                reflectiveCurveToRelative(4.543f, 7f, 10f, 7f)
                reflectiveCurveToRelative(10f, -3.028f, 10f, -7f)
                reflectiveCurveToRelative(-4.543f, -7f, -10f, -7f)
                close()
            }
        }.build()
        
        return _OvalVertical!!
    }

private var _OvalVertical: ImageVector? = null

