package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Buildings: ImageVector
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
                moveTo(14.763f, 0.075f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 0.5f)
                verticalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.342f, -0.474f)
                lineTo(6f, 7.64f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.276f, -0.447f)
                lineToRelative(8f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.487f, 0.022f)
                moveTo(6f, 8.694f)
                lineTo(1f, 10.36f)
                verticalLineTo(15f)
                horizontalLineToRelative(5f)
                close()
                moveTo(7f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(15f)
                horizontalLineToRelative(2f)
                verticalLineTo(1.309f)
                lineToRelative(-7f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(-2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(2f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(4f)
                close()
                moveToRelative(4f, -4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(0f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(8f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(0f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.build()
        
        return _Buildings!!
    }

private var _Buildings: ImageVector? = null

