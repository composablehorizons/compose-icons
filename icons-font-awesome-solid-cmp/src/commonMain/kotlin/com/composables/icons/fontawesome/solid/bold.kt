package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bold: ImageVector
    get() {
        if (_Bold != null) return _Bold!!
        
        _Bold = ImageVector.Builder(
            name = "bold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(333.49f, 238f)
                arcToRelative(122f, 122f, 0f, false, false, 27f, -65.21f)
                curveTo(367.87f, 96.49f, 308f, 32f, 233.42f, 32f)
                horizontalLineTo(34f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(31.87f)
                verticalLineToRelative(288f)
                horizontalLineTo(34f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(209.32f)
                curveToRelative(70.8f, 0f, 134.14f, -51.75f, 141f, -122.4f)
                curveToRelative(4.74f, -48.45f, -16.39f, -92.06f, -50.83f, -119.6f)
                close()
                moveTo(145.66f, 112f)
                horizontalLineToRelative(87.76f)
                arcToRelative(48f, 48f, 0f, false, true, 0f, 96f)
                horizontalLineToRelative(-87.76f)
                close()
                moveToRelative(87.76f, 288f)
                horizontalLineToRelative(-87.76f)
                verticalLineTo(288f)
                horizontalLineToRelative(87.76f)
                arcToRelative(56f, 56f, 0f, false, true, 0f, 112f)
                close()
            }
        }.build()
        
        return _Bold!!
    }

private var _Bold: ImageVector? = null

