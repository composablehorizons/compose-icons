package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Printer: ImageVector
    get() {
        if (_Printer != null) return _Printer!!
        
        _Printer = ImageVector.Builder(
            name = "printer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.875f, 1.5f)
                curveTo(6.839f, 1.5f, 6f, 2.34f, 6f, 3.375f)
                verticalLineToRelative(2.99f)
                curveToRelative(-0.426f, 0.053f, -0.851f, 0.11f, -1.274f, 0.174f)
                curveToRelative(-1.454f, 0.218f, -2.476f, 1.483f, -2.476f, 2.917f)
                verticalLineToRelative(6.294f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(0.27f)
                lineToRelative(-0.155f, 1.705f)
                arcTo(1.875f, 1.875f, 0f, false, false, 7.232f, 22.5f)
                horizontalLineToRelative(9.536f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, 1.867f, -2.045f)
                lineToRelative(-0.155f, -1.705f)
                horizontalLineToRelative(0.27f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(9.456f)
                curveToRelative(0f, -1.434f, -1.022f, -2.7f, -2.476f, -2.917f)
                arcTo(48.716f, 48.716f, 0f, false, false, 18f, 6.366f)
                verticalLineTo(3.375f)
                curveToRelative(0f, -1.036f, -0.84f, -1.875f, -1.875f, -1.875f)
                horizontalLineToRelative(-8.25f)
                close()
                moveTo(16.5f, 6.205f)
                verticalLineToRelative(-2.83f)
                arcTo(0.375f, 0.375f, 0f, false, false, 16.125f, 3f)
                horizontalLineToRelative(-8.25f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, 0.375f)
                verticalLineToRelative(2.83f)
                arcToRelative(49.353f, 49.353f, 0f, false, true, 9f, 0f)
                close()
                moveToRelative(-0.217f, 8.265f)
                curveToRelative(0.178f, 0.018f, 0.317f, 0.16f, 0.333f, 0.337f)
                lineToRelative(0.526f, 5.784f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, -0.374f, 0.409f)
                horizontalLineTo(7.232f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, -0.374f, -0.409f)
                lineToRelative(0.526f, -5.784f)
                arcToRelative(0.373f, 0.373f, 0f, false, true, 0.333f, -0.337f)
                arcToRelative(41.741f, 41.741f, 0f, false, true, 8.566f, 0f)
                close()
                moveToRelative(0.967f, -3.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(18f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineTo(10.5f)
                close()
                moveTo(15f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.008f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.008f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(15f)
                close()
            }
        }.build()
        
        return _Printer!!
    }

private var _Printer: ImageVector? = null

