package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Show_chart: ImageVector
    get() {
        if (_Show_chart != null) return _Show_chart!!
        
        _Show_chart = ImageVector.Builder(
            name = "show_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 18.49f)
                lineToRelative(6f, -6.01f)
                lineToRelative(4f, 4f)
                lineTo(22f, 6.92f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-7.09f, 7.97f)
                lineToRelative(-4f, -4f)
                lineTo(2f, 16.99f)
                lineToRelative(1.5f, 1.5f)
                close()
            }
        }.build()
        
        return _Show_chart!!
    }

private var _Show_chart: ImageVector? = null

