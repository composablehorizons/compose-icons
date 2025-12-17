package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Luggage: ImageVector
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
                moveTo(2f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(5f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8f, 6.5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(4f)
                verticalLineToRelative(1f)
                horizontalLineTo(2.5f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-0.335f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 13.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 5f)
                horizontalLineTo(2f)
                close()
                moveTo(3f, 5f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(10f, 1f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 6f)
                horizontalLineToRelative(-1f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(5f)
                verticalLineTo(8f)
                close()
                moveTo(10f, 7f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 7f)
                moveTo(5f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 8f)
                horizontalLineTo(7f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 14.5f)
                close()
                moveToRelative(9f, 6.5f)
                verticalLineTo(8f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 9.5f)
                verticalLineToRelative(5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                close()
            }
        }.build()
        
        return _Luggage!!
    }

private var _Luggage: ImageVector? = null

