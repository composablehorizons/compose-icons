package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.List_alt: ImageVector
    get() {
        if (_List_alt != null) return _List_alt!!
        
        _List_alt = ImageVector.Builder(
            name = "list_alt",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 5f)
                verticalLineToRelative(14f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                moveToRelative(1.1f, -2f)
                horizontalLineTo(3.9f)
                curveToRelative(-0.5f, 0f, -0.9f, 0.4f, -0.9f, 0.9f)
                verticalLineToRelative(16.2f)
                curveToRelative(0f, 0.4f, 0.4f, 0.9f, 0.9f, 0.9f)
                horizontalLineToRelative(16.2f)
                curveToRelative(0.4f, 0f, 0.9f, -0.5f, 0.9f, -0.9f)
                verticalLineTo(3.9f)
                curveToRelative(0f, -0.5f, -0.5f, -0.9f, -0.9f, -0.9f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineTo(7f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _List_alt!!
    }

private var _List_alt: ImageVector? = null

