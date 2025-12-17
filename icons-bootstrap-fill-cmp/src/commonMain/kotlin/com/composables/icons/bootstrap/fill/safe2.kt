package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Safe2: ImageVector
    get() {
        if (_Safe2 != null) return _Safe2!!
        
        _Safe2 = ImageVector.Builder(
            name = "safe2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.563f, 8f)
                horizontalLineTo(5.035f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0.662f, -1.596f)
                lineToRelative(1.08f, 1.08f)
                quadToRelative(-0.142f, 0.24f, -0.214f, 0.516f)
                moveToRelative(0.921f, -1.223f)
                lineToRelative(-1.08f, -1.08f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8f, 5.035f)
                verticalLineToRelative(1.528f)
                quadToRelative(-0.277f, 0.072f, -0.516f, 0.214f)
                moveTo(9f, 6.563f)
                verticalLineTo(5.035f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 1.596f, 0.662f)
                lineToRelative(-1.08f, 1.08f)
                arcTo(2f, 2f, 0f, false, false, 9f, 6.563f)
                moveToRelative(1.223f, 0.921f)
                lineToRelative(1.08f, -1.08f)
                curveToRelative(0.343f, 0.458f, 0.577f, 1.003f, 0.662f, 1.596f)
                horizontalLineToRelative(-1.528f)
                arcToRelative(2f, 2f, 0f, false, false, -0.214f, -0.516f)
                moveTo(10.437f, 9f)
                horizontalLineToRelative(1.528f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -0.662f, 1.596f)
                lineToRelative(-1.08f, -1.08f)
                quadToRelative(0.142f, -0.24f, 0.214f, -0.516f)
                moveToRelative(-0.921f, 1.223f)
                lineToRelative(1.08f, 1.08f)
                arcTo(3.5f, 3.5f, 0f, false, true, 9f, 11.965f)
                verticalLineToRelative(-1.528f)
                quadToRelative(0.277f, -0.072f, 0.516f, -0.214f)
                moveTo(8f, 10.437f)
                verticalLineToRelative(1.528f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -1.596f, -0.662f)
                lineToRelative(1.08f, -1.08f)
                quadToRelative(0.24f, 0.142f, 0.516f, 0.214f)
                moveToRelative(-1.223f, -0.921f)
                lineToRelative(-1.08f, 1.08f)
                arcTo(3.5f, 3.5f, 0f, false, true, 5.035f, 9f)
                horizontalLineToRelative(1.528f)
                quadToRelative(0.072f, 0.277f, 0.214f, 0.516f)
                moveTo(7.5f, 8.5f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 2.5f)
                verticalLineTo(3f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(1f)
                verticalLineToRelative(4f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(1f)
                verticalLineToRelative(4f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(1f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 16f)
                horizontalLineToRelative(12f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-12f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 1f)
                close()
                moveToRelative(6f, 3f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 0f, 9f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 0f, -9f)
            }
        }.build()
        
        return _Safe2!!
    }

private var _Safe2: ImageVector? = null

