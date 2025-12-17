package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Subdirectory_arrow_left: ImageVector
    get() {
        if (_Subdirectory_arrow_left != null) return _Subdirectory_arrow_left!!
        
        _Subdirectory_arrow_left = ImageVector.Builder(
            name = "subdirectory_arrow_left",
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
                moveTo(11f, 9f)
                lineToRelative(1.42f, 1.42f)
                lineTo(8.83f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                horizontalLineTo(8.83f)
                lineToRelative(3.59f, 3.58f)
                lineTo(11f, 21f)
                lineToRelative(-6f, -6f)
                lineToRelative(6f, -6f)
                close()
            }
        }.build()
        
        return _Subdirectory_arrow_left!!
    }

private var _Subdirectory_arrow_left: ImageVector? = null

