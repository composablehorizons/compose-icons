package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BuildingLibrary: ImageVector
    get() {
        if (_BuildingLibrary != null) return _BuildingLibrary!!
        
        _BuildingLibrary = ImageVector.Builder(
            name = "building-library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.674f, 2.075f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.652f, 0f)
                lineToRelative(7.25f, 3.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 17f, 6.957f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(3f)
                verticalLineTo(6.957f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.576f, -1.382f)
                lineToRelative(7.25f, -3.5f)
                close()
                moveTo(11f, 6f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveTo(7.5f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-5.5f)
                close()
                moveToRelative(3.25f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-5.5f)
                close()
                moveToRelative(3.25f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }.build()
        
        return _BuildingLibrary!!
    }

private var _BuildingLibrary: ImageVector? = null

