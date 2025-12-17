package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Backpack4: ImageVector
    get() {
        if (_Backpack4 != null) return _Backpack4!!
        
        _Backpack4 = ImageVector.Builder(
            name = "backpack4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                horizontalLineTo(3.5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(10f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveToRelative(1f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                close()
                moveToRelative(-4f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 7.599f)
                arcTo(3f, 3f, 0f, false, true, 12.5f, 8f)
                horizontalLineTo(9.415f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -2.83f, 0f)
                horizontalLineTo(3.5f)
                arcTo(3f, 3f, 0f, false, true, 2f, 7.599f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                close()
                moveTo(4f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _Backpack4!!
    }

private var _Backpack4: ImageVector? = null

