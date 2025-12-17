package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Photo: ImageVector
    get() {
        if (_Photo != null) return _Photo!!
        
        _Photo = ImageVector.Builder(
            name = "photo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 6f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, -2.25f)
                horizontalLineToRelative(16.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 22.5f, 6f)
                verticalLineToRelative(12f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineTo(3.75f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1.5f, 18f)
                verticalLineTo(6f)
                close()
                moveTo(3f, 16.06f)
                verticalLineTo(18f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(16.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 21f, 18f)
                verticalLineToRelative(-1.94f)
                lineToRelative(-2.69f, -2.689f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.12f, 0f)
                lineToRelative(-0.88f, 0.879f)
                lineToRelative(0.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-5.16f, -5.159f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.12f, 0f)
                lineTo(3f, 16.061f)
                close()
                moveToRelative(10.125f, -7.81f)
                arcToRelative(1.125f, 1.125f, 0f, true, true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -2.25f, 0f)
                close()
            }
        }.build()
        
        return _Photo!!
    }

private var _Photo: ImageVector? = null

