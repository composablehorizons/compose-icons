package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Beenhere: ImageVector
    get() {
        if (_Beenhere != null) return _Beenhere!!
        
        _Beenhere = ImageVector.Builder(
            name = "beenhere",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.01f, 1f)
                lineTo(3f, 17f)
                lineToRelative(9f, 6f)
                lineToRelative(8.99f, -6f)
                lineTo(21f, 1f)
                horizontalLineTo(3.01f)
                close()
                moveTo(10f, 16f)
                lineToRelative(-5f, -5f)
                lineToRelative(1.41f, -1.42f)
                lineTo(10f, 13.17f)
                lineToRelative(7.59f, -7.59f)
                lineTo(19f, 7f)
                lineToRelative(-9f, 9f)
                close()
            }
        }.build()
        
        return _Beenhere!!
    }

private var _Beenhere: ImageVector? = null

