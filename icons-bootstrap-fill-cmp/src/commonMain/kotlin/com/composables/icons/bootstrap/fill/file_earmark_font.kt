package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkFont: ImageVector
    get() {
        if (_FileEarmarkFont != null) return _FileEarmarkFont!!
        
        _FileEarmarkFont = ImageVector.Builder(
            name = "file-earmark-font",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.293f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4.707f)
                arcTo(1f, 1f, 0f, false, false, 13.707f, 4f)
                lineTo(10f, 0.293f)
                arcTo(1f, 1f, 0f, false, false, 9.293f, 0f)
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveTo(5.057f, 6f)
                horizontalLineToRelative(5.886f)
                lineTo(11f, 8f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.18f, -1.096f, -0.356f, -1.192f, -1.694f, -1.235f)
                lineToRelative(-0.298f, -0.01f)
                verticalLineToRelative(5.09f)
                curveToRelative(0f, 0.47f, 0.1f, 0.582f, 0.903f, 0.655f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(6.59f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.799f, -0.073f, 0.898f, -0.184f, 0.898f, -0.654f)
                verticalLineTo(6.755f)
                lineToRelative(-0.293f, 0.01f)
                curveTo(5.856f, 6.808f, 5.68f, 6.905f, 5.5f, 8f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _FileEarmarkFont!!
    }

private var _FileEarmarkFont: ImageVector? = null

