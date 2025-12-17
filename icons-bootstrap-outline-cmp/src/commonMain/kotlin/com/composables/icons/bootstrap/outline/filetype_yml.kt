package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeYml: ImageVector
    get() {
        if (_FiletypeYml != null) return _FiletypeYml!!
        
        _FiletypeYml = ImageVector.Builder(
            name = "filetype-yml",
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
                moveTo(2.133f, 15.849f)
                verticalLineToRelative(-1.535f)
                lineToRelative(1.339f, -2.464f)
                horizontalLineToRelative(-0.856f)
                lineToRelative(-0.855f, 1.696f)
                horizontalLineToRelative(-0.032f)
                lineTo(0.876f, 11.85f)
                horizontalLineTo(0f)
                lineToRelative(1.339f, 2.479f)
                verticalLineToRelative(1.52f)
                close()
                moveToRelative(2.287f, 0f)
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
                horizontalLineTo(5.66f)
                lineTo(4.52f, 11.85f)
                horizontalLineToRelative(-0.805f)
                verticalLineToRelative(3.999f)
                close()
                moveToRelative(4.71f, -0.674f)
                horizontalLineToRelative(1.696f)
                verticalLineToRelative(0.674f)
                horizontalLineTo(8.338f)
                verticalLineTo(11.85f)
                horizontalLineToRelative(0.791f)
                verticalLineToRelative(3.325f)
                close()
            }
        }.build()
        
        return _FiletypeYml!!
    }

private var _FiletypeYml: ImageVector? = null

