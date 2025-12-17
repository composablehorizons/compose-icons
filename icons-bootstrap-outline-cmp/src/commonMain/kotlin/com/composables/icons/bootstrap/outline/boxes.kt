package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Boxes: ImageVector
    get() {
        if (_Boxes != null) return _Boxes!!
        
        _Boxes = ImageVector.Builder(
            name = "boxes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.752f, 0.066f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.496f, 0f)
                lineToRelative(3.75f, 2.143f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.252f, 0.434f)
                verticalLineToRelative(3.995f)
                lineToRelative(3.498f, 2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 9.07f)
                verticalLineToRelative(4.286f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.252f, 0.434f)
                lineToRelative(-3.75f, 2.143f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.496f, 0f)
                lineToRelative(-3.502f, -2f)
                lineToRelative(-3.502f, 2.001f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.496f, 0f)
                lineToRelative(-3.75f, -2.143f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0f, 13.357f)
                verticalLineTo(9.071f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.252f, -0.434f)
                lineTo(3.75f, 6.638f)
                verticalLineTo(2.643f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.252f, -0.434f)
                close()
                moveTo(4.25f, 7.504f)
                lineTo(1.508f, 9.071f)
                lineToRelative(2.742f, 1.567f)
                lineToRelative(2.742f, -1.567f)
                close()
                moveTo(7.5f, 9.933f)
                lineToRelative(-2.75f, 1.571f)
                verticalLineToRelative(3.134f)
                lineToRelative(2.75f, -1.571f)
                close()
                moveToRelative(1f, 3.134f)
                lineToRelative(2.75f, 1.571f)
                verticalLineToRelative(-3.134f)
                lineTo(8.5f, 9.933f)
                close()
                moveToRelative(0.508f, -3.996f)
                lineToRelative(2.742f, 1.567f)
                lineToRelative(2.742f, -1.567f)
                lineToRelative(-2.742f, -1.567f)
                close()
                moveToRelative(2.242f, -2.433f)
                verticalLineTo(3.504f)
                lineTo(8.5f, 5.076f)
                verticalLineTo(8.21f)
                close()
                moveTo(7.5f, 8.21f)
                verticalLineTo(5.076f)
                lineTo(4.75f, 3.504f)
                verticalLineToRelative(3.134f)
                close()
                moveTo(5.258f, 2.643f)
                lineTo(8f, 4.21f)
                lineToRelative(2.742f, -1.567f)
                lineTo(8f, 1.076f)
                close()
                moveTo(15f, 9.933f)
                lineToRelative(-2.75f, 1.571f)
                verticalLineToRelative(3.134f)
                lineTo(15f, 13.067f)
                close()
                moveTo(3.75f, 14.638f)
                verticalLineToRelative(-3.134f)
                lineTo(1f, 9.933f)
                verticalLineToRelative(3.134f)
                close()
            }
        }.build()
        
        return _Boxes!!
    }

private var _Boxes: ImageVector? = null

