package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Dice1: ImageVector
    get() {
        if (_Dice1 != null) return _Dice1!!
        
        _Dice1 = ImageVector.Builder(
            name = "dice-1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
                moveTo(3f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
            }
        }.build()
        
        return _Dice1!!
    }

private var _Dice1: ImageVector? = null

