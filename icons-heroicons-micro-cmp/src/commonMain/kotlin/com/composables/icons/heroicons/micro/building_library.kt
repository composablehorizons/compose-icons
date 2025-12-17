package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.BuildingLibrary: ImageVector
    get() {
        if (_BuildingLibrary != null) return _BuildingLibrary!!
        
        _BuildingLibrary = ImageVector.Builder(
            name = "building-library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.605f, 2.112f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.79f, 0f)
                lineToRelative(5.25f, 3.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 13f, 6.707f)
                verticalLineTo(12.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(3f)
                verticalLineTo(6.707f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.645f, -1.345f)
                lineToRelative(5.25f, -3.25f)
                close()
                moveTo(4.5f, 8.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-3f)
                close()
                moveTo(8f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-3f)
                arcTo(0.75f, 0.75f, 0f, false, false, 8f, 8f)
                close()
                moveToRelative(2f, 0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-3f)
                close()
                moveTo(8f, 6f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _BuildingLibrary!!
    }

private var _BuildingLibrary: ImageVector? = null

