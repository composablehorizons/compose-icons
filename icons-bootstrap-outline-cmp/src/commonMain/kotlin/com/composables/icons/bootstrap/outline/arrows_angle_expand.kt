package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowsAngleExpand: ImageVector
    get() {
        if (_ArrowsAngleExpand != null) return _ArrowsAngleExpand!!
        
        _ArrowsAngleExpand = ImageVector.Builder(
            name = "arrows-angle-expand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.828f, 10.172f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, 0f)
                lineToRelative(-4.096f, 4.096f)
                verticalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(1.732f)
                lineToRelative(4.096f, -4.096f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.707f)
                moveToRelative(4.344f, -4.344f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0f)
                lineToRelative(4.096f, -4.096f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineTo(0.525f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(2.768f)
                lineToRelative(-4.096f, 4.096f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.707f)
            }
        }.build()
        
        return _ArrowsAngleExpand!!
    }

private var _ArrowsAngleExpand: ImageVector? = null

