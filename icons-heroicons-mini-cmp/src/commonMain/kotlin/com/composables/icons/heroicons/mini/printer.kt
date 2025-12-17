package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Printer: ImageVector
    get() {
        if (_Printer != null) return _Printer!!
        
        _Printer = ImageVector.Builder(
            name = "printer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 2.75f)
                curveTo(5f, 1.784f, 5.784f, 1f, 6.75f, 1f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(3.552f)
                curveToRelative(0.377f, 0.046f, 0.752f, 0.097f, 1.126f, 0.153f)
                arcTo(2.212f, 2.212f, 0f, false, true, 18f, 8.653f)
                verticalLineToRelative(4.097f)
                arcTo(2.25f, 2.25f, 0f, false, true, 15.75f, 15f)
                horizontalLineToRelative(-0.241f)
                lineToRelative(0.305f, 1.984f)
                arcTo(1.75f, 1.75f, 0f, false, true, 14.084f, 19f)
                horizontalLineTo(5.915f)
                arcToRelative(1.75f, 1.75f, 0f, false, true, -1.73f, -2.016f)
                lineTo(4.492f, 15f)
                horizontalLineTo(4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 2f, 12.75f)
                verticalLineTo(8.653f)
                curveToRelative(0f, -1.082f, 0.775f, -2.034f, 1.874f, -2.198f)
                curveToRelative(0.374f, -0.056f, 0.75f, -0.107f, 1.127f, -0.153f)
                lineTo(5f, 6.25f)
                verticalLineToRelative(-3.5f)
                close()
                moveToRelative(8.5f, 3.397f)
                arcToRelative(41.533f, 41.533f, 0f, false, false, -7f, 0f)
                verticalLineTo(2.75f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(3.397f)
                close()
                moveTo(6.608f, 12.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.247f, 0.212f)
                lineToRelative(-0.693f, 4.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.247f, 0.288f)
                horizontalLineToRelative(8.17f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.246f, -0.288f)
                lineToRelative(-0.692f, -4.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.247f, -0.212f)
                horizontalLineTo(6.608f)
                close()
            }
        }.build()
        
        return _Printer!!
    }

private var _Printer: ImageVector? = null

