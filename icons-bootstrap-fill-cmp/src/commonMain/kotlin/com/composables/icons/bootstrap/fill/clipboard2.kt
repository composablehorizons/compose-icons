package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Clipboard2: ImageVector
    get() {
        if (_Clipboard2 != null) return _Clipboard2!!
        
        _Clipboard2 = ImageVector.Builder(
            name = "clipboard2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 2f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 1f)
                horizontalLineToRelative(0.585f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 1.5f)
                verticalLineTo(2f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12f, 2f)
                verticalLineToRelative(-0.5f)
                quadToRelative(-0.001f, -0.264f, -0.085f, -0.5f)
                horizontalLineToRelative(0.585f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 2.5f)
                verticalLineToRelative(12f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 14.5f)
                verticalLineToRelative(-12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 1f)
            }
        }.build()
        
        return _Clipboard2!!
    }

private var _Clipboard2: ImageVector? = null

