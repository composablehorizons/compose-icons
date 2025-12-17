package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PencilSquare: ImageVector
    get() {
        if (_PencilSquare != null) return _PencilSquare!!
        
        _PencilSquare = ImageVector.Builder(
            name = "pencil-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.488f, 2.513f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, -2.475f, 0f)
                lineTo(6.75f, 6.774f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, -0.596f, 0.892f)
                lineToRelative(-0.848f, 2.047f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.98f, 0.98f)
                lineToRelative(2.047f, -0.848f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 0.892f, -0.596f)
                lineToRelative(4.261f, -4.262f)
                arcToRelative(1.75f, 1.75f, 0f, false, false, 0f, -2.474f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.75f, 3.5f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineTo(9f)
                arcTo(0.75f, 0.75f, 0f, false, true, 14f, 9f)
                verticalLineToRelative(2.25f)
                arcTo(2.75f, 2.75f, 0f, false, true, 11.25f, 14f)
                horizontalLineToRelative(-6.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 2f, 11.25f)
                verticalLineToRelative(-6.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 4.75f, 2f)
                horizontalLineTo(7f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(4.75f)
                close()
            }
        }.build()
        
        return _PencilSquare!!
    }

private var _PencilSquare: ImageVector? = null

