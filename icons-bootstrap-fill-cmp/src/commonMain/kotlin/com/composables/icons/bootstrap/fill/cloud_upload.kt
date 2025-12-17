package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CloudUpload: ImageVector
    get() {
        if (_CloudUpload != null) return _CloudUpload!!
        
        _CloudUpload = ImageVector.Builder(
            name = "cloud-upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(5.53f, 5.53f, 0f, false, false, -3.594f, 1.342f)
                curveToRelative(-0.766f, 0.66f, -1.321f, 1.52f, -1.464f, 2.383f)
                curveTo(1.266f, 4.095f, 0f, 5.555f, 0f, 7.318f)
                curveTo(0f, 9.366f, 1.708f, 11f, 3.781f, 11f)
                horizontalLineTo(7.5f)
                verticalLineTo(5.707f)
                lineTo(5.354f, 7.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                lineToRelative(3f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8.5f, 5.707f)
                verticalLineTo(11f)
                horizontalLineToRelative(4.188f)
                curveTo(14.502f, 11f, 16f, 9.57f, 16f, 7.773f)
                curveToRelative(0f, -1.636f, -1.242f, -2.969f, -2.834f, -3.194f)
                curveTo(12.923f, 1.999f, 10.69f, 0f, 8f, 0f)
                moveToRelative(-0.5f, 14.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
            }
        }.build()
        
        return _CloudUpload!!
    }

private var _CloudUpload: ImageVector? = null

