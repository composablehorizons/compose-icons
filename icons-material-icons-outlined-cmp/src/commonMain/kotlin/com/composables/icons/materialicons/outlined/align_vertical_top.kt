package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Align_vertical_top: ImageVector
    get() {
        if (_Align_vertical_top != null) return _Align_vertical_top!!
        
        _Align_vertical_top = ImageVector.Builder(
            name = "align_vertical_top",
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
                moveTo(7f, 22f)
                horizontalLineToRelative(3f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(3f)
                verticalLineTo(6f)
                horizontalLineToRelative(-3f)
                verticalLineTo(16f)
                close()
            }
        }.build()
        
        return _Align_vertical_top!!
    }

private var _Align_vertical_top: ImageVector? = null

