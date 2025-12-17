package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FileCv: ImageVector
    get() {
        if (_FileCv != null) return _FileCv!!
        
        _FileCv = ImageVector.Builder(
            name = "file-cv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, false, false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(4f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                close()
                moveToRelative(-2.5f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, -2.5f)
                moveToRelative(6.743f, 0.03f)
                arcToRelative(1f, 1f, 0f, false, false, -1.213f, 0.727f)
                lineToRelative(-0.53f, 2.119f)
                lineToRelative(-0.53f, -2.119f)
                arcToRelative(1f, 1f, 0f, true, false, -1.94f, 0.486f)
                lineToRelative(1.5f, 6f)
                curveToRelative(0.252f, 1.01f, 1.688f, 1.01f, 1.94f, 0f)
                lineToRelative(1.5f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, -0.727f, -1.213f)
                moveToRelative(-1.244f, -7.031f)
                lineToRelative(4.001f, 4.001f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _FileCv!!
    }

private var _FileCv: ImageVector? = null

