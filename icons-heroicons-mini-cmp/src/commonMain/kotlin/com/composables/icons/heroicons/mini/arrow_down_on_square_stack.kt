package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowDownOnSquareStack: ImageVector
    get() {
        if (_ArrowDownOnSquareStack != null) return _ArrowDownOnSquareStack!!
        
        _ArrowDownOnSquareStack = ImageVector.Builder(
            name = "arrow-down-on-square-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(6f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(1.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 1f)
                close()
                moveToRelative(-0.75f, 5f)
                verticalLineToRelative(3.296f)
                lineToRelative(-0.943f, -1.048f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.114f, 1.004f)
                lineToRelative(2.25f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.114f, 0f)
                lineToRelative(2.25f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.114f, -1.004f)
                lineTo(8.75f, 9.296f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                arcTo(2.25f, 2.25f, 0f, false, true, 13f, 8.25f)
                verticalLineToRelative(4.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 10.75f, 15f)
                horizontalLineToRelative(-5.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3f, 12.75f)
                verticalLineToRelative(-4.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 5.25f, 6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 16.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(3.75f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 3.75f, -3.75f)
                verticalLineTo(10f)
                horizontalLineToRelative(0.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 17f, 12.25f)
                verticalLineToRelative(4.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 14.75f, 19f)
                horizontalLineToRelative(-5.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 7f, 16.75f)
                close()
            }
        }.build()
        
        return _ArrowDownOnSquareStack!!
    }

private var _ArrowDownOnSquareStack: ImageVector? = null

