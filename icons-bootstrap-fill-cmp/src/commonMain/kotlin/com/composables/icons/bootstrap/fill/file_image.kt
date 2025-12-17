package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileImage: ImageVector
    get() {
        if (_FileImage != null) return _FileImage!!
        
        _FileImage = ImageVector.Builder(
            name = "file-image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8.293f)
                lineToRelative(-2.73f, -2.73f)
                arcToRelative(1f, 1f, 0f, false, false, -1.52f, 0.127f)
                lineToRelative(-1.889f, 2.644f)
                lineToRelative(-1.769f, -1.062f)
                arcToRelative(1f, 1f, 0f, false, false, -1.222f, 0.15f)
                lineTo(2f, 12.292f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                moveToRelative(4.002f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.564f, 8.27f)
                lineTo(14f, 11.708f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-0.293f)
                lineToRelative(3.578f, -3.577f)
                lineToRelative(2.56f, 1.536f)
                lineToRelative(2.426f, -3.395f)
                close()
            }
        }.build()
        
        return _FileImage!!
    }

private var _FileImage: ImageVector? = null

