package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Backpack: ImageVector
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
                moveTo(5f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 2f)
                verticalLineToRelative(0.341f)
                curveTo(3.67f, 3.165f, 2f, 5.388f, 2f, 8f)
                verticalLineToRelative(5.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 4.5f, 16f)
                horizontalLineToRelative(7f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, -2.5f)
                verticalLineTo(8f)
                arcToRelative(6f, 6f, 0f, false, false, -4f, -5.659f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.083f)
                arcToRelative(6f, 6f, 0f, false, false, -2f, 0f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(0f, 3f)
                arcToRelative(4f, 4f, 0f, false, true, 3.96f, 3.43f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.99f, 0.14f)
                arcToRelative(3f, 3f, 0f, false, false, -5.94f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.99f, -0.14f)
                arcTo(4f, 4f, 0f, false, true, 8f, 4f)
                moveTo(4.5f, 9f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _Backpack!!
    }

private var _Backpack: ImageVector? = null

