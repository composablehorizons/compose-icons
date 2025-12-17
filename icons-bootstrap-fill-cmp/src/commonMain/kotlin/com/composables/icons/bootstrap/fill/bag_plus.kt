package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BagPlus: ImageVector
    get() {
        if (_BagPlus != null) return _BagPlus!!
        
        _BagPlus = ImageVector.Builder(
            name = "bag-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 3.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -5f, 0f)
                verticalLineTo(4f)
                horizontalLineToRelative(5f)
                close()
                moveToRelative(1f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 7f, 0f)
                moveTo(8.5f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(8.5f)
                close()
            }
        }.build()
        
        return _BagPlus!!
    }

private var _BagPlus: ImageVector? = null

