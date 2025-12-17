package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.South: ImageVector
    get() {
        if (_South != null) return _South!!
        
        _South = ImageVector.Builder(
            name = "south",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 15f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(13f, 18.17f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                verticalLineToRelative(16.17f)
                lineToRelative(-4.59f, -4.59f)
                lineTo(5f, 15f)
                lineToRelative(7f, 7f)
                lineTo(19f, 15f)
                close()
            }
        }.build()
        
        return _South!!
    }

private var _South: ImageVector? = null

