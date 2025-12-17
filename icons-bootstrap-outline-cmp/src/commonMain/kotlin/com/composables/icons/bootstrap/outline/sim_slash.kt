package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SimSlash: ImageVector
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
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-0.897f, -0.897f)
                arcTo(0.5f, 0.5f, 0f, false, false, 10.586f, 1f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(9.379f)
                lineToRelative(-1f, 1f)
                verticalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 0f)
                horizontalLineToRelative(7.086f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                moveTo(10.5f, 3f)
                quadToRelative(0.175f, 0f, 0.34f, 0.039f)
                lineTo(9.879f, 4f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(1.379f)
                lineTo(6.879f, 7f)
                horizontalLineTo(5f)
                verticalLineToRelative(1.879f)
                lineToRelative(-1f, 1f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 3f)
                close()
                moveTo(12f, 6.121f)
                lineToRelative(-1f, 1f)
                verticalLineTo(9f)
                horizontalLineTo(9.121f)
                lineTo(7.5f, 10.621f)
                verticalLineTo(12f)
                horizontalLineTo(6.121f)
                lineToRelative(-0.961f, 0.961f)
                quadToRelative(0.165f, 0.039f, 0.34f, 0.039f)
                horizontalLineToRelative(5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.288f, -0.091f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(0.265f, 0.237f, 0.615f, 0.381f, 0.998f, 0.381f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(4.121f)
                lineToRelative(-1f, 1f)
                verticalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                close()
                moveToRelative(2f, -11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(6f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(4f)
                close()
                moveToRelative(5.5f, 6f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(3.854f, -8.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineToRelative(-13f, 13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _SimSlash!!
    }

private var _SimSlash: ImageVector? = null

