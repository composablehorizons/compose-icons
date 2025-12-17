package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.BuildingLibrary: ImageVector
    get() {
        if (_BuildingLibrary != null) return _BuildingLibrary!!
        
        _BuildingLibrary = ImageVector.Builder(
            name = "building-library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.584f, 2.376f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.832f, 0f)
                lineToRelative(9f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.832f, 1.248f)
                lineTo(12f, 3.901f)
                lineTo(3.416f, 9.624f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.832f, -1.248f)
                lineToRelative(9f, -6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.25f, 10.332f)
                verticalLineToRelative(9.918f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-9.918f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.634f, -0.74f)
                arcTo(49.109f, 49.109f, 0f, false, true, 12f, 9f)
                curveToRelative(2.59f, 0f, 5.134f, 0.202f, 7.616f, 0.592f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.634f, 0.74f)
                close()
                moveToRelative(-7.5f, 2.418f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-6.75f)
                close()
                moveToRelative(3f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(9f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-6.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 7.875f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, -2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, 2.25f)
                close()
            }
        }.build()
        
        return _BuildingLibrary!!
    }

private var _BuildingLibrary: ImageVector? = null

