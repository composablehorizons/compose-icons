package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SimSlash: ImageVector
    get() {
        if (_SimSlash != null) return _SimSlash!!
        
        _SimSlash = ImageVector.Builder(
            name = "sim-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.646f, 0.44f)
                lineToRelative(0.897f, 0.896f)
                lineToRelative(-1.703f, 1.703f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10.5f, 3f)
                horizontalLineToRelative(-5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 4.5f)
                verticalLineToRelative(5.379f)
                lineToRelative(-2f, 2f)
                verticalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 0f)
                horizontalLineToRelative(7.086f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                moveTo(8.5f, 5.378f)
                lineTo(9.879f, 4f)
                horizontalLineTo(8.5f)
                close()
                moveTo(5f, 8.879f)
                lineTo(6.879f, 7f)
                horizontalLineTo(5f)
                close()
                moveToRelative(6f, -1.758f)
                lineTo(9.121f, 9f)
                horizontalLineTo(11f)
                close()
                moveToRelative(-3.5f, 3.5f)
                lineTo(6.121f, 12f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5.5f, 13f)
                quadToRelative(-0.175f, 0f, -0.34f, -0.039f)
                lineTo(2.502f, 15.62f)
                curveToRelative(0.265f, 0.236f, 0.615f, 0.38f, 0.998f, 0.38f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(4.121f)
                lineToRelative(-2f, 2f)
                verticalLineTo(11.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                close()
                moveTo(5f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                close()
                moveTo(8.5f, 10f)
                horizontalLineTo(11f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(6.354f, -8.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineToRelative(-13f, 13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _SimSlash!!
    }

private var _SimSlash: ImageVector? = null

