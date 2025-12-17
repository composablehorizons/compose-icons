package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PencilSquare: ImageVector
    get() {
        if (_PencilSquare != null) return _PencilSquare!!
        
        _PencilSquare = ImageVector.Builder(
            name = "pencil-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.433f, 13.917f)
                lineToRelative(1.262f, -3.155f)
                arcTo(4f, 4f, 0f, false, true, 7.58f, 9.42f)
                lineToRelative(6.92f, -6.918f)
                arcToRelative(2.121f, 2.121f, 0f, false, true, 3f, 3f)
                lineToRelative(-6.92f, 6.918f)
                curveToRelative(-0.383f, 0.383f, -0.84f, 0.685f, -1.343f, 0.886f)
                lineToRelative(-3.154f, 1.262f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.65f, -0.65f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 5.75f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineTo(10f)
                arcTo(0.75f, 0.75f, 0f, false, false, 10f, 3f)
                horizontalLineTo(4.75f)
                arcTo(2.75f, 2.75f, 0f, false, false, 2f, 5.75f)
                verticalLineToRelative(9.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 4.75f, 18f)
                horizontalLineToRelative(9.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 17f, 15.25f)
                verticalLineTo(10f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(5.25f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-9.5f)
                close()
            }
        }.build()
        
        return _PencilSquare!!
    }

private var _PencilSquare: ImageVector? = null

