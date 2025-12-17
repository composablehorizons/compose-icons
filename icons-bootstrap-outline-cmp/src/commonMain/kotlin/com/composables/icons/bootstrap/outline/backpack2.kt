package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Backpack2: ImageVector
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
                moveTo(4.04f, 7.43f)
                arcToRelative(4f, 4f, 0f, false, true, 7.92f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.99f, 0.14f)
                arcToRelative(3f, 3f, 0f, false, false, -5.94f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.99f, -0.14f)
            }
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
                moveTo(6f, 2.341f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                verticalLineToRelative(0.341f)
                curveToRelative(2.33f, 0.824f, 4f, 3.047f, 4f, 5.659f)
                verticalLineToRelative(1.191f)
                lineToRelative(1.17f, 0.585f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.83f, 1.342f)
                verticalLineTo(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.456f, 0.607f, -1.182f, 1f, -2f, 1f)
                horizontalLineToRelative(-7f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2f, -1f)
                horizontalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 13.5f)
                verticalLineToRelative(-2.382f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.83f, -1.342f)
                lineTo(2f, 9.191f)
                verticalLineTo(8f)
                arcToRelative(6f, 6f, 0f, false, true, 4f, -5.659f)
                moveTo(7f, 2f)
                verticalLineToRelative(0.083f)
                arcToRelative(6f, 6f, 0f, false, true, 2f, 0f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                moveTo(3f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 15f)
                horizontalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(8f)
                arcTo(5f, 5f, 0f, false, false, 3f, 8f)
                close()
                moveToRelative(-1f, -3.19f)
                lineToRelative(-0.724f, 0.362f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.276f, 0.447f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(2f)
                close()
                moveToRelative(12f, 0f)
                verticalLineTo(14f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-2.382f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.276f, -0.447f)
                lineTo(14f, 10.309f)
                close()
            }
        }.build()
        
        return _Backpack2!!
    }

private var _Backpack2: ImageVector? = null

