package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.SquaresPlus: ImageVector
    get() {
        if (_SquaresPlus != null) return _SquaresPlus!!
        
        _SquaresPlus = ImageVector.Builder(
            name = "squares-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.25f, 2f)
                horizontalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 9f, 4.25f)
                verticalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 6.75f, 9f)
                horizontalLineToRelative(-2.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 2f, 6.75f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(2f, 13.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.25f, 11f)
                horizontalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 9f, 13.25f)
                verticalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 6.75f, 18f)
                horizontalLineToRelative(-2.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 2f, 15.75f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(11f, 4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 13.25f, 2f)
                horizontalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 4.25f)
                verticalLineToRelative(2.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 15.75f, 9f)
                horizontalLineToRelative(-2.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 11f, 6.75f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(15.25f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _SquaresPlus!!
    }

private var _SquaresPlus: ImageVector? = null

