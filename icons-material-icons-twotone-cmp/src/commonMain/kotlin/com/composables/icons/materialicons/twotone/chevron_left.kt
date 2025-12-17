package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Chevron_left: ImageVector
    get() {
        if (_Chevron_left != null) return _Chevron_left!!
        
        _Chevron_left = ImageVector.Builder(
            name = "chevron_left",
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
                moveTo(15.41f, 7.41f)
                lineTo(14f, 6f)
                lineToRelative(-6f, 6f)
                lineToRelative(6f, 6f)
                lineToRelative(1.41f, -1.41f)
                lineTo(10.83f, 12f)
                lineToRelative(4.58f, -4.59f)
                close()
            }
        }.build()
        
        return _Chevron_left!!
    }

private var _Chevron_left: ImageVector? = null

