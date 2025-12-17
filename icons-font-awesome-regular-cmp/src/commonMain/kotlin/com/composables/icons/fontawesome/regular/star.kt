package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Star: ImageVector
    get() {
        if (_Star != null) return _Star!!
        
        _Star = ImageVector.Builder(
            name = "star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528.1f, 171.5f)
                lineTo(382f, 150.2f)
                lineTo(316.7f, 17.8f)
                curveToRelative(-11.7f, -23.6f, -45.6f, -23.9f, -57.4f, 0f)
                lineTo(194f, 150.2f)
                lineTo(47.9f, 171.5f)
                curveToRelative(-26.2f, 3.8f, -36.7f, 36.1f, -17.7f, 54.6f)
                lineToRelative(105.7f, 103f)
                lineToRelative(-25f, 145.5f)
                curveToRelative(-4.5f, 26.3f, 23.2f, 46f, 46.4f, 33.7f)
                lineTo(288f, 439.6f)
                lineToRelative(130.7f, 68.7f)
                curveToRelative(23.2f, 12.2f, 50.9f, -7.4f, 46.4f, -33.7f)
                lineToRelative(-25f, -145.5f)
                lineToRelative(105.7f, -103f)
                curveToRelative(19f, -18.5f, 8.5f, -50.8f, -17.7f, -54.6f)
                close()
                moveTo(388.6f, 312.3f)
                lineToRelative(23.7f, 138.4f)
                lineTo(288f, 385.4f)
                lineToRelative(-124.3f, 65.3f)
                lineToRelative(23.7f, -138.4f)
                lineToRelative(-100.6f, -98f)
                lineToRelative(139f, -20.2f)
                lineToRelative(62.2f, -126f)
                lineToRelative(62.2f, 126f)
                lineToRelative(139f, 20.2f)
                lineToRelative(-100.6f, 98f)
                close()
            }
        }.build()
        
        return _Star!!
    }

private var _Star: ImageVector? = null

