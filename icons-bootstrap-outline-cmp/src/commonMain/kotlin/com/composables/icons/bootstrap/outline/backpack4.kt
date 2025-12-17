package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Backpack4: ImageVector
    get() {
        if (_Backpack4 != null) return _Backpack4!!
        
        _Backpack4 = ImageVector.Builder(
            name = "backpack4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveToRelative(1f, 0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                horizontalLineTo(3.5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.52f, 0.198f, 0.993f, 0.523f, 1.349f)
                arcTo(0.5f, 0.5f, 0f, false, false, 2f, 6.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.023f, -0.151f)
                curveToRelative(0.325f, -0.356f, 0.523f, -0.83f, 0.523f, -1.349f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(10f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveToRelative(0f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveTo(3f, 14f)
                verticalLineTo(6.937f)
                quadToRelative(0.24f, 0.062f, 0.5f, 0.063f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                quadToRelative(0.26f, 0f, 0.5f, -0.063f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveToRelative(9.5f, -11f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _Backpack4!!
    }

private var _Backpack4: ImageVector? = null

