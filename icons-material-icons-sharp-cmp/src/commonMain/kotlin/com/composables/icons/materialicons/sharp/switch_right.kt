package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Switch_right: ImageVector
    get() {
        if (_Switch_right != null) return _Switch_right!!
        
        _Switch_right = ImageVector.Builder(
            name = "switch_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 0f)
                lineTo(24f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 15.38f)
                verticalLineTo(8.62f)
                lineTo(18.88f, 12f)
                lineTo(15.5f, 15.38f)
                moveTo(14f, 19f)
                lineToRelative(7f, -7f)
                lineToRelative(-7f, -7f)
                verticalLineTo(19f)
                lineTo(14f, 19f)
                close()
                moveTo(10f, 19f)
                verticalLineTo(5f)
                lineToRelative(-7f, 7f)
                lineTo(10f, 19f)
                close()
            }
        }.build()
        
        return _Switch_right!!
    }

private var _Switch_right: ImageVector? = null

