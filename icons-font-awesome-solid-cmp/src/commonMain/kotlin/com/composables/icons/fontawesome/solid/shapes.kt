package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Shapes: ImageVector
    get() {
        if (_Shapes != null) return _Shapes!!
        
        _Shapes = ImageVector.Builder(
            name = "shapes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 256f)
                arcTo(128f, 128f, 0f, true, false, 256f, 384f)
                arcTo(128f, 128f, 0f, false, false, 128f, 256f)
                close()
                moveToRelative(379f, -54.86f)
                lineTo(400.07f, 18.29f)
                arcToRelative(37.26f, 37.26f, 0f, false, false, -64.14f, 0f)
                lineTo(229f, 201.14f)
                curveTo(214.76f, 225.52f, 232.58f, 256f, 261.09f, 256f)
                horizontalLineTo(474.91f)
                curveTo(503.42f, 256f, 521.24f, 225.52f, 507f, 201.14f)
                close()
                moveTo(480f, 288f)
                horizontalLineTo(320f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, 32f)
                verticalLineTo(480f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineTo(480f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(320f)
                arcTo(32f, 32f, 0f, false, false, 480f, 288f)
                close()
            }
        }.build()
        
        return _Shapes!!
    }

private var _Shapes: ImageVector? = null

