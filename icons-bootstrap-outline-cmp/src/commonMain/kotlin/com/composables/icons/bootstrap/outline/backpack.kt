package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Backpack: ImageVector
    get() {
        if (_Backpack != null) return _Backpack!!
        
        _Backpack = ImageVector.Builder(
            name = "backpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.04f, 7.43f)
                arcToRelative(4f, 4f, 0f, false, true, 7.92f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.99f, 0.14f)
                arcToRelative(3f, 3f, 0f, false, false, -5.94f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.99f, -0.14f)
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
                moveTo(6f, 2.341f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                verticalLineToRelative(0.341f)
                curveToRelative(2.33f, 0.824f, 4f, 3.047f, 4f, 5.659f)
                verticalLineToRelative(5.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-7f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2f, 13.5f)
                verticalLineTo(8f)
                arcToRelative(6f, 6f, 0f, false, true, 4f, -5.659f)
                moveTo(7f, 2f)
                verticalLineToRelative(0.083f)
                arcToRelative(6f, 6f, 0f, false, true, 2f, 0f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                moveToRelative(1f, 1f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, 5f)
                verticalLineToRelative(5.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 15f)
                horizontalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(8f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, -5f)
            }
        }.build()
        
        return _Backpack!!
    }

private var _Backpack: ImageVector? = null

