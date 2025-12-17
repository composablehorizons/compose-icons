package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bezier2: ImageVector
    get() {
        if (_Bezier2 != null) return _Bezier2!!
        
        _Bezier2 = ImageVector.Builder(
            name = "bezier2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 1f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 2.5f)
                horizontalLineToRelative(4.134f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 1f)
                horizontalLineToRelative(-2.01f)
                quadToRelative(0.269f, 0.27f, 0.484f, 0.605f)
                curveTo(8.246f, 5.097f, 8.5f, 6.459f, 8.5f, 8f)
                curveToRelative(0f, 1.993f, 0.257f, 3.092f, 0.713f, 3.7f)
                curveToRelative(0.356f, 0.476f, 0.895f, 0.721f, 1.787f, 0.784f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12.5f, 11f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                horizontalLineTo(6.866f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -1f)
                horizontalLineToRelative(1.711f)
                arcToRelative(3f, 3f, 0f, false, true, -0.165f, -0.2f)
                curveTo(7.743f, 11.407f, 7.5f, 10.007f, 7.5f, 8f)
                curveToRelative(0f, -1.46f, -0.246f, -2.597f, -0.733f, -3.355f)
                curveToRelative(-0.39f, -0.605f, -0.952f, -1f, -1.767f, -1.112f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 5f)
                horizontalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 3.5f)
                close()
                moveTo(2.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveToRelative(10f, 10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _Bezier2!!
    }

private var _Bezier2: ImageVector? = null

