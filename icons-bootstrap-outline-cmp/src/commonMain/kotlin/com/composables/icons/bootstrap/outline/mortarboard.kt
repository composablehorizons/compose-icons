package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Mortarboard: ImageVector
    get() {
        if (_Mortarboard != null) return _Mortarboard!!
        
        _Mortarboard = ImageVector.Builder(
            name = "mortarboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.211f, 2.047f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.422f, 0f)
                lineToRelative(-7.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.025f, 0.917f)
                lineToRelative(7.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.372f, 0f)
                lineTo(14f, 7.14f)
                verticalLineTo(13f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                verticalLineTo(6.739f)
                lineToRelative(0.686f, -0.275f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.025f, -0.917f)
                close()
                moveTo(8f, 8.46f)
                lineTo(1.758f, 5.965f)
                lineTo(8f, 3.052f)
                lineToRelative(6.242f, 2.913f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.176f, 9.032f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.656f, 0.327f)
                lineToRelative(-0.5f, 1.7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.294f, 0.605f)
                lineToRelative(4.5f, 1.8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.372f, 0f)
                lineToRelative(4.5f, -1.8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.294f, -0.605f)
                lineToRelative(-0.5f, -1.7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.656f, -0.327f)
                lineTo(8f, 10.466f)
                close()
                moveToRelative(-0.068f, 1.873f)
                lineToRelative(0.22f, -0.748f)
                lineToRelative(3.496f, 1.311f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.352f, 0f)
                lineToRelative(3.496f, -1.311f)
                lineToRelative(0.22f, 0.748f)
                lineTo(8f, 12.46f)
                close()
            }
        }.build()
        
        return _Mortarboard!!
    }

private var _Mortarboard: ImageVector? = null

