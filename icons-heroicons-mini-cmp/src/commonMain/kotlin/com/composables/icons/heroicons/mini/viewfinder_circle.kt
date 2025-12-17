package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ViewfinderCircle: ImageVector
    get() {
        if (_ViewfinderCircle != null) return _ViewfinderCircle!!
        
        _ViewfinderCircle = ImageVector.Builder(
            name = "viewfinder-circle",
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
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13.75f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-2f)
                arcTo(2.25f, 2.25f, 0f, false, false, 15.75f, 2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(3.5f, 13.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.25f, 18f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 13.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 15.75f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 10f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                close()
            }
        }.build()
        
        return _ViewfinderCircle!!
    }

private var _ViewfinderCircle: ImageVector? = null

