package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BoxSeam: ImageVector
    get() {
        if (_BoxSeam != null) return _BoxSeam!!
        
        _BoxSeam = ImageVector.Builder(
            name = "box-seam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.186f, 1.113f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.372f, 0f)
                lineTo(1.846f, 3.5f)
                lineToRelative(2.404f, 0.961f)
                lineTo(10.404f, 2f)
                close()
                moveToRelative(3.564f, 1.426f)
                lineTo(5.596f, 5f)
                lineTo(8f, 5.961f)
                lineTo(14.154f, 3.5f)
                close()
                moveToRelative(3.25f, 1.7f)
                lineToRelative(-6.5f, 2.6f)
                verticalLineToRelative(7.922f)
                lineToRelative(6.5f, -2.6f)
                verticalLineTo(4.24f)
                close()
                moveTo(7.5f, 14.762f)
                verticalLineTo(6.838f)
                lineTo(1f, 4.239f)
                verticalLineToRelative(7.923f)
                close()
                moveTo(7.443f, 0.184f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.114f, 0f)
                lineToRelative(7.129f, 2.852f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 3.5f)
                verticalLineToRelative(8.662f)
                arcToRelative(1f, 1f, 0f, false, true, -0.629f, 0.928f)
                lineToRelative(-7.185f, 2.874f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.372f, 0f)
                lineTo(0.63f, 13.09f)
                arcToRelative(1f, 1f, 0f, false, true, -0.63f, -0.928f)
                verticalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.314f, -0.464f)
                close()
            }
        }.build()
        
        return _BoxSeam!!
    }

private var _BoxSeam: ImageVector? = null

