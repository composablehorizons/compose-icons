package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Fiber_new: ImageVector
    get() {
        if (_Fiber_new != null) return _Fiber_new!!
        
        _Fiber_new = ImageVector.Builder(
            name = "fiber_new",
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
                moveTo(22f, 4f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                close()
                moveTo(8.5f, 15f)
                horizontalLineTo(7.3f)
                lineToRelative(-2.55f, -3.5f)
                verticalLineTo(15f)
                horizontalLineTo(3.5f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.25f)
                lineToRelative(2.5f, 3.5f)
                verticalLineTo(9f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(5f, -4.74f)
                horizontalLineTo(11f)
                verticalLineToRelative(1.12f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.26f)
                horizontalLineTo(11f)
                verticalLineToRelative(1.11f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(15f)
                horizontalLineToRelative(-4f)
                verticalLineTo(9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.26f)
                close()
                moveToRelative(7f, 4.74f)
                horizontalLineToRelative(-6f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(4.51f)
                horizontalLineToRelative(1.13f)
                verticalLineTo(9.99f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(3.51f)
                horizontalLineToRelative(1.12f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Fiber_new!!
    }

private var _Fiber_new: ImageVector? = null

