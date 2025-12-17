package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Calculator: ImageVector
    get() {
        if (_Calculator != null) return _Calculator!!
        
        _Calculator = ImageVector.Builder(
            name = "calculator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                close()
                moveToRelative(0.75f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                close()
                moveTo(5f, 3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5.75f, 3f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5f, 3.75f)
                close()
                moveToRelative(0.75f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                close()
                moveTo(5f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.5f, 0f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5f, 10f)
                close()
                moveToRelative(5.25f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                close()
                moveToRelative(-0.75f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(10f)
                close()
                moveTo(8f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 8f, 7f)
                close()
                moveToRelative(-0.75f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                close()
                moveToRelative(0.75f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                close()
            }
        }.build()
        
        return _Calculator!!
    }

private var _Calculator: ImageVector? = null

