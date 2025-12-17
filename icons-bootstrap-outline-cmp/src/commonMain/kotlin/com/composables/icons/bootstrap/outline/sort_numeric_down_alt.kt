package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SortNumericDownAlt: ImageVector
    get() {
        if (_SortNumericDownAlt != null) return _SortNumericDownAlt!!
        
        _SortNumericDownAlt = ImageVector.Builder(
            name = "sort-numeric-down-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.36f, 7.098f)
                curveToRelative(-1.137f, 0f, -1.708f, -0.657f, -1.762f, -1.278f)
                horizontalLineToRelative(1.004f)
                curveToRelative(0.058f, 0.223f, 0.343f, 0.45f, 0.773f, 0.45f)
                curveToRelative(0.824f, 0f, 1.164f, -0.829f, 1.133f, -1.856f)
                horizontalLineToRelative(-0.059f)
                curveToRelative(-0.148f, 0.39f, -0.57f, 0.742f, -1.261f, 0.742f)
                curveToRelative(-0.91f, 0f, -1.72f, -0.613f, -1.72f, -1.758f)
                curveToRelative(0f, -1.148f, 0.848f, -1.836f, 1.973f, -1.836f)
                curveToRelative(1.09f, 0f, 2.063f, 0.637f, 2.063f, 2.688f)
                curveToRelative(0f, 1.867f, -0.723f, 2.848f, -2.145f, 2.848f)
                close()
                moveToRelative(0.062f, -2.735f)
                curveToRelative(0.504f, 0f, 0.933f, -0.336f, 0.933f, -0.972f)
                curveToRelative(0f, -0.633f, -0.398f, -1.008f, -0.94f, -1.008f)
                curveToRelative(-0.52f, 0f, -0.927f, 0.375f, -0.927f, 1f)
                curveToRelative(0f, 0.64f, 0.418f, 0.98f, 0.934f, 0.98f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.438f, 8.668f)
                verticalLineTo(14f)
                horizontalLineTo(11.39f)
                verticalLineTo(9.684f)
                horizontalLineToRelative(-0.051f)
                lineToRelative(-1.211f, 0.859f)
                verticalLineToRelative(-0.969f)
                lineToRelative(1.262f, -0.906f)
                horizontalLineToRelative(1.046f)
                close()
                moveTo(4.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(9.793f)
                lineToRelative(-1.146f, -1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0.708f)
                lineToRelative(2f, 1.999f)
                lineToRelative(0.007f, 0.007f)
                arcToRelative(0.497f, 0.497f, 0f, false, false, 0.7f, -0.006f)
                lineToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, -0.708f)
                lineTo(4.5f, 12.293f)
                close()
            }
        }.build()
        
        return _SortNumericDownAlt!!
    }

private var _SortNumericDownAlt: ImageVector? = null

