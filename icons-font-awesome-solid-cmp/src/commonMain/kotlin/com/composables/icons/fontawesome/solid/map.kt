package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 117.66f)
                verticalLineToRelative(346.32f)
                curveToRelative(0f, 11.32f, 11.43f, 19.06f, 21.94f, 14.86f)
                lineTo(160f, 416f)
                verticalLineTo(32f)
                lineTo(20.12f, 87.95f)
                arcTo(32.006f, 32.006f, 0f, false, false, 0f, 117.66f)
                close()
                moveTo(192f, 416f)
                lineToRelative(192f, 64f)
                verticalLineTo(96f)
                lineTo(192f, 32f)
                verticalLineToRelative(384f)
                close()
                moveTo(554.06f, 33.16f)
                lineTo(416f, 96f)
                verticalLineToRelative(384f)
                lineToRelative(139.88f, -55.95f)
                arcTo(31.996f, 31.996f, 0f, false, false, 576f, 394.34f)
                verticalLineTo(48.02f)
                curveToRelative(0f, -11.32f, -11.43f, -19.06f, -21.94f, -14.86f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

