package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CloudArrowDown: ImageVector
    get() {
        if (_CloudArrowDown != null) return _CloudArrowDown!!
        
        _CloudArrowDown = ImageVector.Builder(
            name = "cloud-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                arcToRelative(5.53f, 5.53f, 0f, false, false, -3.594f, 1.342f)
                curveToRelative(-0.766f, 0.66f, -1.321f, 1.52f, -1.464f, 2.383f)
                curveTo(1.266f, 6.095f, 0f, 7.555f, 0f, 9.318f)
                curveTo(0f, 11.366f, 1.708f, 13f, 3.781f, 13f)
                horizontalLineToRelative(8.906f)
                curveTo(14.502f, 13f, 16f, 11.57f, 16f, 9.773f)
                curveToRelative(0f, -1.636f, -1.242f, -2.969f, -2.834f, -3.194f)
                curveTo(12.923f, 3.999f, 10.69f, 2f, 8f, 2f)
                moveToRelative(2.354f, 6.854f)
                lineToRelative(-2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineToRelative(-2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                lineTo(7.5f, 9.293f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(3.793f)
                lineToRelative(1.146f, -1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
            }
        }.build()
        
        return _CloudArrowDown!!
    }

private var _CloudArrowDown: ImageVector? = null

