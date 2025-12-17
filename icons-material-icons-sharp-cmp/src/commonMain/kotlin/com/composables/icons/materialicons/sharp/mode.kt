package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mode: ImageVector
    get() {
        if (_Mode != null) return _Mode!!
        
        _Mode = ImageVector.Builder(
            name = "mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 17.25f)
                verticalLineTo(21f)
                horizontalLineToRelative(3.75f)
                lineTo(17.81f, 9.94f)
                lineToRelative(-3.75f, -3.75f)
                lineTo(3f, 17.25f)
                close()
                moveTo(21.41f, 6.34f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-2.53f, 2.54f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(2.53f, -2.54f)
                close()
            }
        }.build()
        
        return _Mode!!
    }

private var _Mode: ImageVector? = null

