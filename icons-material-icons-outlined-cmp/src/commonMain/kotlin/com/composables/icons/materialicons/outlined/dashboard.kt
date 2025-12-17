package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Dashboard: ImageVector
    get() {
        if (_Dashboard != null) return _Dashboard!!
        
        _Dashboard = ImageVector.Builder(
            name = "dashboard",
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
                moveTo(19f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(5f)
                horizontalLineToRelative(4f)
                moveTo(9f, 5f)
                verticalLineToRelative(6f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(4f)
                moveToRelative(10f, 8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                moveTo(9f, 17f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                moveTo(21f, 3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineTo(3f)
                close()
                moveTo(11f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(8f)
                verticalLineTo(3f)
                close()
                moveToRelative(10f, 8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(8f)
                verticalLineTo(11f)
                close()
                moveToRelative(-10f, 4f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                close()
            }
        }.build()
        
        return _Dashboard!!
    }

private var _Dashboard: ImageVector? = null

