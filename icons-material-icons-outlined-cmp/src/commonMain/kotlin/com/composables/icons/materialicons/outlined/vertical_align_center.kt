package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Vertical_align_center: ImageVector
    get() {
        if (_Vertical_align_center != null) return _Vertical_align_center!!
        
        _Vertical_align_center = ImageVector.Builder(
            name = "vertical_align_center",
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
                moveTo(8f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                close()
                moveToRelative(8f, -14f)
                horizontalLineToRelative(-3f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineTo(8f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                close()
                moveTo(4f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Vertical_align_center!!
    }

private var _Vertical_align_center: ImageVector? = null

