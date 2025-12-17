package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.BuildingOffice: ImageVector
    get() {
        if (_BuildingOffice != null) return _BuildingOffice!!
        
        _BuildingOffice = ImageVector.Builder(
            name = "building-office",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-15f)
                close()
                moveTo(9f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(9f)
                close()
                moveToRelative(-0.75f, 3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 9f, 9f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(9f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(9f)
                close()
                moveToRelative(3.75f, -5.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 13.5f, 6f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(13.5f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(15f)
                arcTo(0.75f, 0.75f, 0f, false, false, 15f, 9f)
                horizontalLineToRelative(-1.5f)
                close()
                moveToRelative(-0.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(9f, 19.5f)
                verticalLineToRelative(-2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-4.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 9f, 19.5f)
                close()
            }
        }.build()
        
        return _BuildingOffice!!
    }

private var _BuildingOffice: ImageVector? = null

