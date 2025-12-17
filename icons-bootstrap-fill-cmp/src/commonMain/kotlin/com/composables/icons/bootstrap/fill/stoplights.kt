package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Stoplights: ImageVector
    get() {
        if (_Stoplights != null) return _Stoplights!!
        
        _Stoplights = ImageVector.Builder(
            name = "stoplights",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                horizontalLineTo(2f)
                curveToRelative(0.167f, 0.5f, 0.8f, 1.6f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                curveToRelative(0.167f, 0.5f, 0.8f, 1.6f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                curveToRelative(0.167f, 0.5f, 0.8f, 1.6f, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(1.2f, -0.4f, 1.833f, -1.5f, 2f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(8f)
                curveToRelative(1.2f, -0.4f, 1.833f, -1.5f, 2f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4f)
                curveToRelative(1.2f, -0.4f, 1.833f, -1.5f, 2f, -2f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(3.5f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                moveToRelative(0f, 4f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                moveTo(8f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
            }
        }.build()
        
        return _Stoplights!!
    }

private var _Stoplights: ImageVector? = null

