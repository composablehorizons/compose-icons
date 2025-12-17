package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.SquaresPlus: ImageVector
    get() {
        if (_SquaresPlus != null) return _SquaresPlus!!
        
        _SquaresPlus = ImageVector.Builder(
            name = "squares-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 2f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 3.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 7f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 5.5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(2f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 9f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 10.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 14f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 12.5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9f, 3.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10.5f, 7f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14f, 5.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11.5f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcTo(0.75f, 0.75f, 0f, false, true, 11.5f, 9f)
                close()
            }
        }.build()
        
        return _SquaresPlus!!
    }

private var _SquaresPlus: ImageVector? = null

