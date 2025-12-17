package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Buildings: ImageVector
    get() {
        if (_Buildings != null) return _Buildings!!
        
        _Buildings = ImageVector.Builder(
            name = "buildings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.724f, -0.447f)
                lineToRelative(-8f, 4f)
                arcTo(0.5f, 0.5f, 0f, false, false, 6f, 4.5f)
                verticalLineToRelative(3.14f)
                lineTo(0.342f, 9.526f)
                arcTo(0.5f, 0.5f, 0f, false, false, 0f, 10f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(14f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(2f, 11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(2f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(4f)
                close()
                moveToRelative(-1f, 2f)
                verticalLineToRelative(1f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(1f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(4f)
                close()
                moveToRelative(9f, -10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineTo(3f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                close()
                moveToRelative(1f, 2f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-1f, 2f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(1f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(3f, -2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineTo(9f)
                close()
                moveToRelative(-1f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-2f, -4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(3f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7f)
                close()
                moveToRelative(-2f, -2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineTo(5f)
                close()
                moveToRelative(1f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.build()
        
        return _Buildings!!
    }

private var _Buildings: ImageVector? = null

