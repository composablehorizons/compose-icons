package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.View_comfy: ImageVector
    get() {
        if (_View_comfy != null) return _View_comfy!!
        
        _View_comfy = ImageVector.Builder(
            name = "view_comfy",
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
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(19f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
                moveToRelative(17f, 4f)
                horizontalLineToRelative(-2.25f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineToRelative(2f)
                close()
                moveTo(9.25f, 11f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(2f)
                horizontalLineTo(9.25f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(-2f, 2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4.25f, -4f)
                horizontalLineTo(9.25f)
                verticalLineTo(7f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(2f, -2f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(2f)
                horizontalLineTo(13.5f)
                verticalLineTo(7f)
                close()
                moveToRelative(-2f, 8f)
                verticalLineToRelative(2f)
                horizontalLineTo(9.25f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.25f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(2f)
                horizontalLineTo(13.5f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(0f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(2f)
                horizontalLineTo(13.5f)
                close()
                moveToRelative(4.25f, -2f)
                horizontalLineTo(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7.25f, 7f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineToRelative(2.25f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(12.75f, 2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.25f)
                close()
            }
        }.build()
        
        return _View_comfy!!
    }

private var _View_comfy: ImageVector? = null

