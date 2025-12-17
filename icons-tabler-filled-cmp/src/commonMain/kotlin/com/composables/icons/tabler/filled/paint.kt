package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Paint: ImageVector
    get() {
        if (_Paint != null) return _Paint!!
        
        _Paint = ImageVector.Builder(
            name = "paint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                arcToRelative(6f, 6f, 0f, false, true, -5.775f, 5.996f)
                lineToRelative(-0.225f, 0.004f)
                horizontalLineToRelative(-4f)
                lineToRelative(0.15f, 0.005f)
                arcToRelative(2f, 2f, 0f, false, true, 1.844f, 1.838f)
                lineToRelative(0.006f, 0.157f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(5f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                lineToRelative(-0.005f, 0.176f)
                arcToRelative(3f, 3f, 0f, false, true, -2.819f, 2.819f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Paint!!
    }

private var _Paint: ImageVector? = null

