package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Beaker: ImageVector
    get() {
        if (_Beaker != null) return _Beaker!!
        
        _Beaker = ImageVector.Builder(
            name = "beaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                close()
                moveToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                close()
                moveToRelative(-2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                close()
                moveToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                close()
                moveToRelative(-2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineToRelative(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.354f, 0.854f)
                lineToRelative(0.122f, 0.12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 1f, 2.744f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2.743f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0.732f, -1.768f)
                lineToRelative(0.122f, -0.121f)
                arcTo(0.5f, 0.5f, 0f, false, false, 15.5f, 0f)
                close()
                moveTo(2f, 2.743f)
                arcTo(3.5f, 3.5f, 0f, false, false, 1.535f, 1f)
                horizontalLineToRelative(12.93f)
                arcTo(3.5f, 3.5f, 0f, false, false, 14f, 2.743f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
        }.build()
        
        return _Beaker!!
    }

private var _Beaker: ImageVector? = null

