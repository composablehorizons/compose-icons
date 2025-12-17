package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChevronLeft: ImageVector
    get() {
        if (_ChevronLeft != null) return _ChevronLeft!!
        
        _ChevronLeft = ImageVector.Builder(
            name = "chevron-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(34.52f, 239.03f)
                lineTo(228.87f, 44.69f)
                curveToRelative(9.37f, -9.37f, 24.57f, -9.37f, 33.94f, 0f)
                lineToRelative(22.67f, 22.67f)
                curveToRelative(9.36f, 9.36f, 9.37f, 24.52f, 0.04f, 33.9f)
                lineTo(131.49f, 256f)
                lineToRelative(154.02f, 154.75f)
                curveToRelative(9.34f, 9.38f, 9.32f, 24.54f, -0.04f, 33.9f)
                lineToRelative(-22.67f, 22.67f)
                curveToRelative(-9.37f, 9.37f, -24.57f, 9.37f, -33.94f, 0f)
                lineTo(34.52f, 272.97f)
                curveToRelative(-9.37f, -9.37f, -9.37f, -24.57f, 0f, -33.94f)
                close()
            }
        }.build()
        
        return _ChevronLeft!!
    }

private var _ChevronLeft: ImageVector? = null

