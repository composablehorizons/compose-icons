package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.BuildingStorefront: ImageVector
    get() {
        if (_BuildingStorefront != null) return _BuildingStorefront!!
        
        _BuildingStorefront = ImageVector.Builder(
            name = "building-storefront",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.223f, 2.25f)
                curveToRelative(-0.497f, 0f, -0.974f, 0.198f, -1.325f, 0.55f)
                lineToRelative(-1.3f, 1.298f)
                arcTo(3.75f, 3.75f, 0f, false, false, 7.5f, 9.75f)
                curveToRelative(0.627f, 0.47f, 1.406f, 0.75f, 2.25f, 0.75f)
                curveToRelative(0.844f, 0f, 1.624f, -0.28f, 2.25f, -0.75f)
                curveToRelative(0.626f, 0.47f, 1.406f, 0.75f, 2.25f, 0.75f)
                curveToRelative(0.844f, 0f, 1.623f, -0.28f, 2.25f, -0.75f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 4.902f, -5.652f)
                lineToRelative(-1.3f, -1.299f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, -1.325f, -0.549f)
                horizontalLineTo(5.223f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 20.25f)
                verticalLineToRelative(-8.755f)
                curveToRelative(1.42f, 0.674f, 3.08f, 0.673f, 4.5f, 0f)
                arcTo(5.234f, 5.234f, 0f, false, false, 9.75f, 12f)
                curveToRelative(0.804f, 0f, 1.568f, -0.182f, 2.25f, -0.506f)
                arcToRelative(5.234f, 5.234f, 0f, false, false, 2.25f, 0.506f)
                curveToRelative(0.804f, 0f, 1.567f, -0.182f, 2.25f, -0.506f)
                curveToRelative(1.42f, 0.674f, 3.08f, 0.675f, 4.5f, 0.001f)
                verticalLineToRelative(8.755f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(3f)
                close()
                moveToRelative(3f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-3f)
                close()
                moveToRelative(8.25f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(5.25f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _BuildingStorefront!!
    }

private var _BuildingStorefront: ImageVector? = null

