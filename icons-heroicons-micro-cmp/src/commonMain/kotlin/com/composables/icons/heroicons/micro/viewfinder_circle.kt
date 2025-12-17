package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ViewfinderCircle: ImageVector
    get() {
        if (_ViewfinderCircle != null) return _ViewfinderCircle!!
        
        _ViewfinderCircle = ImageVector.Builder(
            name = "viewfinder-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 2f)
                arcTo(1.75f, 1.75f, 0f, false, false, 2f, 3.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(10.75f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-1.5f)
                arcTo(1.75f, 1.75f, 0f, false, false, 12.25f, 2f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(3.5f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(14f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcTo(1.75f, 1.75f, 0f, false, false, 14f, 12.25f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(8f, 10f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                close()
            }
        }.build()
        
        return _ViewfinderCircle!!
    }

private var _ViewfinderCircle: ImageVector? = null

