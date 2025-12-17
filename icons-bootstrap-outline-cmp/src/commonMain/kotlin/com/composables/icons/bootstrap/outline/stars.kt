package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Stars: ImageVector
    get() {
        if (_Stars != null) return _Stars!!
        
        _Stars = ImageVector.Builder(
            name = "stars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.657f, 6.247f)
                curveToRelative(0.11f, -0.33f, 0.576f, -0.33f, 0.686f, 0f)
                lineToRelative(0.645f, 1.937f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, 1.829f, 1.828f)
                lineToRelative(1.936f, 0.645f)
                curveToRelative(0.33f, 0.11f, 0.33f, 0.576f, 0f, 0.686f)
                lineToRelative(-1.937f, 0.645f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, -1.828f, 1.829f)
                lineToRelative(-0.645f, 1.936f)
                arcToRelative(0.361f, 0.361f, 0f, false, true, -0.686f, 0f)
                lineToRelative(-0.645f, -1.937f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, -1.828f, -1.828f)
                lineToRelative(-1.937f, -0.645f)
                arcToRelative(0.361f, 0.361f, 0f, false, true, 0f, -0.686f)
                lineToRelative(1.937f, -0.645f)
                arcToRelative(2.89f, 2.89f, 0f, false, false, 1.828f, -1.828f)
                close()
                moveTo(3.794f, 1.148f)
                arcToRelative(0.217f, 0.217f, 0f, false, true, 0.412f, 0f)
                lineToRelative(0.387f, 1.162f)
                curveToRelative(0.173f, 0.518f, 0.579f, 0.924f, 1.097f, 1.097f)
                lineToRelative(1.162f, 0.387f)
                arcToRelative(0.217f, 0.217f, 0f, false, true, 0f, 0.412f)
                lineToRelative(-1.162f, 0.387f)
                arcTo(1.73f, 1.73f, 0f, false, false, 4.593f, 5.69f)
                lineToRelative(-0.387f, 1.162f)
                arcToRelative(0.217f, 0.217f, 0f, false, true, -0.412f, 0f)
                lineTo(3.407f, 5.69f)
                arcTo(1.73f, 1.73f, 0f, false, false, 2.31f, 4.593f)
                lineToRelative(-1.162f, -0.387f)
                arcToRelative(0.217f, 0.217f, 0f, false, true, 0f, -0.412f)
                lineToRelative(1.162f, -0.387f)
                arcTo(1.73f, 1.73f, 0f, false, false, 3.407f, 2.31f)
                close()
                moveTo(10.863f, 0.099f)
                arcToRelative(0.145f, 0.145f, 0f, false, true, 0.274f, 0f)
                lineToRelative(0.258f, 0.774f)
                curveToRelative(0.115f, 0.346f, 0.386f, 0.617f, 0.732f, 0.732f)
                lineToRelative(0.774f, 0.258f)
                arcToRelative(0.145f, 0.145f, 0f, false, true, 0f, 0.274f)
                lineToRelative(-0.774f, 0.258f)
                arcToRelative(1.16f, 1.16f, 0f, false, false, -0.732f, 0.732f)
                lineToRelative(-0.258f, 0.774f)
                arcToRelative(0.145f, 0.145f, 0f, false, true, -0.274f, 0f)
                lineToRelative(-0.258f, -0.774f)
                arcToRelative(1.16f, 1.16f, 0f, false, false, -0.732f, -0.732f)
                lineTo(9.1f, 2.137f)
                arcToRelative(0.145f, 0.145f, 0f, false, true, 0f, -0.274f)
                lineToRelative(0.774f, -0.258f)
                curveToRelative(0.346f, -0.115f, 0.617f, -0.386f, 0.732f, -0.732f)
                close()
            }
        }.build()
        
        return _Stars!!
    }

private var _Stars: ImageVector? = null

