package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileFont: ImageVector
    get() {
        if (_FileFont != null) return _FileFont!!
        
        _FileFont = ImageVector.Builder(
            name = "file-font",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveTo(5.057f, 4f)
                horizontalLineToRelative(5.886f)
                lineTo(11f, 6f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.18f, -1.096f, -0.356f, -1.192f, -1.694f, -1.235f)
                lineToRelative(-0.298f, -0.01f)
                verticalLineToRelative(6.09f)
                curveToRelative(0f, 0.47f, 0.1f, 0.582f, 0.903f, 0.655f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(6.59f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.799f, -0.073f, 0.898f, -0.184f, 0.898f, -0.654f)
                verticalLineTo(4.755f)
                lineToRelative(-0.293f, 0.01f)
                curveTo(5.856f, 4.808f, 5.68f, 4.905f, 5.5f, 6f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _FileFont!!
    }

private var _FileFont: ImageVector? = null

