package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Horizontal_split: ImageVector
    get() {
        if (_Horizontal_split != null) return _Horizontal_split!!
        
        _Horizontal_split = ImageVector.Builder(
            name = "horizontal_split",
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
                moveTo(19f, 15f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                moveToRelative(2f, -10f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineTo(5f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineTo(9f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 15f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Horizontal_split!!
    }

private var _Horizontal_split: ImageVector? = null

