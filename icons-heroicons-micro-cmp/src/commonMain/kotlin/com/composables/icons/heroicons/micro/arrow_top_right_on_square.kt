package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowTopRightOnSquare: ImageVector
    get() {
        if (_ArrowTopRightOnSquare != null) return _ArrowTopRightOnSquare!!
        
        _ArrowTopRightOnSquare = ImageVector.Builder(
            name = "arrow-top-right-on-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.22f, 8.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(5.22f, -5.22f)
                verticalLineToRelative(1.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.69f)
                lineTo(6.22f, 8.72f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 6.75f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineTo(7f)
                arcTo(0.75f, 0.75f, 0f, false, false, 7f, 4f)
                horizontalLineTo(4.75f)
                arcTo(2.75f, 2.75f, 0f, false, false, 2f, 6.75f)
                verticalLineToRelative(4.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 4.75f, 14f)
                horizontalLineToRelative(4.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 12f, 11.25f)
                verticalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }.build()
        
        return _ArrowTopRightOnSquare!!
    }

private var _ArrowTopRightOnSquare: ImageVector? = null

