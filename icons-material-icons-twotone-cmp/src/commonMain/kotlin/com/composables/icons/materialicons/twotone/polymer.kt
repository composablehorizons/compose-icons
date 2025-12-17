package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Polymer: ImageVector
    get() {
        if (_Polymer != null) return _Polymer!!
        
        _Polymer = ImageVector.Builder(
            name = "polymer",
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
                moveTo(19f, 4f)
                horizontalLineToRelative(-4f)
                lineTo(7.11f, 16.63f)
                lineTo(4.5f, 12f)
                lineTo(9f, 4f)
                horizontalLineTo(5f)
                lineTo(0.5f, 12f)
                lineTo(5f, 20f)
                horizontalLineToRelative(4f)
                lineToRelative(7.89f, -12.63f)
                lineTo(19.5f, 12f)
                lineTo(15f, 20f)
                horizontalLineToRelative(4f)
                lineToRelative(4.5f, -8f)
                lineTo(19f, 4f)
                close()
            }
        }.build()
        
        return _Polymer!!
    }

private var _Polymer: ImageVector? = null

