package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HouseSlash: ImageVector
    get() {
        if (_HouseSlash != null) return _HouseSlash!!
        
        _HouseSlash = ImageVector.Builder(
            name = "house-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.879f, 10.414f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -3.465f, 3.465f)
                close()
                moveToRelative(0.707f, 0.707f)
                lineToRelative(-3.465f, 3.465f)
                arcToRelative(2.501f, 2.501f, 0f, false, false, 3.465f, -3.465f)
                moveToRelative(-4.56f, -1.096f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 4.949f, 4.95f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.95f, -4.95f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.293f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineTo(11f, 3.793f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.293f)
                lineToRelative(2.354f, 2.353f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8f, 2.207f)
                lineToRelative(-5f, 5f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-4f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 13.5f)
                verticalLineTo(8.207f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                close()
            }
        }.build()
        
        return _HouseSlash!!
    }

private var _HouseSlash: ImageVector? = null

