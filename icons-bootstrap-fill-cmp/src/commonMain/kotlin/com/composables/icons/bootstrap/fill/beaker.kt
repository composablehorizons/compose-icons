package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Beaker: ImageVector
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
                moveTo(15.575f, 0.006f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.327f, 0.79f)
                lineToRelative(-0.048f, 0.058f)
                lineToRelative(-0.122f, 0.12f)
                arcTo(2.5f, 2.5f, 0f, false, false, 15f, 2.743f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2.742f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.566f, -1.584f)
                lineTo(0.268f, 0.975f)
                lineTo(0.146f, 0.854f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 0f)
                horizontalLineToRelative(15f)
                close()
                moveTo(11.5f, 13f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(-2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                close()
                moveToRelative(-2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                close()
                moveToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                close()
                moveToRelative(-2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _Beaker!!
    }

private var _Beaker: ImageVector? = null

