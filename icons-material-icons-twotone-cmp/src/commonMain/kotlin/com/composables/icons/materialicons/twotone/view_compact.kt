package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.View_compact: ImageVector
    get() {
        if (_View_compact != null) return _View_compact!!
        
        _View_compact = ImageVector.Builder(
            name = "view_compact",
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
                moveTo(11f, 13f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-9f)
                close()
                moveToRelative(-6f, 0f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(19f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
                moveToRelative(6f, 12f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(11f, 0f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _View_compact!!
    }

private var _View_compact: ImageVector? = null

