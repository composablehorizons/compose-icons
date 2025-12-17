package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Squares2x2: ImageVector
    get() {
        if (_Squares2x2 != null) return _Squares2x2!!
        
        _Squares2x2 = ImageVector.Builder(
            name = "squares-2x2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 3.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 7f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 7f, 5.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5.5f, 2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(3.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 10.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 14f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 7f, 12.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5.5f, 9f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(9f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 2f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 3.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12.5f, 7f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 5.5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9f, 10.5f)
                verticalLineToRelative(2f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(2f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 9f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Squares2x2!!
    }

private var _Squares2x2: ImageVector? = null

