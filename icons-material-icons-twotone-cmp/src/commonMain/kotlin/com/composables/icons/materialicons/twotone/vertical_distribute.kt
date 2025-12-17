package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Vertical_distribute: ImageVector
    get() {
        if (_Vertical_distribute != null) return _Vertical_distribute!!
        
        _Vertical_distribute = ImageVector.Builder(
            name = "vertical_distribute",
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
                moveTo(22f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                close()
                moveTo(7f, 10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineTo(7f)
                close()
                moveTo(2f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _Vertical_distribute!!
    }

private var _Vertical_distribute: ImageVector? = null

