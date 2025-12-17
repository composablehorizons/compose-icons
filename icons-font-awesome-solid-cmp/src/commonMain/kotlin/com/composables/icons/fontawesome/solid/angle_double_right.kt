package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.AngleDoubleRight: ImageVector
    get() {
        if (_AngleDoubleRight != null) return _AngleDoubleRight!!
        
        _AngleDoubleRight = ImageVector.Builder(
            name = "angle-double-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224.3f, 273f)
                lineToRelative(-136f, 136f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0f)
                lineToRelative(-22.6f, -22.6f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0f, -33.9f)
                lineToRelative(96.4f, -96.4f)
                lineToRelative(-96.4f, -96.4f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0f, -33.9f)
                lineTo(54.3f, 103f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineToRelative(136f, 136f)
                curveToRelative(9.5f, 9.4f, 9.5f, 24.6f, 0.1f, 34f)
                close()
                moveToRelative(192f, -34f)
                lineToRelative(-136f, -136f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineToRelative(-22.6f, 22.6f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(96.4f, 96.4f)
                lineToRelative(-96.4f, 96.4f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(22.6f, 22.6f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineToRelative(136f, -136f)
                curveToRelative(9.4f, -9.2f, 9.4f, -24.4f, 0f, -33.8f)
                close()
            }
        }.build()
        
        return _AngleDoubleRight!!
    }

private var _AngleDoubleRight: ImageVector? = null

