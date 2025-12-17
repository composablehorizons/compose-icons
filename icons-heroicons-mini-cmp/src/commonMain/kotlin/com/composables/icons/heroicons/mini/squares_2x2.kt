package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Squares2x2: ImageVector
    get() {
        if (_Squares2x2 != null) return _Squares2x2!!
        
        _Squares2x2 = ImageVector.Builder(
            name = "squares-2x2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.25f, 2f)
                arcTo(2.25f, 2.25f, 0f, false, false, 2f, 4.25f)
                verticalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.25f, 9f)
                horizontalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 9f, 6.75f)
                verticalLineToRelative(-2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 6.75f, 2f)
                horizontalLineToRelative(-2.5f)
                close()
                moveToRelative(0f, 9f)
                arcTo(2.25f, 2.25f, 0f, false, false, 2f, 13.25f)
                verticalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.25f, 18f)
                horizontalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 9f, 15.75f)
                verticalLineToRelative(-2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 6.75f, 11f)
                horizontalLineToRelative(-2.5f)
                close()
                moveToRelative(9f, -9f)
                arcTo(2.25f, 2.25f, 0f, false, false, 11f, 4.25f)
                verticalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 13.25f, 9f)
                horizontalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 6.75f)
                verticalLineToRelative(-2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 15.75f, 2f)
                horizontalLineToRelative(-2.5f)
                close()
                moveToRelative(0f, 9f)
                arcTo(2.25f, 2.25f, 0f, false, false, 11f, 13.25f)
                verticalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 13.25f, 18f)
                horizontalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 15.75f)
                verticalLineToRelative(-2.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 15.75f, 11f)
                horizontalLineToRelative(-2.5f)
                close()
            }
        }.build()
        
        return _Squares2x2!!
    }

private var _Squares2x2: ImageVector? = null

