package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Subdirectory_arrow_right: ImageVector
    get() {
        if (_Subdirectory_arrow_right != null) return _Subdirectory_arrow_right!!
        
        _Subdirectory_arrow_right = ImageVector.Builder(
            name = "subdirectory_arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 15f)
                lineToRelative(-6f, 6f)
                lineToRelative(-1.42f, -1.42f)
                lineTo(15.17f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(9.17f)
                lineToRelative(-3.59f, -3.58f)
                lineTo(13f, 9f)
                lineToRelative(6f, 6f)
                close()
            }
        }.build()
        
        return _Subdirectory_arrow_right!!
    }

private var _Subdirectory_arrow_right: ImageVector? = null

