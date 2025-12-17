package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bank2: ImageVector
    get() {
        if (_Bank2 != null) return _Bank2!!
        
        _Bank2 = ImageVector.Builder(
            name = "bank2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.277f, 0.084f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.554f, 0f)
                lineToRelative(-7.5f, 5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 0.5f, 6f)
                horizontalLineToRelative(1.875f)
                verticalLineToRelative(7f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                horizontalLineToRelative(-0.875f)
                verticalLineTo(6f)
                horizontalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.277f, -0.916f)
                close()
                moveTo(12.375f, 6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.25f)
                verticalLineTo(6f)
                close()
                moveToRelative(-2.5f, 0f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.25f)
                verticalLineTo(6f)
                close()
                moveToRelative(-2.5f, 0f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.25f)
                verticalLineTo(6f)
                close()
                moveToRelative(-2.5f, 0f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.25f)
                verticalLineTo(6f)
                close()
                moveTo(8f, 4f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                moveTo(0.5f, 15f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                close()
            }
        }.build()
        
        return _Bank2!!
    }

private var _Bank2: ImageVector? = null

