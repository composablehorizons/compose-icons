package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Microscope: ImageVector
    get() {
        if (_Microscope != null) return _Microscope!!
        
        _Microscope = ImageVector.Builder(
            name = "microscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.707f, 4.293f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-1.553f, 1.555f)
                arcToRelative(7f, 7f, 0f, false, true, -0.256f, 9.74f)
                lineToRelative(2.102f, -0.002f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-14f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                arcToRelative(5f, 5f, 0f, false, false, 3.737f, -8.323f)
                lineToRelative(-3.03f, 3.03f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-0.793f, -0.792f)
                lineToRelative(-0.793f, 0.792f)
                arcToRelative(1f, 1f, 0f, true, true, -1.414f, -1.414f)
                lineToRelative(0.792f, -0.793f)
                lineToRelative(-0.792f, -0.793f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                lineToRelative(6f, -6f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                moveToRelative(2f, -2f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, true, true, -1.414f, 1.414f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, true, true, 1.414f, -1.414f)
            }
        }.build()
        
        return _Microscope!!
    }

private var _Microscope: ImageVector? = null

