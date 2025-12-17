package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dashboard: ImageVector
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
                moveTo(3f, 13f)
                horizontalLineToRelative(8f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(0f, 8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(10f, 0f)
                horizontalLineToRelative(8f)
                verticalLineTo(11f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(0f, -18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineTo(3f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.build()
        
        return _Dashboard!!
    }

private var _Dashboard: ImageVector? = null

