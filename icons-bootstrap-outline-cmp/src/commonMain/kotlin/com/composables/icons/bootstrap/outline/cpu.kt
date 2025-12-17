package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Cpu: ImageVector
    get() {
        if (_Cpu != null) return _Cpu!!
        
        _Cpu = ImageVector.Builder(
            name = "cpu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(2f)
                arcTo(2.5f, 2.5f, 0f, false, true, 14f, 4.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(14f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(14f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2f, 11.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(2f)
                arcTo(2.5f, 2.5f, 0f, false, true, 4.5f, 2f)
                verticalLineTo(0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 0f)
                moveToRelative(-0.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 4.5f)
                verticalLineToRelative(7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 13f)
                horizontalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.5f, 3f)
                close()
                moveTo(5f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 5f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11f, 6.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 11f)
                horizontalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 9.5f)
                close()
                moveTo(6.5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _Cpu!!
    }

private var _Cpu: ImageVector? = null

