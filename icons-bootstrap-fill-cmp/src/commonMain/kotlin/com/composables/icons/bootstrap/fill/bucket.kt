package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Bucket: ImageVector
    get() {
        if (_Bucket != null) return _Bucket!!
        
        _Bucket = ImageVector.Builder(
            name = "bucket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.522f, 5f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.494f, 0.574f)
                lineToRelative(1.372f, 9.149f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.36f, 16f)
                horizontalLineToRelative(7.278f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.483f, -1.277f)
                lineToRelative(1.373f, -9.149f)
                arcTo(0.5f, 0.5f, 0f, false, false, 14f, 5f)
                horizontalLineToRelative(-0.522f)
                arcTo(5.5f, 5.5f, 0f, false, false, 2.522f, 5f)
                moveToRelative(1.005f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 8.945f, 0f)
                close()
            }
        }.build()
        
        return _Bucket!!
    }

private var _Bucket: ImageVector? = null

