package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Backpack2: ImageVector
    get() {
        if (_Backpack2 != null) return _Backpack2!!
        
        _Backpack2 = ImageVector.Builder(
            name = "backpack2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 13f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 2f)
                verticalLineToRelative(0.341f)
                curveTo(3.67f, 3.165f, 2f, 5.388f, 2f, 8f)
                verticalLineToRelative(1.191f)
                lineToRelative(-1.17f, 0.585f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 11.118f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 15f)
                horizontalLineToRelative(1f)
                curveToRelative(0.456f, 0.607f, 1.182f, 1f, 2f, 1f)
                horizontalLineToRelative(7f)
                curveToRelative(0.818f, 0f, 1.544f, -0.393f, 2f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-2.382f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.83f, -1.342f)
                lineTo(14f, 9.191f)
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
        
        return _Backpack2!!
    }

private var _Backpack2: ImageVector? = null

