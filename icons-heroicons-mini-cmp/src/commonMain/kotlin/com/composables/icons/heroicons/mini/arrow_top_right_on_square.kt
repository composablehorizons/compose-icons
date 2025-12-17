package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowTopRightOnSquare: ImageVector
    get() {
        if (_ArrowTopRightOnSquare != null) return _ArrowTopRightOnSquare!!
        
        _ArrowTopRightOnSquare = ImageVector.Builder(
            name = "arrow-top-right-on-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-4f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(4f)
                arcTo(2.25f, 2.25f, 0f, false, true, 12.75f, 17f)
                horizontalLineToRelative(-8.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 2f, 14.75f)
                verticalLineToRelative(-8.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.25f, 4f)
                horizontalLineToRelative(5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.194f, 12.753f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0.053f)
                lineTo(16.5f, 4.44f)
                verticalLineToRelative(2.81f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2.553f)
                lineToRelative(-9.056f, 8.194f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.053f, 1.06f)
                close()
            }
        }.build()
        
        return _ArrowTopRightOnSquare!!
    }

private var _ArrowTopRightOnSquare: ImageVector? = null

