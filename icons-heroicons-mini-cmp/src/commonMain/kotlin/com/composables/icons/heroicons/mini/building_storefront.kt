package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BuildingStorefront: ImageVector
    get() {
        if (_BuildingStorefront != null) return _BuildingStorefront!!
        
        _BuildingStorefront = ImageVector.Builder(
            name = "building-storefront",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.879f, 7.121f)
                arcTo(3f, 3f, 0f, false, false, 7.5f, 6.66f)
                arcToRelative(2.997f, 2.997f, 0f, false, false, 2.5f, 1.34f)
                arcToRelative(2.997f, 2.997f, 0f, false, false, 2.5f, -1.34f)
                arcToRelative(3f, 3f, 0f, true, false, 4.622f, -3.78f)
                lineToRelative(-0.293f, -0.293f)
                arcTo(2f, 2f, 0f, false, false, 15.415f, 2f)
                horizontalLineTo(4.585f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, 0.586f)
                lineToRelative(-0.292f, 0.292f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 4.243f)
                close()
                moveTo(3f, 9.032f)
                arcToRelative(4.507f, 4.507f, 0f, false, false, 4.5f, -0.29f)
                arcTo(4.48f, 4.48f, 0f, false, false, 10f, 9.5f)
                arcToRelative(4.48f, 4.48f, 0f, false, false, 2.5f, -0.758f)
                arcToRelative(4.507f, 4.507f, 0f, false, false, 4.5f, 0.29f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(3f)
                verticalLineTo(9.032f)
                close()
            }
        }.build()
        
        return _BuildingStorefront!!
    }

private var _BuildingStorefront: ImageVector? = null

