package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeXml: ImageVector
    get() {
        if (_FiletypeXml != null) return _FiletypeXml!!
        
        _FiletypeXml = ImageVector.Builder(
            name = "filetype-xml",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(3.527f, 11.85f)
                horizontalLineToRelative(-0.893f)
                lineToRelative(-0.823f, 1.439f)
                horizontalLineToRelative(-0.036f)
                lineTo(0.943f, 11.85f)
                horizontalLineTo(0.012f)
                lineToRelative(1.227f, 1.983f)
                lineTo(0f, 15.85f)
                horizontalLineToRelative(0.861f)
                lineToRelative(0.853f, -1.415f)
                horizontalLineToRelative(0.035f)
                lineToRelative(0.85f, 1.415f)
                horizontalLineToRelative(0.908f)
                lineToRelative(-1.254f, -1.992f)
                close()
                moveToRelative(0.954f, 3.999f)
                verticalLineToRelative(-2.66f)
                horizontalLineToRelative(0.038f)
                lineToRelative(0.952f, 2.159f)
                horizontalLineToRelative(0.516f)
                lineToRelative(0.946f, -2.16f)
                horizontalLineToRelative(0.038f)
                verticalLineToRelative(2.661f)
                horizontalLineToRelative(0.715f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.14f, 2.596f)
                horizontalLineToRelative(-0.025f)
                lineTo(4.58f, 11.85f)
                horizontalLineToRelative(-0.806f)
                verticalLineToRelative(3.999f)
                close()
                moveToRelative(4.71f, -0.674f)
                horizontalLineToRelative(1.696f)
                verticalLineToRelative(0.674f)
                horizontalLineTo(8.4f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(0.791f)
                close()
            }
        }.build()
        
        return _FiletypeXml!!
    }

private var _FiletypeXml: ImageVector? = null

