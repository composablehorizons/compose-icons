package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.StackOverflow: ImageVector
    get() {
        if (_StackOverflow != null) return _StackOverflow!!
        
        _StackOverflow = ImageVector.Builder(
            name = "stack-overflow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.412f, 14.572f)
                verticalLineTo(10.29f)
                horizontalLineToRelative(1.428f)
                verticalLineTo(16f)
                horizontalLineTo(1f)
                verticalLineToRelative(-5.71f)
                horizontalLineToRelative(1.428f)
                verticalLineToRelative(4.282f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.857f, 13.145f)
                horizontalLineToRelative(7.137f)
                verticalLineToRelative(-1.428f)
                horizontalLineTo(3.857f)
                close()
                moveTo(10.254f, 0f)
                lineTo(9.108f, 0.852f)
                lineToRelative(4.26f, 5.727f)
                lineToRelative(1.146f, -0.852f)
                close()
                moveToRelative(-3.54f, 3.377f)
                lineToRelative(5.484f, 4.567f)
                lineToRelative(0.913f, -1.097f)
                lineTo(7.627f, 2.28f)
                lineToRelative(-0.914f, 1.097f)
                close()
                moveTo(4.922f, 6.55f)
                lineToRelative(6.47f, 3.013f)
                lineToRelative(0.603f, -1.294f)
                lineToRelative(-6.47f, -3.013f)
                close()
                moveToRelative(-0.925f, 3.344f)
                lineToRelative(6.985f, 1.469f)
                lineToRelative(0.294f, -1.398f)
                lineToRelative(-6.985f, -1.468f)
                close()
            }
        }.build()
        
        return _StackOverflow!!
    }

private var _StackOverflow: ImageVector? = null

