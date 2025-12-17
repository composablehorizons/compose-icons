package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Vertical_split: ImageVector
    get() {
        if (_Vertical_split != null) return _Vertical_split!!
        
        _Vertical_split = ImageVector.Builder(
            name = "vertical_split",
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
                moveTo(3f, 13f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveToRelative(0f, -8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveToRelative(16f, 2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-4f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                moveToRelative(2f, -2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(8f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Vertical_split!!
    }

private var _Vertical_split: ImageVector? = null

