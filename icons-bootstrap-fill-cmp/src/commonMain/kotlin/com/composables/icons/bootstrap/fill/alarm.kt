package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Alarm: ImageVector
    get() {
        if (_Alarm != null) return _Alarm!!
        
        _Alarm = ImageVector.Builder(
            name = "alarm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(9f)
                verticalLineToRelative(1.07f)
                arcToRelative(7.001f, 7.001f, 0f, false, true, 3.274f, 12.474f)
                lineToRelative(0.601f, 0.602f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.708f)
                lineToRelative(-0.746f, -0.746f)
                arcTo(6.97f, 6.97f, 0f, false, true, 8f, 16f)
                arcToRelative(6.97f, 6.97f, 0f, false, true, -3.422f, -0.892f)
                lineToRelative(-0.746f, 0.746f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, -0.708f)
                lineToRelative(0.602f, -0.602f)
                arcTo(7.001f, 7.001f, 0f, false, true, 7f, 2.07f)
                verticalLineTo(1f)
                horizontalLineToRelative(-0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 0.5f)
                moveToRelative(2.5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(3.362f)
                lineToRelative(-1.429f, 2.38f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.858f, 0.515f)
                lineToRelative(1.5f, -2.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 8.5f, 9f)
                close()
                moveTo(0.86f, 5.387f)
                arcTo(2.5f, 2.5f, 0f, true, true, 4.387f, 1.86f)
                arcTo(8.04f, 8.04f, 0f, false, false, 0.86f, 5.387f)
                moveTo(11.613f, 1.86f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 3.527f, 3.527f)
                arcToRelative(8.04f, 8.04f, 0f, false, false, -3.527f, -3.527f)
            }
        }.build()
        
        return _Alarm!!
    }

private var _Alarm: ImageVector? = null

