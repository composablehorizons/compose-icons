package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Luggage: ImageVector
    get() {
        if (_Luggage != null) return _Luggage!!
        
        _Luggage = ImageVector.Builder(
            name = "luggage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(5f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 6.5f)
                verticalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1f, 1.415f)
                verticalLineToRelative(0.335f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineToRelative(-1f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.5f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(5f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
                moveTo(11f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 9.5f)
                verticalLineToRelative(5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 14.5f)
                verticalLineToRelative(-5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 6f)
                close()
                moveTo(9.5f, 7.5f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11f, 7f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveTo(6f, 9.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveToRelative(7f, 5.5f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(1.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(14f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Luggage!!
    }

private var _Luggage: ImageVector? = null

