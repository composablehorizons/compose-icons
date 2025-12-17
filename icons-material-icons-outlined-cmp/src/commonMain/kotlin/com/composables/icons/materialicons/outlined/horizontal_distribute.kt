package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Horizontal_distribute: ImageVector
    get() {
        if (_Horizontal_distribute != null) return _Horizontal_distribute!!
        
        _Horizontal_distribute = ImageVector.Builder(
            name = "horizontal_distribute",
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
                moveTo(4f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                close()
                moveTo(22f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                close()
                moveTo(13.5f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Horizontal_distribute!!
    }

private var _Horizontal_distribute: ImageVector? = null

