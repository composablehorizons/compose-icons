package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Http: ImageVector
    get() {
        if (_Http != null) return _Http!!
        
        _Http = ImageVector.Builder(
            name = "http",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(4.5f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(2.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineToRelative(1.5f)
                close()
                moveToRelative(5.5f, 0f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(23f, 9f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                close()
                moveToRelative(-1.5f, 2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Http!!
    }

private var _Http: ImageVector? = null

