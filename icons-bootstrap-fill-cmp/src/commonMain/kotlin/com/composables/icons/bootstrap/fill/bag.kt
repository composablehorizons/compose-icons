package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Bag: ImageVector
    get() {
        if (_Bag != null) return _Bag!!
        
        _Bag = ImageVector.Builder(
            name = "bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2.5f, 2.5f)
                verticalLineTo(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-0.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 8f, 1f)
                moveToRelative(3.5f, 3f)
                verticalLineToRelative(-0.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Bag!!
    }

private var _Bag: ImageVector? = null

