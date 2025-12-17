package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Sim: ImageVector
    get() {
        if (_Sim != null) return _Sim!!
        
        _Sim = ImageVector.Builder(
            name = "sim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                close()
                moveTo(8.5f, 6f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(6f)
                close()
                moveTo(5f, 7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                close()
                moveToRelative(3.5f, 3f)
                horizontalLineTo(11f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-1f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 1.5f)
                verticalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 16f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(3.414f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineTo(11.647f, 0.439f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10.586f, 0f)
                close()
                moveToRelative(2f, 3f)
                horizontalLineToRelative(5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12f, 4.5f)
                verticalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 11.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 3f)
            }
        }.build()
        
        return _Sim!!
    }

private var _Sim: ImageVector? = null

