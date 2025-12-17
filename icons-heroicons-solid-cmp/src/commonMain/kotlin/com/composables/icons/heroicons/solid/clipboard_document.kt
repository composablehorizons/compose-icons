package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ClipboardDocument: ImageVector
    get() {
        if (_ClipboardDocument != null) return _ClipboardDocument!!
        
        _ClipboardDocument = ImageVector.Builder(
            name = "clipboard-document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.663f, 3.118f)
                curveToRelative(0.225f, 0.015f, 0.45f, 0.032f, 0.673f, 0.05f)
                curveTo(19.876f, 3.298f, 21f, 4.604f, 21f, 6.109f)
                verticalLineToRelative(9.642f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                verticalLineTo(16.5f)
                curveToRelative(0f, -5.922f, -4.576f, -10.775f, -10.384f, -11.217f)
                curveToRelative(0.324f, -1.132f, 1.3f, -2.01f, 2.548f, -2.114f)
                curveToRelative(0.224f, -0.019f, 0.448f, -0.036f, 0.673f, -0.051f)
                arcTo(3f, 3f, 0f, false, true, 13.5f, 1.5f)
                horizontalLineTo(15f)
                arcToRelative(3f, 3f, 0f, false, true, 2.663f, 1.618f)
                close()
                moveTo(12f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 3f)
                horizontalLineTo(15f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                horizontalLineTo(12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 8.625f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(0.375f)
                arcTo(3.75f, 3.75f, 0f, false, true, 9f, 10.5f)
                verticalLineToRelative(1.875f)
                curveToRelative(0f, 1.036f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineToRelative(1.875f)
                arcTo(3.75f, 3.75f, 0f, false, true, 16.5f, 18f)
                verticalLineToRelative(2.625f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineToRelative(-9.75f)
                arcTo(1.875f, 1.875f, 0f, false, true, 3f, 20.625f)
                verticalLineToRelative(-12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 10.5f)
                arcToRelative(5.23f, 5.23f, 0f, false, false, -1.279f, -3.434f)
                arcToRelative(9.768f, 9.768f, 0f, false, true, 6.963f, 6.963f)
                arcToRelative(5.23f, 5.23f, 0f, false, false, -3.434f, -1.279f)
                horizontalLineToRelative(-1.875f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, -0.375f, -0.375f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()
        
        return _ClipboardDocument!!
    }

private var _ClipboardDocument: ImageVector? = null

