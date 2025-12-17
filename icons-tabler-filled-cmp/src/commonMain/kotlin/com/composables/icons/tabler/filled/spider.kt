package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Spider: ImageVector
    get() {
        if (_Spider != null) return _Spider!!
        
        _Spider = ImageVector.Builder(
            name = "spider",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.293f, 0.707f)
                lineToRelative(-3.293f, 3.293f)
                horizontalLineToRelative(3.17f)
                lineToRelative(1.209f, -1.207f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, 0.293f)
                horizontalLineToRelative(-3.585f)
                lineToRelative(4.292f, 4.293f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, 0.707f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-1.585f)
                lineToRelative(-2.016f, -2.016f)
                arcToRelative(5f, 5f, 0f, false, true, -9.968f, 0f)
                lineToRelative(-2.016f, 2.015f)
                verticalLineToRelative(1.586f)
                arcToRelative(1f, 1f, 0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.293f, -0.707f)
                lineToRelative(4.291f, -4.293f)
                horizontalLineToRelative(-3.584f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, -0.293f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.208f, 1.207f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-3.292f, -3.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.293f, -0.707f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                verticalLineToRelative(1.585f)
                lineToRelative(3.025f, 3.025f)
                arcToRelative(3f, 3f, 0f, false, true, 5.95f, 0f)
                lineToRelative(3.025f, -3.026f)
                verticalLineToRelative(-1.584f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, -0.993f)
                close()
            }
        }.build()
        
        return _Spider!!
    }

private var _Spider: ImageVector? = null

