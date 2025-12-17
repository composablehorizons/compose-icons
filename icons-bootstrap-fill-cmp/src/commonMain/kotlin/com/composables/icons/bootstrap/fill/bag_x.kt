package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BagX: ImageVector
    get() {
        if (_BagX != null) return _BagX!!
        
        _BagX = ImageVector.Builder(
            name = "bag-x",
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
                moveTo(6.854f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineTo(7.293f, 10f)
                lineToRelative(-1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(8f, 10.707f)
                lineToRelative(1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(8.707f, 10f)
                lineToRelative(1.147f, -1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(8f, 9.293f)
                close()
            }
        }.build()
        
        return _BagX!!
    }

private var _BagX: ImageVector? = null

