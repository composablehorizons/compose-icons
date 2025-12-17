package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ViewfinderCircle: ImageVector
    get() {
        if (_ViewfinderCircle != null) return _ViewfinderCircle!!
        
        _ViewfinderCircle = ImageVector.Builder(
            name = "viewfinder-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 3f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 4.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(6f)
                close()
                moveTo(16.5f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(18f)
                arcTo(1.5f, 1.5f, 0f, false, true, 19.5f, 6f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(12f, 8.25f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, 0f, 7.5f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 0f, -7.5f)
                close()
                moveTo(4.5f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.5f, 18f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(21f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(18f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.build()
        
        return _ViewfinderCircle!!
    }

private var _ViewfinderCircle: ImageVector? = null

