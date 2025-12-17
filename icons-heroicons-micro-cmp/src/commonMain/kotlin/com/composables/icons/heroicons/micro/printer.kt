package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Printer: ImageVector
    get() {
        if (_Printer != null) return _Printer!!
        
        _Printer = ImageVector.Builder(
            name = "printer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, false, 1.51f, 1.94f)
                lineToRelative(-0.315f, 1.896f)
                arcTo(1f, 1f, 0f, false, false, 4.18f, 15f)
                horizontalLineToRelative(7.639f)
                arcToRelative(1f, 1f, 0f, false, false, 0.986f, -1.164f)
                lineToRelative(-0.316f, -1.897f)
                arcTo(2f, 2f, 0f, false, false, 14f, 10f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(1.5f, 0f)
                verticalLineTo(2.5f)
                horizontalLineToRelative(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(-5f)
                close()
                moveToRelative(5.23f, 5.5f)
                horizontalLineTo(5.27f)
                lineToRelative(-0.5f, 3f)
                horizontalLineToRelative(6.459f)
                lineToRelative(-0.5f, -3f)
                close()
            }
        }.build()
        
        return _Printer!!
    }

private var _Printer: ImageVector? = null

